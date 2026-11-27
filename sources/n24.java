// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class n24 extends v79 {
    public final byte a;
    public boolean b;
    public final /* synthetic */ o24 c;

    /* JADX WARN: Multi-variable type inference failed */
    public n24(o24 o24Var, int i) {
        this.c = o24Var;
        this.a = i;
    }

    @Override // v79
    public void a(RecyclerView recyclerView, int i) {
        ObjectAnimator objectAnimator;
        c24 c24Var;
        int i2;
        final o24 o24Var = this.c;
        ObjectAnimator[] objectAnimatorArr = o24Var.S0;
        b89 b89Var = recyclerView.getLayoutManager().e;
        if (b89Var != null && b89Var.e) {
            this.b = true;
            return;
        }
        final byte b = this.a;
        if (i != 0) {
            if (i == 1) {
                if (o24Var.K0) {
                    o24Var.K0 = false;
                }
                if (b == 0) {
                    c24Var = o24Var.H0;
                } else if (b == 1) {
                    c24Var = o24Var.W;
                } else {
                    if (b != 2) {
                        lq5.j(uh9.k(b, "Unexpected argument: "));
                        return;
                    }
                    c24Var = o24Var.p0;
                }
                if (c24Var != null) {
                    c24Var.a();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[b]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[b].cancel();
            }
            if (b == 0) {
                if (o24Var.U0 == null) {
                    h04 h04Var = new h04(o24Var, o24Var.d1, o24Var.u1.a(), o24Var.u1.f(), (byte) 0);
                    o24Var.U0 = h04Var;
                    h04Var.a();
                }
                o24Var.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = o24Var.R0;
            p14 p14Var = o24Var.u1;
            if ((p14Var == null || !p14Var.z()) && b != 0) {
                float N = hl.N(b == 1 ? 36.0f : 48.0f);
                float f = iArr[b] / (-N);
                if (f <= 0.0f || f >= 1.0f) {
                    d79 w = o24Var.w(b);
                    int L = hl.L(b == 1 ? 38.0f : 48.0f);
                    f89 L2 = w.L(0);
                    if (L2 != null) {
                        int bottom = L2.a.getBottom();
                        int i3 = iArr[b];
                        float f2 = (bottom - (L + i3)) / o24Var.c1;
                        if (f2 > 0.0f || f2 < 1.0f) {
                            o24Var.e(b, i3, f2 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView x = o24Var.x(b);
                    if (f > 0.5f) {
                        i2 = (int) (-Math.ceil(N));
                        o24Var.e(b, i2, false);
                    } else {
                        i2 = 0;
                    }
                    if (b == 1) {
                        o24Var.i(i2);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[b];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, x.getTranslationY(), i2);
                        objectAnimatorArr[b] = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lz3
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                o24.this.R0[b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            }
                        });
                        objectAnimatorArr[b].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(x.getTranslationY(), i2);
                    }
                    objectAnimatorArr[b].start();
                }
            }
        }
        if (o24Var.K0) {
            o24Var.K0 = false;
        }
        this.b = false;
    }

    @Override // v79
    public void b(RecyclerView recyclerView, int i, int i2) {
        o24 o24Var = this.c;
        byte b = this.a;
        o24Var.m(b);
        o24Var.o(b, i2);
        if (b == 0) {
            o24Var.n(false);
        } else if (b == 1) {
            o24Var.h(false);
        } else if (b == 2) {
            o24Var.k(false);
        }
        if (this.b) {
            return;
        }
        float f = i2;
        FrameLayout frameLayout = o24Var.n;
        if (SystemClock.elapsedRealtime() - o24Var.D2 >= ViewConfiguration.getTapTimeout()) {
            o24Var.I += f;
            int L = o24Var.h.getCurrentItem() == 0 ? hl.L(38.0f) : hl.L(48.0f);
            float f2 = o24Var.I;
            if (f2 >= L) {
                o24Var.L(false);
                return;
            }
            if (f2 <= (-L)) {
                o24Var.L(true);
            } else {
                if ((frameLayout.getTag() != null || o24Var.I >= 0.0f) && (frameLayout.getTag() == null || o24Var.I <= 0.0f)) {
                    return;
                }
                o24Var.I = 0.0f;
            }
        }
    }
}
