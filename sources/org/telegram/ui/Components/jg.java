package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public jg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        bf bfVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar == null || activity == null) {
            return;
        }
        ogVar.D();
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
            if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.Z2.a1(1);
            chatActivityEnterView.D2 = -1.0f;
            og ogVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem d12 = ogVar2 != null ? ogVar2.d1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.G2;
            org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
            mediaController.startRecording(i10, j3, messageObject, threadMessage, d12, i11, true, wnVar != null ? wnVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.L1(0, true);
            xg xgVar = chatActivityEnterView.Y0;
            if (xgVar != null) {
                xgVar.a(0L);
            }
            ug ugVar = chatActivityEnterView.l1;
            if (ugVar != null) {
                ugVar.h = false;
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
            bfVar.run();
        } else {
            CameraController.getInstance().initCamera(bfVar);
        }
        if (chatActivityEnterView.F2) {
            return;
        }
        chatActivityEnterView.F2 = true;
        chatActivityEnterView.L1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        xg xgVar2 = chatActivityEnterView.Y0;
        if (xgVar2 != null) {
            xgVar2.a = false;
            xgVar2.d = 0L;
            xgVar2.e = 0L;
            xgVar2.h = 0L;
            xgVar2.n = 0L;
            xgVar2.b = false;
        }
    }
}
