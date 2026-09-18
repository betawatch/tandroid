package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class id0 extends org.telegram.ui.Components.qv0 implements r0.m {
    public final b2.q0 w0;
    public boolean x0;
    public final /* synthetic */ kd0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id0(kd0 kd0Var, Context context) {
        super(context, null);
        this.y0 = kd0Var;
        this.x0 = true;
        this.w0 = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        ad0 ad0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.ml0 currentListView;
        kd0 kd0Var = this.y0;
        if (viewGroup == kd0Var.U && (ad0Var = kd0Var.K0) != null && ad0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) kd0Var).actionBar;
            boolean z10 = kVar.n0;
            int top = kd0Var.K0.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.ml0 currentListView2 = kd0Var.K0.getCurrentListView();
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
            if (top <= 0 && (currentListView = kd0Var.K0.getCurrentListView()) != null) {
                int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                if (L0 != -1) {
                    s4.c1 L = currentListView.L(L0);
                    int top2 = L != null ? L.a.getTop() : -1;
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

    @Override // org.telegram.ui.Components.qv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        kd0 kd0Var = this.y0;
        if (kd0Var.K0 != null) {
            canvas.save();
            canvas.translate(0.0f, kd0Var.U.getY());
            kd0Var.K0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j3);
        kd0 kd0Var = this.y0;
        kVar = ((org.telegram.ui.ActionBar.o2) kd0Var).actionBar;
        if (view == kVar) {
            e5Var = ((org.telegram.ui.ActionBar.o2) kd0Var).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.o2) kd0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.o2) kd0Var).actionBar;
                ((ActionBarLayout) e5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override // r0.m
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ad0 ad0Var;
        kd0 kd0Var = this.y0;
        try {
            if (viewGroup == kd0Var.U && (ad0Var = kd0Var.K0) != null && ad0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.ml0 currentListView = kd0Var.K0.getCurrentListView();
                int top = kd0Var.K0.getTop();
                if (currentListView == null || top != 0) {
                    return;
                }
                iArr[1] = i13;
                currentListView.scrollBy(0, i13);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new i10(this, 17));
        }
    }

    @Override // r0.l
    public final void o(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        kd0 kd0Var = this.y0;
        if (!z10) {
            kd0Var.A0(true);
        } else {
            kd0Var.k0(this.x0);
            this.x0 = false;
        }
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return this.y0.K0 != null && i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
