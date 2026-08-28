package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.Components.xu0 implements r0.n {
    public final d5.p s0;
    public boolean t0;
    public final /* synthetic */ pc0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.u0 = pc0Var;
        this.t0 = true;
        this.s0 = new d5.p();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.wk0 currentListView;
        pc0 pc0Var = this.u0;
        if (viewGroup == pc0Var.Q && (fc0Var = pc0Var.G0) != null && fc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) pc0Var).actionBar;
            boolean z10 = kVar.j0;
            int top = pc0Var.G0.getTop();
            boolean z11 = false;
            if (i10 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.wk0 currentListView2 = pc0Var.G0.getCurrentListView();
                    iArr[1] = i10;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i12 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i12);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = pc0Var.G0.getCurrentListView()) != null) {
                int L0 = ((f2.m0) currentListView.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.q1 K = currentListView.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
                        currentListView.scrollBy(0, i10);
                        z11 = true;
                    }
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i10;
                } else {
                    iArr[1] = i10 - Math.max(top, i10);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        pc0 pc0Var = this.u0;
        if (pc0Var.G0 != null) {
            canvas.save();
            canvas.translate(0.0f, pc0Var.Q.getY());
            pc0Var.G0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        pc0 pc0Var = this.u0;
        kVar = ((org.telegram.ui.ActionBar.o2) pc0Var).actionBar;
        if (view == kVar) {
            b5Var = ((org.telegram.ui.ActionBar.o2) pc0Var).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) pc0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.o2) pc0Var).actionBar;
                ((ActionBarLayout) b5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        fc0 fc0Var;
        pc0 pc0Var = this.u0;
        try {
            if (viewGroup == pc0Var.Q && (fc0Var = pc0Var.G0) != null && fc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.wk0 currentListView = pc0Var.G0.getCurrentListView();
                int top = pc0Var.G0.getTop();
                if (currentListView == null || top != 0) {
                    return;
                }
                iArr[1] = i12;
                currentListView.scrollBy(0, i12);
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new o00(this, 17));
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        pc0 pc0Var = this.u0;
        if (!z10) {
            pc0Var.z0(true);
        } else {
            pc0Var.j0(this.t0);
            this.t0 = false;
        }
    }

    @Override // r0.m
    public final void p(int i9, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i9, int i10) {
        return this.u0.G0 != null && i9 == 2;
    }

    @Override // r0.m
    public final void t(View view, View view2, int i9, int i10) {
        this.s0.a = i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
