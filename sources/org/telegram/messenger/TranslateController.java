package org.telegram.messenger;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.icu.text.Collator;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.RestrictedLanguagesSelectActivity;

/* loaded from: classes3.dex */
public class TranslateController extends BaseController {
    private static final int GROUPING_TRANSLATIONS_TIMEOUT = 80;
    private static final int MAX_MESSAGES_PER_REQUEST = 20;
    private static final int MAX_SYMBOLS_PER_REQUEST = 25000;
    private static final float REQUIRED_MIN_MESSAGES_TRANSLATABLE_AUTOTRANSLATE = 2.0f;
    private static final float REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN = 0.65f;
    private static final float REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN_AUTOTRANSLATE = 0.8f;
    private static final float REQUIRED_PERCENTAGE_MESSAGES_TRANSLATABLE = 0.6f;
    private static final int REQUIRED_TOTAL_MESSAGES_CHECKED = 6;
    private static final int REQUIRED_TOTAL_MESSAGES_CHECKED_AUTOTRANSLATE = 2;
    public static final String UNKNOWN_LANGUAGE = "und";
    private Boolean chatTranslateEnabled;
    private Boolean contextTranslateEnabled;
    private final HashMap<Long, String> detectedDialogLanguage;
    private final HashSet<MessageKey> detectingPhotos;
    private final HashSet<StoryKey> detectingStories;
    private final Set<Long> hideTranslateDialogs;
    private final HashMap<Long, HashMap<Integer, MessageObject>> keptReplyMessageObjects;
    private final HashSet<Integer> loadingSummarizations;
    private final Set<Integer> loadingTranscriptionTranslations;
    private final Set<Integer> loadingTranslations;
    private MessagesController messagesController;
    private ArrayList<Integer> pendingLanguageChecks;
    private final HashMap<Long, ArrayList<PendingPollTranslation>> pendingPollTranslations;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranscriptionsTranslations;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranslations;
    private final HashMap<Long, TranslatableDecision> translatableDialogMessages;
    private final Set<Long> translatableDialogs;
    private final HashMap<Long, String> translateDialogLanguage;
    private final LongSparseArray<Boolean> translatingDialogs;
    private final HashSet<MessageKey> translatingPhotos;
    private final HashSet<StoryKey> translatingStories;
    private static final List<String> languagesOrder = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    private static final List<String> allLanguages = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", ImageLoader.AUTOPLAY_FILTER_NONLOOP, "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pt-br", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    private static LinkedHashSet<String> suggestedLanguageCodes = null;

    public static class Language {
        public String code;
        public String displayName;
        public String ownDisplayName;
        public String q;
    }

    static class TranslatableDecision {
        Set<Integer> certainlyTranslatable = new HashSet();
        Set<Integer> unknown = new HashSet();
        Set<Integer> certainlyNotTranslatable = new HashSet();

        TranslatableDecision() {
        }
    }

