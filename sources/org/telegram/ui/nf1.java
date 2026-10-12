package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nf1 extends s4.b0 {
    public boolean I;
    public final /* synthetic */ lg1 J;

    public nf1(lg1 lg1Var) {
        this.J = lg1Var;
    }

    @Override // s4.b0, s4.n0
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new uz0(this, 19));
        }
    }

    @Override // s4.b0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.b0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // s4.b0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        wf1 wf1Var;
        ex exVar;
        float f7;
        int i12;
        lg1 lg1Var = this.J;
        wf1 wf1Var2 = lg1Var.N;
        boolean z10 = false;
        if (wf1Var2.V1) {
            return 0;
        }
        boolean z11 = wf1Var2.getScrollState() == 1;
        int paddingTop = lg1Var.N.getPaddingTop();
        if (i10 < 0 && lg1Var.x > 0 && lg1Var.y == 2) {
            lg1Var.N.setOverScrollMode(0);
            int L0 = lg1Var.F.L0();
            if (L0 == 0) {
                View m10 = lg1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = lg1Var.F.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.play_billing.k3.v(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i10)) {
                        i11 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = lg1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                lg1Var.N.setOverScrollMode(2);
                i11 = (int) com.google.android.gms.internal.play_billing.k3.B(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            wf1Var = lg1Var.N;
            if (wf1Var.d3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                wf1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (lg1Var.y != 0 || lg1Var.x <= 0) {
                return super.o0(i11, eVar, y0Var);
            }
            int o02 = super.o0(i11, eVar, y0Var);
            ex exVar2 = lg1Var.w;
            if (exVar2 != null) {
                exVar2.a = o02;
            }
            int L02 = lg1Var.F.L0();
            View m13 = L02 == 0 ? lg1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                lg1Var.Y = 0L;
                lg1Var.Z = false;
                lg1Var.y = 2;
                ex exVar3 = lg1Var.w;
                if (exVar3 != null) {
                    ValueAnimator valueAnimator = exVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.s2 s2Var = exVar3.H;
                    if (s2Var != null) {
                        s2Var.removeCallbacks(exVar3.d0);
                    }
                    exVar3.x = 0.0f;
                    exVar3.y = false;
                    exVar3.e0 = false;
                    lg1Var.w.f(0.0f);
                    lg1Var.w.I = lg1Var.N;
                }
            } else {
                if (lg1Var.Y == 0) {
                    lg1Var.Y = System.currentTimeMillis();
                }
                if (lg1Var.y == 2 && (exVar = lg1Var.w) != null) {
                    exVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - lg1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (lg1Var.Z != z10) {
                    lg1Var.Z = z10;
                    if (lg1Var.y == 2) {
                        try {
                            lg1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        ex exVar4 = lg1Var.w;
                        if (exVar4 != null) {
                            exVar4.a(z10);
                        }
                    }
                }
                if (lg1Var.y == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (lg1Var.N.d3 / AndroidUtilities.dp(72.0f));
                    wf1 wf1Var3 = lg1Var.N;
                    wf1Var3.setViewsOffset(wf1Var3.d3 - ((i10 * 0.2f) * dp));
                }
                ex exVar5 = lg1Var.w;
                if (exVar5 != null) {
                    exVar5.f(top2);
                    lg1Var.w.I = lg1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        wf1Var = lg1Var.N;
        if (wf1Var.d3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            wf1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (lg1Var.y != 0) {
        }
        return super.o0(i11, eVar, y0Var);
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        ki.o oVar = new ki.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
