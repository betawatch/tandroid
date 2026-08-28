package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        re reVar = chatActivityEnterView.C3;
        Activity activity = chatActivityEnterView.J2;
        eg egVar = chatActivityEnterView.U2;
        if (egVar == null || activity == null) {
            return;
        }
        egVar.u();
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
            chatActivityEnterView.U2.L0(1);
            chatActivityEnterView.y2 = -1.0f;
            eg egVar2 = chatActivityEnterView.U2;
            TL_stories.StoryItem P0 = egVar2 != null ? egVar2.P0() : null;
            MediaController mediaController = MediaController.getInstance();
            int i9 = chatActivityEnterView.M;
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i10 = chatActivityEnterView.B2;
            org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
            mediaController.startRecording(i9, j10, messageObject, threadMessage, P0, i10, true, qnVar != null ? qnVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.A2 = true;
            chatActivityEnterView.L1(0, true);
            ng ngVar = chatActivityEnterView.U0;
            if (ngVar != null) {
                ngVar.a(0L);
            }
            kg kgVar = chatActivityEnterView.g1;
            if (kgVar != null) {
                kgVar.h = false;
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
            reVar.run();
        } else {
            CameraController.getInstance().initCamera(reVar);
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
        ng ngVar2 = chatActivityEnterView.U0;
        if (ngVar2 != null) {
            ngVar2.a = false;
            ngVar2.d = 0L;
            ngVar2.e = 0L;
            ngVar2.b = false;
        }
    }
}
