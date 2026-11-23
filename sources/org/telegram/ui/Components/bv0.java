package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bv0 extends dk0 {
    public int c;
    public final /* synthetic */ kv0 d;

    public bv0(kv0 kv0Var) {
        this.d = kv0Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    @Override // v4.i0
    public final int b() {
        kv0 kv0Var = this.d;
        gv0[] gv0VarArr = kv0Var.g3;
        int length = (gv0VarArr == null ? 0 : gv0VarArr.length) + 1;
        if (length != this.c) {
            bi.o3 o3Var = kv0Var.t3;
            if (o3Var != null) {
                o3Var.requestLayout();
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
        kv0 kv0Var;
        gv0[] gv0VarArr;
        if (f1Var.f != 1 || (gv0VarArr = (kv0Var = this.d).g3) == null) {
            return;
        }
        int i10 = i7 - 1;
        gv0 gv0Var = gv0VarArr[i10];
        final fv0 fv0Var = (fv0) f1Var.a;
        boolean z10 = kv0Var.u3 == i10;
        fv0Var.getClass();
        if (!TextUtils.isEmpty(gv0Var.d)) {
            fv0Var.setContentDescription(gv0Var.d);
        } else if (TextUtils.isEmpty(gv0Var.a)) {
            fv0Var.setContentDescription(null);
        } else {
            fv0Var.setContentDescription(gv0Var.a);
        }
        ValueAnimator valueAnimator = fv0Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            fv0Var.H = null;
        }
        fv0Var.setImageResource(0);
        fv0Var.a();
        final boolean D1 = fv0Var.I.D1();
        fv0Var.x = false;
        fv0Var.E = 1.0f;
        o5.g(org.telegram.messenger.i10.t0).b(gv0Var.c, new l5() { // from class: org.telegram.ui.Components.dv0
            @Override // org.telegram.ui.Components.l5
            public final void a(TLRPC.Document document) {
                boolean z11 = !D1;
                fv0 fv0Var2 = fv0.this;
                fv0Var2.setOnlyLastFrame(z11);
                fv0Var2.g(24, 24, document);
                fv0Var2.d();
            }
        });
        org.telegram.messenger.g0.h3(new bp0(fv0Var, 10), 60L);
        fv0Var.l(z10, false);
        fv0Var.setAlpha(kv0Var.w3);
        fv0Var.setScaleX(kv0Var.w3);
        fv0Var.setScaleY(kv0Var.w3);
        fv0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        fv0 fv0Var;
        kv0 kv0Var = this.d;
        if (i7 == 0) {
            bi.o3 o3Var = new bi.o3(28, kv0Var.getContext(), this);
            kv0Var.t3 = o3Var;
            fv0Var = o3Var;
        } else {
            fv0Var = new fv0(kv0Var, kv0Var.getContext());
        }
        return new mj0(fv0Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        if (f1Var.f == 1) {
            fv0 fv0Var = (fv0) f1Var.a;
            fv0Var.l(this.d.u3 == f1Var.b() - 1, false);
            fv0Var.j();
        }
    }
}
