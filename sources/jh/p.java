package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p extends hv0 implements r0.n {
    public final a5.e s0;
    public final /* synthetic */ q t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Context context) {
        super(context, null);
        this.t0 = qVar;
        this.s0 = new a5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.ActionBar.l lVar2;
        q qVar = this.t0;
        if (viewGroup == qVar.e && qVar.B.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.o2) qVar).actionBar;
            boolean z10 = lVar.j0;
            int top = (((View) qVar.B.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int bottom = ((View) qVar.B.getParent()).getBottom();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    jl0 currentListView = qVar.B.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView.scrollBy(0, i13);
                    return;
                }
                if (i11 > 0) {
                    jl0 currentListView2 = qVar.B.getCurrentListView();
                    if (qVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    qVar.e.B0();
                    return;
                }
                return;
            }
            lVar2 = ((org.telegram.ui.ActionBar.o2) qVar).actionBar;
            lVar2.setCastShadows(qVar.e.getHeight() - bottom < 0);
            if (qVar.e.getHeight() - bottom >= 0) {
                jl0 currentListView3 = qVar.B.getCurrentListView();
                int L0 = ((f2.j0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.n1 K = currentListView3.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView3.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView3.scrollBy(0, i11);
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

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        q qVar = this.t0;
        try {
            if (viewGroup == qVar.e && qVar.B.isAttachedToWindow()) {
                jl0 currentListView = qVar.B.getCurrentListView();
                int bottom = ((View) qVar.B.getParent()).getBottom();
                lVar = ((org.telegram.ui.ActionBar.o2) qVar).actionBar;
                lVar.setCastShadows(qVar.e.getHeight() - bottom < 0);
                if (qVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new o(this, 0));
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
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
