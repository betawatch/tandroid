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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class lz extends f2.a1 {
    public final int a;
    public boolean b;
    public final /* synthetic */ mz c;

    public lz(mz mzVar, int i10) {
        this.c = mzVar;
        this.a = i10;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        yy yyVar;
        mz mzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = mzVar.O0;
        f2.i1 i1Var = recyclerView.getLayoutManager().e;
        if (i1Var != null && i1Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (mzVar.G0) {
                    mzVar.G0 = false;
                }
                if (i11 == 0) {
                    yyVar = mzVar.D0;
                } else if (i11 == 1) {
                    yyVar = mzVar.S;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(l.d.j(i11, "Unexpected argument: "));
                    }
                    yyVar = mzVar.l0;
                }
                if (yyVar != null) {
                    yyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (mzVar.Q0 == null) {
                    bx bxVar = new bx(mzVar, mzVar.Z0, mzVar.q1.a(), mzVar.q1.f(), 0);
                    mzVar.Q0 = bxVar;
                    bxVar.a();
                }
                mzVar.Q0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = mzVar.N0;
            my myVar = mzVar.q1;
            if ((myVar == null || !myVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i11] / (-dpf2);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    sl0 x10 = mzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    f2.m1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f11 = (bottom - (dp + i12)) / mzVar.Y0;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            mzVar.i(i11, i12, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = mzVar.y(i11);
                    int i13 = f10 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f10 > 0.5f) {
                        mzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        mzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new jh.b(mzVar, i11, 4));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (mzVar.G0) {
            mzVar.G0 = false;
        }
        this.b = false;
    }

    @Override // f2.a1
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
        float f10 = i11;
        FrameLayout frameLayout = mzVar.n;
        if (SystemClock.elapsedRealtime() - mzVar.C2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        mzVar.E += f10;
        int dp = mzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f11 = mzVar.E;
        if (f11 >= dp) {
            mzVar.O(false);
            return;
        }
        if (f11 <= (-dp)) {
            mzVar.O(true);
        } else {
            if ((frameLayout.getTag() != null || mzVar.E >= 0.0f) && (frameLayout.getTag() == null || mzVar.E <= 0.0f)) {
                return;
            }
            mzVar.E = 0.0f;
        }
    }
}
