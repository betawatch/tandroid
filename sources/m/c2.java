package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ e2 a;

    public c2(e2 e2Var) {
        this.a = e2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        e2 e2Var = this.a;
        b2 b2Var = e2Var.D;
        x xVar = e2Var.L;
        if (i10 != 1 || xVar.getInputMethodMode() == 2 || xVar.getContentView() == null) {
            return;
        }
        e2Var.H.removeCallbacks(b2Var);
        b2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
