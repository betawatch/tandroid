package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class fy extends v4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ gy c;

    public fy(gy gyVar, int i7) {
        this.c = gyVar;
        this.a = i7;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        tx txVar;
        gy gyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = gyVar.R0;
        v4.z0 z0Var = recyclerView.getLayoutManager().e;
        if (z0Var != null && z0Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i7 != 0) {
            if (i7 == 1) {
                if (gyVar.J0) {
                    gyVar.J0 = false;
                }
                if (i10 == 0) {
                    txVar = gyVar.G0;
                } else if (i10 == 1) {
                    txVar = gyVar.V;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(jg.g.j(i10, "Unexpected argument: "));
                    }
                    txVar = gyVar.o0;
                }
                if (txVar != null) {
                    txVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (gyVar.T0 == null) {
                    jg.e1 e1Var = new jg.e1(gyVar, gyVar.c1, gyVar.t1.a(), gyVar.t1.f(), 1);
                    gyVar.T0 = e1Var;
                    e1Var.a();
                }
                gyVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = gyVar.Q0;
            hx hxVar = gyVar.t1;
            if ((hxVar == null || !hxVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    pj0 x10 = gyVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    v4.d1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / gyVar.b1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            gyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = gyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        gyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        gyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(gyVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (gyVar.J0) {
            gyVar.J0 = false;
        }
        this.b = false;
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        gy gyVar = this.c;
        int i11 = this.a;
        gyVar.p(i11);
        gy.e(gyVar, i11, i10);
        if (i11 == 0) {
            gyVar.q(false);
        } else if (i11 == 1) {
            gyVar.l(false);
        } else if (i11 == 2) {
            gy.f(gyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = gyVar.n;
        if (SystemClock.elapsedRealtime() - gyVar.D2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        gyVar.H += f10;
        int L = gyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = gyVar.H;
        if (f11 >= L) {
            gyVar.M(false);
            return;
        }
        if (f11 <= (-L)) {
            gyVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || gyVar.H >= 0.0f) && (frameLayout.getTag() == null || gyVar.H <= 0.0f)) {
                return;
            }
            gyVar.H = 0.0f;
        }
    }
}
