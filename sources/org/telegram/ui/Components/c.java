package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c {
    public final /* synthetic */ ChatActivityEnterView a;

    public c(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        View view = chatActivityEnterView;
        while (view != null && view.getParent() != chatActivityEnterView.c2) {
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return view;
    }

    public final boolean b(float[] fArr) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        l49 l49Var = chatActivityEnterView.i1;
        boolean z = false;
        if (l49Var != null && chatActivityEnterView.R3 != null && l49Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.i1.getAudioLeft();
            z = true;
            fArr[1] = chatActivityEnterView.i1.getAudioRight();
            fArr[2] = chatActivityEnterView.i1.p0 ? 1.0f : 0.0f;
        }
        return z;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.v3 || chatActivityEnterView.R3 != null || MediaController.w().E();
    }

    public final boolean d() {
        int i = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.v3 || chatActivityEnterView.O2 || chatActivityEnterView.Z2) {
            return false;
        }
        if ((chatActivityEnterView.U2 && chatActivityEnterView.d1) || !chatActivityEnterView.z0 || chatActivityEnterView.l1 || chatActivityEnterView.F3 == null || chatActivityEnterView.F0 == null || MediaController.w().F()) {
            return false;
        }
        un3 un3Var = chatActivityEnterView.j1;
        return (un3Var == null || !un3Var.o()) && !chatActivityEnterView.U1;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.v3 || MediaController.w().F()) {
            return;
        }
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null && ChatActivityEnterView.this.h5) {
            chatActivityEnterView.y4 = true;
        }
        MediaController.w().C0(chatActivityEnterView.P);
        chatActivityEnterView.P3.z0(0);
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
        if (slideTextView != null) {
            slideTextView.setEnabled(false);
        }
    }

    public final void f(Object obj, String str, qac qacVar) {
        if (!(obj instanceof vm3)) {
            qacVar.a(null);
            return;
        }
        int i = ChatActivityEnterView.z7;
        un3 z0 = this.a.z0();
        z0.l();
        long uptimeMillis = SystemClock.uptimeMillis();
        z0.H.a((vm3) obj, str, new d12(z0, uptimeMillis, qacVar));
    }

    public final void g(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ela elaVar = chatActivityEnterView.c2;
        RectF rectF = chatActivityEnterView.H4;
        if (chatActivityEnterView.E2 != null) {
            boolean z = true;
            if (Float.isNaN(f) || rectF.isEmpty() || elaVar == null) {
                f3 = 0.0f;
                f4 = 1.0f;
                f5 = 1.0f;
            } else {
                chatActivityEnterView.E2.getLocationInWindow(new int[2]);
                elaVar.getLocationInWindow(new int[2]);
                f3 = Math.min(0.0f, f - (rectF.centerY() + (((r6[1] - r2[1]) - chatActivityEnterView.E2.getTranslationY()) + chatActivityEnterView.R5)));
                float i2 = Utilities.i(f2, 1.0f, 0.0f);
                if (f3 > -1.0f) {
                    f3 = 0.0f;
                    f4 = 1.0f;
                    f5 = 1.0f;
                } else if (i2 < 0.42f) {
                    float f6 = i2 / 0.42f;
                    float f7 = 1.0f - f6;
                    f4 = 1.0f - (f6 * 0.25f);
                    f5 = f7;
                    f3 = 0.0f;
                } else {
                    float f8 = (i2 - 0.42f) / 0.58000004f;
                    float f9 = 1.0f - f8;
                    float v = (aq1.v(f9, f9, f9, 1.0f) * 0.25f) + 0.75f;
                    f5 = Math.min(1.0f, f8 * 1.4f);
                    f4 = v;
                }
                chatActivityEnterView.E2.setPivotX(rectF.centerX());
                chatActivityEnterView.E2.setPivotY(rectF.centerY());
            }
            if (f5 >= 1.0f && (!chatActivityEnterView.V5 || !Float.isNaN(f))) {
                z = false;
            }
            chatActivityEnterView.V5 = z;
            if (Math.abs(f3 - chatActivityEnterView.S5) >= 0.5f || (f3 == 0.0f && chatActivityEnterView.S5 != 0.0f)) {
                chatActivityEnterView.S5 = f3;
                chatActivityEnterView.E2.setTranslationY(chatActivityEnterView.R5 + f3 + chatActivityEnterView.t7);
            }
            if (Math.abs(f4 - chatActivityEnterView.T5) > 0.001f || Math.abs(f5 - chatActivityEnterView.U5) > 0.001f) {
                chatActivityEnterView.T5 = f4;
                chatActivityEnterView.U5 = f5;
                chatActivityEnterView.E2.setScaleX(f4);
                chatActivityEnterView.E2.setScaleY(f4);
                chatActivityEnterView.E2.setAlpha(f5);
            }
        }
    }
}
