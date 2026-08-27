package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qj0 extends f2.b1 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ wj0 e;

    public qj0(wj0 wj0Var) {
        this.e = wj0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new v60(aVar, 8));
        duration.addListener(new org.telegram.ui.u0(1, runnable));
        duration.start();
        return duration;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        wj0 wj0Var = this.e;
        org.telegram.ui.vq vqVar = wj0Var.S;
        boolean z10 = vqVar.L0() != 0;
        if (z10 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.c = c(wj0Var.r, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.oj0
                public final /* synthetic */ qj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i12) {
                        case 0:
                            wj0 wj0Var2 = this.b.e;
                            Paint paint = wj0Var2.h;
                            float floatValue = f10.floatValue();
                            wj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            wj0Var2.invalidate();
                            break;
                        default:
                            wj0 wj0Var3 = this.b.e;
                            Paint paint2 = wj0Var3.n;
                            float floatValue2 = f10.floatValue();
                            wj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            wj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.pj0
                public final /* synthetic */ qj0 b;

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
        boolean z11 = vqVar.N0() != wj0Var.T.h() - 1;
        if (z11 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(wj0Var.s, z11 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.oj0
                public final /* synthetic */ qj0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i14) {
                        case 0:
                            wj0 wj0Var2 = this.b.e;
                            Paint paint = wj0Var2.h;
                            float floatValue = f10.floatValue();
                            wj0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            wj0Var2.invalidate();
                            break;
                        default:
                            wj0 wj0Var3 = this.b.e;
                            Paint paint2 = wj0Var3.n;
                            float floatValue2 = f10.floatValue();
                            wj0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            wj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.pj0
                public final /* synthetic */ qj0 b;

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
