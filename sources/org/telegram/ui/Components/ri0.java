package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ri0 extends v4.u0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ xi0 e;

    public ri0(xi0 xi0Var) {
        this.e = xi0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new h60(aVar, 9));
        duration.addListener(new s60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        xi0 xi0Var = this.e;
        jg.i0 i0Var = xi0Var.a0;
        boolean z10 = i0Var.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i11 = 0;
            final int i12 = 0;
            this.c = c(xi0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.pi0
                public final /* synthetic */ ri0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i11) {
                        case 0:
                            xi0 xi0Var2 = this.b.e;
                            Paint paint = xi0Var2.h;
                            float floatValue = f10.floatValue();
                            xi0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            xi0Var2.invalidate();
                            break;
                        default:
                            xi0 xi0Var3 = this.b.e;
                            Paint paint2 = xi0Var3.n;
                            float floatValue2 = f10.floatValue();
                            xi0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            xi0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.qi0
                public final /* synthetic */ ri0 b;

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
        boolean z11 = i0Var.N0() != xi0Var.b0.b() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i13 = 1;
            final int i14 = 1;
            this.d = c(xi0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.pi0
                public final /* synthetic */ ri0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i13) {
                        case 0:
                            xi0 xi0Var2 = this.b.e;
                            Paint paint = xi0Var2.h;
                            float floatValue = f10.floatValue();
                            xi0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            xi0Var2.invalidate();
                            break;
                        default:
                            xi0 xi0Var3 = this.b.e;
                            Paint paint2 = xi0Var3.n;
                            float floatValue2 = f10.floatValue();
                            xi0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            xi0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.qi0
                public final /* synthetic */ ri0 b;

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
