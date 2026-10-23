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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public class sz extends s4.r0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ tz c;

    public sz(tz tzVar, int i10) {
        this.c = tzVar;
        this.a = i10;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        gz gzVar;
        tz tzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = tzVar.R0;
        s4.x0 x0Var = recyclerView.getLayoutManager().e;
        if (x0Var != null && x0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (tzVar.J0) {
                    tzVar.J0 = false;
                }
                if (i11 == 0) {
                    gzVar = tzVar.G0;
                } else if (i11 == 1) {
                    gzVar = tzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(i2.e.j(i11, "Unexpected argument: "));
                    }
                    gzVar = tzVar.o0;
                }
                if (gzVar != null) {
                    gzVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (tzVar.T0 == null) {
                    hg.f1 f1Var = new hg.f1(tzVar, tzVar.c1, tzVar.t1.a(), tzVar.t1.f(), 1);
                    tzVar.T0 = f1Var;
                    f1Var.a();
                }
                tzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = tzVar.Q0;
            uy uyVar = tzVar.t1;
            if ((uyVar == null || !uyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    jm0 y3 = tzVar.y(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.b1 K = y3.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / tzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            tzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView z10 = tzVar.z(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        tzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        tzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, z10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(tzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(z10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (tzVar.J0) {
            tzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        tz tzVar = this.c;
        int i12 = this.a;
        tzVar.p(i12);
        tz.e(tzVar, i12, i11);
        if (i12 == 0) {
            tzVar.q(false);
        } else if (i12 == 1) {
            tzVar.l(false);
        } else if (i12 == 2) {
            tz.f(tzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = tzVar.n;
        if (SystemClock.elapsedRealtime() - tzVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        tzVar.H += f7;
        int dp = tzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = tzVar.H;
        if (f10 >= dp) {
            tzVar.M(false);
            return;
        }
        if (f10 <= (-dp)) {
            tzVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || tzVar.H >= 0.0f) && (frameLayout.getTag() == null || tzVar.H <= 0.0f)) {
                return;
            }
            tzVar.H = 0.0f;
        }
    }
}
