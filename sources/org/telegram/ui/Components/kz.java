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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class kz extends s4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ lz c;

    public kz(lz lzVar, int i10) {
        this.c = lzVar;
        this.a = i10;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        yy yyVar;
        lz lzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = lzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        if (y0Var != null && y0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (lzVar.J0) {
                    lzVar.J0 = false;
                }
                if (i11 == 0) {
                    yyVar = lzVar.G0;
                } else if (i11 == 1) {
                    yyVar = lzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(hg.c.h(i11, "Unexpected argument: "));
                    }
                    yyVar = lzVar.o0;
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
                if (lzVar.T0 == null) {
                    gg.g1 g1Var = new gg.g1(lzVar, lzVar.c1, lzVar.t1.a(), lzVar.t1.f(), 1);
                    lzVar.T0 = g1Var;
                    g1Var.a();
                }
                lzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = lzVar.Q0;
            my myVar = lzVar.t1;
            if ((myVar == null || !myVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    wl0 x10 = lzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.c1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / lzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            lzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y3 = lzVar.y(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        lzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        lzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y3.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(lzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y3.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (lzVar.J0) {
            lzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        lz lzVar = this.c;
        int i12 = this.a;
        lzVar.p(i12);
        lz.e(lzVar, i12, i11);
        if (i12 == 0) {
            lzVar.q(false);
        } else if (i12 == 1) {
            lzVar.l(false);
        } else if (i12 == 2) {
            lz.f(lzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = lzVar.n;
        if (SystemClock.elapsedRealtime() - lzVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        lzVar.H += f7;
        int dp = lzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = lzVar.H;
        if (f10 >= dp) {
            lzVar.M(false);
            return;
        }
        if (f10 <= (-dp)) {
            lzVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || lzVar.H >= 0.0f) && (frameLayout.getTag() == null || lzVar.H <= 0.0f)) {
                return;
            }
            lzVar.H = 0.0f;
        }
    }
}
