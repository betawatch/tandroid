package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public hg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ye yeVar = chatActivityEnterView.G3;
        Activity activity = chatActivityEnterView.N2;
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar == null || activity == null) {
            return;
        }
        mgVar.D();
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
            chatActivityEnterView.Y2.a1(1);
            chatActivityEnterView.C2 = -1.0f;
            mg mgVar2 = chatActivityEnterView.Y2;
            TL_stories.StoryItem d12 = mgVar2 != null ? mgVar2.d1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.P2;
            MessageObject messageObject = chatActivityEnterView.S2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.F2;
            org.telegram.ui.bo boVar = chatActivityEnterView.O2;
            mediaController.startRecording(i10, j3, messageObject, threadMessage, d12, i11, true, boVar != null ? boVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.E2 = true;
            chatActivityEnterView.L1(0, true);
            vg vgVar = chatActivityEnterView.Y0;
            if (vgVar != null) {
                vgVar.a(0L);
            }
            sg sgVar = chatActivityEnterView.k1;
            if (sgVar != null) {
                sgVar.h = false;
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
            yeVar.run();
        } else {
            CameraController.getInstance().initCamera(yeVar);
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
        vg vgVar2 = chatActivityEnterView.Y0;
        if (vgVar2 != null) {
            vgVar2.a = false;
            vgVar2.d = 0L;
            vgVar2.e = 0L;
            vgVar2.b = false;
        }
    }
}
