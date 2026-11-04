package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q81 extends u4.b0 {
    public boolean I;
    public final /* synthetic */ m91 J;

    public q81(m91 m91Var) {
        this.J = m91Var;
    }

    @Override // u4.b0, u4.o0
    public final void b0(tf.e eVar, u4.a1 a1Var) {
        boolean z10 = org.telegram.messenger.r2.a;
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new pu0(this, 20));
        }
    }

    @Override // u4.b0
    public final void b1(View view, View view2, int i3, int i10) {
        this.I = true;
        super.b1(view, view2, i3, i10);
        this.I = false;
    }

    @Override // u4.b0
    public final void h1(int i3, int i10) {
        if (this.I) {
            i10 -= this.J.O.getPaddingTop();
        }
        super.h1(i3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // u4.b0, u4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        int i10;
        z81 z81Var;
        cv cvVar;
        float f10;
        int i11;
        m91 m91Var = this.J;
        z81 z81Var2 = m91Var.O;
        boolean z10 = false;
        if (z81Var2.W1) {
            return 0;
        }
        boolean z11 = z81Var2.getScrollState() == 1;
        int paddingTop = m91Var.O.getPaddingTop();
        if (i3 < 0 && m91Var.y > 0 && m91Var.E == 2) {
            m91Var.O.setOverScrollMode(0);
            int L0 = m91Var.G.L0();
            if (L0 == 0) {
                View m10 = m91Var.G.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.g0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = m91Var.G.m(L0);
                if (m11 != null) {
                    int e10 = com.google.android.recaptcha.internal.a.e(L0, 1, org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (e10 < Math.abs(i3)) {
                        i10 = -e10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = m91Var.G.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                m91Var.O.setOverScrollMode(2);
                i10 = (int) com.google.android.recaptcha.internal.a.B(top, 0.25f, 0.45f, i3);
                if (i10 > -1) {
                    i10 = -1;
                }
            }
            z81Var = m91Var.O;
            if (z81Var.m3 != 0.0f && i3 > 0 && z11) {
                f10 = ((int) r14) - i3;
                if (f10 >= 0.0f) {
                    i11 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i11 = 0;
                }
                z81Var.setViewsOffset(f10);
                i10 = i11;
            }
            if (m91Var.E != 0 || m91Var.y <= 0) {
                return super.o0(i10, eVar, a1Var);
            }
            int o02 = super.o0(i10, eVar, a1Var);
            cv cvVar2 = m91Var.x;
            if (cvVar2 != null) {
                cvVar2.a = o02;
            }
            int L02 = m91Var.G.L0();
            View m13 = L02 == 0 ? m91Var.G.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.g0.L(4.0f)) {
                m91Var.Z = 0L;
                m91Var.a0 = false;
                m91Var.E = 2;
                cv cvVar3 = m91Var.x;
                if (cvVar3 != null) {
                    ValueAnimator valueAnimator = cvVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.t2 t2Var = cvVar3.H;
                    if (t2Var != null) {
                        t2Var.removeCallbacks(cvVar3.d0);
                    }
                    cvVar3.x = 0.0f;
                    cvVar3.y = false;
                    cvVar3.e0 = false;
                    m91Var.x.f(0.0f);
                    m91Var.x.I = m91Var.O;
                }
            } else {
                if (m91Var.Z == 0) {
                    m91Var.Z = System.currentTimeMillis();
                }
                if (m91Var.E == 2 && (cvVar = m91Var.x) != null) {
                    cvVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - m91Var.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (m91Var.a0 != z10) {
                    m91Var.a0 = z10;
                    if (m91Var.E == 2) {
                        try {
                            m91Var.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        cv cvVar4 = m91Var.x;
                        if (cvVar4 != null) {
                            cvVar4.a(z10);
                        }
                    }
                }
                if (m91Var.E == 2 && i10 - o02 != 0 && i3 < 0 && z11) {
                    float L = 1.0f - (m91Var.O.m3 / org.telegram.messenger.g0.L(72.0f));
                    z81 z81Var3 = m91Var.O;
                    z81Var3.setViewsOffset(z81Var3.m3 - ((i3 * 0.2f) * L));
                }
                cv cvVar5 = m91Var.x;
                if (cvVar5 != null) {
                    cvVar5.f(top2);
                    m91Var.x.I = m91Var.O;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i10 = i3;
        z81Var = m91Var.O;
        if (z81Var.m3 != 0.0f) {
            f10 = ((int) r14) - i3;
            if (f10 >= 0.0f) {
            }
            z81Var.setViewsOffset(f10);
            i10 = i11;
        }
        if (m91Var.E != 0) {
        }
        return super.o0(i10, eVar, a1Var);
    }

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        if (this.J.y > 0 && i3 == 1) {
            super.v0(recyclerView, a1Var, i3);
            return;
        }
        ni.m mVar = new ni.m(recyclerView.getContext(), 0);
        mVar.a = i3;
        w0(mVar);
    }
}
