package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class gf1 extends s4.c0 {
    public boolean I;
    public final /* synthetic */ eg1 J;

    public gf1(eg1 eg1Var) {
        this.J = eg1Var;
    }

    @Override // s4.c0, s4.o0
    public final void b0(pf.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new f01(this, 18));
        }
    }

    @Override // s4.c0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.c0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // s4.c0, s4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, pf.e eVar, s4.z0 z0Var) {
        int i11;
        pf1 pf1Var;
        ax axVar;
        float f7;
        int i12;
        eg1 eg1Var = this.J;
        pf1 pf1Var2 = eg1Var.N;
        boolean z10 = false;
        if (pf1Var2.X1) {
            return 0;
        }
        boolean z11 = pf1Var2.getScrollState() == 1;
        int paddingTop = eg1Var.N.getPaddingTop();
        if (i10 < 0 && eg1Var.x > 0 && eg1Var.y == 2) {
            eg1Var.N.setOverScrollMode(0);
            int L0 = eg1Var.F.L0();
            if (L0 == 0) {
                View m10 = eg1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = eg1Var.F.m(L0);
                if (m11 != null) {
                    int w10 = com.google.android.gms.internal.vision.e2.w(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (w10 < Math.abs(i10)) {
                        i11 = -w10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = eg1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                eg1Var.N.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            pf1Var = eg1Var.N;
            if (pf1Var.f3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r15) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                pf1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (eg1Var.y != 0 || eg1Var.x <= 0) {
                return super.o0(i11, eVar, z0Var);
            }
            int o02 = super.o0(i11, eVar, z0Var);
            ax axVar2 = eg1Var.w;
            if (axVar2 != null) {
                axVar2.a = o02;
            }
            int L02 = eg1Var.F.L0();
            View m13 = L02 == 0 ? eg1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                eg1Var.Y = 0L;
                eg1Var.Z = false;
                eg1Var.y = 2;
                ax axVar3 = eg1Var.w;
                if (axVar3 != null) {
                    ValueAnimator valueAnimator = axVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = axVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(axVar3.d0);
                    }
                    axVar3.x = 0.0f;
                    axVar3.y = false;
                    axVar3.e0 = false;
                    eg1Var.w.f(0.0f);
                    eg1Var.w.I = eg1Var.N;
                }
            } else {
                if (eg1Var.Y == 0) {
                    eg1Var.Y = System.currentTimeMillis();
                }
                if (eg1Var.y == 2 && (axVar = eg1Var.w) != null) {
                    axVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - eg1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (eg1Var.Z != z10) {
                    eg1Var.Z = z10;
                    if (eg1Var.y == 2) {
                        try {
                            eg1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        ax axVar4 = eg1Var.w;
                        if (axVar4 != null) {
                            axVar4.a(z10);
                        }
                    }
                }
                if (eg1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (eg1Var.N.f3 / AndroidUtilities.dp(72.0f));
                    pf1 pf1Var3 = eg1Var.N;
                    pf1Var3.setViewsOffset(pf1Var3.f3 - ((i10 * 0.2f) * dp));
                }
                ax axVar5 = eg1Var.w;
                if (axVar5 != null) {
                    axVar5.f(top2);
                    eg1Var.w.I = eg1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        pf1Var = eg1Var.N;
        if (pf1Var.f3 != 0.0f) {
            f7 = ((int) r15) - i10;
            if (f7 >= 0.0f) {
            }
            pf1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (eg1Var.y != 0) {
        }
        return super.o0(i11, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ki.p pVar = new ki.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }
}
