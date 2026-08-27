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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class xy extends f2.b1 {
    public final int a;
    public boolean b;
    public final /* synthetic */ yy c;

    public xy(yy yyVar, int i10) {
        this.c = yyVar;
        this.a = i10;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        ky kyVar;
        yy yyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = yyVar.N0;
        f2.k1 k1Var = recyclerView.getLayoutManager().e;
        if (k1Var != null && k1Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (yyVar.F0) {
                    yyVar.F0 = false;
                }
                if (i11 == 0) {
                    kyVar = yyVar.C0;
                } else if (i11 == 1) {
                    kyVar = yyVar.R;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(i0.a.k(i11, "Unexpected argument: "));
                    }
                    kyVar = yyVar.k0;
                }
                if (kyVar != null) {
                    kyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (yyVar.P0 == null) {
                    ow owVar = new ow(yyVar, yyVar.Y0, yyVar.p1.a(), yyVar.p1.f(), 0);
                    yyVar.P0 = owVar;
                    owVar.a();
                }
                yyVar.P0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = yyVar.M0;
            xx xxVar = yyVar.p1;
            if ((xxVar == null || !xxVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i11] / (-dpf2);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    zk0 y10 = yyVar.y(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    f2.o1 K = y10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f11 = (bottom - (dp + i12)) / yyVar.X0;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            yyVar.i(i11, i12, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView z10 = yyVar.z(i11);
                    int i13 = f10 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f10 > 0.5f) {
                        yyVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        yyVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, z10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new eh.b(yyVar, i11, 4));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(z10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (yyVar.F0) {
            yyVar.F0 = false;
        }
        this.b = false;
    }

    @Override // f2.b1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        yy yyVar = this.c;
        int i12 = this.a;
        yyVar.q(i12);
        yy.e(yyVar, i12, i11);
        if (i12 == 0) {
            yyVar.r(false);
        } else if (i12 == 1) {
            yyVar.l(false);
        } else if (i12 == 2) {
            yy.f(yyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i11;
        FrameLayout frameLayout = yyVar.n;
        if (SystemClock.elapsedRealtime() - yyVar.B2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        yyVar.D += f10;
        int dp = yyVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f11 = yyVar.D;
        if (f11 >= dp) {
            yyVar.O(false);
            return;
        }
        if (f11 <= (-dp)) {
            yyVar.O(true);
        } else {
            if ((frameLayout.getTag() != null || yyVar.D >= 0.0f) && (frameLayout.getTag() == null || yyVar.D <= 0.0f)) {
                return;
            }
            yyVar.D = 0.0f;
        }
    }
}
