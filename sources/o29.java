// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o29 extends k69 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ v29 e;

    public o29(v29 v29Var) {
        this.e = v29Var;
    }

    public static ValueAnimator c(float f, float f2, gu2 gu2Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration((long) (Math.abs(f2 - f) * 150.0f));
        byte b = 29;
        duration.addUpdateListener(new fx7(gu2Var, b));
        duration.addListener(new s38(runnable, b));
        duration.start();
        return duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        v29 v29Var = this.e;
        jg2 jg2Var = v29Var.a0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final byte b = 1;
        boolean z = jg2Var.K0() != 0;
        if (z != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = v29Var.r;
            float f2 = z ? 1.0f : 0.0f;
            final Object[] objArr3 = objArr2 == true ? 1 : 0;
            gu2 gu2Var = new gu2(this) { // from class: m29
                public final /* synthetic */ o29 b;

                {
                    this.b = this;
                }

                @Override // gu2
                public final void accept(Object obj) {
                    byte b2 = objArr3;
                    o29 o29Var = this.b;
                    Float f3 = (Float) obj;
                    switch (b2) {
                        case 0:
                            v29 v29Var2 = o29Var.e;
                            Paint paint = v29Var2.h;
                            float floatValue = f3.floatValue();
                            v29Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            v29Var2.invalidate();
                            break;
                        default:
                            v29 v29Var3 = o29Var.e;
                            Paint paint2 = v29Var3.n;
                            float floatValue2 = f3.floatValue();
                            v29Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            v29Var3.invalidate();
                            break;
                    }
                }
            };
            final Object[] objArr4 = objArr == true ? 1 : 0;
            this.c = c(f, f2, gu2Var, new Runnable(this) { // from class: n29
                public final /* synthetic */ o29 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = objArr4;
                    o29 o29Var = this.b;
                    switch (b2) {
                        case 0:
                            o29Var.c = null;
                            break;
                        default:
                            o29Var.d = null;
                            break;
                    }
                }
            });
            this.a = z;
        }
        boolean z2 = jg2Var.M0() != v29Var.b0.b() - 1;
        if (z2 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.d = c(v29Var.s, z2 ? 1.0f : 0.0f, new gu2(this) { // from class: m29
                public final /* synthetic */ o29 b;

                {
                    this.b = this;
                }

                @Override // gu2
                public final void accept(Object obj) {
                    byte b2 = b;
                    o29 o29Var = this.b;
                    Float f3 = (Float) obj;
                    switch (b2) {
                        case 0:
                            v29 v29Var2 = o29Var.e;
                            Paint paint = v29Var2.h;
                            float floatValue = f3.floatValue();
                            v29Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            v29Var2.invalidate();
                            break;
                        default:
                            v29 v29Var3 = o29Var.e;
                            Paint paint2 = v29Var3.n;
                            float floatValue2 = f3.floatValue();
                            v29Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            v29Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: n29
                public final /* synthetic */ o29 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    o29 o29Var = this.b;
                    switch (b2) {
                        case 0:
                            o29Var.c = null;
                            break;
                        default:
                            o29Var.d = null;
                            break;
                    }
                }
            });
            this.b = z2;
        }
    }
}
