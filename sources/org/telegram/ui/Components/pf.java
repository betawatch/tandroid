package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pf implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.zi threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        he heVar = chatActivityEnterView.I3;
        Activity activity = chatActivityEnterView.P2;
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar == null || activity == null) {
            return;
        }
        ufVar.E();
        chatActivityEnterView.K3 = true;
        chatActivityEnterView.J3 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.l1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.l1.setTranslationY(0.0f);
        }
        chatActivityEnterView.d3 = null;
        chatActivityEnterView.c3 = null;
        if (!chatActivityEnterView.d1) {
            if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.a3.M0(1);
            chatActivityEnterView.E2 = -1.0f;
            uf ufVar2 = chatActivityEnterView.a3;
            TL_stories.StoryItem R0 = ufVar2 != null ? ufVar2.R0() : null;
            MediaController B = MediaController.B();
            int i3 = chatActivityEnterView.R;
            long j10 = chatActivityEnterView.R2;
            org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i10 = chatActivityEnterView.H2;
            org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
            B.x0(i3, j10, ziVar, threadMessage, R0, i10, true, wmVar != null ? wmVar.W8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.G2 = true;
            chatActivityEnterView.M1(0, true);
            dg dgVar = chatActivityEnterView.Z0;
            if (dgVar != null) {
                dgVar.a(0L);
            }
            ag agVar = chatActivityEnterView.m1;
            if (agVar != null) {
                agVar.h = false;
            }
            chatActivityEnterView.a1.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
            if (recordCircle != null) {
                recordCircle.I = 1.0f;
                recordCircle.J = true;
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
            activity.requestPermissions(strArr, org.telegram.messenger.hs.g2);
            return;
        }
        if (CameraController.getInstance().isCameraInitied()) {
            heVar.run();
        } else {
            CameraController.getInstance().initCamera(heVar);
        }
        if (chatActivityEnterView.G2) {
            return;
        }
        chatActivityEnterView.G2 = true;
        chatActivityEnterView.M1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.O1;
        if (recordCircle2 != null) {
            recordCircle2.I = 0.5f;
            recordCircle2.J = false;
        }
        dg dgVar2 = chatActivityEnterView.Z0;
        if (dgVar2 != null) {
            dgVar2.a = false;
            dgVar2.d = 0L;
            dgVar2.e = 0L;
            dgVar2.h = 0L;
            dgVar2.n = 0L;
            dgVar2.b = false;
        }
    }
}
