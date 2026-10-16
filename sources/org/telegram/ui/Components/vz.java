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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class vz extends s4.r0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ wz c;

    public vz(wz wzVar, int i10) {
        this.c = wzVar;
        this.a = i10;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        iz izVar;
        wz wzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = wzVar.R0;
        s4.x0 x0Var = recyclerView.getLayoutManager().e;
        if (x0Var != null && x0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (wzVar.J0) {
                    wzVar.J0 = false;
                }
                if (i11 == 0) {
                    izVar = wzVar.G0;
                } else if (i11 == 1) {
                    izVar = wzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(i2.d.j(i11, "Unexpected argument: "));
                    }
                    izVar = wzVar.o0;
                }
                if (izVar != null) {
                    izVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (wzVar.T0 == null) {
                    hg.f1 f1Var = new hg.f1(wzVar, wzVar.c1, wzVar.t1.a(), wzVar.t1.f(), 1);
                    wzVar.T0 = f1Var;
                    f1Var.a();
                }
                wzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = wzVar.Q0;
            wy wyVar = wzVar.t1;
            if ((wyVar == null || !wyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    mm0 y3 = wzVar.y(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.b1 K = y3.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / wzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            wzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView z10 = wzVar.z(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        wzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        wzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, z10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(wzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(z10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (wzVar.J0) {
            wzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        wz wzVar = this.c;
        int i12 = this.a;
        wzVar.q(i12);
        wz.e(wzVar, i12, i11);
        if (i12 == 0) {
            wzVar.r(false);
        } else if (i12 == 1) {
            wzVar.l(false);
        } else if (i12 == 2) {
            wz.f(wzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = wzVar.n;
        if (SystemClock.elapsedRealtime() - wzVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        wzVar.H += f7;
        int dp = wzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = wzVar.H;
        if (f10 >= dp) {
            wzVar.M(false);
            return;
        }
        if (f10 <= (-dp)) {
            wzVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || wzVar.H >= 0.0f) && (frameLayout.getTag() == null || wzVar.H <= 0.0f)) {
                return;
            }
            wzVar.H = 0.0f;
        }
    }
}
