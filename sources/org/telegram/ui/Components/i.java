package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public i(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        if (r10 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r2 = r0.getContext();
        r10 = org.telegram.ui.Dictation.DictationLid.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
    
        if (org.telegram.ui.Dictation.DictationAsr.x() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0149, code lost:
    
        org.telegram.ui.Dictation.DictationLid.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        org.telegram.ui.Dictation.DictationAsr.t(r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0138, code lost:
    
        if (jo3.b() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k47 threadMessage;
        in3 V;
        int i;
        ChatActivityEnterView chatActivityEnterView = this.a;
        a aVar = chatActivityEnterView.a1;
        Activity activity = chatActivityEnterView.E3;
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var == null || activity == null) {
            return;
        }
        uz1Var.r();
        chatActivityEnterView.y4 = true;
        chatActivityEnterView.x4 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.a2.setTranslationY(0.0f);
        }
        chatActivityEnterView.S3 = null;
        chatActivityEnterView.R3 = null;
        if (chatActivityEnterView.d1) {
            boolean z = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
            if (z) {
                if (z2) {
                    chatActivityEnterView.P3.F1(0, 0, 0, 0L, 0L, true);
                    if (chatActivityEnterView.v3) {
                        return;
                    }
                    chatActivityEnterView.v3 = true;
                    chatActivityEnterView.w2(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                    if (recordCircle != null) {
                        recordCircle.I = 0.5f;
                        recordCircle.J = false;
                    }
                    zz1 zz1Var = chatActivityEnterView.Z0;
                    if (zz1Var != null) {
                        zz1Var.a = false;
                        zz1Var.d = 0L;
                        zz1Var.e = 0L;
                        zz1Var.h = 0L;
                        zz1Var.n = 0L;
                        zz1Var.b = false;
                        return;
                    }
                    return;
                }
            } else if (!z2) {
                i = 2;
                String[] strArr = new String[i];
                if (!z) {
                    strArr[0] = "android.permission.CAMERA";
                } else if (z2) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                } else {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                }
                activity.requestPermissions(strArr, nm7.f2);
                return;
            }
            i = 1;
            String[] strArr2 = new String[i];
            if (!z) {
            }
            activity.requestPermissions(strArr2, nm7.f2);
            return;
        }
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return;
        }
        if (chatActivityEnterView.l1) {
            chatActivityEnterView.m0(false, false);
            chatActivityEnterView.t3 = -1.0f;
            chatActivityEnterView.v3 = true;
            chatActivityEnterView.w2(0, true);
            chatActivityEnterView.i0();
            ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
            if (recordCircle2 != null) {
                recordCircle2.J = true;
            }
            wz1 wz1Var = chatActivityEnterView.b2;
            if (wz1Var != null) {
                wz1Var.e = false;
            }
            aVar.getParent().requestDisallowInterceptTouchEvent(true);
            chatActivityEnterView.z0().I(true);
            return;
        }
        chatActivityEnterView.P3.z0(1);
        if (DictationAsr.E() && (V = DictationAsr.V(bo3.c(chatActivityEnterView.getContext(), chatActivityEnterView.G3))) != null) {
            gn3 gn3Var = (gn3) V.b;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences d1 = oc7.d1();
            StringBuilder sb = new StringBuilder("tinyasr_checked_");
            sb.append(gn3Var.a);
            boolean z3 = currentTimeMillis - d1.getLong(sb.toString(), 0L) > 86400000;
            if (DictationAsr.y(gn3Var)) {
                if (!gn3Var.i) {
                    gn3Var.i = true;
                    DictationAsr.d.execute(new cn3(gn3Var, (byte) 0));
                }
            }
        }
        chatActivityEnterView.t3 = -1.0f;
        uz1 uz1Var2 = chatActivityEnterView.P3;
        TL_stories.StoryItem C0 = uz1Var2 != null ? uz1Var2.C0() : null;
        MediaController w = MediaController.w();
        int i2 = chatActivityEnterView.R;
        long j = chatActivityEnterView.G3;
        k47 k47Var = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        int i3 = chatActivityEnterView.w3;
        yv1 yv1Var = chatActivityEnterView.F3;
        w.w0(i2, j, k47Var, threadMessage, C0, i3, true, yv1Var != null ? yv1Var.X6() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        chatActivityEnterView.v3 = true;
        chatActivityEnterView.w2(0, true);
        zz1 zz1Var2 = chatActivityEnterView.Z0;
        if (zz1Var2 != null) {
            zz1Var2.a(0L);
        }
        wz1 wz1Var2 = chatActivityEnterView.b2;
        if (wz1Var2 != null) {
            wz1Var2.e = false;
        }
        aVar.getParent().requestDisallowInterceptTouchEvent(true);
        ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
        if (recordCircle3 != null) {
            recordCircle3.I = 1.0f;
            recordCircle3.J = true;
        }
    }
}
