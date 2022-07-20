package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_accountDaysTTL;
import org.telegram.tgnet.TLRPC$TL_account_getAccountTTL;
import org.telegram.tgnet.TLRPC$TL_account_getGlobalPrivacySettings;
import org.telegram.tgnet.TLRPC$TL_account_getPrivacy;
import org.telegram.tgnet.TLRPC$TL_account_privacyRules;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$TL_contactStatus;
import org.telegram.tgnet.TLRPC$TL_contacts_addContact;
import org.telegram.tgnet.TLRPC$TL_contacts_contactsNotModified;
import org.telegram.tgnet.TLRPC$TL_contacts_deleteContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_getContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_getStatuses;
import org.telegram.tgnet.TLRPC$TL_contacts_importContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_importedContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_resetSaved;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_globalPrivacySettings;
import org.telegram.tgnet.TLRPC$TL_help_getInviteText;
import org.telegram.tgnet.TLRPC$TL_help_inviteText;
import org.telegram.tgnet.TLRPC$TL_inputPhoneContact;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyAddedByPhone;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyChatInvite;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyForwards;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneCall;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneNumber;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneP2P;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyStatusTimestamp;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyVoiceMessages;
import org.telegram.tgnet.TLRPC$TL_popularContact;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_userStatusLastMonth;
import org.telegram.tgnet.TLRPC$TL_userStatusLastWeek;
import org.telegram.tgnet.TLRPC$TL_userStatusRecently;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$contacts_Contacts;
/* loaded from: classes.dex */
public class ContactsController extends BaseController {
    private static volatile ContactsController[] Instance = new ContactsController[4];
    public static final int PRIVACY_RULES_TYPE_ADDED_BY_PHONE = 7;
    public static final int PRIVACY_RULES_TYPE_CALLS = 2;
    public static final int PRIVACY_RULES_TYPE_COUNT = 9;
    public static final int PRIVACY_RULES_TYPE_FORWARDS = 5;
    public static final int PRIVACY_RULES_TYPE_INVITE = 1;
    public static final int PRIVACY_RULES_TYPE_LASTSEEN = 0;
    public static final int PRIVACY_RULES_TYPE_P2P = 3;
    public static final int PRIVACY_RULES_TYPE_PHONE = 6;
    public static final int PRIVACY_RULES_TYPE_PHOTO = 4;
    public static final int PRIVACY_RULES_TYPE_VOICE_MESSAGES = 8;
    private ArrayList<TLRPC$PrivacyRule> addedByPhonePrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> callPrivacyRules;
    private int completedRequestsCount;
    private boolean contactsBookLoaded;
    public boolean contactsLoaded;
    private boolean contactsSyncInProgress;
    private int deleteAccountTTL;
    public boolean doneLoadingContacts;
    private ArrayList<TLRPC$PrivacyRule> forwardsPrivacyRules;
    private TLRPC$TL_globalPrivacySettings globalPrivacySettings;
    private ArrayList<TLRPC$PrivacyRule> groupPrivacyRules;
    private boolean ignoreChanges;
    private String inviteLink;
    private ArrayList<TLRPC$PrivacyRule> lastseenPrivacyRules;
    private boolean loadingContacts;
    private int loadingDeleteInfo;
    private int loadingGlobalSettings;
    private boolean migratingContacts;
    private ArrayList<TLRPC$PrivacyRule> p2pPrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> phonePrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> profilePhotoPrivacyRules;
    private Account systemAccount;
    private boolean updatingInviteLink;
    private ArrayList<TLRPC$PrivacyRule> voiceMessagesRules;
    private final Object loadContactsSync = new Object();
    private final Object observerLock = new Object();
    private String lastContactsVersions = "";
    private ArrayList<Long> delayedContactsUpdate = new ArrayList<>();
    private HashMap<String, String> sectionsToReplace = new HashMap<>();
    private int[] loadingPrivacyInfo = new int[9];
    private String[] projectionPhones = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    private String[] projectionNames = {"lookup", "data2", "data3", "data5"};
    public HashMap<String, Contact> contactsBook = new HashMap<>();
    public HashMap<String, Contact> contactsBookSPhones = new HashMap<>();
    public ArrayList<Contact> phoneBookContacts = new ArrayList<>();
    public HashMap<String, ArrayList<Object>> phoneBookSectionsDict = new HashMap<>();
    public ArrayList<String> phoneBookSectionsArray = new ArrayList<>();
    public ArrayList<TLRPC$TL_contact> contacts = new ArrayList<>();
    public ConcurrentHashMap<Long, TLRPC$TL_contact> contactsDict = new ConcurrentHashMap<>(20, 1.0f, 2);
    public HashMap<String, ArrayList<TLRPC$TL_contact>> usersSectionsDict = new HashMap<>();
    public ArrayList<String> sortedUsersSectionsArray = new ArrayList<>();
    public HashMap<String, ArrayList<TLRPC$TL_contact>> usersMutualSectionsDict = new HashMap<>();
    public ArrayList<String> sortedUsersMutualSectionsArray = new ArrayList<>();
    public HashMap<String, TLRPC$TL_contact> contactsByPhone = new HashMap<>();
    public HashMap<String, TLRPC$TL_contact> contactsByShortPhone = new HashMap<>();

