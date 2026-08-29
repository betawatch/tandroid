package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zj0 extends f2.a1 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ fk0 e;

    public zj0(fk0 fk0Var) {
        this.e = fk0Var;
    }

    public static ValueAnimator c(float f9, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f10).setDuration((long) (Math.abs(f10 - f9) * 150.0f));
        duration.addUpdateListener(new d70(aVar, 8));
        duration.addListener(new org.telegram.ui.u0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fk0 fk0Var = this.e;
        org.telegram.ui.vq vqVar = fk0Var.S;
        boolean z10 = vqVar.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(fk0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.xj0
                public final /* synthetic */ zj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f9 = (Float) obj;
                    switch (i12) {
                        case 0:
                            fk0 fk0Var2 = this.b.e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f9.floatValue();
                            fk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            break;
                        default:
                            fk0 fk0Var3 = this.b.e;
                            Paint paint2 = fk0Var3.n;
                            float floatValue2 = f9.floatValue();
                            fk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.yj0
                public final /* synthetic */ zj0 b;

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
        boolean z11 = vqVar.N0() != fk0Var.T.h() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(fk0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.xj0
                public final /* synthetic */ zj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f9 = (Float) obj;
                    switch (i14) {
                        case 0:
                            fk0 fk0Var2 = this.b.e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f9.floatValue();
                            fk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            break;
                        default:
                            fk0 fk0Var3 = this.b.e;
                            Paint paint2 = fk0Var3.n;
                            float floatValue2 = f9.floatValue();
                            fk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.yj0
                public final /* synthetic */ zj0 b;

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
