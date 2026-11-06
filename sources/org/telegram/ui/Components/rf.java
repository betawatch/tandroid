package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class rf implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.ij threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        je jeVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar == null || activity == null) {
            return;
        }
        wfVar.D();
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
            wf wfVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem T0 = wfVar2 != null ? wfVar2.T0() : null;
            MediaController B = MediaController.B();
            int i7 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.Q2;
            org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i10 = chatActivityEnterView.G2;
            org.telegram.ui.an anVar = chatActivityEnterView.P2;
            B.x0(i7, j3, ijVar, threadMessage, T0, i10, true, anVar != null ? anVar.W8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.N1(0, true);
            fg fgVar = chatActivityEnterView.Y0;
            if (fgVar != null) {
                fgVar.a(0L);
            }
            cg cgVar = chatActivityEnterView.l1;
            if (cgVar != null) {
                cgVar.h = false;
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
            jeVar.run();
        } else {
            CameraController.getInstance().initCamera(jeVar);
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
        fg fgVar2 = chatActivityEnterView.Y0;
        if (fgVar2 != null) {
            fgVar2.a = false;
            fgVar2.d = 0L;
            fgVar2.e = 0L;
            fgVar2.h = 0L;
            fgVar2.n = 0L;
            fgVar2.b = false;
        }
    }
}
