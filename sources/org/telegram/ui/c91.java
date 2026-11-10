package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c91 extends v4.b0 {
    public boolean I;
    public final /* synthetic */ z91 J;

    public c91(z91 z91Var) {
        this.J = z91Var;
    }

    @Override // v4.b0, v4.n0
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.a;
        try {
            super.b0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new uu0(this, 21));
        }
    }

    @Override // v4.b0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.b0
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.J.N.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // v4.b0, v4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        l91 l91Var;
        iv ivVar;
        float f10;
        int i11;
        z91 z91Var = this.J;
        l91 l91Var2 = z91Var.N;
        boolean z9 = false;
        if (l91Var2.V1) {
            return 0;
        }
        boolean z10 = l91Var2.getScrollState() == 1;
        int paddingTop = z91Var.N.getPaddingTop();
        if (i7 < 0 && z91Var.y > 0 && z91Var.D == 2) {
            z91Var.N.setOverScrollMode(0);
            int L0 = z91Var.F.L0();
            if (L0 == 0) {
                View m10 = z91Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.g0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z10) {
                View m11 = z91Var.F.m(L0);
                if (m11 != null) {
                    int e10 = com.google.android.recaptcha.internal.a.e(L0, 1, org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (e10 < Math.abs(i7)) {
                        i10 = -e10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = z91Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                z91Var.N.setOverScrollMode(2);
                i10 = (int) com.google.android.recaptcha.internal.a.C(top, 0.25f, 0.45f, i7);
                if (i10 > -1) {
                    i10 = -1;
                }
            }
            l91Var = z91Var.N;
            if (l91Var.l3 != 0.0f && i7 > 0 && z10) {
                f10 = ((int) r14) - i7;
                if (f10 >= 0.0f) {
                    i11 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i11 = 0;
                }
                l91Var.setViewsOffset(f10);
                i10 = i11;
            }
            if (z91Var.D != 0 || z91Var.y <= 0) {
                return super.o0(i10, v0Var, a1Var);
            }
            int o02 = super.o0(i10, v0Var, a1Var);
            iv ivVar2 = z91Var.x;
            if (ivVar2 != null) {
                ivVar2.a = o02;
            }
            int L02 = z91Var.F.L0();
            View m13 = L02 == 0 ? z91Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.g0.L(4.0f)) {
                z91Var.Y = 0L;
                z91Var.Z = false;
                z91Var.D = 2;
                iv ivVar3 = z91Var.x;
                if (ivVar3 != null) {
                    ValueAnimator valueAnimator = ivVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.t2 t2Var = ivVar3.H;
                    if (t2Var != null) {
                        t2Var.removeCallbacks(ivVar3.d0);
                    }
                    ivVar3.x = 0.0f;
                    ivVar3.y = false;
                    ivVar3.e0 = false;
                    z91Var.x.f(0.0f);
                    z91Var.x.I = z91Var.N;
                }
            } else {
                if (z91Var.Y == 0) {
                    z91Var.Y = System.currentTimeMillis();
                }
                if (z91Var.D == 2 && (ivVar = z91Var.x) != null) {
                    ivVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - z91Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z9 = true;
                }
                if (z91Var.Z != z9) {
                    z91Var.Z = z9;
                    if (z91Var.D == 2) {
                        try {
                            z91Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        iv ivVar4 = z91Var.x;
                        if (ivVar4 != null) {
                            ivVar4.a(z9);
                        }
                    }
                }
                if (z91Var.D == 2 && i10 - o02 != 0 && i7 < 0 && z10) {
                    float L = 1.0f - (z91Var.N.l3 / org.telegram.messenger.g0.L(72.0f));
                    l91 l91Var3 = z91Var.N;
                    l91Var3.setViewsOffset(l91Var3.l3 - ((i7 * 0.2f) * L));
                }
                iv ivVar5 = z91Var.x;
                if (ivVar5 != null) {
                    ivVar5.f(top2);
                    z91Var.x.I = z91Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i10 = i7;
        l91Var = z91Var.N;
        if (l91Var.l3 != 0.0f) {
            f10 = ((int) r14) - i7;
            if (f10 >= 0.0f) {
            }
            l91Var.setViewsOffset(f10);
            i10 = i11;
        }
        if (z91Var.D != 0) {
        }
        return super.o0(i10, v0Var, a1Var);
    }

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        if (this.J.y > 0 && i7 == 1) {
            super.v0(recyclerView, a1Var, i7);
            return;
        }
        mi.m mVar = new mi.m(recyclerView.getContext(), 0);
        mVar.a = i7;
        w0(mVar);
    }
}
