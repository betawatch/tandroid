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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class d34 extends k69 {
    public final byte a;
    public boolean b;
    public final /* synthetic */ e34 c;

    /* JADX WARN: Multi-variable type inference failed */
    public d34(e34 e34Var, int i) {
        this.c = e34Var;
        this.a = i;
    }

    @Override // k69
    public void a(RecyclerView recyclerView, int i) {
        ObjectAnimator objectAnimator;
        s24 s24Var;
        int i2;
        final e34 e34Var = this.c;
        ObjectAnimator[] objectAnimatorArr = e34Var.S0;
        q69 q69Var = recyclerView.getLayoutManager().e;
        if (q69Var != null && q69Var.e) {
            this.b = true;
            return;
        }
        final byte b = this.a;
        if (i != 0) {
            if (i == 1) {
                if (e34Var.K0) {
                    e34Var.K0 = false;
                }
                if (b == 0) {
                    s24Var = e34Var.H0;
                } else if (b == 1) {
                    s24Var = e34Var.W;
                } else {
                    if (b != 2) {
                        u36.j(hg9.j(b, "Unexpected argument: "));
                        return;
                    }
                    s24Var = e34Var.p0;
                }
                if (s24Var != null) {
                    s24Var.a();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[b]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[b].cancel();
            }
            if (b == 0) {
                if (e34Var.U0 == null) {
                    w04 w04Var = new w04(e34Var, e34Var.d1, e34Var.u1.a(), e34Var.u1.f(), (byte) 0);
                    e34Var.U0 = w04Var;
                    w04Var.a();
                }
                e34Var.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = e34Var.R0;
            f24 f24Var = e34Var.u1;
            if ((f24Var == null || !f24Var.z()) && b != 0) {
                float N = gm.N(b == 1 ? 36.0f : 48.0f);
                float f = iArr[b] / (-N);
                if (f <= 0.0f || f >= 1.0f) {
                    r59 v = e34Var.v(b);
                    int L = gm.L(b == 1 ? 38.0f : 48.0f);
                    u69 K = v.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i3 = iArr[b];
                        float f2 = (bottom - (L + i3)) / e34Var.c1;
                        if (f2 > 0.0f || f2 < 1.0f) {
                            e34Var.e(b, i3, f2 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView w = e34Var.w(b);
                    if (f > 0.5f) {
                        i2 = (int) (-Math.ceil(N));
                        e34Var.e(b, i2, false);
                    } else {
                        i2 = 0;
                    }
                    if (b == 1) {
                        e34Var.i(i2);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[b];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, w.getTranslationY(), i2);
                        objectAnimatorArr[b] = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a04
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                e34.this.R0[b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            }
                        });
                        objectAnimatorArr[b].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(w.getTranslationY(), i2);
                    }
                    objectAnimatorArr[b].start();
                }
            }
        }
        if (e34Var.K0) {
            e34Var.K0 = false;
        }
        this.b = false;
    }

    @Override // k69
    public void b(RecyclerView recyclerView, int i, int i2) {
        e34 e34Var = this.c;
        byte b = this.a;
        e34Var.m(b);
        e34Var.o(b, i2);
        if (b == 0) {
            e34Var.n(false);
        } else if (b == 1) {
            e34Var.h(false);
        } else if (b == 2) {
            e34Var.k(false);
        }
        if (this.b) {
            return;
        }
        float f = i2;
        FrameLayout frameLayout = e34Var.n;
        if (SystemClock.elapsedRealtime() - e34Var.D2 >= ViewConfiguration.getTapTimeout()) {
            e34Var.I += f;
            int L = e34Var.h.getCurrentItem() == 0 ? gm.L(38.0f) : gm.L(48.0f);
            float f2 = e34Var.I;
            if (f2 >= L) {
                e34Var.L(false);
                return;
            }
            if (f2 <= (-L)) {
                e34Var.L(true);
            } else {
                if ((frameLayout.getTag() != null || e34Var.I >= 0.0f) && (frameLayout.getTag() == null || e34Var.I <= 0.0f)) {
                    return;
                }
                e34Var.I = 0.0f;
            }
        }
    }
}
