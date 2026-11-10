package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qf implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.ij threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ie ieVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar == null || activity == null) {
            return;
        }
        vfVar.D();
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
            chatActivityEnterView.Z2.R0(1);
            chatActivityEnterView.D2 = -1.0f;
            vf vfVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem T0 = vfVar2 != null ? vfVar2.T0() : null;
            MediaController B = MediaController.B();
            int i7 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.Q2;
            org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i10 = chatActivityEnterView.G2;
            org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
            B.x0(i7, j3, ijVar, threadMessage, T0, i10, true, cnVar != null ? cnVar.X8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.N1(0, true);
            eg egVar = chatActivityEnterView.Y0;
            if (egVar != null) {
                egVar.a(0L);
            }
            bg bgVar = chatActivityEnterView.l1;
            if (bgVar != null) {
                bgVar.h = false;
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
        boolean z9 = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
        boolean z10 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
        if (!z9 || !z10) {
            String[] strArr = new String[(z9 || z10) ? 1 : 2];
            if (!z9 && !z10) {
                strArr[0] = "android.permission.RECORD_AUDIO";
                strArr[1] = "android.permission.CAMERA";
            } else if (z9) {
                strArr[0] = "android.permission.CAMERA";
            } else {
                strArr[0] = "android.permission.RECORD_AUDIO";
            }
            activity.requestPermissions(strArr, org.telegram.messenger.qs.g2);
            return;
        }
        if (CameraController.getInstance().isCameraInitied()) {
            ieVar.run();
        } else {
            CameraController.getInstance().initCamera(ieVar);
        }
        if (chatActivityEnterView.F2) {
            return;
        }
        chatActivityEnterView.F2 = true;
        chatActivityEnterView.N1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        eg egVar2 = chatActivityEnterView.Y0;
        if (egVar2 != null) {
            egVar2.a = false;
            egVar2.d = 0L;
            egVar2.e = 0L;
            egVar2.h = 0L;
            egVar2.n = 0L;
            egVar2.b = false;
        }
    }
}
