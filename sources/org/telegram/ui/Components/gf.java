package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gf {
    public final /* synthetic */ ChatActivityEnterView a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        View view = chatActivityEnterView;
        while (view != null && view.getParent() != chatActivityEnterView.U1) {
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return view;
    }

    public final boolean b(float[] fArr) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        oi0 oi0Var = chatActivityEnterView.i1;
        boolean z10 = false;
        if (oi0Var != null && chatActivityEnterView.J3 != null && oi0Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.i1.getAudioLeft();
            z10 = true;
            fArr[1] = chatActivityEnterView.i1.getAudioRight();
            fArr[2] = chatActivityEnterView.i1.p0 ? 1.0f : 0.0f;
        }
        return z10;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.n3 || chatActivityEnterView.J3 != null || MediaController.B().J();
    }

    public final boolean d() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.n3 || chatActivityEnterView.G2 || chatActivityEnterView.R2) {
            return false;
        }
        if ((chatActivityEnterView.M2 && chatActivityEnterView.d1) || !chatActivityEnterView.z0 || chatActivityEnterView.x3 == null || chatActivityEnterView.F0 == null || MediaController.B().K()) {
            return false;
        }
        ai.m0 m0Var = chatActivityEnterView.j1;
        return (m0Var == null || m0Var.r == 0) && !chatActivityEnterView.M1;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.n3 || MediaController.B().K()) {
            return;
        }
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.v2;
        if (recordCircle != null && ChatActivityEnterView.this.a5) {
            chatActivityEnterView.r4 = true;
        }
        MediaController.B().D0(chatActivityEnterView.P);
        chatActivityEnterView.H3.a1(0);
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
        if (slideTextView != null) {
            slideTextView.setEnabled(false);
        }
    }

    public final void f(Object obj, String str, org.telegram.messenger.z10 z10Var) {
        if (!(obj instanceof ai.h)) {
            z10Var.a(null);
            return;
        }
        int i7 = ChatActivityEnterView.N6;
        ai.m0 o02 = this.a.o0();
        o02.g();
        long uptimeMillis = SystemClock.uptimeMillis();
        o02.H.a((ai.h) obj, str, new ai.c0(uptimeMillis, z10Var, 0));
    }

    public final void g(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        ChatActivityEnterView chatActivityEnterView = this.a;
        st0 st0Var = chatActivityEnterView.U1;
        RectF rectF = chatActivityEnterView.A4;
        if (chatActivityEnterView.w2 == null) {
            return;
        }
        boolean z10 = true;
        if (Float.isNaN(f10) || rectF.isEmpty() || st0Var == null) {
            f12 = 0.0f;
            f13 = 1.0f;
            f14 = 1.0f;
        } else {
            chatActivityEnterView.w2.getLocationInWindow(new int[2]);
            st0Var.getLocationInWindow(new int[2]);
            f12 = Math.min(0.0f, f10 - (rectF.centerY() + (((r7[1] - r3[1]) - chatActivityEnterView.w2.getTranslationY()) + chatActivityEnterView.K5)));
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
                float x10 = (org.telegram.ui.Cells.y0.x(f18, f18, f18, 1.0f) * 0.25f) + 0.75f;
                f14 = Math.min(1.0f, f17 * 1.4f);
                f13 = x10;
            }
            chatActivityEnterView.w2.setPivotX(rectF.centerX());
            chatActivityEnterView.w2.setPivotY(rectF.centerY());
        }
        if (f14 >= 1.0f && (!chatActivityEnterView.O5 || !Float.isNaN(f10))) {
            z10 = false;
        }
        chatActivityEnterView.O5 = z10;
        if (Math.abs(f12 - chatActivityEnterView.L5) >= 0.5f || (f12 == 0.0f && chatActivityEnterView.L5 != 0.0f)) {
            chatActivityEnterView.L5 = f12;
            chatActivityEnterView.w2.setTranslationY(chatActivityEnterView.K5 + f12);
        }
        if (Math.abs(f13 - chatActivityEnterView.M5) > 0.001f || Math.abs(f14 - chatActivityEnterView.N5) > 0.001f) {
            chatActivityEnterView.M5 = f13;
            chatActivityEnterView.N5 = f14;
            chatActivityEnterView.w2.setScaleX(f13);
            chatActivityEnterView.w2.setScaleY(f13);
            chatActivityEnterView.w2.setAlpha(f14);
        }
    }
}
