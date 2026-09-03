package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zf implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public zf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        re reVar = chatActivityEnterView.D3;
        Activity activity = chatActivityEnterView.K2;
        eg egVar = chatActivityEnterView.V2;
        if (egVar == null || activity == null) {
            return;
        }
        egVar.B();
        chatActivityEnterView.F3 = true;
        chatActivityEnterView.E3 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.g1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.g1.setTranslationY(0.0f);
        }
        chatActivityEnterView.Y2 = null;
        chatActivityEnterView.X2 = null;
        if (!chatActivityEnterView.Z0) {
            if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.V2.e1(1);
            chatActivityEnterView.z2 = -1.0f;
            eg egVar2 = chatActivityEnterView.V2;
            TL_stories.StoryItem h12 = egVar2 != null ? egVar2.h1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.N;
            long j10 = chatActivityEnterView.M2;
            MessageObject messageObject = chatActivityEnterView.P2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.C2;
            org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
            mediaController.startRecording(i10, j10, messageObject, threadMessage, h12, i11, true, xnVar != null ? xnVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.B2 = true;
            chatActivityEnterView.L1(0, true);
            ng ngVar = chatActivityEnterView.V0;
            if (ngVar != null) {
                ngVar.a(0L);
            }
            kg kgVar = chatActivityEnterView.h1;
            if (kgVar != null) {
                kgVar.h = false;
            }
            chatActivityEnterView.W0.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
            if (recordCircle != null) {
                recordCircle.E = 1.0f;
                recordCircle.F = true;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z4 = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            boolean z10 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
            if (!z4 || !z10) {
                String[] strArr = new String[(z4 || z10) ? 1 : 2];
                if (!z4 && !z10) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (z4) {
                    strArr[0] = "android.permission.CAMERA";
                } else {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                }
                activity.requestPermissions(strArr, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                return;
            }
        }
        if (CameraController.getInstance().isCameraInitied()) {
            reVar.run();
        } else {
            CameraController.getInstance().initCamera(reVar);
        }
        if (chatActivityEnterView.B2) {
            return;
        }
        chatActivityEnterView.B2 = true;
        chatActivityEnterView.L1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
        if (recordCircle2 != null) {
            recordCircle2.E = 0.5f;
            recordCircle2.F = false;
        }
        ng ngVar2 = chatActivityEnterView.V0;
        if (ngVar2 != null) {
            ngVar2.a = false;
            ngVar2.d = 0L;
            ngVar2.e = 0L;
            ngVar2.b = false;
        }
    }
}
