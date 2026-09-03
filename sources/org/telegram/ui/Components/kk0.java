package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kk0 extends f2.a1 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ qk0 e;

    public kk0(qk0 qk0Var) {
        this.e = qk0Var;
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
        qk0 qk0Var = this.e;
        org.telegram.ui.cr crVar = qk0Var.T;
        boolean z4 = crVar.L0() != 0;
        if (z4 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(qk0Var.r, z4 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.ik0
                public final /* synthetic */ kk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i12) {
                        case 0:
                            qk0 qk0Var2 = this.b.e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f10.floatValue();
                            qk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            break;
                        default:
                            qk0 qk0Var3 = this.b.e;
                            Paint paint2 = qk0Var3.n;
                            float floatValue2 = f10.floatValue();
                            qk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.jk0
                public final /* synthetic */ kk0 b;

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
        boolean z10 = crVar.N0() != qk0Var.U.h() - 1;
        if (z10 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(qk0Var.s, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.ik0
                public final /* synthetic */ kk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i14) {
                        case 0:
                            qk0 qk0Var2 = this.b.e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f10.floatValue();
                            qk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            break;
                        default:
                            qk0 qk0Var3 = this.b.e;
                            Paint paint2 = qk0Var3.n;
                            float floatValue2 = f10.floatValue();
                            qk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.jk0
                public final /* synthetic */ kk0 b;

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
