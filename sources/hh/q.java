package hh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q extends zu0 implements r0.n {
    public final d5.p s0;
    public final /* synthetic */ r t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context) {
        super(context, null);
        this.t0 = rVar;
        this.s0 = new d5.p();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        r rVar = this.t0;
        if (viewGroup == rVar.e && rVar.B.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.n2) rVar).actionBar;
            boolean z10 = kVar.j0;
            int top = (((View) rVar.B.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) rVar.B.getParent()).getBottom();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    zk0 currentListView = rVar.B.getCurrentListView();
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
                    zk0 currentListView2 = rVar.B.getCurrentListView();
                    if (rVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    rVar.e.B0();
                    return;
                }
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.n2) rVar).actionBar;
            kVar2.setCastShadows(rVar.e.getHeight() - bottom < 0);
            if (rVar.e.getHeight() - bottom >= 0) {
                zk0 currentListView3 = rVar.B.getCurrentListView();
                int L0 = ((f2.k0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.o1 K = currentListView3.K(L0);
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
        org.telegram.ui.ActionBar.k kVar;
        r rVar = this.t0;
        try {
            if (viewGroup == rVar.e && rVar.B.isAttachedToWindow()) {
                zk0 currentListView = rVar.B.getCurrentListView();
                int bottom = ((View) rVar.B.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.n2) rVar).actionBar;
                kVar.setCastShadows(rVar.e.getHeight() - bottom < 0);
                if (rVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new f2.r(this, 16));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.m
    public final void p(int i10, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // r0.m
    public final void t(View view, View view2, int i10, int i11) {
        this.s0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
