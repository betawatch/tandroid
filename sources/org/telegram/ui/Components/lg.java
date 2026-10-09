package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lg implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public lg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        df dfVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar == null || activity == null) {
            return;
        }
        qgVar.J();
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
            chatActivityEnterView.Z2.g1(1);
            chatActivityEnterView.D2 = -1.0f;
            qg qgVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem j12 = qgVar2 != null ? qgVar2.j1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.G2;
            org.telegram.ui.zn znVar = chatActivityEnterView.P2;
            mediaController.startRecording(i10, j3, messageObject, threadMessage, j12, i11, true, znVar != null ? znVar.H8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.J1(0, true);
            zg zgVar = chatActivityEnterView.Y0;
            if (zgVar != null) {
                zgVar.a(0L);
            }
            wg wgVar = chatActivityEnterView.l1;
            if (wgVar != null) {
                wgVar.h = false;
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
            dfVar.run();
        } else {
            CameraController.getInstance().initCamera(dfVar);
        }
        if (chatActivityEnterView.F2) {
            return;
        }
        chatActivityEnterView.F2 = true;
        chatActivityEnterView.J1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        zg zgVar2 = chatActivityEnterView.Y0;
        if (zgVar2 != null) {
            zgVar2.a = false;
            zgVar2.d = 0L;
            zgVar2.e = 0L;
            zgVar2.h = 0L;
            zgVar2.n = 0L;
            zgVar2.b = false;
        }
    }
}
