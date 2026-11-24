// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n09 extends i49 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final /* synthetic */ t09 e;

    public n09(t09 t09Var) {
        this.e = t09Var;
    }

    public static ValueAnimator c(float f, float f2, vs2 vs2Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration((long) (Math.abs(f2 - f) * 150.0f));
        duration.addUpdateListener(new u28(vs2Var, (byte) 27));
        duration.addListener(new l48(runnable, (byte) 27));
        duration.start();
        return duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        t09 t09Var = this.e;
        xe2 xe2Var = t09Var.a0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final byte b = 1;
        boolean z = xe2Var.K0() != 0;
        if (z != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = t09Var.r;
            float f2 = z ? 1.0f : 0.0f;
            final Object[] objArr3 = objArr2 == true ? 1 : 0;
            vs2 vs2Var = new vs2(this) { // from class: l09
                public final /* synthetic */ n09 b;

                {
                    this.b = this;
                }

                @Override // vs2
                public final void accept(Object obj) {
                    byte b2 = objArr3;
                    n09 n09Var = this.b;
                    Float f3 = (Float) obj;
                    switch (b2) {
                        case 0:
                            t09 t09Var2 = n09Var.e;
                            Paint paint = t09Var2.h;
                            float floatValue = f3.floatValue();
                            t09Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            t09Var2.invalidate();
                            break;
                        default:
                            t09 t09Var3 = n09Var.e;
                            Paint paint2 = t09Var3.n;
                            float floatValue2 = f3.floatValue();
                            t09Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            t09Var3.invalidate();
                            break;
                    }
                }
            };
            final Object[] objArr4 = objArr == true ? 1 : 0;
            this.c = c(f, f2, vs2Var, new Runnable(this) { // from class: m09
                public final /* synthetic */ n09 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = objArr4;
                    n09 n09Var = this.b;
                    switch (b2) {
                        case 0:
                            n09Var.c = null;
                            break;
                        default:
                            n09Var.d = null;
                            break;
                    }
                }
            });
            this.a = z;
        }
        boolean z2 = xe2Var.M0() != t09Var.b0.b() - 1;
        if (z2 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.d = c(t09Var.s, z2 ? 1.0f : 0.0f, new vs2(this) { // from class: l09
                public final /* synthetic */ n09 b;

                {
                    this.b = this;
                }

                @Override // vs2
                public final void accept(Object obj) {
                    byte b2 = b;
                    n09 n09Var = this.b;
                    Float f3 = (Float) obj;
                    switch (b2) {
                        case 0:
                            t09 t09Var2 = n09Var.e;
                            Paint paint = t09Var2.h;
                            float floatValue = f3.floatValue();
                            t09Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            t09Var2.invalidate();
                            break;
                        default:
                            t09 t09Var3 = n09Var.e;
                            Paint paint2 = t09Var3.n;
                            float floatValue2 = f3.floatValue();
                            t09Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            t09Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) { // from class: m09
                public final /* synthetic */ n09 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    n09 n09Var = this.b;
                    switch (b2) {
                        case 0:
                            n09Var.c = null;
                            break;
                        default:
                            n09Var.d = null;
                            break;
                    }
                }
            });
            this.b = z2;
        }
    }
}
