package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class o extends qv0 implements r0.n {
    public final c5.e t0;
    public final /* synthetic */ p u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Context context) {
        super(context, null);
        this.u0 = pVar;
        this.t0 = new c5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        p pVar = this.u0;
        if (viewGroup == pVar.e && pVar.C.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) pVar).actionBar;
            boolean z4 = kVar.k0;
            int top = (((View) pVar.C.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) pVar.C.getParent()).getBottom();
            boolean z10 = false;
            if (i11 >= 0) {
                if (z4) {
                    tl0 currentListView = pVar.C.getCurrentListView();
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
                    tl0 currentListView2 = pVar.C.getCurrentListView();
                    if (pVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    pVar.e.B0();
                    return;
                }
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.p2) pVar).actionBar;
            kVar2.setCastShadows(pVar.e.getHeight() - bottom < 0);
            if (pVar.e.getHeight() - bottom >= 0) {
                tl0 currentListView3 = pVar.C.getCurrentListView();
                int L0 = ((f2.j0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.m1 K = currentListView3.K(L0);
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
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        p pVar = this.u0;
        try {
            if (viewGroup == pVar.e && pVar.C.isAttachedToWindow()) {
                tl0 currentListView = pVar.C.getCurrentListView();
                int bottom = ((View) pVar.C.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.p2) pVar).actionBar;
                kVar.setCastShadows(pVar.e.getHeight() - bottom < 0);
                if (pVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new lh.c3(this, 2));
        }
    }

    @Override // r0.m
    public final void o(int i10, View view) {
        this.t0.a = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
        return i10 == 2;
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
