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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public class lz extends s4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ mz c;

    public lz(mz mzVar, int i10) {
        this.c = mzVar;
        this.a = i10;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        zy zyVar;
        mz mzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = mzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        if (y0Var != null && y0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (mzVar.J0) {
                    mzVar.J0 = false;
                }
                if (i11 == 0) {
                    zyVar = mzVar.G0;
                } else if (i11 == 1) {
                    zyVar = mzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(hg.c.h(i11, "Unexpected argument: "));
                    }
                    zyVar = mzVar.o0;
                }
                if (zyVar != null) {
                    zyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (mzVar.T0 == null) {
                    gg.g1 g1Var = new gg.g1(mzVar, mzVar.c1, mzVar.t1.a(), mzVar.t1.f(), 1);
                    mzVar.T0 = g1Var;
                    g1Var.a();
                }
                mzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = mzVar.Q0;
            ny nyVar = mzVar.t1;
            if ((nyVar == null || !nyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    yl0 x10 = mzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.c1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / mzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            mzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y3 = mzVar.y(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        mzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        mzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y3.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(mzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y3.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (mzVar.J0) {
            mzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        mz mzVar = this.c;
        int i12 = this.a;
        mzVar.p(i12);
        mz.e(mzVar, i12, i11);
        if (i12 == 0) {
            mzVar.q(false);
        } else if (i12 == 1) {
            mzVar.l(false);
        } else if (i12 == 2) {
            mz.f(mzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = mzVar.n;
        if (SystemClock.elapsedRealtime() - mzVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        mzVar.H += f7;
        int dp = mzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = mzVar.H;
        if (f10 >= dp) {
            mzVar.M(false);
            return;
        }
        if (f10 <= (-dp)) {
            mzVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || mzVar.H >= 0.0f) && (frameLayout.getTag() == null || mzVar.H <= 0.0f)) {
                return;
            }
            mzVar.H = 0.0f;
        }
    }
}
