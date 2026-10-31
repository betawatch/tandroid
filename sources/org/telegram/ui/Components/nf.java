package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nf implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public nf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.jj threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ee eeVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar == null || activity == null) {
            return;
        }
        sfVar.C();
        chatActivityEnterView.J3 = true;
        chatActivityEnterView.I3 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.k1.setTranslationY(0.0f);
        }
        chatActivityEnterView.c3 = null;
        chatActivityEnterView.b3 = null;
        if (!chatActivityEnterView.c1) {
            if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.Z2.G0(1);
            chatActivityEnterView.D2 = -1.0f;
            sf sfVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem P0 = sfVar2 != null ? sfVar2.P0() : null;
            MediaController B = MediaController.B();
            int i10 = chatActivityEnterView.Q;
            long j10 = chatActivityEnterView.Q2;
            org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.G2;
            org.telegram.ui.un unVar = chatActivityEnterView.P2;
            B.x0(i10, j10, jjVar, threadMessage, P0, i11, true, unVar != null ? unVar.P8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.K1(0, true);
            bg bgVar = chatActivityEnterView.Y0;
            if (bgVar != null) {
                bgVar.a(0L);
            }
            yf yfVar = chatActivityEnterView.l1;
            if (yfVar != null) {
                yfVar.h = false;
            }
            chatActivityEnterView.Z0.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
            if (recordCircle != null) {
                recordCircle.H = 1.0f;
                recordCircle.I = true;
                return;
            }
            return;
        }
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
            activity.requestPermissions(strArr, org.telegram.messenger.zs.g2);
            return;
        }
        if (CameraController.getInstance().isCameraInitied()) {
            eeVar.run();
        } else {
            CameraController.getInstance().initCamera(eeVar);
        }
        if (chatActivityEnterView.F2) {
            return;
        }
        chatActivityEnterView.F2 = true;
        chatActivityEnterView.K1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        bg bgVar2 = chatActivityEnterView.Y0;
        if (bgVar2 != null) {
            bgVar2.a = false;
            bgVar2.d = 0L;
            bgVar2.e = 0L;
            bgVar2.h = 0L;
            bgVar2.n = 0L;
            bgVar2.b = false;
        }
    }
}
