package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public cg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ue ueVar = chatActivityEnterView.C3;
        Activity activity = chatActivityEnterView.J2;
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar == null || activity == null) {
            return;
        }
        hgVar.B();
        chatActivityEnterView.E3 = true;
        chatActivityEnterView.D3 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.f1.setTranslationY(0.0f);
        }
        chatActivityEnterView.X2 = null;
        chatActivityEnterView.W2 = null;
        if (!chatActivityEnterView.Y0) {
            if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.U2.a1(1);
            chatActivityEnterView.y2 = -1.0f;
            hg hgVar2 = chatActivityEnterView.U2;
            TL_stories.StoryItem d12 = hgVar2 != null ? hgVar2.d1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.M;
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.B2;
            org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
            mediaController.startRecording(i10, j10, messageObject, threadMessage, d12, i11, true, tnVar != null ? tnVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.A2 = true;
            chatActivityEnterView.L1(0, true);
            qg qgVar = chatActivityEnterView.U0;
            if (qgVar != null) {
                qgVar.a(0L);
            }
            ng ngVar = chatActivityEnterView.g1;
            if (ngVar != null) {
                ngVar.h = false;
            }
            chatActivityEnterView.V0.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
            if (recordCircle != null) {
                recordCircle.D = 1.0f;
                recordCircle.E = true;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
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
                activity.requestPermissions(strArr, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                return;
            }
        }
        if (CameraController.getInstance().isCameraInitied()) {
            ueVar.run();
        } else {
            CameraController.getInstance().initCamera(ueVar);
        }
        if (chatActivityEnterView.A2) {
            return;
        }
        chatActivityEnterView.A2 = true;
        chatActivityEnterView.L1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
        if (recordCircle2 != null) {
            recordCircle2.D = 0.5f;
            recordCircle2.E = false;
        }
        qg qgVar2 = chatActivityEnterView.U0;
        if (qgVar2 != null) {
            qgVar2.a = false;
            qgVar2.d = 0L;
            qgVar2.e = 0L;
            qgVar2.b = false;
        }
    }
}
