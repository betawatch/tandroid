package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class di0 extends v4.s0 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ ji0 e;

    public di0(ji0 ji0Var) {
        this.e = ji0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new d60(aVar, 7));
        duration.addListener(new f60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ji0 ji0Var = this.e;
        jg.i0 i0Var = ji0Var.W;
        boolean z9 = i0Var.L0() != 0;
        if (z9 != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i11 = 0;
            final int i12 = 0;
            this.c = c(ji0Var.r, z9 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.bi0
                public final /* synthetic */ di0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i11) {
                        case 0:
                            ji0 ji0Var2 = this.b.e;
                            Paint paint = ji0Var2.h;
                            float floatValue = f10.floatValue();
                            ji0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ji0Var2.invalidate();
                            break;
                        default:
                            ji0 ji0Var3 = this.b.e;
                            Paint paint2 = ji0Var3.n;
                            float floatValue2 = f10.floatValue();
                            ji0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ji0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.ci0
                public final /* synthetic */ di0 b;

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
        boolean z10 = i0Var.N0() != ji0Var.a0.b() - 1;
        if (z10 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i13 = 1;
            final int i14 = 1;
            this.d = c(ji0Var.s, z10 ? 1.0f : 0.0f, new q0.a(this) { // from class: org.telegram.ui.Components.bi0
                public final /* synthetic */ di0 b;

                {
                    this.b = this;
                }

                @Override // q0.a
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i13) {
                        case 0:
                            ji0 ji0Var2 = this.b.e;
                            Paint paint = ji0Var2.h;
                            float floatValue = f10.floatValue();
                            ji0Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ji0Var2.invalidate();
                            break;
                        default:
                            ji0 ji0Var3 = this.b.e;
                            Paint paint2 = ji0Var3.n;
                            float floatValue2 = f10.floatValue();
                            ji0Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ji0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: org.telegram.ui.Components.ci0
                public final /* synthetic */ di0 b;

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
