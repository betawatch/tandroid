package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class cg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public cg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.fj threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        oe oeVar = chatActivityEnterView.a1;
        te teVar = chatActivityEnterView.x4;
        Activity activity = chatActivityEnterView.E3;
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar == null || activity == null) {
            return;
        }
        ngVar.D();
        chatActivityEnterView.z4 = true;
        int i7 = 0;
        chatActivityEnterView.y4 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.a2.setTranslationY(0.0f);
        }
        chatActivityEnterView.S3 = null;
        chatActivityEnterView.R3 = null;
        if (chatActivityEnterView.d1) {
            boolean z10 = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
            if (!z10 || !z11) {
                String[] strArr = new String[(z10 || z11) ? 1 : 2];
                if (!z10 && !z11) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (z10) {
                    strArr[0] = "android.permission.CAMERA";
                } else {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                }
                activity.requestPermissions(strArr, org.telegram.messenger.ks.g2);
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                teVar.run();
            } else {
                CameraController.getInstance().initCamera(teVar);
            }
            if (chatActivityEnterView.v3) {
                return;
            }
            chatActivityEnterView.v3 = true;
            chatActivityEnterView.s2(0, true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
            if (recordCircle != null) {
                recordCircle.I = 0.5f;
                recordCircle.J = false;
            }
            wg wgVar = chatActivityEnterView.Z0;
            if (wgVar != null) {
                wgVar.a = false;
                wgVar.d = 0L;
                wgVar.e = 0L;
                wgVar.h = 0L;
                wgVar.n = 0L;
                wgVar.b = false;
                return;
            }
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return;
        }
        if (chatActivityEnterView.l1) {
            chatActivityEnterView.n0(false, false);
            chatActivityEnterView.t3 = -1.0f;
            chatActivityEnterView.v3 = true;
            chatActivityEnterView.s2(0, true);
            chatActivityEnterView.j0();
            ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
            if (recordCircle2 != null) {
                recordCircle2.J = true;
            }
            tg tgVar = chatActivityEnterView.b2;
            if (tgVar != null) {
                tgVar.e = false;
            }
            oeVar.getParent().requestDisallowInterceptTouchEvent(true);
            chatActivityEnterView.A0().I(true);
            return;
        }
        chatActivityEnterView.P3.a1(1);
        if (DictationAsr.D()) {
            if (DictationAsr.z()) {
                Context context = chatActivityEnterView.getContext();
                if (i10 >= 33 && ai.d.c == 0 && !ai.d.d) {
                    org.telegram.messenger.g0.g3(new ai.a(context.getApplicationContext(), i7));
                }
            }
            ArrayList c10 = ai.w0.c(chatActivityEnterView.getContext(), chatActivityEnterView.G3);
            android.support.v4.media.session.a0 T = DictationAsr.T(c10, true);
            if (T != null) {
                ai.t tVar = (ai.t) T.b;
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(tVar.a);
                boolean z12 = currentTimeMillis - g12.getLong(sb2.toString(), 0L) > 86400000;
                boolean y10 = DictationAsr.y(tVar);
                if (y10 && !tVar.i) {
                    tVar.i = true;
                    DictationAsr.d.execute(new ai.o(tVar, 0));
                }
                if ((y10 || ai.l1.b()) && (!y10 || z12)) {
                    DictationAsr.u(tVar, false);
                }
                Context context2 = chatActivityEnterView.getContext();
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.d(context2);
                }
            } else {
                Context context3 = chatActivityEnterView.getContext();
                if (DictationLid.e(c10)) {
                    DictationLid.d(context3);
                }
            }
        }
        chatActivityEnterView.t3 = -1.0f;
        ng ngVar2 = chatActivityEnterView.P3;
        TL_stories.StoryItem c12 = ngVar2 != null ? ngVar2.c1() : null;
        MediaController B = MediaController.B();
        int i11 = chatActivityEnterView.R;
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        int i12 = chatActivityEnterView.w3;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        B.x0(i11, j3, fjVar, threadMessage, c12, i12, true, bnVar != null ? bnVar.Y8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        chatActivityEnterView.v3 = true;
        chatActivityEnterView.s2(0, true);
        wg wgVar2 = chatActivityEnterView.Z0;
        if (wgVar2 != null) {
            wgVar2.a(0L);
        }
        tg tgVar2 = chatActivityEnterView.b2;
        if (tgVar2 != null) {
            tgVar2.e = false;
        }
        oeVar.getParent().requestDisallowInterceptTouchEvent(true);
        ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
        if (recordCircle3 != null) {
            recordCircle3.I = 1.0f;
            recordCircle3.J = true;
        }
    }
}
