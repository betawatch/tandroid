package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pu0 extends oj0 {
    public int c;
    public final /* synthetic */ yu0 d;

    public pu0(yu0 yu0Var) {
        this.d = yu0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // v4.g0
    public final int b() {
        yu0 yu0Var = this.d;
        uu0[] uu0VarArr = yu0Var.f3;
        int length = (uu0VarArr == null ? 0 : uu0VarArr.length) + 1;
        if (length != this.c) {
            bi.ec ecVar = yu0Var.s3;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == 0 ? 0 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        yu0 yu0Var;
        uu0[] uu0VarArr;
        if (d1Var.f != 1 || (uu0VarArr = (yu0Var = this.d).f3) == null) {
            return;
        }
        int i10 = i7 - 1;
        uu0 uu0Var = uu0VarArr[i10];
        final tu0 tu0Var = (tu0) d1Var.a;
        boolean z9 = yu0Var.t3 == i10;
        tu0Var.getClass();
        if (!TextUtils.isEmpty(uu0Var.d)) {
            tu0Var.setContentDescription(uu0Var.d);
        } else if (TextUtils.isEmpty(uu0Var.a)) {
            tu0Var.setContentDescription(null);
        } else {
            tu0Var.setContentDescription(uu0Var.a);
        }
        ValueAnimator valueAnimator = tu0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            tu0Var.G = null;
        }
        tu0Var.setImageResource(0);
        tu0Var.a();
        final boolean D1 = tu0Var.H.D1();
        tu0Var.x = false;
        tu0Var.D = 1.0f;
        i5.g(org.telegram.messenger.p10.s0).b(uu0Var.c, new f5() { // from class: org.telegram.ui.Components.ru0
            @Override // org.telegram.ui.Components.f5
            public final void a(TLRPC.Document document) {
                boolean z10 = !D1;
                tu0 tu0Var2 = tu0.this;
                tu0Var2.setOnlyLastFrame(z10);
                tu0Var2.g(24, 24, document);
                tu0Var2.d();
            }
        });
        org.telegram.messenger.g0.i3(new ir0(tu0Var, 7), 60L);
        tu0Var.l(z9, false);
        tu0Var.setAlpha(yu0Var.v3);
        tu0Var.setScaleX(yu0Var.v3);
        tu0Var.setScaleY(yu0Var.v3);
        tu0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        tu0 tu0Var;
        yu0 yu0Var = this.d;
        if (i7 == 0) {
            bi.ec ecVar = new bi.ec(27, yu0Var.getContext(), this);
            yu0Var.s3 = ecVar;
            tu0Var = ecVar;
        } else {
            tu0Var = new tu0(yu0Var, yu0Var.getContext());
        }
        return new xi0(tu0Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        if (d1Var.f == 1) {
            tu0 tu0Var = (tu0) d1Var.a;
            tu0Var.l(this.d.t3 == d1Var.b() - 1, false);
            tu0Var.j();
        }
    }
}
