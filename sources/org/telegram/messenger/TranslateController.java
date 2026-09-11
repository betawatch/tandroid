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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.u31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.h41;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
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
    private final HashMap<Long, ArrayList<PendingRichTranslation>> pendingRichTranslations;
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

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class Language {
        public String code;
        public String displayName;
        public String ownDisplayName;
        public String q;
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class MessageKey {
        public long dialogId;
        public int id;

        public MessageKey(MessageObject messageObject) {
            this.dialogId = messageObject.getDialogId();
            this.id = messageObject.getId();
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class PendingPollTranslation {
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

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class PendingRichTranslation {
        ArrayList<Utilities.Callback3<Integer, TL_iv.RichMessage, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        int reqId;
        Runnable runnable;

        private PendingRichTranslation() {
            this.messageIds = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = 80;
            this.reqId = -1;
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class PendingTranslation {
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

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class PollText extends TLObject {
        public static final int constructor = 613759672;
        public ArrayList<TLRPC.PollAnswer> answers = new ArrayList<>();
        public TLRPC.TL_textWithEntities question;
        public TLRPC.TL_textWithEntities solution;

        public static PollText TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (PollText) TLObject.TLdeserialize(PollText.class, 613759672 != i10 ? null : new PollText(), inputSerializedData, i10, z10);
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
            for (int i10 = 0; i10 < poll.answers.size(); i10++) {
                TLRPC.PollAnswer pollAnswer = poll.answers.get(i10);
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

        public int length() {
            TLRPC.TL_textWithEntities tL_textWithEntities = this.question;
            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
            for (int i10 = 0; i10 < this.answers.size(); i10++) {
                length += this.answers.get(i10).text.text.length();
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = this.solution;
            return tL_textWithEntities2 != null ? tL_textWithEntities2.text.length() + length : length;
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            if ((readInt32 & 1) != 0) {
                this.question = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if ((readInt32 & 2) != 0) {
                this.answers = Vector.deserialize(inputSerializedData, new yg(), z10);
            }
            if ((readInt32 & 4) != 0) {
                this.solution = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int i10 = this.question != null ? 1 : 0;
            ArrayList<TLRPC.PollAnswer> arrayList = this.answers;
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 |= 2;
            }
            if (this.solution != null) {
                i10 |= 4;
            }
            outputSerializedData.writeInt32(i10);
            if ((i10 & 1) != 0) {
                this.question.serializeToStream(outputSerializedData);
            }
            if ((i10 & 2) != 0) {
                Vector.serialize(outputSerializedData, this.answers);
            }
            if ((i10 & 4) != 0) {
                this.solution.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class StoryKey {
        public long dialogId;
        public int storyId;

        public StoryKey(TL_stories.StoryItem storyItem) {
            this.dialogId = storyItem.dialogId;
            this.storyId = storyItem.id;
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class TranslatableDecision {
        Set<Integer> certainlyTranslatable = new HashSet();
        Set<Integer> unknown = new HashSet();
        Set<Integer> certainlyNotTranslatable = new HashSet();
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
        this.pendingRichTranslations = new HashMap<>();
        this.detectingStories = new HashSet<>();
        this.translatingStories = new HashSet<>();
        this.detectingPhotos = new HashSet<>();
        this.translatingPhotos = new HashSet<>();
        this.messagesController = messagesController;
        AndroidUtilities.runOnUIThread(new ug(this, 16), 150L);
    }

    public static void analyzeSuggestedLanguageCodes() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        try {
            linkedHashSet.add(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            linkedHashSet.addAll(h41.Y());
        } catch (Exception e11) {
            FileLog.e(e11);
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
                        if (u31.D(locale, null, null) != null) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        suggestedLanguageCodes = linkedHashSet;
    }

    private void checkDialogTranslatable(MessageObject messageObject) {
        String str;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        TranslatableDecision translatableDecision = this.translatableDialogMessages.get(Long.valueOf(dialogId));
        if (translatableDecision == null) {
            HashMap<Long, TranslatableDecision> hashMap = this.translatableDialogMessages;
            Long valueOf = Long.valueOf(dialogId);
            TranslatableDecision translatableDecision2 = new TranslatableDecision();
            hashMap.put(valueOf, translatableDecision2);
            translatableDecision = translatableDecision2;
        }
        boolean z10 = false;
        boolean z11 = isTranslatable(messageObject) && ((str2 = messageObject.messageOwner.originalLanguage) == null || UNKNOWN_LANGUAGE.equals(str2));
        if (isTranslatable(messageObject) && (str = messageObject.messageOwner.originalLanguage) != null && !UNKNOWN_LANGUAGE.equals(str) && !isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
            z10 = true;
        }
        if (z11) {
            translatableDecision.unknown.add(Integer.valueOf(messageObject.getId()));
        } else {
            (z10 ? translatableDecision.certainlyTranslatable : translatableDecision.certainlyNotTranslatable).add(Integer.valueOf(messageObject.getId()));
        }
        if (!z11) {
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
                AndroidUtilities.runOnUIThread(new al(this, dialogId, 0), 450L);
            }
        }
    }

    private void checkLanguage(MessageObject messageObject) {
        if (LanguageDetector.hasSupport()) {
            String detectLanguageText = getDetectLanguageText(messageObject);
            if (!isTranslatable(messageObject) || messageObject.messageOwner == null || TextUtils.isEmpty(detectLanguageText)) {
                return;
            }
            if (messageObject.messageOwner.originalLanguage != null) {
                checkDialogTranslatable(messageObject);
                return;
            }
            long dialogId = messageObject.getDialogId();
            int hash = hash(messageObject);
            if (isDialogTranslatable(dialogId) || this.pendingLanguageChecks.contains(Integer.valueOf(hash))) {
                return;
            }
            this.pendingLanguageChecks.add(Integer.valueOf(hash));
            Utilities.stageQueue.postRunnable(new zk(this, detectLanguageText, messageObject, dialogId, hash, 0));
        }
    }

    private void clearAllKeptReplyMessages(long j3) {
        this.keptReplyMessageObjects.remove(Long.valueOf(j3));
    }

    public static String currentLanguage() {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        return str != null ? str.split("_")[0] : str;
    }

    private static String getDetectLanguageText(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            if (!TextUtils.isEmpty(message.message)) {
                return messageObject.messageOwner.message;
            }
            if (messageObject.type == 36 && !TextUtils.isEmpty(messageObject.messageText)) {
                return messageObject.messageText.toString();
            }
        }
        return null;
    }

    public static ArrayList<Language> getLanguages() {
        ArrayList<Language> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            List<String> list = allLanguages;
            if (i10 >= list.size()) {
                break;
            }
            Language language = new Language();
            String str = list.get(i10);
            language.code = str;
            if ("no".equals(str)) {
                language.code = "nb";
            }
            language.displayName = u31.y(u31.D(language.code, null, null));
            language.ownDisplayName = u31.y(u31.L(language.code, true));
            if (language.displayName != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(language.displayName);
                sb2.append(" ");
                String str2 = language.ownDisplayName;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                language.q = sb2.toString().toLowerCase();
                arrayList.add(language);
            }
            i10++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new qk(Collator.getInstance(Locale.getDefault()), 2));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$-CC.comparing(new ga(4)));
        return arrayList;
    }

    public static ArrayList<LocaleController.LocaleInfo> getLocales() {
        String str;
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>(LocaleController.getInstance().languagesDict.values());
        int i10 = 0;
        while (i10 < arrayList.size()) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo == null || (((str = localeInfo.shortName) != null && str.endsWith("_raw")) || !"remote".equals(localeInfo.pathToFile))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new qk(LocaleController.getInstance().getCurrentLocaleInfo(), 1));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (org.telegram.messenger.TranslateController.suggestedLanguageCodes == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<Language> getSuggestedLanguages(String str) {
        ArrayList<Language> arrayList = new ArrayList<>();
        if (suggestedLanguageCodes == null) {
            analyzeSuggestedLanguageCodes();
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
                    language.displayName = u31.y(u31.D(language.code, null, null));
                    language.ownDisplayName = u31.y(u31.L(language.code, true));
                    if (language.displayName != null) {
                        language.q = (language.displayName + " " + language.ownDisplayName).toLowerCase();
                        arrayList.add(language);
                    }
                }
            }
        }
        return arrayList;
    }

    private int hash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void invalidateSuggestedLanguageCodes() {
        suggestedLanguageCodes = null;
    }

    private boolean isChatAutoTranslated(long j3) {
        TLRPC.Chat chat;
        return isDialogTranslatable(j3) && (chat = getMessagesController().getChat(Long.valueOf(-j3))) != null && chat.autotranslation;
    }

    private boolean isLanguageRestricted(String str) {
        if (getUserConfig().isPremium()) {
            return h41.Y().contains(str);
        }
        try {
            return TextUtils.equals(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSummarizable(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null || message.summary_from_language == null || messageObject.isOutOwner() || messageObject.isRestrictedMessage || messageObject.isSponsored()) {
            return false;
        }
        int i10 = messageObject.type;
        return (i10 == 0 || i10 == 3 || i10 == 1 || i10 == 9 || i10 == 14 || i10 == 17) && !TextUtils.isEmpty(messageObject.messageOwner.message) && messageObject.messageOwner.message.length() > 100;
    }

    public static boolean isTranslatable(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || messageObject.isOutOwner() || messageObject.isRestrictedMessage || messageObject.isSponsored()) {
            return false;
        }
        int i10 = messageObject.type;
        if (i10 != 0 && i10 != 3 && i10 != 1 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 14 && i10 != 17 && i10 != 36) {
            return false;
        }
        if (TextUtils.isEmpty(messageObject.messageOwner.message) && !(MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !messageObject.messageOwner.voiceTranscriptionFinal)) {
                return false;
            }
        }
        return true;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDialogMessageSure$10(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), arrayList2.size()); i10++) {
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && message2 != null) {
                message.translatedText = message2.translatedText;
                message.translatedPoll = message2.translatedPoll;
                message.translatedToLanguage = message2.translatedToLanguage;
                if (messageObject.updateTranslation(false)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDialogMessageSure$11(long j3) {
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j3);
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject == null || messageObject.messageOwner == null) {
                arrayList2.add(null);
            } else {
                arrayList2.add(getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId()));
            }
        }
        AndroidUtilities.runOnUIThread(new y8(this, arrayList2, arrayList, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDialogTranslatable$17(long j3) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogIsTranslatable, Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$12(String str, MessageObject messageObject, long j3, int i10) {
        if (str == null) {
            str = UNKNOWN_LANGUAGE;
        }
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i10));
        checkDialogTranslatable(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$13(MessageObject messageObject, long j3, int i10, String str) {
        AndroidUtilities.runOnUIThread(new zk(this, str, messageObject, j3, i10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$14(MessageObject messageObject, long j3, int i10) {
        messageObject.messageOwner.originalLanguage = UNKNOWN_LANGUAGE;
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$15(MessageObject messageObject, long j3, int i10, Exception exc) {
        AndroidUtilities.runOnUIThread(new i7(this, messageObject, j3, i10, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLanguage$16(String str, MessageObject messageObject, long j3, int i10) {
        LanguageDetector.detectLanguage(str, new cl(this, messageObject, j3, i10), new cl(this, messageObject, j3, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$4(MessageObject messageObject, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        message.summaryText = tL_textWithEntities;
        if (tL_textWithEntities == null) {
            message.summarizedOpen = false;
        }
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$5(MessageObject messageObject, boolean z10, long j3, Integer num, TL_iv.RichMessage richMessage, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " rich message but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = null;
        message.translatedRichMessage = richMessage;
        if (z10) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j3);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    message2.translatedToLanguage = str;
                    message2.translatedRichMessage = richMessage;
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
    public /* synthetic */ void lambda$checkTranslation$6(MessageObject messageObject, String str, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        if (tL_textWithEntities == null) {
            str = null;
        }
        message.translatedSummaryLanguage = str;
        message.translatedSummaryText = tL_textWithEntities;
        if (tL_textWithEntities == null) {
            message.summarizedOpen = false;
        }
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkTranslation$7(MessageObject messageObject, boolean z10, long j3, Integer num, PollText pollText, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " poll but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = pollText;
        if (z10) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j3);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
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
    public /* synthetic */ void lambda$checkTranslation$8(MessageObject messageObject, boolean z10, long j3, Boolean bool, Integer num, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
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
        if (z10) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j3, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j3);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$39(MessageObject messageObject, String str, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$40(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback, String str) {
        AndroidUtilities.runOnUIThread(new a5(str, messageObject, messageKey, this, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$41(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = UNKNOWN_LANGUAGE;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run(UNKNOWN_LANGUAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectPhotoLanguage$42(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback, Exception exc) {
        AndroidUtilities.runOnUIThread(new pk(this, messageObject, messageKey, callback, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$detectStoryLanguage$31(TL_stories.StoryItem storyItem, String str, StoryKey storyKey) {
        storyItem.detectedLng = str;
        getMessagesController().getStoriesController().k.h(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectStoryLanguage$32(TL_stories.StoryItem storyItem, StoryKey storyKey, String str) {
        AndroidUtilities.runOnUIThread(new pk(this, storyItem, str, storyKey, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$detectStoryLanguage$33(TL_stories.StoryItem storyItem, StoryKey storyKey) {
        storyItem.detectedLng = UNKNOWN_LANGUAGE;
        getMessagesController().getStoriesController().k.h(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectStoryLanguage$34(TL_stories.StoryItem storyItem, StoryKey storyKey, Exception exc) {
        AndroidUtilities.runOnUIThread(new f0(this, storyItem, storyKey, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getLanguages$1(Collator collator, Language language, Language language2) {
        return collator.compare(language.displayName, language2.displayName);
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
        int i10 = localeInfo2.serverIndex;
        int i11 = localeInfo3.serverIndex;
        if (i10 == i11) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invalidateTranslation$9(MessageObject messageObject, long j3) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.FALSE, Boolean.valueOf(isTranslatingDialog(j3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$pushPollToTranslate$25(PendingPollTranslation pendingPollTranslation, TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback3<Integer, PollText, String>> arrayList2;
        ArrayList<Pair<PollText, PollText>> arrayList3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        ArrayList<Pair<PollText, PollText>> arrayList4;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i11;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        synchronized (this) {
            arrayList = pendingPollTranslation.messageIds;
            arrayList2 = pendingPollTranslation.callbacks;
            arrayList3 = pendingPollTranslation.messageTexts;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList5 = ((TLRPC.TL_messages_translateResult) tLObject).result;
            ArrayList arrayList6 = new ArrayList();
            int size = arrayList3.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Pair<PollText, PollText> pair = arrayList3.get(i13);
                i13++;
                Pair<PollText, PollText> pair2 = pair;
                PollText pollText = (PollText) pair2.first;
                PollText pollText2 = (PollText) pair2.second;
                PollText pollText3 = new PollText();
                if (pollText2 != null && (tL_textWithEntities5 = pollText2.question) != null) {
                    pollText3.question = tL_textWithEntities5;
                } else if (pollText.question != null) {
                    if (i12 >= arrayList5.size()) {
                        tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    } else {
                        tL_textWithEntities = arrayList5.get(i12);
                        i12++;
                    }
                    pollText3.question = u31.F(pollText.question, tL_textWithEntities);
                }
                if (pollText.answers.size() != (pollText2 == null ? 0 : pollText2.answers.size())) {
                    ArrayList<TLRPC.PollAnswer> arrayList7 = pollText.answers;
                    int size2 = arrayList7.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        TLRPC.PollAnswer pollAnswer = arrayList7.get(i14);
                        i14++;
                        int i15 = size;
                        TLRPC.PollAnswer pollAnswer2 = pollAnswer;
                        ArrayList<Pair<PollText, PollText>> arrayList8 = arrayList3;
                        if (i12 >= arrayList5.size()) {
                            tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                            i11 = i12;
                        } else {
                            i11 = i12 + 1;
                            tL_textWithEntities4 = arrayList5.get(i12);
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        tL_pollAnswer.text = tL_textWithEntities4;
                        tL_pollAnswer.option = pollAnswer2.option;
                        pollText3.answers.add(tL_pollAnswer);
                        size = i15;
                        i12 = i11;
                        arrayList3 = arrayList8;
                    }
                    i10 = size;
                    arrayList4 = arrayList3;
                } else {
                    i10 = size;
                    arrayList4 = arrayList3;
                    if (pollText2 != null) {
                        pollText3.answers = pollText2.answers;
                    }
                }
                if (pollText2 != null && (tL_textWithEntities3 = pollText2.solution) != null) {
                    pollText3.solution = tL_textWithEntities3;
                } else if (pollText.solution != null) {
                    if (i12 >= arrayList5.size()) {
                        tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    } else {
                        int i16 = i12 + 1;
                        TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList5.get(i12);
                        i12 = i16;
                        tL_textWithEntities2 = tL_textWithEntities6;
                    }
                    pollText3.solution = u31.F(pollText.solution, tL_textWithEntities2);
                }
                arrayList6.add(pollText3);
                size = i10;
                arrayList3 = arrayList4;
            }
            int min = Math.min(arrayList2.size(), arrayList6.size());
            for (int i17 = 0; i17 < min; i17++) {
                arrayList2.get(i17).run(arrayList.get(i17), (PollText) arrayList6.get(i17), pendingPollTranslation.language);
            }
        } else {
            if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
                if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    arrayList2.get(i18).run(arrayList.get(i18), null, pendingPollTranslation.language);
                }
                synchronized (this) {
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        try {
                            this.loadingTranslations.remove(arrayList.get(i19));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
            }
            toggleTranslatingDialog(j3, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        }
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushPollToTranslate$26(PendingPollTranslation pendingPollTranslation, long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bl(this, pendingPollTranslation, tLObject, tL_error, j3, 0));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x00be
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushPollToTranslate$27(long r13, org.telegram.messenger.TranslateController.PendingPollTranslation r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.HashMap<java.lang.Long, java.util.ArrayList<org.telegram.messenger.TranslateController$PendingTranslation>> r0 = r12.pendingTranslations     // Catch: java.lang.Throwable -> Lb9
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb9
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L27
            r0.remove(r15)     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L27
            java.util.HashMap<java.lang.Long, java.util.ArrayList<org.telegram.messenger.TranslateController$PendingTranslation>> r0 = r12.pendingTranslations     // Catch: java.lang.Throwable -> L22
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L22
            r0.remove(r1)     // Catch: java.lang.Throwable -> L22
            goto L27
        L22:
            r0 = move-exception
            r13 = r0
            r3 = r12
            goto Lbc
        L27:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb9
            org.telegram.tgnet.TLRPC$TL_messages_translateText r0 = new org.telegram.tgnet.TLRPC$TL_messages_translateText
            r0.<init>()
            int r1 = r0.flags
            r1 = r1 | 2
            r0.flags = r1
            java.util.ArrayList<android.util.Pair<org.telegram.messenger.TranslateController$PollText, org.telegram.messenger.TranslateController$PollText>> r1 = r15.messageTexts
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L3b:
            if (r4 >= r2) goto L97
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            org.telegram.messenger.TranslateController$PollText r6 = (org.telegram.messenger.TranslateController.PollText) r6
            java.lang.Object r5 = r5.second
            org.telegram.messenger.TranslateController$PollText r5 = (org.telegram.messenger.TranslateController.PollText) r5
            org.telegram.tgnet.TLRPC$TL_textWithEntities r7 = r6.question
            if (r7 == 0) goto L5c
            if (r5 == 0) goto L57
            org.telegram.tgnet.TLRPC$TL_textWithEntities r8 = r5.question
            if (r8 != 0) goto L5c
        L57:
            java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_textWithEntities> r8 = r0.text
            r8.add(r7)
        L5c:
            java.util.ArrayList<org.telegram.tgnet.TLRPC$PollAnswer> r7 = r6.answers
            int r7 = r7.size()
            if (r5 != 0) goto L66
            r8 = 0
            goto L6c
        L66:
            java.util.ArrayList<org.telegram.tgnet.TLRPC$PollAnswer> r8 = r5.answers
            int r8 = r8.size()
        L6c:
            if (r7 == r8) goto L87
            java.util.ArrayList<org.telegram.tgnet.TLRPC$PollAnswer> r7 = r6.answers
            int r8 = r7.size()
            r9 = 0
        L75:
            if (r9 >= r8) goto L87
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            org.telegram.tgnet.TLRPC$PollAnswer r10 = (org.telegram.tgnet.TLRPC.PollAnswer) r10
            java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_textWithEntities> r11 = r0.text
            org.telegram.tgnet.TLRPC$TL_textWithEntities r10 = r10.text
            r11.add(r10)
            goto L75
        L87:
            org.telegram.tgnet.TLRPC$TL_textWithEntities r6 = r6.solution
            if (r6 == 0) goto L3b
            if (r5 == 0) goto L91
            org.telegram.tgnet.TLRPC$TL_textWithEntities r5 = r5.solution
            if (r5 != 0) goto L3b
        L91:
            java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_textWithEntities> r5 = r0.text
            r5.add(r6)
            goto L3b
        L97:
            java.lang.String r1 = r15.language
            java.lang.String r1 = normalizeLanguage(r1)
            r0.to_lang = r1
            org.telegram.tgnet.ConnectionsManager r1 = r12.getConnectionsManager()
            org.telegram.messenger.yk r2 = new org.telegram.messenger.yk
            r7 = 0
            r3 = r12
            r5 = r13
            r4 = r15
            r2.<init>(r3, r4, r5, r7)
            int r13 = r1.sendRequest(r0, r2)
            monitor-enter(r12)
            r4.reqId = r13     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb5
            return
        Lb5:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb5
            throw r13
        Lb9:
            r0 = move-exception
            r3 = r12
        Lbb:
            r13 = r0
        Lbc:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lbe
            throw r13
        Lbe:
            r0 = move-exception
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushPollToTranslate$27(long, org.telegram.messenger.TranslateController$PendingPollTranslation):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushRichMessageToTranslate$28(PendingRichTranslation pendingRichTranslation, TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback3<Integer, TL_iv.RichMessage, String>> arrayList2;
        synchronized (this) {
            arrayList = pendingRichTranslation.messageIds;
            arrayList2 = pendingRichTranslation.callbacks;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i10 = 0; i10 < min; i10++) {
                arrayList2.get(i10).run(arrayList.get(i10), arrayList3.get(i10), pendingRichTranslation.language);
            }
        } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                arrayList2.get(i11).run(arrayList.get(i11), null, pendingRichTranslation.language);
            }
        } else {
            toggleTranslatingDialog(j3, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        }
        synchronized (this) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    this.loadingTranslations.remove(arrayList.get(i12));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushRichMessageToTranslate$29(PendingRichTranslation pendingRichTranslation, long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bl(this, pendingRichTranslation, tLObject, tL_error, j3, 1));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0067
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushRichMessageToTranslate$30(long r9, org.telegram.messenger.TranslateController.PendingRichTranslation r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashMap<java.lang.Long, java.util.ArrayList<org.telegram.messenger.TranslateController$PendingRichTranslation>> r0 = r8.pendingRichTranslations     // Catch: java.lang.Throwable -> L62
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L62
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L26
            r0.remove(r11)     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L26
            java.util.HashMap<java.lang.Long, java.util.ArrayList<org.telegram.messenger.TranslateController$PendingRichTranslation>> r0 = r8.pendingRichTranslations     // Catch: java.lang.Throwable -> L22
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L22
            r0.remove(r1)     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L65
        L26:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L62
            org.telegram.tgnet.TLRPC$TL_messages_translateRichMessage r0 = new org.telegram.tgnet.TLRPC$TL_messages_translateRichMessage
            r0.<init>()
            int r1 = r0.flags
            r1 = r1 | 1
            r0.flags = r1
            org.telegram.messenger.MessagesController r1 = r8.getMessagesController()
            org.telegram.tgnet.TLRPC$InputPeer r1 = r1.getInputPeer(r9)
            r0.peer = r1
            java.util.ArrayList<java.lang.Integer> r1 = r11.messageIds
            r0.id = r1
            java.lang.String r1 = r11.language
            java.lang.String r1 = normalizeLanguage(r1)
            r0.to_lang = r1
            org.telegram.tgnet.ConnectionsManager r1 = r8.getConnectionsManager()
            org.telegram.messenger.yk r2 = new org.telegram.messenger.yk
            r7 = 1
            r3 = r8
            r5 = r9
            r4 = r11
            r2.<init>(r3, r4, r5, r7)
            int r9 = r1.sendRequest(r0, r2)
            monitor-enter(r8)
            r4.reqId = r9     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5e
            return
        L5e:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5e
            throw r9
        L62:
            r0 = move-exception
            r3 = r8
        L64:
            r9 = r0
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L67
            throw r9
        L67:
            r0 = move-exception
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushRichMessageToTranslate$30(long, org.telegram.messenger.TranslateController$PendingRichTranslation):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$pushToSummarize$18(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$pushToSummarize$19(int i10, Utilities.Callback callback, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.n2 U;
        if (tL_textWithEntities != null) {
            this.loadingSummarizations.remove(Integer.valueOf(i10));
            callback.run(tL_textWithEntities);
        } else if (tL_error != null) {
            if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.qc J = org.telegram.ui.Components.yc.a0(U).J(R.raw.star_premium_2, LocaleController.getString(R.string.SummaryLimit), LocaleController.getString(R.string.SummaryLimitUpgrade), new td(3, U));
                J.j = 5000;
                J.k(true);
            }
            this.loadingSummarizations.remove(Integer.valueOf(i10));
            callback.run(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$20(Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, String str2, Boolean bool) {
        if (str2 == null) {
            toggleTranslatingDialog(j3, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        } else {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$21(Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, String str2, Boolean bool) {
        if (str2 == null) {
            toggleTranslatingDialog(j3, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        } else {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0102 A[EXC_TOP_SPLITTER, LOOP:1: B:14:0x0102->B:17:0x0108, LOOP_START, PHI: r12
      0x0102: PHI (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:13:0x0101, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$pushToTranslate$22(PendingTranslation pendingTranslation, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, Set set) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String>> arrayList2;
        ArrayList<TLRPC.TL_textWithEntities> arrayList3;
        String str;
        synchronized (this) {
            try {
                arrayList = pendingTranslation.messageIds;
                arrayList2 = pendingTranslation.callbacks;
                arrayList3 = pendingTranslation.messageTexts;
                str = pendingTranslation.language;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList4 = ((TLRPC.TL_messages_translateResult) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList4.size());
            for (int i10 = 0; i10 < min; i10++) {
                arrayList2.get(i10).run(Boolean.valueOf(z10), arrayList.get(i10), u31.F(arrayList3.get(i10), arrayList4.get(i10)), str);
            }
        } else {
            if (tL_error == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
                if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
                    if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        arrayList2.get(i11).run(Boolean.valueOf(z10), arrayList.get(i11), null, pendingTranslation.language);
                    }
                } else {
                    toggleTranslatingDialog(j3, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
                }
                synchronized (this) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        try {
                            set.remove(arrayList.get(i12));
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u31.x(arrayList3.get(i13).text, null, str, new xk(this, arrayList2.get(i13), z10, arrayList.get(i13).intValue(), str, j3, 0));
            }
        }
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$23(PendingTranslation pendingTranslation, boolean z10, long j3, Set set, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new wk(j3, set, pendingTranslation, this, tLObject, tL_error, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushToTranslate$24(HashMap hashMap, long j3, PendingTranslation pendingTranslation, boolean z10, Set set) {
        long j10;
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(pendingTranslation);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String str = getMessagesController().translationsAutoEnabled;
        if ("alternative".equals(str) || "system".equals(str)) {
            String str2 = pendingTranslation.language;
            for (int i10 = 0; i10 < pendingTranslation.messageIds.size(); i10++) {
                u31.x(pendingTranslation.messageTexts.get(i10).text, null, str2, new xk(this, pendingTranslation.callbacks.get(i10), z10, pendingTranslation.messageIds.get(i10).intValue(), str2, j3, 1));
            }
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (z10) {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.addAll(pendingTranslation.messageTexts);
            j10 = j3;
        } else {
            tL_messages_translateText.flags |= 1;
            j10 = j3;
            tL_messages_translateText.peer = getMessagesController().getInputPeer(j10);
            tL_messages_translateText.id = pendingTranslation.messageIds;
        }
        tL_messages_translateText.to_lang = normalizeLanguage(pendingTranslation.language);
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new na(this, pendingTranslation, z10, j10, set, 1));
        synchronized (this) {
            pendingTranslation.reqId = sendRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDialogTranslateTo$0(long j3, String str) {
        Boolean bool;
        synchronized (this) {
            this.translateDialogLanguage.put(Long.valueOf(j3), str);
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            saveTranslatingDialogsCache();
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j3), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$43(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j3) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$44(MessageObject messageObject, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, MessageKey messageKey, Runnable runnable, long j3) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = u31.F(tL_textWithEntities, tL_textWithEntities2);
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$45(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j3) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePhoto$46(final MessageObject messageObject, final String str, final MessageKey messageKey, final Runnable runnable, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
            AndroidUtilities.runOnUIThread(new dl(this, messageObject, str, messageKey, runnable, j3, 1));
            return;
        }
        ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
        if (arrayList.size() <= 0) {
            AndroidUtilities.runOnUIThread(new dl(this, messageObject, str, messageKey, runnable, j3, 0));
        } else {
            final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.el
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateController.this.lambda$translatePhoto$44(messageObject, str, tL_textWithEntities, tL_textWithEntities2, messageKey, runnable, j3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$translateStory$35(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$translateStory$36(TL_stories.StoryItem storyItem, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = u31.F(tL_textWithEntities, tL_textWithEntities2);
        getMessagesController().getStoriesController().k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$translateStory$37(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateStory$38(final TL_stories.StoryItem storyItem, final String str, final StoryKey storyKey, final Runnable runnable, TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
            final int i10 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.il
                public final /* synthetic */ TranslateController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.lambda$translateStory$35(storyItem, str, storyKey, runnable);
                            break;
                        default:
                            this.b.lambda$translateStory$37(storyItem, str, storyKey, runnable);
                            break;
                    }
                }
            });
            return;
        }
        ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
        if (arrayList.size() > 0) {
            AndroidUtilities.runOnUIThread(new ml(this, storyItem, str, tL_textWithEntities, arrayList.get(0), storyKey, runnable, 0));
        } else {
            final int i11 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.il
                public final /* synthetic */ TranslateController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.lambda$translateStory$35(storyItem, str, storyKey, runnable);
                            break;
                        default:
                            this.b.lambda$translateStory$37(storyItem, str, storyKey, runnable);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadTranslatingDialogsCached() {
        boolean z10;
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
                        z10 = false;
                    } else {
                        str3 = com.google.android.gms.internal.vision.e2.i(1, 0, str3);
                        z10 = true;
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
                            this.translatingDialogs.put(parseLong, Boolean.valueOf(true ^ z10));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
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

    private void pushPollToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, PollText, String> callback3) {
        Throwable th2;
        PendingPollTranslation pendingPollTranslation;
        if (messageObject == null || messageObject.getId() < 0 || callback3 == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        synchronized (this) {
            try {
                try {
                    ArrayList<PendingPollTranslation> arrayList = this.pendingPollTranslations.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        try {
                            HashMap<Long, ArrayList<PendingPollTranslation>> hashMap = this.pendingPollTranslations;
                            Long valueOf = Long.valueOf(dialogId);
                            ArrayList<PendingPollTranslation> arrayList2 = new ArrayList<>();
                            hashMap.put(valueOf, arrayList2);
                            arrayList = arrayList2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
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
                        pendingPollTranslation.symbolsCount += length;
                        PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                        a4 a4Var = new a4(this, dialogId, pendingPollTranslation2, 1);
                        pendingPollTranslation2.runnable = a4Var;
                        AndroidUtilities.runOnUIThread(a4Var, pendingPollTranslation2.delay);
                        pendingPollTranslation2.delay /= 2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    private void pushRichMessageToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, TL_iv.RichMessage, String> callback3) {
        Throwable th2;
        PendingRichTranslation pendingRichTranslation;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getId() < 0 || callback3 == null || messageObject.messageOwner.rich_message == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        synchronized (this) {
            try {
                try {
                    ArrayList<PendingRichTranslation> arrayList = this.pendingRichTranslations.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        try {
                            HashMap<Long, ArrayList<PendingRichTranslation>> hashMap = this.pendingRichTranslations;
                            Long valueOf = Long.valueOf(dialogId);
                            ArrayList<PendingRichTranslation> arrayList2 = new ArrayList<>();
                            hashMap.put(valueOf, arrayList2);
                            arrayList = arrayList2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        pendingRichTranslation = new PendingRichTranslation();
                        arrayList.add(pendingRichTranslation);
                    } else {
                        pendingRichTranslation = arrayList.get(arrayList.size() - 1);
                    }
                    if (pendingRichTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                        return;
                    }
                    if (pendingRichTranslation.messageIds.size() + 1 >= 20) {
                        AndroidUtilities.cancelRunOnUIThread(pendingRichTranslation.runnable);
                        AndroidUtilities.runOnUIThread(pendingRichTranslation.runnable);
                        pendingRichTranslation = new PendingRichTranslation();
                        arrayList.add(pendingRichTranslation);
                    }
                    PendingRichTranslation pendingRichTranslation2 = pendingRichTranslation;
                    Runnable runnable = pendingRichTranslation2.runnable;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                    }
                    this.loadingTranslations.add(Integer.valueOf(messageObject.getId()));
                    pendingRichTranslation2.messageIds.add(Integer.valueOf(messageObject.getId()));
                    FileLog.d("pending translation +" + messageObject.getId() + " rich message");
                    pendingRichTranslation2.callbacks.add(callback3);
                    pendingRichTranslation2.language = str;
                    a4 a4Var = new a4(this, dialogId, pendingRichTranslation2, 2);
                    pendingRichTranslation2.runnable = a4Var;
                    AndroidUtilities.runOnUIThread(a4Var, pendingRichTranslation2.delay);
                    pendingRichTranslation2.delay /= 2;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    private void pushToSummarize(MessageObject messageObject, String str, Utilities.Callback<TLRPC.TL_textWithEntities> callback) {
        int hash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(str != null ? 1 : 0));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new a(), new nh(this, hash, callback));
    }

    private void pushToTranslate(MessageObject messageObject, String str, Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4) {
        PendingTranslation pendingTranslation;
        int length;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getId() < 0 || callback4 == null) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z10 = false;
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen) {
            z10 = true;
        }
        long dialogId = messageObject.getDialogId();
        HashMap<Long, ArrayList<PendingTranslation>> hashMap = z10 ? this.pendingTranscriptionsTranslations : this.pendingTranslations;
        Set<Integer> set = z10 ? this.loadingTranscriptionTranslations : this.loadingTranslations;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z10) {
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
                if (z10) {
                    String str4 = messageObject.messageOwner.voiceTranscription;
                    length = str4 == null ? 0 : str4.length();
                } else {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3 == null || (str2 = message3.message) == null) {
                        CharSequence charSequence = messageObject.caption;
                        if (charSequence != null) {
                            length = charSequence.length();
                        } else {
                            CharSequence charSequence2 = messageObject.messageText;
                            length = charSequence2 != null ? charSequence2.length() : 0;
                        }
                    } else {
                        length = str2.length();
                    }
                }
                if (pendingTranslation.symbolsCount + length >= MAX_SYMBOLS_PER_REQUEST || pendingTranslation.messageIds.size() + 1 >= 20) {
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
                pendingTranslation.symbolsCount += length;
                PendingTranslation pendingTranslation2 = pendingTranslation;
                jd jdVar = new jd(this, hashMap, dialogId, pendingTranslation2, z10, set);
                pendingTranslation2.runnable = jdVar;
                AndroidUtilities.runOnUIThread(jdVar, pendingTranslation2.delay);
                pendingTranslation2.delay /= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void resetTranslatingDialogsCache() {
        MessagesController.getMainSettings(this.currentAccount).edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
    }

    private void saveTranslatingDialogsCache() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (int i10 = 0; i10 < this.translatingDialogs.size(); i10++) {
            try {
                long keyAt = this.translatingDialogs.keyAt(i10);
                if (!z10) {
                    sb2.append(";");
                }
                if (z10) {
                    z10 = false;
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
                sb2.append(keyAt);
                sb2.append("=");
                sb2.append(str);
                sb2.append(">");
                sb2.append(str2);
                if (!this.translatingDialogs.valueAt(i10).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator<Long> it = this.hideTranslateDialogs.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (android.text.TextUtils.equals(r0.translatedToLanguage, org.telegram.ui.Components.u31.B()) != false) goto L21;
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
        if (messageObject == null || (message = messageObject.messageOwner) == null || TextUtils.isEmpty(message.message)) {
            return false;
        }
        if (str == null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3.translatedText != null) {
            }
        }
        if (str == null || isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
            return false;
        }
        return !messageObject.translated;
    }

    public boolean canTranslateStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null || TextUtils.isEmpty(storyItem.caption) || Emoji.fullyConsistsOfEmojis(storyItem.caption)) {
            return false;
        }
        if (storyItem.detectedLng == null && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, u31.B())) {
            return true;
        }
        String str = storyItem.detectedLng;
        return (str == null || isLanguageRestricted(str)) ? false : true;
    }

    public void cancelAllTranslations() {
        synchronized (this) {
            try {
                for (ArrayList<PendingTranslation> arrayList : this.pendingTranslations.values()) {
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            PendingTranslation pendingTranslation = arrayList.get(i10);
                            i10++;
                            PendingTranslation pendingTranslation2 = pendingTranslation;
                            AndroidUtilities.cancelRunOnUIThread(pendingTranslation2.runnable);
                            if (pendingTranslation2.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingTranslation2.reqId, true);
                                ArrayList<Integer> arrayList2 = pendingTranslation2.messageIds;
                                int size2 = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Integer num = arrayList2.get(i11);
                                    i11++;
                                    this.loadingTranslations.remove(num);
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingTranslation> arrayList3 : this.pendingTranscriptionsTranslations.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            PendingTranslation pendingTranslation3 = arrayList3.get(i12);
                            i12++;
                            PendingTranslation pendingTranslation4 = pendingTranslation3;
                            AndroidUtilities.cancelRunOnUIThread(pendingTranslation4.runnable);
                            if (pendingTranslation4.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingTranslation4.reqId, true);
                                ArrayList<Integer> arrayList4 = pendingTranslation4.messageIds;
                                int size4 = arrayList4.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Integer num2 = arrayList4.get(i13);
                                    i13++;
                                    this.loadingTranscriptionTranslations.remove(num2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingPollTranslation> arrayList5 : this.pendingPollTranslations.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            PendingPollTranslation pendingPollTranslation = arrayList5.get(i14);
                            i14++;
                            PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                            AndroidUtilities.cancelRunOnUIThread(pendingPollTranslation2.runnable);
                            if (pendingPollTranslation2.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingPollTranslation2.reqId, true);
                                ArrayList<Integer> arrayList6 = pendingPollTranslation2.messageIds;
                                int size6 = arrayList6.size();
                                int i15 = 0;
                                while (i15 < size6) {
                                    Integer num3 = arrayList6.get(i15);
                                    i15++;
                                    this.loadingTranslations.remove(num3);
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingRichTranslation> arrayList7 : this.pendingRichTranslations.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size7) {
                            PendingRichTranslation pendingRichTranslation = arrayList7.get(i16);
                            i16++;
                            PendingRichTranslation pendingRichTranslation2 = pendingRichTranslation;
                            AndroidUtilities.cancelRunOnUIThread(pendingRichTranslation2.runnable);
                            if (pendingRichTranslation2.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingRichTranslation2.reqId, true);
                                ArrayList<Integer> arrayList8 = pendingRichTranslation2.messageIds;
                                int size8 = arrayList8.size();
                                int i17 = 0;
                                while (i17 < size8) {
                                    Integer num4 = arrayList8.get(i17);
                                    i17++;
                                    this.loadingTranslations.remove(num4);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelTranslations(long j3) {
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j3));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        PendingTranslation pendingTranslation = arrayList.get(i10);
                        i10++;
                        PendingTranslation pendingTranslation2 = pendingTranslation;
                        AndroidUtilities.cancelRunOnUIThread(pendingTranslation2.runnable);
                        if (pendingTranslation2.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingTranslation2.reqId, true);
                            ArrayList<Integer> arrayList2 = pendingTranslation2.messageIds;
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Integer num = arrayList2.get(i11);
                                i11++;
                                this.loadingTranslations.remove(num);
                            }
                        }
                    }
                    this.pendingTranslations.remove(Long.valueOf(j3));
                }
                ArrayList<PendingTranslation> arrayList3 = this.pendingTranscriptionsTranslations.get(Long.valueOf(j3));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        PendingTranslation pendingTranslation3 = arrayList3.get(i12);
                        i12++;
                        PendingTranslation pendingTranslation4 = pendingTranslation3;
                        AndroidUtilities.cancelRunOnUIThread(pendingTranslation4.runnable);
                        if (pendingTranslation4.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingTranslation4.reqId, true);
                            ArrayList<Integer> arrayList4 = pendingTranslation4.messageIds;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Integer num2 = arrayList4.get(i13);
                                i13++;
                                this.loadingTranscriptionTranslations.remove(num2);
                            }
                        }
                    }
                    this.pendingTranscriptionsTranslations.remove(Long.valueOf(j3));
                }
                ArrayList<PendingPollTranslation> arrayList5 = this.pendingPollTranslations.get(Long.valueOf(j3));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        PendingPollTranslation pendingPollTranslation = arrayList5.get(i14);
                        i14++;
                        PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                        AndroidUtilities.cancelRunOnUIThread(pendingPollTranslation2.runnable);
                        if (pendingPollTranslation2.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingPollTranslation2.reqId, true);
                            ArrayList<Integer> arrayList6 = pendingPollTranslation2.messageIds;
                            int size6 = arrayList6.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Integer num3 = arrayList6.get(i15);
                                i15++;
                                this.loadingTranslations.remove(num3);
                            }
                        }
                    }
                    this.pendingPollTranslations.remove(Long.valueOf(j3));
                }
                ArrayList<PendingRichTranslation> arrayList7 = this.pendingRichTranslations.get(Long.valueOf(j3));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size7) {
                        PendingRichTranslation pendingRichTranslation = arrayList7.get(i16);
                        i16++;
                        PendingRichTranslation pendingRichTranslation2 = pendingRichTranslation;
                        AndroidUtilities.cancelRunOnUIThread(pendingRichTranslation2.runnable);
                        if (pendingRichTranslation2.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingRichTranslation2.reqId, true);
                            ArrayList<Integer> arrayList8 = pendingRichTranslation2.messageIds;
                            int size8 = arrayList8.size();
                            int i17 = 0;
                            while (i17 < size8) {
                                Integer num4 = arrayList8.get(i17);
                                i17++;
                                this.loadingTranslations.remove(num4);
                            }
                        }
                    }
                    this.pendingRichTranslations.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void checkDialogMessage(long j3) {
        if (isFeatureAvailable(j3)) {
            checkDialogMessageSure(j3);
        }
    }

    public void checkDialogMessageSure(long j3) {
        if (this.translatingDialogs.get(j3, Boolean.valueOf(isChatAutoTranslated(j3))).booleanValue()) {
            getMessagesStorage().getStorageQueue().postRunnable(new al(this, j3, 1));
        }
    }

    public void checkRestrictedLanguagesUpdate() {
        synchronized (this) {
            try {
                this.translatableDialogMessages.clear();
                ArrayList arrayList = new ArrayList();
                for (Long l4 : this.translatableDialogs) {
                    long longValue = l4.longValue();
                    String str = this.detectedDialogLanguage.get(l4);
                    if (str != null && isLanguageRestricted(str)) {
                        cancelTranslations(longValue);
                        this.translatingDialogs.remove(longValue);
                        arrayList.add(l4);
                    }
                }
                this.translatableDialogs.clear();
                saveTranslatingDialogsCache();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj;
                    l10.longValue();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, l10, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void checkTranslation(MessageObject messageObject, boolean z10) {
        checkTranslation(messageObject, z10, false);
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

    public void detectPhotoLanguage(MessageObject messageObject, Utilities.Callback<String> callback) {
        if (messageObject == null || messageObject.messageOwner == null || !LanguageDetector.hasSupport() || TextUtils.isEmpty(messageObject.messageOwner.message)) {
            return;
        }
        if (!TextUtils.isEmpty(messageObject.messageOwner.originalLanguage)) {
            if (callback != null) {
                callback.run(messageObject.messageOwner.originalLanguage);
            }
        } else {
            MessageKey messageKey = new MessageKey(messageObject);
            if (this.detectingPhotos.contains(messageKey)) {
                return;
            }
            this.detectingPhotos.add(messageKey);
            LanguageDetector.detectLanguage(messageObject.messageOwner.message, new nl(this, messageObject, messageKey, callback), new nl(this, messageObject, messageKey, callback));
        }
    }

    public void detectStoryLanguage(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0 || !LanguageDetector.hasSupport()) {
            return;
        }
        StoryKey storyKey = new StoryKey(storyItem);
        if (this.detectingStories.contains(storyKey)) {
            return;
        }
        this.detectingStories.add(storyKey);
        LanguageDetector.detectLanguage(storyItem.caption, new kl(this, storyItem, storyKey), new kl(this, storyItem, storyKey));
    }

    public MessageObject findReplyMessageObject(long j3, int i10) {
        HashMap<Integer, MessageObject> hashMap = this.keptReplyMessageObjects.get(Long.valueOf(j3));
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i10));
    }

    public String getDialogDetectedLanguage(long j3) {
        return this.detectedDialogLanguage.get(Long.valueOf(j3));
    }

    public String getDialogTranslateTo(long j3) {
        String str = this.translateDialogLanguage.get(Long.valueOf(j3));
        if (str == null && ((str = u31.B()) == null || str.equals(getDialogDetectedLanguage(j3)))) {
            str = currentLanguage();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public void invalidateTranslation(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
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
            AndroidUtilities.runOnUIThread(new fl(this, messageObject, dialogId));
        }
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

    public boolean isDialogTranslatable(long j3) {
        return this.translatableDialogs.contains(Long.valueOf(j3)) && isFeatureAvailable(j3) && !DialogObject.isEncryptedDialog(j3) && getUserConfig().getClientUserId() != j3;
    }

    public boolean isFeatureAvailable() {
        return isChatTranslateEnabled() && UserConfig.getInstance(this.currentAccount).isPremium();
    }

    public boolean isTranslateDialogHidden(long j3) {
        if (this.hideTranslateDialogs.contains(Long.valueOf(j3))) {
            return true;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
        if (chatFull != null) {
            return chatFull.translations_disabled;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j3);
        if (userFull != null) {
            return userFull.translations_disabled;
        }
        return false;
    }

    public boolean isTranslating(MessageObject messageObject) {
        TLRPC.Message message;
        boolean z10 = true;
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
            z10 = false;
        }
        return z10;
    }

    public boolean isTranslatingDialog(long j3) {
        return isFeatureAvailable(j3) && this.translatingDialogs.get(j3, Boolean.valueOf(isChatAutoTranslated(j3))).booleanValue();
    }

    public boolean isTranslatingStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return false;
        }
        return this.translatingStories.contains(new StoryKey(storyItem));
    }

    public void reset() {
        this.translatableDialogMessages.clear();
        this.detectedDialogLanguage.clear();
    }

    public void setChatTranslateEnabled(boolean z10) {
        SharedPreferences.Editor edit = this.messagesController.getMainSettings().edit();
        this.chatTranslateEnabled = Boolean.valueOf(z10);
        edit.putBoolean("translate_chat_button", z10).apply();
    }

    public void setContextTranslateEnabled(boolean z10) {
        SharedPreferences.Editor edit = this.messagesController.getMainSettings().edit();
        this.contextTranslateEnabled = Boolean.valueOf(z10);
        edit.putBoolean("translate_button", z10).apply();
    }

    public void setDialogTranslateTo(long j3, String str) {
        Boolean bool;
        if (TextUtils.equals(getDialogTranslateTo(j3), str)) {
            return;
        }
        if (isTranslatingDialog(j3)) {
            AndroidUtilities.runOnUIThread(new fl(this, j3, str), 150L);
        } else {
            synchronized (this) {
                this.translateDialogLanguage.put(Long.valueOf(j3), str);
            }
        }
        cancelTranslations(j3);
        synchronized (this) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.FALSE;
            longSparseArray.put(j3, bool);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j3), bool);
        u31.I(str);
    }

    public void setHideTranslateDialog(long j3, boolean z10) {
        setHideTranslateDialog(j3, z10, false);
    }

    public void toggleTranslatingDialog(long j3) {
        toggleTranslatingDialog(j3, !isTranslatingDialog(j3));
    }

    public void translatePhoto(MessageObject messageObject, Runnable runnable) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        MessageKey messageKey = new MessageKey(messageObject);
        String B = u31.B();
        TLRPC.Message message = messageObject.messageOwner;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, B)) {
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
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = messageObject.messageOwner;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = normalizeLanguage(B);
        getConnectionsManager().sendRequest(tL_messages_translateText, new jl(this, messageObject, B, messageKey, runnable, System.currentTimeMillis(), tL_textWithEntities));
    }

    public void translateStory(TL_stories.StoryItem storyItem, Runnable runnable) {
        if (storyItem == null) {
            return;
        }
        StoryKey storyKey = new StoryKey(storyItem);
        String B = u31.B();
        if (storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, B)) {
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
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = storyItem.caption;
            tL_textWithEntities.entities = storyItem.entities;
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = normalizeLanguage(B);
            getConnectionsManager().sendRequest(tL_messages_translateText, new ll(this, storyItem, B, storyKey, runnable, tL_textWithEntities, 0));
        }
    }

    public void updateDialogFull(long j3) {
        boolean z10;
        if (isFeatureAvailable(j3) && isDialogTranslatable(j3)) {
            boolean contains = this.hideTranslateDialogs.contains(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
            if (chatFull != null) {
                z10 = chatFull.translations_disabled;
            } else {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j3);
                z10 = userFull != null ? userFull.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.hideTranslateDialogs.add(Long.valueOf(j3));
                        this.translatingDialogs.remove(j3);
                    } else {
                        this.hideTranslateDialogs.remove(Long.valueOf(j3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                saveTranslatingDialogsCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j3), Boolean.valueOf(isTranslatingDialog(j3)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkTranslation(MessageObject messageObject, boolean z10, final boolean z11) {
        final MessageObject messageObject2;
        PollText pollText;
        PollText pollText2;
        MessageObject findReplyMessageObject;
        MessageObject messageObject3;
        if (messageObject != null && messageObject.messageOwner != null) {
            final long dialogId = messageObject.getDialogId();
            if (z10) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message.summarizedOpen && message.summaryText == null && !isTranslatingDialog(messageObject.getDialogId())) {
                    pushToSummarize(messageObject, null, new c4(this, messageObject, dialogId));
                }
            }
            if (isFeatureAvailable(dialogId)) {
                if (!z11 && (messageObject3 = messageObject.replyMessageObject) != null) {
                    checkTranslation(messageObject3, z10, true);
                }
                if (isTranslatable(messageObject)) {
                    if (!isTranslatingDialog(dialogId)) {
                        checkLanguage(messageObject);
                        return;
                    }
                    if (!isTranslateDialogHidden(dialogId)) {
                        String dialogTranslateTo = getDialogTranslateTo(dialogId);
                        if (!z11 && messageObject.type != 36) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            if (((((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? message2.translatedVoiceTranscription : message2.translatedText) == null && message2.translatedPoll == null) || (((pollText2 = message2.translatedPoll) != null && !PollText.isFullyTranslated(messageObject, pollText2)) || !dialogTranslateTo.equals(messageObject.messageOwner.translatedToLanguage))) && (findReplyMessageObject = findReplyMessageObject(dialogId, messageObject.getId())) != null) {
                                TLRPC.Message message3 = messageObject.messageOwner;
                                TLRPC.Message message4 = findReplyMessageObject.messageOwner;
                                message3.translatedToLanguage = message4.translatedToLanguage;
                                message3.translatedText = message4.translatedText;
                                message3.translatedPoll = message4.translatedPoll;
                                messageObject2 = findReplyMessageObject;
                                if (z10 && isTranslatingDialog(dialogId)) {
                                    if (messageObject2.type == 36) {
                                        TLRPC.Message message5 = messageObject2.messageOwner;
                                        if (message5.summarizedOpen) {
                                            if (message5.translatedSummaryText == null || !dialogTranslateTo.equals(message5.translatedSummaryLanguage)) {
                                                pushToSummarize(messageObject2, dialogTranslateTo, new f2(this, messageObject2, dialogTranslateTo, dialogId, 2));
                                                return;
                                            }
                                            return;
                                        }
                                        if (!(((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) && (((pollText = message5.translatedPoll) == null || PollText.isFullyTranslated(messageObject2, pollText)) && dialogTranslateTo.equals(messageObject2.messageOwner.translatedToLanguage))) {
                                            if (z11) {
                                                keepReplyMessage(messageObject2);
                                                return;
                                            }
                                            return;
                                        } else {
                                            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslating, messageObject2);
                                            if (!(MessageObject.getMedia(messageObject2) instanceof TLRPC.TL_messageMediaPoll)) {
                                                pushToTranslate(messageObject2, dialogTranslateTo, new Utilities.Callback4() { // from class: org.telegram.messenger.hl
                                                    @Override // org.telegram.messenger.Utilities.Callback4
                                                    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        TranslateController.this.lambda$checkTranslation$8(messageObject2, z11, dialogId, (Boolean) obj, (Integer) obj2, (TLRPC.TL_textWithEntities) obj3, (String) obj4);
                                                    }
                                                });
                                                return;
                                            } else {
                                                final int i10 = 1;
                                                pushPollToTranslate(messageObject2, dialogTranslateTo, new Utilities.Callback3(this) { // from class: org.telegram.messenger.gl
                                                    public final /* synthetic */ TranslateController b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // org.telegram.messenger.Utilities.Callback3
                                                    public final void run(Object obj, Object obj2, Object obj3) {
                                                        switch (i10) {
                                                            case 0:
                                                                this.b.lambda$checkTranslation$5(messageObject2, z11, dialogId, (Integer) obj, (TL_iv.RichMessage) obj2, (String) obj3);
                                                                break;
                                                            default:
                                                                this.b.lambda$checkTranslation$7(messageObject2, z11, dialogId, (Integer) obj, (TranslateController.PollText) obj2, (String) obj3);
                                                                break;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        }
                                    }
                                    TLRPC.Message message6 = messageObject2.messageOwner;
                                    if (message6.translatedRichMessage == null || !dialogTranslateTo.equals(message6.translatedToLanguage)) {
                                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslating, messageObject2);
                                        final int i11 = 0;
                                        pushRichMessageToTranslate(messageObject2, dialogTranslateTo, new Utilities.Callback3(this) { // from class: org.telegram.messenger.gl
                                            public final /* synthetic */ TranslateController b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.messenger.Utilities.Callback3
                                            public final void run(Object obj, Object obj2, Object obj3) {
                                                switch (i11) {
                                                    case 0:
                                                        this.b.lambda$checkTranslation$5(messageObject2, z11, dialogId, (Integer) obj, (TL_iv.RichMessage) obj2, (String) obj3);
                                                        break;
                                                    default:
                                                        this.b.lambda$checkTranslation$7(messageObject2, z11, dialogId, (Integer) obj, (TranslateController.PollText) obj2, (String) obj3);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                        }
                        messageObject2 = messageObject;
                        if (z10) {
                            if (messageObject2.type == 36) {
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean isFeatureAvailable(long j3) {
        if (!isChatTranslateEnabled()) {
            return false;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return true;
        }
        return chat != null && chat.autotranslation;
    }

    public void setHideTranslateDialog(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().getInputPeer(j3);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
        if (chatFull != null) {
            chatFull.translations_disabled = z10;
            getMessagesStorage().updateChatInfo(chatFull, true);
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j3);
        if (userFull != null) {
            userFull.translations_disabled = z10;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.hideTranslateDialogs.add(Long.valueOf(j3));
                    this.translatingDialogs.remove(j3);
                } else {
                    this.hideTranslateDialogs.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        saveTranslatingDialogsCache();
        if (z11) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j3), Boolean.valueOf(isTranslatingDialog(j3)));
    }

    public boolean toggleTranslatingDialog(long j3, boolean z10) {
        boolean isTranslatingDialog = isTranslatingDialog(j3);
        boolean z11 = true;
        if (z10 && !isTranslatingDialog) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j3), bool);
        } else if (z10 || !isTranslatingDialog) {
            z11 = false;
        } else {
            LongSparseArray<Boolean> longSparseArray2 = this.translatingDialogs;
            Boolean bool2 = Boolean.FALSE;
            longSparseArray2.put(j3, bool2);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j3), bool2);
            cancelTranslations(j3);
        }
        saveTranslatingDialogsCache();
        return z11;
    }

    public boolean isTranslating(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        if (messageObject == null || !isTranslatingDialog(messageObject.getDialogId())) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z10 = message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal;
        synchronized (this) {
            try {
                if ((z10 ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId()))) {
                    return true;
                }
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList = groupedMessages.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        MessageObject messageObject2 = arrayList.get(i10);
                        i10++;
                        if ((z10 ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject2.getId()))) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
