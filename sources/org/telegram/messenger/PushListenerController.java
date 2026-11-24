package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        switch (str) {
            case "CHAT_REACT_CONTACT":
                return k96.a0(null, null, 2131746381, objArr);
            case "REACT_WALLET_TONCONNECT_REQUEST":
                return k96.a0(null, null, 2131746318, objArr);
            case "CHAT_REACT_POLL_APPEND":
                return k96.a0(null, null, 2131746370, objArr);
            case "REACT_GEOLIVE":
                return k96.a0(null, null, 2131746354, objArr);
            case "REACT_GAME_SCORE":
                return k96.a0(null, null, 2131746356, objArr);
            case "REACT_STORY_HIDDEN":
                return k96.a0(null, null, 2131746330, objArr);
            case "CHAT_REACT_TODO_DONE":
            case "CHAT_REACT_TODO_APPEND":
                return k96.a0(null, null, 2131746362, objArr);
            case "REACT_RECURRING_PAY":
                return k96.a0(null, null, 2131746340, objArr);
            case "REACT_STARGIFT_UPGRADE":
                return k96.a0(null, null, 2131746333, objArr);
            case "REACT_HIDDEN":
                return k96.a0(null, null, 2131746349, objArr);
            case "CHAT_REACT_NOTEXT":
                return k96.a0(null, null, 2131746373, objArr);
            case "CHAT_REACT_GAME_SCORE":
                return k96.a0(null, null, 2131746378, objArr);
            case "REACT_NOTEXT":
                return k96.a0(null, null, 2131746347, objArr);
            case "REACT_PHOTO_SECRET":
                return k96.a0(null, null, 2131746344, objArr);
            case "REACT_WALLPAPER":
                return k96.a0(null, null, 2131746317, objArr);
            case "CHAT_REACT_INVOICE":
                return k96.a0(null, null, 2131746374, objArr);
            case "CHAT_REACT_NOTHEME":
            case "CHAT_REACT_THEME":
                return k96.a0(null, null, 2131746364, objArr);
            case "REACT_CONTACT":
                return k96.a0(null, null, 2131746359, objArr);
            case "REACT_STARGIFT_PREPAID_UPGRADE":
                return k96.a0(null, null, 2131746335, objArr);
            case "CHAT_REACT_STICKER":
                return k96.a0(null, null, 2131746367, objArr);
            case "REACT_SAME_WALLPAPER":
                return k96.a0(null, null, 2131746338, objArr);
            case "REACT_GRAM_TRANSFER_COMMENT":
                return k96.a0(null, null, 2131746350, objArr);
            case "REACT_GAME":
                return k96.a0(null, null, 2131746357, objArr);
            case "REACT_POLL":
                return k96.a0(null, null, 2131746343, objArr);
            case "REACT_QUIZ":
                return k96.a0(null, null, 2131746341, objArr);
            case "REACT_TEXT":
                return k96.a0(null, null, 2131746325, objArr);
            case "REACT_TODO":
                return k96.a0(null, null, 2131746323, objArr);
            case "REACT_INVOICE":
                return k96.a0(null, null, 2131746348, objArr);
            case "REACT_SCREENSHOT":
                return k96.a0(null, null, 2131746337, objArr);
            case "CHAT_REACT_DOC":
                return k96.a0(null, null, 2131746380, objArr);
            case "CHAT_REACT_GEO":
                return k96.a0(null, null, 2131746377, objArr);
            case "CHAT_REACT_GIF":
                return k96.a0(null, null, 2131746375, objArr);
            case "REACT_TODO_DONE":
            case "REACT_TODO_APPEND":
                return k96.a0(null, null, 2131746322, objArr);
            case "REACT_NOTHEME":
            case "REACT_THEME":
            case "REACT_GIFT_THEME":
                return k96.a0(null, null, 2131746324, objArr);
            case "REACT_GRAM_TRANSFER":
                return k96.a0(null, null, 2131746351, objArr);
            case "REACT_STARGIFT_UNPACK_UPGRADE":
                return k96.a0(null, null, 2131746334, objArr);
            case "REACT_GIFTCODE":
                return k96.a0(null, null, 2131746352, objArr);
            case "REACT_STICKER":
                return k96.a0(null, null, 2131746332, objArr);
            case "CHAT_REACT_AUDIO":
                return k96.a0(null, null, 2131746382, objArr);
            case "CHAT_REACT_PHOTO":
                return k96.a0(null, null, 2131746372, objArr);
            case "CHAT_REACT_ROUND":
                return k96.a0(null, null, 2131746368, objArr);
            case "CHAT_REACT_STORY":
                return k96.a0(null, null, 2131746366, objArr);
            case "CHAT_REACT_VIDEO":
                return k96.a0(null, null, 2131746361, objArr);
            case "CHAT_REACT_GIVEAWAY":
                return k96.a0(null, null, 2131747856, objArr);
            case "REACT_UNIQUE_STARGIFT":
                return k96.a0(null, null, 2131746321, objArr);
            case "REACT_STORY_MENTION":
                return k96.a0(null, null, 2131746328, objArr);
            case "REACT_GIVEAWAY_STARS":
                return k96.a0(null, null, 2131747744, objArr);
            case "REACT_GIVEAWAY":
                return k96.a0(null, null, 2131747744, objArr);
            case "REACT_STARGIFT":
                return k96.a0(null, null, 2131746336, objArr);
            case "CHAT_REACT_GEOLIVE":
                return k96.a0(null, null, 2131746376, objArr);
            case "REACT_VIDEO_SECRET":
                return k96.a0(null, null, 2131746319, objArr);
            case "REACT_SUGGEST_BIRTHDAY":
                return k96.a0(null, null, 2131746327, objArr);
            case "REACT_PROXIMITY":
                return k96.a0(null, null, 2131746342, objArr);
            case "REACT_PAID_MEDIA":
                return k96.a0(null, null, 2131746346, objArr);
            case "REACT_AUDIO":
                return k96.a0(null, null, 2131746360, objArr);
            case "REACT_PHOTO":
                return k96.a0(null, null, 2131746345, objArr);
            case "REACT_ROUND":
                return k96.a0(null, null, 2131746339, objArr);
            case "REACT_STORY":
                return k96.a0(null, null, 2131746331, objArr);
            case "REACT_VIDEO":
                return k96.a0(null, null, 2131746320, objArr);
            case "REACT_SUGGEST_USERPIC":
                return k96.a0(null, null, 2131746326, objArr);
            case "REACT_DOC":
                return k96.a0(null, null, 2131746358, objArr);
            case "REACT_GEO":
                return k96.a0(null, null, 2131746355, objArr);
            case "REACT_GIF":
                return k96.a0(null, null, 2131746353, objArr);
            case "CHAT_REACT_GAME":
                return k96.a0(null, null, 2131746379, objArr);
            case "CHAT_REACT_POLL":
                return k96.a0(null, null, 2131746371, objArr);
            case "CHAT_REACT_QUIZ":
                return k96.a0(null, null, 2131746369, objArr);
            case "CHAT_REACT_TEXT":
                return k96.a0(null, null, 2131746365, objArr);
            case "CHAT_REACT_TODO":
                return k96.a0(null, null, 2131746363, objArr);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$2(int i, TLRPC.TL_updates tL_updates) {
        na7.q1(i).Q3(tL_updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$3(int i) {
        if (y6c.h(i).e() != 0) {
            y6c.h(i).b();
            na7.q1(i).B3(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$processRemoteMessage$4(int i) {
        eb6 f = eb6.f(i);
        if (f.b.isEmpty()) {
            return;
        }
        f.I = SystemClock.elapsedRealtime() + 65000;
        f.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$5(int i, long j, int i2) {
        na7.q1(i).p4(i2, j, true);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x259b: MOVE (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r27 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:1117:0x259b */
    public static void lambda$processRemoteMessage$6(java.lang.String r86, java.lang.String r87, long r88) {
        /*
            Method dump skipped, instructions count: 10358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.PushListenerController.lambda$processRemoteMessage$6(java.lang.String, java.lang.String, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$7(String str, String str2, long j) {
        if (w01.a) {
            fa4.b(str + " PRE INIT APP");
        }
        a.v();
        if (w01.a) {
            fa4.b(str + " POST INIT APP");
        }
        Utilities.d.c(new yu8(str, str2, j, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$0(int i, int i2, String str) {
        na7.q1(i).b4(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$1(String str, int i) {
        boolean z;
        ConnectionsManager.setRegId(str, i, gba.g);
        if (str != null) {
            if (gba.h == 0 || gba.i == 0 || (gba.j && TextUtils.equals(gba.f, str))) {
                z = false;
            } else {
                gba.j = false;
                z = true;
            }
            gba.f = str;
            gba.e = i;
            for (int i2 = 0; i2 < 4; i2++) {
                y6c h = y6c.h(i2);
                h.d = false;
                h.u(false);
                if (h.e() != 0) {
                    if (z) {
                        String str2 = i == 2 ? "fcm" : "hcm";
                        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent.time = gba.h;
                        tL_inputAppEvent.type = str2.concat("_token_request");
                        tL_inputAppEvent.peer = 0L;
                        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent);
                        TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent2.time = gba.i;
                        tL_inputAppEvent2.type = str2.concat("_token_response");
                        tL_inputAppEvent2.peer = gba.i - gba.h;
                        tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                        gba.j = true;
                        gba.x();
                        ConnectionsManager.getInstance(i2).sendRequest(tL_help_saveAppLog, null);
                        z = false;
                    }
                    gl.d3(new bt(i2, i, (Object) str, (byte) 13));
                }
            }
        }
    }

    private static void onDecryptError() {
        for (int i = 0; i < 4; i++) {
            if (y6c.h(i).o()) {
                ConnectionsManager.onInternalPushReceived(i);
                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i, String str, long j) {
        String str2 = i == 2 ? "FCM" : "HCM";
        if (w01.a) {
            fa4.b(str2.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gl.d3(new yu8(str2, str, j, (byte) 1));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        boolean z = w01.a;
        StringBuilder p = ug8.p("finished ", str2, " service, time = ");
        p.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        fa4.b(p.toString());
    }

    public static void sendRegistrationToServer(int i, String str) {
        Utilities.d.c(new op7(str, i));
    }
}
