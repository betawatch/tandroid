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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ez extends f2.a1 {
    public final int a;
    public boolean b;
    public final /* synthetic */ fz c;

    public ez(fz fzVar, int i10) {
        this.c = fzVar;
        this.a = i10;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        ry ryVar;
        fz fzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = fzVar.N0;
        f2.j1 j1Var = recyclerView.getLayoutManager().e;
        if (j1Var != null && j1Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (fzVar.F0) {
                    fzVar.F0 = false;
                }
                if (i11 == 0) {
                    ryVar = fzVar.C0;
                } else if (i11 == 1) {
                    ryVar = fzVar.R;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(j7.l1.k(i11, "Unexpected argument: "));
                    }
                    ryVar = fzVar.k0;
                }
                if (ryVar != null) {
                    ryVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (fzVar.P0 == null) {
                    vw vwVar = new vw(fzVar, fzVar.Y0, fzVar.p1.a(), fzVar.p1.f(), 0);
                    fzVar.P0 = vwVar;
                    vwVar.a();
                }
                fzVar.P0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = fzVar.M0;
            fy fyVar = fzVar.p1;
            if ((fyVar == null || !fyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f9 = iArr[i11] / (-dpf2);
                if (f9 <= 0.0f || f9 >= 1.0f) {
                    jl0 x4 = fzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    f2.n1 K = x4.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / fzVar.X0;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            fzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y8 = fzVar.y(i11);
                    int i13 = f9 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f9 > 0.5f) {
                        fzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        fzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y8, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y8.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new gh.b(fzVar, i11, 4));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y8.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (fzVar.F0) {
            fzVar.F0 = false;
        }
        this.b = false;
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        fz fzVar = this.c;
        int i12 = this.a;
        fzVar.p(i12);
        fz.e(fzVar, i12, i11);
        if (i12 == 0) {
            fzVar.q(false);
        } else if (i12 == 1) {
            fzVar.l(false);
        } else if (i12 == 2) {
            fz.f(fzVar, false);
        }
        if (this.b) {
            return;
        }
        float f9 = i11;
        FrameLayout frameLayout = fzVar.n;
        if (SystemClock.elapsedRealtime() - fzVar.B2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        fzVar.D += f9;
        int dp = fzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = fzVar.D;
        if (f10 >= dp) {
            fzVar.O(false);
            return;
        }
        if (f10 <= (-dp)) {
            fzVar.O(true);
        } else {
            if ((frameLayout.getTag() != null || fzVar.D >= 0.0f) && (frameLayout.getTag() == null || fzVar.D <= 0.0f)) {
                return;
            }
            fzVar.D = 0.0f;
        }
    }
}
