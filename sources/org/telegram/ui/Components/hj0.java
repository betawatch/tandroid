package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hj0 extends s4.s0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ nj0 e;

    public hj0(nj0 nj0Var) {
        this.e = nj0Var;
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
        nj0 nj0Var = this.e;
        org.telegram.ui.br brVar = nj0Var.W;
        boolean z10 = brVar.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(nj0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.fj0
                public final /* synthetic */ hj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i12) {
                        case 0:
                            nj0 nj0Var2 = this.b.e;
                            Paint paint = nj0Var2.h;
                            float floatValue = f7.floatValue();
                            nj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            nj0Var2.invalidate();
                            break;
                        default:
                            nj0 nj0Var3 = this.b.e;
                            Paint paint2 = nj0Var3.n;
                            float floatValue2 = f7.floatValue();
                            nj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            nj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.gj0
                public final /* synthetic */ hj0 b;

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
        boolean z11 = brVar.N0() != nj0Var.a0.b() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(nj0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.fj0
                public final /* synthetic */ hj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i14) {
                        case 0:
                            nj0 nj0Var2 = this.b.e;
                            Paint paint = nj0Var2.h;
                            float floatValue = f7.floatValue();
                            nj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            nj0Var2.invalidate();
                            break;
                        default:
                            nj0 nj0Var3 = this.b.e;
                            Paint paint2 = nj0Var3.n;
                            float floatValue2 = f7.floatValue();
                            nj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            nj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.gj0
                public final /* synthetic */ hj0 b;

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
