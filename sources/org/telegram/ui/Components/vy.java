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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class vy extends f2.d1 {
    public final int a;
    public boolean b;
    public final /* synthetic */ wy c;

    public vy(wy wyVar, int i9) {
        this.c = wyVar;
        this.a = i9;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        ObjectAnimator objectAnimator;
        jy jyVar;
        wy wyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = wyVar.N0;
        f2.m1 m1Var = recyclerView.getLayoutManager().e;
        if (m1Var != null && m1Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i9 != 0) {
            if (i9 == 1) {
                if (wyVar.F0) {
                    wyVar.F0 = false;
                }
                if (i10 == 0) {
                    jyVar = wyVar.C0;
                } else if (i10 == 1) {
                    jyVar = wyVar.R;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(j3.r0.l(i10, "Unexpected argument: "));
                    }
                    jyVar = wyVar.k0;
                }
                if (jyVar != null) {
                    jyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (wyVar.P0 == null) {
                    of.b1 b1Var = new of.b1(wyVar, wyVar.Y0, wyVar.p1.a(), wyVar.p1.f(), 1);
                    wyVar.P0 = b1Var;
                    b1Var.a();
                }
                wyVar.P0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = wyVar.M0;
            wx wxVar = wyVar.p1;
            if ((wxVar == null || !wxVar.z()) && i10 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-dpf2);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    wk0 x10 = wyVar.x(i10);
                    int dp = AndroidUtilities.dp(i10 == 1 ? 38.0f : 48.0f);
                    f2.q1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (dp + i11)) / wyVar.X0;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            wyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = wyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f10 > 0.5f) {
                        wyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        wyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new dh.b(wyVar, i10, 4));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (wyVar.F0) {
            wyVar.F0 = false;
        }
        this.b = false;
    }

    @Override // f2.d1
    public void b(RecyclerView recyclerView, int i9, int i10) {
        wy wyVar = this.c;
        int i11 = this.a;
        wyVar.p(i11);
        wy.e(wyVar, i11, i10);
        if (i11 == 0) {
            wyVar.q(false);
        } else if (i11 == 1) {
            wyVar.l(false);
        } else if (i11 == 2) {
            wy.f(wyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = wyVar.n;
        if (SystemClock.elapsedRealtime() - wyVar.B2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        wyVar.D += f10;
        int dp = wyVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f11 = wyVar.D;
        if (f11 >= dp) {
            wyVar.N(false);
            return;
        }
        if (f11 <= (-dp)) {
            wyVar.N(true);
        } else {
            if ((frameLayout.getTag() != null || wyVar.D >= 0.0f) && (frameLayout.getTag() == null || wyVar.D <= 0.0f)) {
                return;
            }
            wyVar.D = 0.0f;
        }
    }
}
