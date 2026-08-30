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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class jz extends f2.z0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ kz c;

    public jz(kz kzVar, int i10) {
        this.c = kzVar;
        this.a = i10;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        wy wyVar;
        kz kzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = kzVar.O0;
        f2.h1 h1Var = recyclerView.getLayoutManager().e;
        if (h1Var != null && h1Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (kzVar.G0) {
                    kzVar.G0 = false;
                }
                if (i11 == 0) {
                    wyVar = kzVar.D0;
                } else if (i11 == 1) {
                    wyVar = kzVar.S;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(kh.a2.j(i11, "Unexpected argument: "));
                    }
                    wyVar = kzVar.l0;
                }
                if (wyVar != null) {
                    wyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (kzVar.Q0 == null) {
                    zw zwVar = new zw(kzVar, kzVar.Z0, kzVar.q1.a(), kzVar.q1.f(), 0);
                    kzVar.Q0 = zwVar;
                    zwVar.a();
                }
                kzVar.Q0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = kzVar.N0;
            ky kyVar = kzVar.q1;
            if ((kyVar == null || !kyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i11] / (-dpf2);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    sl0 x10 = kzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    f2.l1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f11 = (bottom - (dp + i12)) / kzVar.Y0;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            kzVar.i(i11, i12, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = kzVar.y(i11);
                    int i13 = f10 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f10 > 0.5f) {
                        kzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        kzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new ih.b(kzVar, i11, 4));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (kzVar.G0) {
            kzVar.G0 = false;
        }
        this.b = false;
    }

    @Override // f2.z0
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
        float f10 = i11;
        FrameLayout frameLayout = kzVar.n;
        if (SystemClock.elapsedRealtime() - kzVar.C2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        kzVar.E += f10;
        int dp = kzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f11 = kzVar.E;
        if (f11 >= dp) {
            kzVar.O(false);
            return;
        }
        if (f11 <= (-dp)) {
            kzVar.O(true);
        } else {
            if ((frameLayout.getTag() != null || kzVar.E >= 0.0f) && (frameLayout.getTag() == null || kzVar.E <= 0.0f)) {
                return;
            }
            kzVar.E = 0.0f;
        }
    }
}
