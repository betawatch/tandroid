package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class oq0 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ pq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(pq0 pq0Var, pq0 pq0Var2) {
        super(pq0Var2);
        this.x = pq0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        fr0 fr0Var = this.x.H0;
        if (fr0Var.isDismissed() || !fr0Var.Z) {
            return false;
        }
        return !fr0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        pq0 pq0Var = this.x;
        fr0 fr0Var = pq0Var.H0;
        int i10 = fr0.b1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != fr0Var.h && childAt != fr0Var.w && childAt != fr0Var.T[1] && childAt != fr0Var.y && childAt != fr0Var.c && childAt != fr0Var.d0 && childAt != fr0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        hq0 hq0Var = fr0Var.G;
        fr0Var.u0 = f7;
        int i12 = pq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            fr0Var.q0 = (int) ((pq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            hq0Var.setTranslationY(f12);
            if (z10) {
                fr0Var.H.setTranslationY(f12);
            } else {
                fr0Var.H.setTranslationY(f12 + fr0Var.G.getPaddingTop());
            }
        } else {
            int i13 = pq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                fr0Var.q0 = (int) ((pq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    hq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    hq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        fr0Var.G.setTopGlowOffset((int) (fr0Var.q0 + fr0Var.u0));
        fr0Var.b.setTranslationY(fr0Var.q0 + fr0Var.u0);
        fr0Var.R.setTranslationY(fr0Var.q0 + fr0Var.u0);
        fr0Var.c.invalidate();
        fr0Var.setCurrentPanTranslationY(fr0Var.u0);
        fr0Var.a1();
        pq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        fr0 fr0Var = this.x.H0;
        jq0 jq0Var = fr0Var.d;
        if (jq0Var == null || !jq0Var.m()) {
            int i10 = fr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        fr0Var.s0 = false;
        int i11 = fr0Var.q0;
        fr0Var.r0 = i11;
        fr0Var.G.setTopGlowOffset(i11);
        fr0Var.b.setTranslationY(fr0Var.q0);
        fr0Var.R.setTranslationY(fr0Var.q0);
        fr0Var.G.setTranslationY(0.0f);
        fr0Var.H.setTranslationY(0.0f);
        fr0Var.a1();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        pq0 pq0Var = this.x;
        fr0 fr0Var = pq0Var.H0;
        int i11 = fr0Var.r0;
        int i12 = fr0Var.q0;
        if (i11 != i12) {
            pq0Var.B0 = i11;
            pq0Var.C0 = i12;
            fr0Var.s0 = true;
            fr0Var.q0 = i11;
        } else {
            pq0Var.B0 = -1;
        }
        int i13 = pq0Var.z0;
        int i14 = pq0Var.A0;
        if (i13 != i14) {
            pq0Var.D0 = 0;
            pq0Var.E0 = 0;
            fr0Var.s0 = true;
            if (z10) {
                pq0Var.E0 = i13 - i14;
            } else {
                pq0Var.E0 = 0 - (i13 - i14);
            }
            fr0Var.q0 = z10 ? pq0Var.B0 : pq0Var.C0;
        } else {
            pq0Var.D0 = -1;
        }
        fr0Var.G.setTopGlowOffset((int) (fr0Var.u0 + fr0Var.q0));
        fr0Var.b.setTranslationY(fr0Var.u0 + fr0Var.q0);
        fr0Var.R.setTranslationY(fr0Var.u0 + fr0Var.q0);
        pq0Var.invalidate();
    }
}
