package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qa1 extends s4.a0 {
    public boolean I;
    public final /* synthetic */ nb1 J;

    public qa1(nb1 nb1Var) {
        this.J = nb1Var;
    }

    @Override // s4.a0, s4.n0
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.a;
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new vv0(this, 23));
        }
    }

    @Override // s4.a0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.a0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // s4.a0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int i11;
        ab1 ab1Var;
        jw jwVar;
        float f7;
        int i12;
        nb1 nb1Var = this.J;
        ab1 ab1Var2 = nb1Var.N;
        boolean z10 = false;
        if (ab1Var2.V1) {
            return 0;
        }
        boolean z11 = ab1Var2.getScrollState() == 1;
        int paddingTop = nb1Var.N.getPaddingTop();
        if (i10 < 0 && nb1Var.y > 0 && nb1Var.D == 2) {
            nb1Var.N.setOverScrollMode(0);
            int L0 = nb1Var.F.L0();
            if (L0 == 0) {
                View m10 = nb1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.i0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = nb1Var.F.m(L0);
                if (m11 != null) {
                    int e = i0.a.e(L0, 1, org.telegram.messenger.i0.L(org.telegram.messenger.uz.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (e < Math.abs(i10)) {
                        i11 = -e;
                    }
                }
            } else if (L0 == 0) {
                View m12 = nb1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                nb1Var.N.setOverScrollMode(2);
                i11 = (int) c3.i0.D(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            ab1Var = nb1Var.N;
            if (ab1Var.l3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                ab1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (nb1Var.D != 0 || nb1Var.y <= 0) {
                return super.o0(i11, eVar, z0Var);
            }
            int o02 = super.o0(i11, eVar, z0Var);
            jw jwVar2 = nb1Var.x;
            if (jwVar2 != null) {
                jwVar2.a = o02;
            }
            int L02 = nb1Var.F.L0();
            View m13 = L02 == 0 ? nb1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.i0.L(4.0f)) {
                nb1Var.Y = 0L;
                nb1Var.Z = false;
                nb1Var.D = 2;
                jw jwVar3 = nb1Var.x;
                if (jwVar3 != null) {
                    ValueAnimator valueAnimator = jwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.v2 v2Var = jwVar3.H;
                    if (v2Var != null) {
                        v2Var.removeCallbacks(jwVar3.d0);
                    }
                    jwVar3.x = 0.0f;
                    jwVar3.y = false;
                    jwVar3.e0 = false;
                    nb1Var.x.f(0.0f);
                    nb1Var.x.I = nb1Var.N;
                }
            } else {
                if (nb1Var.Y == 0) {
                    nb1Var.Y = System.currentTimeMillis();
                }
                if (nb1Var.D == 2 && (jwVar = nb1Var.x) != null) {
                    jwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - nb1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (nb1Var.Z != z10) {
                    nb1Var.Z = z10;
                    if (nb1Var.D == 2) {
                        try {
                            nb1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        jw jwVar4 = nb1Var.x;
                        if (jwVar4 != null) {
                            jwVar4.a(z10);
                        }
                    }
                }
                if (nb1Var.D == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float L = 1.0f - (nb1Var.N.l3 / org.telegram.messenger.i0.L(72.0f));
                    ab1 ab1Var3 = nb1Var.N;
                    ab1Var3.setViewsOffset(ab1Var3.l3 - ((i10 * 0.2f) * L));
                }
                jw jwVar5 = nb1Var.x;
                if (jwVar5 != null) {
                    jwVar5.f(top2);
                    nb1Var.x.I = nb1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        ab1Var = nb1Var.N;
        if (ab1Var.l3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            ab1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (nb1Var.D != 0) {
        }
        return super.o0(i11, eVar, z0Var);
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.y > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }
}
