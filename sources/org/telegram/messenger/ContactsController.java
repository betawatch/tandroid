package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ContactsController extends BaseController {
    public static final int PRIVACY_RULES_TYPE_ADDED_BY_PHONE = 7;
    public static final int PRIVACY_RULES_TYPE_BIO = 9;
    public static final int PRIVACY_RULES_TYPE_BIRTHDAY = 11;
    public static final int PRIVACY_RULES_TYPE_CALLS = 2;
    public static final int PRIVACY_RULES_TYPE_COUNT = 15;
    public static final int PRIVACY_RULES_TYPE_FORWARDS = 5;
    public static final int PRIVACY_RULES_TYPE_GIFTS = 12;
    public static final int PRIVACY_RULES_TYPE_INVITE = 1;
    public static final int PRIVACY_RULES_TYPE_LASTSEEN = 0;
    public static final int PRIVACY_RULES_TYPE_MESSAGES = 10;
    public static final int PRIVACY_RULES_TYPE_MUSIC = 14;
    public static final int PRIVACY_RULES_TYPE_NO_PAID_MESSAGES = 13;
    public static final int PRIVACY_RULES_TYPE_P2P = 3;
    public static final int PRIVACY_RULES_TYPE_PHONE = 6;
    public static final int PRIVACY_RULES_TYPE_PHOTO = 4;
    public static final int PRIVACY_RULES_TYPE_VOICE_MESSAGES = 8;
    private static Collator cachedCollator;
    private static Locale cachedCollatorLocale;
    private ArrayList<TLRPC.PrivacyRule> addedByPhonePrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> bioPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> birthdayPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> callPrivacyRules;
    private int completedRequestsCount;
    public ArrayList<TLRPC.TL_contact> contacts;
    public HashMap<String, Contact> contactsBook;
    private boolean contactsBookLoaded;
    public HashMap<String, Contact> contactsBookSPhones;
    public HashMap<String, TLRPC.TL_contact> contactsByPhone;
    public HashMap<String, TLRPC.TL_contact> contactsByShortPhone;
    public ConcurrentHashMap<Long, TLRPC.TL_contact> contactsDict;
    public boolean contactsLoaded;
    private boolean contactsSyncInProgress;
    private ArrayList<Long> delayedContactsUpdate;
    private int deleteAccountTTL;
    public boolean doneLoadingContacts;
    private ArrayList<TLRPC.PrivacyRule> forwardsPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> giftsPrivacyRules;
    private TLRPC.GlobalPrivacySettings globalPrivacySettings;
    private ArrayList<TLRPC.PrivacyRule> groupPrivacyRules;
    private boolean ignoreChanges;
    private String inviteLink;
    private String lastContactsVersions;
    private ArrayList<TLRPC.PrivacyRule> lastseenPrivacyRules;
    private final Object loadContactsSync;
    private boolean loadingContacts;
    private int loadingDeleteInfo;
    private int loadingGlobalSettings;
    private int[] loadingPrivacyInfo;
    private boolean migratingContacts;
    private ArrayList<TLRPC.PrivacyRule> musicPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> noPaidMessagesPrivacyRules;
    private final Object observerLock;
    private ArrayList<TLRPC.PrivacyRule> p2pPrivacyRules;
    public HashMap<String, Contact> phoneBookByShortPhones;
    public ArrayList<Contact> phoneBookContacts;
    public ArrayList<String> phoneBookSectionsArray;
    public HashMap<String, ArrayList<Object>> phoneBookSectionsDict;
    private ArrayList<TLRPC.PrivacyRule> phonePrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> profilePhotoPrivacyRules;
    private HashMap<String, String> sectionsToReplace;
    public ArrayList<String> sortedUsersMutualSectionsArray;
    public ArrayList<String> sortedUsersSectionsArray;
    private Account systemAccount;
    private boolean updatingInviteLink;
    public HashMap<String, ArrayList<TLRPC.TL_contact>> usersMutualSectionsDict;
    public HashMap<String, ArrayList<TLRPC.TL_contact>> usersSectionsDict;
    private ArrayList<TLRPC.PrivacyRule> voiceMessagesRules;
    private static final String[] projectionPhones = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    private static final String[] projectionNames = {"lookup", "data2", "data3", "data5"};
    private static volatile ContactsController[] Instance = new ContactsController[4];

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Contact {
        public int contact_id;
        public String first_name;
        public int imported;
        public boolean isGoodProvider;
        public String key;
        public String last_name;
        public boolean namesFilled;
        public String provider;
        public TLRPC.User user;
        public ArrayList<String> phones = new ArrayList<>(4);
        public ArrayList<String> phoneTypes = new ArrayList<>(4);
        public ArrayList<String> shortPhones = new ArrayList<>(4);
        public ArrayList<Integer> phoneDeleted = new ArrayList<>(4);

        public String getLetter() {
            return getLetter(this.first_name, this.last_name);
        }

        public static String getLetter(String str, String str2) {
            return !TextUtils.isEmpty(str) ? str.substring(0, 1) : !TextUtils.isEmpty(str2) ? str2.substring(0, 1) : "#";
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable;

        public MyContentObserver() {
            super(null);
            this.checkRunnable = new w1(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0() {
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated()) {
                    ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                    ContactsController.getInstance(i10).checkContacts();
                }
            }
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            synchronized (ContactsController.this.observerLock) {
                try {
                    if (ContactsController.this.ignoreChanges) {
                        return;
                    }
                    Utilities.globalQueue.cancelRunnable(this.checkRunnable);
                    Utilities.globalQueue.postRunnable(this.checkRunnable, 500L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class PhoneBookContact {
        String id;
        String lookup_key;
        String name;
        String phone;

        private PhoneBookContact() {
        }
    }

    public ContactsController(int i10) {
        super(i10);
        this.loadContactsSync = new Object();
        this.observerLock = new Object();
        this.lastContactsVersions = "";
        this.delayedContactsUpdate = new ArrayList<>();
        this.sectionsToReplace = new HashMap<>();
        this.loadingPrivacyInfo = new int[15];
        this.contactsBook = new HashMap<>();
        this.contactsBookSPhones = new HashMap<>();
        this.phoneBookContacts = new ArrayList<>();
        this.phoneBookSectionsDict = new HashMap<>();
        this.phoneBookSectionsArray = new ArrayList<>();
        this.phoneBookByShortPhones = new HashMap<>();
        this.contacts = new ArrayList<>();
        this.contactsDict = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.usersSectionsDict = new HashMap<>();
        this.sortedUsersSectionsArray = new ArrayList<>();
        this.usersMutualSectionsDict = new HashMap<>();
        this.sortedUsersMutualSectionsArray = new ArrayList<>();
        this.contactsByPhone = new HashMap<>();
        this.contactsByShortPhone = new HashMap<>();
        if (MessagesController.getMainSettings(this.currentAccount).getBoolean("needGetStatuses", false)) {
            reloadContactsStatuses();
        }
        this.sectionsToReplace.put("À", "A");
        this.sectionsToReplace.put("Á", "A");
        this.sectionsToReplace.put("Ä", "A");
        this.sectionsToReplace.put("Ù", "U");
        this.sectionsToReplace.put("Ú", "U");
        this.sectionsToReplace.put("Ü", "U");
        this.sectionsToReplace.put("Ì", "I");
        this.sectionsToReplace.put("Í", "I");
        this.sectionsToReplace.put("Ï", "I");
        this.sectionsToReplace.put("È", "E");
        this.sectionsToReplace.put("É", "E");
        this.sectionsToReplace.put("Ê", "E");
        this.sectionsToReplace.put("Ë", "E");
        this.sectionsToReplace.put("Ò", "O");
        this.sectionsToReplace.put("Ó", "O");
        this.sectionsToReplace.put("Ö", "O");
        this.sectionsToReplace.put("Ç", "C");
        this.sectionsToReplace.put("Ñ", "N");
        this.sectionsToReplace.put("Ÿ", "Y");
        this.sectionsToReplace.put("Ý", "Y");
        this.sectionsToReplace.put("Ţ", "Y");
        if (i10 == 0) {
            Utilities.globalQueue.postRunnable(new e1(this, 6));
        }
    }

    private void applyContactToPhoneBook(ArrayList<ContentProviderOperation> arrayList, TLRPC.User user) {
        String str;
        if (user == null) {
            return;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_name", this.systemAccount.name);
        newInsert.withValue("account_type", this.systemAccount.type);
        newInsert.withValue("sync1", TextUtils.isEmpty(user.phone) ? "" : user.phone);
        newInsert.withValue("sync2", Long.valueOf(user.id));
        arrayList.add(newInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder newInsert2 = ContentProviderOperation.newInsert(uri);
        newInsert2.withValueBackReference("raw_contact_id", size);
        newInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        newInsert2.withValue("data2", user.first_name);
        newInsert2.withValue("data3", user.last_name);
        arrayList.add(newInsert2.build());
        if (TextUtils.isEmpty(user.phone)) {
            str = formatName(user.first_name, user.last_name);
        } else {
            str = "+" + user.phone;
        }
        ContentProviderOperation.Builder newInsert3 = ContentProviderOperation.newInsert(uri);
        newInsert3.withValueBackReference("raw_contact_id", size);
        newInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        newInsert3.withValue("data1", Long.valueOf(user.id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", LocaleController.formatString("ContactShortcutMessage", R.string.ContactShortcutMessage, str));
        newInsert3.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(user.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, str));
        newInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, str));
        newInsert5.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert5.build());
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap, ArrayList<TLRPC.TL_contact> arrayList2, ArrayList<Long> arrayList3) {
        int indexOf;
        int indexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l10 = arrayList.get(i10);
                if (l10.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l10.longValue();
                    arrayList2.add(tL_contact);
                } else if (l10.longValue() < 0) {
                    arrayList3.add(Long.valueOf(-l10.longValue()));
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("process update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= arrayList2.size()) {
                break;
            }
            TLRPC.TL_contact tL_contact2 = arrayList2.get(i11);
            TLRPC.User user = concurrentHashMap != null ? concurrentHashMap.get(Long.valueOf(tL_contact2.user_id)) : null;
            if (user == null) {
                user = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().putUser(user, true);
            }
            if (user == null || TextUtils.isEmpty(user.phone)) {
                z10 = true;
            } else {
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (indexOf2 = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf2, 0);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user.phone);
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            Long l11 = arrayList3.get(i12);
            Utilities.phoneBookQueue.postRunnable(new d3(26, this, l11));
            TLRPC.User user2 = concurrentHashMap != null ? concurrentHashMap.get(l11) : null;
            if (user2 == null) {
                user2 = getMessagesController().getUser(l11);
            } else {
                getMessagesController().putUser(user2, true);
            }
            if (user2 == null) {
                z10 = true;
            } else if (!TextUtils.isEmpty(user2.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(user2.phone);
                if (contact2 != null && (indexOf = contact2.shortPhones.indexOf(user2.phone)) != -1) {
                    contact2.phoneDeleted.set(indexOf, 1);
                }
                if (sb3.length() != 0) {
                    sb3.append(",");
                }
                sb3.append(user2.phone);
            }
        }
        if (sb2.length() != 0 || sb3.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb2.toString(), sb3.toString());
        }
        if (z10) {
            Utilities.stageQueue.postRunnable(new e1(this, 3));
        } else {
            AndroidUtilities.runOnUIThread(new f0((BaseController) this, (ArrayList) arrayList2, (Object) arrayList3, 15));
        }
    }

    private void buildContactsSectionsArrays(boolean z10) {
        Collator localeCollator = getLocaleCollator();
        if (z10) {
            Collections.sort(this.contacts, new j1(this, localeCollator, 0));
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.contacts.size(); i10++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i10);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(0, 1);
                }
                String upperCase = firstName.length() == 0 ? "#" : firstName.toUpperCase();
                String str = this.sectionsToReplace.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    hashMap.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tL_contact);
            }
        }
        Collections.sort(arrayList, new k1(localeCollator, 0));
        this.usersSectionsDict = hashMap;
        this.sortedUsersSectionsArray = arrayList;
    }

    private boolean checkContactsInternal() {
        Throwable th2;
        boolean z10;
        boolean z11 = false;
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (!hasContactsPermission()) {
            return false;
        }
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (query.moveToNext()) {
                        sb2.append(query.getString(query.getColumnIndex("version")));
                    }
                    String sb3 = sb2.toString();
                    if (this.lastContactsVersions.length() != 0) {
                        if (!this.lastContactsVersions.equals(sb3)) {
                            z11 = true;
                        }
                    }
                    try {
                        this.lastContactsVersions = sb3;
                    } catch (Throwable th3) {
                        z10 = z11;
                        th2 = th3;
                        try {
                            try {
                                query.close();
                                throw th2;
                            } catch (Exception e11) {
                                e = e11;
                                z11 = z10;
                                FileLog.e(e);
                                return z11;
                            }
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                            throw th2;
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    z10 = false;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e12) {
            e = e12;
        }
        return z11;
    }

    private void deleteContactFromPhoneBook(long j10) {
        if (hasContactsPermission()) {
            synchronized (this.observerLock) {
                this.ignoreChanges = true;
            }
            try {
                ApplicationLoader.applicationContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + j10, null);
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, false);
            }
            synchronized (this.observerLock) {
                this.ignoreChanges = false;
            }
        }
    }

    public static <T extends TLRPC.PrivacyRule> T findRule(ArrayList<TLRPC.PrivacyRule> arrayList, Class<T> cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.PrivacyRule privacyRule = arrayList.get(i10);
            i10++;
            TLRPC.PrivacyRule privacyRule2 = privacyRule;
            if (cls.isInstance(privacyRule2)) {
                return cls.cast(privacyRule2);
            }
        }
        return null;
    }

    public static String formatName(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? formatName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : LocaleController.getString(R.string.HiddenName);
    }

    private long getContactsHash(ArrayList<TLRPC.TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new q(3));
        int size = arrayList2.size();
        long j10 = 0;
        int i10 = -1;
        while (i10 < size) {
            j10 = i10 == -1 ? MediaDataController.calcHash(j10, getUserConfig().contactsSavedCount) : MediaDataController.calcHash(j10, ((TLRPC.TL_contact) arrayList2.get(i10)).user_id);
            i10++;
        }
        return j10;
    }

    public static ContactsController getInstance(int i10) {
        ContactsController contactsController;
        ContactsController contactsController2 = Instance[i10];
        if (contactsController2 != null) {
            return contactsController2;
        }
        synchronized (ContactsController.class) {
            try {
                contactsController = Instance[i10];
                if (contactsController == null) {
                    ContactsController[] contactsControllerArr = Instance;
                    ContactsController contactsController3 = new ContactsController(i10);
                    contactsControllerArr[i10] = contactsController3;
                    contactsController = contactsController3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return contactsController;
    }

    public static Collator getLocaleCollator() {
        if (cachedCollator == null || cachedCollatorLocale != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                cachedCollatorLocale = locale;
                Collator collator = Collator.getInstance(locale);
                cachedCollator = collator;
                collator.setStrength(1);
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, true);
            }
        }
        if (cachedCollator == null) {
            try {
                Collator collator2 = Collator.getInstance();
                cachedCollator = collator2;
                collator2.setStrength(1);
            } catch (Exception e11) {
                FileLog.e((Throwable) e11, true);
            }
        }
        if (cachedCollator == null) {
            cachedCollator = new Collator() { // from class: org.telegram.messenger.ContactsController.1
                @Override // java.text.Collator
                public int compare(String str, String str2) {
                    if (str == null || str2 == null) {
                        return 0;
                    }
                    return str.compareTo(str2);
                }

                @Override // java.text.Collator
                public CollationKey getCollationKey(String str) {
                    return null;
                }

                @Override // java.text.Collator
                public int hashCode() {
                    return 0;
                }
            };
        }
        return cachedCollator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1.getCount() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r1 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean hasContactsPermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
        }
        Cursor cursor = null;
        try {
            cursor = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, projectionPhones, null, null, null);
            if (cursor != null) {
            }
            if (cursor != null) {
                try {
                    cursor.close();
                    return false;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            return false;
        } catch (Throwable th2) {
            try {
                FileLog.e(th2);
            } finally {
            }
        }
        return true;
    }

    public static boolean hasContactsWritePermission() {
        return Build.VERSION.SDK_INT < 23 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0;
    }

    private boolean isNotValidNameString(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt >= '0' && charAt <= '9') {
                i10++;
            }
        }
        return i10 > 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addContact$50(TLRPC.User user) {
        addContactToPhoneBook(user, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addContact$51(TLRPC.Updates updates, TLRPC.User user) {
        Contact contact;
        boolean z10 = false;
        for (int i10 = 0; i10 < updates.users.size(); i10++) {
            TLRPC.User user2 = updates.users.get(i10);
            if (user2.contact && (contact = this.contactsBookSPhones.get(user2.phone)) != null) {
                String letter = contact.getLetter();
                String letter2 = Contact.getLetter(user.first_name, user.last_name);
                if (contact.user == null) {
                    contact.user = user;
                    if (!letter.equals(letter2)) {
                        ArrayList<Object> arrayList = this.phoneBookSectionsDict.get(letter2);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            this.phoneBookSectionsDict.put(letter2, arrayList);
                            this.phoneBookSectionsArray.add(letter2);
                        }
                        arrayList.add(contact);
                        ArrayList<Object> arrayList2 = this.phoneBookSectionsDict.get(letter);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size) {
                                    break;
                                }
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (obj instanceof Contact) {
                                    Contact contact2 = (Contact) obj;
                                    if (contact2.contact_id == contact.contact_id) {
                                        if (arrayList2.remove(contact2) && arrayList2.isEmpty()) {
                                            this.phoneBookSectionsDict.remove(letter);
                                            this.phoneBookSectionsArray.remove(letter);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = true;
                }
            }
            if (user2.contact && this.contactsDict.get(Long.valueOf(user2.id)) == null) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        buildContactsSectionsArrays(true);
        if (z10) {
            mergePhonebookAndTelegramContacts(this.phoneBookSectionsDict, this.phoneBookSectionsArray, this.phoneBookByShortPhones, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addContact$52(TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        if (tL_error != null) {
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal) {
            for (int i10 = 0; i10 < updates.users.size(); i10++) {
                if (updates.users.get(i10).id == user.id) {
                    updates.users.get(i10).photo = user.photo;
                }
            }
        }
        getMessagesController().processUpdates(updates, false);
        for (int i11 = 0; i11 < updates.users.size(); i11++) {
            TLRPC.User user2 = updates.users.get(i11);
            if (user2.id == user.id) {
                Utilities.phoneBookQueue.postRunnable(new d3(23, this, user2));
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                ArrayList<TLRPC.TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tL_contact);
                getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(user2.phone)) {
                    formatName(user2.first_name, user2.last_name);
                    getMessagesStorage().applyPhoneBookUpdates(user2.phone, "");
                    Contact contact = this.contactsBookSPhones.get(user2.phone);
                    if (contact != null && (indexOf = contact.shortPhones.indexOf(user2.phone)) != -1) {
                        contact.phoneDeleted.set(indexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new f0(this, updates, user, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyContactsUpdates$46(Long l10) {
        deleteContactFromPhoneBook(l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyContactsUpdates$47() {
        loadContacts(false, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyContactsUpdates$48(ArrayList arrayList, ArrayList arrayList2) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i10);
            if (this.contactsDict.get(Long.valueOf(tL_contact.user_id)) == null) {
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            Long l10 = (Long) arrayList2.get(i11);
            TLRPC.TL_contact tL_contact2 = this.contactsDict.get(l10);
            if (tL_contact2 != null) {
                this.contacts.remove(tL_contact2);
                this.contactsDict.remove(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            updateUnregisteredContacts();
            performWriteContactsToPhoneBook();
        }
        performSyncPhoneBook(getContactsCopy(this.contactsBook), false, false, false, false, true, false);
        buildContactsSectionsArrays(!arrayList.isEmpty());
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$buildContactsSectionsArrays$43(Collator collator, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        return collator.compare(UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tL_contact.user_id))), UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tL_contact2.user_id))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$buildContactsSectionsArrays$44(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAppAccount$4() {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            for (int i10 = 0; i10 < accountsByType.length; i10++) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i11).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.id)) {
                                if (i11 == this.currentAccount) {
                                    this.systemAccount = account;
                                }
                            }
                        }
                        i11++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i10], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        if (getUserConfig().isClientActivated()) {
            readContacts();
            if (this.systemAccount == null) {
                try {
                    Account account2 = new Account("" + getUserConfig().getClientUserId(), BuildConfig.LIBRARY_PACKAGE_NAME);
                    this.systemAccount = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused3) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkContacts$5() {
        if (checkContactsInternal()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected contacts change");
            }
            performSyncPhoneBook(getContactsCopy(this.contactsBook), true, false, true, false, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkInviteText$2(TLRPC.TL_help_inviteText tL_help_inviteText) {
        this.updatingInviteLink = false;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        String str = tL_help_inviteText.message;
        this.inviteLink = str;
        edit.putString("invitelink", str);
        edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkInviteText$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
            if (tL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new d3(25, this, tL_help_inviteText));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanup$1() {
        this.migratingContacts = false;
        this.completedRequestsCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllContacts$8(Runnable runnable) {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            this.systemAccount = null;
            for (Account account : accountsByType) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.id)) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + getUserConfig().getClientUserId(), BuildConfig.LIBRARY_PACKAGE_NAME);
            this.systemAccount = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        getMessagesStorage().putCachedPhoneBook(new HashMap<>(), false, true);
        getMessagesStorage().putContacts(new ArrayList<>(), true);
        this.phoneBookContacts.clear();
        this.contacts.clear();
        this.contactsDict.clear();
        this.usersSectionsDict.clear();
        this.usersMutualSectionsDict.clear();
        this.sortedUsersSectionsArray.clear();
        this.phoneBookSectionsDict.clear();
        this.phoneBookSectionsArray.clear();
        this.phoneBookByShortPhones.clear();
        this.delayedContactsUpdate.clear();
        this.sortedUsersMutualSectionsArray.clear();
        this.contactsByPhone.clear();
        this.contactsByShortPhone.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        loadContacts(false, 0L);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllContacts$9(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        this.contactsBookSPhones.clear();
        this.contactsBook.clear();
        this.completedRequestsCount = 0;
        this.migratingContacts = false;
        this.contactsSyncInProgress = false;
        this.contactsLoaded = false;
        this.loadingContacts = false;
        this.contactsBookLoaded = false;
        this.lastContactsVersions = "";
        AndroidUtilities.runOnUIThread(new d3(24, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteContact$55(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            deleteContactFromPhoneBook(((TLRPC.User) obj).id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteContact$56(ArrayList arrayList, boolean z10, String str) {
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.id));
            if (tL_contact != null) {
                this.contacts.remove(tL_contact);
                this.contactsDict.remove(Long.valueOf(user.id));
                z11 = true;
            }
        }
        if (z11) {
            buildContactsSectionsArrays(false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z10) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", R.string.DeletedFromYourContacts, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteContact$57(ArrayList arrayList, ArrayList arrayList2, boolean z10, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new o1(this, arrayList2, 0));
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
            if (!TextUtils.isEmpty(user.phone)) {
                getMessagesStorage().applyPhoneBookUpdates(user.phone, "");
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (indexOf = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new tj(this, arrayList2, z10, str, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteContactsUndoable$53(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            this.contacts.add(tL_contact);
            this.contactsDict.put(Long.valueOf(user.id), tL_contact);
        }
        buildContactsSectionsArrays(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteContactsUndoable$54(ArrayList arrayList) {
        deleteContact(arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceImportContacts$6() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getContactsHash$26(TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        long j10 = tL_contact.user_id;
        long j11 = tL_contact2.user_id;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadContacts$27() {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadContacts$28(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
            if (j10 == 0 || !(contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                getUserConfig().contactsSavedCount = contacts_contacts.saved_count;
                getUserConfig().saveConfig(false);
                processLoadedContacts(contacts_contacts.contacts, contacts_contacts.users, 0);
                return;
            }
            this.contactsLoaded = true;
            if (!this.delayedContactsUpdate.isEmpty() && this.contactsBookLoaded) {
                applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
                this.delayedContactsUpdate.clear();
            }
            getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
            AndroidUtilities.runOnUIThread(new e1(this, 0));
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts don't change");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGlobalPrivacySetting$60(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.globalPrivacySettings = (TLRPC.GlobalPrivacySettings) tLObject;
            this.loadingGlobalSettings = 2;
        } else {
            this.loadingGlobalSettings = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGlobalPrivacySetting$61(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new n1(0, this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPrivacySettings$62(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.deleteAccountTTL = ((TLRPC.TL_accountDaysTTL) tLObject).days;
            this.loadingDeleteInfo = 2;
        } else {
            this.loadingDeleteInfo = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPrivacySettings$63(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new n1(1, this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPrivacySettings$64(TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            getMessagesController().putUsers(privacyrules.users, false);
            getMessagesController().putChats(privacyrules.chats, false);
            switch (i10) {
                case 0:
                    this.lastseenPrivacyRules = privacyrules.rules;
                    break;
                case 1:
                    this.groupPrivacyRules = privacyrules.rules;
                    break;
                case 2:
                    this.callPrivacyRules = privacyrules.rules;
                    break;
                case 3:
                    this.p2pPrivacyRules = privacyrules.rules;
                    break;
                case 4:
                    this.profilePhotoPrivacyRules = privacyrules.rules;
                    break;
                case 5:
                    this.forwardsPrivacyRules = privacyrules.rules;
                    break;
                case 6:
                    this.phonePrivacyRules = privacyrules.rules;
                    break;
                case 7:
                case 10:
                default:
                    this.addedByPhonePrivacyRules = privacyrules.rules;
                    break;
                case 8:
                    this.voiceMessagesRules = privacyrules.rules;
                    break;
                case 9:
                    this.bioPrivacyRules = privacyrules.rules;
                    break;
                case 11:
                    this.birthdayPrivacyRules = privacyrules.rules;
                    break;
                case 12:
                    this.giftsPrivacyRules = privacyrules.rules;
                    break;
                case 13:
                    this.noPaidMessagesPrivacyRules = privacyrules.rules;
                    break;
                case 14:
                    this.musicPrivacyRules = privacyrules.rules;
                    break;
            }
            this.loadingPrivacyInfo[i10] = 2;
        } else {
            this.loadingPrivacyInfo[i10] = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPrivacySettings$65(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h0(this, tL_error, tLObject, i10, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$markAsContacted$49(String str) {
        Uri parse = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(parse, contentValues, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$mergePhonebookAndTelegramContacts$38(Collator collator, Object obj, Object obj2) {
        String str;
        String str2 = "";
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            str = formatName(user.first_name, user.last_name);
        } else if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            TLRPC.User user2 = contact.user;
            str = user2 != null ? formatName(user2.first_name, user2.last_name) : formatName(contact.first_name, contact.last_name);
        } else {
            str = "";
        }
        if (obj2 instanceof TLRPC.User) {
            TLRPC.User user3 = (TLRPC.User) obj2;
            str2 = formatName(user3.first_name, user3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC.User user4 = contact2.user;
            str2 = user4 != null ? formatName(user4.first_name, user4.last_name) : formatName(contact2.first_name, contact2.last_name);
        }
        return collator.compare(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$mergePhonebookAndTelegramContacts$39(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mergePhonebookAndTelegramContacts$40(ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.phoneBookSectionsArray = arrayList;
        this.phoneBookByShortPhones = hashMap;
        this.phoneBookSectionsDict = hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mergePhonebookAndTelegramContacts$41(boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        if (z10) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    Contact contact = (Contact) hashMap.get(user.phone.substring(Math.max(0, r3.length() - 7)));
                    if (contact == null) {
                        String letter = Contact.getLetter(user.first_name, user.last_name);
                        ArrayList arrayList3 = (ArrayList) hashMap2.get(letter);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            hashMap2.put(letter, arrayList3);
                            arrayList2.add(letter);
                        }
                        arrayList3.add(user);
                    } else if (contact.user == null) {
                        contact.user = user;
                    }
                }
            }
        }
        Collator localeCollator = getLocaleCollator();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new k1(localeCollator, 1));
        }
        Collections.sort(arrayList2, new k1(localeCollator, 2));
        AndroidUtilities.runOnUIThread(new l1(arrayList2, hashMap, hashMap2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$migratePhoneBookToV7$12(SparseArray sparseArray) {
        if (this.migratingContacts) {
            return;
        }
        this.migratingContacts = true;
        HashMap<String, Contact> hashMap = new HashMap<>();
        HashMap<String, Contact> readContactsFromPhoneBook = readContactsFromPhoneBook();
        HashMap hashMap2 = new HashMap();
        Iterator<Map.Entry<String, Contact>> it = readContactsFromPhoneBook.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Contact value = it.next().getValue();
            for (int i10 = 0; i10 < value.shortPhones.size(); i10++) {
                hashMap2.put(value.shortPhones.get(i10), value.key);
            }
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            Contact contact = (Contact) sparseArray.valueAt(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= contact.shortPhones.size()) {
                    break;
                }
                String str = (String) hashMap2.get(contact.shortPhones.get(i12));
                if (str != null) {
                    contact.key = str;
                    hashMap.put(str, contact);
                    break;
                }
                i12++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        getMessagesStorage().putCachedPhoneBook(hashMap, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        try {
            if (hasContactsPermission()) {
                ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new MyContentObserver());
            }
        } catch (Throwable unused) {
        }
    }

    private /* synthetic */ void lambda$performSyncPhoneBook$13(HashMap hashMap) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (int i10 = 0; i10 < this.contacts.size(); i10++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i10).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        hashMap2.put(user.phone, user);
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) ((Map.Entry) it.next()).getValue();
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < contact.shortPhones.size()) {
                        TLRPC.User user2 = (TLRPC.User) hashMap2.get(contact.shortPhones.get(i11));
                        if (user2 != null) {
                            arrayList.add(user2);
                            contact.shortPhones.remove(i11);
                            i11--;
                            z10 = true;
                        }
                        i11++;
                    }
                    if (z10) {
                        contact.shortPhones.size();
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        deleteContact(arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$14(int i10, HashMap hashMap, boolean z10, boolean z11) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i10), hashMap, Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$15(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$23(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$16(HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        getMessagesStorage().putCachedPhoneBook(hashMap2, false, false);
        AndroidUtilities.runOnUIThread(new l1(this, hashMap3, arrayList, hashMap4, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$17(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$23(hashMap, arrayList, hashMap2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$18() {
        getMessagesStorage().getCachedPhoneBook(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$19(HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new l1(this, hashMap3, arrayList, hashMap4, 3));
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new e1(this, 1), 300000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$20(HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5, TLObject tLObject, TLRPC.TL_error tL_error) {
        HashMap hashMap6;
        this.completedRequestsCount++;
        if (tL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
            if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i11 = 0; i11 < tL_contacts_importedContacts.retry_contacts.size(); i11++) {
                    hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i11).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i12 = 0; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                Contact contact = (Contact) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tL_popularContact.importers;
                }
            }
            hashMap6 = hashMap2;
            getMessagesStorage().putUsersAndChats(tL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
            for (int i13 = 0; i13 < tL_contacts_importedContacts.imported.size(); i13++) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                arrayList2.add(tL_contact);
            }
            processLoadedContacts(arrayList2, tL_contacts_importedContacts.users, 2);
        } else {
            hashMap6 = hashMap2;
            for (int i14 = 0; i14 < tL_contacts_importContacts.contacts.size(); i14++) {
                hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i14).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.ui.th.v(tL_error.text, new StringBuilder("import contacts error "));
            }
        }
        if (this.completedRequestsCount == i10) {
            if (!hashMap.isEmpty()) {
                getMessagesStorage().putCachedPhoneBook(hashMap, false, false);
            }
            Utilities.stageQueue.postRunnable(new s1(this, hashMap3, hashMap6, z10, hashMap4, arrayList, hashMap5, zArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$21(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$23(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$22(HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new l1(this, hashMap3, arrayList, hashMap4, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSyncPhoneBook$24(HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new l1(this, hashMap3, arrayList, hashMap4, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0307, code lost:
    
        if (r0 != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x030f, code lost:
    
        if (r30.contactsByPhone.containsKey(r5) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0311, code lost:
    
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0314, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0316, code lost:
    
        r5 = new org.telegram.tgnet.TLRPC.TL_inputPhoneContact();
        r5.client_id = r14.contact_id | (r4 << 32);
        r5.first_name = r14.first_name;
        r5.last_name = r14.last_name;
        r5.phone = r14.phones.get(r4);
        r13.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x014c, code lost:
    
        if (r6.last_name.equals(r14.last_name) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
    
        if (r6.first_name.equals(r14.first_name) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$performSyncPhoneBook$25(final HashMap hashMap, final boolean z10, boolean z11, final boolean z12, boolean z13, boolean z14, boolean z15) {
        int i10;
        ArrayList arrayList;
        HashMap hashMap2;
        HashMap hashMap3;
        int i11;
        int i12;
        int i13;
        HashMap hashMap4;
        final int i14;
        Contact contact;
        HashMap hashMap5;
        int i15;
        HashMap<String, Contact> hashMap6;
        HashMap hashMap7;
        Iterator<Map.Entry<String, Contact>> it;
        HashMap hashMap8;
        int i16;
        int indexOf;
        int i17;
        HashMap<String, Contact> hashMap9;
        int i18;
        HashMap hashMap10;
        int i19;
        boolean z16;
        HashMap hashMap11 = new HashMap();
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Contact contact2 = (Contact) ((Map.Entry) it2.next()).getValue();
            while (i10 < contact2.shortPhones.size()) {
                hashMap11.put(contact2.shortPhones.get(i10), contact2);
                i10++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start read contacts from phone");
        }
        if (!z10) {
            checkContactsInternal();
        }
        HashMap<String, Contact> readContactsFromPhoneBook = readContactsFromPhoneBook();
        HashMap hashMap12 = new HashMap();
        HashMap hashMap13 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, Contact>> it3 = readContactsFromPhoneBook.entrySet().iterator();
        while (it3.hasNext()) {
            Contact value = it3.next().getValue();
            int size = value.shortPhones.size();
            for (int i20 = 0; i20 < size; i20++) {
                hashMap13.put(value.shortPhones.get(i20).substring(Math.max(0, r12.length() - 7)), value);
            }
            String letter = value.getLetter();
            ArrayList arrayList3 = (ArrayList) hashMap12.get(letter);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                hashMap12.put(letter, arrayList3);
                arrayList2.add(letter);
            }
            arrayList3.add(value);
        }
        final HashMap hashMap14 = new HashMap();
        int size2 = hashMap.size();
        ArrayList arrayList4 = new ArrayList();
        if (hashMap.isEmpty()) {
            arrayList = arrayList2;
            hashMap2 = hashMap13;
            hashMap3 = hashMap12;
            if (z11) {
                int i21 = 0;
                for (Map.Entry<String, Contact> entry : readContactsFromPhoneBook.entrySet()) {
                    Contact value2 = entry.getValue();
                    entry.getKey();
                    while (i13 < value2.phones.size()) {
                        if (!z13) {
                            String str = value2.shortPhones.get(i13);
                            String substring = str.substring(Math.max(0, str.length() - 7));
                            TLRPC.TL_contact tL_contact = this.contactsByPhone.get(str);
                            if (tL_contact != null) {
                                TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
                                if (user != null) {
                                    i21++;
                                    String str2 = user.first_name;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    String str3 = user.last_name;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if (str2.equals(value2.first_name)) {
                                        i13 = str3.equals(value2.last_name) ? i13 + 1 : 0;
                                    }
                                    if (TextUtils.isEmpty(value2.first_name) && TextUtils.isEmpty(value2.last_name)) {
                                    }
                                }
                            } else if (this.contactsByShortPhone.containsKey(substring)) {
                                i21++;
                            }
                        }
                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
                        tL_inputPhoneContact.client_id = value2.contact_id | (i13 << 32);
                        tL_inputPhoneContact.first_name = value2.first_name;
                        tL_inputPhoneContact.last_name = value2.last_name;
                        tL_inputPhoneContact.phone = value2.phones.get(i13);
                        arrayList4.add(tL_inputPhoneContact);
                    }
                }
                i11 = i21;
            } else {
                i11 = 0;
            }
            i12 = 0;
        } else {
            Iterator<Map.Entry<String, Contact>> it4 = readContactsFromPhoneBook.entrySet().iterator();
            i12 = 0;
            int i22 = 0;
            while (it4.hasNext()) {
                Map.Entry<String, Contact> next = it4.next();
                String key = next.getKey();
                Contact value3 = next.getValue();
                Contact contact3 = (Contact) hashMap.get(key);
                ArrayList arrayList5 = arrayList2;
                if (contact3 == null) {
                    while (i10 < value3.shortPhones.size()) {
                        contact = (Contact) hashMap11.get(value3.shortPhones.get(i10));
                        if (contact != null) {
                            key = contact.key;
                            break;
                        }
                        i10++;
                    }
                }
                contact = contact3;
                if (contact != null) {
                    value3.imported = contact.imported;
                }
                if (contact != null) {
                    if (TextUtils.isEmpty(value3.first_name)) {
                        hashMap5 = hashMap11;
                    } else {
                        hashMap5 = hashMap11;
                    }
                    if (!TextUtils.isEmpty(value3.last_name)) {
                    }
                } else {
                    hashMap5 = hashMap11;
                }
                boolean z17 = false;
                if (contact == null || z17) {
                    i15 = size2;
                    hashMap6 = readContactsFromPhoneBook;
                    hashMap7 = hashMap13;
                    it = it4;
                    hashMap8 = hashMap12;
                    while (i16 < value3.phones.size()) {
                        String str4 = value3.shortPhones.get(i16);
                        str4.substring(Math.max(0, str4.length() - 7));
                        hashMap14.put(str4, value3);
                        if (contact != null && (indexOf = contact.shortPhones.indexOf(str4)) != -1) {
                            Integer num = contact.phoneDeleted.get(indexOf);
                            value3.phoneDeleted.set(i16, num);
                            i16 = num.intValue() == 1 ? i16 + 1 : 0;
                        }
                    }
                    if (contact != null) {
                        hashMap.remove(key);
                    }
                } else {
                    int i23 = 0;
                    while (i23 < value3.phones.size()) {
                        String str5 = value3.shortPhones.get(i23);
                        HashMap hashMap15 = hashMap13;
                        Iterator<Map.Entry<String, Contact>> it5 = it4;
                        String substring2 = str5.substring(Math.max(0, str5.length() - 7));
                        hashMap14.put(str5, value3);
                        int indexOf2 = contact.shortPhones.indexOf(str5);
                        if (z11) {
                            i18 = indexOf2;
                            TLRPC.TL_contact tL_contact2 = this.contactsByPhone.get(str5);
                            if (tL_contact2 != null) {
                                hashMap10 = hashMap12;
                                i17 = size2;
                                hashMap9 = readContactsFromPhoneBook;
                                TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
                                if (user2 != null) {
                                    i22++;
                                    if (TextUtils.isEmpty(user2.first_name) && TextUtils.isEmpty(user2.last_name) && (!TextUtils.isEmpty(value3.first_name) || !TextUtils.isEmpty(value3.last_name))) {
                                        z16 = true;
                                        i18 = -1;
                                        i19 = i18;
                                        if (i19 != -1) {
                                            value3.phoneDeleted.set(i23, contact.phoneDeleted.get(i19));
                                            contact.phones.remove(i19);
                                            contact.shortPhones.remove(i19);
                                            contact.phoneDeleted.remove(i19);
                                            contact.phoneTypes.remove(i19);
                                        } else if (z11) {
                                            if (!z16) {
                                                TLRPC.TL_contact tL_contact3 = this.contactsByPhone.get(str5);
                                                if (tL_contact3 != null) {
                                                    TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(tL_contact3.user_id));
                                                    if (user3 != null) {
                                                        i22++;
                                                        String str6 = user3.first_name;
                                                        if (str6 == null) {
                                                            str6 = "";
                                                        }
                                                        String str7 = user3.last_name;
                                                        if (str7 == null) {
                                                            str7 = "";
                                                        }
                                                        if (str6.equals(value3.first_name)) {
                                                            if (str7.equals(value3.last_name)) {
                                                            }
                                                        }
                                                        if (TextUtils.isEmpty(value3.first_name) && TextUtils.isEmpty(value3.last_name)) {
                                                        }
                                                    } else {
                                                        i12++;
                                                    }
                                                } else if (this.contactsByShortPhone.containsKey(substring2)) {
                                                    i22++;
                                                }
                                            }
                                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact2 = new TLRPC.TL_inputPhoneContact();
                                            tL_inputPhoneContact2.client_id = value3.contact_id | (i23 << 32);
                                            tL_inputPhoneContact2.first_name = value3.first_name;
                                            tL_inputPhoneContact2.last_name = value3.last_name;
                                            tL_inputPhoneContact2.phone = value3.phones.get(i23);
                                            arrayList4.add(tL_inputPhoneContact2);
                                        }
                                        i23++;
                                        it4 = it5;
                                        hashMap13 = hashMap15;
                                        hashMap12 = hashMap10;
                                        readContactsFromPhoneBook = hashMap9;
                                        size2 = i17;
                                    }
                                }
                                z16 = false;
                                i19 = i18;
                                if (i19 != -1) {
                                }
                                i23++;
                                it4 = it5;
                                hashMap13 = hashMap15;
                                hashMap12 = hashMap10;
                                readContactsFromPhoneBook = hashMap9;
                                size2 = i17;
                            } else {
                                i17 = size2;
                                hashMap9 = readContactsFromPhoneBook;
                                hashMap10 = hashMap12;
                                if (this.contactsByShortPhone.containsKey(substring2)) {
                                    i22++;
                                }
                            }
                        } else {
                            i17 = size2;
                            hashMap9 = readContactsFromPhoneBook;
                            i18 = indexOf2;
                            hashMap10 = hashMap12;
                        }
                        i19 = i18;
                        z16 = false;
                        if (i19 != -1) {
                        }
                        i23++;
                        it4 = it5;
                        hashMap13 = hashMap15;
                        hashMap12 = hashMap10;
                        readContactsFromPhoneBook = hashMap9;
                        size2 = i17;
                    }
                    i15 = size2;
                    hashMap6 = readContactsFromPhoneBook;
                    hashMap7 = hashMap13;
                    it = it4;
                    hashMap8 = hashMap12;
                    if (contact.phones.isEmpty()) {
                        hashMap.remove(key);
                    }
                }
                hashMap11 = hashMap5;
                arrayList2 = arrayList5;
                it4 = it;
                hashMap13 = hashMap7;
                hashMap12 = hashMap8;
                readContactsFromPhoneBook = hashMap6;
                size2 = i15;
                i10 = 0;
            }
            int i24 = size2;
            HashMap<String, Contact> hashMap16 = readContactsFromPhoneBook;
            arrayList = arrayList2;
            hashMap2 = hashMap13;
            hashMap3 = hashMap12;
            if (!z12 && hashMap.isEmpty() && arrayList4.isEmpty()) {
                size2 = i24;
                if (size2 == hashMap16.size()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("contacts not changed!");
                        return;
                    }
                    return;
                }
            } else {
                size2 = i24;
            }
            if (!z11 || hashMap.isEmpty() || hashMap16.isEmpty() || !arrayList4.isEmpty()) {
                readContactsFromPhoneBook = hashMap16;
            } else {
                readContactsFromPhoneBook = hashMap16;
                getMessagesStorage().putCachedPhoneBook(readContactsFromPhoneBook, false, false);
            }
            i11 = i22;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done processing contacts");
        }
        if (!z11) {
            final HashMap<String, Contact> hashMap17 = readContactsFromPhoneBook;
            final ArrayList arrayList6 = arrayList;
            final HashMap hashMap18 = hashMap2;
            final HashMap hashMap19 = hashMap3;
            final int i25 = 2;
            Utilities.stageQueue.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.f1
                public final /* synthetic */ ContactsController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            this.b.lambda$performSyncPhoneBook$16(hashMap14, hashMap17, z12, hashMap19, arrayList6, hashMap18);
                            break;
                        case 1:
                            this.b.lambda$performSyncPhoneBook$22(hashMap14, hashMap17, z12, hashMap19, arrayList6, hashMap18);
                            break;
                        default:
                            this.b.lambda$performSyncPhoneBook$24(hashMap14, hashMap17, z12, hashMap19, arrayList6, hashMap18);
                            break;
                    }
                }
            });
            if (hashMap17.isEmpty()) {
                return;
            }
            getMessagesStorage().putCachedPhoneBook(hashMap17, false, false);
            return;
        }
        if (arrayList4.isEmpty()) {
            final HashMap<String, Contact> hashMap20 = readContactsFromPhoneBook;
            final ArrayList arrayList7 = arrayList;
            final HashMap hashMap21 = hashMap2;
            final HashMap hashMap22 = hashMap3;
            final int i26 = 1;
            Utilities.stageQueue.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.f1
                public final /* synthetic */ ContactsController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i26) {
                        case 0:
                            this.b.lambda$performSyncPhoneBook$16(hashMap14, hashMap20, z12, hashMap22, arrayList7, hashMap21);
                            break;
                        case 1:
                            this.b.lambda$performSyncPhoneBook$22(hashMap14, hashMap20, z12, hashMap22, arrayList7, hashMap21);
                            break;
                        default:
                            this.b.lambda$performSyncPhoneBook$24(hashMap14, hashMap20, z12, hashMap22, arrayList7, hashMap21);
                            break;
                    }
                }
            });
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("start import contacts");
        }
        if (z14 && i12 != 0) {
            if (i12 >= 30) {
                hashMap4 = hashMap14;
                i14 = 1;
            } else if (z12 && size2 == 0 && this.contactsByPhone.size() - i11 > (this.contactsByPhone.size() / 3) * 2) {
                hashMap4 = hashMap14;
                i14 = 2;
            }
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder o10 = com.google.android.recaptcha.internal.a.o("new phone book contacts ", i12, " serverContactsInPhonebook ", i11, " totalContacts ");
                o10.append(this.contactsByPhone.size());
                FileLog.d(o10.toString());
            }
            if (i14 == 0) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.this.lambda$performSyncPhoneBook$14(i14, hashMap, z12, z10);
                    }
                });
                return;
            }
            if (z15) {
                final HashMap hashMap23 = hashMap4;
                final int i27 = 0;
                final HashMap<String, Contact> hashMap24 = readContactsFromPhoneBook;
                final ArrayList arrayList8 = arrayList;
                final HashMap hashMap25 = hashMap2;
                final HashMap hashMap26 = hashMap3;
                Utilities.stageQueue.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.f1
                    public final /* synthetic */ ContactsController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i27) {
                            case 0:
                                this.b.lambda$performSyncPhoneBook$16(hashMap23, hashMap24, z12, hashMap26, arrayList8, hashMap25);
                                break;
                            case 1:
                                this.b.lambda$performSyncPhoneBook$22(hashMap23, hashMap24, z12, hashMap26, arrayList8, hashMap25);
                                break;
                            default:
                                this.b.lambda$performSyncPhoneBook$24(hashMap23, hashMap24, z12, hashMap26, arrayList8, hashMap25);
                                break;
                        }
                    }
                });
                return;
            }
            ContactsController contactsController = this;
            HashMap<String, Contact> hashMap27 = readContactsFromPhoneBook;
            ArrayList arrayList9 = arrayList;
            HashMap hashMap28 = hashMap2;
            HashMap hashMap29 = hashMap3;
            boolean[] zArr = {false};
            HashMap hashMap30 = new HashMap(hashMap27);
            HashMap<String, Contact> hashMap31 = hashMap27;
            SparseArray sparseArray = new SparseArray();
            Iterator it6 = hashMap30.entrySet().iterator();
            while (it6.hasNext()) {
                Contact contact4 = (Contact) ((Map.Entry) it6.next()).getValue();
                sparseArray.put(contact4.contact_id, contact4.key);
            }
            contactsController.completedRequestsCount = 0;
            int ceil = (int) Math.ceil(arrayList4.size() / 500.0d);
            int i28 = 0;
            while (i28 < ceil) {
                ArrayList arrayList10 = arrayList9;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
                int i29 = i28 * 500;
                tL_contacts_importContacts.contacts = new ArrayList<>(arrayList4.subList(i29, Math.min(i29 + 500, arrayList4.size())));
                ConnectionsManager connectionsManager = contactsController.getConnectionsManager();
                HashMap hashMap32 = hashMap28;
                int i30 = ceil;
                HashMap hashMap33 = hashMap29;
                HashMap<String, Contact> hashMap34 = hashMap31;
                g1 g1Var = new g1(contactsController, hashMap30, sparseArray, zArr, hashMap34, tL_contacts_importContacts, i30, hashMap4, z12, hashMap33, arrayList10, hashMap32);
                hashMap29 = hashMap33;
                arrayList9 = arrayList10;
                hashMap28 = hashMap32;
                connectionsManager.sendRequest(tL_contacts_importContacts, g1Var, 6);
                i28++;
                hashMap30 = hashMap30;
                ceil = i30;
                hashMap4 = hashMap4;
                hashMap31 = hashMap34;
                sparseArray = sparseArray;
                contactsController = this;
            }
            return;
        }
        hashMap4 = hashMap14;
        i14 = 0;
        if (BuildVars.LOGS_ENABLED) {
        }
        if (i14 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedContacts$29() {
        this.doneLoadingContacts = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$processLoadedContacts$30(a0.h hVar, Collator collator, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        return collator.compare(UserObject.getFirstName((TLRPC.User) hVar.f(tL_contact.user_id)), UserObject.getFirstName((TLRPC.User) hVar.f(tL_contact2.user_id)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$processLoadedContacts$31(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$processLoadedContacts$32(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedContacts$33(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2, ArrayList arrayList3, int i10, boolean z10, boolean z11) {
        this.contacts = arrayList;
        this.contactsDict = concurrentHashMap;
        this.usersSectionsDict = hashMap;
        this.usersMutualSectionsDict = hashMap2;
        this.sortedUsersSectionsArray = arrayList2;
        this.sortedUsersMutualSectionsArray = arrayList3;
        this.doneLoadingContacts = true;
        if (i10 != 2) {
            synchronized (this.loadContactsSync) {
                this.loadingContacts = false;
            }
        }
        performWriteContactsToPhoneBook();
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (i10 == 1 || z10) {
            reloadContactsStatusesMaybe(false);
        } else {
            saveContactsLoadTime();
        }
        if (z11) {
            loadContacts(false, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedContacts$34(HashMap hashMap, HashMap hashMap2) {
        this.contactsByPhone = hashMap;
        this.contactsByShortPhone = hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedContacts$35(HashMap hashMap, HashMap hashMap2) {
        Utilities.globalQueue.postRunnable(new q1(this, hashMap, hashMap2, 1));
        if (this.contactsSyncInProgress) {
            return;
        }
        this.contactsSyncInProgress = true;
        getMessagesStorage().getCachedPhoneBook(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedContacts$36(final int i10, final ArrayList arrayList, ArrayList arrayList2, a0.h hVar, final boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        int i11;
        ConcurrentHashMap concurrentHashMap;
        int i12;
        ArrayList arrayList3;
        ArrayList arrayList4 = arrayList;
        a0.h hVar2 = hVar;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i10 == 1 && (arrayList4.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - getUserConfig().lastContactsSyncTime) >= 86400)) {
            loadContacts(false, getContactsHash(arrayList4));
            if (arrayList4.isEmpty()) {
                AndroidUtilities.runOnUIThread(new e1(this, 2));
                return;
            }
        }
        if (i10 == 0) {
            getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
        }
        int i13 = 0;
        final boolean z11 = false;
        while (i13 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact = arrayList4.get(i13);
            if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != getUserConfig().getClientUserId()) {
                arrayList4.remove(i13);
                i13--;
                z11 = true;
            }
            i13++;
        }
        if (i10 != 1) {
            getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            getMessagesStorage().putContacts(arrayList4, i10 != 2);
        }
        Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList4, new j1(hVar2, localeCollator, 1));
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap hashMap3 = new HashMap();
        final HashMap hashMap4 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (this.contactsBookLoaded) {
            hashMap = null;
            hashMap2 = null;
        } else {
            hashMap = new HashMap();
            hashMap2 = new HashMap();
        }
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact2 = arrayList4.get(i14);
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            TLRPC.User user = (TLRPC.User) hVar2.f(tL_contact2.user_id);
            if (user == null) {
                i11 = i14;
                arrayList3 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
            } else {
                i11 = i14;
                ArrayList arrayList7 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
                concurrentHashMap.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                if (hashMap == null || TextUtils.isEmpty(user.phone)) {
                    i12 = 0;
                } else {
                    hashMap.put(user.phone, tL_contact2);
                    i12 = 0;
                    hashMap2.put(user.phone.substring(Math.max(0, r12.length() - 7)), tL_contact2);
                }
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i12, 1);
                }
                String upperCase = firstName.length() == 0 ? "#" : firstName.toUpperCase();
                String str = this.sectionsToReplace.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList arrayList8 = (ArrayList) hashMap3.get(upperCase);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    hashMap3.put(upperCase, arrayList8);
                    arrayList5.add(upperCase);
                }
                arrayList8.add(tL_contact2);
                if (user.mutual_contact) {
                    ArrayList arrayList9 = (ArrayList) hashMap4.get(upperCase);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        hashMap4.put(upperCase, arrayList9);
                        arrayList3 = arrayList7;
                        arrayList3.add(upperCase);
                    } else {
                        arrayList3 = arrayList7;
                    }
                    arrayList9.add(tL_contact2);
                } else {
                    arrayList3 = arrayList7;
                }
            }
            i14 = i11 + 1;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap;
            arrayList6 = arrayList3;
            concurrentHashMap2 = concurrentHashMap4;
            arrayList4 = arrayList;
            hVar2 = hVar;
        }
        final ArrayList arrayList10 = arrayList6;
        final ConcurrentHashMap concurrentHashMap5 = concurrentHashMap2;
        Collections.sort(arrayList5, new k1(localeCollator, 3));
        Collections.sort(arrayList10, new k1(localeCollator, 4));
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.p1
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.this.lambda$processLoadedContacts$33(arrayList, concurrentHashMap5, hashMap3, hashMap4, arrayList5, arrayList10, i10, z10, z11);
            }
        });
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        if (hashMap != null) {
            AndroidUtilities.runOnUIThread(new q1(this, hashMap, hashMap2, 0));
        } else {
            this.contactsLoaded = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedContacts$37(ArrayList arrayList, int i10, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, i10 == 1);
        a0.h hVar = new a0.h();
        boolean isEmpty = arrayList2.isEmpty();
        if (i10 == 2 && !this.contacts.isEmpty()) {
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                if (this.contactsDict.get(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i11)).user_id)) != null) {
                    arrayList2.remove(i11);
                    i11--;
                }
                i11++;
            }
            arrayList2.addAll(this.contacts);
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i12)).user_id));
            if (user != null) {
                hVar.k(user, user.id);
            }
        }
        Utilities.stageQueue.postRunnable(new r1(this, i10, arrayList2, arrayList, hVar, isEmpty));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readContacts$11() {
        if (this.contacts.isEmpty() && !this.contactsLoaded) {
            loadContacts(true, 0L);
            return;
        }
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadContactsStatuses$58(SharedPreferences.Editor editor, TLObject tLObject) {
        editor.remove("needGetStatuses").commit();
        Vector vector = (Vector) tLObject;
        if (!vector.objects.isEmpty()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<T> arrayList2 = vector.objects;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                TLRPC.TL_contactStatus tL_contactStatus = (TLRPC.TL_contactStatus) obj;
                if (tL_contactStatus != null) {
                    TLRPC.UserStatus userStatus = tL_contactStatus.status;
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        userStatus.expires = userStatus.by_me ? -1000 : -100;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        userStatus.expires = userStatus.by_me ? -1001 : -101;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        userStatus.expires = userStatus.by_me ? -1002 : -102;
                    }
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contactStatus.user_id));
                    if (user != null) {
                        user.status = tL_contactStatus.status;
                    }
                    tL_user.status = tL_contactStatus.status;
                    arrayList.add(tL_user);
                }
            }
            getMessagesStorage().updateUsers(arrayList, true, true, true);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_STATUS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadContactsStatuses$59(SharedPreferences.Editor editor, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            AndroidUtilities.runOnUIThread(new f0(this, editor, (Vector) tLObject, 14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncPhoneBookByAlert$7(HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        performSyncPhoneBook(hashMap, true, z10, z11, false, false, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$updateUnregisteredContacts$42(Collator collator, Contact contact, Contact contact2) {
        String str = contact.first_name;
        if (str.length() == 0) {
            str = contact.last_name;
        }
        String str2 = contact2.first_name;
        if (str2.length() == 0) {
            str2 = contact2.last_name;
        }
        return collator.compare(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mergePhonebookAndTelegramContacts, reason: merged with bridge method [inline-methods] */
    public void lambda$performSyncPhoneBook$23(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2) {
        mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2, true);
    }

    private void performWriteContactsToPhoneBook() {
        Utilities.phoneBookQueue.postRunnable(new o1(this, new ArrayList(this.contacts), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        org.telegram.messenger.FileLog.d("performWriteContactsToPhoneBookInternal " + (java.lang.System.currentTimeMillis() - r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        if (r4 == null) goto L54;
     */
    /* renamed from: performWriteContactsToPhoneBookInternal, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$performWriteContactsToPhoneBook$45(ArrayList<TLRPC.TL_contact> arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                Account account = this.systemAccount;
                if (hasContactsPermission() && account != null && hasContactsWritePermission()) {
                    SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
                    boolean z10 = mainSettings.getBoolean("contacts_updated_v7", false);
                    boolean z11 = !z10;
                    if (!z10) {
                        mainSettings.edit().putBoolean("contacts_updated_v7", true).commit();
                    }
                    ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                    Cursor query = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2"}, null, null, null);
                    try {
                        a0.h hVar = new a0.h();
                        if (query != null) {
                            while (query.moveToNext()) {
                                hVar.k(Long.valueOf(query.getLong(0)), query.getLong(1));
                            }
                            query.close();
                            FileLog.d("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z11 + " bookContactsSize=" + hVar.m() + " currentAccount=" + this.currentAccount);
                            ArrayList<ContentProviderOperation> arrayList2 = null;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                TLRPC.TL_contact tL_contact = arrayList.get(i10);
                                if (!z10 || hVar.h(tL_contact.user_id) < 0) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList<>();
                                    }
                                    applyContactToPhoneBook(arrayList2, getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                                    if (arrayList2.size() > 450) {
                                        contentResolver.applyBatch("com.android.contacts", arrayList2);
                                        arrayList2.clear();
                                    }
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                contentResolver.applyBatch("com.android.contacts", arrayList2);
                                arrayList2.clear();
                            }
                        } else {
                            cursor = query;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = query;
                        FileLog.e(e);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void reloadContactsStatuses() {
        saveContactsLoadTime();
        getMessagesController().clearFullUsers();
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new t1(0, this, edit));
    }

    private void saveContactsLoadTime() {
        try {
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    private void updateUnregisteredContacts() {
        HashMap hashMap = new HashMap();
        int size = this.contacts.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i10);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                hashMap.put(user.phone, tL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, Contact>> it = this.contactsBook.entrySet().iterator();
        while (it.hasNext()) {
            Contact value = it.next().getValue();
            int i11 = 0;
            while (true) {
                if (i11 >= value.phones.size()) {
                    arrayList.add(value);
                    break;
                } else if (!hashMap.containsKey(value.shortPhones.get(i11)) && value.phoneDeleted.get(i11).intValue() != 1) {
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, new k1(getLocaleCollator(), 5));
        this.phoneBookContacts = arrayList;
    }

    public void addContact(TLRPC.User user, boolean z10) {
        addContact(user, null, z10);
    }

    public long addContactToPhoneBook(TLRPC.User user, boolean z10) {
        Uri uri;
        long j10 = -1;
        if (this.systemAccount == null || user == null || !hasContactsWritePermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z10) {
            try {
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + user.id, null);
            } catch (Exception unused) {
            }
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        applyContactToPhoneBook(arrayList, user);
        try {
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch != null && applyBatch.length > 0 && (uri = applyBatch[0].uri) != null) {
                j10 = Long.parseLong(uri.getLastPathSegment());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j10;
    }

    public void checkAppAccount() {
        this.systemAccount = null;
        Utilities.globalQueue.postRunnable(new e1(this, 4));
    }

    public void checkContacts() {
        Utilities.globalQueue.postRunnable(new e1(this, 9));
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i10 = mainSettings.getInt("invitelinktime", 0);
        if (this.updatingInviteLink) {
            return;
        }
        if (this.inviteLink == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
            this.updatingInviteLink = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new i1(this, 0), 2);
        }
    }

    public void cleanup() {
        this.contactsBook.clear();
        this.contactsBookSPhones.clear();
        this.phoneBookContacts.clear();
        this.contacts.clear();
        this.contactsDict.clear();
        this.usersSectionsDict.clear();
        this.usersMutualSectionsDict.clear();
        this.sortedUsersSectionsArray.clear();
        this.sortedUsersMutualSectionsArray.clear();
        this.delayedContactsUpdate.clear();
        this.contactsByPhone.clear();
        this.contactsByShortPhone.clear();
        this.phoneBookSectionsDict.clear();
        this.phoneBookSectionsArray.clear();
        this.phoneBookByShortPhones.clear();
        this.loadingContacts = false;
        this.contactsSyncInProgress = false;
        this.doneLoadingContacts = false;
        this.contactsLoaded = false;
        this.contactsBookLoaded = false;
        this.lastContactsVersions = "";
        this.loadingGlobalSettings = 0;
        this.loadingDeleteInfo = 0;
        this.deleteAccountTTL = 0;
        Arrays.fill(this.loadingPrivacyInfo, 0);
        this.lastseenPrivacyRules = null;
        this.groupPrivacyRules = null;
        this.callPrivacyRules = null;
        this.p2pPrivacyRules = null;
        this.profilePhotoPrivacyRules = null;
        this.bioPrivacyRules = null;
        this.musicPrivacyRules = null;
        this.birthdayPrivacyRules = null;
        this.giftsPrivacyRules = null;
        this.forwardsPrivacyRules = null;
        this.phonePrivacyRules = null;
        Utilities.globalQueue.postRunnable(new e1(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0240 A[Catch: Exception -> 0x0244, TryCatch #2 {Exception -> 0x0244, blocks: (B:22:0x0240, B:23:0x0246, B:20:0x01b0), top: B:19:0x01b0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createOrUpdateConnectionServiceContact(long j10, String str, String str2) {
        ContentResolver contentResolver;
        ArrayList<ContentProviderOperation> arrayList;
        Uri build;
        Cursor cursor;
        int parseInt;
        Uri uri;
        Cursor query;
        int size;
        int i10;
        Cursor cursor2;
        if (!hasContactsPermission()) {
            return;
        }
        try {
            contentResolver = ApplicationLoader.applicationContext.getContentResolver();
            arrayList = new ArrayList<>();
            Uri build2 = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Account account = this.systemAccount;
            Cursor query2 = contentResolver.query(build2, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (query2 == null || !query2.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                cursor = query2;
                contentValues.put("account_type", this.systemAccount.type);
                contentValues.put("account_name", this.systemAccount.name);
                contentValues.put("group_visible", (Integer) 0);
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                parseInt = Integer.parseInt(contentResolver.insert(build2, contentValues).getLastPathSegment());
            } else {
                parseInt = query2.getInt(0);
                cursor = query2;
            }
            if (cursor != null) {
                cursor.close();
            }
            uri = ContactsContract.Data.CONTENT_URI;
            query = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", parseInt + ""}, null);
            size = arrayList.size();
            i10 = parseInt;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i11 = query.getInt(0);
                        cursor2 = query;
                        arrayList.add(ContentProviderOperation.newUpdate(build).withSelection("_id=?", new String[]{i11 + ""}).withValue("deleted", 0).build());
                        ContentProviderOperation.Builder withSelection = ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i11 + "", "vnd.android.cursor.item/phone_v2"});
                        StringBuilder sb2 = new StringBuilder("+99084");
                        sb2.append(j10);
                        arrayList.add(withSelection.withValue("data1", sb2.toString()).build());
                        arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i11 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        contentResolver.applyBatch("com.android.contacts", arrayList);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    return;
                }
            }
            arrayList.add(ContentProviderOperation.newInsert(build).withValue("account_type", this.systemAccount.type).withValue("account_name", this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j10).build());
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i10)).build());
            if (cursor2 != null) {
            }
            contentResolver.applyBatch("com.android.contacts", arrayList);
            return;
        } catch (Exception e12) {
            e = e12;
            FileLog.e(e);
            return;
        }
        cursor2 = query;
    }

    public void deleteAllContacts(Runnable runnable) {
        resetImportedContacts();
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i10 = 0; i10 < size; i10++) {
            tL_contacts_deleteContacts.id.add(getMessagesController().getInputUser(this.contacts.get(i10).user_id));
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new t1(1, this, runnable));
    }

    public void deleteConnectionServiceContact() {
        if (hasContactsPermission()) {
            try {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                Account account = this.systemAccount;
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query == null || !query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                int i10 = query.getInt(0);
                query.close();
                Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i10 + ""}, null);
                if (query2 == null || !query2.moveToFirst()) {
                    if (query2 != null) {
                        query2.close();
                        return;
                    }
                    return;
                }
                int i11 = query2.getInt(0);
                query2.close();
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i11 + ""});
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void deleteContact(ArrayList<TLRPC.User> arrayList, boolean z10) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = arrayList.get(i10);
            lh.s6 storiesController = getMessagesController().getStoriesController();
            long j10 = user.id;
            int i11 = storiesController.a;
            ArrayList arrayList3 = storiesController.h;
            ArrayList arrayList4 = storiesController.g;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList4.size()) {
                    break;
                }
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList4.get(i12)).peer) == j10) {
                    arrayList4.remove(i12);
                    break;
                }
                i12++;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList3.size()) {
                    break;
                }
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList3.get(i13)).peer) == j10) {
                    arrayList3.remove(i13);
                    break;
                }
                i13++;
            }
            lh.f7 f7Var = storiesController.k;
            f7Var.b.getStorageQueue().postRunnable(new eg.z1(f7Var, j10, 8));
            MessagesController.getInstance(i11).checkArchiveFolder();
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            TLRPC.InputUser inputUser = getMessagesController().getInputUser(user);
            if (inputUser != null) {
                user.contact = false;
                arrayList2.add(Long.valueOf(user.id));
                tL_contacts_deleteContacts.id.add(inputUser);
            }
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new hh.g(this, arrayList2, arrayList, z10, arrayList.get(0).first_name));
    }

    public void deleteContactsUndoable(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList<TLRPC.User> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = arrayList.get(i10);
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.id));
            user.contact = false;
            this.contacts.remove(tL_contact);
            this.contactsDict.remove(Long.valueOf(user.id));
            hashMap.put(user, tL_contact);
        }
        buildContactsSectionsArrays(false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(context, o2Var.getResourceProvider());
        ecVar.setTimer();
        ecVar.b.setText(LocaleController.formatPluralString("ContactsDeletedUndo", hashMap.size(), new Object[0]));
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(context, o2Var.getResourceProvider(), true, true);
        kcVar.a = new d3(28, this, hashMap);
        kcVar.b = new o1(this, arrayList, 2);
        ecVar.setButton(kcVar);
        org.telegram.ui.Components.mc.g(o2Var, ecVar, 5000).j();
    }

    public void deleteUnknownAppAccounts() {
        try {
            this.systemAccount = null;
            AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            for (int i10 = 0; i10 < accountsByType.length; i10++) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i11).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.id)) {
                                break;
                            }
                        }
                        i11++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i10], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new e1(this, 7));
    }

    public HashMap<String, Contact> getContactsCopy(HashMap<String, Contact> hashMap) {
        HashMap<String, Contact> hashMap2 = new HashMap<>();
        for (Map.Entry<String, Contact> entry : hashMap.entrySet()) {
            Contact contact = new Contact();
            Contact value = entry.getValue();
            contact.phoneDeleted.addAll(value.phoneDeleted);
            contact.phones.addAll(value.phones);
            contact.phoneTypes.addAll(value.phoneTypes);
            contact.shortPhones.addAll(value.shortPhones);
            contact.first_name = value.first_name;
            contact.last_name = value.last_name;
            contact.contact_id = value.contact_id;
            String str = value.key;
            contact.key = str;
            hashMap2.put(str, contact);
        }
        return hashMap2;
    }

    public int getDeleteAccountTTL() {
        return this.deleteAccountTTL;
    }

    public TLRPC.GlobalPrivacySettings getGlobalPrivacySettings() {
        return this.globalPrivacySettings;
    }

    public String getInviteText(int i10) {
        String str = this.inviteLink;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i10 <= 1) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
        try {
            return String.format(LocaleController.getPluralString("InviteTextNum", i10), Integer.valueOf(i10), str);
        } catch (Exception unused) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
    }

    public boolean getLoadingDeleteInfo() {
        return this.loadingDeleteInfo != 2;
    }

    public boolean getLoadingGlobalSettings() {
        return this.loadingGlobalSettings != 2;
    }

    public boolean getLoadingPrivacyInfo(int i10) {
        return this.loadingPrivacyInfo[i10] != 2;
    }

    public ArrayList<TLRPC.PrivacyRule> getPrivacyRules(int i10) {
        switch (i10) {
            case 0:
                return this.lastseenPrivacyRules;
            case 1:
                return this.groupPrivacyRules;
            case 2:
                return this.callPrivacyRules;
            case 3:
                return this.p2pPrivacyRules;
            case 4:
                return this.profilePhotoPrivacyRules;
            case 5:
                return this.forwardsPrivacyRules;
            case 6:
                return this.phonePrivacyRules;
            case 7:
                return this.addedByPhonePrivacyRules;
            case 8:
                return this.voiceMessagesRules;
            case 9:
                return this.bioPrivacyRules;
            case 10:
            default:
                return null;
            case 11:
                return this.birthdayPrivacyRules;
            case 12:
                return this.giftsPrivacyRules;
            case 13:
                return this.noPaidMessagesPrivacyRules;
            case 14:
                return this.musicPrivacyRules;
        }
    }

    public boolean isContact(long j10) {
        return this.contactsDict.get(Long.valueOf(j10)) != null;
    }

    public boolean isLoadingContacts() {
        boolean z10;
        synchronized (this.loadContactsSync) {
            z10 = this.loadingContacts;
        }
        return z10;
    }

    public void loadContacts(boolean z10, long j10) {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = true;
        }
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from cache");
            }
            getMessagesStorage().getContacts();
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from server");
            }
            TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
            tL_contacts_getContacts.hash = j10;
            getConnectionsManager().sendRequest(tL_contacts_getContacts, new lh.s5(this, j10, 1));
        }
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new i1(this, 1));
        }
    }

    public void loadPrivacySettings() {
        loadPrivacySettings(false);
    }

    public void markAsContacted(String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new u1(str, 0));
    }

    public void migratePhoneBookToV7(SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new d3(27, this, sparseArray));
    }

    public void performSyncPhoneBook(final HashMap<String, Contact> hashMap, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15) {
        if (z11 || this.contactsBookLoaded) {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.h1
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.this.lambda$performSyncPhoneBook$25(hashMap, z12, z10, z11, z13, z14, z15);
                }
            });
        }
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        int indexOf;
        int indexOf2;
        ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayList.get(i10);
            i10++;
            Long l11 = l10;
            if (l11.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l11.longValue();
                arrayList2.add(tL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-l11.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf);
                }
            } else if (l11.longValue() < 0) {
                arrayList3.add(Long.valueOf(-l11.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-l11.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf2);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().deleteContacts(arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            getMessagesStorage().putContacts(arrayList2, false);
        }
        if (this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(arrayList, concurrentHashMap, arrayList2, arrayList3);
            return;
        }
        this.delayedContactsUpdate.addAll(arrayList);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("delay update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
        }
    }

    public void processLoadedContacts(ArrayList<TLRPC.TL_contact> arrayList, ArrayList<TLRPC.User> arrayList2, int i10) {
        AndroidUtilities.runOnUIThread(new h0(this, arrayList2, i10, arrayList, 3));
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            try {
                if (this.loadingContacts) {
                    return;
                }
                this.loadingContacts = true;
                Utilities.stageQueue.postRunnable(new e1(this, 8));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0303, code lost:
    
        if (r9.contains(r8.last_name) != false) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0312 A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:55:0x033b, B:90:0x02d6, B:92:0x02dc, B:94:0x02e4, B:98:0x0307, B:99:0x030c, B:101:0x0312, B:103:0x031a, B:104:0x0331, B:106:0x0335, B:107:0x0338, B:108:0x030a, B:109:0x02ef, B:111:0x02f5, B:113:0x02fd, B:120:0x0345, B:128:0x03a8, B:130:0x03ae, B:132:0x03ca, B:135:0x03d2, B:138:0x03db, B:147:0x03e6, B:155:0x0458, B:157:0x045e, B:159:0x046b, B:161:0x0486, B:164:0x0500, B:165:0x0490, B:167:0x049a, B:168:0x04ab, B:171:0x04af, B:173:0x04b7, B:174:0x04c0, B:176:0x04f1, B:177:0x04f7, B:185:0x0510, B:186:0x051f), top: B:54:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0335 A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:55:0x033b, B:90:0x02d6, B:92:0x02dc, B:94:0x02e4, B:98:0x0307, B:99:0x030c, B:101:0x0312, B:103:0x031a, B:104:0x0331, B:106:0x0335, B:107:0x0338, B:108:0x030a, B:109:0x02ef, B:111:0x02f5, B:113:0x02fd, B:120:0x0345, B:128:0x03a8, B:130:0x03ae, B:132:0x03ca, B:135:0x03d2, B:138:0x03db, B:147:0x03e6, B:155:0x0458, B:157:0x045e, B:159:0x046b, B:161:0x0486, B:164:0x0500, B:165:0x0490, B:167:0x049a, B:168:0x04ab, B:171:0x04af, B:173:0x04b7, B:174:0x04c0, B:176:0x04f1, B:177:0x04f7, B:185:0x0510, B:186:0x051f), top: B:54:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0338 A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:55:0x033b, B:90:0x02d6, B:92:0x02dc, B:94:0x02e4, B:98:0x0307, B:99:0x030c, B:101:0x0312, B:103:0x031a, B:104:0x0331, B:106:0x0335, B:107:0x0338, B:108:0x030a, B:109:0x02ef, B:111:0x02f5, B:113:0x02fd, B:120:0x0345, B:128:0x03a8, B:130:0x03ae, B:132:0x03ca, B:135:0x03d2, B:138:0x03db, B:147:0x03e6, B:155:0x0458, B:157:0x045e, B:159:0x046b, B:161:0x0486, B:164:0x0500, B:165:0x0490, B:167:0x049a, B:168:0x04ab, B:171:0x04af, B:173:0x04b7, B:174:0x04c0, B:176:0x04f1, B:177:0x04f7, B:185:0x0510, B:186:0x051f), top: B:54:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030a A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:55:0x033b, B:90:0x02d6, B:92:0x02dc, B:94:0x02e4, B:98:0x0307, B:99:0x030c, B:101:0x0312, B:103:0x031a, B:104:0x0331, B:106:0x0335, B:107:0x0338, B:108:0x030a, B:109:0x02ef, B:111:0x02f5, B:113:0x02fd, B:120:0x0345, B:128:0x03a8, B:130:0x03ae, B:132:0x03ca, B:135:0x03d2, B:138:0x03db, B:147:0x03e6, B:155:0x0458, B:157:0x045e, B:159:0x046b, B:161:0x0486, B:164:0x0500, B:165:0x0490, B:167:0x049a, B:168:0x04ab, B:171:0x04af, B:173:0x04b7, B:174:0x04c0, B:176:0x04f1, B:177:0x04f7, B:185:0x0510, B:186:0x051f), top: B:54:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0553 A[Catch: all -> 0x0557, TRY_LEAVE, TryCatch #11 {all -> 0x0557, blocks: (B:61:0x054e, B:63:0x0553), top: B:60:0x054e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x055c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0307 A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:55:0x033b, B:90:0x02d6, B:92:0x02dc, B:94:0x02e4, B:98:0x0307, B:99:0x030c, B:101:0x0312, B:103:0x031a, B:104:0x0331, B:106:0x0335, B:107:0x0338, B:108:0x030a, B:109:0x02ef, B:111:0x02f5, B:113:0x02fd, B:120:0x0345, B:128:0x03a8, B:130:0x03ae, B:132:0x03ca, B:135:0x03d2, B:138:0x03db, B:147:0x03e6, B:155:0x0458, B:157:0x045e, B:159:0x046b, B:161:0x0486, B:164:0x0500, B:165:0x0490, B:167:0x049a, B:168:0x04ab, B:171:0x04af, B:173:0x04b7, B:174:0x04c0, B:176:0x04f1, B:177:0x04f7, B:185:0x0510, B:186:0x051f), top: B:54:0x033b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashMap<String, Contact> readContactsFromPhoneBook() {
        HashMap<String, Contact> hashMap;
        Cursor cursor;
        HashMap<String, Contact> hashMap2;
        HashMap<String, Contact> hashMap3;
        int i10;
        ContentResolver contentResolver;
        ArrayList arrayList;
        long j10;
        String str;
        int i11;
        int i12;
        Cursor cursor2;
        ContentResolver contentResolver2;
        String substring;
        long j11;
        String str2;
        StringBuilder sb2;
        ArrayList arrayList2;
        ContactsController contactsController;
        Cursor cursor3;
        String str3;
        ContactsController contactsController2 = this;
        if (!contactsController2.getUserConfig().syncContacts) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts sync disabled");
            }
            return new HashMap<>();
        }
        if (!hasContactsPermission()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app has no contacts permissions");
            }
            return new HashMap<>();
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
            HashMap hashMap4 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            cursor = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, projectionPhones, null, null, null);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str4 = "+";
                int i13 = 1;
                if (cursor != null) {
                    try {
                        int count = cursor.getCount();
                        if (count > 0) {
                            hashMap3 = new HashMap<>(count);
                            i10 = 1;
                            while (cursor.moveToNext()) {
                                try {
                                    String string = cursor.getString(i13);
                                    String string2 = cursor.getString(5);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    boolean z10 = string2.indexOf(".sim") != 0;
                                    if (TextUtils.isEmpty(string)) {
                                        contentResolver2 = contentResolver3;
                                    } else {
                                        contentResolver2 = contentResolver3;
                                        String d = qe.b.d(string, true);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.startsWith(str4)) {
                                                try {
                                                    substring = d.substring(1);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    hashMap = hashMap3;
                                                    try {
                                                        FileLog.e(th);
                                                        if (hashMap != null) {
                                                        }
                                                        if (cursor != null) {
                                                        }
                                                        hashMap2 = hashMap;
                                                        if (hashMap2 == null) {
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } else {
                                                substring = d;
                                            }
                                            j11 = currentTimeMillis;
                                            String string3 = cursor.getString(0);
                                            sb3.setLength(0);
                                            DatabaseUtils.appendEscapedSQLString(sb3, string3);
                                            String sb4 = sb3.toString();
                                            str2 = str4;
                                            Contact contact = (Contact) hashMap4.get(substring);
                                            if (contact != null) {
                                                if (!contact.isGoodProvider && !string2.equals(contact.provider)) {
                                                    sb3.setLength(0);
                                                    DatabaseUtils.appendEscapedSQLString(sb3, contact.key);
                                                    arrayList3.remove(sb3.toString());
                                                    arrayList3.add(sb4);
                                                    contact.key = string3;
                                                    contact.isGoodProvider = z10;
                                                    contact.provider = string2;
                                                }
                                                contentResolver3 = contentResolver2;
                                                currentTimeMillis = j11;
                                                str4 = str2;
                                                i13 = 1;
                                            } else {
                                                if (!arrayList3.contains(sb4)) {
                                                    arrayList3.add(sb4);
                                                }
                                                int i14 = cursor.getInt(2);
                                                Contact contact2 = hashMap3.get(string3);
                                                if (contact2 == null) {
                                                    contact2 = new Contact();
                                                    sb2 = sb3;
                                                    String string4 = cursor.getString(4);
                                                    String trim = string4 == null ? "" : string4.trim();
                                                    if (contactsController2.isNotValidNameString(trim)) {
                                                        contact2.first_name = trim;
                                                        contact2.last_name = "";
                                                        arrayList2 = arrayList3;
                                                    } else {
                                                        int lastIndexOf = trim.lastIndexOf(32);
                                                        arrayList2 = arrayList3;
                                                        if (lastIndexOf != -1) {
                                                            contact2.first_name = trim.substring(0, lastIndexOf).trim();
                                                            contact2.last_name = trim.substring(lastIndexOf + 1).trim();
                                                        } else {
                                                            contact2.first_name = trim;
                                                            contact2.last_name = "";
                                                        }
                                                    }
                                                    contact2.provider = string2;
                                                    contact2.isGoodProvider = z10;
                                                    contact2.key = string3;
                                                    contact2.contact_id = i10;
                                                    hashMap3.put(string3, contact2);
                                                    i10++;
                                                } else {
                                                    sb2 = sb3;
                                                    arrayList2 = arrayList3;
                                                }
                                                contact2.shortPhones.add(substring);
                                                contact2.phones.add(d);
                                                contact2.phoneDeleted.add(0);
                                                if (i14 == 0) {
                                                    String string5 = cursor.getString(3);
                                                    ArrayList<String> arrayList4 = contact2.phoneTypes;
                                                    if (string5 == null) {
                                                        string5 = LocaleController.getString(R.string.PhoneMobile);
                                                    }
                                                    arrayList4.add(string5);
                                                } else if (i14 == 1) {
                                                    contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneHome));
                                                } else if (i14 == 2) {
                                                    contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMobile));
                                                    hashMap4.put(substring, contact2);
                                                    contactsController2 = this;
                                                    arrayList3 = arrayList2;
                                                    contentResolver3 = contentResolver2;
                                                    currentTimeMillis = j11;
                                                    sb3 = sb2;
                                                    str4 = str2;
                                                    i13 = 1;
                                                } else {
                                                    if (i14 == 3) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneWork));
                                                    } else if (i14 == 12) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMain));
                                                    } else {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                    }
                                                    hashMap4.put(substring, contact2);
                                                    contactsController2 = this;
                                                    arrayList3 = arrayList2;
                                                    contentResolver3 = contentResolver2;
                                                    currentTimeMillis = j11;
                                                    sb3 = sb2;
                                                    str4 = str2;
                                                    i13 = 1;
                                                }
                                                hashMap4.put(substring, contact2);
                                                contactsController2 = this;
                                                arrayList3 = arrayList2;
                                                contentResolver3 = contentResolver2;
                                                currentTimeMillis = j11;
                                                sb3 = sb2;
                                                str4 = str2;
                                                i13 = 1;
                                            }
                                        }
                                    }
                                    j11 = currentTimeMillis;
                                    str2 = str4;
                                    contentResolver3 = contentResolver2;
                                    currentTimeMillis = j11;
                                    str4 = str2;
                                    i13 = 1;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } else {
                            hashMap3 = null;
                            i10 = 1;
                        }
                        contentResolver = contentResolver3;
                        arrayList = arrayList3;
                        j10 = currentTimeMillis;
                        str = str4;
                        i11 = 3;
                        try {
                            cursor.close();
                        } catch (Exception unused) {
                        }
                        hashMap2 = hashMap3;
                        i12 = i10;
                        cursor2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        hashMap = null;
                    }
                } else {
                    contentResolver = contentResolver3;
                    arrayList = arrayList3;
                    j10 = currentTimeMillis;
                    str = "+";
                    i11 = 3;
                    cursor2 = cursor;
                    hashMap2 = null;
                    i12 = 1;
                }
                try {
                    String join = TextUtils.join(",", arrayList);
                    ContentResolver contentResolver4 = contentResolver;
                    cursor2 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, projectionNames, "lookup IN (" + join + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            String string6 = cursor2.getString(0);
                            String string7 = cursor2.getString(1);
                            String string8 = cursor2.getString(2);
                            String string9 = cursor2.getString(i11);
                            Contact contact3 = hashMap2 != null ? hashMap2.get(string6) : null;
                            if (contact3 != null && !contact3.namesFilled) {
                                if (contact3.isGoodProvider) {
                                    if (string7 != null) {
                                        contact3.first_name = string7;
                                    } else {
                                        contact3.first_name = "";
                                    }
                                    if (string8 != null) {
                                        contact3.last_name = string8;
                                    } else {
                                        contact3.last_name = "";
                                    }
                                    if (!TextUtils.isEmpty(string9)) {
                                        if (TextUtils.isEmpty(contact3.first_name)) {
                                            contact3.first_name = string9;
                                        } else {
                                            contact3.first_name += " " + string9;
                                        }
                                    }
                                } else {
                                    if (!isNotValidNameString(string7)) {
                                        if (!contact3.first_name.contains(string7) && !string7.contains(contact3.first_name)) {
                                        }
                                        if (string7 == null) {
                                            contact3.first_name = string7;
                                        } else {
                                            contact3.first_name = "";
                                        }
                                        if (!TextUtils.isEmpty(string9)) {
                                            if (TextUtils.isEmpty(contact3.first_name)) {
                                                contact3.first_name = string9;
                                            } else {
                                                contact3.first_name += " " + string9;
                                            }
                                        }
                                        if (string8 == null) {
                                            contact3.last_name = string8;
                                        } else {
                                            contact3.last_name = "";
                                        }
                                    }
                                    if (!isNotValidNameString(string8)) {
                                        if (!contact3.last_name.contains(string8)) {
                                        }
                                        if (string7 == null) {
                                        }
                                        if (!TextUtils.isEmpty(string9)) {
                                        }
                                        if (string8 == null) {
                                        }
                                    }
                                }
                                try {
                                    contact3.namesFilled = true;
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursor2;
                                    hashMap = hashMap2;
                                    FileLog.e(th);
                                    if (hashMap != null) {
                                        hashMap.clear();
                                    }
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                    hashMap2 = hashMap;
                                    if (hashMap2 == null) {
                                    }
                                }
                            }
                        }
                        contactsController = this;
                        try {
                            cursor2.close();
                        } catch (Exception unused2) {
                        }
                        cursor2 = null;
                    } else {
                        contactsController = this;
                    }
                    try {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("loading contacts 1 query time = ");
                        sb5.append(System.currentTimeMillis() - j10);
                        sb5.append(" contactsSize = ");
                        sb5.append(hashMap2 == null ? 0 : hashMap2.size());
                        FileLog.d(sb5.toString());
                        long currentTimeMillis2 = System.currentTimeMillis();
                        HashMap hashMap5 = new HashMap();
                        ArrayList arrayList5 = new ArrayList();
                        Cursor query = contentResolver4.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup", "display_name"}, "has_phone_number = ?", new String[]{"0"}, null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                PhoneBookContact phoneBookContact = new PhoneBookContact();
                                phoneBookContact.id = query.getString(0);
                                phoneBookContact.lookup_key = query.getString(1);
                                phoneBookContact.name = query.getString(2);
                                if (hashMap2 == null || hashMap2.get(phoneBookContact.lookup_key) == null) {
                                    if (!TextUtils.isEmpty(phoneBookContact.name)) {
                                        hashMap5.put(phoneBookContact.id, phoneBookContact);
                                        arrayList5.add(phoneBookContact.id);
                                    }
                                }
                            }
                            query.close();
                        }
                        FileLog.d("loading contacts 2 query time = " + (System.currentTimeMillis() - currentTimeMillis2) + " phoneBookConacts size = " + arrayList5.size());
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (!arrayList5.isEmpty()) {
                            Pattern compile = Pattern.compile(".*(\\+[0-9 \\-]+).*");
                            cursor3 = cursor2;
                            try {
                                cursor2 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3", "data4"}, "contact_id IN (" + TextUtils.join(", ", arrayList5) + ")", null, null);
                                if (cursor2 != null) {
                                    while (cursor2.moveToNext()) {
                                        PhoneBookContact phoneBookContact2 = (PhoneBookContact) hashMap5.get(cursor2.getString(0));
                                        if (phoneBookContact2 != null) {
                                            String[] strArr = {cursor2.getString(1), cursor2.getString(2), cursor2.getString(3), cursor2.getString(4)};
                                            int i15 = 0;
                                            for (int i16 = 4; i15 < i16; i16 = 4) {
                                                String str5 = strArr[i15];
                                                if (str5 != null) {
                                                    Matcher matcher = compile.matcher(str5);
                                                    if (matcher.matches()) {
                                                        phoneBookContact2.phone = matcher.group(1).replace(" ", "").replace("-", "");
                                                    }
                                                    String str6 = phoneBookContact2.phone;
                                                    if (str6 != null) {
                                                        str3 = str;
                                                        if (str6.startsWith(str3)) {
                                                            str6 = phoneBookContact2.phone.substring(1);
                                                        }
                                                        Contact contact4 = new Contact();
                                                        contact4.first_name = phoneBookContact2.name;
                                                        contact4.last_name = "";
                                                        int i17 = i12 + 1;
                                                        contact4.contact_id = i12;
                                                        contact4.key = phoneBookContact2.lookup_key;
                                                        contact4.phones.add(phoneBookContact2.phone);
                                                        contact4.shortPhones.add(str6);
                                                        contact4.phoneDeleted.add(0);
                                                        contact4.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                        if (hashMap2 == null) {
                                                            hashMap2 = new HashMap<>();
                                                        }
                                                        hashMap2.put(phoneBookContact2.lookup_key, contact4);
                                                        i12 = i17;
                                                        str = str3;
                                                    }
                                                }
                                                i15++;
                                                str = str;
                                            }
                                        }
                                        str3 = str;
                                        str = str3;
                                    }
                                    cursor2.close();
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                hashMap = hashMap2;
                                cursor = cursor3;
                                FileLog.e(th);
                                if (hashMap != null) {
                                }
                                if (cursor != null) {
                                }
                                hashMap2 = hashMap;
                                if (hashMap2 == null) {
                                }
                            }
                        }
                        FileLog.d("loading contacts 3 query time = " + (System.currentTimeMillis() - currentTimeMillis3));
                        if (cursor2 != null) {
                            try {
                                cursor2.close();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        cursor3 = cursor2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
                hashMap = null;
            }
        } catch (Throwable th10) {
            th = th10;
            hashMap = null;
            cursor = null;
        }
        return hashMap2 == null ? hashMap2 : new HashMap<>();
    }

    public void reloadContactsStatusesMaybe(boolean z10) {
        try {
            if (MessagesController.getMainSettings(this.currentAccount).getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z10) {
                return;
            }
            reloadContactsStatuses();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new e5(2));
    }

    public void setDeleteAccountTTL(int i10) {
        this.deleteAccountTTL = i10;
    }

    public void setPrivacyRules(ArrayList<TLRPC.PrivacyRule> arrayList, int i10) {
        switch (i10) {
            case 0:
                this.lastseenPrivacyRules = arrayList;
                break;
            case 1:
                this.groupPrivacyRules = arrayList;
                break;
            case 2:
                this.callPrivacyRules = arrayList;
                break;
            case 3:
                this.p2pPrivacyRules = arrayList;
                break;
            case 4:
                this.profilePhotoPrivacyRules = arrayList;
                break;
            case 5:
                this.forwardsPrivacyRules = arrayList;
                break;
            case 6:
                this.phonePrivacyRules = arrayList;
                break;
            case 7:
                this.addedByPhonePrivacyRules = arrayList;
                break;
            case 8:
                this.voiceMessagesRules = arrayList;
                break;
            case 9:
                this.bioPrivacyRules = arrayList;
                break;
            case 11:
                this.birthdayPrivacyRules = arrayList;
                break;
            case 12:
                this.giftsPrivacyRules = arrayList;
                break;
            case 13:
                this.noPaidMessagesPrivacyRules = arrayList;
                break;
            case 14:
                this.musicPrivacyRules = arrayList;
                break;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
        reloadContactsStatuses();
    }

    public void syncPhoneBookByAlert(HashMap<String, Contact> hashMap, boolean z10, boolean z11, boolean z12) {
        Utilities.globalQueue.postRunnable(new m1(this, hashMap, z10, z11, z12));
    }

    private void mergePhonebookAndTelegramContacts(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2, boolean z10) {
        Utilities.globalQueue.postRunnable(new j3.p1(this, z10, new ArrayList(this.contacts), hashMap2, hashMap, arrayList));
    }

    public void addContact(TLRPC.User user, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        if (user == null) {
            return;
        }
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.id = getMessagesController().getInputUser(user);
        tL_contacts_addContact.first_name = user.first_name;
        tL_contacts_addContact.last_name = user.last_name;
        String str = user.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z10;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (tL_textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = tL_textWithEntities;
        }
        getConnectionsManager().sendRequest(tL_contacts_addContact, new t1(2, this, user), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadPrivacySettings(boolean z10) {
        int i10;
        if (this.loadingDeleteInfo == 0) {
            this.loadingDeleteInfo = 1;
            getConnectionsManager().sendRequest(new TL_account.getAccountTTL(), new i1(this, 2));
        }
        loadGlobalPrivacySetting();
        while (true) {
            int[] iArr = this.loadingPrivacyInfo;
            if (i10 >= iArr.length) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            }
            if (z10) {
                i10 = iArr[i10] == 1 ? i10 + 1 : 0;
                iArr[i10] = 1;
                TL_account.getPrivacy getprivacy = new TL_account.getPrivacy();
                switch (i10) {
                    case 0:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 1:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 2:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 3:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 4:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 5:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyForwards();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 6:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 7:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 8:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 9:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAbout();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 11:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyBirthday();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 12:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 13:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                    case 14:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
                        getConnectionsManager().sendRequest(getprivacy, new ia(this, i10, 3));
                        break;
                }
            } else {
                if (iArr[i10] != 0) {
                }
                iArr[i10] = 1;
                TL_account.getPrivacy getprivacy2 = new TL_account.getPrivacy();
                switch (i10) {
                }
            }
        }
    }

    public static String formatName(TLRPC.User user) {
        if (user == null) {
            return "";
        }
        return formatName(user.first_name, user.last_name, 0);
    }

    public static String formatName(String str, String str2) {
        return formatName(str, str2, 0);
    }

    public static String formatName(String str, String str2, int i10) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i10 > 0 && str.contains(" ")) {
            int indexOf = str.indexOf(" ");
            String substring = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
            str2 = substring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb2 = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (LocaleController.nameDisplayOrder == 1) {
            if (str != null && str.length() > 0) {
                if (i10 > 0 && str.length() > i10 + 2) {
                    return str.substring(0, i10) + "…";
                }
                sb2.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb2.append(" ");
                    if (i10 > 0) {
                        if (str2.length() + sb2.length() > i10) {
                            sb2.append(str2.charAt(0));
                        }
                    }
                    sb2.append(str2);
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i10 > 0 && str2.length() > i10 + 2) {
                    return str2.substring(0, i10) + "…";
                }
                sb2.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i10 > 0 && str2.length() > i10 + 2) {
                return str2.substring(0, i10) + "…";
            }
            sb2.append(str2);
            if (str != null && str.length() > 0) {
                sb2.append(" ");
                if (i10 > 0) {
                    if (str.length() + sb2.length() > i10) {
                        sb2.append(str.charAt(0));
                    }
                }
                sb2.append(str);
            }
        } else if (str != null && str.length() > 0) {
            if (i10 > 0 && str.length() > i10 + 2) {
                return str.substring(0, i10) + "…";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resetImportedContacts$10(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
