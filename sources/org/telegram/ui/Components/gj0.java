package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gj0 extends s4.s0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ mj0 e;

    public gj0(mj0 mj0Var) {
        this.e = mj0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration((long) (Math.abs(f10 - f7) * 150.0f));
        duration.addUpdateListener(new r60(aVar, 8));
        duration.addListener(new t60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mj0 mj0Var = this.e;
        org.telegram.ui.br brVar = mj0Var.W;
        boolean z10 = brVar.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(mj0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.ej0
                public final /* synthetic */ gj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i12) {
                        case 0:
                            mj0 mj0Var2 = this.b.e;
                            Paint paint = mj0Var2.h;
                            float floatValue = f7.floatValue();
                            mj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            mj0Var2.invalidate();
                            break;
                        default:
                            mj0 mj0Var3 = this.b.e;
                            Paint paint2 = mj0Var3.n;
                            float floatValue2 = f7.floatValue();
                            mj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            mj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.fj0
                public final /* synthetic */ gj0 b;

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
        boolean z11 = brVar.N0() != mj0Var.a0.b() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(mj0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.ej0
                public final /* synthetic */ gj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i14) {
                        case 0:
                            mj0 mj0Var2 = this.b.e;
                            Paint paint = mj0Var2.h;
                            float floatValue = f7.floatValue();
                            mj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            mj0Var2.invalidate();
                            break;
                        default:
                            mj0 mj0Var3 = this.b.e;
                            Paint paint2 = mj0Var3.n;
                            float floatValue2 = f7.floatValue();
                            mj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            mj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.fj0
                public final /* synthetic */ gj0 b;

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
