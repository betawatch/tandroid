package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c {
    public final /* synthetic */ ChatActivityEnterView a;

    public c(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        View view = chatActivityEnterView;
        while (view != null && view.getParent() != chatActivityEnterView.b2) {
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return view;
    }

    public final boolean b(float[] fArr) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        x59 x59Var = chatActivityEnterView.i1;
        boolean z = false;
        if (x59Var != null && chatActivityEnterView.Q3 != null && x59Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.i1.getAudioLeft();
            z = true;
            fArr[1] = chatActivityEnterView.i1.getAudioRight();
            fArr[2] = chatActivityEnterView.i1.p0 ? 1.0f : 0.0f;
        }
        return z;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.u3 || chatActivityEnterView.Q3 != null || MediaController.z().I();
    }

    public final boolean d() {
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.u3 || chatActivityEnterView.N2 || chatActivityEnterView.Y2) {
            return false;
        }
        if ((chatActivityEnterView.T2 && chatActivityEnterView.d1) || !chatActivityEnterView.z0 || chatActivityEnterView.l1 || chatActivityEnterView.E3 == null || chatActivityEnterView.F0 == null || MediaController.z().J()) {
            return false;
        }
        bn3 bn3Var = chatActivityEnterView.j1;
        return (bn3Var == null || !bn3Var.q()) && !chatActivityEnterView.T1;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.u3 || MediaController.z().J()) {
            return;
        }
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
        if (recordCircle != null && ChatActivityEnterView.this.j5) {
            chatActivityEnterView.x4 = true;
        }
        MediaController.z().H0(chatActivityEnterView.P);
        chatActivityEnterView.O3.z0(0);
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
        if (slideTextView != null) {
            slideTextView.setEnabled(false);
        }
    }

    public final void f(Object obj, String str, pcc pccVar) {
        if (!(obj instanceof cm3)) {
            pccVar.a(null);
            return;
        }
        int i = ChatActivityEnterView.X7;
        bn3 D0 = this.a.D0();
        D0.n();
        long uptimeMillis = SystemClock.uptimeMillis();
        D0.H.a((cm3) obj, str, new i02(D0, uptimeMillis, pccVar));
    }

    public final void g(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        wma wmaVar = chatActivityEnterView.b2;
        RectF rectF = chatActivityEnterView.G4;
        if (chatActivityEnterView.D2 != null) {
            boolean z = true;
            if (Float.isNaN(f) || rectF.isEmpty() || wmaVar == null) {
                f3 = 0.0f;
                f4 = 1.0f;
                f5 = 1.0f;
            } else {
                chatActivityEnterView.D2.getLocationInWindow(new int[2]);
                wmaVar.getLocationInWindow(new int[2]);
                f3 = Math.min(0.0f, f - (rectF.centerY() + (((r6[1] - r2[1]) - chatActivityEnterView.D2.getTranslationY()) + chatActivityEnterView.b6)));
                float i2 = Utilities.i(f2, 1.0f, 0.0f);
                if (f3 > -1.0f) {
                    f3 = 0.0f;
                } else if (f3 > (-hl.L(90.0f))) {
                    f3 *= (3.0f - (i2 * 2.0f)) * i2 * i2;
                } else {
                    if (i2 < 0.42f) {
                        float f6 = i2 / 0.42f;
                        float f7 = 1.0f - f6;
                        f4 = 1.0f - (f6 * 0.25f);
                        f5 = f7;
                        f3 = 0.0f;
                    } else {
                        float f8 = (i2 - 0.42f) / 0.58000004f;
                        float f9 = 1.0f - f8;
                        float v = (bp1.v(f9, f9, f9, 1.0f) * 0.25f) + 0.75f;
                        f5 = Math.min(1.0f, f8 * 1.4f);
                        f4 = v;
                    }
                    chatActivityEnterView.D2.setPivotX(rectF.centerX());
                    chatActivityEnterView.D2.setPivotY(rectF.centerY());
                }
                f4 = 1.0f;
                f5 = 1.0f;
                chatActivityEnterView.D2.setPivotX(rectF.centerX());
                chatActivityEnterView.D2.setPivotY(rectF.centerY());
            }
            if (Float.isNaN(f)) {
                chatActivityEnterView.d6 = 1.0f;
            }
            if (f5 >= 1.0f && (!chatActivityEnterView.g6 || !Float.isNaN(f))) {
                z = false;
            }
            chatActivityEnterView.g6 = z;
            if (Math.abs(f3 - chatActivityEnterView.c6) >= 0.5f || (f3 == 0.0f && chatActivityEnterView.c6 != 0.0f)) {
                chatActivityEnterView.c6 = f3;
                chatActivityEnterView.D2.setTranslationY(chatActivityEnterView.b6 + f3 + chatActivityEnterView.Q7);
            }
            if (Math.abs(f4 - chatActivityEnterView.e6) > 0.001f || Math.abs(f5 - chatActivityEnterView.f6) > 0.001f) {
                chatActivityEnterView.e6 = f4;
                chatActivityEnterView.f6 = f5;
                chatActivityEnterView.D2.setScaleX(f4);
                chatActivityEnterView.D2.setScaleY(f4);
                chatActivityEnterView.D2.setAlpha(f5 * chatActivityEnterView.d6);
            }
        }
    }
}
