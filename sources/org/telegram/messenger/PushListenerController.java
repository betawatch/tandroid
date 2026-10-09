package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseBooleanArray;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static final class GooglePushListenerServiceProvider implements IPushListenerServiceProvider {
        public static final GooglePushListenerServiceProvider INSTANCE = new GooglePushListenerServiceProvider();
        private Boolean hasServices;

        private GooglePushListenerServiceProvider() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRequestPushToken$0(Task task) {
            SharedConfig.pushStringGetTimeEnd = SystemClock.elapsedRealtime();
            if (task.isSuccessful()) {
                String str = (String) task.getResult();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                PushListenerController.sendRegistrationToServer(getPushType(), str);
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("Failed to get regid");
            }
            SharedConfig.pushStringStatus = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(getPushType(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onRequestPushToken$1() {
            FirebaseMessaging firebaseMessaging;
            try {
                SharedConfig.pushStringGetTimeStart = SystemClock.elapsedRealtime();
                k9.h.f(ApplicationLoader.applicationContext);
                com.google.firebase.messaging.u uVar = FirebaseMessaging.l;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(k9.h.c());
                }
                firebaseMessaging.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f.execute(new ci.y8(5, firebaseMessaging, taskCompletionSource));
                taskCompletionSource.getTask().addOnCompleteListener(new d0(this, 11));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public String getLogTitle() {
            return "Google Play Services";
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public int getPushType() {
            return 2;
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public boolean hasServices() {
            if (this.hasServices == null) {
                try {
                    this.hasServices = Boolean.valueOf(k6.d.d.d(ApplicationLoader.applicationContext, k6.e.a) == 0);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    this.hasServices = Boolean.FALSE;
                }
            }
            return this.hasServices.booleanValue();
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public void onRequestPushToken() {
            String str = SharedConfig.pushString;
            if (TextUtils.isEmpty(str)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("FCM Registration not found.");
                }
            } else if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED) {
                FileLog.d("FCM regId = " + str);
            }
            Utilities.globalQueue.postRunnable(new ug(this, 4));
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PushType {
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        switch (str) {
            case "CHAT_REACT_CONTACT":
                return LocaleController.formatString(R.string.PushChatReactContact, objArr);
            case "REACT_WALLET_TONCONNECT_REQUEST":
                return LocaleController.formatString(R.string.PushReactWalletTonConnectRequest, objArr);
            case "CHAT_REACT_POLL_APPEND":
                return LocaleController.formatString(R.string.PushChatReactPollUpdate, objArr);
            case "REACT_GEOLIVE":
                return LocaleController.formatString(R.string.PushReactGeoLocation, objArr);
            case "REACT_GAME_SCORE":
                return LocaleController.formatString(R.string.PushReactGameScore, objArr);
            case "REACT_STORY_HIDDEN":
                return LocaleController.formatString(R.string.PushReactStoryHidden, objArr);
            case "CHAT_REACT_TODO_DONE":
            case "CHAT_REACT_TODO_APPEND":
                return LocaleController.formatString(R.string.PushChatReactTodoUpdate, objArr);
            case "REACT_RECURRING_PAY":
                return LocaleController.formatString(R.string.PushReactRecurringPay, objArr);
            case "REACT_STARGIFT_UPGRADE":
                return LocaleController.formatString(R.string.PushReactStarGiftUpgrade, objArr);
            case "REACT_HIDDEN":
                return LocaleController.formatString(R.string.PushReactHidden, objArr);
            case "CHAT_REACT_NOTEXT":
                return LocaleController.formatString(R.string.PushChatReactNotext, objArr);
            case "CHAT_REACT_GAME_SCORE":
                return LocaleController.formatString(R.string.PushChatReactGameScore, objArr);
            case "REACT_NOTEXT":
                return LocaleController.formatString(R.string.PushReactNoText, objArr);
            case "REACT_PHOTO_SECRET":
                return LocaleController.formatString(R.string.PushReactPhotoSecret, objArr);
            case "REACT_WALLPAPER":
                return LocaleController.formatString(R.string.PushReactWallpaper, objArr);
            case "CHAT_REACT_INVOICE":
                return LocaleController.formatString(R.string.PushChatReactInvoice, objArr);
            case "CHAT_REACT_NOTHEME":
            case "CHAT_REACT_THEME":
                return LocaleController.formatString(R.string.PushChatReactThemeChange, objArr);
            case "REACT_CONTACT":
                return LocaleController.formatString(R.string.PushReactContect, objArr);
            case "REACT_STARGIFT_PREPAID_UPGRADE":
                return LocaleController.formatString(R.string.PushReactStarGiftPrepaidUpgrade, objArr);
            case "CHAT_REACT_STICKER":
                return LocaleController.formatString(R.string.PushChatReactSticker, objArr);
            case "REACT_SAME_WALLPAPER":
                return LocaleController.formatString(R.string.PushReactSameWallpaper, objArr);
            case "REACT_GRAM_TRANSFER_COMMENT":
                return LocaleController.formatString(R.string.PushReactGramTransferComment, objArr);
            case "REACT_GAME":
                return LocaleController.formatString(R.string.PushReactGame, objArr);
            case "REACT_POLL":
                return LocaleController.formatString(R.string.PushReactPoll, objArr);
            case "REACT_QUIZ":
                return LocaleController.formatString(R.string.PushReactQuiz, objArr);
            case "REACT_TEXT":
                return LocaleController.formatString(R.string.PushReactText, objArr);
            case "REACT_TODO":
                return LocaleController.formatString(R.string.PushReactTodo, objArr);
            case "REACT_INVOICE":
                return LocaleController.formatString(R.string.PushReactInvoice, objArr);
            case "REACT_SCREENSHOT":
                return LocaleController.formatString(R.string.PushReactScreenshot, objArr);
            case "CHAT_REACT_DOC":
                return LocaleController.formatString(R.string.PushChatReactDoc, objArr);
            case "CHAT_REACT_GEO":
                return LocaleController.formatString(R.string.PushChatReactGeo, objArr);
            case "CHAT_REACT_GIF":
                return LocaleController.formatString(R.string.PushChatReactGif, objArr);
            case "REACT_TODO_DONE":
            case "REACT_TODO_APPEND":
                return LocaleController.formatString(R.string.PushReactTodoUpdate, objArr);
            case "REACT_NOTHEME":
            case "REACT_THEME":
            case "REACT_GIFT_THEME":
                return LocaleController.formatString(R.string.PushReactThemeChange, objArr);
            case "REACT_GRAM_TRANSFER":
                return LocaleController.formatString(R.string.PushReactGramTransfer, objArr);
            case "REACT_STARGIFT_UNPACK_UPGRADE":
                return LocaleController.formatString(R.string.PushReactStarGiftUnpackUpgrade, objArr);
            case "REACT_GIFTCODE":
                return LocaleController.formatString(R.string.PushReactGiftCode, objArr);
            case "REACT_STICKER":
                return LocaleController.formatString(R.string.PushReactSticker, objArr);
            case "CHAT_REACT_AUDIO":
                return LocaleController.formatString(R.string.PushChatReactAudio, objArr);
            case "CHAT_REACT_PHOTO":
                return LocaleController.formatString(R.string.PushChatReactPhoto, objArr);
            case "CHAT_REACT_ROUND":
                return LocaleController.formatString(R.string.PushChatReactRound, objArr);
            case "CHAT_REACT_STORY":
                return LocaleController.formatString(R.string.PushChatReactStory, objArr);
            case "CHAT_REACT_VIDEO":
                return LocaleController.formatString(R.string.PushChatReactVideo, objArr);
            case "CHAT_REACT_GIVEAWAY":
                return LocaleController.formatString(R.string.NotificationChatReactGiveaway, objArr);
            case "REACT_UNIQUE_STARGIFT":
                return LocaleController.formatString(R.string.PushReactUniqueStarGift, objArr);
            case "REACT_STORY_MENTION":
                return LocaleController.formatString(R.string.PushReactStoryMention, objArr);
            case "REACT_GIVEAWAY_STARS":
                return LocaleController.formatString(R.string.NotificationReactGiveaway, objArr);
            case "REACT_GIVEAWAY":
                return LocaleController.formatString(R.string.NotificationReactGiveaway, objArr);
            case "REACT_STARGIFT":
                return LocaleController.formatString(R.string.PushReactStarGift, objArr);
            case "CHAT_REACT_GEOLIVE":
                return LocaleController.formatString(R.string.PushChatReactGeoLive, objArr);
            case "REACT_VIDEO_SECRET":
                return LocaleController.formatString(R.string.PushReactVideoSecret, objArr);
            case "REACT_SUGGEST_BIRTHDAY":
                return LocaleController.formatString(R.string.PushReactSuggestBirthday, objArr);
            case "REACT_PROXIMITY":
                return LocaleController.formatString(R.string.PushReactProximity, objArr);
            case "REACT_PAID_MEDIA":
                return LocaleController.formatString(R.string.PushReactPaidMedia, objArr);
            case "REACT_AUDIO":
                return LocaleController.formatString(R.string.PushReactAudio, objArr);
            case "REACT_PHOTO":
                return LocaleController.formatString(R.string.PushReactPhoto, objArr);
            case "REACT_ROUND":
                return LocaleController.formatString(R.string.PushReactRound, objArr);
            case "REACT_STORY":
                return LocaleController.formatString(R.string.PushReactStory, objArr);
            case "REACT_VIDEO":
                return LocaleController.formatString(R.string.PushReactVideo, objArr);
            case "REACT_SUGGEST_USERPIC":
                return LocaleController.formatString(R.string.PushReactSuggestUserpic, objArr);
            case "REACT_DOC":
                return LocaleController.formatString(R.string.PushReactDoc, objArr);
            case "REACT_GEO":
                return LocaleController.formatString(R.string.PushReactGeo, objArr);
            case "REACT_GIF":
                return LocaleController.formatString(R.string.PushReactGif, objArr);
            case "CHAT_REACT_GAME":
                return LocaleController.formatString(R.string.PushChatReactGame, objArr);
            case "CHAT_REACT_POLL":
                return LocaleController.formatString(R.string.PushChatReactPoll, objArr);
            case "CHAT_REACT_QUIZ":
                return LocaleController.formatString(R.string.PushChatReactQuiz, objArr);
            case "CHAT_REACT_TEXT":
                return LocaleController.formatString(R.string.PushChatReactText, objArr);
            case "CHAT_REACT_TODO":
                return LocaleController.formatString(R.string.PushChatReactTodo, objArr);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$2(int i10, TLRPC.TL_updates tL_updates) {
        MessagesController.getInstance(i10).lambda$processUpdates$377(tL_updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$3(int i10) {
        if (UserConfig.getInstance(i10).getClientUserId() != 0) {
            UserConfig.getInstance(i10).clearConfig();
            MessagesController.getInstance(i10).performLogout(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$4(int i10) {
        LocationController.getInstance(i10).setNewLocationEndWatchTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$5(int i10, long j3, int i11) {
        MessagesController.getInstance(i10).reportMessageDelivery(j3, i11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1137:0x040f, code lost:
    
        if (r5.equals("MESSAGE_WALLET_TONCONNECT_REQUEST") != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0aaf, code lost:
    
        if (r5.equals("LOCKED_MESSAGE") != false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x1420, code lost:
    
        if (r5.equals("MESSAGE_GRAM_TRANSFER_COMMENT") != false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x1738, code lost:
    
        if (r5.equals("REACT_TEXT") != false) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x18d6, code lost:
    
        if (r5.equals(r2) != false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x1e01, code lost:
    
        if (r5.equals("CHANNEL_MESSAGE_TEXT") != false) goto L903;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x2087, code lost:
    
        if (r5.equals("MESSAGE_MUTED") != false) goto L965;
     */
    /* JADX WARN: Code restructure failed: missing block: B:981:0x235d, code lost:
    
        if (r5.equals("CHAT_CREATED") != false) goto L1022;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x08b6 A[Catch: all -> 0x1fd3, TryCatch #10 {all -> 0x1fd3, blocks: (B:105:0x04a4, B:109:0x04b5, B:113:0x04f7, B:127:0x0523, B:130:0x0537, B:132:0x0547, B:148:0x05cd, B:151:0x05e1, B:155:0x05f8, B:167:0x0678, B:178:0x06f4, B:180:0x06fa, B:184:0x0715, B:195:0x0784, B:201:0x0798, B:212:0x07d3, B:219:0x07fc, B:224:0x080b, B:230:0x0823, B:241:0x084f, B:252:0x08c8, B:255:0x08d2, B:257:0x08ec, B:898:0x1f96, B:900:0x1f9c, B:1000:0x089f, B:1007:0x08b6, B:1018:0x07b8, B:1036:0x0707), top: B:104:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0470 A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x25dc A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x07be A[Catch: all -> 0x04b1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:1029:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:1035:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:1064:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x04aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x0481 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:1080:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04e3 A[Catch: all -> 0x04b1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04fd A[Catch: all -> 0x04b1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x050f A[Catch: all -> 0x04b1, TRY_ENTER, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x071b A[Catch: all -> 0x04b1, TRY_ENTER, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x072c A[Catch: all -> 0x04b1, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0829 A[Catch: all -> 0x04b1, TRY_ENTER, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x085d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x08d2 A[Catch: all -> 0x1fd3, TRY_ENTER, TryCatch #10 {all -> 0x1fd3, blocks: (B:105:0x04a4, B:109:0x04b5, B:113:0x04f7, B:127:0x0523, B:130:0x0537, B:132:0x0547, B:148:0x05cd, B:151:0x05e1, B:155:0x05f8, B:167:0x0678, B:178:0x06f4, B:180:0x06fa, B:184:0x0715, B:195:0x0784, B:201:0x0798, B:212:0x07d3, B:219:0x07fc, B:224:0x080b, B:230:0x0823, B:241:0x084f, B:252:0x08c8, B:255:0x08d2, B:257:0x08ec, B:898:0x1f96, B:900:0x1f9c, B:1000:0x089f, B:1007:0x08b6, B:1018:0x07b8, B:1036:0x0707), top: B:104:0x04a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x23fd A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x242d A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x245b A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x2481  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x248f A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x2498 A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x24a7 A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x24e6 A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x253b A[Catch: all -> 0x0295, TRY_ENTER, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x2553 A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x256e A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x25b2 A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x2579  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x24f0  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x24b7  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x2484  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x2457  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x266c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x2683  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x267c  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x18e4 A[Catch: all -> 0x04b1, TryCatch #9 {all -> 0x04b1, blocks: (B:1066:0x04aa, B:111:0x04e3, B:115:0x04fd, B:121:0x050f, B:123:0x0515, B:135:0x0557, B:137:0x0564, B:140:0x0585, B:141:0x05b6, B:142:0x0595, B:144:0x059e, B:145:0x05b1, B:146:0x05a8, B:150:0x05d5, B:154:0x05ec, B:158:0x060c, B:159:0x061f, B:161:0x0622, B:163:0x062e, B:165:0x064f, B:169:0x0680, B:170:0x0698, B:172:0x069b, B:174:0x06af, B:176:0x06cb, B:182:0x0700, B:186:0x071b, B:188:0x072c, B:190:0x0740, B:191:0x075f, B:198:0x078c, B:204:0x07a6, B:206:0x07ac, B:221:0x0802, B:226:0x0811, B:232:0x0829, B:234:0x0838, B:237:0x0846, B:240:0x084a, B:244:0x085f, B:246:0x0862, B:248:0x0868, B:352:0x092c, B:354:0x0934, B:359:0x0963, B:361:0x096b, B:362:0x0988, B:364:0x0990, B:368:0x09c7, B:370:0x09cf, B:371:0x09e7, B:373:0x09ef, B:374:0x0a14, B:377:0x0a1e, B:383:0x0a45, B:384:0x0a62, B:385:0x0a79, B:387:0x0a81, B:388:0x0a98, B:390:0x0a9e, B:391:0x0aa9, B:396:0x0ab7, B:398:0x0abf, B:399:0x0aed, B:401:0x0af5, B:403:0x0b24, B:405:0x0b2c, B:406:0x0b3e, B:408:0x0b46, B:409:0x0b64, B:411:0x0b6c, B:412:0x0b8a, B:414:0x0b92, B:415:0x0baa, B:417:0x0bb2, B:418:0x0bd0, B:420:0x0bd8, B:421:0x0bf6, B:423:0x0bfe, B:424:0x0c1c, B:426:0x0c24, B:427:0x0c4a, B:429:0x0c52, B:430:0x0c78, B:433:0x0c82, B:435:0x0c8a, B:436:0x0cae, B:438:0x0cb6, B:439:0x0ccc, B:441:0x0cd4, B:442:0x0cfe, B:444:0x0d06, B:445:0x0d2c, B:447:0x0d34, B:448:0x0d62, B:450:0x0d6a, B:451:0x0d82, B:453:0x0d8a, B:454:0x0da2, B:456:0x0daa, B:457:0x0dc2, B:459:0x0dca, B:460:0x0de2, B:462:0x0dea, B:463:0x0e0e, B:465:0x0e16, B:466:0x0e2e, B:468:0x0e36, B:469:0x0e64, B:471:0x0e6c, B:472:0x0e88, B:476:0x0e92, B:477:0x0e9a, B:480:0x0eba, B:482:0x0ec2, B:483:0x0ee0, B:485:0x0ee8, B:486:0x0f00, B:489:0x0f0a, B:491:0x0f24, B:492:0x0f3c, B:493:0x0f4e, B:495:0x0f56, B:496:0x0f72, B:499:0x1e03, B:502:0x0f80, B:504:0x0f88, B:505:0x0fa4, B:507:0x0fac, B:508:0x0fc8, B:510:0x0fd0, B:511:0x0fec, B:513:0x0ff4, B:514:0x101c, B:516:0x1024, B:517:0x104a, B:519:0x1050, B:520:0x1058, B:522:0x1060, B:523:0x1082, B:525:0x108a, B:526:0x10aa, B:528:0x10b2, B:529:0x10d6, B:531:0x10de, B:532:0x1100, B:534:0x1108, B:535:0x112c, B:537:0x1134, B:538:0x1164, B:540:0x116c, B:541:0x119a, B:545:0x11aa, B:548:0x11b4, B:550:0x11cc, B:551:0x11e2, B:552:0x11f2, B:554:0x11fa, B:555:0x121e, B:557:0x1226, B:558:0x1244, B:562:0x124e, B:563:0x1256, B:566:0x127c, B:568:0x1284, B:569:0x12a0, B:571:0x12a8, B:572:0x12c4, B:575:0x12ce, B:577:0x12e8, B:578:0x1300, B:579:0x1312, B:582:0x131c, B:584:0x1336, B:585:0x134e, B:586:0x1360, B:589:0x136a, B:591:0x1384, B:592:0x139c, B:593:0x13ae, B:596:0x13b8, B:598:0x13d2, B:599:0x13ea, B:600:0x13fc, B:602:0x1404, B:603:0x141a, B:606:0x18d8, B:609:0x18e4, B:616:0x18f2, B:617:0x18ff, B:618:0x18f5, B:620:0x18fa, B:621:0x18fd, B:623:0x1428, B:625:0x1430, B:626:0x1448, B:628:0x1450, B:629:0x1468, B:631:0x1470, B:632:0x149a, B:635:0x14a4, B:637:0x14ac, B:638:0x14c4, B:640:0x14cc, B:641:0x14e4, B:643:0x14ec, B:644:0x1504, B:646:0x150c, B:647:0x1524, B:649:0x152c, B:650:0x1544, B:652:0x154c, B:653:0x1564, B:655:0x156c, B:657:0x1572, B:659:0x157a, B:661:0x15bf, B:662:0x15f2, B:664:0x15fc, B:665:0x160c, B:667:0x1616, B:668:0x1634, B:670:0x163e, B:671:0x165c, B:673:0x1666, B:674:0x1684, B:676:0x168e, B:677:0x16ac, B:679:0x16b6, B:680:0x16d8, B:683:0x16e6, B:685:0x16f0, B:686:0x1708, B:688:0x1712, B:689:0x1722, B:695:0x1732, B:697:0x1743, B:699:0x174d, B:700:0x1769, B:702:0x1773, B:706:0x1789, B:707:0x1786, B:708:0x179a, B:710:0x17a4, B:711:0x17b4, B:713:0x17be, B:714:0x17d0, B:717:0x17da, B:720:0x17e4, B:722:0x17ee, B:723:0x1812, B:726:0x181c, B:728:0x1826, B:729:0x183e, B:731:0x1848, B:732:0x1860, B:734:0x186a, B:735:0x1880, B:737:0x188a, B:738:0x18a2, B:741:0x18ac, B:743:0x18b6, B:744:0x18ce, B:746:0x1914, B:749:0x1920, B:751:0x1938, B:752:0x194e, B:753:0x195e, B:756:0x196a, B:758:0x1982, B:759:0x1998, B:760:0x19a8, B:763:0x19b4, B:765:0x19ce, B:766:0x19e6, B:767:0x19f8, B:770:0x1a04, B:772:0x1a1c, B:773:0x1a32, B:774:0x1a42, B:776:0x1a4e, B:778:0x1a52, B:780:0x1a5a, B:781:0x1a8a, B:782:0x1aa2, B:784:0x1aac, B:785:0x1ac2, B:788:0x1acc, B:791:0x1ad8, B:793:0x1adc, B:795:0x1ae4, B:796:0x1afa, B:798:0x1b0e, B:800:0x1b12, B:802:0x1b1a, B:803:0x1b36, B:804:0x1b4e, B:806:0x1b52, B:808:0x1b5a, B:809:0x1b70, B:810:0x1b82, B:812:0x1b8a, B:815:0x1ba2, B:817:0x1bae, B:819:0x1bc7, B:822:0x1bd5, B:824:0x1bec, B:825:0x1c07, B:826:0x1c1c, B:829:0x1c2a, B:831:0x1c43, B:832:0x1c61, B:833:0x1c79, B:836:0x1c87, B:838:0x1c9f, B:839:0x1cbb, B:840:0x1cd1, B:843:0x1cdf, B:845:0x1cf7, B:846:0x1d13, B:847:0x1d29, B:850:0x1d37, B:852:0x1d4f, B:853:0x1d65, B:854:0x1d75, B:856:0x1d81, B:859:0x1dad, B:861:0x1db9, B:862:0x1dd0, B:864:0x1ddc, B:865:0x1df7, B:867:0x1e25, B:869:0x1e31, B:870:0x1e4f, B:872:0x1e5b, B:873:0x1e77, B:875:0x1e83, B:876:0x1e99, B:878:0x1ea5, B:881:0x1ed7, B:883:0x1ee3, B:884:0x1f08, B:887:0x1f16, B:889:0x1f2e, B:890:0x1f44, B:891:0x1f54, B:893:0x1f60, B:894:0x1f78, B:896:0x1f82, B:997:0x0897, B:1020:0x07be, B:1031:0x0773, B:1038:0x070d), top: B:1065:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x045b A[Catch: all -> 0x0295, TryCatch #11 {all -> 0x0295, blocks: (B:95:0x0455, B:97:0x045b, B:98:0x046a, B:100:0x0470, B:101:0x047b, B:262:0x23f9, B:264:0x23fd, B:266:0x2429, B:268:0x242d, B:270:0x245b, B:272:0x2463, B:276:0x246f, B:280:0x2479, B:283:0x2486, B:285:0x248f, B:287:0x2498, B:288:0x249f, B:290:0x24a7, B:291:0x24da, B:293:0x24e6, B:298:0x251c, B:303:0x253b, B:304:0x254f, B:306:0x2553, B:308:0x255b, B:311:0x2566, B:313:0x256e, B:317:0x257c, B:319:0x25b2, B:321:0x25b6, B:323:0x25ba, B:325:0x25be, B:330:0x25c8, B:331:0x25d0, B:332:0x2650, B:340:0x24f6, B:342:0x2504, B:343:0x2510, B:346:0x24bd, B:347:0x24cb, B:350:0x264b, B:544:0x23b1, B:692:0x235f, B:902:0x1fa8, B:904:0x1fb4, B:905:0x1fc3, B:907:0x1fd8, B:910:0x1fe6, B:912:0x1ff4, B:914:0x200e, B:916:0x201c, B:917:0x2033, B:919:0x2041, B:920:0x2058, B:922:0x2066, B:923:0x207d, B:925:0x208d, B:927:0x209b, B:928:0x20b1, B:930:0x20bf, B:931:0x20dd, B:933:0x20eb, B:934:0x2103, B:936:0x2111, B:937:0x2137, B:939:0x2145, B:940:0x215d, B:942:0x216b, B:943:0x2183, B:947:0x2193, B:948:0x219b, B:951:0x21c9, B:953:0x21d7, B:954:0x21f3, B:956:0x2201, B:957:0x2219, B:959:0x2227, B:960:0x2245, B:962:0x2253, B:963:0x226b, B:965:0x2279, B:966:0x2291, B:968:0x229f, B:969:0x22b7, B:971:0x22c5, B:972:0x22eb, B:974:0x22fb, B:976:0x22ff, B:978:0x2307, B:979:0x2339, B:980:0x2351, B:982:0x2377, B:984:0x2385, B:985:0x23a3, B:988:0x23db, B:990:0x23e8, B:992:0x241d, B:1015:0x25dc, B:1017:0x25e7, B:1041:0x25f1, B:1043:0x25ff, B:1045:0x260c, B:1047:0x2616, B:1049:0x2627, B:1051:0x262b, B:1053:0x262f, B:1054:0x2636, B:1060:0x2646, B:1081:0x027c, B:1083:0x0284, B:1085:0x029b, B:1088:0x0411, B:1091:0x041d, B:1092:0x0426, B:1095:0x02a3, B:1097:0x02ab, B:1099:0x02f1, B:1101:0x02f9, B:1103:0x02ff, B:1105:0x030c, B:1111:0x031a, B:1115:0x0329, B:1117:0x036f, B:1120:0x0379, B:1124:0x0396, B:1128:0x03c6, B:1130:0x03ce, B:1132:0x03e4, B:1134:0x03ea, B:1136:0x0409, B:1138:0x043d, B:1140:0x0446), top: B:92:0x0276 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$processRemoteMessage$6(String str, String str2, long j3) {
        String str3;
        Object obj;
        int i10;
        String str4;
        String str5;
        int i11;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONObject jSONObject;
        long clientUserId;
        int intValue;
        boolean z10;
        long j10;
        JSONObject jSONObject2;
        long j11;
        long j12;
        long j13;
        long j14;
        int i12;
        long j15;
        long j16;
        String str10;
        String str11;
        int i13;
        String str12;
        long j17;
        long j18;
        final int i14;
        String[] strArr;
        String str13;
        int i15;
        long j19;
        int i16;
        String str14;
        boolean z11;
        Object obj2;
        boolean z12;
        int i17;
        boolean z13;
        long j20;
        String[] strArr2;
        String str15;
        String str16;
        long j21;
        boolean z14;
        boolean z15;
        String str17;
        boolean z16;
        String str18;
        String str19;
        Object obj3;
        boolean z17;
        boolean z18;
        boolean z19;
        String str20;
        boolean z20;
        Object obj4;
        String reactedText;
        boolean z21;
        String str21;
        String str22;
        String str23;
        final int i18;
        final long j22;
        boolean z22;
        long j23;
        Object obj5;
        boolean z23;
        MessageObject messageObject;
        Object obj6;
        boolean z24;
        String[] strArr3;
        String string;
        String[] strArr4;
        String formatString;
        int i19;
        String formatPluralString;
        String string2;
        String[] strArr5;
        String string3;
        String str24;
        String str25;
        String[] strArr6;
        int i20;
        int i21;
        if (BuildVars.LOGS_ENABLED) {
            str3 = "mention";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            obj = "STORY_NOTEXT";
            sb2.append(" START PROCESSING");
            FileLog.d(sb2.toString());
        } else {
            str3 = "mention";
            obj = "STORY_NOTEXT";
        }
        try {
            byte[] decode = Base64.decode(str2, 8);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
            nativeByteBuffer.writeBytes(decode);
            nativeByteBuffer.position(0);
            if (SharedConfig.pushAuthKeyId == null) {
                str6 = "random_id";
                SharedConfig.pushAuthKeyId = new byte[8];
                str7 = "schedule";
                str8 = "encryption_id";
                str9 = "topic_id";
                System.arraycopy(Utilities.computeSHA1(SharedConfig.pushAuthKey), r4.length - 8, SharedConfig.pushAuthKeyId, 0, 8);
            } else {
                str6 = "random_id";
                str7 = "schedule";
                str8 = "encryption_id";
                str9 = "topic_id";
            }
            byte[] bArr = new byte[8];
            nativeByteBuffer.readBytes(bArr, true);
            if (!Arrays.equals(SharedConfig.pushAuthKeyId, bArr)) {
                onDecryptError();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(String.format(Locale.US, str + " DECRYPT ERROR 2 k1=%s k2=%s, key=%s", Utilities.bytesToHex(SharedConfig.pushAuthKeyId), Utilities.bytesToHex(bArr), Utilities.bytesToHex(SharedConfig.pushAuthKey)));
                }
                return;
            }
            byte[] bArr2 = new byte[16];
            nativeByteBuffer.readBytes(bArr2, true);
            MessageKeyData generateMessageKeyData = MessageKeyData.generateMessageKeyData(SharedConfig.pushAuthKey, bArr2, true, 2);
            Utilities.aesIgeEncryption(nativeByteBuffer.buffer, generateMessageKeyData.aesKey, generateMessageKeyData.aesIv, false, false, 24, decode.length - 24);
            byte[] bArr3 = SharedConfig.pushAuthKey;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.arraysEquals(bArr2, 0, Utilities.computeSHA256(bArr3, 96, 32, byteBuffer, 24, byteBuffer.limit()), 8)) {
                onDecryptError();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(String.format(str + " DECRYPT ERROR 3, key = %s", Utilities.bytesToHex(SharedConfig.pushAuthKey)));
                    return;
                }
                return;
            }
            byte[] bArr4 = new byte[nativeByteBuffer.readInt32(true)];
            nativeByteBuffer.readBytes(bArr4, true);
            str5 = new String(bArr4);
            try {
                JSONObject jSONObject3 = new JSONObject(str5);
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    try {
                        if (applicationLoader.consumePush(-1, jSONObject3)) {
                            countDownLatch.countDown();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = -1;
                        str4 = null;
                        i11 = -1;
                        if (i11 == i10) {
                        }
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        FileLog.e(th);
                    }
                }
                String string4 = jSONObject3.has("loc_key") ? jSONObject3.getString("loc_key") : "";
                try {
                    if (jSONObject3.get("custom") instanceof JSONObject) {
                        try {
                            jSONObject = jSONObject3.getJSONObject("custom");
                        } catch (Throwable th3) {
                            th = th3;
                            str4 = string4;
                            i10 = -1;
                            i11 = -1;
                            if (i11 == i10) {
                            }
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            FileLog.e(th);
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    Object obj7 = jSONObject3.has("user_id") ? jSONObject3.get("user_id") : null;
                    if (obj7 == null) {
                        clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    } else if (obj7 instanceof Long) {
                        clientUserId = ((Long) obj7).longValue();
                    } else {
                        if (obj7 instanceof Integer) {
                            intValue = ((Integer) obj7).intValue();
                        } else if (obj7 instanceof String) {
                            intValue = Utilities.parseInt((CharSequence) obj7).intValue();
                        } else {
                            clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                        }
                        clientUserId = intValue;
                    }
                    int i22 = UserConfig.selectedAccount;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= 4) {
                            i23 = i22;
                            z10 = false;
                            break;
                        } else {
                            if (UserConfig.getInstance(i23).getClientUserId() == clientUserId) {
                                z10 = true;
                                break;
                            }
                            i23++;
                        }
                    }
                    if (!z10) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d(str + " ACCOUNT NOT FOUND");
                        }
                        countDownLatch.countDown();
                        return;
                    }
                    try {
                        try {
                            if (!UserConfig.getInstance(i23).isClientActivated()) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d(str + " ACCOUNT NOT ACTIVATED");
                                }
                                countDownLatch.countDown();
                                return;
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d(str + " " + string4);
                            }
                            try {
                                try {
                                    switch (string4.hashCode()) {
                                        case -1963663249:
                                            if (string4.equals("SESSION_REVOKE")) {
                                                AndroidUtilities.runOnUIThread(new ei.r2(i23, 5));
                                                countDownLatch.countDown();
                                                break;
                                            }
                                            if (jSONObject.has("channel_id")) {
                                                j10 = 0;
                                                j11 = jSONObject.getLong("channel_id");
                                                jSONObject2 = jSONObject;
                                                j12 = -j11;
                                            } else {
                                                j10 = 0;
                                                jSONObject2 = jSONObject;
                                                j11 = 0;
                                                j12 = 0;
                                            }
                                            if (jSONObject2.has("from_id")) {
                                                j14 = jSONObject2.getLong("from_id");
                                                j13 = j14;
                                            } else {
                                                j13 = j12;
                                                j14 = j10;
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                                try {
                                                    j15 = jSONObject2.getLong("chat_id");
                                                    i12 = i23;
                                                    j16 = -j15;
                                                    String str26 = str9;
                                                    str10 = "";
                                                    str11 = str26;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    i12 = i23;
                                                    str4 = string4;
                                                    str5 = str5;
                                                    i11 = i12;
                                                    i10 = -1;
                                                    if (i11 == i10) {
                                                    }
                                                    if (BuildVars.LOGS_ENABLED) {
                                                    }
                                                    FileLog.e(th);
                                                }
                                            } else {
                                                i12 = i23;
                                                String str27 = str9;
                                                str10 = "";
                                                str11 = str27;
                                                j15 = j10;
                                                j16 = j13;
                                            }
                                            try {
                                                if (jSONObject2.has(str11)) {
                                                    try {
                                                        i13 = jSONObject2.getInt(str11);
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        str4 = string4;
                                                        str5 = str5;
                                                        i11 = i12;
                                                        i10 = -1;
                                                        if (i11 == i10) {
                                                        }
                                                        if (BuildVars.LOGS_ENABLED) {
                                                        }
                                                        FileLog.e(th);
                                                    }
                                                } else {
                                                    i13 = 0;
                                                }
                                                long j24 = j16;
                                                FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                                if (jSONObject2.has(str8)) {
                                                    long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(jSONObject2.getInt(r14));
                                                    str12 = str7;
                                                    j17 = makeEncryptedDialogId;
                                                } else {
                                                    str12 = str7;
                                                    j17 = j24;
                                                }
                                                boolean z25 = !jSONObject2.has(str12) && jSONObject2.getInt(str12) == 1;
                                                if (j17 == j10 && "ENCRYPTED_MESSAGE".equals(string4)) {
                                                    j17 = NotificationsController.globalSecretChatId;
                                                }
                                                boolean z26 = z25;
                                                j18 = j17;
                                                if (j18 != j10) {
                                                    if ("CONF_CALL_REQUEST".equals(string4) || "CONF_VIDEOCALL_REQUEST".equals(string4)) {
                                                        i14 = i12;
                                                        long j25 = jSONObject2.getLong("call_id");
                                                        int i24 = jSONObject2.getInt("msg_id");
                                                        if (jSONObject3.has("loc_args")) {
                                                            JSONArray jSONArray = jSONObject3.getJSONArray("loc_args");
                                                            int length = jSONArray.length();
                                                            strArr = new String[length];
                                                            for (int i25 = 0; i25 < length; i25++) {
                                                                strArr[i25] = jSONArray.getString(i25);
                                                            }
                                                        } else {
                                                            strArr = null;
                                                        }
                                                        if (System.currentTimeMillis() - j3 < MessagesController.getInstance(i14).callRingTimeout) {
                                                            VoIPGroupNotification.request(ApplicationLoader.applicationContext, i14, j18, (strArr == null || strArr.length <= 2) ? null : strArr[2], j25, i24, "CONF_VIDEOCALL_REQUEST".equals(string4));
                                                            i14 = i14;
                                                        } else {
                                                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, i14, i24);
                                                        }
                                                    } else if ("READ_HISTORY".equals(string4)) {
                                                        int i26 = jSONObject2.getInt("max_id");
                                                        ArrayList<TLRPC.Update> arrayList = new ArrayList<>();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.d(str + " received read notification max_id = " + i26 + " for dialogId = " + j18);
                                                        }
                                                        if (j11 != j10) {
                                                            TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                                                            tL_updateReadChannelInbox.channel_id = j11;
                                                            tL_updateReadChannelInbox.max_id = i26;
                                                            tL_updateReadChannelInbox.still_unread_count = 0;
                                                            arrayList.add(tL_updateReadChannelInbox);
                                                        } else {
                                                            TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                                                            if (j14 != j10) {
                                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                                tL_updateReadHistoryInbox.peer = tL_peerUser;
                                                                tL_peerUser.user_id = j14;
                                                            } else {
                                                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                                                tL_updateReadHistoryInbox.peer = tL_peerChat;
                                                                tL_peerChat.chat_id = j15;
                                                            }
                                                            tL_updateReadHistoryInbox.max_id = i26;
                                                            arrayList.add(tL_updateReadHistoryInbox);
                                                        }
                                                        MessagesController.getInstance(i12).processUpdateArray(arrayList, null, null, false, 0);
                                                    } else {
                                                        long j26 = j14;
                                                        if ("READ_STORIES".equals(string4)) {
                                                            NotificationsController.getInstance(i12).processReadStories(j18, jSONObject2.getInt("max_id"));
                                                        } else if ("STORY_DELETED".equals(string4)) {
                                                            NotificationsController.getInstance(i12).processDeleteStory(j18, jSONObject2.getInt("story_id"));
                                                        } else if ("MESSAGE_DELETED".equals(string4)) {
                                                            String[] split = jSONObject2.getString("messages").split(",");
                                                            a0.i iVar = new a0.i();
                                                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                                                            for (String str28 : split) {
                                                                arrayList2.add(Utilities.parseInt((CharSequence) str28));
                                                            }
                                                            iVar.k(arrayList2, -j11);
                                                            NotificationsController.getInstance(i12).removeDeletedMessagesFromNotifications(iVar, false);
                                                            MessagesController.getInstance(i12).deleteMessagesByPush(j18, arrayList2, j11);
                                                            if (BuildVars.LOGS_ENABLED) {
                                                                FileLog.d(str + " received " + string4 + " for dialogId = " + j18 + " mids = " + TextUtils.join(",", arrayList2));
                                                            }
                                                        } else {
                                                            long j27 = j15;
                                                            if ("READ_REACTION".equals(string4)) {
                                                                String[] split2 = jSONObject2.getString("messages").split(",");
                                                                a0.i iVar2 = new a0.i();
                                                                ArrayList arrayList3 = new ArrayList();
                                                                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                                                for (String str29 : split2) {
                                                                    Integer parseInt = Utilities.parseInt((CharSequence) str29);
                                                                    int intValue2 = parseInt.intValue();
                                                                    arrayList3.add(parseInt);
                                                                    sparseBooleanArray.put(intValue2, false);
                                                                }
                                                                iVar2.k(arrayList3, -j11);
                                                                NotificationsController.getInstance(i12).removeDeletedMessagesFromNotifications(iVar2, true);
                                                                MessagesController.getInstance(i12).checkUnreadReactions(j18, i13, sparseBooleanArray);
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.d(str + " received " + string4 + " for dialogId = " + j18 + " mids = " + TextUtils.join(",", arrayList3));
                                                                }
                                                            } else if (!TextUtils.isEmpty(string4)) {
                                                                if (jSONObject2.has("msg_id")) {
                                                                    i15 = jSONObject2.getInt("msg_id");
                                                                } else if (jSONObject2.has("story_id")) {
                                                                    i15 = jSONObject2.getInt("story_id");
                                                                } else {
                                                                    str13 = str6;
                                                                    i15 = 0;
                                                                    long longValue = !jSONObject2.has(str13) ? Utilities.parseLong(jSONObject2.getString(str13)).longValue() : j10;
                                                                    if (i15 == 0) {
                                                                        i16 = i13;
                                                                        Integer num = MessagesController.getInstance(i12).dialogs_read_inbox_max.get(Long.valueOf(j18));
                                                                        if (num == null) {
                                                                            num = Integer.valueOf(MessagesStorage.getInstance(i12).getDialogReadMax(false, j18));
                                                                            j19 = j11;
                                                                            MessagesController.getInstance(i12).dialogs_read_inbox_max.put(Long.valueOf(j18), num);
                                                                        } else {
                                                                            j19 = j11;
                                                                        }
                                                                        z11 = i15 > num.intValue();
                                                                        str14 = "REACT_";
                                                                    } else {
                                                                        j19 = j11;
                                                                        i16 = i13;
                                                                        if (longValue == j10 || MessagesStorage.getInstance(i12).checkMessageByRandomId(longValue)) {
                                                                            str14 = "REACT_";
                                                                            z11 = false;
                                                                        } else {
                                                                            str14 = "REACT_";
                                                                            z11 = true;
                                                                        }
                                                                    }
                                                                    if (!string4.startsWith(str14) || string4.startsWith("CHAT_REACT_")) {
                                                                        z11 = true;
                                                                    }
                                                                    obj2 = obj;
                                                                    boolean z27 = z11;
                                                                    int i27 = i15;
                                                                    if (!string4.equals(obj2) || string4.equals("STORY_LIVE") || string4.equals("STORY_HIDDEN_AUTHOR")) {
                                                                        int i28 = !jSONObject2.has("story_id") ? jSONObject2.getInt("story_id") : -1;
                                                                        z12 = i28 < 0;
                                                                        i17 = i28;
                                                                    } else {
                                                                        z12 = z27;
                                                                        i17 = -1;
                                                                    }
                                                                    if (z12) {
                                                                        i14 = i12;
                                                                        if ("CONF_CALL_MISSED".equalsIgnoreCase(string4)) {
                                                                            VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i14, jSONObject2.getLong("call_id"));
                                                                        }
                                                                    } else {
                                                                        long j28 = longValue;
                                                                        long j29 = j10;
                                                                        long optLong = jSONObject2.optLong("chat_from_id", j29);
                                                                        long optLong2 = jSONObject2.optLong("chat_from_broadcast_id", j29);
                                                                        long optLong3 = jSONObject2.optLong("chat_from_group_id", j29);
                                                                        if (optLong == j29 && optLong3 == j29) {
                                                                            z13 = false;
                                                                            String str30 = str3;
                                                                            boolean z28 = (jSONObject2.has(str30) || jSONObject2.getInt(str30) == 0) ? false : true;
                                                                            boolean z29 = (jSONObject2.has("silent") || jSONObject2.getInt("silent") == 0) ? false : true;
                                                                            boolean z30 = z13;
                                                                            boolean z31 = z28;
                                                                            if (jSONObject3.has("loc_args")) {
                                                                                j20 = optLong3;
                                                                                strArr2 = null;
                                                                            } else {
                                                                                JSONArray jSONArray2 = jSONObject3.getJSONArray("loc_args");
                                                                                int length2 = jSONArray2.length();
                                                                                j20 = optLong3;
                                                                                strArr2 = new String[length2];
                                                                                for (int i29 = 0; i29 < length2; i29++) {
                                                                                    strArr2[i29] = jSONArray2.getString(i29);
                                                                                }
                                                                            }
                                                                            if (strArr2 != null && strArr2.length > 0) {
                                                                                str15 = strArr2[0];
                                                                                boolean has = jSONObject2.has("edit_date");
                                                                                if (string4.startsWith("CHAT_") || strArr2 == null || strArr2.length <= 0) {
                                                                                    if (!string4.startsWith("PINNED_")) {
                                                                                        z15 = j19 != 0;
                                                                                        str16 = str15;
                                                                                        j21 = j26;
                                                                                        z14 = true;
                                                                                        str17 = null;
                                                                                        z16 = false;
                                                                                        if (string4.startsWith(str14) && !string4.startsWith("CHAT_REACT_")) {
                                                                                            z18 = z14;
                                                                                            z19 = z15;
                                                                                            str20 = "CHAT_REACT_";
                                                                                            str18 = str14;
                                                                                            z17 = z29;
                                                                                            str19 = " for dialogId = ";
                                                                                            JSONObject jSONObject4 = jSONObject2;
                                                                                            String[] strArr7 = strArr2;
                                                                                            switch (string4.hashCode()) {
                                                                                                case -2104766184:
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (string4.equals(obj3)) {
                                                                                                        z21 = false;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = LocaleController.getString(R.string.StoryNotificationSingle);
                                                                                                        i18 = i17;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                            StringBuilder sb3 = new StringBuilder();
                                                                                                            sb3.append(str);
                                                                                                            sb3.append(" received message notification ");
                                                                                                            sb3.append(string4);
                                                                                                            sb3.append(str19);
                                                                                                            j22 = j18;
                                                                                                            sb3.append(j22);
                                                                                                            sb3.append(" mid = ");
                                                                                                            sb3.append(i18);
                                                                                                            FileLog.d(sb3.toString());
                                                                                                        } else {
                                                                                                            j22 = j18;
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                            if (!string4.equals("REACT_STORY") && !string4.equals("REACT_STORY_HIDDEN")) {
                                                                                                                z22 = z20;
                                                                                                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                                                                                if (z22 && i18 > 0) {
                                                                                                                    i18 = -i18;
                                                                                                                }
                                                                                                                tL_message.id = i18;
                                                                                                                tL_message.random_id = j28;
                                                                                                                tL_message.message = str22 == null ? str22 : str23;
                                                                                                                tL_message.date = (int) (j3 / 1000);
                                                                                                                if (z18) {
                                                                                                                    tL_message.action = new TLRPC.TL_messageActionPinMessage();
                                                                                                                }
                                                                                                                if (z19) {
                                                                                                                    tL_message.flags |= TLObject.FLAG_31;
                                                                                                                }
                                                                                                                tL_message.dialog_id = j22;
                                                                                                                if (j19 == 0) {
                                                                                                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                                                                                    tL_message.peer_id = tL_peerChannel;
                                                                                                                    tL_peerChannel.channel_id = j19;
                                                                                                                    obj5 = obj4;
                                                                                                                    j23 = j27;
                                                                                                                } else if (j27 != 0) {
                                                                                                                    TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                                                                                                                    tL_message.peer_id = tL_peerChat2;
                                                                                                                    j23 = j27;
                                                                                                                    tL_peerChat2.chat_id = j23;
                                                                                                                    obj5 = obj4;
                                                                                                                } else {
                                                                                                                    j23 = j27;
                                                                                                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                                                                                    tL_message.peer_id = tL_peerUser2;
                                                                                                                    obj5 = obj4;
                                                                                                                    tL_peerUser2.user_id = j21;
                                                                                                                }
                                                                                                                tL_message.flags |= 256;
                                                                                                                if (j20 == 0) {
                                                                                                                    TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                                                                                                                    tL_message.from_id = tL_peerChat3;
                                                                                                                    tL_peerChat3.chat_id = j23;
                                                                                                                } else if (optLong2 != 0) {
                                                                                                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                                                                                    tL_message.from_id = tL_peerChannel2;
                                                                                                                    tL_peerChannel2.channel_id = optLong2;
                                                                                                                } else if (optLong != j29) {
                                                                                                                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                                                                                    tL_message.from_id = tL_peerUser3;
                                                                                                                    tL_peerUser3.user_id = optLong;
                                                                                                                } else {
                                                                                                                    tL_message.from_id = tL_message.peer_id;
                                                                                                                }
                                                                                                                if (!z31 && !z18) {
                                                                                                                    z23 = false;
                                                                                                                    tL_message.mentioned = z23;
                                                                                                                    tL_message.silent = z17;
                                                                                                                    tL_message.from_scheduled = z26;
                                                                                                                    int i30 = i14;
                                                                                                                    messageObject = new MessageObject(i30, tL_message, str23, str21, str17, z21, z16, z19, has);
                                                                                                                    i14 = i30;
                                                                                                                    if (i16 != 0) {
                                                                                                                        messageObject.messageOwner.reply_to = new TLRPC.TL_messageReplyHeader();
                                                                                                                        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
                                                                                                                        messageReplyHeader.forum_topic = true;
                                                                                                                        messageReplyHeader.reply_to_top_id = i16;
                                                                                                                    }
                                                                                                                    messageObject.isStoryReactionPush = z22;
                                                                                                                    messageObject.isReactionPush = z22 && (string4.startsWith(str18) || string4.startsWith(str20));
                                                                                                                    if (string4.equals(obj3)) {
                                                                                                                        obj6 = obj5;
                                                                                                                        if (!string4.equals(obj6)) {
                                                                                                                            z24 = false;
                                                                                                                            messageObject.isStoryPush = z24;
                                                                                                                            messageObject.isLiveStoryPush = string4.equals("STORY_LIVE");
                                                                                                                            messageObject.isStoryMentionPush = string4.equals("MESSAGE_STORY_MENTION");
                                                                                                                            messageObject.isStoryPushHidden = string4.equals(obj6);
                                                                                                                            ArrayList<MessageObject> arrayList4 = new ArrayList<>();
                                                                                                                            arrayList4.add(messageObject);
                                                                                                                            FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                            if (!messageObject.isStoryReactionPush && !messageObject.isReactionPush && !messageObject.isStoryMentionPush && !messageObject.isStoryPush && !messageObject.isStoryPushHidden && !z31 && !z18 && i18 > 0) {
                                                                                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.rh
                                                                                                                                    @Override // java.lang.Runnable
                                                                                                                                    public final void run() {
                                                                                                                                        PushListenerController.lambda$processRemoteMessage$5(i14, j22, i18);
                                                                                                                                    }
                                                                                                                                });
                                                                                                                            }
                                                                                                                            NotificationsController.getInstance(i14).processNewMessages(arrayList4, true, true, countDownLatch);
                                                                                                                            ConnectionsManager.onInternalPushReceived(i14);
                                                                                                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        obj6 = obj5;
                                                                                                                    }
                                                                                                                    z24 = true;
                                                                                                                    messageObject.isStoryPush = z24;
                                                                                                                    messageObject.isLiveStoryPush = string4.equals("STORY_LIVE");
                                                                                                                    messageObject.isStoryMentionPush = string4.equals("MESSAGE_STORY_MENTION");
                                                                                                                    messageObject.isStoryPushHidden = string4.equals(obj6);
                                                                                                                    ArrayList<MessageObject> arrayList42 = new ArrayList<>();
                                                                                                                    arrayList42.add(messageObject);
                                                                                                                    FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                    if (!messageObject.isStoryReactionPush) {
                                                                                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.rh
                                                                                                                            @Override // java.lang.Runnable
                                                                                                                            public final void run() {
                                                                                                                                PushListenerController.lambda$processRemoteMessage$5(i14, j22, i18);
                                                                                                                            }
                                                                                                                        });
                                                                                                                    }
                                                                                                                    NotificationsController.getInstance(i14).processNewMessages(arrayList42, true, true, countDownLatch);
                                                                                                                    ConnectionsManager.onInternalPushReceived(i14);
                                                                                                                    ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                                                                                                }
                                                                                                                z23 = true;
                                                                                                                tL_message.mentioned = z23;
                                                                                                                tL_message.silent = z17;
                                                                                                                tL_message.from_scheduled = z26;
                                                                                                                int i302 = i14;
                                                                                                                messageObject = new MessageObject(i302, tL_message, str23, str21, str17, z21, z16, z19, has);
                                                                                                                i14 = i302;
                                                                                                                if (i16 != 0) {
                                                                                                                }
                                                                                                                messageObject.isStoryReactionPush = z22;
                                                                                                                messageObject.isReactionPush = z22 && (string4.startsWith(str18) || string4.startsWith(str20));
                                                                                                                if (string4.equals(obj3)) {
                                                                                                                }
                                                                                                                z24 = true;
                                                                                                                messageObject.isStoryPush = z24;
                                                                                                                messageObject.isLiveStoryPush = string4.equals("STORY_LIVE");
                                                                                                                messageObject.isStoryMentionPush = string4.equals("MESSAGE_STORY_MENTION");
                                                                                                                messageObject.isStoryPushHidden = string4.equals(obj6);
                                                                                                                ArrayList<MessageObject> arrayList422 = new ArrayList<>();
                                                                                                                arrayList422.add(messageObject);
                                                                                                                FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                if (!messageObject.isStoryReactionPush) {
                                                                                                                }
                                                                                                                NotificationsController.getInstance(i14).processNewMessages(arrayList422, true, true, countDownLatch);
                                                                                                                ConnectionsManager.onInternalPushReceived(i14);
                                                                                                                ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                                                                                            }
                                                                                                            z22 = true;
                                                                                                            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                                                                                            if (z22) {
                                                                                                                i18 = -i18;
                                                                                                            }
                                                                                                            tL_message2.id = i18;
                                                                                                            tL_message2.random_id = j28;
                                                                                                            tL_message2.message = str22 == null ? str22 : str23;
                                                                                                            tL_message2.date = (int) (j3 / 1000);
                                                                                                            if (z18) {
                                                                                                            }
                                                                                                            if (z19) {
                                                                                                            }
                                                                                                            tL_message2.dialog_id = j22;
                                                                                                            if (j19 == 0) {
                                                                                                            }
                                                                                                            tL_message2.flags |= 256;
                                                                                                            if (j20 == 0) {
                                                                                                            }
                                                                                                            if (!z31) {
                                                                                                                z23 = false;
                                                                                                                tL_message2.mentioned = z23;
                                                                                                                tL_message2.silent = z17;
                                                                                                                tL_message2.from_scheduled = z26;
                                                                                                                int i3022 = i14;
                                                                                                                messageObject = new MessageObject(i3022, tL_message2, str23, str21, str17, z21, z16, z19, has);
                                                                                                                i14 = i3022;
                                                                                                                if (i16 != 0) {
                                                                                                                }
                                                                                                                messageObject.isStoryReactionPush = z22;
                                                                                                                messageObject.isReactionPush = z22 && (string4.startsWith(str18) || string4.startsWith(str20));
                                                                                                                if (string4.equals(obj3)) {
                                                                                                                }
                                                                                                                z24 = true;
                                                                                                                messageObject.isStoryPush = z24;
                                                                                                                messageObject.isLiveStoryPush = string4.equals("STORY_LIVE");
                                                                                                                messageObject.isStoryMentionPush = string4.equals("MESSAGE_STORY_MENTION");
                                                                                                                messageObject.isStoryPushHidden = string4.equals(obj6);
                                                                                                                ArrayList<MessageObject> arrayList4222 = new ArrayList<>();
                                                                                                                arrayList4222.add(messageObject);
                                                                                                                FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                                                                                if (!messageObject.isStoryReactionPush) {
                                                                                                                }
                                                                                                                NotificationsController.getInstance(i14).processNewMessages(arrayList4222, true, true, countDownLatch);
                                                                                                                ConnectionsManager.onInternalPushReceived(i14);
                                                                                                                ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                                                                                            }
                                                                                                            z23 = true;
                                                                                                            tL_message2.mentioned = z23;
                                                                                                            tL_message2.silent = z17;
                                                                                                            tL_message2.from_scheduled = z26;
                                                                                                            int i30222 = i14;
                                                                                                            messageObject = new MessageObject(i30222, tL_message2, str23, str21, str17, z21, z16, z19, has);
                                                                                                            i14 = i30222;
                                                                                                            if (i16 != 0) {
                                                                                                            }
                                                                                                            messageObject.isStoryReactionPush = z22;
                                                                                                            messageObject.isReactionPush = z22 && (string4.startsWith(str18) || string4.startsWith(str20));
                                                                                                            if (string4.equals(obj3)) {
                                                                                                            }
                                                                                                            z24 = true;
                                                                                                            messageObject.isStoryPush = z24;
                                                                                                            messageObject.isLiveStoryPush = string4.equals("STORY_LIVE");
                                                                                                            messageObject.isStoryMentionPush = string4.equals("MESSAGE_STORY_MENTION");
                                                                                                            messageObject.isStoryPushHidden = string4.equals(obj6);
                                                                                                            ArrayList<MessageObject> arrayList42222 = new ArrayList<>();
                                                                                                            arrayList42222.add(messageObject);
                                                                                                            FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                                                                            if (!messageObject.isStoryReactionPush) {
                                                                                                            }
                                                                                                            NotificationsController.getInstance(i14).processNewMessages(arrayList42222, true, true, countDownLatch);
                                                                                                            ConnectionsManager.onInternalPushReceived(i14);
                                                                                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                                                                                        }
                                                                                                    }
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                        FileLog.w("unhandled loc_key = " + string4);
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -2100047043:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    strArr3 = strArr7;
                                                                                                    if (!string4.equals("MESSAGE_GAME_SCORE")) {
                                                                                                        z20 = false;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    z20 = false;
                                                                                                    formatString = LocaleController.formatString("NotificationMessageGameScored", R.string.NotificationMessageGameScored, strArr3[0], strArr3[1], strArr3[2]);
                                                                                                    z21 = false;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = formatString;
                                                                                                    obj3 = obj2;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -2091498420:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_CONTACT")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageContact2", R.string.ChannelMessageContact2, strArr7[0], strArr7[1]);
                                                                                                        string = LocaleController.getString(R.string.AttachContact);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -2053872415:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    strArr4 = strArr7;
                                                                                                    break;
                                                                                                case -2039746363:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_STICKER")) {
                                                                                                        if (strArr7.length <= 1 || TextUtils.isEmpty(strArr7[1])) {
                                                                                                            reactedText = LocaleController.formatString("NotificationMessageSticker", R.string.NotificationMessageSticker, strArr7[0]);
                                                                                                            string = LocaleController.getString(R.string.AttachSticker);
                                                                                                            str22 = string;
                                                                                                            str21 = str16;
                                                                                                            obj3 = obj2;
                                                                                                            z20 = false;
                                                                                                            z21 = false;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            formatString = LocaleController.formatString("NotificationMessageStickerEmoji", R.string.NotificationMessageStickerEmoji, strArr7[0], strArr7[1]);
                                                                                                            str22 = strArr7[1] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                            i18 = i27;
                                                                                                            str21 = str16;
                                                                                                            z20 = false;
                                                                                                            z21 = false;
                                                                                                            str23 = formatString;
                                                                                                            obj3 = obj2;
                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                            }
                                                                                                            if (str23 != null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -2023218804:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_VIDEOS")) {
                                                                                                        formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr7[0], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1979538588:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_DOC")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageDocument", R.string.ChannelMessageDocument, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachDocument);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1979536003:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GEO")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageMap", R.string.ChannelMessageMap, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachLocation);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1979535888:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GIF")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageGIF", R.string.ChannelMessageGIF, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachGif);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1969004705:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_ADD_MEMBER")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupAddMember", R.string.NotificationGroupAddMember, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1946699248:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_JOINED")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupAddSelfMega", R.string.NotificationGroupAddSelfMega, strArr7[0], strArr7[1]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1891964556:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_MESSAGE_TODO_APPEND")) {
                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageGroupTodoAppend2, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1833440864:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                        try {
                                                                                                            i19 = Integer.parseInt(strArr7[2]);
                                                                                                        } catch (Exception unused) {
                                                                                                            i19 = 1;
                                                                                                        }
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageChatStarsGiveaway2, strArr7[0], strArr7[1], LocaleController.formatPluralString("AmongWinners", i19, new Object[0]), strArr7[3]);
                                                                                                        string = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1717283471:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_REQ_JOINED")) {
                                                                                                        formatString = LocaleController.formatString("UserAcceptedToGroupPushWithGroup", R.string.UserAcceptedToGroupPushWithGroup, strArr7[0], strArr7[1]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1646640058:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_VOICECHAT_START")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupCreatedCall", R.string.NotificationGroupCreatedCall, strArr7[0], strArr7[1]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1633328296:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_PAID_MEDIA")) {
                                                                                                        int parseInt2 = Integer.parseInt(strArr7[1]);
                                                                                                        formatPluralString = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt2, strArr7[0]);
                                                                                                        str22 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt2, strArr7[0]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        str23 = formatPluralString;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1528047021:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_MESSAGES")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupAlbum", R.string.NotificationGroupAlbum, strArr7[0], strArr7[1]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1507149394:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_RECURRING_PAY")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageRecurringPay", R.string.NotificationMessageRecurringPay, strArr7[0], strArr7[1]);
                                                                                                        string = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1493579426:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_AUDIO")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageAudio, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachAudio);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1482481933:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    break;
                                                                                                case -1480102982:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_PHOTO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessagePhoto", R.string.NotificationMessagePhoto, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachPhoto);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1478041834:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_ROUND")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageRound", R.string.NotificationMessageRound, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachRound);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1476974979:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_STORY")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationStory", R.string.NotificationStory, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.Story);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1474543101:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_VIDEO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageVideo", R.string.NotificationMessageVideo, strArr7[0]);
                                                                                                        string = LocaleController.getString(R.string.AttachVideo);
                                                                                                        str22 = string;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1465695932:
                                                                                                    i14 = i12;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("ENCRYPTION_ACCEPT")) {
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1428026623:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CONF_CALL_MISSED")) {
                                                                                                        i14 = i12;
                                                                                                        VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i14, jSONObject4.getLong("call_id"));
                                                                                                        int parseInt3 = Integer.parseInt(strArr7[1]);
                                                                                                        formatString = parseInt3 <= 0 ? LocaleController.formatString(R.string.NotificationActionMissedCallConference, strArr7[0]) : LocaleController.formatPluralStringComma("NotificationActionMissedCallConferenceOther", parseInt3, strArr7[0]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1374906292:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("ENCRYPTED_MESSAGE")) {
                                                                                                        formatString = LocaleController.getString(R.string.YouHaveNewMessage);
                                                                                                        str16 = LocaleController.getString(R.string.SecretChatName);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1372940586:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_RETURNED")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupAddSelf", R.string.NotificationGroupAddSelf, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1264245338:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_INVOICE")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedInvoiceUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedInvoice, strArr7[0], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedInvoiceChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1236154001:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_DOCS")) {
                                                                                                        formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr7[0], LocaleController.formatPluralString("Files", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1236086700:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_FWDS")) {
                                                                                                        formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr7[0], LocaleController.formatPluralString("ForwardedMessageCount", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]).toLowerCase());
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1236077786:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GAME")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr7[0]);
                                                                                                        string2 = LocaleController.getString(R.string.AttachGame);
                                                                                                        str22 = string2;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1235796237:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_POLL")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.ChannelMessagePoll2, strArr7[0], strArr7[1]);
                                                                                                        string2 = LocaleController.getString(R.string.Poll);
                                                                                                        str22 = string2;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1235760759:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_QUIZ")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageQuiz2", R.string.ChannelMessageQuiz2, strArr7[0], strArr7[1]);
                                                                                                        string2 = LocaleController.getString(R.string.QuizPoll);
                                                                                                        str22 = string2;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1235686303:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    strArr5 = strArr7;
                                                                                                    break;
                                                                                                case -1235677318:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_TODO")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.ChannelMessageTodo2, strArr7[0], strArr7[1]);
                                                                                                        string2 = LocaleController.getString(R.string.Todo);
                                                                                                        str22 = string2;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1198046100:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("MESSAGE_VIDEO_SECRET")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageSDVideo", R.string.NotificationMessageSDVideo, strArr7[0]);
                                                                                                        string2 = LocaleController.getString(R.string.AttachDestructingVideo);
                                                                                                        str22 = string2;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1124254527:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHAT_MESSAGE_CONTACT")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupContact2", R.string.NotificationMessageGroupContact2, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string2 = LocaleController.getString(R.string.AttachContact);
                                                                                                        str22 = string2;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1085137927:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_GAME")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedGameUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedGame, strArr7[0], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1084856378:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_POLL")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedPollUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedPoll2, strArr7[0], strArr7[2], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1084820900:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_QUIZ")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedQuizUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, strArr7[0], strArr7[2], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1084746444:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_TEXT")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedTextUser", R.string.NotificationActionPinnedTextUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedText", R.string.NotificationActionPinnedText, strArr7[0], strArr7[1], strArr7[2]) : LocaleController.formatString("NotificationActionPinnedTextChannel", R.string.NotificationActionPinnedTextChannel, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -1084737459:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("PINNED_TODO")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedTodoUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedTodo2, strArr7[0], strArr7[2], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -947756761:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_TODO_DONE")) {
                                                                                                        formatString = LocaleController.formatString(R.string.ChannelMessageTodoDone2, strArr7[0], strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -891852842:
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    if (string4.equals(obj4)) {
                                                                                                        formatString = LocaleController.formatPluralString("StoryNotificationHidden", 1, new Object[0]);
                                                                                                        i18 = i17;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -819729482:
                                                                                                    if (string4.equals("PINNED_STICKER")) {
                                                                                                        formatString = j18 > j10 ? (strArr7.length <= 1 || TextUtils.isEmpty(strArr7[1])) ? LocaleController.formatString("NotificationActionPinnedStickerUser", R.string.NotificationActionPinnedStickerUser, strArr7[0]) : LocaleController.formatString("NotificationActionPinnedStickerEmojiUser", R.string.NotificationActionPinnedStickerEmojiUser, strArr7[0], strArr7[1]) : z30 ? (strArr7.length <= 2 || TextUtils.isEmpty(strArr7[2])) ? LocaleController.formatString("NotificationActionPinnedSticker", R.string.NotificationActionPinnedSticker, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedStickerEmoji", R.string.NotificationActionPinnedStickerEmoji, strArr7[0], strArr7[2], strArr7[1]) : (strArr7.length <= 1 || TextUtils.isEmpty(strArr7[1])) ? LocaleController.formatString("NotificationActionPinnedStickerChannel", R.string.NotificationActionPinnedStickerChannel, strArr7[0]) : LocaleController.formatString("NotificationActionPinnedStickerEmojiChannel", R.string.NotificationActionPinnedStickerEmojiChannel, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -772141857:
                                                                                                    if (string4.equals("PHONE_CALL_REQUEST")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -706345256:
                                                                                                    if (string4.equals("MESSAGE_UNIQUE_STARGIFT")) {
                                                                                                        str17 = strArr7[0];
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageUniqueStarGift, str17);
                                                                                                        string3 = LocaleController.getString(R.string.Gift2UniqueNotification);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -638310039:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_STICKER")) {
                                                                                                        if (strArr7.length <= 1 || TextUtils.isEmpty(strArr7[1])) {
                                                                                                            reactedText = LocaleController.formatString("ChannelMessageSticker", R.string.ChannelMessageSticker, strArr7[0]);
                                                                                                            string3 = LocaleController.getString(R.string.AttachSticker);
                                                                                                            str22 = string3;
                                                                                                            i14 = i12;
                                                                                                            str21 = str16;
                                                                                                            obj3 = obj2;
                                                                                                            obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                            z20 = false;
                                                                                                            z21 = false;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            formatString = LocaleController.formatString("ChannelMessageStickerEmoji", R.string.ChannelMessageStickerEmoji, strArr7[0], strArr7[1]);
                                                                                                            str24 = strArr7[1] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                            str22 = str24;
                                                                                                            i14 = i12;
                                                                                                            i18 = i27;
                                                                                                            str21 = str16;
                                                                                                            obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                            z20 = false;
                                                                                                            z21 = false;
                                                                                                            str23 = formatString;
                                                                                                            obj3 = obj2;
                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                            }
                                                                                                            if (str23 != null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -590403924:
                                                                                                    if (string4.equals("PINNED_GAME_SCORE")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedGameScoreUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedGameScore, strArr7[0], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedGameScoreChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -589196239:
                                                                                                    if (string4.equals("PINNED_DOC")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedFileUser", R.string.NotificationActionPinnedFileUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedFile", R.string.NotificationActionPinnedFile, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedFileChannel", R.string.NotificationActionPinnedFileChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -589193654:
                                                                                                    if (string4.equals("PINNED_GEO")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedGeoUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedGeo, strArr7[0], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -589193539:
                                                                                                    if (string4.equals("PINNED_GIF")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedGifUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedGif, strArr7[0], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -573031834:
                                                                                                    str25 = "MESSAGE_GRAM_TRANSFER_UNKNOWN";
                                                                                                    strArr6 = strArr7;
                                                                                                    break;
                                                                                                case -455004278:
                                                                                                    if (string4.equals("MESSAGE_WALLPAPER")) {
                                                                                                        reactedText = LocaleController.formatString("ActionSetWallpaperForThisChat", R.string.ActionSetWallpaperForThisChat, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.WallpaperNotification);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -440169325:
                                                                                                    if (string4.equals("AUTH_UNKNOWN")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -412748110:
                                                                                                    if (string4.equals("CHAT_DELETE_YOU")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupKickYou", R.string.NotificationGroupKickYou, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -346082433:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_TODO_APPEND")) {
                                                                                                        formatString = LocaleController.formatString(R.string.ChannelMessageTodoAppend2, strArr7[0], strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -242433887:
                                                                                                    if (string4.equals("MESSAGE_SAME_WALLPAPER")) {
                                                                                                        reactedText = LocaleController.formatString("ActionSetSameWallpaperForThisChat", R.string.ActionSetSameWallpaperForThisChat, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.WallpaperSameNotification);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -228518075:
                                                                                                    if (string4.equals("MESSAGE_GEOLIVE")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageLiveLocation", R.string.NotificationMessageLiveLocation, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -213586509:
                                                                                                    if (string4.equals("ENCRYPTION_REQUEST")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -115582002:
                                                                                                    if (string4.equals("CHAT_MESSAGE_INVOICE")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupInvoice", R.string.NotificationMessageGroupInvoice, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -112621464:
                                                                                                    if (string4.equals("CONTACT_JOINED")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -108522133:
                                                                                                    if (string4.equals("AUTH_REGION")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -107572034:
                                                                                                    if (string4.equals("MESSAGE_SCREENSHOT")) {
                                                                                                        formatString = LocaleController.getString(R.string.ActionTakeScreenshoot).replace("un1", strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -77243824:
                                                                                                    if (string4.equals("MESSAGE_SUGGEST_BIRTHDAY")) {
                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageSuggestBirthday, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -40534265:
                                                                                                    if (string4.equals("CHAT_DELETE_MEMBER")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupKickMember", R.string.NotificationGroupKickMember, strArr7[0], strArr7[1], strArr7.length <= 2 ? str10 : strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case -35560251:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_PAID_MEDIA")) {
                                                                                                        int parseInt4 = Integer.parseInt(strArr7[1]);
                                                                                                        reactedText = LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", parseInt4, strArr7[0]);
                                                                                                        string3 = LocaleController.formatPluralString("NotificationPaidMedia", parseInt4, new Object[0]);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 52369421:
                                                                                                    break;
                                                                                                case 65254746:
                                                                                                    strArr4 = strArr7;
                                                                                                    if (string4.equals("CHAT_ADD_YOU")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        formatString = LocaleController.formatString("NotificationInvitedToGroup", R.string.NotificationInvitedToGroup, strArr4[0], strArr4[1]);
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 120441350:
                                                                                                    if (string4.equals("PINNED_GIVEAWAY")) {
                                                                                                        formatString = LocaleController.formatString(R.string.NotificationPinnedGiveaway, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 141040782:
                                                                                                    if (string4.equals("CHAT_LEFT")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupLeftMember", R.string.NotificationGroupLeftMember, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 172201318:
                                                                                                    strArr6 = strArr7;
                                                                                                    if (string4.equals("MESSAGE_GRAM_TRANSFER_UNKNOWN_COMMENT")) {
                                                                                                        str25 = "MESSAGE_GRAM_TRANSFER_UNKNOWN";
                                                                                                        boolean startsWith = string4.startsWith(str25);
                                                                                                        boolean endsWith = string4.endsWith("_COMMENT");
                                                                                                        if (strArr6 != null) {
                                                                                                            if (strArr6.length >= (endsWith ? 3 : 2)) {
                                                                                                                str22 = LocaleController.formatString(startsWith ? endsWith ? R.string.NotificationGramTransferUnknownComment : R.string.NotificationGramTransferUnknown : endsWith ? R.string.NotificationGramTransferComment : R.string.NotificationGramTransfer, strArr6);
                                                                                                                i14 = i12;
                                                                                                                str21 = str16;
                                                                                                                obj3 = obj2;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                z20 = false;
                                                                                                                z21 = false;
                                                                                                                str23 = str22;
                                                                                                                i18 = i27;
                                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                                }
                                                                                                                if (str23 != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        i14 = i12;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 191667248:
                                                                                                    if (string4.equals("CHAT_MESSAGE_PAID_MEDIA")) {
                                                                                                        int parseInt5 = Integer.parseInt(strArr7[2]);
                                                                                                        reactedText = LocaleController.formatPluralString("NotificationChatMessagePaidMedia", parseInt5, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.formatPluralString("NotificationPaidMedia", parseInt5, new Object[0]);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 202550149:
                                                                                                    if (string4.equals("CHAT_VOICECHAT_INVITE")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupInvitedToCall", R.string.NotificationGroupInvitedToCall, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 309993049:
                                                                                                    if (string4.equals("CHAT_MESSAGE_DOC")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupDocument", R.string.NotificationMessageGroupDocument, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachDocument);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 309995634:
                                                                                                    if (string4.equals("CHAT_MESSAGE_GEO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachLocation);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 309995749:
                                                                                                    if (string4.equals("CHAT_MESSAGE_GIF")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupGif", R.string.NotificationMessageGroupGif, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachGif);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 320532812:
                                                                                                    if (string4.equals("MESSAGES")) {
                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageAlbum, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 328933854:
                                                                                                    if (string4.equals("CHAT_MESSAGE_STICKER")) {
                                                                                                        if (strArr7.length <= 2 || TextUtils.isEmpty(strArr7[2])) {
                                                                                                            formatString = LocaleController.formatString("NotificationMessageGroupSticker", R.string.NotificationMessageGroupSticker, strArr7[0], strArr7[1]);
                                                                                                            str24 = strArr7[1] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                        } else {
                                                                                                            formatString = LocaleController.formatString("NotificationMessageGroupStickerEmoji", R.string.NotificationMessageGroupStickerEmoji, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                            str24 = strArr7[2] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                        }
                                                                                                        str22 = str24;
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 331340546:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_AUDIO")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageAudio", R.string.ChannelMessageAudio, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachAudio);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 342406591:
                                                                                                    if (string4.equals("CHAT_VOICECHAT_END")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupEndedCall", R.string.NotificationGroupEndedCall, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 344816990:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_PHOTO")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessagePhoto", R.string.ChannelMessagePhoto, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 346878138:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_ROUND")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageRound", R.string.ChannelMessageRound, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachRound);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 347944993:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_STORY")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationChannelStory", R.string.NotificationChannelStory, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.Story);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 350376871:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_VIDEO")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageVideo", R.string.ChannelMessageVideo, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachVideo);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 469501563:
                                                                                                    if (string4.equals("MESSAGE_GRAM_TRANSFER")) {
                                                                                                        str25 = "MESSAGE_GRAM_TRANSFER_UNKNOWN";
                                                                                                        strArr6 = strArr7;
                                                                                                        boolean startsWith2 = string4.startsWith(str25);
                                                                                                        boolean endsWith2 = string4.endsWith("_COMMENT");
                                                                                                        if (strArr6 != null) {
                                                                                                        }
                                                                                                        i14 = i12;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 510462069:
                                                                                                    if (string4.equals("MESSAGE_GIFTCODE")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageGiftCode", R.string.NotificationMessageGiftCode, strArr7[0], LocaleController.formatPluralString("Months", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 608430149:
                                                                                                    if (string4.equals("CHAT_VOICECHAT_INVITE_YOU")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupInvitedYouToCall", R.string.NotificationGroupInvitedYouToCall, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 615714517:
                                                                                                    if (string4.equals("MESSAGE_PHOTO_SECRET")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageSDPhoto", R.string.NotificationMessageSDPhoto, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachDestructingPhoto);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 662207611:
                                                                                                    break;
                                                                                                case 702966260:
                                                                                                    if (string4.equals("MESSAGE_STARGIFT_UNPACK_UPGRADE")) {
                                                                                                        str17 = strArr7[0];
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUnpackUpgrade, str17);
                                                                                                        string3 = LocaleController.getString(R.string.Gift2UniqueUnpackUpgradeNotification);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 715508879:
                                                                                                    if (string4.equals("PINNED_AUDIO")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedVoiceUser", R.string.NotificationActionPinnedVoiceUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedVoice", R.string.NotificationActionPinnedVoice, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedVoiceChannel", R.string.NotificationActionPinnedVoiceChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 728985323:
                                                                                                    if (string4.equals("PINNED_PHOTO")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedPhotoUser", R.string.NotificationActionPinnedPhotoUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedPhoto", R.string.NotificationActionPinnedPhoto, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedPhotoChannel", R.string.NotificationActionPinnedPhotoChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 731046471:
                                                                                                    if (string4.equals("PINNED_ROUND")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedRoundUser", R.string.NotificationActionPinnedRoundUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedRound", R.string.NotificationActionPinnedRound, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedRoundChannel", R.string.NotificationActionPinnedRoundChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 734545204:
                                                                                                    if (string4.equals("PINNED_VIDEO")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedVideoUser", R.string.NotificationActionPinnedVideoUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedVideo", R.string.NotificationActionPinnedVideo, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedVideoChannel", R.string.NotificationActionPinnedVideoChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 802032552:
                                                                                                    if (string4.equals("MESSAGE_CONTACT")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageContact2, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachContact);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 860688476:
                                                                                                    if (string4.equals("CHAT_MESSAGE_TODO_DONE")) {
                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageGroupTodoDone2, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 901537717:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                        try {
                                                                                                            i20 = Integer.parseInt(strArr7[1]);
                                                                                                        } catch (Exception unused2) {
                                                                                                            i20 = 1;
                                                                                                        }
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageChannelStarsGiveaway2, strArr7[0], LocaleController.formatPluralString("AmongWinners", i20, new Object[0]), strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 954623703:
                                                                                                    if (string4.equals("MESSAGE_GIVEAWAY")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageGiveaway", R.string.NotificationMessageGiveaway, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 977076186:
                                                                                                    if (string4.equals("MESSAGE_STARGIFT")) {
                                                                                                        str17 = strArr7[0];
                                                                                                        reactedText = LocaleController.formatPluralStringComma("NotificationMessageStarGift", Integer.parseInt(strArr7[1]), strArr7[0]);
                                                                                                        string3 = LocaleController.formatPluralStringComma("Gift2Notification", Integer.parseInt(strArr7[1]));
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 991498806:
                                                                                                    if (string4.equals("PINNED_GEOLIVE")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, strArr7[0], strArr7[1]) : LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1007364121:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GAME_SCORE")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        strArr3 = strArr7;
                                                                                                        z20 = false;
                                                                                                        formatString = LocaleController.formatString("NotificationMessageGameScored", R.string.NotificationMessageGameScored, strArr3[0], strArr3[1], strArr3[2]);
                                                                                                        z21 = false;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1019850010:
                                                                                                    if (string4.equals("CHAT_MESSAGE_DOCS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr7[0], strArr7[1], LocaleController.formatPluralString("Files", Utilities.parseInt((CharSequence) strArr7[2]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1019917311:
                                                                                                    if (string4.equals("CHAT_MESSAGE_FWDS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupForwardedFew", R.string.NotificationGroupForwardedFew, strArr7[0], strArr7[1], LocaleController.formatPluralString("messages", Utilities.parseInt((CharSequence) strArr7[2]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1019926225:
                                                                                                    if (string4.equals("CHAT_MESSAGE_GAME")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupGame", R.string.NotificationMessageGroupGame, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachGame);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1020207774:
                                                                                                    if (string4.equals("CHAT_MESSAGE_POLL")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.Poll);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1020243252:
                                                                                                    if (string4.equals("CHAT_MESSAGE_QUIZ")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupQuiz2", R.string.NotificationMessageGroupQuiz2, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.PollQuiz);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1020317708:
                                                                                                    if (string4.equals("CHAT_MESSAGE_TEXT")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupText", R.string.NotificationMessageGroupText, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = strArr7[2];
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1020326693:
                                                                                                    if (string4.equals("CHAT_MESSAGE_TODO")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.Todo);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1054583304:
                                                                                                    if (string4.equals("MESSAGE_STORY_MENTION")) {
                                                                                                        formatString = LocaleController.getString(R.string.StoryNotificationMention);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060282259:
                                                                                                    if (string4.equals("MESSAGE_DOCS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr7[0], LocaleController.formatPluralString("Files", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060349560:
                                                                                                    if (string4.equals("MESSAGE_FWDS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageForwardFew", R.string.NotificationMessageForwardFew, strArr7[0], LocaleController.formatPluralString("messages", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060358474:
                                                                                                    if (string4.equals("MESSAGE_GAME")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachGame);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060640023:
                                                                                                    if (string4.equals("MESSAGE_POLL")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessagePoll2, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.Poll);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060675501:
                                                                                                    if (string4.equals("MESSAGE_QUIZ")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageQuiz2, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.QuizPoll);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060749957:
                                                                                                    if (string4.equals("MESSAGE_TEXT")) {
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        strArr5 = strArr7;
                                                                                                        formatString = LocaleController.formatString("NotificationMessageText", R.string.NotificationMessageText, strArr5[0], strArr5[1]);
                                                                                                        str22 = strArr5[1];
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1060758942:
                                                                                                    if (string4.equals("MESSAGE_TODO")) {
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageTodo2, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.Todo);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1073049781:
                                                                                                    if (string4.equals("PINNED_NOTEXT")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedNoTextUser", R.string.NotificationActionPinnedNoTextUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedNoText", R.string.NotificationActionPinnedNoText, strArr7[0], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedNoTextChannel", R.string.NotificationActionPinnedNoTextChannel, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1078101399:
                                                                                                    if (string4.equals("CHAT_TITLE_EDITED")) {
                                                                                                        formatString = LocaleController.formatString("NotificationEditedGroupName", R.string.NotificationEditedGroupName, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1110103437:
                                                                                                    if (string4.equals("CHAT_MESSAGE_NOTEXT")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupNoText", R.string.NotificationMessageGroupNoText, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.Message);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1144183001:
                                                                                                    if (string4.equals("MESSAGE_GIVEAWAY_STARS")) {
                                                                                                        try {
                                                                                                            i21 = Integer.parseInt(strArr7[1]);
                                                                                                        } catch (Exception unused3) {
                                                                                                            i21 = 1;
                                                                                                        }
                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageStarsGiveaway2, strArr7[0], LocaleController.formatPluralString("AmongWinners", i21, new Object[0]), strArr7[2]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1151995881:
                                                                                                    if (string4.equals("MESSAGE_PAID_MEDIA")) {
                                                                                                        int parseInt6 = Integer.parseInt(strArr7[1]);
                                                                                                        reactedText = LocaleController.formatPluralString("NotificationMessagePaidMedia", parseInt6, strArr7[0]);
                                                                                                        string3 = LocaleController.formatPluralString("NotificationPaidMedia", parseInt6, new Object[0]);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1160762272:
                                                                                                    if (string4.equals("CHAT_MESSAGE_PHOTOS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr7[0], strArr7[1], LocaleController.formatPluralString("Photos", Utilities.parseInt((CharSequence) strArr7[2]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1172918249:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GEOLIVE")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageLiveLocation", R.string.ChannelMessageLiveLocation, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1234591620:
                                                                                                    if (string4.equals("CHAT_MESSAGE_GAME_SCORE")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupGameScored", R.string.NotificationMessageGroupGameScored, strArr7[0], strArr7[1], strArr7[2], strArr7[3]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1281128640:
                                                                                                    if (string4.equals("MESSAGE_DOC")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageDocument", R.string.NotificationMessageDocument, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachDocument);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1281131225:
                                                                                                    if (string4.equals("MESSAGE_GEO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageMap", R.string.NotificationMessageMap, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachLocation);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1281131340:
                                                                                                    if (string4.equals("MESSAGE_GIF")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGif", R.string.NotificationMessageGif, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachGif);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1310789062:
                                                                                                    if (string4.equals("MESSAGE_NOTEXT")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageNoText", R.string.NotificationMessageNoText, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.Message);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1333118583:
                                                                                                    if (string4.equals("CHAT_MESSAGE_VIDEOS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr7[0], strArr7[1], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr7[2]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1361447897:
                                                                                                    if (string4.equals("MESSAGE_PHOTOS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr7[0], LocaleController.formatPluralString("Photos", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1369266398:
                                                                                                    if (string4.equals("CHAT_MESSAGE_GIVEAWAY")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageChatGiveaway", R.string.NotificationMessageChatGiveaway, strArr7[0], strArr7[1], strArr7[2], strArr7[3]);
                                                                                                        string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1420317335:
                                                                                                    if (string4.equals("MESSAGE_STARGIFT_UPGRADE")) {
                                                                                                        str17 = strArr7[0];
                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUpgrade, str17);
                                                                                                        string3 = LocaleController.getString(R.string.Gift2UniqueUpgradeNotification);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1449476787:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_GIVEAWAY")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageChannelGiveaway", R.string.NotificationMessageChannelGiveaway, strArr7[0], strArr7[1], strArr7[2]);
                                                                                                        string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1498266155:
                                                                                                    if (string4.equals("PHONE_CALL_MISSED")) {
                                                                                                        i14 = i12;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        obj3 = obj2;
                                                                                                        z20 = false;
                                                                                                        z21 = z20;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        str22 = null;
                                                                                                        str23 = null;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1533804208:
                                                                                                    if (string4.equals("MESSAGE_VIDEOS")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr7[0], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1540131626:
                                                                                                    if (string4.equals("MESSAGE_PLAYLIST")) {
                                                                                                        formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr7[0], LocaleController.formatPluralString("MusicFiles", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1547988151:
                                                                                                    if (string4.equals("CHAT_MESSAGE_AUDIO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupAudio", R.string.NotificationMessageGroupAudio, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachAudio);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1561464595:
                                                                                                    if (string4.equals("CHAT_MESSAGE_PHOTO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupPhoto", R.string.NotificationMessageGroupPhoto, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1563525743:
                                                                                                    if (string4.equals("CHAT_MESSAGE_ROUND")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupRound", R.string.NotificationMessageGroupRound, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachRound);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1564592598:
                                                                                                    if (string4.equals("CHAT_MESSAGE_STORY")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationChatStory", R.string.NotificationChatStory, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.Story);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1567024476:
                                                                                                    if (string4.equals("CHAT_MESSAGE_VIDEO")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupVideo", R.string.NotificationMessageGroupVideo, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachVideo);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1810705077:
                                                                                                    if (string4.equals("MESSAGE_INVOICE")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageInvoice", R.string.NotificationMessageInvoice, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1815177512:
                                                                                                    if (string4.equals("CHANNEL_MESSAGES")) {
                                                                                                        formatString = LocaleController.formatString("ChannelMessageAlbum", R.string.ChannelMessageAlbum, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1837240696:
                                                                                                    if (string4.equals("CHAT_REACT_PAID_MEDIA")) {
                                                                                                        int parseInt7 = Integer.parseInt(strArr7[1]);
                                                                                                        formatPluralString = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt7, strArr7[0]);
                                                                                                        str22 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt7, strArr7[0]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        str23 = formatPluralString;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1954774321:
                                                                                                    if (string4.equals("CHAT_MESSAGE_PLAYLIST")) {
                                                                                                        formatString = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr7[0], strArr7[1], LocaleController.formatPluralString("MusicFiles", Utilities.parseInt((CharSequence) strArr7[2]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1963241394:
                                                                                                    break;
                                                                                                case 2008915478:
                                                                                                    if (string4.equals("STORY_LIVE")) {
                                                                                                        formatString = LocaleController.getString(R.string.StoryLiveNotificationSingle);
                                                                                                        i18 = i17;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2014789757:
                                                                                                    if (string4.equals("CHAT_PHOTO_EDITED")) {
                                                                                                        formatString = LocaleController.formatString("NotificationEditedGroupPhoto", R.string.NotificationEditedGroupPhoto, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2022049433:
                                                                                                    if (string4.equals("PINNED_CONTACT")) {
                                                                                                        formatString = j18 > j10 ? LocaleController.formatString("NotificationActionPinnedContactUser", R.string.NotificationActionPinnedContactUser, strArr7[0], strArr7[1]) : z30 ? LocaleController.formatString("NotificationActionPinnedContact2", R.string.NotificationActionPinnedContact2, strArr7[0], strArr7[2], strArr7[1]) : LocaleController.formatString("NotificationActionPinnedContactChannel2", R.string.NotificationActionPinnedContactChannel2, strArr7[0], strArr7[1]);
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = false;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2034984710:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_PLAYLIST")) {
                                                                                                        formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr7[0], LocaleController.formatPluralString("MusicFiles", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2048733346:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_NOTEXT")) {
                                                                                                        reactedText = LocaleController.formatString("ChannelMessageNoText", R.string.ChannelMessageNoText, strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.Message);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2099392181:
                                                                                                    if (string4.equals("CHANNEL_MESSAGE_PHOTOS")) {
                                                                                                        formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr7[0], LocaleController.formatPluralString("Photos", Utilities.parseInt((CharSequence) strArr7[1]).intValue(), new Object[0]));
                                                                                                        i14 = i12;
                                                                                                        i18 = i27;
                                                                                                        str21 = str16;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        str22 = null;
                                                                                                        z21 = true;
                                                                                                        str23 = formatString;
                                                                                                        obj3 = obj2;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str23 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2103150375:
                                                                                                    if (string4.equals("MESSAGE_STARGIFT_PREPAID_UPGRADE")) {
                                                                                                        str17 = strArr7[0];
                                                                                                        reactedText = LocaleController.formatPluralStringComma("NotificationMessageUniqueStarGiftPrepaidUpgrade", Integer.parseInt(strArr7[1]), strArr7[0]);
                                                                                                        string3 = LocaleController.getString(R.string.Gift2UniquePrepaidUpgradeNotification);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 2140162142:
                                                                                                    if (string4.equals("CHAT_MESSAGE_GEOLIVE")) {
                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupLiveLocation", R.string.NotificationMessageGroupLiveLocation, strArr7[0], strArr7[1]);
                                                                                                        string3 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                        str22 = string3;
                                                                                                        i14 = i12;
                                                                                                        str21 = str16;
                                                                                                        obj3 = obj2;
                                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                        z20 = false;
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    i14 = i12;
                                                                                                    obj3 = obj2;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    z20 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    z21 = z20;
                                                                                                    i18 = i27;
                                                                                                    str21 = str16;
                                                                                                    str22 = null;
                                                                                                    str23 = null;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str23 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        } else {
                                                                                            str18 = str14;
                                                                                            str19 = " for dialogId = ";
                                                                                            obj3 = obj2;
                                                                                            z17 = z29;
                                                                                            z18 = z14;
                                                                                            z19 = z15;
                                                                                            str20 = "CHAT_REACT_";
                                                                                            i14 = i12;
                                                                                            z20 = false;
                                                                                            obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                            reactedText = getReactedText(string4, strArr2);
                                                                                            z21 = false;
                                                                                            str21 = str16;
                                                                                            str22 = null;
                                                                                        }
                                                                                        str23 = reactedText;
                                                                                        i18 = i27;
                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                        }
                                                                                        if (str23 != null) {
                                                                                        }
                                                                                    } else if (string4.startsWith("CHANNEL_")) {
                                                                                        str16 = str15;
                                                                                        j21 = j26;
                                                                                        z14 = false;
                                                                                        z15 = false;
                                                                                        str17 = null;
                                                                                        z16 = true;
                                                                                        if (string4.startsWith(str14)) {
                                                                                        }
                                                                                        str18 = str14;
                                                                                        str19 = " for dialogId = ";
                                                                                        obj3 = obj2;
                                                                                        z17 = z29;
                                                                                        z18 = z14;
                                                                                        z19 = z15;
                                                                                        str20 = "CHAT_REACT_";
                                                                                        i14 = i12;
                                                                                        z20 = false;
                                                                                        obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                        reactedText = getReactedText(string4, strArr2);
                                                                                        z21 = false;
                                                                                        str21 = str16;
                                                                                        str22 = null;
                                                                                        str23 = reactedText;
                                                                                        i18 = i27;
                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                        }
                                                                                        if (str23 != null) {
                                                                                        }
                                                                                    }
                                                                                } else if (UserObject.isReplyUser(j18)) {
                                                                                    str15 = str15 + " @ " + strArr2[1];
                                                                                } else {
                                                                                    z15 = j19 != 0;
                                                                                    str16 = strArr2[1];
                                                                                    str17 = str15;
                                                                                    j21 = j26;
                                                                                    z14 = false;
                                                                                    z16 = false;
                                                                                    if (string4.startsWith(str14)) {
                                                                                    }
                                                                                    str18 = str14;
                                                                                    str19 = " for dialogId = ";
                                                                                    obj3 = obj2;
                                                                                    z17 = z29;
                                                                                    z18 = z14;
                                                                                    z19 = z15;
                                                                                    str20 = "CHAT_REACT_";
                                                                                    i14 = i12;
                                                                                    z20 = false;
                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                    reactedText = getReactedText(string4, strArr2);
                                                                                    z21 = false;
                                                                                    str21 = str16;
                                                                                    str22 = null;
                                                                                    str23 = reactedText;
                                                                                    i18 = i27;
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                    }
                                                                                    if (str23 != null) {
                                                                                    }
                                                                                }
                                                                                str16 = str15;
                                                                                j21 = j26;
                                                                                z14 = false;
                                                                                z15 = false;
                                                                                str17 = null;
                                                                                z16 = false;
                                                                                if (string4.startsWith(str14)) {
                                                                                }
                                                                                str18 = str14;
                                                                                str19 = " for dialogId = ";
                                                                                obj3 = obj2;
                                                                                z17 = z29;
                                                                                z18 = z14;
                                                                                z19 = z15;
                                                                                str20 = "CHAT_REACT_";
                                                                                i14 = i12;
                                                                                z20 = false;
                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                reactedText = getReactedText(string4, strArr2);
                                                                                z21 = false;
                                                                                str21 = str16;
                                                                                str22 = null;
                                                                                str23 = reactedText;
                                                                                i18 = i27;
                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                }
                                                                                if (str23 != null) {
                                                                                }
                                                                            }
                                                                            str15 = null;
                                                                            boolean has2 = jSONObject2.has("edit_date");
                                                                            if (string4.startsWith("CHAT_")) {
                                                                            }
                                                                            if (!string4.startsWith("PINNED_")) {
                                                                            }
                                                                        }
                                                                        z13 = true;
                                                                        String str302 = str3;
                                                                        if (jSONObject2.has(str302)) {
                                                                        }
                                                                        if (jSONObject2.has("silent")) {
                                                                        }
                                                                        boolean z302 = z13;
                                                                        boolean z312 = z28;
                                                                        if (jSONObject3.has("loc_args")) {
                                                                        }
                                                                        if (strArr2 != null) {
                                                                            str15 = strArr2[0];
                                                                            boolean has22 = jSONObject2.has("edit_date");
                                                                            if (string4.startsWith("CHAT_")) {
                                                                            }
                                                                            if (!string4.startsWith("PINNED_")) {
                                                                            }
                                                                        }
                                                                        str15 = null;
                                                                        boolean has222 = jSONObject2.has("edit_date");
                                                                        if (string4.startsWith("CHAT_")) {
                                                                        }
                                                                        if (!string4.startsWith("PINNED_")) {
                                                                        }
                                                                    }
                                                                }
                                                                str13 = str6;
                                                                if (!jSONObject2.has(str13)) {
                                                                }
                                                                if (i15 == 0) {
                                                                }
                                                                if (!string4.startsWith(str14)) {
                                                                }
                                                                z11 = true;
                                                                obj2 = obj;
                                                                boolean z272 = z11;
                                                                int i272 = i15;
                                                                if (string4.equals(obj2)) {
                                                                }
                                                                if (!jSONObject2.has("story_id")) {
                                                                }
                                                                if (i28 < 0) {
                                                                }
                                                                i17 = i28;
                                                                if (z12) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    countDownLatch.countDown();
                                                    ConnectionsManager.onInternalPushReceived(i14);
                                                    ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                                }
                                                i14 = i12;
                                                countDownLatch.countDown();
                                                ConnectionsManager.onInternalPushReceived(i14);
                                                ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            } catch (Throwable th6) {
                                                th = th6;
                                                i23 = i12;
                                                str4 = string4;
                                                i11 = i23;
                                                str5 = str5;
                                                i10 = -1;
                                                if (i11 == i10) {
                                                }
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                                FileLog.e(th);
                                            }
                                            break;
                                        case -1702432235:
                                            break;
                                        case -920689527:
                                            if (string4.equals("DC_UPDATE")) {
                                                int i31 = jSONObject.getInt("dc");
                                                String[] split3 = jSONObject.getString("addr").split(":");
                                                if (split3.length != 2) {
                                                    countDownLatch.countDown();
                                                    break;
                                                } else {
                                                    ConnectionsManager.getInstance(i23).applyDatacenterAddress(i31, split3[0], Integer.parseInt(split3[1]));
                                                    ConnectionsManager.getInstance(i23).resumeNetworkMaybe();
                                                    countDownLatch.countDown();
                                                    break;
                                                }
                                            }
                                            if (jSONObject.has("channel_id")) {
                                            }
                                            if (jSONObject2.has("from_id")) {
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                            }
                                            if (jSONObject2.has(str11)) {
                                            }
                                            long j242 = j16;
                                            FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                            if (jSONObject2.has(str8)) {
                                            }
                                            if (jSONObject2.has(str12)) {
                                                break;
                                            }
                                            if (j17 == j10) {
                                                j17 = NotificationsController.globalSecretChatId;
                                                break;
                                            }
                                            boolean z262 = z25;
                                            j18 = j17;
                                            if (j18 != j10) {
                                            }
                                            i14 = i12;
                                            countDownLatch.countDown();
                                            ConnectionsManager.onInternalPushReceived(i14);
                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            break;
                                        case -763636569:
                                            if (string4.equals("OAUTH_REQUEST")) {
                                                if (jSONObject3.has("loc_args")) {
                                                    JSONArray jSONArray3 = jSONObject3.getJSONArray("loc_args");
                                                    int length3 = jSONArray3.length();
                                                    String[] strArr8 = new String[length3];
                                                    for (int i32 = 0; i32 < length3; i32++) {
                                                        strArr8[i32] = jSONArray3.getString(i32);
                                                    }
                                                    if (length3 < 2) {
                                                        break;
                                                    } else {
                                                        String optString = jSONObject.optString("url");
                                                        if (TextUtils.isEmpty(optString)) {
                                                            break;
                                                        } else {
                                                            String formatString2 = LocaleController.formatString(R.string.BotAuthNotification, strArr8[0], strArr8[1]);
                                                            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                                                            tL_message3.id = 2147483637;
                                                            tL_message3.random_id = 9223372036854775797L;
                                                            tL_message3.message = formatString2;
                                                            tL_message3.date = (int) (j3 / 1000);
                                                            tL_message3.dialog_id = UserObject.OAUTH;
                                                            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                                            tL_message3.peer_id = tL_peerUser4;
                                                            tL_peerUser4.user_id = UserObject.OAUTH;
                                                            tL_message3.flags |= 256;
                                                            tL_message3.from_id = tL_peerUser4;
                                                            tL_message3.silent = jSONObject.has("silent") && jSONObject.getInt("silent") != 0;
                                                            MessageObject messageObject2 = new MessageObject(i23, tL_message3, formatString2, optString, null, true, false, false, false);
                                                            messageObject2.isOauthPush = true;
                                                            ArrayList<MessageObject> arrayList5 = new ArrayList<>();
                                                            arrayList5.add(messageObject2);
                                                            FileLog.d("PushListenerController push OAUTH notification to NotificationsController of " + tL_message3.dialog_id);
                                                            NotificationsController.getInstance(i23).processNewMessages(arrayList5, true, true, countDownLatch);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (jSONObject.has("channel_id")) {
                                            }
                                            if (jSONObject2.has("from_id")) {
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                            }
                                            if (jSONObject2.has(str11)) {
                                            }
                                            long j2422 = j16;
                                            FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                            if (jSONObject2.has(str8)) {
                                            }
                                            if (jSONObject2.has(str12)) {
                                            }
                                            if (j17 == j10) {
                                            }
                                            boolean z2622 = z25;
                                            j18 = j17;
                                            if (j18 != j10) {
                                            }
                                            i14 = i12;
                                            countDownLatch.countDown();
                                            ConnectionsManager.onInternalPushReceived(i14);
                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            break;
                                        case 633004703:
                                            if (string4.equals("MESSAGE_ANNOUNCEMENT")) {
                                                TL_update.TL_updateServiceNotification tL_updateServiceNotification = new TL_update.TL_updateServiceNotification();
                                                tL_updateServiceNotification.popup = false;
                                                tL_updateServiceNotification.flags = 2;
                                                tL_updateServiceNotification.inbox_date = (int) (j3 / 1000);
                                                tL_updateServiceNotification.message = jSONObject3.getString("message");
                                                tL_updateServiceNotification.type = "announcement";
                                                tL_updateServiceNotification.media = new TLRPC.TL_messageMediaEmpty();
                                                TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                                                tL_updates.updates.add(tL_updateServiceNotification);
                                                Utilities.stageQueue.postRunnable(new p6(i23, tL_updates, 9));
                                                ConnectionsManager.getInstance(i23).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                                break;
                                            }
                                            if (jSONObject.has("channel_id")) {
                                            }
                                            if (jSONObject2.has("from_id")) {
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                            }
                                            if (jSONObject2.has(str11)) {
                                            }
                                            long j24222 = j16;
                                            FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                            if (jSONObject2.has(str8)) {
                                            }
                                            if (jSONObject2.has(str12)) {
                                            }
                                            if (j17 == j10) {
                                            }
                                            boolean z26222 = z25;
                                            j18 = j17;
                                            if (j18 != j10) {
                                            }
                                            i14 = i12;
                                            countDownLatch.countDown();
                                            ConnectionsManager.onInternalPushReceived(i14);
                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            break;
                                        case 657503015:
                                            if (string4.equals("MESSAGE_WALLET_TONCONNECT_REQUEST_DAPP")) {
                                                JSONArray optJSONArray = jSONObject3.optJSONArray("loc_args");
                                                NotificationsController.getInstance(i23).showTonConnectNotification((!"MESSAGE_WALLET_TONCONNECT_REQUEST_DAPP".equals(string4) || optJSONArray == null) ? null : optJSONArray.optString(1, null), j3);
                                                ConnectionsManager.onInternalPushReceived(i23);
                                                ConnectionsManager.getInstance(i23).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                                break;
                                            }
                                            if (jSONObject.has("channel_id")) {
                                            }
                                            if (jSONObject2.has("from_id")) {
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                            }
                                            if (jSONObject2.has(str11)) {
                                            }
                                            long j242222 = j16;
                                            FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                            if (jSONObject2.has(str8)) {
                                            }
                                            if (jSONObject2.has(str12)) {
                                            }
                                            if (j17 == j10) {
                                            }
                                            boolean z262222 = z25;
                                            j18 = j17;
                                            if (j18 != j10) {
                                            }
                                            i14 = i12;
                                            countDownLatch.countDown();
                                            ConnectionsManager.onInternalPushReceived(i14);
                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            break;
                                        case 1365673842:
                                            if (string4.equals("GEO_LIVE_PENDING")) {
                                                Utilities.stageQueue.postRunnable(new ei.r2(i23, 6));
                                                countDownLatch.countDown();
                                                break;
                                            }
                                            if (jSONObject.has("channel_id")) {
                                            }
                                            if (jSONObject2.has("from_id")) {
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                            }
                                            if (jSONObject2.has(str11)) {
                                            }
                                            long j2422222 = j16;
                                            FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                            if (jSONObject2.has(str8)) {
                                            }
                                            if (jSONObject2.has(str12)) {
                                            }
                                            if (j17 == j10) {
                                            }
                                            boolean z2622222 = z25;
                                            j18 = j17;
                                            if (j18 != j10) {
                                            }
                                            i14 = i12;
                                            countDownLatch.countDown();
                                            ConnectionsManager.onInternalPushReceived(i14);
                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            break;
                                        default:
                                            if (jSONObject.has("channel_id")) {
                                            }
                                            if (jSONObject2.has("from_id")) {
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                            }
                                            if (jSONObject2.has(str11)) {
                                            }
                                            long j24222222 = j16;
                                            FileLog.d("recived push notification {" + string4 + "} chatId " + j15 + " custom topicId " + i13);
                                            if (jSONObject2.has(str8)) {
                                            }
                                            if (jSONObject2.has(str12)) {
                                            }
                                            if (j17 == j10) {
                                            }
                                            boolean z26222222 = z25;
                                            j18 = j17;
                                            if (j18 != j10) {
                                            }
                                            i14 = i12;
                                            countDownLatch.countDown();
                                            ConnectionsManager.onInternalPushReceived(i14);
                                            ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                                            break;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    i23 = 96;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            str4 = string4;
                            i11 = i23;
                            i10 = -1;
                            if (i11 == i10) {
                                ConnectionsManager.onInternalPushReceived(i11);
                                ConnectionsManager.getInstance(i11).resumeNetworkMaybe();
                                countDownLatch.countDown();
                            } else {
                                onDecryptError();
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("error in loc_key = " + str4 + " json " + str5);
                            }
                            FileLog.e(th);
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            i10 = -1;
            str4 = null;
            str5 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$7(String str, String str2, long j3) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " PRE INIT APP");
        }
        ApplicationLoader.postInitApplication();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " POST INIT APP");
        }
        Utilities.stageQueue.postRunnable(new sh(0, j3, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$0(int i10, int i11, String str) {
        MessagesController.getInstance(i10).registerForPush(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$1(String str, int i10) {
        boolean z10;
        ConnectionsManager.setRegId(str, i10, SharedConfig.pushStringStatus);
        if (str == null) {
            return;
        }
        if (SharedConfig.pushStringGetTimeStart == 0 || SharedConfig.pushStringGetTimeEnd == 0 || (SharedConfig.pushStatSent && TextUtils.equals(SharedConfig.pushString, str))) {
            z10 = false;
        } else {
            SharedConfig.pushStatSent = false;
            z10 = true;
        }
        SharedConfig.pushString = str;
        SharedConfig.pushType = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            UserConfig userConfig = UserConfig.getInstance(i11);
            userConfig.registeredForPush = false;
            userConfig.saveConfig(false);
            if (userConfig.getClientUserId() != 0) {
                if (z10) {
                    String str2 = i10 == 2 ? "fcm" : "hcm";
                    TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                    TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent.time = SharedConfig.pushStringGetTimeStart;
                    tL_inputAppEvent.type = str2.concat("_token_request");
                    tL_inputAppEvent.peer = 0L;
                    tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent);
                    TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent2.time = SharedConfig.pushStringGetTimeEnd;
                    tL_inputAppEvent2.type = str2.concat("_token_response");
                    tL_inputAppEvent2.peer = SharedConfig.pushStringGetTimeEnd - SharedConfig.pushStringGetTimeStart;
                    tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                    SharedConfig.pushStatSent = true;
                    SharedConfig.saveConfig();
                    ConnectionsManager.getInstance(i11).sendRequest(tL_help_saveAppLog, null);
                    z10 = false;
                }
                AndroidUtilities.runOnUIThread(new r6(i11, i10, str));
            }
        }
    }

    private static void onDecryptError() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                ConnectionsManager.onInternalPushReceived(i10);
                ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i10, String str, long j3) {
        String str2 = i10 == 2 ? "FCM" : "HCM";
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str2.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AndroidUtilities.runOnUIThread(new sh(1, j3, str2, str));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        if (BuildVars.DEBUG_VERSION) {
            StringBuilder w10 = a1.g.w("finished ", str2, " service, time = ");
            w10.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            FileLog.d(w10.toString());
        }
    }

    public static void sendRegistrationToServer(int i10, String str) {
        Utilities.stageQueue.postRunnable(new p6(str, i10, 8));
    }
}