    public static /* synthetic */ void lambda$resetImportedContacts$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    /* loaded from: classes.dex */
    public class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable = ContactsController$MyContentObserver$$ExternalSyntheticLambda0.INSTANCE;

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        public static /* synthetic */ void lambda$new$0() {
            for (int i = 0; i < 4; i++) {
                if (UserConfig.getInstance(i).isClientActivated()) {
                    ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                    ContactsController.getInstance(i).checkContacts();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyContentObserver() {
            super(null);
            ContactsController.this = r1;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            synchronized (ContactsController.this.observerLock) {
                if (ContactsController.this.ignoreChanges) {
                    return;
                }
                Utilities.globalQueue.cancelRunnable(this.checkRunnable);
                Utilities.globalQueue.postRunnable(this.checkRunnable, 500L);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Contact {
        public int contact_id;
        public String first_name;
        public int imported;
        public boolean isGoodProvider;
        public String key;
        public String last_name;
        public boolean namesFilled;
        public String provider;
        public TLRPC$User user;
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
            return !TextUtils.isEmpty(str2) ? str2.substring(0, 1) : "#";
        }
    }

    public static ContactsController getInstance(int i) {
        ContactsController contactsController = Instance[i];
        if (contactsController == null) {
            synchronized (ContactsController.class) {
                contactsController = Instance[i];
                if (contactsController == null) {
                    ContactsController[] contactsControllerArr = Instance;
                    ContactsController contactsController2 = new ContactsController(i);
                    contactsControllerArr[i] = contactsController2;
                    contactsController = contactsController2;
                }
            }
        }
        return contactsController;
    }

    public ContactsController(int i) {
        super(i);
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
            Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda3(this));
        }
    }

    public /* synthetic */ void lambda$new$0() {
        try {
            if (!hasContactsPermission()) {
                return;
            }
            ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new MyContentObserver());
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
        this.forwardsPrivacyRules = null;
        this.phonePrivacyRules = null;
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda5(this));
    }

    public /* synthetic */ void lambda$cleanup$1() {
        this.migratingContacts = false;
        this.completedRequestsCount = 0;
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i = mainSettings.getInt("invitelinktime", 0);
        if (!this.updatingInviteLink) {
            if (this.inviteLink != null && Math.abs((System.currentTimeMillis() / 1000) - i) < 86400) {
                return;
            }
            this.updatingInviteLink = true;
            getConnectionsManager().sendRequest(new TLRPC$TL_help_getInviteText(), new ContactsController$$ExternalSyntheticLambda54(this), 2);
        }
    }

    public /* synthetic */ void lambda$checkInviteText$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_help_inviteText tLRPC$TL_help_inviteText = (TLRPC$TL_help_inviteText) tLObject;
            if (tLRPC$TL_help_inviteText.message.length() == 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda40(this, tLRPC$TL_help_inviteText));
        }
    }

    public /* synthetic */ void lambda$checkInviteText$2(TLRPC$TL_help_inviteText tLRPC$TL_help_inviteText) {
        this.updatingInviteLink = false;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        String str = tLRPC$TL_help_inviteText.message;
        this.inviteLink = str;
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
            return LocaleController.formatString("InviteText2", 2131626319, str);
        }
        try {
            return String.format(LocaleController.getPluralString("InviteTextNum", i), Integer.valueOf(i), str);
        } catch (Exception unused) {
            return LocaleController.formatString("InviteText2", 2131626319, str);
        }
    }

    public void checkAppAccount() {
        boolean z;
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            this.systemAccount = null;
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        z = false;
                        break;
                    }
                    TLRPC$User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                    if (currentUser != null) {
                        String str = account.name;
                        if (str.equals("" + currentUser.id)) {
                            if (i2 == this.currentAccount) {
                                this.systemAccount = account;
                            }
                            z = true;
                        }
                    }
                    i2++;
                }
                if (!z) {
                    try {
                        accountManager.removeAccount(accountsByType[i], null, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        if (getUserConfig().isClientActivated()) {
            readContacts();
            if (this.systemAccount != null) {
                return;
            }
            try {
                Account account2 = new Account("" + getUserConfig().getClientUserId(), "org.telegram.messenger");
                this.systemAccount = account2;
                accountManager.addAccountExplicitly(account2, "", null);
            } catch (Exception unused3) {
            }
        }
    }

    public void deleteUnknownAppAccounts() {
        boolean z;
        try {
            this.systemAccount = null;
            AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        z = false;
                        break;
                    }
                    TLRPC$User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                    if (currentUser != null) {
                        String str = account.name;
                        if (str.equals("" + currentUser.id)) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (!z) {
                    try {
                        accountManager.removeAccount(accountsByType[i], null, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkContacts() {
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda10(this));
    }

    public /* synthetic */ void lambda$checkContacts$4() {
        if (checkContactsInternal()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected contacts change");
            }
            performSyncPhoneBook(getContactsCopy(this.contactsBook), true, false, true, false, true, false);
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda6(this));
    }

    public /* synthetic */ void lambda$forceImportContacts$5() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    public void syncPhoneBookByAlert(HashMap<String, Contact> hashMap, boolean z, boolean z2, boolean z3) {
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda35(this, hashMap, z, z2, z3));
    }

    public /* synthetic */ void lambda$syncPhoneBookByAlert$6(HashMap hashMap, boolean z, boolean z2, boolean z3) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        performSyncPhoneBook(hashMap, true, z, z2, false, false, z3);
    }

    public void deleteAllContacts(Runnable runnable) {
        resetImportedContacts();
        TLRPC$TL_contacts_deleteContacts tLRPC$TL_contacts_deleteContacts = new TLRPC$TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            tLRPC$TL_contacts_deleteContacts.id.add(getMessagesController().getInputUser(this.contacts.get(i).user_id));
        }
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_deleteContacts, new ContactsController$$ExternalSyntheticLambda58(this, runnable));
    }

    public /* synthetic */ void lambda$deleteAllContacts$8(Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.contactsBookSPhones.clear();
            this.contactsBook.clear();
            this.completedRequestsCount = 0;
            this.migratingContacts = false;
            this.contactsSyncInProgress = false;
            this.contactsLoaded = false;
            this.loadingContacts = false;
            this.contactsBookLoaded = false;
            this.lastContactsVersions = "";
            AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda16(this, runnable));
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public /* synthetic */ void lambda$deleteAllContacts$7(Runnable runnable) {
        TLRPC$User currentUser;
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            this.systemAccount = null;
            for (Account account : accountsByType) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    if (UserConfig.getInstance(i).getCurrentUser() != null) {
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
            Account account2 = new Account("" + getUserConfig().getClientUserId(), "org.telegram.messenger");
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
        this.delayedContactsUpdate.clear();
        this.sortedUsersMutualSectionsArray.clear();
        this.contactsByPhone.clear();
        this.contactsByShortPhone.clear();
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        loadContacts(false, 0L);
        runnable.run();
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC$TL_contacts_resetSaved(), ContactsController$$ExternalSyntheticLambda62.INSTANCE);
    }

    private boolean checkContactsInternal() {
        boolean z = false;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!hasContactsPermission()) {
            return false;
        }
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                StringBuilder sb = new StringBuilder();
                while (query.moveToNext()) {
                    sb.append(query.getString(query.getColumnIndex("version")));
                }
                String sb2 = sb.toString();
                if (this.lastContactsVersions.length() != 0 && !this.lastContactsVersions.equals(sb2)) {
                    z = true;
                }
                this.lastContactsVersions = sb2;
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return z;
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            if (this.loadingContacts) {
                return;
            }
            this.loadingContacts = true;
            Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda1(this));
        }
    }

    public /* synthetic */ void lambda$readContacts$10() {
        if (!this.contacts.isEmpty() || this.contactsLoaded) {
            synchronized (this.loadContactsSync) {
                this.loadingContacts = false;
            }
            return;
        }
        loadContacts(true, 0L);
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

    /* JADX WARN: Removed duplicated region for block: B:175:0x032d A[Catch: all -> 0x0345, TRY_LEAVE, TryCatch #4 {all -> 0x0345, blocks: (B:173:0x0328, B:175:0x032d), top: B:200:0x0328 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HashMap<String, Contact> readContactsFromPhoneBook() {
        Cursor cursor;
        HashMap<String, Contact> hashMap;
        Throwable th;
        HashMap<String, Contact> hashMap2;
        ContentResolver contentResolver;
        Cursor cursor2;
        Cursor cursor3;
        HashMap<String, Contact> hashMap3;
        String substring;
        ContentResolver contentResolver2;
        StringBuilder sb;
        ContactsController contactsController = this;
        if (!getUserConfig().syncContacts) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts sync disabled");
            }
            return new HashMap<>();
        } else if (!hasContactsPermission()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app has no contacts permissions");
            }
            return new HashMap<>();
        } else {
            try {
                StringBuilder sb2 = new StringBuilder();
                ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
                HashMap hashMap4 = new HashMap();
                ArrayList arrayList = new ArrayList();
                cursor = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, contactsController.projectionPhones, null, null, null);
                int i = 0;
                ?? r9 = 1;
                if (cursor != null) {
                    try {
                        int count = cursor.getCount();
                        if (count > 0) {
                            hashMap3 = new HashMap<>(count);
                            int i2 = 1;
                            while (cursor.moveToNext()) {
                                try {
                                    int i3 = r9 == true ? 1 : 0;
                                    int i4 = r9 == true ? 1 : 0;
                                    String string = cursor.getString(i3);
                                    String string2 = cursor.getString(5);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    boolean z = string2.indexOf(".sim") != 0;
                                    if (!TextUtils.isEmpty(string)) {
                                        String stripExceptNumbers = PhoneFormat.stripExceptNumbers(string, r9);
                                        if (!TextUtils.isEmpty(stripExceptNumbers)) {
                                            if (stripExceptNumbers.startsWith("+")) {
                                                try {
                                                    substring = stripExceptNumbers.substring(r9);
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
                                                        if (hashMap2 != null) {
                                                        }
                                                    } finally {
                                                        if (cursor != null) {
                                                            try {
                                                                cursor.close();
                                                            } catch (Exception e) {
                                                                FileLog.e(e);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                substring = stripExceptNumbers;
                                            }
                                            String string3 = cursor.getString(i);
                                            sb2.setLength(i);
                                            DatabaseUtils.appendEscapedSQLString(sb2, string3);
                                            String sb3 = sb2.toString();
                                            Contact contact = (Contact) hashMap4.get(substring);
                                            if (contact != null) {
                                                if (!contact.isGoodProvider && !string2.equals(contact.provider)) {
                                                    sb2.setLength(0);
                                                    DatabaseUtils.appendEscapedSQLString(sb2, contact.key);
                                                    arrayList.remove(sb2.toString());
                                                    arrayList.add(sb3);
                                                    contact.key = string3;
                                                    contact.isGoodProvider = z;
                                                    contact.provider = string2;
                                                }
                                            } else {
                                                if (!arrayList.contains(sb3)) {
                                                    arrayList.add(sb3);
                                                }
                                                int i5 = cursor.getInt(2);
                                                Contact contact2 = hashMap3.get(string3);
                                                if (contact2 == null) {
                                                    contact2 = new Contact();
                                                    sb = sb2;
                                                    String string4 = cursor.getString(4);
                                                    String trim = string4 == null ? "" : string4.trim();
                                                    if (contactsController.isNotValidNameString(trim)) {
                                                        contact2.first_name = trim;
                                                        contact2.last_name = "";
                                                        contentResolver2 = contentResolver3;
                                                    } else {
                                                        contentResolver2 = contentResolver3;
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
                                                    contact2.contact_id = i2;
                                                    hashMap3.put(string3, contact2);
                                                    i2++;
                                                } else {
                                                    sb = sb2;
                                                    contentResolver2 = contentResolver3;
                                                }
                                                contact2.shortPhones.add(substring);
                                                contact2.phones.add(stripExceptNumbers);
                                                contact2.phoneDeleted.add(0);
                                                if (i5 == 0) {
                                                    String string5 = cursor.getString(3);
                                                    ArrayList<String> arrayList2 = contact2.phoneTypes;
                                                    if (string5 == null) {
                                                        string5 = LocaleController.getString("PhoneMobile", 2131627544);
                                                    }
                                                    arrayList2.add(string5);
                                                } else if (i5 == 1) {
                                                    contact2.phoneTypes.add(LocaleController.getString("PhoneHome", 2131627542));
                                                } else if (i5 == 2) {
                                                    contact2.phoneTypes.add(LocaleController.getString("PhoneMobile", 2131627544));
                                                } else if (i5 == 3) {
                                                    contact2.phoneTypes.add(LocaleController.getString("PhoneWork", 2131627554));
                                                } else if (i5 == 12) {
                                                    contact2.phoneTypes.add(LocaleController.getString("PhoneMain", 2131627543));
                                                } else {
                                                    contact2.phoneTypes.add(LocaleController.getString("PhoneOther", 2131627553));
                                                }
                                                hashMap4.put(substring, contact2);
                                                contactsController = this;
                                                sb2 = sb;
                                                contentResolver3 = contentResolver2;
                                            }
                                        }
                                    }
                                    r9 = 1;
                                    i = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            contentResolver = contentResolver3;
                        } else {
                            contentResolver = contentResolver3;
                            hashMap3 = null;
                        }
                        try {
                            cursor.close();
                        } catch (Exception unused) {
                            hashMap2 = hashMap3;
                            cursor2 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        hashMap = null;
                    }
                } else {
                    contentResolver = contentResolver3;
                    cursor2 = cursor;
                    hashMap2 = null;
                }
                try {
                    String join = TextUtils.join(",", arrayList);
                    Uri uri = ContactsContract.Data.CONTENT_URI;
                    try {
                        cursor2 = contentResolver.query(uri, this.projectionNames, "lookup IN (" + join + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                        if (cursor2 != null) {
                            while (cursor2.moveToNext()) {
                                String string6 = cursor2.getString(0);
                                String string7 = cursor2.getString(1);
                                String string8 = cursor2.getString(2);
                                String string9 = cursor2.getString(3);
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
                                            if (!TextUtils.isEmpty(contact3.first_name)) {
                                                contact3.first_name += " " + string9;
                                            } else {
                                                contact3.first_name = string9;
                                            }
                                        }
                                    } else if ((!isNotValidNameString(string7) && (contact3.first_name.contains(string7) || string7.contains(contact3.first_name))) || (!isNotValidNameString(string8) && (contact3.last_name.contains(string8) || string7.contains(contact3.last_name)))) {
                                        if (string7 != null) {
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
                                        if (string8 != null) {
                                            contact3.last_name = string8;
                                        } else {
                                            contact3.last_name = "";
                                        }
                                    }
                                    contact3.namesFilled = true;
                                }
                            }
                            try {
                                cursor2.close();
                            } catch (Exception unused2) {
                            }
                            cursor3 = null;
                        } else {
                            cursor3 = cursor2;
                        }
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
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                        }
                        hashMap2 = hashMap;
                        if (hashMap2 != null) {
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                hashMap = null;
                cursor = null;
            }
            return hashMap2 != null ? hashMap2 : new HashMap<>();
        }
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

    public void migratePhoneBookToV7(SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda14(this, sparseArray));
    }

    public /* synthetic */ void lambda$migratePhoneBookToV7$11(SparseArray sparseArray) {
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
        getMessagesStorage().putCachedPhoneBook(hashMap, true, false);
    }

    public void performSyncPhoneBook(HashMap<String, Contact> hashMap, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z2 || this.contactsBookLoaded) {
            Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda36(this, hashMap, z3, z, z2, z4, z5, z6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0308, code lost:
        if (r0 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0310, code lost:
        if (r13.contactsByPhone.containsKey(r8) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0312, code lost:
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0315, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0317, code lost:
        r8 = new org.telegram.tgnet.TLRPC$TL_inputPhoneContact();
        r14 = r4.contact_id;
        r8.client_id = r14;
        r8.client_id = (r5 << 32) | r14;
        r8.first_name = r4.first_name;
        r8.last_name = r4.last_name;
        r8.phone = r4.phones.get(r5);
        r9.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04c3, code lost:
        if ((r14.contactsByPhone.size() - r0) > ((r14.contactsByPhone.size() / 3) * 2)) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0134, code lost:
        if (r2.first_name.equals(r4.first_name) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0149, code lost:
        if (r2.last_name.equals(r4.last_name) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$performSyncPhoneBook$24(HashMap hashMap, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i;
        HashMap hashMap2;
        ArrayList arrayList;
        HashMap hashMap3;
        ContactsController contactsController;
        HashMap<String, Contact> hashMap4;
        int i2;
        int i3;
        Contact contact;
        HashMap hashMap5;
        HashMap hashMap6;
        HashMap<String, Contact> hashMap7;
        ArrayList arrayList2;
        String str;
        HashMap hashMap8;
        int indexOf;
        HashMap hashMap9;
        HashMap<String, Contact> hashMap10;
        ArrayList arrayList3;
        int i4;
        boolean z7;
        int i5;
        String str2;
        ContactsController contactsController2 = this;
        HashMap hashMap11 = new HashMap();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Contact contact2 = (Contact) ((Map.Entry) it.next()).getValue();
            while (i < contact2.shortPhones.size()) {
                hashMap11.put(contact2.shortPhones.get(i), contact2);
                i++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start read contacts from phone");
        }
        if (!z) {
            checkContactsInternal();
        }
        HashMap<String, Contact> readContactsFromPhoneBook = readContactsFromPhoneBook();
        HashMap hashMap12 = new HashMap();
        HashMap hashMap13 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry<String, Contact> entry : readContactsFromPhoneBook.entrySet()) {
            Contact value = entry.getValue();
            int size = value.shortPhones.size();
            for (int i6 = 0; i6 < size; i6++) {
                hashMap13.put(value.shortPhones.get(i6).substring(Math.max(0, str2.length() - 7)), value);
            }
            String letter = value.getLetter();
            ArrayList arrayList5 = (ArrayList) hashMap12.get(letter);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                hashMap12.put(letter, arrayList5);
                arrayList4.add(letter);
            }
            arrayList5.add(value);
        }
        HashMap hashMap14 = new HashMap();
        int size2 = hashMap.size();
        ArrayList arrayList6 = new ArrayList();
        String str3 = "";
        if (!hashMap.isEmpty()) {
            Iterator<Map.Entry<String, Contact>> it2 = readContactsFromPhoneBook.entrySet().iterator();
            i2 = 0;
            int i7 = 0;
            while (it2.hasNext()) {
                Map.Entry<String, Contact> next = it2.next();
                String key = next.getKey();
                Contact value2 = next.getValue();
                Contact contact3 = (Contact) hashMap.get(key);
                Iterator<Map.Entry<String, Contact>> it3 = it2;
                if (contact3 == null) {
                    while (i < value2.shortPhones.size()) {
                        contact = (Contact) hashMap11.get(value2.shortPhones.get(i));
                        if (contact != null) {
                            key = contact.key;
                            break;
                        }
                        i++;
                    }
                }
                contact = contact3;
                if (contact != null) {
                    value2.imported = contact.imported;
                }
                if (contact != null) {
                    if (!TextUtils.isEmpty(value2.first_name)) {
                        hashMap5 = hashMap11;
                    } else {
                        hashMap5 = hashMap11;
                    }
                    if (!TextUtils.isEmpty(value2.last_name)) {
                    }
                } else {
                    hashMap5 = hashMap11;
                }
                boolean z8 = false;
                if (contact == null || z8) {
                    str = str3;
                    arrayList2 = arrayList4;
                    hashMap8 = hashMap13;
                    hashMap7 = readContactsFromPhoneBook;
                    hashMap6 = hashMap12;
                    int i8 = 0;
                    while (i8 < value2.phones.size()) {
                        String str4 = value2.shortPhones.get(i8);
                        str4.substring(Math.max(0, str4.length() - 7));
                        hashMap14.put(str4, value2);
                        if (contact != null && (indexOf = contact.shortPhones.indexOf(str4)) != -1) {
                            Integer num = contact.phoneDeleted.get(indexOf);
                            value2.phoneDeleted.set(i8, num);
                            if (num.intValue() == 1) {
                                i8++;
                                contactsController2 = this;
                            }
                        }
                        i8++;
                        contactsController2 = this;
                    }
                    if (contact != null) {
                        hashMap.remove(key);
                    }
                } else {
                    int i9 = 0;
                    while (i9 < value2.phones.size()) {
                        String str5 = value2.shortPhones.get(i9);
                        String str6 = str3;
                        HashMap hashMap15 = hashMap13;
                        String substring = str5.substring(Math.max(0, str5.length() - 7));
                        hashMap14.put(str5, value2);
                        int indexOf2 = contact.shortPhones.indexOf(str5);
                        if (z2) {
                            i5 = indexOf2;
                            TLRPC$TL_contact tLRPC$TL_contact = contactsController2.contactsByPhone.get(str5);
                            if (tLRPC$TL_contact != null) {
                                arrayList3 = arrayList4;
                                hashMap10 = readContactsFromPhoneBook;
                                hashMap9 = hashMap12;
                                TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id));
                                if (user != null) {
                                    i7++;
                                    if (TextUtils.isEmpty(user.first_name) && TextUtils.isEmpty(user.last_name) && (!TextUtils.isEmpty(value2.first_name) || !TextUtils.isEmpty(value2.last_name))) {
                                        z7 = true;
                                        i5 = -1;
                                        i4 = i5;
                                        if (i4 != -1) {
                                            value2.phoneDeleted.set(i9, contact.phoneDeleted.get(i4));
                                            contact.phones.remove(i4);
                                            contact.shortPhones.remove(i4);
                                            contact.phoneDeleted.remove(i4);
                                            contact.phoneTypes.remove(i4);
                                        } else if (z2) {
                                            if (!z7) {
                                                TLRPC$TL_contact tLRPC$TL_contact2 = contactsController2.contactsByPhone.get(str5);
                                                if (tLRPC$TL_contact2 != null) {
                                                    TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact2.user_id));
                                                    if (user2 != null) {
                                                        i7++;
                                                        String str7 = user2.first_name;
                                                        if (str7 == null) {
                                                            str7 = str6;
                                                        }
                                                        String str8 = user2.last_name;
                                                        if (str8 == null) {
                                                            str8 = str6;
                                                        }
                                                        if (str7.equals(value2.first_name)) {
                                                            if (str8.equals(value2.last_name)) {
                                                            }
                                                        }
                                                        if (TextUtils.isEmpty(value2.first_name) && TextUtils.isEmpty(value2.last_name)) {
                                                        }
                                                    } else {
                                                        i2++;
                                                    }
                                                } else if (contactsController2.contactsByShortPhone.containsKey(substring)) {
                                                    i7++;
                                                }
                                            }
                                            TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact = new TLRPC$TL_inputPhoneContact();
                                            long j = value2.contact_id;
                                            tLRPC$TL_inputPhoneContact.client_id = j;
                                            tLRPC$TL_inputPhoneContact.client_id = j | (i9 << 32);
                                            tLRPC$TL_inputPhoneContact.first_name = value2.first_name;
                                            tLRPC$TL_inputPhoneContact.last_name = value2.last_name;
                                            tLRPC$TL_inputPhoneContact.phone = value2.phones.get(i9);
                                            arrayList6.add(tLRPC$TL_inputPhoneContact);
                                        }
                                        i9++;
                                        hashMap13 = hashMap15;
                                        str3 = str6;
                                        arrayList4 = arrayList3;
                                        readContactsFromPhoneBook = hashMap10;
                                        hashMap12 = hashMap9;
                                    }
                                }
                                z7 = false;
                                i4 = i5;
                                if (i4 != -1) {
                                }
                                i9++;
                                hashMap13 = hashMap15;
                                str3 = str6;
                                arrayList4 = arrayList3;
                                readContactsFromPhoneBook = hashMap10;
                                hashMap12 = hashMap9;
                            } else {
                                arrayList3 = arrayList4;
                                hashMap10 = readContactsFromPhoneBook;
                                hashMap9 = hashMap12;
                                if (contactsController2.contactsByShortPhone.containsKey(substring)) {
                                    i7++;
                                }
                            }
                        } else {
                            arrayList3 = arrayList4;
                            i5 = indexOf2;
                            hashMap10 = readContactsFromPhoneBook;
                            hashMap9 = hashMap12;
                        }
                        i4 = i5;
                        z7 = false;
                        if (i4 != -1) {
                        }
                        i9++;
                        hashMap13 = hashMap15;
                        str3 = str6;
                        arrayList4 = arrayList3;
                        readContactsFromPhoneBook = hashMap10;
                        hashMap12 = hashMap9;
                    }
                    str = str3;
                    arrayList2 = arrayList4;
                    hashMap8 = hashMap13;
                    hashMap7 = readContactsFromPhoneBook;
                    hashMap6 = hashMap12;
                    if (contact.phones.isEmpty()) {
                        hashMap.remove(key);
                    }
                }
                contactsController2 = this;
                it2 = it3;
                hashMap11 = hashMap5;
                hashMap13 = hashMap8;
                str3 = str;
                arrayList4 = arrayList2;
                readContactsFromPhoneBook = hashMap7;
                hashMap12 = hashMap6;
                i = 0;
            }
            arrayList = arrayList4;
            hashMap3 = hashMap13;
            HashMap<String, Contact> hashMap16 = readContactsFromPhoneBook;
            hashMap2 = hashMap12;
            if (!z3 && hashMap.isEmpty() && arrayList6.isEmpty() && size2 == hashMap16.size()) {
                if (!BuildVars.LOGS_ENABLED) {
                    return;
                }
                FileLog.d("contacts not changed!");
                return;
            }
            if (!z2 || hashMap.isEmpty() || hashMap16.isEmpty() || !arrayList6.isEmpty()) {
                hashMap4 = hashMap16;
            } else {
                hashMap4 = hashMap16;
                getMessagesStorage().putCachedPhoneBook(hashMap4, false, false);
            }
            contactsController = this;
            i3 = i7;
        } else {
            arrayList = arrayList4;
            hashMap3 = hashMap13;
            hashMap4 = readContactsFromPhoneBook;
            hashMap2 = hashMap12;
            if (z2) {
                int i10 = 0;
                for (Map.Entry<String, Contact> entry2 : hashMap4.entrySet()) {
                    Contact value3 = entry2.getValue();
                    entry2.getKey();
                    for (int i11 = 0; i11 < value3.phones.size(); i11++) {
                        if (!z4) {
                            String str9 = value3.shortPhones.get(i11);
                            String substring2 = str9.substring(Math.max(0, str9.length() - 7));
                            TLRPC$TL_contact tLRPC$TL_contact3 = this.contactsByPhone.get(str9);
                            if (tLRPC$TL_contact3 != null) {
                                TLRPC$User user3 = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact3.user_id));
                                if (user3 != null) {
                                    i10++;
                                    String str10 = user3.first_name;
                                    if (str10 == null) {
                                        str10 = str3;
                                    }
                                    String str11 = user3.last_name;
                                    if (str11 == null) {
                                        str11 = str3;
                                    }
                                    if ((str10.equals(value3.first_name) && str11.equals(value3.last_name)) || (TextUtils.isEmpty(value3.first_name) && TextUtils.isEmpty(value3.last_name))) {
                                    }
                                }
                            } else if (this.contactsByShortPhone.containsKey(substring2)) {
                                i10++;
                            }
                        }
                        TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact2 = new TLRPC$TL_inputPhoneContact();
                        long j2 = value3.contact_id;
                        tLRPC$TL_inputPhoneContact2.client_id = j2;
                        tLRPC$TL_inputPhoneContact2.client_id = j2 | (i11 << 32);
                        tLRPC$TL_inputPhoneContact2.first_name = value3.first_name;
                        tLRPC$TL_inputPhoneContact2.last_name = value3.last_name;
                        tLRPC$TL_inputPhoneContact2.phone = value3.phones.get(i11);
                        arrayList6.add(tLRPC$TL_inputPhoneContact2);
                    }
                }
                contactsController = this;
                i3 = i10;
            } else {
                contactsController = this;
                i3 = 0;
            }
            i2 = 0;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done processing contacts");
        }
        if (z2) {
            if (!arrayList6.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("start import contacts");
                }
                int i12 = 2;
                if (z5 && i2 != 0) {
                    if (i2 >= 30) {
                        i12 = 1;
                    } else if (z3) {
                        if (size2 == 0) {
                        }
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("new phone book contacts " + i2 + " serverContactsInPhonebook " + i3 + " totalContacts " + contactsController.contactsByPhone.size());
                    }
                    if (i12 == 0) {
                        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda12(this, i12, hashMap, z3, z));
                        return;
                    } else if (z6) {
                        Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda32(this, hashMap14, hashMap4, z3, hashMap2, arrayList, hashMap3));
                        return;
                    } else {
                        boolean[] zArr = {false};
                        HashMap hashMap17 = new HashMap(hashMap4);
                        SparseArray sparseArray = new SparseArray();
                        for (Map.Entry entry3 : hashMap17.entrySet()) {
                            Contact contact4 = (Contact) entry3.getValue();
                            sparseArray.put(contact4.contact_id, contact4.key);
                        }
                        contactsController.completedRequestsCount = 0;
                        double size3 = arrayList6.size();
                        Double.isNaN(size3);
                        int ceil = (int) Math.ceil(size3 / 500.0d);
                        int i13 = 0;
                        while (i13 < ceil) {
                            TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts = new TLRPC$TL_contacts_importContacts();
                            int i14 = i13 * 500;
                            tLRPC$TL_contacts_importContacts.contacts = new ArrayList<>(arrayList6.subList(i14, Math.min(i14 + 500, arrayList6.size())));
                            getConnectionsManager().sendRequest(tLRPC$TL_contacts_importContacts, new ContactsController$$ExternalSyntheticLambda60(this, hashMap17, sparseArray, zArr, hashMap4, tLRPC$TL_contacts_importContacts, ceil, hashMap14, z3, hashMap2, arrayList, hashMap3), 6);
                            i13++;
                            zArr = zArr;
                            ceil = ceil;
                            arrayList6 = arrayList6;
                            hashMap14 = hashMap14;
                            sparseArray = sparseArray;
                            hashMap17 = hashMap17;
                        }
                        return;
                    }
                }
                i12 = 0;
                if (BuildVars.LOGS_ENABLED) {
                }
                if (i12 == 0) {
                }
            } else {
                Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda31(this, hashMap14, hashMap4, z3, hashMap2, arrayList, hashMap3));
            }
        } else {
            Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda33(this, hashMap14, hashMap4, z3, hashMap2, arrayList, hashMap3));
            if (hashMap4.isEmpty()) {
                return;
            }
            getMessagesStorage().putCachedPhoneBook(hashMap4, false, false);
        }
    }

    private /* synthetic */ void lambda$performSyncPhoneBook$12(HashMap hashMap) {
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (int i = 0; i < this.contacts.size(); i++) {
                    TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        hashMap2.put(user.phone, user);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    Contact contact = (Contact) entry.getValue();
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < contact.shortPhones.size()) {
                        TLRPC$User tLRPC$User = (TLRPC$User) hashMap2.get(contact.shortPhones.get(i2));
                        if (tLRPC$User != null) {
                            arrayList.add(tLRPC$User);
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
        if (!arrayList.isEmpty()) {
            deleteContact(arrayList, false);
        }
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$13(int i, HashMap hashMap, boolean z, boolean z2) {
        getNotificationCenter().postNotificationName(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i), hashMap, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$15(HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        getMessagesStorage().putCachedPhoneBook(hashMap2, false, false);
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda27(this, hashMap3, arrayList, hashMap4));
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$14(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$22(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$19(HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts, int i, HashMap hashMap3, boolean z, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.completedRequestsCount++;
        if (tLRPC$TL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC$TL_contacts_importedContacts tLRPC$TL_contacts_importedContacts = (TLRPC$TL_contacts_importedContacts) tLObject;
            if (!tLRPC$TL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i2 = 0; i2 < tLRPC$TL_contacts_importedContacts.retry_contacts.size(); i2++) {
                    hashMap.remove(sparseArray.get((int) tLRPC$TL_contacts_importedContacts.retry_contacts.get(i2).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i3 = 0; i3 < tLRPC$TL_contacts_importedContacts.popular_invites.size(); i3++) {
                TLRPC$TL_popularContact tLRPC$TL_popularContact = tLRPC$TL_contacts_importedContacts.popular_invites.get(i3);
                Contact contact = (Contact) hashMap2.get(sparseArray.get((int) tLRPC$TL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tLRPC$TL_popularContact.importers;
                }
            }
            getMessagesStorage().putUsersAndChats(tLRPC$TL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC$TL_contact> arrayList2 = new ArrayList<>();
            for (int i4 = 0; i4 < tLRPC$TL_contacts_importedContacts.imported.size(); i4++) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = tLRPC$TL_contacts_importedContacts.imported.get(i4).user_id;
                arrayList2.add(tLRPC$TL_contact);
            }
            processLoadedContacts(arrayList2, tLRPC$TL_contacts_importedContacts.users, 2);
        } else {
            for (int i5 = 0; i5 < tLRPC$TL_contacts_importContacts.contacts.size(); i5++) {
                hashMap.remove(sparseArray.get((int) tLRPC$TL_contacts_importContacts.contacts.get(i5).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("import contacts error " + tLRPC$TL_error.text);
            }
        }
        if (this.completedRequestsCount == i) {
            if (!hashMap.isEmpty()) {
                getMessagesStorage().putCachedPhoneBook(hashMap, false, false);
            }
            Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda34(this, hashMap3, hashMap2, z, hashMap4, arrayList, hashMap5, zArr));
        }
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$18(HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda28(this, hashMap3, arrayList, hashMap4));
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda7(this), 300000L);
        }
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$16(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$22(hashMap, arrayList, hashMap2);
        getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$17() {
        getMessagesStorage().getCachedPhoneBook(true);
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$21(HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda26(this, hashMap3, arrayList, hashMap4));
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$20(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$22(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public /* synthetic */ void lambda$performSyncPhoneBook$23(HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda25(this, hashMap3, arrayList, hashMap4));
    }

    public boolean isLoadingContacts() {
        boolean z;
        synchronized (this.loadContactsSync) {
            z = this.loadingContacts;
        }
        return z;
    }

    private long getContactsHash(ArrayList<TLRPC$TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, ContactsController$$ExternalSyntheticLambda50.INSTANCE);
        int size = arrayList2.size();
        long j = 0;
        for (int i = -1; i < size; i++) {
            if (i == -1) {
                j = MediaDataController.calcHash(j, getUserConfig().contactsSavedCount);
            } else {
                j = MediaDataController.calcHash(j, ((TLRPC$TL_contact) arrayList2.get(i)).user_id);
            }
        }
        return j;
    }

    public static /* synthetic */ int lambda$getContactsHash$25(TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        long j = tLRPC$TL_contact.user_id;
        long j2 = tLRPC$TL_contact2.user_id;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void loadContacts(boolean z, long j) {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = true;
        }
        if (z) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from cache");
            }
            getMessagesStorage().getContacts();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load contacts from server");
        }
        TLRPC$TL_contacts_getContacts tLRPC$TL_contacts_getContacts = new TLRPC$TL_contacts_getContacts();
        tLRPC$TL_contacts_getContacts.hash = j;
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_getContacts, new ContactsController$$ExternalSyntheticLambda56(this, j));
    }

    public /* synthetic */ void lambda$loadContacts$27(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$contacts_Contacts tLRPC$contacts_Contacts = (TLRPC$contacts_Contacts) tLObject;
            if (j != 0 && (tLRPC$contacts_Contacts instanceof TLRPC$TL_contacts_contactsNotModified)) {
                this.contactsLoaded = true;
                if (!this.delayedContactsUpdate.isEmpty() && this.contactsBookLoaded) {
                    applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
                    this.delayedContactsUpdate.clear();
                }
                getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
                getUserConfig().saveConfig(false);
                AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda8(this));
                if (!BuildVars.LOGS_ENABLED) {
                    return;
                }
                FileLog.d("load contacts don't change");
                return;
            }
            getUserConfig().contactsSavedCount = tLRPC$contacts_Contacts.saved_count;
            getUserConfig().saveConfig(false);
            processLoadedContacts(tLRPC$contacts_Contacts.contacts, tLRPC$contacts_Contacts.users, 0);
        }
    }

    public /* synthetic */ void lambda$loadContacts$26() {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processLoadedContacts(ArrayList<TLRPC$TL_contact> arrayList, ArrayList<TLRPC$User> arrayList2, int i) {
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda19(this, arrayList2, i, arrayList));
    }

    public /* synthetic */ void lambda$processLoadedContacts$37(ArrayList arrayList, int i, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, i == 1);
        LongSparseArray longSparseArray = new LongSparseArray();
        boolean isEmpty = arrayList2.isEmpty();
        if (i == 2 && !this.contacts.isEmpty()) {
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                if (this.contactsDict.get(Long.valueOf(((TLRPC$TL_contact) arrayList2.get(i2)).user_id)) != null) {
                    arrayList2.remove(i2);
                    i2--;
                }
                i2++;
            }
            arrayList2.addAll(this.contacts);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(((TLRPC$TL_contact) arrayList2.get(i3)).user_id));
            if (user != null) {
                longSparseArray.put(user.id, user);
            }
        }
        Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda11(this, i, arrayList2, longSparseArray, arrayList, isEmpty));
    }

    public /* synthetic */ void lambda$processLoadedContacts$36(int i, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        int i2;
        String str;
        ArrayList arrayList3 = arrayList;
        LongSparseArray longSparseArray2 = longSparseArray;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i == 1 && (arrayList.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - getUserConfig().lastContactsSyncTime) >= 86400)) {
            loadContacts(false, getContactsHash(arrayList3));
            if (arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda9(this));
                return;
            }
        }
        if (i == 0) {
            getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC$TL_contact tLRPC$TL_contact = arrayList3.get(i3);
            if (longSparseArray2.get(tLRPC$TL_contact.user_id) == null && tLRPC$TL_contact.user_id != getUserConfig().getClientUserId()) {
                loadContacts(false, 0L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("contacts are broken, load from server");
                }
                AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda4(this));
                return;
            }
        }
        if (i != 1) {
            getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            getMessagesStorage().putContacts(arrayList3, i != 2);
        }
        Collections.sort(arrayList3, new ContactsController$$ExternalSyntheticLambda43(longSparseArray2));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(20, 1.0f, 2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (!this.contactsBookLoaded) {
            HashMap hashMap5 = new HashMap();
            hashMap = new HashMap();
            hashMap2 = hashMap5;
        } else {
            hashMap2 = null;
            hashMap = null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            TLRPC$TL_contact tLRPC$TL_contact2 = arrayList3.get(i4);
            TLRPC$User tLRPC$User = (TLRPC$User) longSparseArray2.get(tLRPC$TL_contact2.user_id);
            if (tLRPC$User != null) {
                concurrentHashMap.put(Long.valueOf(tLRPC$TL_contact2.user_id), tLRPC$TL_contact2);
                if (hashMap2 == null || TextUtils.isEmpty(tLRPC$User.phone)) {
                    i2 = 0;
                } else {
                    hashMap2.put(tLRPC$User.phone, tLRPC$TL_contact2);
                    i2 = 0;
                    hashMap.put(tLRPC$User.phone.substring(Math.max(0, str.length() - 7)), tLRPC$TL_contact2);
                }
                String firstName = UserObject.getFirstName(tLRPC$User);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i2, 1);
                }
                String upperCase = firstName.length() == 0 ? "#" : firstName.toUpperCase();
                String str2 = this.sectionsToReplace.get(upperCase);
                if (str2 != null) {
                    upperCase = str2;
                }
                ArrayList arrayList6 = (ArrayList) hashMap3.get(upperCase);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    hashMap3.put(upperCase, arrayList6);
                    arrayList4.add(upperCase);
                }
                arrayList6.add(tLRPC$TL_contact2);
                if (tLRPC$User.mutual_contact) {
                    ArrayList arrayList7 = (ArrayList) hashMap4.get(upperCase);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        hashMap4.put(upperCase, arrayList7);
                        arrayList5.add(upperCase);
                    }
                    arrayList7.add(tLRPC$TL_contact2);
                }
            }
            i4++;
            arrayList3 = arrayList;
            longSparseArray2 = longSparseArray;
        }
        Collections.sort(arrayList4, ContactsController$$ExternalSyntheticLambda47.INSTANCE);
        Collections.sort(arrayList5, ContactsController$$ExternalSyntheticLambda46.INSTANCE);
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda23(this, arrayList, concurrentHashMap, hashMap3, hashMap4, arrayList4, arrayList5, i, z));
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        if (hashMap2 != null) {
            AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda30(this, hashMap2, hashMap));
        } else {
            this.contactsLoaded = true;
        }
    }

    public /* synthetic */ void lambda$processLoadedContacts$28() {
        this.doneLoadingContacts = true;
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public /* synthetic */ void lambda$processLoadedContacts$29() {
        this.doneLoadingContacts = true;
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static /* synthetic */ int lambda$processLoadedContacts$30(LongSparseArray longSparseArray, TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        return UserObject.getFirstName((TLRPC$User) longSparseArray.get(tLRPC$TL_contact.user_id)).compareTo(UserObject.getFirstName((TLRPC$User) longSparseArray.get(tLRPC$TL_contact2.user_id)));
    }

    public static /* synthetic */ int lambda$processLoadedContacts$31(String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 != '#') {
            return str.compareTo(str2);
        }
        return -1;
    }

    public static /* synthetic */ int lambda$processLoadedContacts$32(String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 != '#') {
            return str.compareTo(str2);
        }
        return -1;
    }

    public /* synthetic */ void lambda$processLoadedContacts$33(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2, ArrayList arrayList3, int i, boolean z) {
        this.contacts = arrayList;
        this.contactsDict = concurrentHashMap;
        this.usersSectionsDict = hashMap;
        this.usersMutualSectionsDict = hashMap2;
        this.sortedUsersSectionsArray = arrayList2;
        this.sortedUsersMutualSectionsArray = arrayList3;
        this.doneLoadingContacts = true;
        if (i != 2) {
            synchronized (this.loadContactsSync) {
                this.loadingContacts = false;
            }
        }
        performWriteContactsToPhoneBook();
        updateUnregisteredContacts();
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        if (i != 1 && !z) {
            saveContactsLoadTime();
        } else {
            reloadContactsStatusesMaybe();
        }
    }

    public /* synthetic */ void lambda$processLoadedContacts$35(HashMap hashMap, HashMap hashMap2) {
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda29(this, hashMap, hashMap2));
        if (this.contactsSyncInProgress) {
            return;
        }
        this.contactsSyncInProgress = true;
        getMessagesStorage().getCachedPhoneBook(false);
    }

    public /* synthetic */ void lambda$processLoadedContacts$34(HashMap hashMap, HashMap hashMap2) {
        this.contactsByPhone = hashMap;
        this.contactsByShortPhone = hashMap2;
    }

    public boolean isContact(long j) {
        return this.contactsDict.get(Long.valueOf(j)) != null;
    }

    public void reloadContactsStatusesMaybe() {
        try {
            if (MessagesController.getMainSettings(this.currentAccount).getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000) {
                return;
            }
            reloadContactsStatuses();
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

    /* renamed from: mergePhonebookAndTelegramContacts */
    public void lambda$performSyncPhoneBook$22(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2) {
        Utilities.globalQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda22(this, new ArrayList(this.contacts), hashMap2, hashMap, arrayList));
    }

    public /* synthetic */ void lambda$mergePhonebookAndTelegramContacts$41(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(((TLRPC$TL_contact) arrayList.get(i)).user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str = user.phone;
                Contact contact = (Contact) hashMap.get(str.substring(Math.max(0, str.length() - 7)));
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
        for (ArrayList arrayList4 : hashMap2.values()) {
            Collections.sort(arrayList4, ContactsController$$ExternalSyntheticLambda51.INSTANCE);
        }
        Collections.sort(arrayList2, ContactsController$$ExternalSyntheticLambda45.INSTANCE);
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda21(this, arrayList2, hashMap2));
    }

    public static /* synthetic */ int lambda$mergePhonebookAndTelegramContacts$38(Object obj, Object obj2) {
        String str;
        String str2;
        String str3 = "";
        if (obj instanceof TLRPC$User) {
            TLRPC$User tLRPC$User = (TLRPC$User) obj;
            str = formatName(tLRPC$User.first_name, tLRPC$User.last_name);
        } else if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            TLRPC$User tLRPC$User2 = contact.user;
            if (tLRPC$User2 != null) {
                str = formatName(tLRPC$User2.first_name, tLRPC$User2.last_name);
            } else {
                str = formatName(contact.first_name, contact.last_name);
            }
        } else {
            str = str3;
        }
        if (obj2 instanceof TLRPC$User) {
            TLRPC$User tLRPC$User3 = (TLRPC$User) obj2;
            str3 = formatName(tLRPC$User3.first_name, tLRPC$User3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC$User tLRPC$User4 = contact2.user;
            if (tLRPC$User4 != null) {
                str2 = formatName(tLRPC$User4.first_name, tLRPC$User4.last_name);
            } else {
                str2 = formatName(contact2.first_name, contact2.last_name);
            }
            str3 = str2;
        }
        return str.compareTo(str3);
    }

    public static /* synthetic */ int lambda$mergePhonebookAndTelegramContacts$39(String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 != '#') {
            return str.compareTo(str2);
        }
        return -1;
    }

    public /* synthetic */ void lambda$mergePhonebookAndTelegramContacts$40(ArrayList arrayList, HashMap hashMap) {
        this.phoneBookSectionsArray = arrayList;
        this.phoneBookSectionsDict = hashMap;
    }

    private void updateUnregisteredContacts() {
        boolean z;
        HashMap hashMap = new HashMap();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_contact tLRPC$TL_contact = this.contacts.get(i);
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                hashMap.put(user.phone, tLRPC$TL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        for (Map.Entry<String, Contact> entry : this.contactsBook.entrySet()) {
            Contact value = entry.getValue();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= value.phones.size()) {
                    z = false;
                    break;
                } else if (hashMap.containsKey(value.shortPhones.get(i2)) || value.phoneDeleted.get(i2).intValue() == 1) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                arrayList.add(value);
            }
        }
        Collections.sort(arrayList, ContactsController$$ExternalSyntheticLambda49.INSTANCE);
        this.phoneBookContacts = arrayList;
    }

    public static /* synthetic */ int lambda$updateUnregisteredContacts$42(Contact contact, Contact contact2) {
        String str = contact.first_name;
        if (str.length() == 0) {
            str = contact.last_name;
        }
        String str2 = contact2.first_name;
        if (str2.length() == 0) {
            str2 = contact2.last_name;
        }
        return str.compareTo(str2);
    }

    private void buildContactsSectionsArrays(boolean z) {
        if (z) {
            Collections.sort(this.contacts, new ContactsController$$ExternalSyntheticLambda44(this));
        }
        HashMap<String, ArrayList<TLRPC$TL_contact>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.contacts.size(); i++) {
            TLRPC$TL_contact tLRPC$TL_contact = this.contacts.get(i);
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id));
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
                ArrayList<TLRPC$TL_contact> arrayList2 = hashMap.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    hashMap.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tLRPC$TL_contact);
            }
        }
        Collections.sort(arrayList, ContactsController$$ExternalSyntheticLambda48.INSTANCE);
        this.usersSectionsDict = hashMap;
        this.sortedUsersSectionsArray = arrayList;
    }

    public /* synthetic */ int lambda$buildContactsSectionsArrays$43(TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        return UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id))).compareTo(UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact2.user_id))));
    }

    public static /* synthetic */ int lambda$buildContactsSectionsArrays$44(String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 != '#') {
            return str.compareTo(str2);
        }
        return -1;
    }

    private boolean hasContactsPermission() {
        Cursor query;
        if (Build.VERSION.SDK_INT >= 23) {
            return ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
        }
        try {
            query = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, this.projectionPhones, null, null, null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (query != null && query.getCount() != 0) {
            query.close();
            return true;
        }
        if (query != null) {
            try {
                query.close();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return false;
    }

    /* renamed from: performWriteContactsToPhoneBookInternal */
    public void lambda$performWriteContactsToPhoneBook$45(ArrayList<TLRPC$TL_contact> arrayList) {
        Throwable th;
        Exception e;
        Cursor cursor = null;
        try {
            try {
            } catch (Exception e2) {
                e = e2;
            }
            if (!hasContactsPermission()) {
                return;
            }
            SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
            boolean z = !mainSettings.getBoolean("contacts_updated_v7", false);
            if (z) {
                mainSettings.edit().putBoolean("contacts_updated_v7", true).commit();
            }
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), new String[]{"_id", "sync2"}, null, null, null);
            try {
                LongSparseArray longSparseArray = new LongSparseArray();
                if (query != null) {
                    while (query.moveToNext()) {
                        longSparseArray.put(query.getLong(1), Long.valueOf(query.getLong(0)));
                    }
                    query.close();
                    for (int i = 0; i < arrayList.size(); i++) {
                        TLRPC$TL_contact tLRPC$TL_contact = arrayList.get(i);
                        if (z || longSparseArray.indexOfKey(tLRPC$TL_contact.user_id) < 0) {
                            addContactToPhoneBook(getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id)), z);
                        }
                    }
                } else {
                    cursor = query;
                }
                if (cursor == null) {
                    return;
                }
            } catch (Exception e3) {
                e = e3;
                cursor = query;
                FileLog.e(e);
                if (cursor == null) {
                    return;
                }
                cursor.close();
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void performWriteContactsToPhoneBook() {
        Utilities.phoneBookQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda18(this, new ArrayList(this.contacts)));
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC$User> concurrentHashMap, ArrayList<TLRPC$TL_contact> arrayList2, ArrayList<Long> arrayList3) {
        int indexOf;
        int indexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = arrayList.get(i);
                if (l.longValue() > 0) {
                    TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                    tLRPC$TL_contact.user_id = l.longValue();
                    arrayList2.add(tLRPC$TL_contact);
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
            TLRPC$User tLRPC$User = null;
            if (i2 < arrayList2.size()) {
                TLRPC$TL_contact tLRPC$TL_contact2 = arrayList2.get(i2);
                if (concurrentHashMap != null) {
                    tLRPC$User = concurrentHashMap.get(Long.valueOf(tLRPC$TL_contact2.user_id));
                }
                if (tLRPC$User == null) {
                    tLRPC$User = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact2.user_id));
                } else {
                    getMessagesController().putUser(tLRPC$User, true);
                }
                if (tLRPC$User == null || TextUtils.isEmpty(tLRPC$User.phone)) {
                    z = true;
                } else {
                    Contact contact = this.contactsBookSPhones.get(tLRPC$User.phone);
                    if (contact != null && (indexOf2 = contact.shortPhones.indexOf(tLRPC$User.phone)) != -1) {
                        contact.phoneDeleted.set(indexOf2, 0);
                    }
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(tLRPC$User.phone);
                }
                i2++;
            }
        }
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            Long l2 = arrayList3.get(i3);
            Utilities.phoneBookQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda15(this, l2));
            TLRPC$User tLRPC$User2 = concurrentHashMap != null ? concurrentHashMap.get(l2) : null;
            if (tLRPC$User2 == null) {
                tLRPC$User2 = getMessagesController().getUser(l2);
            } else {
                getMessagesController().putUser(tLRPC$User2, true);
            }
            if (tLRPC$User2 == null) {
                z = true;
            } else if (!TextUtils.isEmpty(tLRPC$User2.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(tLRPC$User2.phone);
                if (contact2 != null && (indexOf = contact2.shortPhones.indexOf(tLRPC$User2.phone)) != -1) {
                    contact2.phoneDeleted.set(indexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(tLRPC$User2.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb.toString(), sb2.toString());
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda2(this));
        } else {
            AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda20(this, arrayList2, arrayList3));
        }
    }

    public /* synthetic */ void lambda$applyContactsUpdates$46(Long l) {
        deleteContactFromPhoneBook(l.longValue());
    }

    public /* synthetic */ void lambda$applyContactsUpdates$47() {
        loadContacts(false, 0L);
    }

    public /* synthetic */ void lambda$applyContactsUpdates$48(ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$TL_contact tLRPC$TL_contact = (TLRPC$TL_contact) arrayList.get(i);
            if (this.contactsDict.get(Long.valueOf(tLRPC$TL_contact.user_id)) == null) {
                this.contacts.add(tLRPC$TL_contact);
                this.contactsDict.put(Long.valueOf(tLRPC$TL_contact.user_id), tLRPC$TL_contact);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Long l = (Long) arrayList2.get(i2);
            TLRPC$TL_contact tLRPC$TL_contact2 = this.contactsDict.get(l);
            if (tLRPC$TL_contact2 != null) {
                this.contacts.remove(tLRPC$TL_contact2);
                this.contactsDict.remove(l);
            }
        }
        if (!arrayList.isEmpty()) {
            updateUnregisteredContacts();
            performWriteContactsToPhoneBook();
        }
        performSyncPhoneBook(getContactsCopy(this.contactsBook), false, false, false, false, true, false);
        buildContactsSectionsArrays(!arrayList.isEmpty());
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC$User> concurrentHashMap) {
        int indexOf;
        int indexOf2;
        ArrayList<TLRPC$TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (next.longValue() > 0) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = next.longValue();
                arrayList2.add(tLRPC$TL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-next.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf);
                }
            } else if (next.longValue() < 0) {
                arrayList3.add(Long.valueOf(-next.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-next.longValue()))) != -1) {
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
            if (!BuildVars.LOGS_ENABLED) {
                return;
            }
            FileLog.d("delay update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
            return;
        }
        applyContactsUpdates(arrayList, concurrentHashMap, arrayList2, arrayList3);
    }

    public long addContactToPhoneBook(TLRPC$User tLRPC$User, boolean z) {
        String str;
        long j = -1;
        if (this.systemAccount == null || tLRPC$User == null || !hasContactsPermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z) {
            try {
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + tLRPC$User.id, null);
            } catch (Exception unused) {
            }
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_name", this.systemAccount.name);
        newInsert.withValue("account_type", this.systemAccount.type);
        newInsert.withValue("sync1", TextUtils.isEmpty(tLRPC$User.phone) ? "" : tLRPC$User.phone);
        newInsert.withValue("sync2", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert.build());
        ContentProviderOperation.Builder newInsert2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert2.withValueBackReference("raw_contact_id", 0);
        newInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        newInsert2.withValue("data2", tLRPC$User.first_name);
        newInsert2.withValue("data3", tLRPC$User.last_name);
        arrayList.add(newInsert2.build());
        if (TextUtils.isEmpty(tLRPC$User.phone)) {
            str = formatName(tLRPC$User.first_name, tLRPC$User.last_name);
        } else {
            str = "+" + tLRPC$User.phone;
        }
        ContentProviderOperation.Builder newInsert3 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert3.withValueBackReference("raw_contact_id", 0);
        newInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        newInsert3.withValue("data1", Long.valueOf(tLRPC$User.id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", LocaleController.formatString("ContactShortcutMessage", 2131625253, str));
        newInsert3.withValue("data4", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert4.withValueBackReference("raw_contact_id", 0);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(tLRPC$User.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", 2131625255, str));
        newInsert4.withValue("data4", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert5.withValueBackReference("raw_contact_id", 0);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(tLRPC$User.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", 2131625254, str));
        newInsert5.withValue("data4", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert5.build());
        try {
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch != null && applyBatch.length > 0 && applyBatch[0].uri != null) {
                j = Long.parseLong(applyBatch[0].uri.getLastPathSegment());
            }
        } catch (Exception unused2) {
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j;
    }

    private void deleteContactFromPhoneBook(long j) {
        if (!hasContactsPermission()) {
            return;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        try {
            ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build();
            contentResolver.delete(build, "sync2 = " + j, null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
    }

    public void markAsContacted(String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda0(str));
    }

    public static /* synthetic */ void lambda$markAsContacted$49(String str) {
        Uri parse = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(parse, contentValues, null, null);
    }

    public void addContact(TLRPC$User tLRPC$User, boolean z) {
        if (tLRPC$User == null) {
            return;
        }
        TLRPC$TL_contacts_addContact tLRPC$TL_contacts_addContact = new TLRPC$TL_contacts_addContact();
        tLRPC$TL_contacts_addContact.id = getMessagesController().getInputUser(tLRPC$User);
        tLRPC$TL_contacts_addContact.first_name = tLRPC$User.first_name;
        tLRPC$TL_contacts_addContact.last_name = tLRPC$User.last_name;
        String str = tLRPC$User.phone;
        tLRPC$TL_contacts_addContact.phone = str;
        tLRPC$TL_contacts_addContact.add_phone_privacy_exception = z;
        if (str == null) {
            tLRPC$TL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tLRPC$TL_contacts_addContact.phone.startsWith("+")) {
            tLRPC$TL_contacts_addContact.phone = "+" + tLRPC$TL_contacts_addContact.phone;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_addContact, new ContactsController$$ExternalSyntheticLambda61(this, tLRPC$User), 6);
    }

    public /* synthetic */ void lambda$addContact$52(TLRPC$User tLRPC$User, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int indexOf;
        if (tLRPC$TL_error != null) {
            return;
        }
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        getMessagesController().processUpdates(tLRPC$Updates, false);
        for (int i = 0; i < tLRPC$Updates.users.size(); i++) {
            TLRPC$User tLRPC$User2 = tLRPC$Updates.users.get(i);
            if (tLRPC$User2.id == tLRPC$User.id) {
                Utilities.phoneBookQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda42(this, tLRPC$User2));
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = tLRPC$User2.id;
                ArrayList<TLRPC$TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tLRPC$TL_contact);
                getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(tLRPC$User2.phone)) {
                    formatName(tLRPC$User2.first_name, tLRPC$User2.last_name);
                    getMessagesStorage().applyPhoneBookUpdates(tLRPC$User2.phone, "");
                    Contact contact = this.contactsBookSPhones.get(tLRPC$User2.phone);
                    if (contact != null && (indexOf = contact.shortPhones.indexOf(tLRPC$User2.phone)) != -1) {
                        contact.phoneDeleted.set(indexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda41(this, tLRPC$Updates));
    }

    public /* synthetic */ void lambda$addContact$50(TLRPC$User tLRPC$User) {
        addContactToPhoneBook(tLRPC$User, true);
    }

    public /* synthetic */ void lambda$addContact$51(TLRPC$Updates tLRPC$Updates) {
        for (int i = 0; i < tLRPC$Updates.users.size(); i++) {
            TLRPC$User tLRPC$User = tLRPC$Updates.users.get(i);
            if (tLRPC$User.contact && this.contactsDict.get(Long.valueOf(tLRPC$User.id)) == null) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = tLRPC$User.id;
                this.contacts.add(tLRPC$TL_contact);
                this.contactsDict.put(Long.valueOf(tLRPC$TL_contact.user_id), tLRPC$TL_contact);
            }
        }
        buildContactsSectionsArrays(true);
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void deleteContact(ArrayList<TLRPC$User> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC$TL_contacts_deleteContacts tLRPC$TL_contacts_deleteContacts = new TLRPC$TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$User tLRPC$User = arrayList.get(i);
            TLRPC$InputUser inputUser = getMessagesController().getInputUser(tLRPC$User);
            if (inputUser != null) {
                tLRPC$User.contact = false;
                arrayList2.add(Long.valueOf(tLRPC$User.id));
                tLRPC$TL_contacts_deleteContacts.id.add(inputUser);
            }
        }
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_deleteContacts, new ContactsController$$ExternalSyntheticLambda59(this, arrayList2, arrayList, z, arrayList.get(0).first_name));
    }

    public /* synthetic */ void lambda$deleteContact$55(ArrayList arrayList, ArrayList arrayList2, boolean z, String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int indexOf;
        if (tLRPC$TL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new ContactsController$$ExternalSyntheticLambda17(this, arrayList2));
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC$User tLRPC$User = (TLRPC$User) arrayList2.get(i);
            if (!TextUtils.isEmpty(tLRPC$User.phone)) {
                getMessagesStorage().applyPhoneBookUpdates(tLRPC$User.phone, "");
                Contact contact = this.contactsBookSPhones.get(tLRPC$User.phone);
                if (contact != null && (indexOf = contact.shortPhones.indexOf(tLRPC$User.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda24(this, arrayList2, z, str));
    }

    public /* synthetic */ void lambda$deleteContact$53(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            deleteContactFromPhoneBook(((TLRPC$User) it.next()).id);
        }
    }

    public /* synthetic */ void lambda$deleteContact$54(ArrayList arrayList, boolean z, String str) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            TLRPC$User tLRPC$User = (TLRPC$User) it.next();
            TLRPC$TL_contact tLRPC$TL_contact = this.contactsDict.get(Long.valueOf(tLRPC$User.id));
            if (tLRPC$TL_contact != null) {
                this.contacts.remove(tLRPC$TL_contact);
                this.contactsDict.remove(Long.valueOf(tLRPC$User.id));
                z2 = true;
            }
        }
        if (z2) {
            buildContactsSectionsArrays(false);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", 2131625469, str));
        }
    }

    private void reloadContactsStatuses() {
        saveContactsLoadTime();
        getMessagesController().clearFullUsers();
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC$TL_contacts_getStatuses(), new ContactsController$$ExternalSyntheticLambda57(this, edit));
    }

    public /* synthetic */ void lambda$reloadContactsStatuses$57(SharedPreferences.Editor editor, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda13(this, editor, tLObject));
        }
    }

    public /* synthetic */ void lambda$reloadContactsStatuses$56(SharedPreferences.Editor editor, TLObject tLObject) {
        editor.remove("needGetStatuses").commit();
        TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
        if (!tLRPC$Vector.objects.isEmpty()) {
            ArrayList<TLRPC$User> arrayList = new ArrayList<>();
            Iterator<Object> it = tLRPC$Vector.objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                TLRPC$TL_user tLRPC$TL_user = new TLRPC$TL_user();
                TLRPC$TL_contactStatus tLRPC$TL_contactStatus = (TLRPC$TL_contactStatus) next;
                if (tLRPC$TL_contactStatus != null) {
                    TLRPC$UserStatus tLRPC$UserStatus = tLRPC$TL_contactStatus.status;
                    if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusRecently) {
                        tLRPC$UserStatus.expires = -100;
                    } else if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusLastWeek) {
                        tLRPC$UserStatus.expires = -101;
                    } else if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusLastMonth) {
                        tLRPC$UserStatus.expires = -102;
                    }
                    TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contactStatus.user_id));
                    if (user != null) {
                        user.status = tLRPC$TL_contactStatus.status;
                    }
                    tLRPC$TL_user.status = tLRPC$TL_contactStatus.status;
                    arrayList.add(tLRPC$TL_user);
                }
            }
            getMessagesStorage().updateUsers(arrayList, true, true, true);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_STATUS));
    }

    public void loadPrivacySettings() {
        if (this.loadingDeleteInfo == 0) {
            this.loadingDeleteInfo = 1;
            getConnectionsManager().sendRequest(new TLRPC$TL_account_getAccountTTL(), new ContactsController$$ExternalSyntheticLambda53(this));
        }
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TLRPC$TL_account_getGlobalPrivacySettings(), new ContactsController$$ExternalSyntheticLambda52(this));
        }
        int i = 0;
        while (true) {
            int[] iArr = this.loadingPrivacyInfo;
            if (i < iArr.length) {
                if (iArr[i] == 0) {
                    iArr[i] = 1;
                    TLRPC$TL_account_getPrivacy tLRPC$TL_account_getPrivacy = new TLRPC$TL_account_getPrivacy();
                    switch (i) {
                        case 0:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyStatusTimestamp();
                            break;
                        case 1:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyChatInvite();
                            break;
                        case 2:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneCall();
                            break;
                        case 3:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneP2P();
                            break;
                        case 4:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyProfilePhoto();
                            break;
                        case 5:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyForwards();
                            break;
                        case 6:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneNumber();
                            break;
                        case 7:
                        default:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyAddedByPhone();
                            break;
                        case 8:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyVoiceMessages();
                            break;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_account_getPrivacy, new ContactsController$$ExternalSyntheticLambda55(this, i));
                }
                i++;
            } else {
                getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            }
        }
    }

    public /* synthetic */ void lambda$loadPrivacySettings$59(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda38(this, tLRPC$TL_error, tLObject));
    }

    public /* synthetic */ void lambda$loadPrivacySettings$58(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.deleteAccountTTL = ((TLRPC$TL_accountDaysTTL) tLObject).days;
            this.loadingDeleteInfo = 2;
        } else {
            this.loadingDeleteInfo = 0;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public /* synthetic */ void lambda$loadPrivacySettings$61(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda37(this, tLRPC$TL_error, tLObject));
    }

    public /* synthetic */ void lambda$loadPrivacySettings$60(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.globalPrivacySettings = (TLRPC$TL_globalPrivacySettings) tLObject;
            this.loadingGlobalSettings = 2;
        } else {
            this.loadingGlobalSettings = 0;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public /* synthetic */ void lambda$loadPrivacySettings$63(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new ContactsController$$ExternalSyntheticLambda39(this, tLRPC$TL_error, tLObject, i));
    }

    public /* synthetic */ void lambda$loadPrivacySettings$62(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_account_privacyRules tLRPC$TL_account_privacyRules = (TLRPC$TL_account_privacyRules) tLObject;
            getMessagesController().putUsers(tLRPC$TL_account_privacyRules.users, false);
            getMessagesController().putChats(tLRPC$TL_account_privacyRules.chats, false);
            switch (i) {
                case 0:
                    this.lastseenPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 1:
                    this.groupPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 2:
                    this.callPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 3:
                    this.p2pPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 4:
                    this.profilePhotoPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 5:
                    this.forwardsPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 6:
                    this.phonePrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 7:
                default:
                    this.addedByPhonePrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 8:
                    this.voiceMessagesRules = tLRPC$TL_account_privacyRules.rules;
                    break;
            }
            this.loadingPrivacyInfo[i] = 2;
        } else {
            this.loadingPrivacyInfo[i] = 0;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
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

    public TLRPC$TL_globalPrivacySettings getGlobalPrivacySettings() {
        return this.globalPrivacySettings;
    }

    public ArrayList<TLRPC$PrivacyRule> getPrivacyRules(int i) {
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
            default:
                return null;
        }
    }

    public void setPrivacyRules(ArrayList<TLRPC$PrivacyRule> arrayList, int i) {
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
        }
        getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
        reloadContactsStatuses();
    }

    public void createOrUpdateConnectionServiceContact(long j, String str, String str2) {
        String str3;
        String str4;
        int i;
        Cursor cursor;
        ArrayList<ContentProviderOperation> arrayList;
        if (!hasContactsPermission()) {
            return;
        }
        try {
            ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
            ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>();
            Uri build = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri build2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Account account = this.systemAccount;
            Cursor query = contentResolver.query(build, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (query != null && query.moveToFirst()) {
                i = query.getInt(0);
                str3 = "account_type";
                str4 = "account_name";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_type", this.systemAccount.type);
                contentValues.put("account_name", this.systemAccount.name);
                str3 = "account_type";
                contentValues.put("group_visible", (Integer) 0);
                str4 = "account_name";
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                i = Integer.parseInt(contentResolver.insert(build, contentValues).getLastPathSegment());
            }
            if (query != null) {
                query.close();
            }
            String str5 = str3;
            String str6 = str4;
            Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
            int size = arrayList2.size();
            int i2 = i;
            if (query2 != null && query2.moveToFirst()) {
                int i3 = query2.getInt(0);
                ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(build2);
                cursor = query2;
                arrayList = arrayList2;
                arrayList.add(newUpdate.withSelection("_id=?", new String[]{i3 + ""}).withValue("deleted", 0).build());
                ContentProviderOperation.Builder newUpdate2 = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
                ContentProviderOperation.Builder withSelection = newUpdate2.withSelection("raw_contact_id=? AND mimetype=?", new String[]{i3 + "", "vnd.android.cursor.item/phone_v2"});
                arrayList.add(withSelection.withValue("data1", "+99084" + j).build());
                ContentProviderOperation.Builder newUpdate3 = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
                arrayList.add(newUpdate3.withSelection("raw_contact_id=? AND mimetype=?", new String[]{i3 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
            } else {
                cursor = query2;
                arrayList = arrayList2;
                arrayList.add(ContentProviderOperation.newInsert(build2).withValue(str5, this.systemAccount.type).withValue(str6, this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2");
                arrayList.add(withValue.withValue("data1", "+99084" + j).build());
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i2)).build());
            }
            if (cursor != null) {
                cursor.close();
            }
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void deleteConnectionServiceContact() {
        if (!hasContactsPermission()) {
            return;
        }
        try {
            ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
            Account account = this.systemAccount;
            Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (query == null || !query.moveToFirst()) {
                if (query == null) {
                    return;
                }
                query.close();
                return;
            }
            int i = query.getInt(0);
            query.close();
            Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
            if (query2 == null || !query2.moveToFirst()) {
                if (query2 == null) {
                    return;
                }
                query2.close();
                return;
            }
            int i2 = query2.getInt(0);
            query2.close();
            Uri uri = ContactsContract.RawContacts.CONTENT_URI;
            contentResolver.delete(uri, "_id=?", new String[]{i2 + ""});
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static String formatName(String str, String str2) {
        return formatName(str, str2, 0);
    }

    public static String formatName(String str, String str2, int i) {
        if (str != null) {
            str = str.trim();
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (LocaleController.nameDisplayOrder == 1) {
            if (str != null && str.length() > 0) {
                if (i > 0 && str.length() > i + 2) {
                    return str.substring(0, i);
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
                    return str2.substring(0, i);
                }
                sb.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i > 0 && str2.length() > i + 2) {
                return str2.substring(0, i);
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
                return str.substring(0, i);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
