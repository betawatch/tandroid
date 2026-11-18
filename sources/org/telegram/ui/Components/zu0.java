package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zu0 extends bk0 {
    public int c;
    public final /* synthetic */ iv0 d;

    public zu0(iv0 iv0Var) {
        this.d = iv0Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    @Override // v4.i0
    public final int b() {
        iv0 iv0Var = this.d;
        ev0[] ev0VarArr = iv0Var.g3;
        int length = (ev0VarArr == null ? 0 : ev0VarArr.length) + 1;
        if (length != this.c) {
            bi.i3 i3Var = iv0Var.t3;
            if (i3Var != null) {
                i3Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == 0 ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        iv0 iv0Var;
        ev0[] ev0VarArr;
        if (f1Var.f != 1 || (ev0VarArr = (iv0Var = this.d).g3) == null) {
            return;
        }
        int i10 = i7 - 1;
        ev0 ev0Var = ev0VarArr[i10];
        final dv0 dv0Var = (dv0) f1Var.a;
        boolean z10 = iv0Var.u3 == i10;
        dv0Var.getClass();
        if (!TextUtils.isEmpty(ev0Var.d)) {
            dv0Var.setContentDescription(ev0Var.d);
        } else if (TextUtils.isEmpty(ev0Var.a)) {
            dv0Var.setContentDescription(null);
        } else {
            dv0Var.setContentDescription(ev0Var.a);
        }
        ValueAnimator valueAnimator = dv0Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            dv0Var.H = null;
        }
        dv0Var.setImageResource(0);
        dv0Var.a();
        final boolean D1 = dv0Var.I.D1();
        dv0Var.x = false;
        dv0Var.E = 1.0f;
        o5.g(org.telegram.messenger.j10.t0).b(ev0Var.c, new l5() { // from class: org.telegram.ui.Components.bv0
            @Override // org.telegram.ui.Components.l5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                dv0 dv0Var2 = dv0.this;
                dv0Var2.setOnlyLastFrame(z11);
                dv0Var2.g(24, 24, document);
                dv0Var2.d();
            }
        });
        org.telegram.messenger.g0.h3(new ap0(dv0Var, 10), 60L);
        dv0Var.l(z10, false);
        dv0Var.setAlpha(iv0Var.w3);
        dv0Var.setScaleX(iv0Var.w3);
        dv0Var.setScaleY(iv0Var.w3);
        dv0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        dv0 dv0Var;
        iv0 iv0Var = this.d;
        if (i7 == 0) {
            bi.i3 i3Var = new bi.i3(28, iv0Var.getContext(), this);
            iv0Var.t3 = i3Var;
            dv0Var = i3Var;
        } else {
            dv0Var = new dv0(iv0Var, iv0Var.getContext());
        }
        return new kj0(dv0Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        if (f1Var.f == 1) {
            dv0 dv0Var = (dv0) f1Var.a;
            dv0Var.l(this.d.u3 == f1Var.b() - 1, false);
            dv0Var.j();
        }
    }
}
