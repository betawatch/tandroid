package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public kg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        cf cfVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar == null || activity == null) {
            return;
        }
        pgVar.H();
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
            chatActivityEnterView.Z2.Y0(1);
            chatActivityEnterView.D2 = -1.0f;
            pg pgVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem b12 = pgVar2 != null ? pgVar2.b1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.Q;
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.G2;
            org.telegram.ui.fo foVar = chatActivityEnterView.P2;
            mediaController.startRecording(i10, j10, messageObject, threadMessage, b12, i11, true, foVar != null ? foVar.H8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.I1(0, true);
            yg ygVar = chatActivityEnterView.Y0;
            if (ygVar != null) {
                ygVar.a(0L);
            }
            vg vgVar = chatActivityEnterView.l1;
            if (vgVar != null) {
                vgVar.h = false;
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
            activity.requestPermissions(strArr, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            return;
        }
        if (CameraController.getInstance().isCameraInitied()) {
            cfVar.run();
        } else {
            CameraController.getInstance().initCamera(cfVar);
        }
        if (chatActivityEnterView.F2) {
            return;
        }
        chatActivityEnterView.F2 = true;
        chatActivityEnterView.I1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        yg ygVar2 = chatActivityEnterView.Y0;
        if (ygVar2 != null) {
            ygVar2.a = false;
            ygVar2.d = 0L;
            ygVar2.e = 0L;
            ygVar2.h = 0L;
            ygVar2.n = 0L;
            ygVar2.b = false;
        }
    }
}
