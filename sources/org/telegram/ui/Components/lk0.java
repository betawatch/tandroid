package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lk0 extends f2.a1 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ rk0 e;

    public lk0(rk0 rk0Var) {
        this.e = rk0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new k70(aVar, 8));
        duration.addListener(new org.telegram.ui.s0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rk0 rk0Var = this.e;
        org.telegram.ui.cr crVar = rk0Var.T;
        boolean z4 = crVar.L0() != 0;
        if (z4 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(rk0Var.r, z4 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.jk0
                public final /* synthetic */ lk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i12) {
                        case 0:
                            rk0 rk0Var2 = this.b.e;
                            Paint paint = rk0Var2.h;
                            float floatValue = f10.floatValue();
                            rk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            rk0Var2.invalidate();
                            break;
                        default:
                            rk0 rk0Var3 = this.b.e;
                            Paint paint2 = rk0Var3.n;
                            float floatValue2 = f10.floatValue();
                            rk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            rk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.kk0
                public final /* synthetic */ lk0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            this.b.c = null;
                            break;
                        default:
                            this.b.d = null;
                            break;
                    }
                }
            });
            this.a = z4;
        }
        boolean z10 = crVar.N0() != rk0Var.U.h() - 1;
        if (z10 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(rk0Var.s, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.jk0
                public final /* synthetic */ lk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i14) {
                        case 0:
                            rk0 rk0Var2 = this.b.e;
                            Paint paint = rk0Var2.h;
                            float floatValue = f10.floatValue();
                            rk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            rk0Var2.invalidate();
                            break;
                        default:
                            rk0 rk0Var3 = this.b.e;
                            Paint paint2 = rk0Var3.n;
                            float floatValue2 = f10.floatValue();
                            rk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            rk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.kk0
                public final /* synthetic */ lk0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.b.c = null;
                            break;
                        default:
                            this.b.d = null;
                            break;
                    }
                }
            });
            this.b = z10;
        }
    }
}
