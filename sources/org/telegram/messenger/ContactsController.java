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
import androidx.collection.LongSparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;

/* loaded from: classes3.dex */
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

    public static /* synthetic */ void $r8$lambda$3kLSExHkbpEOZRcpxnKH3hiSKQ8(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable;

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        public static /* synthetic */ void $r8$lambda$V7bWM39F88C-9C-h7Xl0TeFehTo() {
            for (int i = 0; i < 4; i++) {
                if (UserConfig.getInstance(i).isClientActivated()) {
                    ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                    ContactsController.getInstance(i).checkContacts();
                }
            }
        }

        public MyContentObserver() {
            super(null);
            this.checkRunnable = new Runnable() { // from class: org.telegram.messenger.ContactsController$MyContentObserver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.MyContentObserver.$r8$lambda$V7bWM39F88C-9C-h7Xl0TeFehTo();
                }
            };
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            synchronized (ContactsController.this.observerLock) {
                try {
                    if (ContactsController.this.ignoreChanges) {
                        return;
                    }
                    Utilities.globalQueue.cancelRunnable(this.checkRunnable);
                    Utilities.globalQueue.postRunnable(this.checkRunnable, 500L);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Collator getLocaleCollator() {
        if (cachedCollator == null || cachedCollatorLocale != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                cachedCollatorLocale = locale;
                Collator collator = Collator.getInstance(locale);
                cachedCollator = collator;
                collator.setStrength(1);
            } catch (Exception e) {
                FileLog.e((Throwable) e, true);
            }
        }
        if (cachedCollator == null) {
            try {
                Collator collator2 = Collator.getInstance();
                cachedCollator = collator2;
                collator2.setStrength(1);
            } catch (Exception e2) {
                FileLog.e((Throwable) e2, true);
            }
        }
        if (cachedCollator == null) {
            cachedCollator = new Collator() { // from class: org.telegram.messenger.ContactsController.1
                @Override // java.text.Collator
                public CollationKey getCollationKey(String str) {
                    return null;
                }

                @Override // java.text.Collator
                public int hashCode() {
                    return 0;
                }

                @Override // java.text.Collator
                public int compare(String str, String str2) {
                    if (str == null || str2 == null) {
                        return 0;
                    }
                    return str.compareTo(str2);
                }
            };
        }
        return cachedCollator;
    }

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
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1);
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1);
            }
            return "#";
        }
    }

    public static ContactsController getInstance(int i) {
        ContactsController contactsController;
        ContactsController contactsController2 = Instance[i];
        if (contactsController2 != null) {
            return contactsController2;
        }
        synchronized (ContactsController.class) {
            try {
                contactsController = Instance[i];
                if (contactsController == null) {
                    ContactsController[] contactsControllerArr = Instance;
                    ContactsController contactsController3 = new ContactsController(i);
                    contactsControllerArr[i] = contactsController3;
                    contactsController = contactsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return contactsController;
    }

    public ContactsController(int i) {
        super(i);
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
        if (i == 0) {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda54
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$8jMKxJf3mScD6YkmPu1qP_3-Cl0(ContactsController.this);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$8jMKxJf3mScD6YkmPu1qP_3-Cl0(ContactsController contactsController) {
        contactsController.getClass();
        try {
            if (hasContactsPermission()) {
                ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, contactsController.new MyContentObserver());
            }
        } catch (Throwable unused) {
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
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$RvD7m1Lqbu3pJ52kag06cGx0DCk(ContactsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$RvD7m1Lqbu3pJ52kag06cGx0DCk(ContactsController contactsController) {
        contactsController.migratingContacts = false;
        contactsController.completedRequestsCount = 0;
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i = mainSettings.getInt("invitelinktime", 0);
        if (this.updatingInviteLink) {
            return;
        }
        if (this.inviteLink == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
            this.updatingInviteLink = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda16
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.$r8$lambda$6gFBbEOG-WiS1BEcHnDTkEJg27c(ContactsController.this, tLObject, tL_error);
                }
            }, 2);
        }
    }

    public static /* synthetic */ void $r8$lambda$6gFBbEOG-WiS1BEcHnDTkEJg27c(final ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        contactsController.getClass();
        if (tLObject != null) {
            final TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
            if (tL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda24
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.$r8$lambda$gbGE8kSGuYLcNij1hZe27h2m5no(ContactsController.this, tL_help_inviteText);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$gbGE8kSGuYLcNij1hZe27h2m5no(ContactsController contactsController, TLRPC.TL_help_inviteText tL_help_inviteText) {
        contactsController.updatingInviteLink = false;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(contactsController.currentAccount).edit();
        String str = tL_help_inviteText.message;
        contactsController.inviteLink = str;
        edit.putString("invitelink", str);
        edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public String getInviteText(int i) {
        String str = this.inviteLink;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i <= 1) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
        try {
            return String.format(LocaleController.getPluralString("InviteTextNum", i), Integer.valueOf(i), str);
        } catch (Exception unused) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
    }

    public void checkAppAccount() {
        this.systemAccount = null;
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$0WhfGDS_FWEVRisgKfPDCwquNkg(ContactsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0WhfGDS_FWEVRisgKfPDCwquNkg(ContactsController contactsController) {
        contactsController.getClass();
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.id)) {
                                if (i2 == contactsController.currentAccount) {
                                    contactsController.systemAccount = account;
                                }
                            }
                        }
                        i2++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        if (contactsController.getUserConfig().isClientActivated()) {
            contactsController.readContacts();
            if (contactsController.systemAccount == null) {
                try {
                    Account account2 = new Account("" + contactsController.getUserConfig().getClientUserId(), BuildConfig.LIBRARY_PACKAGE_NAME);
                    contactsController.systemAccount = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused3) {
                }
            }
        }
    }

    public void deleteUnknownAppAccounts() {
        try {
            this.systemAccount = null;
            AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.id)) {
                                break;
                            }
                        }
                        i2++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkContacts() {
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$JD0QTcTwrePLuZBLBqJTsA_UUlE(ContactsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$JD0QTcTwrePLuZBLBqJTsA_UUlE(ContactsController contactsController) {
        if (contactsController.checkContactsInternal()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected contacts change");
            }
            contactsController.performSyncPhoneBook(contactsController.getContactsCopy(contactsController.contactsBook), true, false, true, false, true, false);
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$-R8puVEywPY-PkoEGanSWoebVLU(ContactsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$-R8puVEywPY-PkoEGanSWoebVLU(ContactsController contactsController) {
        contactsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        contactsController.performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    public void syncPhoneBookByAlert(final HashMap<String, Contact> hashMap, final boolean z, final boolean z2, final boolean z3) {
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$Jt_CbNVdKSONOojBLeQwKn72WRE(ContactsController.this, hashMap, z, z2, z3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Jt_CbNVdKSONOojBLeQwKn72WRE(ContactsController contactsController, HashMap hashMap, boolean z, boolean z2, boolean z3) {
        contactsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        contactsController.performSyncPhoneBook(hashMap, true, z, z2, false, false, z3);
    }

    public void deleteAllContacts(final Runnable runnable) {
        resetImportedContacts();
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            tL_contacts_deleteContacts.id.add(getMessagesController().getInputUser(this.contacts.get(i).user_id));
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.$r8$lambda$UfrECPt0A9K3H_GC3VoIJ624X0s(ContactsController.this, runnable, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$UfrECPt0A9K3H_GC3VoIJ624X0s(final ContactsController contactsController, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            contactsController.getClass();
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        contactsController.contactsBookSPhones.clear();
        contactsController.contactsBook.clear();
        contactsController.completedRequestsCount = 0;
        contactsController.migratingContacts = false;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsLoaded = false;
        contactsController.loadingContacts = false;
        contactsController.contactsBookLoaded = false;
        contactsController.lastContactsVersions = "";
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$o0_Qsu1nB13fJl_DmqNK-BeCBxk(ContactsController.this, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$o0_Qsu1nB13fJl_DmqNK-BeCBxk(ContactsController contactsController, Runnable runnable) {
        contactsController.getClass();
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            contactsController.systemAccount = null;
            for (Account account : accountsByType) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.id)) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + contactsController.getUserConfig().getClientUserId(), BuildConfig.LIBRARY_PACKAGE_NAME);
            contactsController.systemAccount = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(new HashMap<>(), false, true);
        contactsController.getMessagesStorage().putContacts(new ArrayList<>(), true);
        contactsController.phoneBookContacts.clear();
        contactsController.contacts.clear();
        contactsController.contactsDict.clear();
        contactsController.usersSectionsDict.clear();
        contactsController.usersMutualSectionsDict.clear();
        contactsController.sortedUsersSectionsArray.clear();
        contactsController.phoneBookSectionsDict.clear();
        contactsController.phoneBookSectionsArray.clear();
        contactsController.phoneBookByShortPhones.clear();
        contactsController.delayedContactsUpdate.clear();
        contactsController.sortedUsersMutualSectionsArray.clear();
        contactsController.contactsByPhone.clear();
        contactsController.contactsByShortPhone.clear();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        contactsController.loadContacts(false, 0L);
        runnable.run();
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda46
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.$r8$lambda$3kLSExHkbpEOZRcpxnKH3hiSKQ8(tLObject, tL_error);
            }
        });
    }

    private boolean checkContactsInternal() {
        Throwable th;
        boolean z;
        boolean z2 = false;
        try {
            if (!hasContactsPermission()) {
                return false;
            }
            try {
                Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
                if (query != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (query.moveToNext()) {
                            sb.append(query.getString(query.getColumnIndex("version")));
                        }
                        String sb2 = sb.toString();
                        if (this.lastContactsVersions.length() != 0) {
                            if (!this.lastContactsVersions.equals(sb2)) {
                                z2 = true;
                            }
                        }
                        try {
                            this.lastContactsVersions = sb2;
                        } catch (Throwable th2) {
                            z = z2;
                            th = th2;
                            try {
                                try {
                                    query.close();
                                    throw th;
                                } catch (Exception e) {
                                    e = e;
                                    z2 = z;
                                    FileLog.e(e);
                                    return z2;
                                }
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                }
                if (query == null) {
                    return z2;
                }
                query.close();
                return z2;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            try {
                if (this.loadingContacts) {
                    return;
                }
                this.loadingContacts = true;
                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda61
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.$r8$lambda$Inbq6QrnoSr1-5gdr4U5iOQXoYk(ContactsController.this);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$Inbq6QrnoSr1-5gdr4U5iOQXoYk(ContactsController contactsController) {
        if (!contactsController.contacts.isEmpty() || contactsController.contactsLoaded) {
            synchronized (contactsController.loadContactsSync) {
                contactsController.loadingContacts = false;
            }
            return;
        }
        contactsController.loadContacts(true, 0L);
    }

    private boolean isNotValidNameString(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            }
        }
        return i > 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02f3, code lost:
    
        if (r6.contains(r5.last_name) != false) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f7 A[Catch: all -> 0x02dd, TryCatch #13 {all -> 0x02dd, blocks: (B:54:0x032a, B:60:0x02c6, B:62:0x02cc, B:64:0x02d4, B:68:0x02f7, B:69:0x02fc, B:71:0x0302, B:73:0x030a, B:74:0x0321, B:76:0x0325, B:77:0x0328, B:78:0x02fa, B:79:0x02df, B:81:0x02e5, B:83:0x02ed, B:118:0x0334, B:120:0x033b, B:123:0x035b, B:125:0x0396, B:127:0x039c, B:129:0x03b6, B:132:0x03be, B:135:0x03c7, B:144:0x03d6, B:145:0x03de, B:147:0x040e, B:197:0x0357), top: B:59:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0302 A[Catch: all -> 0x02dd, TryCatch #13 {all -> 0x02dd, blocks: (B:54:0x032a, B:60:0x02c6, B:62:0x02cc, B:64:0x02d4, B:68:0x02f7, B:69:0x02fc, B:71:0x0302, B:73:0x030a, B:74:0x0321, B:76:0x0325, B:77:0x0328, B:78:0x02fa, B:79:0x02df, B:81:0x02e5, B:83:0x02ed, B:118:0x0334, B:120:0x033b, B:123:0x035b, B:125:0x0396, B:127:0x039c, B:129:0x03b6, B:132:0x03be, B:135:0x03c7, B:144:0x03d6, B:145:0x03de, B:147:0x040e, B:197:0x0357), top: B:59:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0325 A[Catch: all -> 0x02dd, TryCatch #13 {all -> 0x02dd, blocks: (B:54:0x032a, B:60:0x02c6, B:62:0x02cc, B:64:0x02d4, B:68:0x02f7, B:69:0x02fc, B:71:0x0302, B:73:0x030a, B:74:0x0321, B:76:0x0325, B:77:0x0328, B:78:0x02fa, B:79:0x02df, B:81:0x02e5, B:83:0x02ed, B:118:0x0334, B:120:0x033b, B:123:0x035b, B:125:0x0396, B:127:0x039c, B:129:0x03b6, B:132:0x03be, B:135:0x03c7, B:144:0x03d6, B:145:0x03de, B:147:0x040e, B:197:0x0357), top: B:59:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0328 A[Catch: all -> 0x02dd, TryCatch #13 {all -> 0x02dd, blocks: (B:54:0x032a, B:60:0x02c6, B:62:0x02cc, B:64:0x02d4, B:68:0x02f7, B:69:0x02fc, B:71:0x0302, B:73:0x030a, B:74:0x0321, B:76:0x0325, B:77:0x0328, B:78:0x02fa, B:79:0x02df, B:81:0x02e5, B:83:0x02ed, B:118:0x0334, B:120:0x033b, B:123:0x035b, B:125:0x0396, B:127:0x039c, B:129:0x03b6, B:132:0x03be, B:135:0x03c7, B:144:0x03d6, B:145:0x03de, B:147:0x040e, B:197:0x0357), top: B:59:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fa A[Catch: all -> 0x02dd, TryCatch #13 {all -> 0x02dd, blocks: (B:54:0x032a, B:60:0x02c6, B:62:0x02cc, B:64:0x02d4, B:68:0x02f7, B:69:0x02fc, B:71:0x0302, B:73:0x030a, B:74:0x0321, B:76:0x0325, B:77:0x0328, B:78:0x02fa, B:79:0x02df, B:81:0x02e5, B:83:0x02ed, B:118:0x0334, B:120:0x033b, B:123:0x035b, B:125:0x0396, B:127:0x039c, B:129:0x03b6, B:132:0x03be, B:135:0x03c7, B:144:0x03d6, B:145:0x03de, B:147:0x040e, B:197:0x0357), top: B:59:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0554 A[Catch: all -> 0x0558, TRY_LEAVE, TryCatch #10 {all -> 0x0558, blocks: (B:90:0x054f, B:92:0x0554), top: B:89:0x054f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x055d A[Catch: Exception -> 0x053f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x053f, blocks: (B:95:0x055d, B:191:0x053b), top: B:10:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0567  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashMap<String, Contact> readContactsFromPhoneBook() {
        HashMap<String, Contact> hashMap;
        Cursor cursor;
        Cursor cursor2;
        int i;
        ContentResolver contentResolver;
        long j;
        String str;
        Cursor cursor3;
        ContentResolver contentResolver2;
        long j2;
        StringBuilder sb;
        String str2;
        ContactsController contactsController;
        ArrayList arrayList;
        String str3;
        ContactsController contactsController2 = this;
        if (!contactsController2.getUserConfig().syncContacts) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts sync disabled");
            }
            return new HashMap<>();
        }
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!hasContactsPermission()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app has no contacts permissions");
            }
            return new HashMap<>();
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Cursor query = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, projectionPhones, null, null, null);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str4 = "+";
                ?? r9 = 1;
                if (query != 0) {
                    try {
                        int count = query.getCount();
                        if (count > 0) {
                            hashMap = new HashMap<>(count);
                            i = 1;
                            while (query.moveToNext()) {
                                try {
                                    String string = query.getString(r9);
                                    String string2 = query.getString(5);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    boolean z = string2.indexOf(".sim") != 0;
                                    if (!TextUtils.isEmpty(string)) {
                                        String stripExceptNumbers = PhoneFormat.stripExceptNumbers(string, r9);
                                        if (!TextUtils.isEmpty(stripExceptNumbers)) {
                                            String substring = stripExceptNumbers.startsWith(str4) ? stripExceptNumbers.substring(r9) : stripExceptNumbers;
                                            contentResolver2 = contentResolver3;
                                            j2 = currentTimeMillis;
                                            String string3 = query.getString(0);
                                            sb2.setLength(0);
                                            DatabaseUtils.appendEscapedSQLString(sb2, string3);
                                            String sb3 = sb2.toString();
                                            Contact contact = (Contact) hashMap2.get(substring);
                                            if (contact != null) {
                                                if (!contact.isGoodProvider && !string2.equals(contact.provider)) {
                                                    sb2.setLength(0);
                                                    DatabaseUtils.appendEscapedSQLString(sb2, contact.key);
                                                    arrayList2.remove(sb2.toString());
                                                    arrayList2.add(sb3);
                                                    contact.key = string3;
                                                    contact.isGoodProvider = z;
                                                    contact.provider = string2;
                                                }
                                                contentResolver3 = contentResolver2;
                                                currentTimeMillis = j2;
                                                r9 = 1;
                                            } else {
                                                if (!arrayList2.contains(sb3)) {
                                                    arrayList2.add(sb3);
                                                }
                                                int i2 = query.getInt(2);
                                                Contact contact2 = hashMap.get(string3);
                                                if (contact2 == null) {
                                                    contact2 = new Contact();
                                                    sb = sb2;
                                                    String string4 = query.getString(4);
                                                    String trim = string4 == null ? "" : string4.trim();
                                                    if (contactsController2.isNotValidNameString(trim)) {
                                                        contact2.first_name = trim;
                                                        contact2.last_name = "";
                                                        str2 = str4;
                                                    } else {
                                                        str2 = str4;
                                                        int lastIndexOf = trim.lastIndexOf(32);
                                                        if (lastIndexOf != -1) {
                                                            contact2.first_name = trim.substring(0, lastIndexOf).trim();
                                                            contact2.last_name = trim.substring(lastIndexOf + 1).trim();
                                                        } else {
                                                            contact2.first_name = trim;
                                                            contact2.last_name = "";
                                                        }
                                                    }
                                                    contact2.provider = string2;
                                                    contact2.isGoodProvider = z;
                                                    contact2.key = string3;
                                                    contact2.contact_id = i;
                                                    hashMap.put(string3, contact2);
                                                    i++;
                                                } else {
                                                    sb = sb2;
                                                    str2 = str4;
                                                }
                                                contact2.shortPhones.add(substring);
                                                contact2.phones.add(stripExceptNumbers);
                                                contact2.phoneDeleted.add(0);
                                                if (i2 == 0) {
                                                    String string5 = query.getString(3);
                                                    ArrayList<String> arrayList3 = contact2.phoneTypes;
                                                    if (string5 == null) {
                                                        string5 = LocaleController.getString(R.string.PhoneMobile);
                                                    }
                                                    arrayList3.add(string5);
                                                } else if (i2 == 1) {
                                                    contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneHome));
                                                } else {
                                                    if (i2 == 2) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMobile));
                                                    } else if (i2 == 3) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneWork));
                                                    } else if (i2 == 12) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMain));
                                                    } else {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                    }
                                                    hashMap2.put(substring, contact2);
                                                    contactsController2 = this;
                                                    contentResolver3 = contentResolver2;
                                                    currentTimeMillis = j2;
                                                    sb2 = sb;
                                                    str4 = str2;
                                                    r9 = 1;
                                                }
                                                hashMap2.put(substring, contact2);
                                                contactsController2 = this;
                                                contentResolver3 = contentResolver2;
                                                currentTimeMillis = j2;
                                                sb2 = sb;
                                                str4 = str2;
                                                r9 = 1;
                                            }
                                        }
                                    }
                                    contentResolver2 = contentResolver3;
                                    j2 = currentTimeMillis;
                                    contentResolver3 = contentResolver2;
                                    currentTimeMillis = j2;
                                    r9 = 1;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = query;
                                    try {
                                        FileLog.e(th);
                                        if (hashMap != null) {
                                        }
                                        if (cursor2 != null) {
                                        }
                                        if (hashMap == null) {
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            i = 1;
                            hashMap = null;
                        }
                        contentResolver = contentResolver3;
                        j = currentTimeMillis;
                        str = str4;
                    } catch (Throwable th2) {
                        th = th2;
                        hashMap = null;
                    }
                    try {
                        query.close();
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        cursor2 = cursor;
                        FileLog.e(th);
                        if (hashMap != null) {
                        }
                        if (cursor2 != null) {
                        }
                        if (hashMap == null) {
                        }
                    }
                    cursor3 = null;
                } else {
                    contentResolver = contentResolver3;
                    j = currentTimeMillis;
                    str = "+";
                    cursor3 = query;
                    i = 1;
                    hashMap = null;
                }
                try {
                    String join = TextUtils.join(",", arrayList2);
                    ContentResolver contentResolver4 = contentResolver;
                    cursor3 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, projectionNames, "lookup IN (" + join + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                    if (cursor3 != null) {
                        while (cursor3.moveToNext()) {
                            String string6 = cursor3.getString(0);
                            String string7 = cursor3.getString(1);
                            String string8 = cursor3.getString(2);
                            String string9 = cursor3.getString(3);
                            Contact contact3 = hashMap != null ? hashMap.get(string6) : null;
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
                                        if (!TextUtils.isEmpty(contact3.first_name)) {
                                            contact3.first_name += " " + string9;
                                        } else {
                                            contact3.first_name = string9;
                                        }
                                    }
                                } else {
                                    try {
                                        if (!isNotValidNameString(string7)) {
                                            if (!contact3.first_name.contains(string7) && !string7.contains(contact3.first_name)) {
                                            }
                                            if (string7 == null) {
                                                contact3.first_name = string7;
                                            } else {
                                                contact3.first_name = "";
                                            }
                                            if (!TextUtils.isEmpty(string9)) {
                                                if (!TextUtils.isEmpty(contact3.first_name)) {
                                                    contact3.first_name += " " + string9;
                                                } else {
                                                    contact3.first_name = string9;
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
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor = cursor3;
                                        cursor2 = cursor;
                                        FileLog.e(th);
                                        if (hashMap != null) {
                                        }
                                        if (cursor2 != null) {
                                        }
                                        if (hashMap == null) {
                                        }
                                    }
                                }
                                contact3.namesFilled = true;
                            }
                        }
                        contactsController = this;
                        try {
                            cursor3.close();
                        } catch (Exception unused2) {
                        }
                        cursor3 = null;
                    } else {
                        contactsController = this;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("loading contacts 1 query time = ");
                    sb4.append(System.currentTimeMillis() - j);
                    sb4.append(" contactsSize = ");
                    sb4.append(hashMap == null ? 0 : hashMap.size());
                    FileLog.d(sb4.toString());
                    long currentTimeMillis2 = System.currentTimeMillis();
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    Cursor query2 = contentResolver4.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup", "display_name"}, "has_phone_number = ?", new String[]{"0"}, null);
                    if (query2 != null) {
                        while (query2.moveToNext()) {
                            PhoneBookContact phoneBookContact = new PhoneBookContact();
                            phoneBookContact.id = query2.getString(0);
                            phoneBookContact.lookup_key = query2.getString(1);
                            phoneBookContact.name = query2.getString(2);
                            if (hashMap == null || hashMap.get(phoneBookContact.lookup_key) == null) {
                                if (!TextUtils.isEmpty(phoneBookContact.name)) {
                                    hashMap3.put(phoneBookContact.id, phoneBookContact);
                                    ArrayList arrayList5 = arrayList4;
                                    arrayList5.add(phoneBookContact.id);
                                    arrayList4 = arrayList5;
                                }
                            }
                        }
                        arrayList = arrayList4;
                        query2.close();
                    } else {
                        arrayList = arrayList4;
                    }
                    FileLog.d("loading contacts 2 query time = " + (System.currentTimeMillis() - currentTimeMillis2) + " phoneBookConacts size = " + arrayList.size());
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (arrayList.isEmpty()) {
                        cursor = cursor3;
                    } else {
                        Pattern compile = Pattern.compile(".*(\\+[0-9 \\-]+).*");
                        Cursor query3 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3", "data4"}, "contact_id IN (" + TextUtils.join(", ", arrayList) + ")", null, null);
                        if (query3 != null) {
                            int i3 = i;
                            HashMap<String, Contact> hashMap4 = hashMap;
                            while (query3.moveToNext()) {
                                try {
                                    PhoneBookContact phoneBookContact2 = (PhoneBookContact) hashMap3.get(query3.getString(0));
                                    if (phoneBookContact2 != null) {
                                        String[] strArr = {query3.getString(1), query3.getString(2), query3.getString(3), query3.getString(4)};
                                        int i4 = 0;
                                        while (i4 < 4) {
                                            String str5 = strArr[i4];
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
                                                    int i5 = i3 + 1;
                                                    contact4.contact_id = i3;
                                                    contact4.key = phoneBookContact2.lookup_key;
                                                    contact4.phones.add(phoneBookContact2.phone);
                                                    contact4.shortPhones.add(str6);
                                                    contact4.phoneDeleted.add(0);
                                                    contact4.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                    if (hashMap4 == null) {
                                                        hashMap4 = new HashMap<>();
                                                    }
                                                    hashMap4.put(phoneBookContact2.lookup_key, contact4);
                                                    i3 = i5;
                                                    str = str3;
                                                }
                                            }
                                            i4++;
                                            str = str;
                                        }
                                    }
                                    str3 = str;
                                    str = str3;
                                } catch (Throwable th5) {
                                    th = th5;
                                    hashMap = hashMap4;
                                    cursor = query3;
                                    cursor2 = cursor;
                                    FileLog.e(th);
                                    if (hashMap != null) {
                                    }
                                    if (cursor2 != null) {
                                    }
                                    if (hashMap == null) {
                                    }
                                }
                            }
                            query3.close();
                            hashMap = hashMap4;
                        }
                        cursor = query3;
                    }
                    try {
                        FileLog.d("loading contacts 3 query time = " + (System.currentTimeMillis() - currentTimeMillis3));
                    } catch (Throwable th6) {
                        th = th6;
                        cursor2 = cursor;
                        FileLog.e(th);
                        if (hashMap != null) {
                            hashMap.clear();
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (hashMap == null) {
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                cursor = query;
                hashMap = null;
            }
        } catch (Throwable th9) {
            th = th9;
            cursor = null;
            hashMap = null;
        }
        if (cursor != null) {
            cursor.close();
        }
        return hashMap == null ? hashMap : new HashMap<>();
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

    protected void migratePhoneBookToV7(final SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$1J6pwQFtklDiCvnjpl68cf-AJqk(ContactsController.this, sparseArray);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$1J6pwQFtklDiCvnjpl68cf-AJqk(ContactsController contactsController, SparseArray sparseArray) {
        if (contactsController.migratingContacts) {
            return;
        }
        contactsController.migratingContacts = true;
        HashMap<String, Contact> hashMap = new HashMap<>();
        HashMap<String, Contact> readContactsFromPhoneBook = contactsController.readContactsFromPhoneBook();
        HashMap hashMap2 = new HashMap();
        Iterator<Map.Entry<String, Contact>> it = readContactsFromPhoneBook.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Contact value = it.next().getValue();
            for (int i = 0; i < value.shortPhones.size(); i++) {
                hashMap2.put(value.shortPhones.get(i), value.key);
            }
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            Contact contact = (Contact) sparseArray.valueAt(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= contact.shortPhones.size()) {
                    break;
                }
                String str = (String) hashMap2.get(contact.shortPhones.get(i3));
                if (str != null) {
                    contact.key = str;
                    hashMap.put(str, contact);
                    break;
                }
                i3++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(hashMap, true, false);
    }

    protected void performSyncPhoneBook(final HashMap<String, Contact> hashMap, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        if (z2 || this.contactsBookLoaded) {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$gBU6U9H7n0TqD5DiIXYquK955pc(ContactsController.this, hashMap, z3, z, z2, z4, z5, z6);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        if (r7.intValue() == 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0151, code lost:
    
        if (r6.last_name.equals(r13.last_name) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013c, code lost:
    
        if (r6.first_name.equals(r13.first_name) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$gBU6U9H7n0TqD5DiIXYquK955pc(final ContactsController contactsController, final HashMap hashMap, final boolean z, boolean z2, final boolean z3, boolean z4, boolean z5, boolean z6) {
        ArrayList arrayList;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        int i;
        int i2;
        HashMap hashMap5;
        final int i3;
        Contact contact;
        HashMap hashMap6;
        int i4;
        HashMap<String, Contact> hashMap7;
        HashMap hashMap8;
        Iterator<Map.Entry<String, Contact>> it;
        HashMap hashMap9;
        int i5;
        int indexOf;
        int i6;
        HashMap<String, Contact> hashMap10;
        int i7;
        HashMap hashMap11;
        int i8;
        boolean z7;
        int i9;
        int i10 = 0;
        contactsController.getClass();
        HashMap hashMap12 = new HashMap();
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Contact contact2 = (Contact) ((Map.Entry) it2.next()).getValue();
            for (int i11 = 0; i11 < contact2.shortPhones.size(); i11++) {
                hashMap12.put(contact2.shortPhones.get(i11), contact2);
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start read contacts from phone");
        }
        if (!z) {
            contactsController.checkContactsInternal();
        }
        HashMap<String, Contact> readContactsFromPhoneBook = contactsController.readContactsFromPhoneBook();
        HashMap hashMap13 = new HashMap();
        HashMap hashMap14 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, Contact>> it3 = readContactsFromPhoneBook.entrySet().iterator();
        while (it3.hasNext()) {
            Contact value = it3.next().getValue();
            int size = value.shortPhones.size();
            for (int i12 = 0; i12 < size; i12++) {
                hashMap14.put(value.shortPhones.get(i12).substring(Math.max(0, r12.length() - 7)), value);
            }
            String letter = value.getLetter();
            ArrayList arrayList3 = (ArrayList) hashMap13.get(letter);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                hashMap13.put(letter, arrayList3);
                arrayList2.add(letter);
            }
            arrayList3.add(value);
        }
        HashMap hashMap15 = new HashMap();
        int size2 = hashMap.size();
        ArrayList arrayList4 = new ArrayList();
        if (hashMap.isEmpty()) {
            arrayList = arrayList2;
            hashMap2 = hashMap14;
            hashMap3 = hashMap13;
            if (z2) {
                int i13 = 0;
                for (Map.Entry<String, Contact> entry : readContactsFromPhoneBook.entrySet()) {
                    Contact value2 = entry.getValue();
                    entry.getKey();
                    int i14 = 0;
                    while (i14 < value2.phones.size()) {
                        if (!z4) {
                            String str = value2.shortPhones.get(i14);
                            String substring = str.substring(Math.max(0, str.length() - 7));
                            TLRPC.TL_contact tL_contact = contactsController.contactsByPhone.get(str);
                            if (tL_contact != null) {
                                TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
                                if (user != null) {
                                    i13++;
                                    String str2 = user.first_name;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    String str3 = user.last_name;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if ((str2.equals(value2.first_name) && str3.equals(value2.last_name)) || (TextUtils.isEmpty(value2.first_name) && TextUtils.isEmpty(value2.last_name))) {
                                        hashMap5 = hashMap15;
                                        i14++;
                                        hashMap15 = hashMap5;
                                    }
                                }
                            } else if (contactsController.contactsByShortPhone.containsKey(substring)) {
                                i13++;
                            }
                        }
                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
                        hashMap5 = hashMap15;
                        tL_inputPhoneContact.client_id = (i14 << 32) | value2.contact_id;
                        tL_inputPhoneContact.first_name = value2.first_name;
                        tL_inputPhoneContact.last_name = value2.last_name;
                        tL_inputPhoneContact.phone = value2.phones.get(i14);
                        arrayList4.add(tL_inputPhoneContact);
                        i14++;
                        hashMap15 = hashMap5;
                    }
                }
                hashMap4 = hashMap15;
                i = i13;
            } else {
                hashMap4 = hashMap15;
                i = 0;
            }
            i2 = 0;
        } else {
            Iterator<Map.Entry<String, Contact>> it4 = readContactsFromPhoneBook.entrySet().iterator();
            i2 = 0;
            int i15 = 0;
            while (it4.hasNext()) {
                Map.Entry<String, Contact> next = it4.next();
                String key = next.getKey();
                Contact value3 = next.getValue();
                Contact contact3 = (Contact) hashMap.get(key);
                ArrayList arrayList5 = arrayList2;
                if (contact3 == null) {
                    while (i10 < value3.shortPhones.size()) {
                        contact = (Contact) hashMap12.get(value3.shortPhones.get(i10));
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
                        hashMap6 = hashMap12;
                    } else {
                        hashMap6 = hashMap12;
                    }
                    if (!TextUtils.isEmpty(value3.last_name)) {
                    }
                } else {
                    hashMap6 = hashMap12;
                }
                boolean z8 = false;
                if (contact == null || z8) {
                    i4 = size2;
                    hashMap7 = readContactsFromPhoneBook;
                    hashMap8 = hashMap14;
                    it = it4;
                    hashMap9 = hashMap13;
                    for (int i16 = 0; i16 < value3.phones.size(); i16++) {
                        String str4 = value3.shortPhones.get(i16);
                        str4.substring(Math.max(0, str4.length() - 7));
                        hashMap15.put(str4, value3);
                        if (contact != null && (indexOf = contact.shortPhones.indexOf(str4)) != -1) {
                            Integer num = contact.phoneDeleted.get(indexOf);
                            value3.phoneDeleted.set(i16, num);
                            i5 = 1;
                        }
                        i5 = 1;
                        if (z2) {
                            if (!z8) {
                                if (contactsController.contactsByPhone.containsKey(str4)) {
                                    i15++;
                                } else {
                                    i2 += i5;
                                }
                            }
                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact2 = new TLRPC.TL_inputPhoneContact();
                            tL_inputPhoneContact2.client_id = value3.contact_id | (i16 << 32);
                            tL_inputPhoneContact2.first_name = value3.first_name;
                            tL_inputPhoneContact2.last_name = value3.last_name;
                            tL_inputPhoneContact2.phone = value3.phones.get(i16);
                            arrayList4.add(tL_inputPhoneContact2);
                        }
                    }
                    if (contact != null) {
                        hashMap.remove(key);
                    }
                } else {
                    int i17 = 0;
                    while (i17 < value3.phones.size()) {
                        String str5 = value3.shortPhones.get(i17);
                        HashMap hashMap16 = hashMap14;
                        Iterator<Map.Entry<String, Contact>> it5 = it4;
                        String substring2 = str5.substring(Math.max(0, str5.length() - 7));
                        hashMap15.put(str5, value3);
                        int indexOf2 = contact.shortPhones.indexOf(str5);
                        if (z2) {
                            i7 = indexOf2;
                            TLRPC.TL_contact tL_contact2 = contactsController.contactsByPhone.get(str5);
                            if (tL_contact2 != null) {
                                hashMap11 = hashMap13;
                                i6 = size2;
                                hashMap10 = readContactsFromPhoneBook;
                                TLRPC.User user2 = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
                                if (user2 != null) {
                                    i15++;
                                    if (TextUtils.isEmpty(user2.first_name) && TextUtils.isEmpty(user2.last_name) && (!TextUtils.isEmpty(value3.first_name) || !TextUtils.isEmpty(value3.last_name))) {
                                        z7 = true;
                                        i9 = -1;
                                        i8 = -1;
                                        if (i8 == i9) {
                                            value3.phoneDeleted.set(i17, contact.phoneDeleted.get(i8));
                                            contact.phones.remove(i8);
                                            contact.shortPhones.remove(i8);
                                            contact.phoneDeleted.remove(i8);
                                            contact.phoneTypes.remove(i8);
                                        } else if (z2) {
                                            if (!z7) {
                                                TLRPC.TL_contact tL_contact3 = contactsController.contactsByPhone.get(str5);
                                                if (tL_contact3 != null) {
                                                    TLRPC.User user3 = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact3.user_id));
                                                    if (user3 != null) {
                                                        i15++;
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
                                                        i2++;
                                                    }
                                                } else if (contactsController.contactsByShortPhone.containsKey(substring2)) {
                                                    i15++;
                                                }
                                            }
                                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact3 = new TLRPC.TL_inputPhoneContact();
                                            tL_inputPhoneContact3.client_id = value3.contact_id | (i17 << 32);
                                            tL_inputPhoneContact3.first_name = value3.first_name;
                                            tL_inputPhoneContact3.last_name = value3.last_name;
                                            tL_inputPhoneContact3.phone = value3.phones.get(i17);
                                            arrayList4.add(tL_inputPhoneContact3);
                                        }
                                        i17++;
                                        it4 = it5;
                                        hashMap14 = hashMap16;
                                        hashMap13 = hashMap11;
                                        readContactsFromPhoneBook = hashMap10;
                                        size2 = i6;
                                    }
                                }
                            } else {
                                i6 = size2;
                                hashMap10 = readContactsFromPhoneBook;
                                hashMap11 = hashMap13;
                                if (contactsController.contactsByShortPhone.containsKey(substring2)) {
                                    i15++;
                                }
                            }
                        } else {
                            i6 = size2;
                            hashMap10 = readContactsFromPhoneBook;
                            i7 = indexOf2;
                            hashMap11 = hashMap13;
                        }
                        i8 = i7;
                        z7 = false;
                        i9 = -1;
                        if (i8 == i9) {
                        }
                        i17++;
                        it4 = it5;
                        hashMap14 = hashMap16;
                        hashMap13 = hashMap11;
                        readContactsFromPhoneBook = hashMap10;
                        size2 = i6;
                    }
                    i4 = size2;
                    hashMap7 = readContactsFromPhoneBook;
                    hashMap8 = hashMap14;
                    it = it4;
                    hashMap9 = hashMap13;
                    if (contact.phones.isEmpty()) {
                        hashMap.remove(key);
                    }
                }
                hashMap12 = hashMap6;
                arrayList2 = arrayList5;
                it4 = it;
                hashMap14 = hashMap8;
                hashMap13 = hashMap9;
                readContactsFromPhoneBook = hashMap7;
                size2 = i4;
                i10 = 0;
            }
            int i18 = size2;
            HashMap<String, Contact> hashMap17 = readContactsFromPhoneBook;
            arrayList = arrayList2;
            hashMap2 = hashMap14;
            hashMap3 = hashMap13;
            if (!z3 && hashMap.isEmpty() && arrayList4.isEmpty()) {
                size2 = i18;
                if (size2 == hashMap17.size()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("contacts not changed!");
                        return;
                    }
                    return;
                }
            } else {
                size2 = i18;
            }
            if (!z2 || hashMap.isEmpty() || hashMap17.isEmpty() || !arrayList4.isEmpty()) {
                readContactsFromPhoneBook = hashMap17;
            } else {
                readContactsFromPhoneBook = hashMap17;
                contactsController.getMessagesStorage().putCachedPhoneBook(readContactsFromPhoneBook, false, false);
            }
            hashMap4 = hashMap15;
            i = i15;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done processing contacts");
        }
        if (z2) {
            if (!arrayList4.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("start import contacts");
                }
                if (z5 && i2 != 0) {
                    if (i2 >= 30) {
                        i3 = 1;
                    } else if (z3 && size2 == 0 && contactsController.contactsByPhone.size() - i > (contactsController.contactsByPhone.size() / 3) * 2) {
                        i3 = 2;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("new phone book contacts " + i2 + " serverContactsInPhonebook " + i + " totalContacts " + contactsController.contactsByPhone.size());
                    }
                    if (i3 == 0) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                ContactsController.this.getNotificationCenter().postNotificationName(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i3), hashMap, Boolean.valueOf(z3), Boolean.valueOf(z));
                            }
                        });
                        return;
                    }
                    if (z6) {
                        final HashMap<String, Contact> hashMap18 = readContactsFromPhoneBook;
                        final HashMap hashMap19 = hashMap4;
                        final ArrayList arrayList6 = arrayList;
                        final HashMap hashMap20 = hashMap2;
                        final HashMap hashMap21 = hashMap3;
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda10
                            @Override // java.lang.Runnable
                            public final void run() {
                                ContactsController.$r8$lambda$DzyePdDHobLMv9A6sqrQbKexbnY(ContactsController.this, hashMap19, hashMap18, z3, hashMap21, arrayList6, hashMap20);
                            }
                        });
                        return;
                    }
                    final ContactsController contactsController2 = contactsController;
                    HashMap<String, Contact> hashMap22 = readContactsFromPhoneBook;
                    ArrayList arrayList7 = arrayList;
                    HashMap hashMap23 = hashMap2;
                    HashMap hashMap24 = hashMap3;
                    final boolean[] zArr = {false};
                    final HashMap hashMap25 = hashMap4;
                    final HashMap hashMap26 = new HashMap(hashMap22);
                    HashMap<String, Contact> hashMap27 = hashMap22;
                    final SparseArray sparseArray = new SparseArray();
                    Iterator it6 = hashMap26.entrySet().iterator();
                    while (it6.hasNext()) {
                        Contact contact4 = (Contact) ((Map.Entry) it6.next()).getValue();
                        sparseArray.put(contact4.contact_id, contact4.key);
                    }
                    contactsController2.completedRequestsCount = 0;
                    int ceil = (int) Math.ceil(arrayList4.size() / 500.0d);
                    int i19 = 0;
                    while (i19 < ceil) {
                        final ArrayList arrayList8 = arrayList7;
                        final TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
                        int i20 = i19 * 500;
                        tL_contacts_importContacts.contacts = new ArrayList<>(arrayList4.subList(i20, Math.min(i20 + 500, arrayList4.size())));
                        ConnectionsManager connectionsManager = contactsController2.getConnectionsManager();
                        final HashMap hashMap28 = hashMap23;
                        final int i21 = ceil;
                        final HashMap hashMap29 = hashMap24;
                        final HashMap<String, Contact> hashMap30 = hashMap27;
                        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda11
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$ct_tQv2ZgHwWp8YjYDEnc2ezxu8(ContactsController.this, hashMap26, sparseArray, zArr, hashMap30, tL_contacts_importContacts, i21, hashMap25, z3, hashMap29, arrayList8, hashMap28, tLObject, tL_error);
                            }
                        };
                        hashMap24 = hashMap29;
                        arrayList7 = arrayList8;
                        hashMap23 = hashMap28;
                        connectionsManager.sendRequest(tL_contacts_importContacts, requestDelegate, 6);
                        i19++;
                        hashMap26 = hashMap26;
                        ceil = i21;
                        hashMap25 = hashMap25;
                        hashMap27 = hashMap30;
                        sparseArray = sparseArray;
                        contactsController2 = contactsController;
                    }
                    return;
                }
                i3 = 0;
                if (BuildVars.LOGS_ENABLED) {
                }
                if (i3 == 0) {
                }
            } else {
                final HashMap<String, Contact> hashMap31 = readContactsFromPhoneBook;
                final HashMap hashMap32 = hashMap4;
                final ArrayList arrayList9 = arrayList;
                final HashMap hashMap33 = hashMap2;
                final HashMap hashMap34 = hashMap3;
                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.$r8$lambda$Cxx6ppn-2ZIgCYY1XVmWBjTB-fw(ContactsController.this, hashMap32, hashMap31, z3, hashMap34, arrayList9, hashMap33);
                    }
                });
            }
        } else {
            final HashMap<String, Contact> hashMap35 = readContactsFromPhoneBook;
            final HashMap hashMap36 = hashMap4;
            final ArrayList arrayList10 = arrayList;
            final HashMap hashMap37 = hashMap2;
            final HashMap hashMap38 = hashMap3;
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$VnpSwn84DC_nFlwkjA1tes35rWw(ContactsController.this, hashMap36, hashMap35, z3, hashMap38, arrayList10, hashMap37);
                }
            });
            if (hashMap35.isEmpty()) {
                return;
            }
            contactsController.getMessagesStorage().putCachedPhoneBook(hashMap35, false, false);
        }
    }

    private /* synthetic */ void lambda$performSyncPhoneBook$13(HashMap hashMap) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (int i = 0; i < this.contacts.size(); i++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        hashMap2.put(user.phone, user);
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) ((Map.Entry) it.next()).getValue();
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < contact.shortPhones.size()) {
                        TLRPC.User user2 = (TLRPC.User) hashMap2.get(contact.shortPhones.get(i2));
                        if (user2 != null) {
                            arrayList.add(user2);
                            contact.shortPhones.remove(i2);
                            i2--;
                            z = true;
                        }
                        i2++;
                    }
                    if (z) {
                        contact.shortPhones.size();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        deleteContact(arrayList, false);
    }

    public static /* synthetic */ void $r8$lambda$DzyePdDHobLMv9A6sqrQbKexbnY(final ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4) {
        contactsController.contactsBookSPhones = hashMap;
        contactsController.contactsBook = hashMap2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(hashMap2, false, false);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$YSr23CPplMLSh2Kz4dut-pK7ghI(ContactsController.this, hashMap3, arrayList, hashMap4);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$YSr23CPplMLSh2Kz4dut-pK7ghI(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        contactsController.mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2);
        contactsController.updateUnregisteredContacts();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$ct_tQv2ZgHwWp8YjYDEnc2ezxu8(final ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, final boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i, final HashMap hashMap3, final boolean z, final HashMap hashMap4, final ArrayList arrayList, final HashMap hashMap5, TLObject tLObject, TLRPC.TL_error tL_error) {
        HashMap hashMap6;
        contactsController.completedRequestsCount++;
        if (tL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
            if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i2 = 0; i2 < tL_contacts_importedContacts.retry_contacts.size(); i2++) {
                    hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i2).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i3 = 0; i3 < tL_contacts_importedContacts.popular_invites.size(); i3++) {
                TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i3);
                Contact contact = (Contact) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tL_popularContact.importers;
                }
            }
            hashMap6 = hashMap2;
            contactsController.getMessagesStorage().putUsersAndChats(tL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
            for (int i4 = 0; i4 < tL_contacts_importedContacts.imported.size(); i4++) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = tL_contacts_importedContacts.imported.get(i4).user_id;
                arrayList2.add(tL_contact);
            }
            contactsController.processLoadedContacts(arrayList2, tL_contacts_importedContacts.users, 2);
        } else {
            hashMap6 = hashMap2;
            for (int i5 = 0; i5 < tL_contacts_importContacts.contacts.size(); i5++) {
                hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i5).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("import contacts error " + tL_error.text);
            }
        }
        if (contactsController.completedRequestsCount == i) {
            if (!hashMap.isEmpty()) {
                contactsController.getMessagesStorage().putCachedPhoneBook(hashMap, false, false);
            }
            final HashMap hashMap7 = hashMap6;
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$m1TwqhGaw0Mq2egntGVluTEqXxA(ContactsController.this, hashMap3, hashMap7, z, hashMap4, arrayList, hashMap5, zArr);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$m1TwqhGaw0Mq2egntGVluTEqXxA(final ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4, boolean[] zArr) {
        contactsController.contactsBookSPhones = hashMap;
        contactsController.contactsBook = hashMap2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$sazV40rllpevw6KcmybtaUh6_pY(ContactsController.this, hashMap3, arrayList, hashMap4);
            }
        });
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.this.getMessagesStorage().getCachedPhoneBook(true);
                }
            }, 300000L);
        }
    }

    public static /* synthetic */ void $r8$lambda$sazV40rllpevw6KcmybtaUh6_pY(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        contactsController.mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$Cxx6ppn-2ZIgCYY1XVmWBjTB-fw(final ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4) {
        contactsController.contactsBookSPhones = hashMap;
        contactsController.contactsBook = hashMap2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$iHfROOqAza5xZhmSuQfOgm6b0PU(ContactsController.this, hashMap3, arrayList, hashMap4);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$iHfROOqAza5xZhmSuQfOgm6b0PU(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        contactsController.mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2);
        contactsController.updateUnregisteredContacts();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$VnpSwn84DC_nFlwkjA1tes35rWw(final ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4) {
        contactsController.contactsBookSPhones = hashMap;
        contactsController.contactsBook = hashMap2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.this.mergePhonebookAndTelegramContacts(hashMap3, arrayList, hashMap4);
            }
        });
    }

    public boolean isLoadingContacts() {
        boolean z;
        synchronized (this.loadContactsSync) {
            z = this.loadingContacts;
        }
        return z;
    }

    private long getContactsHash(ArrayList<TLRPC.TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda50
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$EoqSNI82ZJZ2JYcR7TTNAdah2R4((TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
            }
        });
        int size = arrayList2.size();
        long j = 0;
        for (int i = -1; i < size; i++) {
            if (i == -1) {
                j = MediaDataController.calcHash(j, getUserConfig().contactsSavedCount);
            } else {
                j = MediaDataController.calcHash(j, ((TLRPC.TL_contact) arrayList2.get(i)).user_id);
            }
        }
        return j;
    }

    public static /* synthetic */ int $r8$lambda$EoqSNI82ZJZ2JYcR7TTNAdah2R4(TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        long j = tL_contact.user_id;
        long j2 = tL_contact2.user_id;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void loadContacts(boolean z, final long j) {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = true;
        }
        if (z) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from cache");
            }
            getMessagesStorage().getContacts();
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from server");
            }
            TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
            tL_contacts_getContacts.hash = j;
            getConnectionsManager().sendRequest(tL_contacts_getContacts, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda22
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.$r8$lambda$bcRno81M2P1y2X6oM85aph1vkCI(ContactsController.this, j, tLObject, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$bcRno81M2P1y2X6oM85aph1vkCI(final ContactsController contactsController, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        contactsController.getClass();
        if (tL_error == null) {
            TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
            if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                contactsController.contactsLoaded = true;
                if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsBookLoaded) {
                    contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
                    contactsController.delayedContactsUpdate.clear();
                }
                contactsController.getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
                contactsController.getUserConfig().saveConfig(false);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.$r8$lambda$rMrPpoD2-aWy4eWvNRNvjJSkDxA(ContactsController.this);
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load contacts don't change");
                    return;
                }
                return;
            }
            contactsController.getUserConfig().contactsSavedCount = contacts_contacts.saved_count;
            contactsController.getUserConfig().saveConfig(false);
            contactsController.processLoadedContacts(contacts_contacts.contacts, contacts_contacts.users, 0);
        }
    }

    public static /* synthetic */ void $r8$lambda$rMrPpoD2-aWy4eWvNRNvjJSkDxA(ContactsController contactsController) {
        synchronized (contactsController.loadContactsSync) {
            contactsController.loadingContacts = false;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processLoadedContacts(final ArrayList<TLRPC.TL_contact> arrayList, final ArrayList<TLRPC.User> arrayList2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$A22AQoDOGbqiGzFfc8XlavpwOMs(ContactsController.this, arrayList2, i, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$A22AQoDOGbqiGzFfc8XlavpwOMs(final ContactsController contactsController, final ArrayList arrayList, final int i, final ArrayList arrayList2) {
        contactsController.getMessagesController().putUsers(arrayList, i == 1);
        final LongSparseArray longSparseArray = new LongSparseArray();
        final boolean isEmpty = arrayList2.isEmpty();
        if (i == 2 && !contactsController.contacts.isEmpty()) {
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                if (contactsController.contactsDict.get(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id)) != null) {
                    arrayList2.remove(i2);
                    i2--;
                }
                i2++;
            }
            arrayList2.addAll(contactsController.contacts);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i3)).user_id));
            if (user != null) {
                longSparseArray.put(user.id, user);
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$crN0eunr4yjNwrMNxPKC3SblvxE(ContactsController.this, i, arrayList2, arrayList, longSparseArray, isEmpty);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$crN0eunr4yjNwrMNxPKC3SblvxE(final ContactsController contactsController, final int i, final ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, final boolean z) {
        final HashMap hashMap;
        final HashMap hashMap2;
        int i2;
        ConcurrentHashMap concurrentHashMap;
        int i3;
        String upperCase;
        ArrayList arrayList3;
        ArrayList arrayList4 = arrayList;
        final LongSparseArray longSparseArray2 = longSparseArray;
        contactsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i == 1 && (arrayList4.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - contactsController.getUserConfig().lastContactsSyncTime) >= 86400)) {
            contactsController.loadContacts(false, contactsController.getContactsHash(arrayList4));
            if (arrayList4.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda39
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.$r8$lambda$BknDRtYuKhih0K5uHkrPJWZ3GKk(ContactsController.this);
                    }
                });
                return;
            }
        }
        if (i == 0) {
            contactsController.getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            contactsController.getUserConfig().saveConfig(false);
        }
        int i4 = 0;
        final boolean z2 = false;
        while (i4 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact = arrayList4.get(i4);
            if (MessagesController.getInstance(contactsController.currentAccount).getUser(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != contactsController.getUserConfig().getClientUserId()) {
                arrayList4.remove(i4);
                i4--;
                z2 = true;
            }
            i4++;
        }
        if (i != 1) {
            contactsController.getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            contactsController.getMessagesStorage().putContacts(arrayList4, i != 2);
        }
        final Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList4, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda40
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = localeCollator.compare(UserObject.getFirstName((TLRPC.User) r0.get(((TLRPC.TL_contact) obj).user_id)), UserObject.getFirstName((TLRPC.User) LongSparseArray.this.get(((TLRPC.TL_contact) obj2).user_id)));
                return compare;
            }
        });
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap hashMap3 = new HashMap();
        final HashMap hashMap4 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (contactsController.contactsBookLoaded) {
            hashMap = null;
            hashMap2 = null;
        } else {
            hashMap = new HashMap();
            hashMap2 = new HashMap();
        }
        int i5 = 0;
        while (i5 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact2 = arrayList4.get(i5);
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            TLRPC.User user = (TLRPC.User) longSparseArray2.get(tL_contact2.user_id);
            if (user == null) {
                i2 = i5;
                arrayList3 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
            } else {
                i2 = i5;
                ArrayList arrayList7 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
                concurrentHashMap.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                if (hashMap == null || TextUtils.isEmpty(user.phone)) {
                    i3 = 0;
                } else {
                    hashMap.put(user.phone, tL_contact2);
                    i3 = 0;
                    hashMap2.put(user.phone.substring(Math.max(0, r12.length() - 7)), tL_contact2);
                }
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i3, 1);
                }
                if (firstName.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = firstName.toUpperCase();
                }
                String str = contactsController.sectionsToReplace.get(upperCase);
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
            i5 = i2 + 1;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap;
            arrayList6 = arrayList3;
            concurrentHashMap2 = concurrentHashMap4;
            arrayList4 = arrayList;
            longSparseArray2 = longSparseArray;
        }
        final ArrayList arrayList10 = arrayList6;
        final ConcurrentHashMap concurrentHashMap5 = concurrentHashMap2;
        Collections.sort(arrayList5, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda41
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$7FRrR4a9X27JXVm5UFt68w07Xyw(localeCollator, (String) obj, (String) obj2);
            }
        });
        Collections.sort(arrayList10, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda42
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$qp1Mm9C7fv5a8XV5V4R8DcUSLyE(localeCollator, (String) obj, (String) obj2);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$eBU4ijZpnJaQE_58t7-m8z9CDXI(ContactsController.this, arrayList, concurrentHashMap5, hashMap3, hashMap4, arrayList5, arrayList10, i, z, z2);
            }
        });
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded && contactsController.contactsBookLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        if (hashMap != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda44
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$I6NjXpJ1ep04JxrgdpS_MC9aSU8(ContactsController.this, hashMap, hashMap2);
                }
            });
        } else {
            contactsController.contactsLoaded = true;
        }
    }

    public static /* synthetic */ void $r8$lambda$BknDRtYuKhih0K5uHkrPJWZ3GKk(ContactsController contactsController) {
        contactsController.doneLoadingContacts = true;
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static /* synthetic */ int $r8$lambda$7FRrR4a9X27JXVm5UFt68w07Xyw(Collator collator, String str, String str2) {
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

    public static /* synthetic */ int $r8$lambda$qp1Mm9C7fv5a8XV5V4R8DcUSLyE(Collator collator, String str, String str2) {
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

    public static /* synthetic */ void $r8$lambda$eBU4ijZpnJaQE_58t7-m8z9CDXI(ContactsController contactsController, ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2, ArrayList arrayList3, int i, boolean z, boolean z2) {
        contactsController.contacts = arrayList;
        contactsController.contactsDict = concurrentHashMap;
        contactsController.usersSectionsDict = hashMap;
        contactsController.usersMutualSectionsDict = hashMap2;
        contactsController.sortedUsersSectionsArray = arrayList2;
        contactsController.sortedUsersMutualSectionsArray = arrayList3;
        contactsController.doneLoadingContacts = true;
        if (i != 2) {
            synchronized (contactsController.loadContactsSync) {
                contactsController.loadingContacts = false;
            }
        }
        contactsController.performWriteContactsToPhoneBook();
        contactsController.updateUnregisteredContacts();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        if (i != 1 && !z) {
            contactsController.saveContactsLoadTime();
        } else {
            contactsController.reloadContactsStatusesMaybe(false);
        }
        if (z2) {
            contactsController.loadContacts(false, 0L);
        }
    }

    public static /* synthetic */ void $r8$lambda$I6NjXpJ1ep04JxrgdpS_MC9aSU8(final ContactsController contactsController, final HashMap hashMap, final HashMap hashMap2) {
        contactsController.getClass();
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$cL9-qTXJ9G8sZHvZemeEl1tk_lY(ContactsController.this, hashMap, hashMap2);
            }
        });
        if (contactsController.contactsSyncInProgress) {
            return;
        }
        contactsController.contactsSyncInProgress = true;
        contactsController.getMessagesStorage().getCachedPhoneBook(false);
    }

    public static /* synthetic */ void $r8$lambda$cL9-qTXJ9G8sZHvZemeEl1tk_lY(ContactsController contactsController, HashMap hashMap, HashMap hashMap2) {
        contactsController.contactsByPhone = hashMap;
        contactsController.contactsByShortPhone = hashMap2;
    }

    public boolean isContact(long j) {
        return this.contactsDict.get(Long.valueOf(j)) != null;
    }

    public void reloadContactsStatusesMaybe(boolean z) {
        try {
            if (MessagesController.getMainSettings(this.currentAccount).getLong("lastReloadStatusTime", 0L) < System.currentTimeMillis() - 10800000 || z) {
                reloadContactsStatuses();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void saveContactsLoadTime() {
        try {
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePhonebookAndTelegramContacts(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2) {
        mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2, true);
    }

    private void mergePhonebookAndTelegramContacts(final HashMap<String, ArrayList<Object>> hashMap, final ArrayList<String> arrayList, final HashMap<String, Contact> hashMap2, final boolean z) {
        final ArrayList arrayList2 = new ArrayList(this.contacts);
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$aFecLyzFUcMB3rGVfISfk6kFunQ(ContactsController.this, z, arrayList2, hashMap2, hashMap, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aFecLyzFUcMB3rGVfISfk6kFunQ(final ContactsController contactsController, boolean z, ArrayList arrayList, final HashMap hashMap, final HashMap hashMap2, final ArrayList arrayList2) {
        contactsController.getClass();
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    Contact contact = (Contact) hashMap.get(user.phone.substring(Math.max(0, r3.length() - 7)));
                    if (contact != null) {
                        if (contact.user == null) {
                            contact.user = user;
                        }
                    } else {
                        String letter = Contact.getLetter(user.first_name, user.last_name);
                        ArrayList arrayList3 = (ArrayList) hashMap2.get(letter);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            hashMap2.put(letter, arrayList3);
                            arrayList2.add(letter);
                        }
                        arrayList3.add(user);
                    }
                }
            }
        }
        final Collator localeCollator = getLocaleCollator();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda25
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ContactsController.$r8$lambda$WzPKw0eDXIhv6oQVE8-ad2kfSmY(localeCollator, obj, obj2);
                }
            });
        }
        Collections.sort(arrayList2, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda26
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$LmjoaGJCZKV1FB4RaDKP3eteBZo(localeCollator, (String) obj, (String) obj2);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$PNFsHfNynRpoGoAiTkc0RHopmCU(ContactsController.this, arrayList2, hashMap, hashMap2);
            }
        });
    }

    public static /* synthetic */ int $r8$lambda$WzPKw0eDXIhv6oQVE8-ad2kfSmY(Collator collator, Object obj, Object obj2) {
        String str;
        String str2 = "";
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            str = formatName(user.first_name, user.last_name);
        } else if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            TLRPC.User user2 = contact.user;
            if (user2 != null) {
                str = formatName(user2.first_name, user2.last_name);
            } else {
                str = formatName(contact.first_name, contact.last_name);
            }
        } else {
            str = "";
        }
        if (obj2 instanceof TLRPC.User) {
            TLRPC.User user3 = (TLRPC.User) obj2;
            str2 = formatName(user3.first_name, user3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC.User user4 = contact2.user;
            if (user4 != null) {
                str2 = formatName(user4.first_name, user4.last_name);
            } else {
                str2 = formatName(contact2.first_name, contact2.last_name);
            }
        }
        return collator.compare(str, str2);
    }

    public static /* synthetic */ int $r8$lambda$LmjoaGJCZKV1FB4RaDKP3eteBZo(Collator collator, String str, String str2) {
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

    public static /* synthetic */ void $r8$lambda$PNFsHfNynRpoGoAiTkc0RHopmCU(ContactsController contactsController, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        contactsController.phoneBookSectionsArray = arrayList;
        contactsController.phoneBookByShortPhones = hashMap;
        contactsController.phoneBookSectionsDict = hashMap2;
    }

    private void updateUnregisteredContacts() {
        HashMap hashMap = new HashMap();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                hashMap.put(user.phone, tL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, Contact>> it = this.contactsBook.entrySet().iterator();
        while (it.hasNext()) {
            Contact value = it.next().getValue();
            int i2 = 0;
            while (true) {
                if (i2 < value.phones.size()) {
                    if (!hashMap.containsKey(value.shortPhones.get(i2)) && value.phoneDeleted.get(i2).intValue() != 1) {
                        i2++;
                    }
                } else {
                    arrayList.add(value);
                    break;
                }
            }
        }
        final Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda51
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$yGcrFYDPChyOJMc3cE_7E1f7VFk(localeCollator, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
            }
        });
        this.phoneBookContacts = arrayList;
    }

    public static /* synthetic */ int $r8$lambda$yGcrFYDPChyOJMc3cE_7E1f7VFk(Collator collator, Contact contact, Contact contact2) {
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

    private void buildContactsSectionsArrays(boolean z) {
        String upperCase;
        final Collator localeCollator = getLocaleCollator();
        if (z) {
            Collections.sort(this.contacts, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda17
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = localeCollator.compare(UserObject.getFirstName(r0.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id))), UserObject.getFirstName(ContactsController.this.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) obj2).user_id))));
                    return compare;
                }
            });
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.contacts.size(); i++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(0, 1);
                }
                if (firstName.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = firstName.toUpperCase();
                }
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
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda18
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$hj1bMqpqHFptNGw-1SaNPswetxQ(localeCollator, (String) obj, (String) obj2);
            }
        });
        this.usersSectionsDict = hashMap;
        this.sortedUsersSectionsArray = arrayList;
    }

    public static /* synthetic */ int $r8$lambda$hj1bMqpqHFptNGw-1SaNPswetxQ(Collator collator, String str, String str2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1.getCount() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        if (r1 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean hasContactsPermission() {
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_CONTACTS");
            return checkSelfPermission == 0;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
            }
        }
        return true;
    }

    public static boolean hasContactsWritePermission() {
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        checkSelfPermission = ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS");
        return checkSelfPermission == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
    
        if (r4 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        org.telegram.messenger.FileLog.d("performWriteContactsToPhoneBookInternal " + (java.lang.System.currentTimeMillis() - r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        if (r4 == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void performWriteContactsToPhoneBookInternal(ArrayList<TLRPC.TL_contact> arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                Account account = this.systemAccount;
                if (hasContactsPermission() && account != null && hasContactsWritePermission()) {
                    SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
                    boolean z = mainSettings.getBoolean("contacts_updated_v7", false);
                    boolean z2 = !z;
                    if (!z) {
                        mainSettings.edit().putBoolean("contacts_updated_v7", true).commit();
                    }
                    ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                    Cursor query = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2"}, null, null, null);
                    try {
                        LongSparseArray longSparseArray = new LongSparseArray();
                        if (query != null) {
                            while (query.moveToNext()) {
                                longSparseArray.put(query.getLong(1), Long.valueOf(query.getLong(0)));
                            }
                            query.close();
                            FileLog.d("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z2 + " bookContactsSize=" + longSparseArray.size() + " currentAccount=" + this.currentAccount);
                            ArrayList<ContentProviderOperation> arrayList2 = null;
                            for (int i = 0; i < arrayList.size(); i++) {
                                TLRPC.TL_contact tL_contact = arrayList.get(i);
                                if (!z || longSparseArray.indexOfKey(tL_contact.user_id) < 0) {
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
                    } catch (Exception e) {
                        e = e;
                        cursor = query;
                        FileLog.e(e);
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void performWriteContactsToPhoneBook() {
        final ArrayList arrayList = new ArrayList(this.contacts);
        Utilities.phoneBookQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.this.performWriteContactsToPhoneBookInternal(arrayList);
            }
        });
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap, final ArrayList<TLRPC.TL_contact> arrayList2, final ArrayList<Long> arrayList3) {
        int indexOf;
        int indexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = arrayList.get(i);
                if (l.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l.longValue();
                    arrayList2.add(tL_contact);
                } else if (l.longValue() < 0) {
                    arrayList3.add(Long.valueOf(-l.longValue()));
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("process update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= arrayList2.size()) {
                break;
            }
            TLRPC.TL_contact tL_contact2 = arrayList2.get(i2);
            TLRPC.User user = concurrentHashMap != null ? concurrentHashMap.get(Long.valueOf(tL_contact2.user_id)) : null;
            if (user == null) {
                user = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().putUser(user, true);
            }
            if (user == null || TextUtils.isEmpty(user.phone)) {
                z = true;
            } else {
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (indexOf2 = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf2, 0);
                }
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(user.phone);
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            final Long l2 = arrayList3.get(i3);
            Utilities.phoneBookQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$i6I92fR3o5e1_10D9G6WfCv50n0(ContactsController.this, l2);
                }
            });
            TLRPC.User user2 = concurrentHashMap != null ? concurrentHashMap.get(l2) : null;
            if (user2 == null) {
                user2 = getMessagesController().getUser(l2);
            } else {
                getMessagesController().putUser(user2, true);
            }
            if (user2 == null) {
                z = true;
            } else if (!TextUtils.isEmpty(user2.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(user2.phone);
                if (contact2 != null && (indexOf = contact2.shortPhones.indexOf(user2.phone)) != -1) {
                    contact2.phoneDeleted.set(indexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user2.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb.toString(), sb2.toString());
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.this.loadContacts(false, 0L);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$zkbh6flya9SMla74sF1IXwmafi8(ContactsController.this, arrayList2, arrayList3);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$i6I92fR3o5e1_10D9G6WfCv50n0(ContactsController contactsController, Long l) {
        contactsController.getClass();
        contactsController.deleteContactFromPhoneBook(l.longValue());
    }

    public static /* synthetic */ void $r8$lambda$zkbh6flya9SMla74sF1IXwmafi8(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2) {
        contactsController.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i);
            if (contactsController.contactsDict.get(Long.valueOf(tL_contact.user_id)) == null) {
                contactsController.contacts.add(tL_contact);
                contactsController.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Long l = (Long) arrayList2.get(i2);
            TLRPC.TL_contact tL_contact2 = contactsController.contactsDict.get(l);
            if (tL_contact2 != null) {
                contactsController.contacts.remove(tL_contact2);
                contactsController.contactsDict.remove(l);
            }
        }
        if (!arrayList.isEmpty()) {
            contactsController.updateUnregisteredContacts();
            contactsController.performWriteContactsToPhoneBook();
        }
        contactsController.performSyncPhoneBook(contactsController.getContactsCopy(contactsController.contactsBook), false, false, false, false, true, false);
        contactsController.buildContactsSectionsArrays(!arrayList.isEmpty());
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        int indexOf;
        int indexOf2;
        ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Long l = arrayList.get(i);
            i++;
            Long l2 = l;
            if (l2.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l2.longValue();
                arrayList2.add(tL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-l2.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf);
                }
            } else if (l2.longValue() < 0) {
                arrayList3.add(Long.valueOf(-l2.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-l2.longValue()))) != -1) {
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
        if (!this.contactsLoaded || !this.contactsBookLoaded) {
            this.delayedContactsUpdate.addAll(arrayList);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
                return;
            }
            return;
        }
        applyContactsUpdates(arrayList, concurrentHashMap, arrayList2, arrayList3);
    }

    public long addContactToPhoneBook(TLRPC.User user, boolean z) {
        Uri uri;
        long j = -1;
        if (this.systemAccount == null || user == null || !hasContactsWritePermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z) {
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
                j = Long.parseLong(uri.getLastPathSegment());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j;
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
        String str2 = str;
        newInsert4.withValue("data1", Long.valueOf(user.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, str2));
        newInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, str2));
        newInsert5.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert5.build());
    }

    private void deleteContactFromPhoneBook(long j) {
        if (hasContactsPermission()) {
            synchronized (this.observerLock) {
                this.ignoreChanges = true;
            }
            try {
                ApplicationLoader.applicationContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + j, null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            synchronized (this.observerLock) {
                this.ignoreChanges = false;
            }
        }
    }

    protected void markAsContacted(final String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$KdxsDzNdBySWk-SquPm6yasNp8U(str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$KdxsDzNdBySWk-SquPm6yasNp8U(String str) {
        Uri parse = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(parse, contentValues, null, null);
    }

    public void addContact(TLRPC.User user, boolean z) {
        addContact(user, null, z);
    }

    public void addContact(final TLRPC.User user, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        if (user == null) {
            return;
        }
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.id = getMessagesController().getInputUser(user);
        tL_contacts_addContact.first_name = user.first_name;
        tL_contacts_addContact.last_name = user.last_name;
        String str = user.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (tL_textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = tL_textWithEntities;
        }
        getConnectionsManager().sendRequest(tL_contacts_addContact, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.$r8$lambda$WMOqe2SZnqwy1urgVCcm1dIWs1c(ContactsController.this, user, tLObject, tL_error);
            }
        }, 6);
    }

    public static /* synthetic */ void $r8$lambda$WMOqe2SZnqwy1urgVCcm1dIWs1c(final ContactsController contactsController, final TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        contactsController.getClass();
        if (tL_error != null) {
            return;
        }
        final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal) {
            for (int i = 0; i < updates.users.size(); i++) {
                if (updates.users.get(i).id == user.id) {
                    updates.users.get(i).photo = user.photo;
                }
            }
        }
        contactsController.getMessagesController().processUpdates(updates, false);
        for (int i2 = 0; i2 < updates.users.size(); i2++) {
            final TLRPC.User user2 = updates.users.get(i2);
            if (user2.id == user.id) {
                Utilities.phoneBookQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsController.this.addContactToPhoneBook(user2, true);
                    }
                });
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                ArrayList<TLRPC.TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tL_contact);
                contactsController.getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(user2.phone)) {
                    formatName(user2.first_name, user2.last_name);
                    contactsController.getMessagesStorage().applyPhoneBookUpdates(user2.phone, "");
                    Contact contact = contactsController.contactsBookSPhones.get(user2.phone);
                    if (contact != null && (indexOf = contact.shortPhones.indexOf(user2.phone)) != -1) {
                        contact.phoneDeleted.set(indexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$dn-mSr_UMKHuy09fawHYxlZ6qOc(ContactsController.this, updates, user);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$dn-mSr_UMKHuy09fawHYxlZ6qOc(ContactsController contactsController, TLRPC.Updates updates, TLRPC.User user) {
        Contact contact;
        contactsController.getClass();
        boolean z = false;
        for (int i = 0; i < updates.users.size(); i++) {
            TLRPC.User user2 = updates.users.get(i);
            if (user2.contact && (contact = contactsController.contactsBookSPhones.get(user2.phone)) != null) {
                String letter = contact.getLetter();
                String letter2 = Contact.getLetter(user.first_name, user.last_name);
                if (contact.user == null) {
                    contact.user = user;
                    if (!letter.equals(letter2)) {
                        ArrayList<Object> arrayList = contactsController.phoneBookSectionsDict.get(letter2);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            contactsController.phoneBookSectionsDict.put(letter2, arrayList);
                            contactsController.phoneBookSectionsArray.add(letter2);
                        }
                        arrayList.add(contact);
                        ArrayList<Object> arrayList2 = contactsController.phoneBookSectionsDict.get(letter);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                Object obj = arrayList2.get(i2);
                                i2++;
                                if (obj instanceof Contact) {
                                    Contact contact2 = (Contact) obj;
                                    if (contact2.contact_id == contact.contact_id) {
                                        if (arrayList2.remove(contact2) && arrayList2.isEmpty()) {
                                            contactsController.phoneBookSectionsDict.remove(letter);
                                            contactsController.phoneBookSectionsArray.remove(letter);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
            }
            if (user2.contact && contactsController.contactsDict.get(Long.valueOf(user2.id)) == null) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                contactsController.contacts.add(tL_contact);
                contactsController.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        contactsController.buildContactsSectionsArrays(true);
        if (z) {
            contactsController.mergePhonebookAndTelegramContacts(contactsController.phoneBookSectionsDict, contactsController.phoneBookSectionsArray, contactsController.phoneBookByShortPhones, false);
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void deleteContactsUndoable(Context context, BaseFragment baseFragment, final ArrayList<TLRPC.User> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = arrayList.get(i);
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.id));
            user.contact = false;
            this.contacts.remove(tL_contact);
            this.contactsDict.remove(Long.valueOf(user.id));
            hashMap.put(user, tL_contact);
        }
        buildContactsSectionsArrays(false);
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(context, baseFragment.getResourceProvider());
        simpleLayout.setTimer();
        simpleLayout.textView.setText(LocaleController.formatPluralString("ContactsDeletedUndo", hashMap.size(), new Object[0]));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, true, baseFragment.getResourceProvider());
        undoButton.setUndoAction(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$sGf3d0To3WbbqYRY5rfRt4ZCE0g(ContactsController.this, hashMap);
            }
        });
        undoButton.setDelayedAction(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda64
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.this.deleteContact(arrayList, false);
            }
        });
        simpleLayout.setButton(undoButton);
        Bulletin.make(baseFragment, simpleLayout, 5000).show();
    }

    public static /* synthetic */ void $r8$lambda$sGf3d0To3WbbqYRY5rfRt4ZCE0g(ContactsController contactsController, HashMap hashMap) {
        contactsController.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            contactsController.contacts.add(tL_contact);
            contactsController.contactsDict.put(Long.valueOf(user.id), tL_contact);
        }
        contactsController.buildContactsSectionsArrays(true);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void deleteContact(final ArrayList<TLRPC.User> arrayList, final boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = arrayList.get(i);
            getMessagesController().getStoriesController().removeContact(user.id);
            TLRPC.InputUser inputUser = getMessagesController().getInputUser(user);
            if (inputUser != null) {
                user.contact = false;
                arrayList2.add(Long.valueOf(user.id));
                tL_contacts_deleteContacts.id.add(inputUser);
            }
        }
        final String str = arrayList.get(0).first_name;
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda35
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.$r8$lambda$Uut7dQkVNNt0ILgqBBwZu6CLlYs(ContactsController.this, arrayList2, arrayList, z, str, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Uut7dQkVNNt0ILgqBBwZu6CLlYs(final ContactsController contactsController, ArrayList arrayList, final ArrayList arrayList2, final boolean z, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        if (tL_error != null) {
            contactsController.getClass();
            return;
        }
        contactsController.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        contactsController.getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$xLhJdolOg4uQPwq5ga-5LWgeT4I(ContactsController.this, arrayList2);
            }
        });
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            if (!TextUtils.isEmpty(user.phone)) {
                contactsController.getMessagesStorage().applyPhoneBookUpdates(user.phone, "");
                Contact contact = contactsController.contactsBookSPhones.get(user.phone);
                if (contact != null && (indexOf = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$v_d5dY2ByvRIMrfpKdyszndFuv8(ContactsController.this, arrayList2, z, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$xLhJdolOg4uQPwq5ga-5LWgeT4I(ContactsController contactsController, ArrayList arrayList) {
        contactsController.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            contactsController.deleteContactFromPhoneBook(((TLRPC.User) obj).id);
        }
    }

    public static /* synthetic */ void $r8$lambda$v_d5dY2ByvRIMrfpKdyszndFuv8(ContactsController contactsController, ArrayList arrayList, boolean z, String str) {
        contactsController.getClass();
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            TLRPC.TL_contact tL_contact = contactsController.contactsDict.get(Long.valueOf(user.id));
            if (tL_contact != null) {
                contactsController.contacts.remove(tL_contact);
                contactsController.contactsDict.remove(Long.valueOf(user.id));
                z2 = true;
            }
        }
        if (z2) {
            contactsController.buildContactsSectionsArrays(false);
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", R.string.DeletedFromYourContacts, str));
        }
    }

    private void reloadContactsStatuses() {
        saveContactsLoadTime();
        getMessagesController().clearFullUsers();
        final SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda57
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.$r8$lambda$lZKMTjXNb2O_STtGGPdSg_dVEiw(ContactsController.this, edit, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$lZKMTjXNb2O_STtGGPdSg_dVEiw(final ContactsController contactsController, final SharedPreferences.Editor editor, final TLObject tLObject, TLRPC.TL_error tL_error) {
        contactsController.getClass();
        if (tLObject instanceof Vector) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsController.$r8$lambda$TOvYMlA3iNJx3_7sq-UtCyo_U9c(ContactsController.this, editor, tLObject);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$TOvYMlA3iNJx3_7sq-UtCyo_U9c(ContactsController contactsController, SharedPreferences.Editor editor, TLObject tLObject) {
        contactsController.getClass();
        editor.remove("needGetStatuses").commit();
        Vector vector = (Vector) tLObject;
        if (!vector.objects.isEmpty()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<T> arrayList2 = vector.objects;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
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
                    TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(tL_contactStatus.user_id));
                    if (user != null) {
                        user.status = tL_contactStatus.status;
                    }
                    tL_user.status = tL_contactStatus.status;
                    arrayList.add(tL_user);
                }
            }
            contactsController.getMessagesStorage().updateUsers(arrayList, true, true, true);
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_STATUS));
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda28
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.$r8$lambda$tf17IN6fDKrdHdEkEukmFucVfrY(ContactsController.this, tLObject, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$tf17IN6fDKrdHdEkEukmFucVfrY(final ContactsController contactsController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        contactsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$QeuYjZ85W8_Xt-jVCKOQwkDyCKA(ContactsController.this, tL_error, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$QeuYjZ85W8_Xt-jVCKOQwkDyCKA(ContactsController contactsController, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            contactsController.getClass();
            contactsController.globalPrivacySettings = (TLRPC.GlobalPrivacySettings) tLObject;
            contactsController.loadingGlobalSettings = 2;
        } else {
            contactsController.loadingGlobalSettings = 0;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void loadPrivacySettings() {
        loadPrivacySettings(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadPrivacySettings(boolean z) {
        final int i;
        if (this.loadingDeleteInfo == 0) {
            this.loadingDeleteInfo = 1;
            getConnectionsManager().sendRequest(new TL_account.getAccountTTL(), new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda58
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.$r8$lambda$ALc_1dACp70c0iWpt0jc6LW3YRQ(ContactsController.this, tLObject, tL_error);
                }
            });
        }
        loadGlobalPrivacySetting();
        while (true) {
            int[] iArr = this.loadingPrivacyInfo;
            if (i >= iArr.length) {
                getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            }
            if (z) {
                i = iArr[i] == 1 ? i + 1 : 0;
                iArr[i] = 1;
                TL_account.getPrivacy getprivacy = new TL_account.getPrivacy();
                switch (i) {
                    case 0:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 1:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 2:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 3:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 4:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 5:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyForwards();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 6:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 7:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 8:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 9:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAbout();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 11:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyBirthday();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 12:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 13:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                    case 14:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
                        getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda59
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                ContactsController.$r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(ContactsController.this, i, tLObject, tL_error);
                            }
                        });
                        break;
                }
            } else {
                if (iArr[i] != 0) {
                }
                iArr[i] = 1;
                TL_account.getPrivacy getprivacy2 = new TL_account.getPrivacy();
                switch (i) {
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$ALc_1dACp70c0iWpt0jc6LW3YRQ(final ContactsController contactsController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        contactsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda62
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$21SCJa7j9t-8TgEA_pMr4c7txqE(ContactsController.this, tL_error, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$21SCJa7j9t-8TgEA_pMr4c7txqE(ContactsController contactsController, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            contactsController.getClass();
            contactsController.deleteAccountTTL = ((TLRPC.TL_accountDaysTTL) tLObject).days;
            contactsController.loadingDeleteInfo = 2;
        } else {
            contactsController.loadingDeleteInfo = 0;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$brnNmFoFrGQlcVWonzCFJH2Xe-E(final ContactsController contactsController, final int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        contactsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ContactsController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ContactsController.$r8$lambda$P-orMFGOnt91XsHK5vYPTvJ-1Bc(ContactsController.this, tL_error, tLObject, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$P-orMFGOnt91XsHK5vYPTvJ-1Bc(ContactsController contactsController, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        if (tL_error == null) {
            contactsController.getClass();
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            contactsController.getMessagesController().putUsers(privacyrules.users, false);
            contactsController.getMessagesController().putChats(privacyrules.chats, false);
            switch (i) {
                case 0:
                    contactsController.lastseenPrivacyRules = privacyrules.rules;
                    break;
                case 1:
                    contactsController.groupPrivacyRules = privacyrules.rules;
                    break;
                case 2:
                    contactsController.callPrivacyRules = privacyrules.rules;
                    break;
                case 3:
                    contactsController.p2pPrivacyRules = privacyrules.rules;
                    break;
                case 4:
                    contactsController.profilePhotoPrivacyRules = privacyrules.rules;
                    break;
                case 5:
                    contactsController.forwardsPrivacyRules = privacyrules.rules;
                    break;
                case 6:
                    contactsController.phonePrivacyRules = privacyrules.rules;
                    break;
                case 7:
                case 10:
                default:
                    contactsController.addedByPhonePrivacyRules = privacyrules.rules;
                    break;
                case 8:
                    contactsController.voiceMessagesRules = privacyrules.rules;
                    break;
                case 9:
                    contactsController.bioPrivacyRules = privacyrules.rules;
                    break;
                case 11:
                    contactsController.birthdayPrivacyRules = privacyrules.rules;
                    break;
                case 12:
                    contactsController.giftsPrivacyRules = privacyrules.rules;
                    break;
                case 13:
                    contactsController.noPaidMessagesPrivacyRules = privacyrules.rules;
                    break;
                case 14:
                    contactsController.musicPrivacyRules = privacyrules.rules;
                    break;
            }
            contactsController.loadingPrivacyInfo[i] = 2;
        } else {
            contactsController.loadingPrivacyInfo[i] = 0;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void setDeleteAccountTTL(int i) {
        this.deleteAccountTTL = i;
    }

    public int getDeleteAccountTTL() {
        return this.deleteAccountTTL;
    }

    public boolean getLoadingDeleteInfo() {
        return this.loadingDeleteInfo != 2;
    }

    public boolean getLoadingGlobalSettings() {
        return this.loadingGlobalSettings != 2;
    }

    public boolean getLoadingPrivacyInfo(int i) {
        return this.loadingPrivacyInfo[i] != 2;
    }

    public TLRPC.GlobalPrivacySettings getGlobalPrivacySettings() {
        return this.globalPrivacySettings;
    }

    public ArrayList<TLRPC.PrivacyRule> getPrivacyRules(int i) {
        switch (i) {
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

    public void setPrivacyRules(ArrayList<TLRPC.PrivacyRule> arrayList, int i) {
        switch (i) {
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
        getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
        reloadContactsStatuses();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0256 A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:23:0x0256, B:24:0x025c, B:21:0x01bf), top: B:20:0x01bf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createOrUpdateConnectionServiceContact(long j, String str, String str2) {
        Cursor cursor;
        String str3;
        int parseInt;
        Cursor cursor2;
        if (!hasContactsPermission()) {
            return;
        }
        try {
            ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            Uri build = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri build2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Account account = this.systemAccount;
            Cursor query = contentResolver.query(build, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (query != null && query.moveToFirst()) {
                parseInt = query.getInt(0);
                cursor = query;
                str3 = "account_name";
            } else {
                ContentValues contentValues = new ContentValues();
                cursor = query;
                contentValues.put("account_type", this.systemAccount.type);
                contentValues.put("account_name", this.systemAccount.name);
                str3 = "account_name";
                contentValues.put("group_visible", (Integer) 0);
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                parseInt = Integer.parseInt(contentResolver.insert(build, contentValues).getLastPathSegment());
            }
            if (cursor != null) {
                cursor.close();
            }
            Uri uri = ContactsContract.Data.CONTENT_URI;
            Cursor query2 = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", parseInt + ""}, null);
            int size = arrayList.size();
            int i = parseInt;
            try {
                if (query2 != null) {
                    try {
                        if (query2.moveToFirst()) {
                            int i2 = query2.getInt(0);
                            cursor2 = query2;
                            arrayList.add(ContentProviderOperation.newUpdate(build2).withSelection("_id=?", new String[]{i2 + ""}).withValue("deleted", 0).build());
                            arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/phone_v2"}).withValue("data1", "+99084" + j).build());
                            arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            contentResolver.applyBatch("com.android.contacts", arrayList);
                            return;
                        }
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        return;
                    }
                }
                arrayList.add(ContentProviderOperation.newInsert(build2).withValue("account_type", this.systemAccount.type).withValue(str3, this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i)).build());
                if (cursor2 != null) {
                }
                contentResolver.applyBatch("com.android.contacts", arrayList);
                return;
            } catch (Exception e2) {
                e = e2;
                FileLog.e(e);
                return;
            }
            cursor2 = query2;
        } catch (Exception e3) {
            e = e3;
        }
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
                int i = query.getInt(0);
                query.close();
                Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
                if (query2 == null || !query2.moveToFirst()) {
                    if (query2 != null) {
                        query2.close();
                        return;
                    }
                    return;
                }
                int i2 = query2.getInt(0);
                query2.close();
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i2 + ""});
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static String formatName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return formatName((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return LocaleController.getString(R.string.HiddenName);
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

    public static String formatName(String str, String str2, int i) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i > 0 && str.contains(" ")) {
            int indexOf = str.indexOf(" ");
            String substring = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
            str2 = substring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (LocaleController.nameDisplayOrder == 1) {
            if (str != null && str.length() > 0) {
                if (i > 0 && str.length() > i + 2) {
                    return str.substring(0, i) + "…";
                }
                sb.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb.append(" ");
                    if (i > 0 && sb.length() + str2.length() > i) {
                        sb.append(str2.charAt(0));
                    } else {
                        sb.append(str2);
                    }
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i > 0 && str2.length() > i + 2) {
                    return str2.substring(0, i) + "…";
                }
                sb.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i > 0 && str2.length() > i + 2) {
                return str2.substring(0, i) + "…";
            }
            sb.append(str2);
            if (str != null && str.length() > 0) {
                sb.append(" ");
                if (i > 0 && sb.length() + str.length() > i) {
                    sb.append(str.charAt(0));
                } else {
                    sb.append(str);
                }
            }
        } else if (str != null && str.length() > 0) {
            if (i > 0 && str.length() > i + 2) {
                return str.substring(0, i) + "…";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private class PhoneBookContact {
        String id;
        String lookup_key;
        String name;
        String phone;

        private PhoneBookContact() {
        }
    }

    public static <T extends TLRPC.PrivacyRule> T findRule(ArrayList<TLRPC.PrivacyRule> arrayList, Class<T> cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.PrivacyRule privacyRule = arrayList.get(i);
            i++;
            TLRPC.PrivacyRule privacyRule2 = privacyRule;
            if (cls.isInstance(privacyRule2)) {
                return cls.cast(privacyRule2);
            }
        }
        return null;
    }
}
