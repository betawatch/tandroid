package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fi0 extends u4.t0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ li0 e;

    public fi0(li0 li0Var) {
        this.e = li0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new y50(aVar, 8));
        duration.addListener(new a60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        li0 li0Var = this.e;
        kg.f0 f0Var = li0Var.a0;
        boolean z10 = f0Var.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i11 = 0;
            final int i12 = 0;
            this.c = c(li0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.di0
                public final /* synthetic */ fi0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i11) {
                        case 0:
                            li0 li0Var2 = this.b.e;
                            Paint paint = li0Var2.h;
                            float floatValue = f10.floatValue();
                            li0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            li0Var2.invalidate();
                            break;
                        default:
                            li0 li0Var3 = this.b.e;
                            Paint paint2 = li0Var3.n;
                            float floatValue2 = f10.floatValue();
                            li0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            li0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.ei0
                public final /* synthetic */ fi0 b;

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
        boolean z11 = f0Var.N0() != li0Var.b0.b() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i13 = 1;
            final int i14 = 1;
            this.d = c(li0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.di0
                public final /* synthetic */ fi0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i13) {
                        case 0:
                            li0 li0Var2 = this.b.e;
                            Paint paint = li0Var2.h;
                            float floatValue = f10.floatValue();
                            li0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            li0Var2.invalidate();
                            break;
                        default:
                            li0 li0Var3 = this.b.e;
                            Paint paint2 = li0Var3.n;
                            float floatValue2 = f10.floatValue();
                            li0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            li0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.ei0
                public final /* synthetic */ fi0 b;

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
