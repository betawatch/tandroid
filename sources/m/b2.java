package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class b2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ d2 a;

    public b2(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        d2 d2Var = this.a;
        a2 a2Var = d2Var.G;
        x xVar = d2Var.O;
        if (i10 != 1 || xVar.getInputMethodMode() == 2 || xVar.getContentView() == null) {
            return;
        }
        d2Var.K.removeCallbacks(a2Var);
        a2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
