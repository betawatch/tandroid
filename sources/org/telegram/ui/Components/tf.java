package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tf implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.gj threadMessage;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ke keVar = chatActivityEnterView.p4;
        Activity activity = chatActivityEnterView.w3;
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar == null || activity == null) {
            return;
        }
        cgVar.E();
        chatActivityEnterView.r4 = true;
        int i7 = 0;
        chatActivityEnterView.q4 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.S1.setTranslationY(0.0f);
        }
        chatActivityEnterView.K3 = null;
        chatActivityEnterView.J3 = null;
        if (chatActivityEnterView.d1) {
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
                activity.requestPermissions(strArr, org.telegram.messenger.ns.g2);
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                keVar.run();
            } else {
                CameraController.getInstance().initCamera(keVar);
            }
            if (chatActivityEnterView.n3) {
                return;
            }
            chatActivityEnterView.n3 = true;
            chatActivityEnterView.f2(0, true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.v2;
            if (recordCircle != null) {
                recordCircle.I = 0.5f;
                recordCircle.J = false;
            }
            lg lgVar = chatActivityEnterView.Z0;
            if (lgVar != null) {
                lgVar.a = false;
                lgVar.d = 0L;
                lgVar.e = 0L;
                lgVar.h = 0L;
                lgVar.n = 0L;
                lgVar.b = false;
                return;
            }
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return;
        }
        chatActivityEnterView.H3.a1(1);
        if (DictationAsr.B()) {
            if (DictationAsr.x()) {
                Context context = chatActivityEnterView.getContext();
                if (i10 >= 33 && ai.d.c == 0 && !ai.d.d) {
                    org.telegram.messenger.g0.h3(new ai.a(context.getApplicationContext(), i7));
                }
            }
            ArrayList b10 = ai.t0.b(chatActivityEnterView.getContext(), chatActivityEnterView.y3);
            android.support.v4.media.session.a0 P = DictationAsr.P(b10, true);
            if (P != null) {
                ai.s sVar = (ai.s) P.b;
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences e12 = org.telegram.messenger.np.e1();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(sVar.a);
                boolean z12 = currentTimeMillis - e12.getLong(sb2.toString(), 0L) > 86400000;
                boolean w10 = DictationAsr.w(sVar);
                if (w10 && !sVar.g) {
                    sVar.g = true;
                    DictationAsr.d.execute(new ai.p(sVar, i7));
                }
                if ((w10 || ai.i1.b()) && (!w10 || z12)) {
                    DictationAsr.t(sVar);
                }
                Context context2 = chatActivityEnterView.getContext();
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.v()) {
                    DictationLid.d(context2);
                }
            } else {
                Context context3 = chatActivityEnterView.getContext();
                if (DictationLid.e(b10)) {
                    DictationLid.d(context3);
                }
            }
        }
        chatActivityEnterView.l3 = -1.0f;
        cg cgVar2 = chatActivityEnterView.H3;
        TL_stories.StoryItem c12 = cgVar2 != null ? cgVar2.c1() : null;
        MediaController B = MediaController.B();
        int i11 = chatActivityEnterView.R;
        long j3 = chatActivityEnterView.y3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        int i12 = chatActivityEnterView.o3;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        B.x0(i11, j3, gjVar, threadMessage, c12, i12, true, anVar != null ? anVar.Y8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        chatActivityEnterView.n3 = true;
        chatActivityEnterView.f2(0, true);
        lg lgVar2 = chatActivityEnterView.Z0;
        if (lgVar2 != null) {
            lgVar2.a(0L);
        }
        ig igVar = chatActivityEnterView.T1;
        if (igVar != null) {
            igVar.e = false;
        }
        chatActivityEnterView.a1.getParent().requestDisallowInterceptTouchEvent(true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.v2;
        if (recordCircle2 != null) {
            recordCircle2.I = 1.0f;
            recordCircle2.J = true;
        }
    }
}
