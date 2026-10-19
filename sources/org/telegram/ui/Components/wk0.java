package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class wk0 extends s4.r0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ cl0 e;

    public wk0(cl0 cl0Var) {
        this.e = cl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration((long) (Math.abs(f10 - f7) * 150.0f));
        duration.addUpdateListener(new b80(aVar, 9));
        duration.addListener(new org.telegram.ui.t0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cl0 cl0Var = this.e;
        hg.i0 i0Var = cl0Var.W;
        boolean z10 = i0Var.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(cl0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.uk0
                public final /* synthetic */ wk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i12) {
                        case 0:
                            cl0 cl0Var2 = this.b.e;
                            Paint paint = cl0Var2.h;
                            float floatValue = f7.floatValue();
                            cl0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            cl0Var2.invalidate();
                            break;
                        default:
                            cl0 cl0Var3 = this.b.e;
                            Paint paint2 = cl0Var3.n;
                            float floatValue2 = f7.floatValue();
                            cl0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            cl0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.vk0
                public final /* synthetic */ wk0 b;

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
            this.a = z10;
        }
        boolean z11 = i0Var.N0() != cl0Var.a0.h() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(cl0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.uk0
                public final /* synthetic */ wk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i14) {
                        case 0:
                            cl0 cl0Var2 = this.b.e;
                            Paint paint = cl0Var2.h;
                            float floatValue = f7.floatValue();
                            cl0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            cl0Var2.invalidate();
                            break;
                        default:
                            cl0 cl0Var3 = this.b.e;
                            Paint paint2 = cl0Var3.n;
                            float floatValue2 = f7.floatValue();
                            cl0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            cl0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.vk0
                public final /* synthetic */ wk0 b;

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
            this.b = z11;
        }
    }
}
