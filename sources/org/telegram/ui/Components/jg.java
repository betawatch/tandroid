package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        bf bfVar = chatActivityEnterView.G3;
        Activity activity = chatActivityEnterView.N2;
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar == null || activity == null) {
            return;
        }
        ogVar.C();
        chatActivityEnterView.I3 = true;
        chatActivityEnterView.H3 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.j1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.j1.setTranslationY(0.0f);
        }
        chatActivityEnterView.b3 = null;
        chatActivityEnterView.a3 = null;
        if (!chatActivityEnterView.c1) {
            if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.Y2.V0(1);
            chatActivityEnterView.C2 = -1.0f;
            og ogVar2 = chatActivityEnterView.Y2;
            TL_stories.StoryItem Y0 = ogVar2 != null ? ogVar2.Y0() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.P2;
            MessageObject messageObject = chatActivityEnterView.S2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.F2;
            org.telegram.ui.co coVar = chatActivityEnterView.O2;
            mediaController.startRecording(i10, j3, messageObject, threadMessage, Y0, i11, true, coVar != null ? coVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.E2 = true;
            chatActivityEnterView.L1(0, true);
            xg xgVar = chatActivityEnterView.Y0;
            if (xgVar != null) {
                xgVar.a(0L);
            }
            ug ugVar = chatActivityEnterView.k1;
            if (ugVar != null) {
                ugVar.h = false;
            }
            chatActivityEnterView.Z0.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
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
        if (chatActivityEnterView.E2) {
            return;
        }
        chatActivityEnterView.E2 = true;
        chatActivityEnterView.L1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        xg xgVar2 = chatActivityEnterView.Y0;
        if (xgVar2 != null) {
            xgVar2.a = false;
            xgVar2.d = 0L;
            xgVar2.e = 0L;
            xgVar2.b = false;
        }
    }
}
