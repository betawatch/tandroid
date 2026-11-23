package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class py extends v4.u0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ qy c;

    public py(qy qyVar, int i7) {
        this.c = qyVar;
        this.a = i7;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        dy dyVar;
        qy qyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = qyVar.S0;
        v4.b1 b1Var = recyclerView.getLayoutManager().e;
        if (b1Var != null && b1Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i7 != 0) {
            if (i7 == 1) {
                if (qyVar.K0) {
                    qyVar.K0 = false;
                }
                if (i10 == 0) {
                    dyVar = qyVar.H0;
                } else if (i10 == 1) {
                    dyVar = qyVar.W;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i10, "Unexpected argument: "));
                    }
                    dyVar = qyVar.p0;
                }
                if (dyVar != null) {
                    dyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (qyVar.U0 == null) {
                    jg.d1 d1Var = new jg.d1(qyVar, qyVar.d1, qyVar.u1.a(), qyVar.u1.f(), 1);
                    qyVar.U0 = d1Var;
                    d1Var.a();
                }
                qyVar.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = qyVar.R0;
            qx qxVar = qyVar.u1;
            if ((qxVar == null || !qxVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    ek0 x10 = qyVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    v4.f1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / qyVar.c1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            qyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = qyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        qyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        qyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(qyVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (qyVar.K0) {
            qyVar.K0 = false;
        }
        this.b = false;
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        qy qyVar = this.c;
        int i11 = this.a;
        qyVar.p(i11);
        qy.e(qyVar, i11, i10);
        if (i11 == 0) {
            qyVar.q(false);
        } else if (i11 == 1) {
            qyVar.l(false);
        } else if (i11 == 2) {
            qy.f(qyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = qyVar.n;
        if (SystemClock.elapsedRealtime() - qyVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        qyVar.I += f10;
        int L = qyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = qyVar.I;
        if (f11 >= L) {
            qyVar.N(false);
            return;
        }
        if (f11 <= (-L)) {
            qyVar.N(true);
        } else {
            if ((frameLayout.getTag() != null || qyVar.I >= 0.0f) && (frameLayout.getTag() == null || qyVar.I <= 0.0f)) {
                return;
            }
            qyVar.I = 0.0f;
        }
    }
}
