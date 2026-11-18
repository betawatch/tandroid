package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pf {
    public final /* synthetic */ ChatActivityEnterView a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        View view = chatActivityEnterView;
        while (view != null && view.getParent() != chatActivityEnterView.a2) {
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return view;
    }

    public final boolean b(float[] fArr) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        xi0 xi0Var = chatActivityEnterView.i1;
        boolean z10 = false;
        if (xi0Var != null && chatActivityEnterView.P3 != null && xi0Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.i1.getAudioLeft();
            z10 = true;
            fArr[1] = chatActivityEnterView.i1.getAudioRight();
            fArr[2] = chatActivityEnterView.i1.p0 ? 1.0f : 0.0f;
        }
        return z10;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.t3 || chatActivityEnterView.P3 != null || MediaController.B().J();
    }

    public final boolean d() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.t3 || chatActivityEnterView.M2 || chatActivityEnterView.X2) {
            return false;
        }
        if ((chatActivityEnterView.S2 && chatActivityEnterView.d1) || !chatActivityEnterView.z0 || chatActivityEnterView.l1 || chatActivityEnterView.D3 == null || chatActivityEnterView.F0 == null || MediaController.B().K()) {
            return false;
        }
        ai.n0 n0Var = chatActivityEnterView.j1;
        return (n0Var == null || !n0Var.m()) && !chatActivityEnterView.S1;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.t3 || MediaController.B().K()) {
            return;
        }
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
        if (recordCircle != null && ChatActivityEnterView.this.g5) {
            chatActivityEnterView.x4 = true;
        }
        MediaController.B().D0(chatActivityEnterView.P);
        chatActivityEnterView.N3.a1(0);
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
        if (slideTextView != null) {
            slideTextView.setEnabled(false);
        }
    }

    public final void f(Object obj, String str, org.telegram.messenger.x10 x10Var) {
        if (!(obj instanceof ai.g)) {
            x10Var.a(null);
            return;
        }
        int i7 = ChatActivityEnterView.n7;
        ai.n0 w02 = this.a.w0();
        w02.g();
        long uptimeMillis = SystemClock.uptimeMillis();
        w02.H.a((ai.g) obj, str, new ai.d0(w02, uptimeMillis, x10Var));
    }

    public final void g(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        ChatActivityEnterView chatActivityEnterView = this.a;
        au0 au0Var = chatActivityEnterView.a2;
        RectF rectF = chatActivityEnterView.G4;
        if (chatActivityEnterView.C2 == null) {
            return;
        }
        boolean z10 = true;
        if (Float.isNaN(f10) || rectF.isEmpty() || au0Var == null) {
            f12 = 0.0f;
            f13 = 1.0f;
            f14 = 1.0f;
        } else {
            chatActivityEnterView.C2.getLocationInWindow(new int[2]);
            au0Var.getLocationInWindow(new int[2]);
            f12 = Math.min(0.0f, f10 - (rectF.centerY() + (((r7[1] - r3[1]) - chatActivityEnterView.C2.getTranslationY()) + chatActivityEnterView.Q5)));
            float i7 = Utilities.i(f11, 1.0f, 0.0f);
            if (f12 > -1.0f) {
                f12 = 0.0f;
                f13 = 1.0f;
                f14 = 1.0f;
            } else if (i7 < 0.42f) {
                float f15 = i7 / 0.42f;
                float f16 = 1.0f - f15;
                f13 = 1.0f - (f15 * 0.25f);
                f14 = f16;
                f12 = 0.0f;
            } else {
                float f17 = (i7 - 0.42f) / 0.58000004f;
                float f18 = 1.0f - f17;
                float z11 = (org.telegram.ui.Cells.c0.z(f18, f18, f18, 1.0f) * 0.25f) + 0.75f;
                f14 = Math.min(1.0f, f17 * 1.4f);
                f13 = z11;
            }
            chatActivityEnterView.C2.setPivotX(rectF.centerX());
            chatActivityEnterView.C2.setPivotY(rectF.centerY());
        }
        if (f14 >= 1.0f && (!chatActivityEnterView.U5 || !Float.isNaN(f10))) {
            z10 = false;
        }
        chatActivityEnterView.U5 = z10;
        if (Math.abs(f12 - chatActivityEnterView.R5) >= 0.5f || (f12 == 0.0f && chatActivityEnterView.R5 != 0.0f)) {
            chatActivityEnterView.R5 = f12;
            chatActivityEnterView.C2.setTranslationY(chatActivityEnterView.Q5 + f12);
        }
        if (Math.abs(f13 - chatActivityEnterView.S5) > 0.001f || Math.abs(f14 - chatActivityEnterView.T5) > 0.001f) {
            chatActivityEnterView.S5 = f13;
            chatActivityEnterView.T5 = f14;
            chatActivityEnterView.C2.setScaleX(f13);
            chatActivityEnterView.C2.setScaleY(f13);
            chatActivityEnterView.C2.setAlpha(f14);
        }
    }
}
