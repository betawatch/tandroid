package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class sy extends v4.u0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ ty c;

    public sy(ty tyVar, int i7) {
        this.c = tyVar;
        this.a = i7;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        gy gyVar;
        ty tyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = tyVar.S0;
        v4.b1 b1Var = recyclerView.getLayoutManager().e;
        if (b1Var != null && b1Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i7 != 0) {
            if (i7 == 1) {
                if (tyVar.K0) {
                    tyVar.K0 = false;
                }
                if (i10 == 0) {
                    gyVar = tyVar.H0;
                } else if (i10 == 1) {
                    gyVar = tyVar.W;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i10, "Unexpected argument: "));
                    }
                    gyVar = tyVar.p0;
                }
                if (gyVar != null) {
                    gyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (tyVar.U0 == null) {
                    jg.d1 d1Var = new jg.d1(tyVar, tyVar.d1, tyVar.u1.a(), tyVar.u1.f(), 1);
                    tyVar.U0 = d1Var;
                    d1Var.a();
                }
                tyVar.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = tyVar.R0;
            tx txVar = tyVar.u1;
            if ((txVar == null || !txVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    ek0 x10 = tyVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    v4.f1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / tyVar.c1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            tyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = tyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        tyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        tyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(tyVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (tyVar.K0) {
            tyVar.K0 = false;
        }
        this.b = false;
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        ty tyVar = this.c;
        int i11 = this.a;
        tyVar.p(i11);
        ty.e(tyVar, i11, i10);
        if (i11 == 0) {
            tyVar.q(false);
        } else if (i11 == 1) {
            tyVar.l(false);
        } else if (i11 == 2) {
            ty.f(tyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = tyVar.n;
        if (SystemClock.elapsedRealtime() - tyVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        tyVar.I += f10;
        int L = tyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = tyVar.I;
        if (f11 >= L) {
            tyVar.N(false);
            return;
        }
        if (f11 <= (-L)) {
            tyVar.N(true);
        } else {
            if ((frameLayout.getTag() != null || tyVar.I >= 0.0f) && (frameLayout.getTag() == null || tyVar.I <= 0.0f)) {
                return;
            }
            tyVar.I = 0.0f;
        }
    }
}
