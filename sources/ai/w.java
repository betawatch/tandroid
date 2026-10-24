package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class w extends ow0 implements r0.m {
    public final b2.u0 w0;
    public final /* synthetic */ x x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context) {
        super(context, null);
        this.x0 = xVar;
        this.w0 = new b2.u0();
    }

    @Override // r0.l
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        x xVar = this.x0;
        if (viewGroup == xVar.e && xVar.F.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) xVar).actionBar;
            boolean z10 = kVar.n0;
            int top = (((View) xVar.F.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) xVar.F.getParent()).getBottom();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    mm0 currentListView = xVar.F.getCurrentListView();
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
                    mm0 currentListView2 = xVar.F.getCurrentListView();
                    if (xVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    xVar.e.B0();
                    return;
                }
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.o2) xVar).actionBar;
            kVar2.setCastShadows(xVar.e.getHeight() - bottom < 0);
            if (xVar.e.getHeight() - bottom >= 0) {
                mm0 currentListView3 = xVar.F.getCurrentListView();
                int L0 = ((s4.b0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    s4.b1 K = currentListView3.K(L0);
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

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        x xVar = this.x0;
        try {
            if (viewGroup == xVar.e && xVar.F.isAttachedToWindow()) {
                mm0 currentListView = xVar.F.getCurrentListView();
                int bottom = ((View) xVar.F.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.o2) xVar).actionBar;
                kVar.setCastShadows(xVar.e.getHeight() - bottom < 0);
                if (xVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new a3.d(this, 7));
        }
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
