package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ig implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public ig(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageObject threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        af afVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        ng ngVar = chatActivityEnterView.Z2;
        if (ngVar == null || activity == null) {
            return;
        }
        ngVar.D();
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
            chatActivityEnterView.Z2.b1(1);
            chatActivityEnterView.D2 = -1.0f;
            ng ngVar2 = chatActivityEnterView.Z2;
            TL_stories.StoryItem e12 = ngVar2 != null ? ngVar2.e1() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.G2;
            org.telegram.ui.zn znVar = chatActivityEnterView.P2;
            mediaController.startRecording(i10, j3, messageObject, threadMessage, e12, i11, true, znVar != null ? znVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.F2 = true;
            chatActivityEnterView.K1(0, true);
            wg wgVar = chatActivityEnterView.Y0;
            if (wgVar != null) {
                wgVar.a(0L);
            }
            tg tgVar = chatActivityEnterView.l1;
            if (tgVar != null) {
                tgVar.h = false;
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
            afVar.run();
        } else {
            CameraController.getInstance().initCamera(afVar);
        }
        if (chatActivityEnterView.F2) {
            return;
        }
        chatActivityEnterView.F2 = true;
        chatActivityEnterView.K1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
        if (recordCircle2 != null) {
            recordCircle2.H = 0.5f;
            recordCircle2.I = false;
        }
        wg wgVar2 = chatActivityEnterView.Y0;
        if (wgVar2 != null) {
            wgVar2.a = false;
            wgVar2.d = 0L;
            wgVar2.e = 0L;
            wgVar2.h = 0L;
            wgVar2.n = 0L;
            wgVar2.b = false;
        }
    }
}
