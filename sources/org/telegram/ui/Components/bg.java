package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public bg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.fj threadMessage;
        android.support.v4.media.session.a0 W;
        ChatActivityEnterView chatActivityEnterView = this.a;
        pe peVar = chatActivityEnterView.a1;
        ue ueVar = chatActivityEnterView.x4;
        Activity activity = chatActivityEnterView.E3;
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar == null || activity == null) {
            return;
        }
        mgVar.z();
        chatActivityEnterView.z4 = true;
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
                ueVar.run();
            } else {
                CameraController.getInstance().initCamera(ueVar);
            }
            if (chatActivityEnterView.v3) {
                return;
            }
            chatActivityEnterView.v3 = true;
            chatActivityEnterView.u2(0, true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
            if (recordCircle != null) {
                recordCircle.I = 0.5f;
                recordCircle.J = false;
            }
            vg vgVar = chatActivityEnterView.Z0;
            if (vgVar != null) {
                vgVar.a = false;
                vgVar.d = 0L;
                vgVar.e = 0L;
                vgVar.h = 0L;
                vgVar.n = 0L;
                vgVar.b = false;
                return;
            }
            return;
        }
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return;
        }
        if (chatActivityEnterView.l1) {
            chatActivityEnterView.n0(false, false);
            chatActivityEnterView.t3 = -1.0f;
            chatActivityEnterView.v3 = true;
            chatActivityEnterView.u2(0, true);
            chatActivityEnterView.j0();
            ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
            if (recordCircle2 != null) {
                recordCircle2.J = true;
            }
            sg sgVar = chatActivityEnterView.b2;
            if (sgVar != null) {
                sgVar.e = false;
            }
            peVar.getParent().requestDisallowInterceptTouchEvent(true);
            chatActivityEnterView.A0().G(true);
            return;
        }
        chatActivityEnterView.P3.U0(1);
        if (DictationAsr.G() && (W = DictationAsr.W(ai.s0.c(chatActivityEnterView.getContext(), chatActivityEnterView.G3))) != null) {
            ai.q qVar = (ai.q) W.b;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
            sb2.append(qVar.a);
            boolean z12 = currentTimeMillis - g12.getLong(sb2.toString(), 0L) > 86400000;
            boolean A = DictationAsr.A(qVar);
            if (A && !qVar.i) {
                qVar.i = true;
                DictationAsr.d.execute(new ai.l(qVar, 0));
            }
            if ((A || ai.h1.b()) && (!A || z12)) {
                DictationAsr.w(qVar, false);
            }
            Context context = chatActivityEnterView.getContext();
            ExecutorService executorService = DictationLid.a;
            if (DictationAsr.z()) {
                DictationLid.d(context);
            }
        }
        chatActivityEnterView.t3 = -1.0f;
        mg mgVar2 = chatActivityEnterView.P3;
        TL_stories.StoryItem Y0 = mgVar2 != null ? mgVar2.Y0() : null;
        MediaController B = MediaController.B();
        int i7 = chatActivityEnterView.R;
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        int i10 = chatActivityEnterView.w3;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        B.x0(i7, j3, fjVar, threadMessage, Y0, i10, true, bnVar != null ? bnVar.Y8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        chatActivityEnterView.v3 = true;
        chatActivityEnterView.u2(0, true);
        vg vgVar2 = chatActivityEnterView.Z0;
        if (vgVar2 != null) {
            vgVar2.a(0L);
        }
        sg sgVar2 = chatActivityEnterView.b2;
        if (sgVar2 != null) {
            sgVar2.e = false;
        }
        peVar.getParent().requestDisallowInterceptTouchEvent(true);
        ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
        if (recordCircle3 != null) {
            recordCircle3.I = 1.0f;
            recordCircle3.J = true;
        }
    }
}
