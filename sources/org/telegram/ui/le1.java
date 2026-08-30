package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class le1 extends f2.i0 {
    public boolean I;
    public final /* synthetic */ kf1 J;

    public le1(kf1 kf1Var) {
        this.J = kf1Var;
    }

    @Override // f2.i0, f2.v0
    public final void b0(bf.f fVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, i1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(fVar, i1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new vy0(this, 20));
        }
    }

    @Override // f2.i0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.i0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.K.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // f2.i0, f2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, bf.f fVar, f2.i1 i1Var) {
        int i11;
        ve1 ve1Var;
        vw vwVar;
        float f10;
        int i12;
        kf1 kf1Var = this.J;
        ve1 ve1Var2 = kf1Var.K;
        boolean z4 = false;
        if (ve1Var2.U1) {
            return 0;
        }
        boolean z10 = ve1Var2.getScrollState() == 1;
        int paddingTop = kf1Var.K.getPaddingTop();
        if (i10 < 0 && kf1Var.x > 0 && kf1Var.y == 2) {
            kf1Var.K.setOverScrollMode(0);
            int L0 = kf1Var.C.L0();
            if (L0 == 0) {
                View m9 = kf1Var.C.m(L0);
                if (m9 != null) {
                    m9.setTranslationX(0.0f);
                }
                if (m9 != null && m9.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z10) {
                View m10 = kf1Var.C.m(L0);
                if (m10 != null) {
                    int e = e2.c.e(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m10.getTop() - paddingTop));
                    if (e < Math.abs(i10)) {
                        i11 = -e;
                    }
                }
            } else if (L0 == 0) {
                View m11 = kf1Var.C.m(L0);
                float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                kf1Var.K.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            ve1Var = kf1Var.K;
            if (ve1Var.c3 != 0.0f && i10 > 0 && z10) {
                f10 = ((int) r15) - i10;
                if (f10 >= 0.0f) {
                    i12 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i12 = 0;
                }
                ve1Var.setViewsOffset(f10);
                i11 = i12;
            }
            if (kf1Var.y != 0 || kf1Var.x <= 0) {
                return super.o0(i11, fVar, i1Var);
            }
            int o02 = super.o0(i11, fVar, i1Var);
            vw vwVar2 = kf1Var.w;
            if (vwVar2 != null) {
                vwVar2.a = o02;
            }
            int L02 = kf1Var.C.L0();
            View m12 = L02 == 0 ? kf1Var.C.m(L02) : null;
            if (m12 != null) {
                m12.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m12 == null || m12.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                kf1Var.V = 0L;
                kf1Var.W = false;
                kf1Var.y = 2;
                vw vwVar3 = kf1Var.w;
                if (vwVar3 != null) {
                    ValueAnimator valueAnimator = vwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = vwVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(vwVar3.d0);
                    }
                    vwVar3.x = 0.0f;
                    vwVar3.y = false;
                    vwVar3.e0 = false;
                    kf1Var.w.f(0.0f);
                    kf1Var.w.I = kf1Var.K;
                }
            } else {
                if (kf1Var.V == 0) {
                    kf1Var.V = System.currentTimeMillis();
                }
                if (kf1Var.y == 2 && (vwVar = kf1Var.w) != null) {
                    vwVar.h();
                }
                float top2 = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - kf1Var.V;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z4 = true;
                }
                if (kf1Var.W != z4) {
                    kf1Var.W = z4;
                    if (kf1Var.y == 2) {
                        try {
                            kf1Var.K.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        vw vwVar4 = kf1Var.w;
                        if (vwVar4 != null) {
                            vwVar4.a(z4);
                        }
                    }
                }
                if (kf1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z10) {
                    float dp = 1.0f - (kf1Var.K.c3 / AndroidUtilities.dp(72.0f));
                    ve1 ve1Var3 = kf1Var.K;
                    ve1Var3.setViewsOffset(ve1Var3.c3 - ((i10 * 0.2f) * dp));
                }
                vw vwVar5 = kf1Var.w;
                if (vwVar5 != null) {
                    vwVar5.f(top2);
                    kf1Var.w.I = kf1Var.K;
                }
            }
            if (m12 != null) {
                m12.invalidate();
            }
            return o02;
        }
        i11 = i10;
        ve1Var = kf1Var.K;
        if (ve1Var.c3 != 0.0f) {
            f10 = ((int) r15) - i10;
            if (f10 >= 0.0f) {
            }
            ve1Var.setViewsOffset(f10);
            i11 = i12;
        }
        if (kf1Var.y != 0) {
        }
        return super.o0(i11, fVar, i1Var);
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, i1Var, i10);
            return;
        }
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
