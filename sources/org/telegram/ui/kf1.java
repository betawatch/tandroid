package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kf1 extends s4.c0 {
    public boolean I;
    public final /* synthetic */ ig1 J;

    public kf1(ig1 ig1Var) {
        this.J = ig1Var;
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
            AndroidUtilities.runOnUIThread(new k01(this, 18));
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
        tf1 tf1Var;
        cx cxVar;
        float f7;
        int i12;
        ig1 ig1Var = this.J;
        tf1 tf1Var2 = ig1Var.N;
        boolean z10 = false;
        if (tf1Var2.X1) {
            return 0;
        }
        boolean z11 = tf1Var2.getScrollState() == 1;
        int paddingTop = ig1Var.N.getPaddingTop();
        if (i10 < 0 && ig1Var.x > 0 && ig1Var.y == 2) {
            ig1Var.N.setOverScrollMode(0);
            int L0 = ig1Var.F.L0();
            if (L0 == 0) {
                View m10 = ig1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = ig1Var.F.m(L0);
                if (m11 != null) {
                    int B = hc.b.B(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (B < Math.abs(i10)) {
                        i11 = -B;
                    }
                }
            } else if (L0 == 0) {
                View m12 = ig1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                ig1Var.N.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            tf1Var = ig1Var.N;
            if (tf1Var.f3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r15) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                tf1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (ig1Var.y != 0 || ig1Var.x <= 0) {
                return super.o0(i11, eVar, z0Var);
            }
            int o02 = super.o0(i11, eVar, z0Var);
            cx cxVar2 = ig1Var.w;
            if (cxVar2 != null) {
                cxVar2.a = o02;
            }
            int L02 = ig1Var.F.L0();
            View m13 = L02 == 0 ? ig1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                ig1Var.Y = 0L;
                ig1Var.Z = false;
                ig1Var.y = 2;
                cx cxVar3 = ig1Var.w;
                if (cxVar3 != null) {
                    ValueAnimator valueAnimator = cxVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = cxVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(cxVar3.d0);
                    }
                    cxVar3.x = 0.0f;
                    cxVar3.y = false;
                    cxVar3.e0 = false;
                    ig1Var.w.f(0.0f);
                    ig1Var.w.I = ig1Var.N;
                }
            } else {
                if (ig1Var.Y == 0) {
                    ig1Var.Y = System.currentTimeMillis();
                }
                if (ig1Var.y == 2 && (cxVar = ig1Var.w) != null) {
                    cxVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - ig1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (ig1Var.Z != z10) {
                    ig1Var.Z = z10;
                    if (ig1Var.y == 2) {
                        try {
                            ig1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        cx cxVar4 = ig1Var.w;
                        if (cxVar4 != null) {
                            cxVar4.a(z10);
                        }
                    }
                }
                if (ig1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (ig1Var.N.f3 / AndroidUtilities.dp(72.0f));
                    tf1 tf1Var3 = ig1Var.N;
                    tf1Var3.setViewsOffset(tf1Var3.f3 - ((i10 * 0.2f) * dp));
                }
                cx cxVar5 = ig1Var.w;
                if (cxVar5 != null) {
                    cxVar5.f(top2);
                    ig1Var.w.I = ig1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        tf1Var = ig1Var.N;
        if (tf1Var.f3 != 0.0f) {
            f7 = ((int) r15) - i10;
            if (f7 >= 0.0f) {
            }
            tf1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (ig1Var.y != 0) {
        }
        return super.o0(i11, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ii.o oVar = new ii.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
