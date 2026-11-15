package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ky extends v4.t0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ ly c;

    public ky(ly lyVar, int i7) {
        this.c = lyVar;
        this.a = i7;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        yx yxVar;
        ly lyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = lyVar.S0;
        v4.a1 a1Var = recyclerView.getLayoutManager().e;
        if (a1Var != null && a1Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i7 != 0) {
            if (i7 == 1) {
                if (lyVar.K0) {
                    lyVar.K0 = false;
                }
                if (i10 == 0) {
                    yxVar = lyVar.H0;
                } else if (i10 == 1) {
                    yxVar = lyVar.W;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i10, "Unexpected argument: "));
                    }
                    yxVar = lyVar.p0;
                }
                if (yxVar != null) {
                    yxVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (lyVar.U0 == null) {
                    jg.d1 d1Var = new jg.d1(lyVar, lyVar.d1, lyVar.u1.a(), lyVar.u1.f(), 1);
                    lyVar.U0 = d1Var;
                    d1Var.a();
                }
                lyVar.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = lyVar.R0;
            mx mxVar = lyVar.u1;
            if ((mxVar == null || !mxVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    uj0 x10 = lyVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    v4.e1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / lyVar.c1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            lyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = lyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        lyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        lyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(lyVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (lyVar.K0) {
            lyVar.K0 = false;
        }
        this.b = false;
    }

    @Override // v4.t0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        ly lyVar = this.c;
        int i11 = this.a;
        lyVar.p(i11);
        ly.e(lyVar, i11, i10);
        if (i11 == 0) {
            lyVar.q(false);
        } else if (i11 == 1) {
            lyVar.l(false);
        } else if (i11 == 2) {
            ly.f(lyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = lyVar.n;
        if (SystemClock.elapsedRealtime() - lyVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        lyVar.I += f10;
        int L = lyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = lyVar.I;
        if (f11 >= L) {
            lyVar.N(false);
            return;
        }
        if (f11 <= (-L)) {
            lyVar.N(true);
        } else {
            if ((frameLayout.getTag() != null || lyVar.I >= 0.0f) && (frameLayout.getTag() == null || lyVar.I <= 0.0f)) {
                return;
            }
            lyVar.I = 0.0f;
        }
    }
}
