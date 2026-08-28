package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oj0 extends f2.d1 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ uj0 e;

    public oj0(uj0 uj0Var) {
        this.e = uj0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new q60(aVar, 8));
        duration.addListener(new org.telegram.ui.t0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        uj0 uj0Var = this.e;
        of.g0 g0Var = uj0Var.S;
        boolean z10 = g0Var.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i11 = 0;
            final int i12 = 0;
            this.c = c(uj0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.mj0
                public final /* synthetic */ oj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i11) {
                        case 0:
                            uj0 uj0Var2 = this.b.e;
                            Paint paint = uj0Var2.h;
                            float floatValue = f10.floatValue();
                            uj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            uj0Var2.invalidate();
                            break;
                        default:
                            uj0 uj0Var3 = this.b.e;
                            Paint paint2 = uj0Var3.n;
                            float floatValue2 = f10.floatValue();
                            uj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            uj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.nj0
                public final /* synthetic */ oj0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.c = null;
                            break;
                        default:
                            this.b.d = null;
                            break;
                    }
                }
            });
            this.a = z10;
        }
        boolean z11 = g0Var.N0() != uj0Var.T.h() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i13 = 1;
            final int i14 = 1;
            this.d = c(uj0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.mj0
                public final /* synthetic */ oj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i13) {
                        case 0:
                            uj0 uj0Var2 = this.b.e;
                            Paint paint = uj0Var2.h;
                            float floatValue = f10.floatValue();
                            uj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            uj0Var2.invalidate();
                            break;
                        default:
                            uj0 uj0Var3 = this.b.e;
                            Paint paint2 = uj0Var3.n;
                            float floatValue2 = f10.floatValue();
                            uj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            uj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.nj0
                public final /* synthetic */ oj0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.b.c = null;
                            break;
                        default:
                            this.b.d = null;
                            break;
                    }
                }
            });
            this.b = z11;
        }
    }
}
