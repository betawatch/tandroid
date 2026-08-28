package gh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends xu0 implements r0.n {
    public final d5.p s0;
    public final /* synthetic */ r t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context) {
        super(context, null);
        this.t0 = rVar;
        this.s0 = new d5.p();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        r rVar = this.t0;
        if (viewGroup == rVar.e && rVar.B.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) rVar).actionBar;
            boolean z10 = kVar.j0;
            int top = (((View) rVar.B.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) rVar.B.getParent()).getBottom();
            boolean z11 = false;
            if (i10 >= 0) {
                if (z10) {
                    wk0 currentListView = rVar.B.getCurrentListView();
                    iArr[1] = i10;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView == null || (i12 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView.scrollBy(0, i12);
                    return;
                }
                if (i10 > 0) {
                    wk0 currentListView2 = rVar.B.getCurrentListView();
                    if (rVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i10;
                    rVar.e.B0();
                    return;
                }
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.o2) rVar).actionBar;
            kVar2.setCastShadows(rVar.e.getHeight() - bottom < 0);
            if (rVar.e.getHeight() - bottom >= 0) {
                wk0 currentListView3 = rVar.B.getCurrentListView();
                int L0 = ((f2.m0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.q1 K = currentListView3.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView3.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
                        currentListView3.scrollBy(0, i10);
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

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        r rVar = this.t0;
        try {
            if (viewGroup == rVar.e && rVar.B.isAttachedToWindow()) {
                wk0 currentListView = rVar.B.getCurrentListView();
                int bottom = ((View) rVar.B.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.o2) rVar).actionBar;
                kVar.setCastShadows(rVar.e.getHeight() - bottom < 0);
                if (rVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new fh.o1(this, 5));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // r0.m
    public final void p(int i9, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i9, int i10) {
        return i9 == 2;
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
