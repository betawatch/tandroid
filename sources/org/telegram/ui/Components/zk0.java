package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zk0 extends s4.u0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ fl0 e;

    public zk0(fl0 fl0Var) {
        this.e = fl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration((long) (Math.abs(f10 - f7) * 150.0f));
        duration.addUpdateListener(new e80(aVar, 9));
        duration.addListener(new org.telegram.ui.q0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fl0 fl0Var = this.e;
        ig.j0 j0Var = fl0Var.W;
        boolean z10 = j0Var.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(fl0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.xk0
                public final /* synthetic */ zk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i12) {
                        case 0:
                            fl0 fl0Var2 = this.b.e;
                            Paint paint = fl0Var2.h;
                            float floatValue = f7.floatValue();
                            fl0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fl0Var2.invalidate();
                            break;
                        default:
                            fl0 fl0Var3 = this.b.e;
                            Paint paint2 = fl0Var3.n;
                            float floatValue2 = f7.floatValue();
                            fl0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fl0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.yk0
                public final /* synthetic */ zk0 b;

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
        boolean z11 = j0Var.N0() != fl0Var.a0.h() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(fl0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.xk0
                public final /* synthetic */ zk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i14) {
                        case 0:
                            fl0 fl0Var2 = this.b.e;
                            Paint paint = fl0Var2.h;
                            float floatValue = f7.floatValue();
                            fl0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fl0Var2.invalidate();
                            break;
                        default:
                            fl0 fl0Var3 = this.b.e;
                            Paint paint2 = fl0Var3.n;
                            float floatValue2 = f7.floatValue();
                            fl0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fl0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.yk0
                public final /* synthetic */ zk0 b;

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