    public TranslateController(MessagesController messagesController) {
        super(messagesController.currentAccount);
        this.translatingDialogs = new LongSparseArray<>();
        this.translatableDialogs = new HashSet();
        this.translatableDialogMessages = new HashMap<>();
        this.translateDialogLanguage = new HashMap<>();
        this.detectedDialogLanguage = new HashMap<>();
        this.keptReplyMessageObjects = new HashMap<>();
        this.hideTranslateDialogs = new HashSet();
        this.pendingLanguageChecks = new ArrayList<>();
        this.loadingTranslations = new HashSet();
        this.loadingTranscriptionTranslations = new HashSet();
        this.pendingTranslations = new HashMap<>();
        this.pendingTranscriptionsTranslations = new HashMap<>();
        this.loadingSummarizations = new HashSet<>();
        this.pendingPollTranslations = new HashMap<>();
        this.detectingStories = new HashSet<>();
        this.translatingStories = new HashSet<>();
        this.detectingPhotos = new HashSet<>();
        this.translatingPhotos = new HashSet<>();
        this.messagesController = messagesController;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.loadTranslatingDialogsCached();
            }
        }, 150L);
    }

    public boolean isFeatureAvailable() {
        return isChatTranslateEnabled() && UserConfig.getInstance(this.currentAccount).isPremium();
    }

    public boolean isFeatureAvailable(long j) {
        if (!isChatTranslateEnabled()) {
            return false;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        return UserConfig.getInstance(this.currentAccount).isPremium() || (chat != null && chat.autotranslation);
    }

    public boolean isChatTranslateEnabled() {
        if (!getMessagesController().isTranslationsAutoEnabled()) {
            return false;
        }
        if (this.chatTranslateEnabled == null) {
            this.chatTranslateEnabled = Boolean.valueOf(this.messagesController.getMainSettings().getBoolean("translate_chat_button", true));
        }
        return this.chatTranslateEnabled.booleanValue();
    }

    public boolean isContextTranslateEnabled() {
        if (!getMessagesController().isTranslationsManualEnabled()) {
            return false;
        }
        if (this.contextTranslateEnabled == null) {
            this.contextTranslateEnabled = Boolean.valueOf(this.messagesController.getMainSettings().getBoolean("translate_button", MessagesController.getGlobalMainSettings().getBoolean("translate_button", false)));
        }
        return this.contextTranslateEnabled.booleanValue();
    }

    public void setContextTranslateEnabled(boolean z) {
        SharedPreferences.Editor edit = this.messagesController.getMainSettings().edit();
        this.contextTranslateEnabled = Boolean.valueOf(z);
        edit.putBoolean("translate_button", z).apply();
    }

    public void setChatTranslateEnabled(boolean z) {
        SharedPreferences.Editor edit = this.messagesController.getMainSettings().edit();
        this.chatTranslateEnabled = Boolean.valueOf(z);
        edit.putBoolean("translate_chat_button", z).apply();
    }

    public static boolean isSummarizable(MessageObject messageObject) {
        TLRPC.Message message;
        int i;
        return (messageObject == null || (message = messageObject.messageOwner) == null || message.summary_from_language == null || messageObject.isOutOwner() || messageObject.isRestrictedMessage || messageObject.isSponsored() || ((i = messageObject.type) != 0 && i != 3 && i != 1 && i != 9 && i != 14 && i != 17) || TextUtils.isEmpty(messageObject.messageOwner.message) || messageObject.messageOwner.message.length() <= 100) ? false : true;
    }

    public static boolean isTranslatable(MessageObject messageObject) {
        int i;
        if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner() && !messageObject.isRestrictedMessage && !messageObject.isSponsored() && ((i = messageObject.type) == 0 || i == 3 || i == 1 || i == 2 || i == 5 || i == 9 || i == 14 || i == 17)) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.message) || (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                return true;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message.voiceTranscriptionOpen && !TextUtils.isEmpty(message.voiceTranscription) && messageObject.messageOwner.voiceTranscriptionFinal) {
                return true;
            }
        }
        return false;
    }

    public boolean isDialogTranslatable(long j) {
        return this.translatableDialogs.contains(Long.valueOf(j)) && isFeatureAvailable(j) && !DialogObject.isEncryptedDialog(j) && getUserConfig().getClientUserId() != j;
    }

    public boolean isTranslateDialogHidden(long j) {
        if (this.hideTranslateDialogs.contains(Long.valueOf(j))) {
            return true;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
        if (chatFull != null) {
            return chatFull.translations_disabled;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
        if (userFull != null) {
            return userFull.translations_disabled;
        }
        return false;
    }

    private boolean isChatAutoTranslated(long j) {
        TLRPC.Chat chat;
        return isDialogTranslatable(j) && (chat = getMessagesController().getChat(Long.valueOf(-j))) != null && chat.autotranslation;
    }

    public boolean isTranslatingDialog(long j) {
        return isFeatureAvailable(j) && this.translatingDialogs.get(j, Boolean.valueOf(isChatAutoTranslated(j))).booleanValue();
    }

    public void toggleTranslatingDialog(long j) {
        toggleTranslatingDialog(j, !isTranslatingDialog(j));
    }

    public boolean toggleTranslatingDialog(long j, boolean z) {
        boolean z2 = false;
        boolean isTranslatingDialog = isTranslatingDialog(j);
        if (z && !isTranslatingDialog) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool);
        } else {
            if (!z && isTranslatingDialog) {
                LongSparseArray<Boolean> longSparseArray2 = this.translatingDialogs;
                Boolean bool2 = Boolean.FALSE;
                longSparseArray2.put(j, bool2);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool2);
                cancelTranslations(j);
            }
            saveTranslatingDialogsCache();
            return z2;
        }
        z2 = true;
        saveTranslatingDialogsCache();
        return z2;
    }

    private int hash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static String currentLanguage() {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        return str != null ? str.split("_")[0] : str;
    }

    public String getDialogTranslateTo(long j) {
        String str = this.translateDialogLanguage.get(Long.valueOf(j));
        if (str == null && ((str = TranslateAlert2.getToLanguage()) == null || str.equals(getDialogDetectedLanguage(j)))) {
            str = currentLanguage();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public void setDialogTranslateTo(final long j, final String str) {
        Boolean bool;
        if (TextUtils.equals(getDialogTranslateTo(j), str)) {
            return;
        }
        if (isTranslatingDialog(j)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateController.this.lambda$setDialogTranslateTo$0(j, str);
                }
            }, 150L);
        } else {
            synchronized (this) {
                this.translateDialogLanguage.put(Long.valueOf(j), str);
            }
        }
        cancelTranslations(j);
        synchronized (this) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.FALSE;
            longSparseArray.put(j, bool);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool);
        TranslateAlert2.setToLanguage(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDialogTranslateTo$0(long j, String str) {
        Boolean bool;
        synchronized (this) {
            this.translateDialogLanguage.put(Long.valueOf(j), str);
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.TRUE;
            longSparseArray.put(j, bool);
            saveTranslatingDialogsCache();
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool);
    }

    public void updateDialogFull(long j) {
        boolean z;
        if (isFeatureAvailable(j) && isDialogTranslatable(j)) {
            boolean contains = this.hideTranslateDialogs.contains(Long.valueOf(j));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                z = chatFull.translations_disabled;
            } else {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
                z = userFull != null ? userFull.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z) {
                        this.hideTranslateDialogs.add(Long.valueOf(j));
                        this.translatingDialogs.remove(j);
                    } else {
                        this.hideTranslateDialogs.remove(Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (contains != z) {
                saveTranslatingDialogsCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.valueOf(isTranslatingDialog(j)));
            }
        }
    }

    public void setHideTranslateDialog(long j, boolean z) {
        setHideTranslateDialog(j, z, false);
    }

    public void setHideTranslateDialog(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().getInputPeer(j);
        tL_messages_togglePeerTranslations.disabled = z;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
        if (chatFull != null) {
            chatFull.translations_disabled = z;
            getMessagesStorage().updateChatInfo(chatFull, true);
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
        if (userFull != null) {
            userFull.translations_disabled = z;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        synchronized (this) {
            try {
                if (z) {
                    this.hideTranslateDialogs.add(Long.valueOf(j));
                    this.translatingDialogs.remove(j);
                } else {
                    this.hideTranslateDialogs.remove(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        saveTranslatingDialogsCache();
        if (z2) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.valueOf(isTranslatingDialog(j)));
    }

    public static ArrayList<Language> getLanguages() {
        final Collator collator;
        ArrayList<Language> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            List<String> list = allLanguages;
            if (i >= list.size()) {
                break;
            }
            Language language = new Language();
            String str = list.get(i);
            language.code = str;
            if ("no".equals(str)) {
                language.code = "nb";
            }
            language.displayName = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(language.code));
            language.ownDisplayName = TranslateAlert2.capitalFirst(TranslateAlert2.systemLanguageName(language.code, true));
            if (language.displayName != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.displayName);
                sb.append(" ");
                String str2 = language.ownDisplayName;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                language.q = sb.toString().toLowerCase();
                arrayList.add(language);
            }
            i++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            collator = Collator.getInstance(Locale.getDefault());
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$getLanguages$1;
                    lambda$getLanguages$1 = TranslateController.lambda$getLanguages$1(collator, (TranslateController.Language) obj, (TranslateController.Language) obj2);
                    return lambda$getLanguages$1;
                }
            });
        } else {
            Collections.sort(arrayList, Comparator$-CC.comparing(new Function() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda25
                public /* synthetic */ Function andThen(Function function) {
                    return Function$-CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str3;
                    str3 = ((TranslateController.Language) obj).displayName;
                    return str3;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$-CC.$default$compose(this, function);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getLanguages$1(Collator collator, Language language, Language language2) {
        int compare;
        compare = collator.compare(language.displayName, language2.displayName);
        return compare;
    }

    public static void invalidateSuggestedLanguageCodes() {
        suggestedLanguageCodes = null;
    }

    public static void analyzeSuggestedLanguageCodes() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        try {
            linkedHashSet.add(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            linkedHashSet.addAll(RestrictedLanguagesSelectActivity.getRestrictedLanguages());
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
            Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (locale != null && locale.contains("_")) {
                            locale = locale.split("_")[0];
                        }
                        if (TranslateAlert2.languageName(locale) != null) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        suggestedLanguageCodes = linkedHashSet;
    }

    public static ArrayList<Language> getSuggestedLanguages(String str) {
        ArrayList<Language> arrayList = new ArrayList<>();
        if (suggestedLanguageCodes == null) {
            analyzeSuggestedLanguageCodes();
            if (suggestedLanguageCodes == null) {
                return arrayList;
            }
        }
        Iterator<String> it = suggestedLanguageCodes.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.equals(next, str) && (!"no".equals(str) || !"nb".equals(next))) {
                if (!"nb".equals(str) || !"no".equals(next)) {
                    Language language = new Language();
                    language.code = next;
                    if ("no".equals(next)) {
                        language.code = "nb";
                    }
                    language.displayName = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(language.code));
                    language.ownDisplayName = TranslateAlert2.capitalFirst(TranslateAlert2.systemLanguageName(language.code, true));
                    if (language.displayName != null) {
                        language.q = (language.displayName + " " + language.ownDisplayName).toLowerCase();
                        arrayList.add(language);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<LocaleController.LocaleInfo> getLocales() {
        String str;
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>(LocaleController.getInstance().languagesDict.values());
        int i = 0;
        while (i < arrayList.size()) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i);
            if (localeInfo == null || (((str = localeInfo.shortName) != null && str.endsWith("_raw")) || !"remote".equals(localeInfo.pathToFile))) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        final LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$getLocales$3;
                lambda$getLocales$3 = TranslateController.lambda$getLocales$3(LocaleController.LocaleInfo.this, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$getLocales$3;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getLocales$3(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
        if (localeInfo2 == localeInfo) {
            return -1;
        }
        if (localeInfo3 == localeInfo) {
            return 1;
        }
        List<String> list = languagesOrder;
        int indexOf = list.indexOf(localeInfo2.pluralLangCode);
        int indexOf2 = list.indexOf(localeInfo3.pluralLangCode);
        if (indexOf >= 0 && indexOf2 >= 0) {
            return indexOf - indexOf2;
        }
        if (indexOf >= 0) {
            return -1;
        }
        if (indexOf2 >= 0) {
            return 1;
        }
        int i = localeInfo2.serverIndex;
        int i2 = localeInfo3.serverIndex;
        if (i == i2) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void checkRestrictedLanguagesUpdate() {
        synchronized (this) {
            try {
                this.translatableDialogMessages.clear();
                ArrayList arrayList = new ArrayList();
                for (Long l : this.translatableDialogs) {
                    long longValue = l.longValue();
                    String str = this.detectedDialogLanguage.get(l);
                    if (str != null && isLanguageRestricted(str)) {
                        cancelTranslations(longValue);
                        this.translatingDialogs.remove(longValue);
                        arrayList.add(l);
                    }
                }
                this.translatableDialogs.clear();
                saveTranslatingDialogsCache();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    l2.longValue();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, l2, Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getDialogDetectedLanguage(long j) {
        return this.detectedDialogLanguage.get(Long.valueOf(j));
    }

    public void checkTranslation(MessageObject messageObject, boolean z) {
        checkTranslation(messageObject, z, false);
    }

    private void checkTranslation(final MessageObject messageObject, boolean z, final boolean z2) {
        PollText pollText;
        PollText pollText2;
        MessageObject findReplyMessageObject;
        MessageObject messageObject2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        if (z) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.summarizedOpen && message.summaryText == null && !isTranslatingDialog(messageObject.getDialogId())) {
                pushToSummarize(messageObject, null, new Utilities.Callback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda32
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TranslateController.this.lambda$checkTranslation$4(messageObject, dialogId, (TLRPC.TL_textWithEntities) obj);
                    }
                });
            }
        }
        if (isFeatureAvailable(dialogId)) {
            if (!z2 && (messageObject2 = messageObject.replyMessageObject) != null) {
                checkTranslation(messageObject2, z, true);
            }
            if (isTranslatable(messageObject)) {
                if (!isTranslatingDialog(dialogId)) {
                    checkLanguage(messageObject);
                    return;
                }
                if (isTranslateDialogHidden(dialogId)) {
                    return;
                }
                final String dialogTranslateTo = getDialogTranslateTo(dialogId);
                if (!z2) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (((((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? message2.translatedVoiceTranscription : message2.translatedText) == null && message2.translatedPoll == null) || (((pollText2 = message2.translatedPoll) != null && !PollText.isFullyTranslated(messageObject, pollText2)) || !dialogTranslateTo.equals(messageObject.messageOwner.translatedToLanguage))) && (findReplyMessageObject = findReplyMessageObject(dialogId, messageObject.getId())) != null) {
                        TLRPC.Message message3 = messageObject.messageOwner;
                        TLRPC.Message message4 = findReplyMessageObject.messageOwner;
                        message3.translatedToLanguage = message4.translatedToLanguage;
                        message3.translatedText = message4.translatedText;
                        message3.translatedPoll = message4.translatedPoll;
                        messageObject = findReplyMessageObject;
                    }
                }
                if (z && isTranslatingDialog(dialogId)) {
                    TLRPC.Message message5 = messageObject.messageOwner;
                    if (message5.summarizedOpen) {
                        if (message5.translatedSummaryText == null || !dialogTranslateTo.equals(message5.translatedSummaryLanguage)) {
                            final MessageObject messageObject3 = messageObject;
                            pushToSummarize(messageObject, dialogTranslateTo, new Utilities.Callback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda33
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    TranslateController.this.lambda$checkTranslation$5(messageObject3, dialogTranslateTo, dialogId, (TLRPC.TL_textWithEntities) obj);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!(((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) && (((pollText = message5.translatedPoll) == null || PollText.isFullyTranslated(messageObject, pollText)) && dialogTranslateTo.equals(messageObject.messageOwner.translatedToLanguage))) {
                        if (z2) {
                            keepReplyMessage(messageObject);
                            return;
                        }
                        return;
                    }
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslating, messageObject);
                    if (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll) {
                        final MessageObject messageObject4 = messageObject;
                        pushPollToTranslate(messageObject, dialogTranslateTo, new Utilities.Callback3() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda34
                            @Override // org.telegram.messenger.Utilities.Callback3
                            public final void run(Object obj, Object obj2, Object obj3) {
                                TranslateController.this.lambda$checkTranslation$6(messageObject4, z2, dialogId, (Integer) obj, (TranslateController.PollText) obj2, (String) obj3);
                            }
                        });
                    } else {
                        final MessageObject messageObject5 = messageObject;
                        pushToTranslate(messageObject, dialogTranslateTo, new Utilities.Callback4() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda35
                            @Override // org.telegram.messenger.Utilities.Callback4
                            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                                TranslateController.this.lambda$checkTranslation$7(messageObject5, z2, dialogId, (Boolean) obj, (Integer) obj2, (TLRPC.TL_textWithEntities) obj3, (String) obj4);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$4(MessageObject messageObject, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        message.summaryText = tL_textWithEntities;
        if (tL_textWithEntities == null) {
            message.summarizedOpen = false;
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$5(MessageObject messageObject, String str, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        if (tL_textWithEntities == null) {
            str = null;
        }
        message.translatedSummaryLanguage = str;
        message.translatedSummaryText = tL_textWithEntities;
        if (tL_textWithEntities == null) {
            message.summarizedOpen = false;
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$6(MessageObject messageObject, boolean z, long j, Integer num, PollText pollText, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " poll but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = pollText;
        if (z) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    message2.translatedToLanguage = str;
                    message2.translatedText = null;
                    message2.translatedVoiceTranscription = null;
                    message2.translatedPoll = pollText;
                    if (messageObject2.updateTranslation()) {
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$7(MessageObject messageObject, boolean z, long j, Boolean bool, Integer num, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " but got " + num + "!");
        }
        messageObject.messageOwner.translatedToLanguage = str;
        if (bool.booleanValue()) {
            messageObject.messageOwner.translatedVoiceTranscription = tL_textWithEntities;
        } else {
            messageObject.messageOwner.translatedText = tL_textWithEntities;
        }
        messageObject.messageOwner.translatedPoll = null;
        if (z) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    messageObject2.messageOwner.translatedToLanguage = str;
                    if (bool.booleanValue()) {
                        messageObject2.messageOwner.translatedVoiceTranscription = tL_textWithEntities;
                    } else {
                        messageObject2.messageOwner.translatedText = tL_textWithEntities;
                    }
                    messageObject2.messageOwner.translatedPoll = null;
                    if (messageObject2.updateTranslation()) {
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void invalidateTranslation(final MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        if (isFeatureAvailable(dialogId)) {
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = null;
            message.translatedText = null;
            message.translatedVoiceTranscription = null;
            message.translatedPoll = null;
            message.summaryText = null;
            message.translatedSummaryText = null;
            message.translatedSummaryLanguage = null;
            getMessagesStorage().updateMessageCustomParams(dialogId, messageObject.messageOwner);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateController.this.lambda$invalidateTranslation$8(messageObject, dialogId);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invalidateTranslation$8(MessageObject messageObject, long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.FALSE, Boolean.valueOf(isTranslatingDialog(j)));
    }

    public void checkDialogMessage(long j) {
        if (isFeatureAvailable(j)) {
            checkDialogMessageSure(j);
        }
    }

    public void checkDialogMessageSure(final long j) {
        if (this.translatingDialogs.get(j, Boolean.valueOf(isChatAutoTranslated(j))).booleanValue()) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateController.this.lambda$checkDialogMessageSure$10(j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDialogMessageSure$10(long j) {
        final ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.get(j);
        if (arrayList == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            if (messageObject == null || messageObject.messageOwner == null) {
                arrayList2.add(null);
            } else {
                arrayList2.add(getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId()));
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$checkDialogMessageSure$9(arrayList2, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDialogMessageSure$9(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Message message;
        boolean z = false;
        for (int i = 0; i < Math.min(arrayList.size(), arrayList2.size()); i++) {
            MessageObject messageObject = (MessageObject) arrayList2.get(i);
            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i);
            if (messageObject != null && (message = messageObject.messageOwner) != null && message2 != null) {
                message.translatedText = message2.translatedText;
                message.translatedPoll = message2.translatedPoll;
                message.translatedToLanguage = message2.translatedToLanguage;
                if (messageObject.updateTranslation(false)) {
                    z = true;
                }
            }
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
        }
    }

    public void cleanup() {
        cancelAllTranslations();
        resetTranslatingDialogsCache();
        this.translatingDialogs.clear();
        this.translatableDialogs.clear();
        this.translatableDialogMessages.clear();
        this.translateDialogLanguage.clear();
        this.detectedDialogLanguage.clear();
        this.keptReplyMessageObjects.clear();
        this.hideTranslateDialogs.clear();
        this.loadingTranslations.clear();
        this.loadingTranscriptionTranslations.clear();
    }

    public void reset() {
        this.translatableDialogMessages.clear();
        this.detectedDialogLanguage.clear();
    }

    private void checkLanguage(final MessageObject messageObject) {
        TLRPC.Message message;
        if (LanguageDetector.hasSupport() && isTranslatable(messageObject) && (message = messageObject.messageOwner) != null && !TextUtils.isEmpty(message.message)) {
            if (messageObject.messageOwner.originalLanguage != null) {
                checkDialogTranslatable(messageObject);
                return;
            }
            final long dialogId = messageObject.getDialogId();
            final int hash = hash(messageObject);
            if (isDialogTranslatable(dialogId) || this.pendingLanguageChecks.contains(Integer.valueOf(hash))) {
                return;
            }
            this.pendingLanguageChecks.add(Integer.valueOf(hash));
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateController.this.lambda$checkLanguage$15(messageObject, dialogId, hash);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$12(final MessageObject messageObject, final long j, final int i, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$checkLanguage$11(str, messageObject, j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$15(final MessageObject messageObject, final long j, final int i) {
        LanguageDetector.detectLanguage(messageObject.messageOwner.message, new LanguageDetector.StringCallback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda14
            @Override // org.telegram.messenger.LanguageDetector.StringCallback
            public final void run(String str) {
                TranslateController.this.lambda$checkLanguage$12(messageObject, j, i, str);
            }
        }, new LanguageDetector.ExceptionCallback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda15
            @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
            public final void run(Exception exc) {
                TranslateController.this.lambda$checkLanguage$14(messageObject, j, i, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$11(String str, MessageObject messageObject, long j, int i) {
        if (str == null) {
            str = UNKNOWN_LANGUAGE;
        }
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i));
        checkDialogTranslatable(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$14(final MessageObject messageObject, final long j, final int i, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$checkLanguage$13(messageObject, j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$13(MessageObject messageObject, long j, int i) {
        messageObject.messageOwner.originalLanguage = UNKNOWN_LANGUAGE;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i));
    }

    private void checkDialogTranslatable(MessageObject messageObject) {
        String str;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        TranslatableDecision translatableDecision = this.translatableDialogMessages.get(Long.valueOf(dialogId));
        if (translatableDecision == null) {
            HashMap<Long, TranslatableDecision> hashMap = this.translatableDialogMessages;
            Long valueOf = Long.valueOf(dialogId);
            TranslatableDecision translatableDecision2 = new TranslatableDecision();
            hashMap.put(valueOf, translatableDecision2);
            translatableDecision = translatableDecision2;
        }
        boolean z = false;
        boolean z2 = isTranslatable(messageObject) && ((str2 = messageObject.messageOwner.originalLanguage) == null || UNKNOWN_LANGUAGE.equals(str2));
        if (isTranslatable(messageObject) && (str = messageObject.messageOwner.originalLanguage) != null && !UNKNOWN_LANGUAGE.equals(str) && !isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
            z = true;
        }
        if (z2) {
            translatableDecision.unknown.add(Integer.valueOf(messageObject.getId()));
        } else {
            (z ? translatableDecision.certainlyTranslatable : translatableDecision.certainlyNotTranslatable).add(Integer.valueOf(messageObject.getId()));
        }
        if (!z2) {
            this.detectedDialogLanguage.put(Long.valueOf(dialogId), messageObject.messageOwner.originalLanguage);
        }
        int size = translatableDecision.certainlyTranslatable.size();
        int size2 = translatableDecision.unknown.size();
        int size3 = size + size2 + translatableDecision.certainlyNotTranslatable.size();
        boolean isChatAutoTranslated = isChatAutoTranslated(dialogId);
        if (size3 >= (isChatAutoTranslated ? 2 : 6)) {
            if (isChatAutoTranslated) {
                if (size < REQUIRED_MIN_MESSAGES_TRANSLATABLE_AUTOTRANSLATE) {
                    return;
                }
            } else if (size / (size + r2) < REQUIRED_PERCENTAGE_MESSAGES_TRANSLATABLE) {
                return;
            }
            if (size2 / size3 < (isChatAutoTranslated ? REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN_AUTOTRANSLATE : REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN)) {
                this.translatableDialogs.add(Long.valueOf(dialogId));
                this.translatableDialogMessages.remove(Long.valueOf(dialogId));
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.this.lambda$checkDialogTranslatable$16(dialogId);
                    }
                }, 450L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDialogTranslatable$16(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogIsTranslatable, Long.valueOf(j));
    }

    private void pushToSummarize(MessageObject messageObject, String str, final Utilities.Callback<TLRPC.TL_textWithEntities> callback) {
        final int hash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(str != null ? 1 : 0));
        if (this.loadingSummarizations.contains(Integer.valueOf(hash))) {
            return;
        }
        this.loadingSummarizations.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        tL_messages_summarizeText.id = messageObject.getId();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = normalizeLanguage(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda22
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TranslateController.this.lambda$pushToSummarize$18(hash, callback, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToSummarize$18(int i, Utilities.Callback callback, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        final BaseFragment safeLastFragment;
        if (tL_textWithEntities != null) {
            this.loadingSummarizations.remove(Integer.valueOf(i));
            callback.run(tL_textWithEntities);
        } else if (tL_error != null) {
            if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.SummaryLimit), LocaleController.getString(R.string.SummaryLimitUpgrade), new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda23
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.lambda$pushToSummarize$17(BaseFragment.this);
                    }
                }).setDuration(5000).show(true);
            }
            this.loadingSummarizations.remove(Integer.valueOf(i));
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pushToSummarize$17(BaseFragment baseFragment) {
        baseFragment.presentFragment(new PremiumPreviewFragment("summarize_limit"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PendingTranslation {
        ArrayList<Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        ArrayList<TLRPC.TL_textWithEntities> messageTexts;
        int reqId;
        Runnable runnable;
        int symbolsCount;

        private PendingTranslation() {
            this.messageIds = new ArrayList<>();
            this.messageTexts = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = 80;
            this.reqId = -1;
        }
    }

    private void pushToTranslate(MessageObject messageObject, String str, Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4) {
        PendingTranslation pendingTranslation;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getId() < 0 || callback4 == null) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i = 0;
        final boolean z = message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen;
        final long dialogId = messageObject.getDialogId();
        final HashMap<Long, ArrayList<PendingTranslation>> hashMap = z ? this.pendingTranscriptionsTranslations : this.pendingTranslations;
        final Set<Integer> set = z ? this.loadingTranscriptionTranslations : this.loadingTranslations;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z) {
            String str3 = messageObject.messageOwner.voiceTranscription;
            tL_textWithEntities.text = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
        } else {
            TLRPC.Message message2 = messageObject.messageOwner;
            tL_textWithEntities.text = message2.message;
            tL_textWithEntities.entities = message2.entities;
        }
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = hashMap.get(Long.valueOf(dialogId));
                if (arrayList == null) {
                    Long valueOf = Long.valueOf(dialogId);
                    ArrayList<PendingTranslation> arrayList2 = new ArrayList<>();
                    hashMap.put(valueOf, arrayList2);
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    pendingTranslation = new PendingTranslation();
                    arrayList.add(pendingTranslation);
                } else {
                    pendingTranslation = arrayList.get(arrayList.size() - 1);
                }
                if (pendingTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                    return;
                }
                if (z) {
                    String str4 = messageObject.messageOwner.voiceTranscription;
                    if (str4 != null) {
                        i = str4.length();
                    }
                } else {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3 != null && (str2 = message3.message) != null) {
                        i = str2.length();
                    } else {
                        CharSequence charSequence = messageObject.caption;
                        if (charSequence != null) {
                            i = charSequence.length();
                        } else {
                            CharSequence charSequence2 = messageObject.messageText;
                            if (charSequence2 != null) {
                                i = charSequence2.length();
                            }
                        }
                    }
                }
                if (pendingTranslation.symbolsCount + i >= MAX_SYMBOLS_PER_REQUEST || pendingTranslation.messageIds.size() + 1 >= 20) {
                    AndroidUtilities.cancelRunOnUIThread(pendingTranslation.runnable);
                    AndroidUtilities.runOnUIThread(pendingTranslation.runnable);
                    pendingTranslation = new PendingTranslation();
                    arrayList.add(pendingTranslation);
                }
                Runnable runnable = pendingTranslation.runnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                set.add(Integer.valueOf(messageObject.getId()));
                pendingTranslation.messageIds.add(Integer.valueOf(messageObject.getId()));
                FileLog.d("pending translation +" + messageObject.getId() + " message");
                pendingTranslation.messageTexts.add(tL_textWithEntities);
                pendingTranslation.callbacks.add(callback4);
                pendingTranslation.language = str;
                pendingTranslation.symbolsCount = pendingTranslation.symbolsCount + i;
                final PendingTranslation pendingTranslation2 = pendingTranslation;
                Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.this.lambda$pushToTranslate$23(hashMap, dialogId, pendingTranslation2, z, set);
                    }
                };
                pendingTranslation.runnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, pendingTranslation.delay);
                pendingTranslation.delay /= 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$23(HashMap hashMap, final long j, final PendingTranslation pendingTranslation, final boolean z, final Set set) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.remove(pendingTranslation);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(Long.valueOf(j));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String str = getMessagesController().translationsAutoEnabled;
        if ("alternative".equals(str) || "system".equals(str)) {
            final String str2 = pendingTranslation.language;
            for (int i = 0; i < pendingTranslation.messageIds.size(); i++) {
                final int intValue = pendingTranslation.messageIds.get(i).intValue();
                final Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4 = pendingTranslation.callbacks.get(i);
                TranslateAlert2.alternativeTranslate(pendingTranslation.messageTexts.get(i).text, null, str2, new Utilities.Callback2() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda12
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TranslateController.this.lambda$pushToTranslate$19(callback4, z, intValue, str2, j, (String) obj, (Boolean) obj2);
                    }
                });
            }
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (z) {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.addAll(pendingTranslation.messageTexts);
        } else {
            tL_messages_translateText.flags |= 1;
            tL_messages_translateText.peer = getMessagesController().getInputPeer(j);
            tL_messages_translateText.id = pendingTranslation.messageIds;
        }
        tL_messages_translateText.to_lang = normalizeLanguage(pendingTranslation.language);
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TranslateController.this.lambda$pushToTranslate$22(pendingTranslation, z, j, set, tLObject, tL_error);
            }
        });
        synchronized (this) {
            pendingTranslation.reqId = sendRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$19(Utilities.Callback4 callback4, boolean z, int i, String str, long j, String str2, Boolean bool) {
        if (str2 != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
        } else {
            toggleTranslatingDialog(j, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$22(final PendingTranslation pendingTranslation, final boolean z, final long j, final Set set, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$pushToTranslate$21(pendingTranslation, tLObject, z, tL_error, j, set);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$pushToTranslate$21(PendingTranslation pendingTranslation, TLObject tLObject, final boolean z, TLRPC.TL_error tL_error, final long j, Set set) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String>> arrayList2;
        ArrayList<TLRPC.TL_textWithEntities> arrayList3;
        final String str;
        synchronized (this) {
            arrayList = pendingTranslation.messageIds;
            arrayList2 = pendingTranslation.callbacks;
            arrayList3 = pendingTranslation.messageTexts;
            str = pendingTranslation.language;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList4 = ((TLRPC.TL_messages_translateResult) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList4.size());
            for (int i = 0; i < min; i++) {
                arrayList2.get(i).run(Boolean.valueOf(z), arrayList.get(i), TranslateAlert2.preprocess(arrayList3.get(i), arrayList4.get(i)), str);
            }
        } else {
            String str2 = null;
            if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    final int intValue = arrayList.get(i2).intValue();
                    final Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4 = arrayList2.get(i2);
                    String str3 = str2;
                    TranslateAlert2.alternativeTranslate(arrayList3.get(i2).text, str3, str, new Utilities.Callback2() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda44
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TranslateController.this.lambda$pushToTranslate$20(callback4, z, intValue, str, j, (String) obj, (Boolean) obj2);
                        }
                    });
                    i2++;
                    str2 = str3;
                    arrayList3 = arrayList3;
                }
            } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
                toggleTranslatingDialog(j, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            } else {
                if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    arrayList2.get(i3).run(Boolean.valueOf(z), arrayList.get(i3), null, pendingTranslation.language);
                }
                synchronized (this) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        try {
                            set.remove(arrayList.get(i4));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$20(Utilities.Callback4 callback4, boolean z, int i, String str, long j, String str2, Boolean bool) {
        if (str2 != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
        } else {
            toggleTranslatingDialog(j, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PendingPollTranslation {
        ArrayList<Utilities.Callback3<Integer, PollText, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        ArrayList<Pair<PollText, PollText>> messageTexts;
        int reqId;
        Runnable runnable;
        int symbolsCount;

        private PendingPollTranslation() {
            this.messageIds = new ArrayList<>();
            this.messageTexts = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = 80;
            this.reqId = -1;
        }
    }

    private void pushPollToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, PollText, String> callback3) {
        final PendingPollTranslation pendingPollTranslation;
        if (messageObject == null || messageObject.getId() < 0 || callback3 == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        synchronized (this) {
            try {
                ArrayList<PendingPollTranslation> arrayList = this.pendingPollTranslations.get(Long.valueOf(dialogId));
                if (arrayList == null) {
                    HashMap<Long, ArrayList<PendingPollTranslation>> hashMap = this.pendingPollTranslations;
                    Long valueOf = Long.valueOf(dialogId);
                    ArrayList<PendingPollTranslation> arrayList2 = new ArrayList<>();
                    hashMap.put(valueOf, arrayList2);
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    pendingPollTranslation = new PendingPollTranslation();
                    arrayList.add(pendingPollTranslation);
                } else {
                    pendingPollTranslation = arrayList.get(arrayList.size() - 1);
                }
                if (pendingPollTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                    return;
                }
                TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                if (media instanceof TLRPC.TL_messageMediaPoll) {
                    PollText fromPoll = PollText.fromPoll((TLRPC.TL_messageMediaPoll) media);
                    PollText pollText = messageObject.messageOwner.translatedPoll;
                    int length = fromPoll.length();
                    if (pendingPollTranslation.symbolsCount + length >= MAX_SYMBOLS_PER_REQUEST || pendingPollTranslation.messageIds.size() + 1 >= 20) {
                        AndroidUtilities.cancelRunOnUIThread(pendingPollTranslation.runnable);
                        AndroidUtilities.runOnUIThread(pendingPollTranslation.runnable);
                        pendingPollTranslation = new PendingPollTranslation();
                        arrayList.add(pendingPollTranslation);
                    }
                    Runnable runnable = pendingPollTranslation.runnable;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                    }
                    this.loadingTranslations.add(Integer.valueOf(messageObject.getId()));
                    pendingPollTranslation.messageIds.add(Integer.valueOf(messageObject.getId()));
                    FileLog.d("pending translation +" + messageObject.getId() + " poll message");
                    pendingPollTranslation.messageTexts.add(new Pair<>(fromPoll, pollText));
                    pendingPollTranslation.callbacks.add(callback3);
                    pendingPollTranslation.language = str;
                    pendingPollTranslation.symbolsCount = pendingPollTranslation.symbolsCount + length;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            TranslateController.this.lambda$pushPollToTranslate$26(dialogId, pendingPollTranslation);
                        }
                    };
                    pendingPollTranslation.runnable = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, pendingPollTranslation.delay);
                    pendingPollTranslation.delay /= 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushPollToTranslate$26(final long j, final PendingPollTranslation pendingPollTranslation) {
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.remove(pendingPollTranslation);
                    if (arrayList.isEmpty()) {
                        this.pendingTranslations.remove(Long.valueOf(j));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        Iterator<Pair<PollText, PollText>> it = pendingPollTranslation.messageTexts.iterator();
        while (it.hasNext()) {
            Pair<PollText, PollText> next = it.next();
            PollText pollText = (PollText) next.first;
            PollText pollText2 = (PollText) next.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = pollText.question;
            if (tL_textWithEntities != null && (pollText2 == null || pollText2.question == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            if (pollText.answers.size() != (pollText2 == null ? 0 : pollText2.answers.size())) {
                Iterator<TLRPC.PollAnswer> it2 = pollText.answers.iterator();
                while (it2.hasNext()) {
                    tL_messages_translateText.text.add(it2.next().text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = pollText.solution;
            if (tL_textWithEntities2 != null && (pollText2 == null || pollText2.solution == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = normalizeLanguage(pendingPollTranslation.language);
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda13
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TranslateController.this.lambda$pushPollToTranslate$25(pendingPollTranslation, j, tLObject, tL_error);
            }
        });
        synchronized (this) {
            pendingPollTranslation.reqId = sendRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushPollToTranslate$25(final PendingPollTranslation pendingPollTranslation, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$pushPollToTranslate$24(pendingPollTranslation, tLObject, tL_error, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$pushPollToTranslate$24(PendingPollTranslation pendingPollTranslation, TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback3<Integer, PollText, String>> arrayList2;
        ArrayList<Pair<PollText, PollText>> arrayList3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        synchronized (this) {
            arrayList = pendingPollTranslation.messageIds;
            arrayList2 = pendingPollTranslation.callbacks;
            arrayList3 = pendingPollTranslation.messageTexts;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList4 = ((TLRPC.TL_messages_translateResult) tLObject).result;
            ArrayList arrayList5 = new ArrayList();
            Iterator<Pair<PollText, PollText>> it = arrayList3.iterator();
            int i = 0;
            while (it.hasNext()) {
                Pair<PollText, PollText> next = it.next();
                PollText pollText = (PollText) next.first;
                PollText pollText2 = (PollText) next.second;
                PollText pollText3 = new PollText();
                if (pollText2 != null && (tL_textWithEntities5 = pollText2.question) != null) {
                    pollText3.question = tL_textWithEntities5;
                } else if (pollText.question != null) {
                    if (i >= arrayList4.size()) {
                        tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    } else {
                        tL_textWithEntities = arrayList4.get(i);
                        i++;
                    }
                    pollText3.question = TranslateAlert2.preprocess(pollText.question, tL_textWithEntities);
                }
                if (pollText.answers.size() != (pollText2 == null ? 0 : pollText2.answers.size())) {
                    Iterator<TLRPC.PollAnswer> it2 = pollText.answers.iterator();
                    while (it2.hasNext()) {
                        TLRPC.PollAnswer next2 = it2.next();
                        if (i >= arrayList4.size()) {
                            tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                        } else {
                            tL_textWithEntities4 = arrayList4.get(i);
                            i++;
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        tL_pollAnswer.text = tL_textWithEntities4;
                        tL_pollAnswer.option = next2.option;
                        pollText3.answers.add(tL_pollAnswer);
                    }
                } else if (pollText2 != null) {
                    pollText3.answers = pollText2.answers;
                }
                if (pollText2 != null && (tL_textWithEntities3 = pollText2.solution) != null) {
                    pollText3.solution = tL_textWithEntities3;
                } else if (pollText.solution != null) {
                    if (i >= arrayList4.size()) {
                        tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    } else {
                        int i2 = i + 1;
                        TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList4.get(i);
                        i = i2;
                        tL_textWithEntities2 = tL_textWithEntities6;
                    }
                    pollText3.solution = TranslateAlert2.preprocess(pollText.solution, tL_textWithEntities2);
                }
                arrayList5.add(pollText3);
            }
            int min = Math.min(arrayList2.size(), arrayList5.size());
            for (int i3 = 0; i3 < min; i3++) {
                arrayList2.get(i3).run(arrayList.get(i3), (PollText) arrayList5.get(i3), pendingPollTranslation.language);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            toggleTranslatingDialog(j, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                arrayList2.get(i4).run(arrayList.get(i4), null, pendingPollTranslation.language);
            }
            synchronized (this) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    try {
                        this.loadingTranslations.remove(arrayList.get(i5));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return;
        }
        synchronized (this) {
        }
    }

    public boolean isTranslating(MessageObject messageObject) {
        TLRPC.Message message;
        boolean z = true;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.summarizedOpen) {
            return this.loadingSummarizations.contains(Integer.valueOf(Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(isTranslatingDialog(messageObject.getDialogId()) ? 1 : 0))));
        }
        synchronized (this) {
            if (messageObject != null) {
                try {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null) {
                        if (((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId())) && isTranslatingDialog(messageObject.getDialogId())) {
                        }
                    }
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    public boolean isTranslating(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        if (messageObject == null || !isTranslatingDialog(messageObject.getDialogId())) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal;
        synchronized (this) {
            try {
                if ((z ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId()))) {
                    return true;
                }
                if (groupedMessages != null) {
                    Iterator<MessageObject> it = groupedMessages.messages.iterator();
                    while (it.hasNext()) {
                        if ((z ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(it.next().getId()))) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancelAllTranslations() {
        synchronized (this) {
            try {
                for (ArrayList<PendingTranslation> arrayList : this.pendingTranslations.values()) {
                    if (arrayList != null) {
                        Iterator<PendingTranslation> it = arrayList.iterator();
                        while (it.hasNext()) {
                            PendingTranslation next = it.next();
                            AndroidUtilities.cancelRunOnUIThread(next.runnable);
                            if (next.reqId != -1) {
                                getConnectionsManager().cancelRequest(next.reqId, true);
                                Iterator<Integer> it2 = next.messageIds.iterator();
                                while (it2.hasNext()) {
                                    this.loadingTranslations.remove(it2.next());
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingTranslation> arrayList2 : this.pendingTranscriptionsTranslations.values()) {
                    if (arrayList2 != null) {
                        Iterator<PendingTranslation> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            PendingTranslation next2 = it3.next();
                            AndroidUtilities.cancelRunOnUIThread(next2.runnable);
                            if (next2.reqId != -1) {
                                getConnectionsManager().cancelRequest(next2.reqId, true);
                                Iterator<Integer> it4 = next2.messageIds.iterator();
                                while (it4.hasNext()) {
                                    this.loadingTranscriptionTranslations.remove(it4.next());
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingPollTranslation> arrayList3 : this.pendingPollTranslations.values()) {
                    if (arrayList3 != null) {
                        Iterator<PendingPollTranslation> it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            PendingPollTranslation next3 = it5.next();
                            AndroidUtilities.cancelRunOnUIThread(next3.runnable);
                            if (next3.reqId != -1) {
                                getConnectionsManager().cancelRequest(next3.reqId, true);
                                Iterator<Integer> it6 = next3.messageIds.iterator();
                                while (it6.hasNext()) {
                                    this.loadingTranslations.remove(it6.next());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancelTranslations(long j) {
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j));
                if (arrayList != null) {
                    Iterator<PendingTranslation> it = arrayList.iterator();
                    while (it.hasNext()) {
                        PendingTranslation next = it.next();
                        AndroidUtilities.cancelRunOnUIThread(next.runnable);
                        if (next.reqId != -1) {
                            getConnectionsManager().cancelRequest(next.reqId, true);
                            Iterator<Integer> it2 = next.messageIds.iterator();
                            while (it2.hasNext()) {
                                this.loadingTranslations.remove(it2.next());
                            }
                        }
                    }
                    this.pendingTranslations.remove(Long.valueOf(j));
                }
                ArrayList<PendingTranslation> arrayList2 = this.pendingTranscriptionsTranslations.get(Long.valueOf(j));
                if (arrayList2 != null) {
                    Iterator<PendingTranslation> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        PendingTranslation next2 = it3.next();
                        AndroidUtilities.cancelRunOnUIThread(next2.runnable);
                        if (next2.reqId != -1) {
                            getConnectionsManager().cancelRequest(next2.reqId, true);
                            Iterator<Integer> it4 = next2.messageIds.iterator();
                            while (it4.hasNext()) {
                                this.loadingTranscriptionTranslations.remove(it4.next());
                            }
                        }
                    }
                    this.pendingTranscriptionsTranslations.remove(Long.valueOf(j));
                }
                ArrayList<PendingPollTranslation> arrayList3 = this.pendingPollTranslations.get(Long.valueOf(j));
                if (arrayList3 != null) {
                    Iterator<PendingPollTranslation> it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        PendingPollTranslation next3 = it5.next();
                        AndroidUtilities.cancelRunOnUIThread(next3.runnable);
                        if (next3.reqId != -1) {
                            getConnectionsManager().cancelRequest(next3.reqId, true);
                            Iterator<Integer> it6 = next3.messageIds.iterator();
                            while (it6.hasNext()) {
                                this.loadingTranslations.remove(it6.next());
                            }
                        }
                    }
                    this.pendingPollTranslations.remove(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void keepReplyMessage(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        HashMap<Integer, MessageObject> hashMap = this.keptReplyMessageObjects.get(Long.valueOf(messageObject.getDialogId()));
        if (hashMap == null) {
            HashMap<Long, HashMap<Integer, MessageObject>> hashMap2 = this.keptReplyMessageObjects;
            Long valueOf = Long.valueOf(messageObject.getDialogId());
            HashMap<Integer, MessageObject> hashMap3 = new HashMap<>();
            hashMap2.put(valueOf, hashMap3);
            hashMap = hashMap3;
        }
        hashMap.put(Integer.valueOf(messageObject.getId()), messageObject);
    }

    public MessageObject findReplyMessageObject(long j, int i) {
        HashMap<Integer, MessageObject> hashMap = this.keptReplyMessageObjects.get(Long.valueOf(j));
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i));
    }

    private void clearAllKeptReplyMessages(long j) {
        this.keptReplyMessageObjects.remove(Long.valueOf(j));
    }

    private boolean isLanguageRestricted(String str) {
        if (getUserConfig().isPremium()) {
            return RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(str);
        }
        try {
            return TextUtils.equals(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode, str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadTranslatingDialogsCached() {
        boolean z;
        String string = this.messagesController.getMainSettings().getString("translating_dialog_languages2", null);
        if (string == null) {
            return;
        }
        for (String str : string.split(";")) {
            String[] split = str.split("=");
            if (split.length >= 2) {
                long parseLong = Long.parseLong(split[0]);
                String[] split2 = split[1].split(">");
                if (split2.length == 2) {
                    String str2 = split2[0];
                    String str3 = split2[1];
                    if (str3.length() <= 0 || str3.charAt(str3.length() - 1) != '!') {
                        z = false;
                    } else {
                        str3 = str3.substring(0, str3.length() - 1);
                        z = true;
                    }
                    if ("null".equals(str2)) {
                        str2 = null;
                    }
                    if ("null".equals(str3)) {
                        str3 = null;
                    }
                    if (str2 != null) {
                        this.detectedDialogLanguage.put(Long.valueOf(parseLong), str2);
                        if (!isLanguageRestricted(str2)) {
                            this.translatingDialogs.put(parseLong, Boolean.valueOf(true ^ z));
                            this.translatableDialogs.add(Long.valueOf(parseLong));
                        }
                        if (str3 != null) {
                            this.translateDialogLanguage.put(Long.valueOf(parseLong), str3);
                        }
                    }
                }
            }
        }
        Set<String> stringSet = this.messagesController.getMainSettings().getStringSet("hidden_translation_at", null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    this.hideTranslateDialogs.add(Long.valueOf(Long.parseLong(it.next())));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    private void saveTranslatingDialogsCache() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i < this.translatingDialogs.size(); i++) {
            try {
                long keyAt = this.translatingDialogs.keyAt(i);
                if (!z) {
                    sb.append(";");
                }
                if (z) {
                    z = false;
                }
                String str = this.detectedDialogLanguage.get(Long.valueOf(keyAt));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String dialogTranslateTo = getDialogTranslateTo(keyAt);
                if (dialogTranslateTo != null) {
                    str2 = dialogTranslateTo;
                }
                sb.append(keyAt);
                sb.append("=");
                sb.append(str);
                sb.append(">");
                sb.append(str2);
                if (!this.translatingDialogs.valueAt(i).booleanValue()) {
                    sb.append("!");
                }
            } catch (Exception unused) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator<Long> it = this.hideTranslateDialogs.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putString("translating_dialog_languages2", sb.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    private void resetTranslatingDialogsCache() {
        MessagesController.getMainSettings(this.currentAccount).edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
    }

    public void detectStoryLanguage(final TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0 || !LanguageDetector.hasSupport()) {
            return;
        }
        final StoryKey storyKey = new StoryKey(storyItem);
        if (this.detectingStories.contains(storyKey)) {
            return;
        }
        this.detectingStories.add(storyKey);
        LanguageDetector.detectLanguage(storyItem.caption, new LanguageDetector.StringCallback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda38
            @Override // org.telegram.messenger.LanguageDetector.StringCallback
            public final void run(String str2) {
                TranslateController.this.lambda$detectStoryLanguage$28(storyItem, storyKey, str2);
            }
        }, new LanguageDetector.ExceptionCallback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda39
            @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
            public final void run(Exception exc) {
                TranslateController.this.lambda$detectStoryLanguage$30(storyItem, storyKey, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectStoryLanguage$28(final TL_stories.StoryItem storyItem, final StoryKey storyKey, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$detectStoryLanguage$27(storyItem, str, storyKey);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectStoryLanguage$27(TL_stories.StoryItem storyItem, String str, StoryKey storyKey) {
        storyItem.detectedLng = str;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectStoryLanguage$30(final TL_stories.StoryItem storyItem, final StoryKey storyKey, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$detectStoryLanguage$29(storyItem, storyKey);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectStoryLanguage$29(TL_stories.StoryItem storyItem, StoryKey storyKey) {
        storyItem.detectedLng = UNKNOWN_LANGUAGE;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public boolean canTranslateStory(TL_stories.StoryItem storyItem) {
        String str;
        return (storyItem == null || TextUtils.isEmpty(storyItem.caption) || Emoji.fullyConsistsOfEmojis(storyItem.caption) || ((storyItem.detectedLng != null || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, TranslateAlert2.getToLanguage())) && ((str = storyItem.detectedLng) == null || isLanguageRestricted(str)))) ? false : true;
    }

    public void translateStory(final TL_stories.StoryItem storyItem, final Runnable runnable) {
        if (storyItem == null) {
            return;
        }
        final StoryKey storyKey = new StoryKey(storyItem);
        final String toLanguage = TranslateAlert2.getToLanguage();
        if (storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, toLanguage)) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (this.translatingStories.contains(storyKey)) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            this.translatingStories.add(storyKey);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            final TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = storyItem.caption;
            tL_textWithEntities.entities = storyItem.entities;
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = normalizeLanguage(toLanguage);
            getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda40
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    TranslateController.this.lambda$translateStory$34(storyItem, toLanguage, storyKey, runnable, tL_textWithEntities, tLObject, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateStory$34(final TL_stories.StoryItem storyItem, final String str, final StoryKey storyKey, final Runnable runnable, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
            if (arrayList.size() <= 0) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda26
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.this.lambda$translateStory$31(storyItem, str, storyKey, runnable);
                    }
                });
                return;
            } else {
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.this.lambda$translateStory$32(storyItem, str, tL_textWithEntities, tL_textWithEntities2, storyKey, runnable);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$translateStory$33(storyItem, str, storyKey, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateStory$31(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateStory$32(TL_stories.StoryItem storyItem, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = TranslateAlert2.preprocess(tL_textWithEntities, tL_textWithEntities2);
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateStory$33(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean isTranslatingStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return false;
        }
        return this.translatingStories.contains(new StoryKey(storyItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class StoryKey {
        public long dialogId;
        public int storyId;

        public StoryKey(TL_stories.StoryItem storyItem) {
            this.dialogId = storyItem.dialogId;
            this.storyId = storyItem.id;
        }
    }

    public void detectPhotoLanguage(final MessageObject messageObject, final Utilities.Callback<String> callback) {
        if (messageObject == null || messageObject.messageOwner == null || !LanguageDetector.hasSupport() || TextUtils.isEmpty(messageObject.messageOwner.message)) {
            return;
        }
        if (!TextUtils.isEmpty(messageObject.messageOwner.originalLanguage)) {
            if (callback != null) {
                callback.run(messageObject.messageOwner.originalLanguage);
            }
        } else {
            final MessageKey messageKey = new MessageKey(messageObject);
            if (this.detectingPhotos.contains(messageKey)) {
                return;
            }
            this.detectingPhotos.add(messageKey);
            LanguageDetector.detectLanguage(messageObject.messageOwner.message, new LanguageDetector.StringCallback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda6
                @Override // org.telegram.messenger.LanguageDetector.StringCallback
                public final void run(String str) {
                    TranslateController.this.lambda$detectPhotoLanguage$36(messageObject, messageKey, callback, str);
                }
            }, new LanguageDetector.ExceptionCallback() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda7
                @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
                public final void run(Exception exc) {
                    TranslateController.this.lambda$detectPhotoLanguage$38(messageObject, messageKey, callback, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$36(final MessageObject messageObject, final MessageKey messageKey, final Utilities.Callback callback, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$detectPhotoLanguage$35(messageObject, str, messageKey, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$35(MessageObject messageObject, String str, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$38(final MessageObject messageObject, final MessageKey messageKey, final Utilities.Callback callback, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$detectPhotoLanguage$37(messageObject, messageKey, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$37(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = UNKNOWN_LANGUAGE;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run(UNKNOWN_LANGUAGE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (android.text.TextUtils.equals(r0.translatedToLanguage, org.telegram.ui.Components.TranslateAlert2.getToLanguage()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r3.translated != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (isLanguageRestricted(r3.messageOwner.originalLanguage) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canTranslatePhoto(MessageObject messageObject, String str) {
        TLRPC.Message message;
        TLRPC.Message message2;
        String str2;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null && (str2 = message2.originalLanguage) != null) {
            str = str2;
        }
        if (messageObject != null && (message = messageObject.messageOwner) != null && !TextUtils.isEmpty(message.message)) {
            if (str == null) {
                TLRPC.Message message3 = messageObject.messageOwner;
                if (message3.translatedText != null) {
                }
            }
            if (str != null) {
            }
        }
        return false;
    }

    public void translatePhoto(final MessageObject messageObject, final Runnable runnable) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final MessageKey messageKey = new MessageKey(messageObject);
        final String toLanguage = TranslateAlert2.getToLanguage();
        TLRPC.Message message = messageObject.messageOwner;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, toLanguage)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (this.translatingPhotos.contains(messageKey)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.translatingPhotos.add(messageKey);
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        final TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = messageObject.messageOwner;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = normalizeLanguage(toLanguage);
        final long currentTimeMillis = System.currentTimeMillis();
        getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda37
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TranslateController.this.lambda$translatePhoto$42(messageObject, toLanguage, messageKey, runnable, currentTimeMillis, tL_textWithEntities, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$42(final MessageObject messageObject, final String str, final MessageKey messageKey, final Runnable runnable, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
            if (arrayList.size() <= 0) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda41
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.this.lambda$translatePhoto$39(messageObject, str, messageKey, runnable, j);
                    }
                });
                return;
            } else {
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda42
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateController.this.lambda$translatePhoto$40(messageObject, str, tL_textWithEntities, tL_textWithEntities2, messageKey, runnable, j);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TranslateController$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                TranslateController.this.lambda$translatePhoto$41(messageObject, str, messageKey, runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$39(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$40(MessageObject messageObject, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, MessageKey messageKey, Runnable runnable, long j) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = TranslateAlert2.preprocess(tL_textWithEntities, tL_textWithEntities2);
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$41(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j)));
        }
    }

    public static String normalizeLanguage(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("_")) {
            String[] split = str.split("_", 2);
            return split[0].toLowerCase() + "-" + split[1].toUpperCase();
        }
        if (!str.contains("-")) {
            return str;
        }
        String[] split2 = str.split("-", 2);
        return split2[0].toLowerCase() + "-" + split2[1].toUpperCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MessageKey {
        public long dialogId;
        public int id;

        public MessageKey(MessageObject messageObject) {
            this.dialogId = messageObject.getDialogId();
            this.id = messageObject.getId();
        }
    }

    public static class PollText extends TLObject {
        public static final int constructor = 613759672;
        public ArrayList<TLRPC.PollAnswer> answers = new ArrayList<>();
        public TLRPC.TL_textWithEntities question;
        public TLRPC.TL_textWithEntities solution;

        public static PollText TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (PollText) TLObject.TLdeserialize(PollText.class, 613759672 != i ? null : new PollText(), inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            if ((readInt32 & 1) != 0) {
                this.question = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((readInt32 & 2) != 0) {
                this.answers = Vector.deserialize(inputSerializedData, new TranslateController$PollText$$ExternalSyntheticLambda0(), z);
            }
            if ((readInt32 & 4) != 0) {
                this.solution = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int i = this.question != null ? 1 : 0;
            ArrayList<TLRPC.PollAnswer> arrayList = this.answers;
            if (arrayList != null && !arrayList.isEmpty()) {
                i |= 2;
            }
            if (this.solution != null) {
                i |= 4;
            }
            outputSerializedData.writeInt32(i);
            if ((i & 1) != 0) {
                this.question.serializeToStream(outputSerializedData);
            }
            if ((i & 2) != 0) {
                Vector.serialize(outputSerializedData, this.answers);
            }
            if ((i & 4) != 0) {
                this.solution.serializeToStream(outputSerializedData);
            }
        }

        public int length() {
            TLRPC.TL_textWithEntities tL_textWithEntities = this.question;
            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
            for (int i = 0; i < this.answers.size(); i++) {
                length += this.answers.get(i).text.text.length();
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = this.solution;
            return tL_textWithEntities2 != null ? length + tL_textWithEntities2.text.length() : length;
        }

        public static PollText fromMessage(MessageObject messageObject) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return fromPoll((TLRPC.TL_messageMediaPoll) media);
            }
            return null;
        }

        public static PollText fromPoll(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            PollText pollText = new PollText();
            pollText.question = poll.question;
            for (int i = 0; i < poll.answers.size(); i++) {
                TLRPC.PollAnswer pollAnswer = poll.answers.get(i);
                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                tL_pollAnswer.text = pollAnswer.text;
                tL_pollAnswer.option = pollAnswer.option;
                pollText.answers.add(tL_pollAnswer);
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                pollText.solution = tL_textWithEntities;
                TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                tL_textWithEntities.text = pollResults2.solution;
                tL_textWithEntities.entities = pollResults2.solution_entities;
            }
            return pollText;
        }

        public static boolean isFullyTranslated(MessageObject messageObject, PollText pollText) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
            TLRPC.Poll poll;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (!(media instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media).poll) == null) {
                return true;
            }
            if ((poll.question != null) != (pollText.question != null)) {
                return false;
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            return (pollResults != null && pollResults.solution != null) == (pollText.solution != null) && poll.answers.size() == pollText.answers.size();
        }
    }
}
