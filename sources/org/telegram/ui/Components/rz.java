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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class rz extends s4.u0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ sz c;

    public rz(sz szVar, int i10) {
        this.c = szVar;
        this.a = i10;
    }

    @Override // s4.u0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        fz fzVar;
        sz szVar = this.c;
        ObjectAnimator[] objectAnimatorArr = szVar.R0;
        s4.a1 a1Var = recyclerView.getLayoutManager().e;
        if (a1Var != null && a1Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (szVar.J0) {
                    szVar.J0 = false;
                }
                if (i11 == 0) {
                    fzVar = szVar.G0;
                } else if (i11 == 1) {
                    fzVar = szVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(ic.a.i(i11, "Unexpected argument: "));
                    }
                    fzVar = szVar.o0;
                }
                if (fzVar != null) {
                    fzVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (szVar.T0 == null) {
                    ig.f1 f1Var = new ig.f1(szVar, szVar.c1, szVar.t1.a(), szVar.t1.f(), 1);
                    szVar.T0 = f1Var;
                    f1Var.a();
                }
                szVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = szVar.Q0;
            ty tyVar = szVar.t1;
            if ((tyVar == null || !tyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    mm0 x9 = szVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.e1 K = x9.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / szVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            szVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y3 = szVar.y(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        szVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        szVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y3.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.u2(szVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y3.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (szVar.J0) {
            szVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.u0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        sz szVar = this.c;
        int i12 = this.a;
        szVar.p(i12);
        sz.e(szVar, i12, i11);
        if (i12 == 0) {
            szVar.q(false);
        } else if (i12 == 1) {
            szVar.l(false);
        } else if (i12 == 2) {
            sz.f(szVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = szVar.n;
        if (SystemClock.elapsedRealtime() - szVar.D2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        szVar.H += f7;
        int dp = szVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = szVar.H;
        if (f10 >= dp) {
            szVar.M(false);
            return;
        }
        if (f10 <= (-dp)) {
            szVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || szVar.H >= 0.0f) && (frameLayout.getTag() == null || szVar.H <= 0.0f)) {
                return;
            }
            szVar.H = 0.0f;
        }
    }
}
