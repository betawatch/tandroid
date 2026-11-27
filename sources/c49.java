// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c49 extends v79 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ i49 e;

    public c49(i49 i49Var) {
        this.e = i49Var;
    }

    public static ValueAnimator c(float f, float f2, pt2 pt2Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration((long) (Math.abs(f2 - f) * 150.0f));
        duration.addUpdateListener(new b49(pt2Var, (byte) 0));
        duration.addListener(new n88(runnable, (byte) 26));
        duration.start();
        return duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        i49 i49Var = this.e;
        of2 of2Var = i49Var.a0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final byte b = 1;
        boolean z = of2Var.K0() != 0;
        if (z != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = i49Var.r;
            float f2 = z ? 1.0f : 0.0f;
            final Object[] objArr3 = objArr2 == true ? 1 : 0;
            pt2 pt2Var = new pt2(this) { // from class: z39
                public final /* synthetic */ c49 b;

                {
                    this.b = this;
                }

                @Override // pt2
                public final void accept(Object obj) {
                    byte b2 = objArr3;
                    c49 c49Var = this.b;
                    Float f3 = (Float) obj;
                    switch (b2) {
                        case 0:
                            i49 i49Var2 = c49Var.e;
                            Paint paint = i49Var2.h;
                            float floatValue = f3.floatValue();
                            i49Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            i49Var2.invalidate();
                            break;
                        default:
                            i49 i49Var3 = c49Var.e;
                            Paint paint2 = i49Var3.n;
                            float floatValue2 = f3.floatValue();
                            i49Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            i49Var3.invalidate();
                            break;
                    }
                }
            };
            final Object[] objArr4 = objArr == true ? 1 : 0;
            this.c = c(f, f2, pt2Var, new Runnable(this) { // from class: a49
                public final /* synthetic */ c49 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = objArr4;
                    c49 c49Var = this.b;
                    switch (b2) {
                        case 0:
                            c49Var.c = null;
                            break;
                        default:
                            c49Var.d = null;
                            break;
                    }
                }
            });
            this.a = z;
        }
        boolean z2 = of2Var.M0() != i49Var.b0.b() - 1;
        if (z2 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.d = c(i49Var.s, z2 ? 1.0f : 0.0f, new pt2(this) { // from class: z39
                public final /* synthetic */ c49 b;

                {
                    this.b = this;
                }

                @Override // pt2
                public final void accept(Object obj) {
                    byte b2 = b;
                    c49 c49Var = this.b;
                    Float f3 = (Float) obj;
                    switch (b2) {
                        case 0:
                            i49 i49Var2 = c49Var.e;
                            Paint paint = i49Var2.h;
                            float floatValue = f3.floatValue();
                            i49Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            i49Var2.invalidate();
                            break;
                        default:
                            i49 i49Var3 = c49Var.e;
                            Paint paint2 = i49Var3.n;
                            float floatValue2 = f3.floatValue();
                            i49Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            i49Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: a49
                public final /* synthetic */ c49 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    c49 c49Var = this.b;
                    switch (b2) {
                        case 0:
                            c49Var.c = null;
                            break;
                        default:
                            c49Var.d = null;
                            break;
                    }
                }
            });
            this.b = z2;
        }
    }
}
