package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g implements Runnable {
    public final /* synthetic */ ChatActivityEnterView a;

    public g(ChatActivityEnterView chatActivityEnterView) {
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
    
        if (org.telegram.ui.Dictation.DictationAsr.y() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0149, code lost:
    
        org.telegram.ui.Dictation.DictationLid.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        org.telegram.ui.Dictation.DictationAsr.u(r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0138, code lost:
    
        if (qn3.b() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r47 threadMessage;
        pm3 X;
        int i;
        ChatActivityEnterView chatActivityEnterView = this.a;
        a aVar = chatActivityEnterView.a1;
        Activity activity = chatActivityEnterView.D3;
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var == null || activity == null) {
            return;
        }
        xy1Var.s();
        chatActivityEnterView.x4 = true;
        chatActivityEnterView.w4 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.Z1.setTranslationY(0.0f);
        }
        chatActivityEnterView.R3 = null;
        chatActivityEnterView.Q3 = null;
        if (chatActivityEnterView.d1) {
            boolean z = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
            if (z) {
                if (z2) {
                    chatActivityEnterView.O3.H1(0, 0, 0, 0L, 0L, true);
                    if (chatActivityEnterView.u3) {
                        return;
                    }
                    chatActivityEnterView.u3 = true;
                    chatActivityEnterView.D2(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                    if (recordCircle != null) {
                        recordCircle.I = 0.5f;
                        recordCircle.J = false;
                    }
                    ez1 ez1Var = chatActivityEnterView.Z0;
                    if (ez1Var != null) {
                        ez1Var.a = false;
                        ez1Var.d = 0L;
                        ez1Var.e = 0L;
                        ez1Var.h = 0L;
                        ez1Var.n = 0L;
                        ez1Var.b = false;
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
                activity.requestPermissions(strArr, jn7.f2);
                return;
            }
            i = 1;
            String[] strArr2 = new String[i];
            if (!z) {
            }
            activity.requestPermissions(strArr2, jn7.f2);
            return;
        }
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return;
        }
        if (chatActivityEnterView.l1) {
            chatActivityEnterView.p0(false, false);
            chatActivityEnterView.s3 = -1.0f;
            chatActivityEnterView.u3 = true;
            chatActivityEnterView.D2(0, true);
            chatActivityEnterView.l0();
            ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.C2;
            if (recordCircle2 != null) {
                recordCircle2.J = true;
            }
            zy1 zy1Var = chatActivityEnterView.a2;
            if (zy1Var != null) {
                zy1Var.e = false;
            }
            aVar.getParent().requestDisallowInterceptTouchEvent(true);
            chatActivityEnterView.D0().M(true);
            return;
        }
        chatActivityEnterView.O3.z0(1);
        if (DictationAsr.G() && (X = DictationAsr.X(in3.c(chatActivityEnterView.getContext(), chatActivityEnterView.F3))) != null) {
            nm3 nm3Var = (nm3) X.b;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences e1 = uc7.e1();
            StringBuilder sb = new StringBuilder("tinyasr_checked_");
            sb.append(nm3Var.a);
            boolean z3 = currentTimeMillis - e1.getLong(sb.toString(), 0L) > 86400000;
            if (DictationAsr.z(nm3Var)) {
                if (!nm3Var.i) {
                    nm3Var.i = true;
                    DictationAsr.d.execute(new km3(nm3Var, (byte) 0));
                }
            }
        }
        chatActivityEnterView.s3 = -1.0f;
        xy1 xy1Var2 = chatActivityEnterView.O3;
        TL_stories.StoryItem F0 = xy1Var2 != null ? xy1Var2.F0() : null;
        MediaController z4 = MediaController.z();
        int i2 = chatActivityEnterView.R;
        long j = chatActivityEnterView.F3;
        r47 r47Var = chatActivityEnterView.I3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        int i3 = chatActivityEnterView.v3;
        zu1 zu1Var = chatActivityEnterView.E3;
        z4.B0(i2, j, r47Var, threadMessage, F0, i3, true, zu1Var != null ? zu1Var.X6() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        chatActivityEnterView.u3 = true;
        chatActivityEnterView.D2(0, true);
        ez1 ez1Var2 = chatActivityEnterView.Z0;
        if (ez1Var2 != null) {
            ez1Var2.a(0L);
        }
        zy1 zy1Var2 = chatActivityEnterView.a2;
        if (zy1Var2 != null) {
            zy1Var2.e = false;
        }
        aVar.getParent().requestDisallowInterceptTouchEvent(true);
        ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.C2;
        if (recordCircle3 != null) {
            recordCircle3.I = 1.0f;
            recordCircle3.J = true;
        }
    }
}
