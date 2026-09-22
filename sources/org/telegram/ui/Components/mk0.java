package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class mk0 extends s4.s0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ sk0 e;

    public mk0(sk0 sk0Var) {
        this.e = sk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration((long) (Math.abs(f10 - f7) * 150.0f));
        duration.addUpdateListener(new s70(aVar, 8));
        duration.addListener(new org.telegram.ui.q0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sk0 sk0Var = this.e;
        gg.j0 j0Var = sk0Var.W;
        boolean z10 = j0Var.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(sk0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.kk0
                public final /* synthetic */ mk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i12) {
                        case 0:
                            sk0 sk0Var2 = this.b.e;
                            Paint paint = sk0Var2.h;
                            float floatValue = f7.floatValue();
                            sk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            sk0Var2.invalidate();
                            break;
                        default:
                            sk0 sk0Var3 = this.b.e;
                            Paint paint2 = sk0Var3.n;
                            float floatValue2 = f7.floatValue();
                            sk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            sk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.lk0
                public final /* synthetic */ mk0 b;

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
        boolean z11 = j0Var.N0() != sk0Var.a0.h() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(sk0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.kk0
                public final /* synthetic */ mk0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f7 = (Float) obj;
                    switch (i14) {
                        case 0:
                            sk0 sk0Var2 = this.b.e;
                            Paint paint = sk0Var2.h;
                            float floatValue = f7.floatValue();
                            sk0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            sk0Var2.invalidate();
                            break;
                        default:
                            sk0 sk0Var3 = this.b.e;
                            Paint paint2 = sk0Var3.n;
                            float floatValue2 = f7.floatValue();
                            sk0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            sk0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.lk0
                public final /* synthetic */ mk0 b;

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
