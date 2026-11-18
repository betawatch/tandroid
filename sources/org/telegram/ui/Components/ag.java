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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ag implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public ag(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.fj threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        oe oeVar = chatActivityEnterView.a1;
        te teVar = chatActivityEnterView.v4;
        Activity activity = chatActivityEnterView.C3;
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar == null || activity == null) {
            return;
        }
        kgVar.D();
        chatActivityEnterView.x4 = true;
        int i7 = 0;
        chatActivityEnterView.w4 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.Y1.setTranslationY(0.0f);
        }
        chatActivityEnterView.Q3 = null;
        chatActivityEnterView.P3 = null;
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
            if (chatActivityEnterView.t3) {
                return;
            }
            chatActivityEnterView.t3 = true;
            chatActivityEnterView.o2(0, true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
            if (recordCircle != null) {
                recordCircle.I = 0.5f;
                recordCircle.J = false;
            }
            ug ugVar = chatActivityEnterView.Z0;
            if (ugVar != null) {
                ugVar.a = false;
                ugVar.d = 0L;
                ugVar.e = 0L;
                ugVar.h = 0L;
                ugVar.n = 0L;
                ugVar.b = false;
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
            chatActivityEnterView.l0(false, false);
            chatActivityEnterView.r3 = -1.0f;
            chatActivityEnterView.t3 = true;
            chatActivityEnterView.o2(0, true);
            chatActivityEnterView.i0();
            ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.B2;
            if (recordCircle2 != null) {
                recordCircle2.J = true;
            }
            rg rgVar = chatActivityEnterView.Z1;
            if (rgVar != null) {
                rgVar.e = false;
            }
            oeVar.getParent().requestDisallowInterceptTouchEvent(true);
            chatActivityEnterView.w0().F(true);
            return;
        }
        chatActivityEnterView.N3.a1(1);
        if (DictationAsr.B()) {
            if (DictationAsr.x()) {
                Context context = chatActivityEnterView.getContext();
                if (i10 >= 33 && ai.d.c == 0 && !ai.d.d) {
                    org.telegram.messenger.g0.g3(new ai.a(context.getApplicationContext(), i7));
                }
            }
            ArrayList c10 = ai.u0.c(chatActivityEnterView.getContext(), chatActivityEnterView.E3);
            android.support.v4.media.session.a0 P = DictationAsr.P(c10, true);
            if (P != null) {
                ai.t tVar = (ai.t) P.b;
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(tVar.a);
                boolean z12 = currentTimeMillis - g12.getLong(sb2.toString(), 0L) > 86400000;
                boolean w10 = DictationAsr.w(tVar);
                if (w10 && !tVar.g) {
                    tVar.g = true;
                    DictationAsr.d.execute(new ai.p(tVar, 0));
                }
                if ((w10 || ai.j1.b()) && (!w10 || z12)) {
                    DictationAsr.s(tVar, false);
                }
                Context context2 = chatActivityEnterView.getContext();
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.v()) {
                    DictationLid.d(context2);
                }
            } else {
                Context context3 = chatActivityEnterView.getContext();
                if (DictationLid.e(c10)) {
                    DictationLid.d(context3);
                }
            }
        }
        chatActivityEnterView.r3 = -1.0f;
        kg kgVar2 = chatActivityEnterView.N3;
        TL_stories.StoryItem c12 = kgVar2 != null ? kgVar2.c1() : null;
        MediaController B = MediaController.B();
        int i11 = chatActivityEnterView.R;
        long j3 = chatActivityEnterView.E3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        int i12 = chatActivityEnterView.u3;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        B.x0(i11, j3, fjVar, threadMessage, c12, i12, true, bnVar != null ? bnVar.Y8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        chatActivityEnterView.t3 = true;
        chatActivityEnterView.o2(0, true);
        ug ugVar2 = chatActivityEnterView.Z0;
        if (ugVar2 != null) {
            ugVar2.a(0L);
        }
        rg rgVar2 = chatActivityEnterView.Z1;
        if (rgVar2 != null) {
            rgVar2.e = false;
        }
        oeVar.getParent().requestDisallowInterceptTouchEvent(true);
        ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.B2;
        if (recordCircle3 != null) {
            recordCircle3.I = 1.0f;
            recordCircle3.J = true;
        }
    }
}
