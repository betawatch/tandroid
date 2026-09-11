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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class jz extends s4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ kz c;

    public jz(kz kzVar, int i10) {
        this.c = kzVar;
        this.a = i10;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        xy xyVar;
        kz kzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = kzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        if (y0Var != null && y0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (kzVar.J0) {
                    kzVar.J0 = false;
                }
                if (i11 == 0) {
                    xyVar = kzVar.G0;
                } else if (i11 == 1) {
                    xyVar = kzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(i2.g.i(i11, "Unexpected argument: "));
                    }
                    xyVar = kzVar.o0;
                }
                if (xyVar != null) {
                    xyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (kzVar.T0 == null) {
                    hg.g1 g1Var = new hg.g1(kzVar, kzVar.c1, kzVar.t1.a(), kzVar.t1.f(), 1);
                    kzVar.T0 = g1Var;
                    g1Var.a();
                }
                kzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = kzVar.Q0;
            ly lyVar = kzVar.t1;
            if ((lyVar == null || !lyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    ll0 x10 = kzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.c1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / kzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            kzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y3 = kzVar.y(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        kzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        kzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y3.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(kzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y3.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (kzVar.J0) {
            kzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        kz kzVar = this.c;
        int i12 = this.a;
        kzVar.p(i12);
        kz.e(kzVar, i12, i11);
        if (i12 == 0) {
            kzVar.q(false);
        } else if (i12 == 1) {
            kzVar.l(false);
        } else if (i12 == 2) {
            kz.f(kzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = kzVar.n;
        if (SystemClock.elapsedRealtime() - kzVar.F2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        kzVar.H += f7;
        int dp = kzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = kzVar.H;
        if (f10 >= dp) {
            kzVar.O(false);
            return;
        }
        if (f10 <= (-dp)) {
            kzVar.O(true);
        } else {
            if ((frameLayout.getTag() != null || kzVar.H >= 0.0f) && (frameLayout.getTag() == null || kzVar.H <= 0.0f)) {
                return;
            }
            kzVar.H = 0.0f;
        }
    }
}
