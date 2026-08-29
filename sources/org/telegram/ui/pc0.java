package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pc0 extends org.telegram.ui.Components.hv0 implements r0.n {
    public final a5.e s0;
    public boolean t0;
    public final /* synthetic */ rc0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(rc0 rc0Var, Context context) {
        super(context, null);
        this.u0 = rc0Var;
        this.t0 = true;
        this.s0 = new a5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hc0 hc0Var;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.jl0 currentListView;
        rc0 rc0Var = this.u0;
        if (viewGroup == rc0Var.Q && (hc0Var = rc0Var.G0) != null && hc0Var.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
            boolean z10 = lVar.j0;
            int top = rc0Var.G0.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.jl0 currentListView2 = rc0Var.G0.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i13);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = rc0Var.G0.getCurrentListView()) != null) {
                int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.n1 K = currentListView.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView.scrollBy(0, i11);
                        z11 = true;
                    }
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        rc0 rc0Var = this.u0;
        if (rc0Var.G0 != null) {
            canvas.save();
            canvas.translate(0.0f, rc0Var.Q.getY());
            rc0Var.G0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.l lVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        rc0 rc0Var = this.u0;
        lVar = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
        if (view == lVar) {
            b5Var = ((org.telegram.ui.ActionBar.o2) rc0Var).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) rc0Var).parentLayout;
                lVar2 = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
                ((ActionBarLayout) b5Var2).q(canvas, lVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hc0 hc0Var;
        rc0 rc0Var = this.u0;
        try {
            if (viewGroup == rc0Var.Q && (hc0Var = rc0Var.G0) != null && hc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.jl0 currentListView = rc0Var.G0.getCurrentListView();
                int top = rc0Var.G0.getTop();
                if (currentListView == null || top != 0) {
                    return;
                }
                iArr[1] = i13;
                currentListView.scrollBy(0, i13);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new q00(this, 17));
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.u0.G0 != null && i10 == 2;
    }

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        rc0 rc0Var = this.u0;
        if (!z10) {
            rc0Var.A0(true);
        } else {
            rc0Var.k0(this.t0);
            this.t0 = false;
        }
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        this.s0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
