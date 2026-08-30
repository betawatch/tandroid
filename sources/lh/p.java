package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p extends qv0 implements r0.n {
    public final c5.e t0;
    public final /* synthetic */ q u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Context context) {
        super(context, null);
        this.u0 = qVar;
        this.t0 = new c5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        q qVar = this.u0;
        if (viewGroup == qVar.e && qVar.C.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) qVar).actionBar;
            boolean z4 = kVar.k0;
            int top = (((View) qVar.C.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) qVar.C.getParent()).getBottom();
            boolean z10 = false;
            if (i11 >= 0) {
                if (z4) {
                    sl0 currentListView = qVar.C.getCurrentListView();
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
                    sl0 currentListView2 = qVar.C.getCurrentListView();
                    if (qVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    qVar.e.B0();
                    return;
                }
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.p2) qVar).actionBar;
            kVar2.setCastShadows(qVar.e.getHeight() - bottom < 0);
            if (qVar.e.getHeight() - bottom >= 0) {
                sl0 currentListView3 = qVar.C.getCurrentListView();
                int L0 = ((f2.i0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.l1 K = currentListView3.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView3.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView3.scrollBy(0, i11);
                        z10 = true;
                    }
                }
            }
            if (z4) {
                if (z10 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        q qVar = this.u0;
        try {
            if (viewGroup == qVar.e && qVar.C.isAttachedToWindow()) {
                sl0 currentListView = qVar.C.getCurrentListView();
                int bottom = ((View) qVar.C.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.p2) qVar).actionBar;
                kVar.setCastShadows(qVar.e.getHeight() - bottom < 0);
                if (qVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.t0.a = 0;
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
        this.t0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
