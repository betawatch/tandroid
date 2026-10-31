package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ x10(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.a = i12;
        this.d = callback;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.a) {
            case 0:
                y10 y10Var = (y10) this.d;
                y10Var.L = this.b;
                y10Var.M = this.c;
                y10Var.F.setColorFilter(new PorterDuffColorFilter(y10Var.L, PorterDuff.Mode.MULTIPLY));
                y10Var.E.setColor(y10Var.L);
                y10Var.r.setColor(y10Var.M);
                y10Var.J.d(i0.b.o(y10Var.M, 38));
                break;
            case 1:
                zt0 zt0Var = (zt0) this.d;
                ss0[] ss0VarArr = zt0Var.m0;
                zt0Var.L1.e();
                zt0Var.q1 = false;
                int[] iArr = zt0Var.o1;
                int i11 = this.c;
                int i12 = this.b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < ss0VarArr.length; i13++) {
                    ss0 ss0Var = ss0VarArr[i13];
                    if (ss0Var != null && ss0Var.h != null && (((i10 = ss0Var.E) == 0 || zt0.x0(i10)) && (adapter = ss0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            zt0Var.v1[0].g(false);
                        }
                        ss0VarArr[i13].x.y1(iArr[i12]);
                        ss0VarArr[i13].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.i0.a4(ss0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                        ss0VarArr[i13].n.setVisibility(8);
                    }
                }
                zt0Var.e1();
                break;
            case 2:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.d;
                int i14 = this.b;
                rVar.D0 = i14;
                rVar.E0 = i14;
                int i15 = this.c;
                rVar.F0 = i15;
                rVar.T.setColor(i15);
                if (rVar.S > 0.0f) {
                    rVar.invalidate();
                    break;
                }
                break;
            default:
                xh.m2 m2Var = (xh.m2) this.d;
                m2Var.S = i0.b.f(1.0f, this.b, this.c);
                m2Var.l();
                break;
        }
    }
}
