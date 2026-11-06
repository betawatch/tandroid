package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ci0 extends v4.s0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ ii0 e;

    public ci0(ii0 ii0Var) {
        this.e = ii0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new c60(aVar, 7));
        duration.addListener(new e60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ii0 ii0Var = this.e;
        jg.i0 i0Var = ii0Var.W;
        boolean z9 = i0Var.L0() != 0;
        if (z9 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i11 = 0;
            final int i12 = 0;
            this.c = c(ii0Var.r, z9 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.ai0
                public final /* synthetic */ ci0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i11) {
                        case 0:
                            ii0 ii0Var2 = this.b.e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f10.floatValue();
                            ii0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            break;
                        default:
                            ii0 ii0Var3 = this.b.e;
                            Paint paint2 = ii0Var3.n;
                            float floatValue2 = f10.floatValue();
                            ii0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.bi0
                public final /* synthetic */ ci0 b;

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
            this.a = z9;
        }
        boolean z10 = i0Var.N0() != ii0Var.a0.b() - 1;
        if (z10 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i13 = 1;
            final int i14 = 1;
            this.d = c(ii0Var.s, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.ai0
                public final /* synthetic */ ci0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i13) {
                        case 0:
                            ii0 ii0Var2 = this.b.e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f10.floatValue();
                            ii0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            break;
                        default:
                            ii0 ii0Var3 = this.b.e;
                            Paint paint2 = ii0Var3.n;
                            float floatValue2 = f10.floatValue();
                            ii0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.bi0
                public final /* synthetic */ ci0 b;

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
            this.b = z10;
        }
    }
}
