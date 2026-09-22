package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hf1 extends s4.c0 {
    public boolean I;
    public final /* synthetic */ fg1 J;

    public hf1(fg1 fg1Var) {
        this.J = fg1Var;
    }

    @Override // s4.c0, s4.o0
    public final void b0(of.e eVar, s4.z0 z0Var) {
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
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new e01(this, 18));
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
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        qf1 qf1Var;
        ax axVar;
        float f7;
        int i12;
        fg1 fg1Var = this.J;
        qf1 qf1Var2 = fg1Var.N;
        boolean z10 = false;
        if (qf1Var2.X1) {
            return 0;
        }
        boolean z11 = qf1Var2.getScrollState() == 1;
        int paddingTop = fg1Var.N.getPaddingTop();
        if (i10 < 0 && fg1Var.x > 0 && fg1Var.y == 2) {
            fg1Var.N.setOverScrollMode(0);
            int L0 = fg1Var.F.L0();
            if (L0 == 0) {
                View m10 = fg1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = fg1Var.F.m(L0);
                if (m11 != null) {
                    int f10 = hg.k0.f(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (f10 < Math.abs(i10)) {
                        i11 = -f10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = fg1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                fg1Var.N.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            qf1Var = fg1Var.N;
            if (qf1Var.f3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r15) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                qf1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (fg1Var.y != 0 || fg1Var.x <= 0) {
                return super.o0(i11, eVar, z0Var);
            }
            int o02 = super.o0(i11, eVar, z0Var);
            ax axVar2 = fg1Var.w;
            if (axVar2 != null) {
                axVar2.a = o02;
            }
            int L02 = fg1Var.F.L0();
            View m13 = L02 == 0 ? fg1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                fg1Var.Y = 0L;
                fg1Var.Z = false;
                fg1Var.y = 2;
                ax axVar3 = fg1Var.w;
                if (axVar3 != null) {
                    ValueAnimator valueAnimator = axVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.s2 s2Var = axVar3.H;
                    if (s2Var != null) {
                        s2Var.removeCallbacks(axVar3.d0);
                    }
                    axVar3.x = 0.0f;
                    axVar3.y = false;
                    axVar3.e0 = false;
                    fg1Var.w.f(0.0f);
                    fg1Var.w.I = fg1Var.N;
                }
            } else {
                if (fg1Var.Y == 0) {
                    fg1Var.Y = System.currentTimeMillis();
                }
                if (fg1Var.y == 2 && (axVar = fg1Var.w) != null) {
                    axVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - fg1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (fg1Var.Z != z10) {
                    fg1Var.Z = z10;
                    if (fg1Var.y == 2) {
                        try {
                            fg1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        ax axVar4 = fg1Var.w;
                        if (axVar4 != null) {
                            axVar4.a(z10);
                        }
                    }
                }
                if (fg1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (fg1Var.N.f3 / AndroidUtilities.dp(72.0f));
                    qf1 qf1Var3 = fg1Var.N;
                    qf1Var3.setViewsOffset(qf1Var3.f3 - ((i10 * 0.2f) * dp));
                }
                ax axVar5 = fg1Var.w;
                if (axVar5 != null) {
                    axVar5.f(top2);
                    fg1Var.w.I = fg1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        qf1Var = fg1Var.N;
        if (qf1Var.f3 != 0.0f) {
            f7 = ((int) r15) - i10;
            if (f7 >= 0.0f) {
            }
            qf1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (fg1Var.y != 0) {
        }
        return super.o0(i11, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
