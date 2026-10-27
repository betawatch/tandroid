package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ee1 extends s4.c0 {
    public boolean I;
    public final /* synthetic */ cf1 J;

    public ee1(cf1 cf1Var) {
        this.J = cf1Var;
    }

    @Override // s4.c0, s4.p0
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, b1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, b1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new oy0(this, 22));
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // s4.c0, s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        int i11;
        ne1 ne1Var;
        hw hwVar;
        float f7;
        int i12;
        cf1 cf1Var = this.J;
        ne1 ne1Var2 = cf1Var.N;
        boolean z10 = false;
        if (ne1Var2.V1) {
            return 0;
        }
        boolean z11 = ne1Var2.getScrollState() == 1;
        int paddingTop = cf1Var.N.getPaddingTop();
        if (i10 < 0 && cf1Var.x > 0 && cf1Var.y == 2) {
            cf1Var.N.setOverScrollMode(0);
            int L0 = cf1Var.F.L0();
            if (L0 == 0) {
                View m10 = cf1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = cf1Var.F.m(L0);
                if (m11 != null) {
                    int w10 = c3.h0.w(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (w10 < Math.abs(i10)) {
                        i11 = -w10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = cf1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                cf1Var.N.setOverScrollMode(2);
                i11 = (int) c3.h0.D(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            ne1Var = cf1Var.N;
            if (ne1Var.m3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                ne1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (cf1Var.y != 0 || cf1Var.x <= 0) {
                return super.o0(i11, eVar, b1Var);
            }
            int o02 = super.o0(i11, eVar, b1Var);
            hw hwVar2 = cf1Var.w;
            if (hwVar2 != null) {
                hwVar2.a = o02;
            }
            int L02 = cf1Var.F.L0();
            View m13 = L02 == 0 ? cf1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                cf1Var.Y = 0L;
                cf1Var.Z = false;
                cf1Var.y = 2;
                hw hwVar3 = cf1Var.w;
                if (hwVar3 != null) {
                    ValueAnimator valueAnimator = hwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.p2 p2Var = hwVar3.H;
                    if (p2Var != null) {
                        p2Var.removeCallbacks(hwVar3.d0);
                    }
                    hwVar3.x = 0.0f;
                    hwVar3.y = false;
                    hwVar3.e0 = false;
                    cf1Var.w.f(0.0f);
                    cf1Var.w.I = cf1Var.N;
                }
            } else {
                if (cf1Var.Y == 0) {
                    cf1Var.Y = System.currentTimeMillis();
                }
                if (cf1Var.y == 2 && (hwVar = cf1Var.w) != null) {
                    hwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - cf1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (cf1Var.Z != z10) {
                    cf1Var.Z = z10;
                    if (cf1Var.y == 2) {
                        try {
                            cf1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        hw hwVar4 = cf1Var.w;
                        if (hwVar4 != null) {
                            hwVar4.a(z10);
                        }
                    }
                }
                if (cf1Var.y == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (cf1Var.N.m3 / AndroidUtilities.dp(72.0f));
                    ne1 ne1Var3 = cf1Var.N;
                    ne1Var3.setViewsOffset(ne1Var3.m3 - ((i10 * 0.2f) * dp));
                }
                hw hwVar5 = cf1Var.w;
                if (hwVar5 != null) {
                    hwVar5.f(top2);
                    cf1Var.w.I = cf1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        ne1Var = cf1Var.N;
        if (ne1Var.m3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            ne1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (cf1Var.y != 0) {
        }
        return super.o0(i11, eVar, b1Var);
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, b1Var, i10);
            return;
        }
        mi.n nVar = new mi.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
