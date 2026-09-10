package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class qz extends s4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ rz c;

    public qz(rz rzVar, int i10) {
        this.c = rzVar;
        this.a = i10;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        ez ezVar;
        rz rzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = rzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        if (y0Var != null && y0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (rzVar.J0) {
                    rzVar.J0 = false;
                }
                if (i11 == 0) {
                    ezVar = rzVar.G0;
                } else if (i11 == 1) {
                    ezVar = rzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(hc.b.j(i11, "Unexpected argument: "));
                    }
                    ezVar = rzVar.o0;
                }
                if (ezVar != null) {
                    ezVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (rzVar.T0 == null) {
                    fg.h1 h1Var = new fg.h1(rzVar, rzVar.c1, rzVar.t1.a(), rzVar.t1.f(), 1);
                    rzVar.T0 = h1Var;
                    h1Var.a();
                }
                rzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = rzVar.Q0;
            sy syVar = rzVar.t1;
            if ((syVar == null || !syVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    vl0 x10 = rzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.c1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / rzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            rzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y3 = rzVar.y(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        rzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        rzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y3.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.s2(rzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y3.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (rzVar.J0) {
            rzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        rz rzVar = this.c;
        int i12 = this.a;
        rzVar.p(i12);
        rz.e(rzVar, i12, i11);
        if (i12 == 0) {
            rzVar.q(false);
        } else if (i12 == 1) {
            rzVar.l(false);
        } else if (i12 == 2) {
            rz.f(rzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = rzVar.n;
        if (SystemClock.elapsedRealtime() - rzVar.F2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        rzVar.H += f7;
        int dp = rzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = rzVar.H;
        if (f10 >= dp) {
            rzVar.O(false);
            return;
        }
        if (f10 <= (-dp)) {
            rzVar.O(true);
        } else {
            if ((frameLayout.getTag() != null || rzVar.H >= 0.0f) && (frameLayout.getTag() == null || rzVar.H <= 0.0f)) {
                return;
            }
            rzVar.H = 0.0f;
        }
    }
}
