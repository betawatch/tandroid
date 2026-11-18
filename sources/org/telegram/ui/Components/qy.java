package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class qy extends v4.u0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ ry c;

    public qy(ry ryVar, int i7) {
        this.c = ryVar;
        this.a = i7;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        ey eyVar;
        ry ryVar = this.c;
        ObjectAnimator[] objectAnimatorArr = ryVar.S0;
        v4.b1 b1Var = recyclerView.getLayoutManager().e;
        if (b1Var != null && b1Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i7 != 0) {
            if (i7 == 1) {
                if (ryVar.K0) {
                    ryVar.K0 = false;
                }
                if (i10 == 0) {
                    eyVar = ryVar.H0;
                } else if (i10 == 1) {
                    eyVar = ryVar.W;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i10, "Unexpected argument: "));
                    }
                    eyVar = ryVar.p0;
                }
                if (eyVar != null) {
                    eyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (ryVar.U0 == null) {
                    jg.d1 d1Var = new jg.d1(ryVar, ryVar.d1, ryVar.u1.a(), ryVar.u1.f(), 1);
                    ryVar.U0 = d1Var;
                    d1Var.a();
                }
                ryVar.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = ryVar.R0;
            rx rxVar = ryVar.u1;
            if ((rxVar == null || !rxVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    ck0 x10 = ryVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    v4.f1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / ryVar.c1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            ryVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = ryVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        ryVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        ryVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.k2(ryVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (ryVar.K0) {
            ryVar.K0 = false;
        }
        this.b = false;
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        ry ryVar = this.c;
        int i11 = this.a;
        ryVar.p(i11);
        ry.e(ryVar, i11, i10);
        if (i11 == 0) {
            ryVar.q(false);
        } else if (i11 == 1) {
            ryVar.l(false);
        } else if (i11 == 2) {
            ry.f(ryVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = ryVar.n;
        if (SystemClock.elapsedRealtime() - ryVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        ryVar.I += f10;
        int L = ryVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = ryVar.I;
        if (f11 >= L) {
            ryVar.N(false);
            return;
        }
        if (f11 <= (-L)) {
            ryVar.N(true);
        } else {
            if ((frameLayout.getTag() != null || ryVar.I >= 0.0f) && (frameLayout.getTag() == null || ryVar.I <= 0.0f)) {
                return;
            }
            ryVar.I = 0.0f;
        }
    }
}
