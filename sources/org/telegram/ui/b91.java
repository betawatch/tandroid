package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b91 extends v4.c0 {
    public boolean I;
    public final /* synthetic */ y91 J;

    public b91(y91 y91Var) {
        this.J = y91Var;
    }

    @Override // v4.c0, v4.p0
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.a;
        try {
            super.b0(x0Var, c1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new ru0(this, 21));
        }
    }

    @Override // v4.c0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.c0
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.J.O.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // v4.c0, v4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        k91 k91Var;
        jv jvVar;
        float f10;
        int i11;
        y91 y91Var = this.J;
        k91 k91Var2 = y91Var.O;
        boolean z10 = false;
        if (k91Var2.W1) {
            return 0;
        }
        boolean z11 = k91Var2.getScrollState() == 1;
        int paddingTop = y91Var.O.getPaddingTop();
        if (i7 < 0 && y91Var.y > 0 && y91Var.E == 2) {
            y91Var.O.setOverScrollMode(0);
            int L0 = y91Var.G.L0();
            if (L0 == 0) {
                View m10 = y91Var.G.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.g0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = y91Var.G.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.vision.e2.v(L0, 1, org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i7)) {
                        i10 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = y91Var.G.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                y91Var.O.setOverScrollMode(2);
                i10 = (int) com.google.android.gms.internal.vision.e2.C(top, 0.25f, 0.45f, i7);
                if (i10 > -1) {
                    i10 = -1;
                }
            }
            k91Var = y91Var.O;
            if (k91Var.m3 != 0.0f && i7 > 0 && z11) {
                f10 = ((int) r14) - i7;
                if (f10 >= 0.0f) {
                    i11 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i11 = 0;
                }
                k91Var.setViewsOffset(f10);
                i10 = i11;
            }
            if (y91Var.E != 0 || y91Var.y <= 0) {
                return super.o0(i10, x0Var, c1Var);
            }
            int o02 = super.o0(i10, x0Var, c1Var);
            jv jvVar2 = y91Var.x;
            if (jvVar2 != null) {
                jvVar2.a = o02;
            }
            int L02 = y91Var.G.L0();
            View m13 = L02 == 0 ? y91Var.G.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.g0.L(4.0f)) {
                y91Var.Z = 0L;
                y91Var.a0 = false;
                y91Var.E = 2;
                jv jvVar3 = y91Var.x;
                if (jvVar3 != null) {
                    ValueAnimator valueAnimator = jvVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.u2 u2Var = jvVar3.H;
                    if (u2Var != null) {
                        u2Var.removeCallbacks(jvVar3.d0);
                    }
                    jvVar3.x = 0.0f;
                    jvVar3.y = false;
                    jvVar3.e0 = false;
                    y91Var.x.f(0.0f);
                    y91Var.x.I = y91Var.O;
                }
            } else {
                if (y91Var.Z == 0) {
                    y91Var.Z = System.currentTimeMillis();
                }
                if (y91Var.E == 2 && (jvVar = y91Var.x) != null) {
                    jvVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - y91Var.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (y91Var.a0 != z10) {
                    y91Var.a0 = z10;
                    if (y91Var.E == 2) {
                        try {
                            y91Var.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        jv jvVar4 = y91Var.x;
                        if (jvVar4 != null) {
                            jvVar4.a(z10);
                        }
                    }
                }
                if (y91Var.E == 2 && i10 - o02 != 0 && i7 < 0 && z11) {
                    float L = 1.0f - (y91Var.O.m3 / org.telegram.messenger.g0.L(72.0f));
                    k91 k91Var3 = y91Var.O;
                    k91Var3.setViewsOffset(k91Var3.m3 - ((i7 * 0.2f) * L));
                }
                jv jvVar5 = y91Var.x;
                if (jvVar5 != null) {
                    jvVar5.f(top2);
                    y91Var.x.I = y91Var.O;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i10 = i7;
        k91Var = y91Var.O;
        if (k91Var.m3 != 0.0f) {
            f10 = ((int) r14) - i7;
            if (f10 >= 0.0f) {
            }
            k91Var.setViewsOffset(f10);
            i10 = i11;
        }
        if (y91Var.E != 0) {
        }
        return super.o0(i10, x0Var, c1Var);
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        if (this.J.y > 0 && i7 == 1) {
            super.v0(recyclerView, c1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }
}
