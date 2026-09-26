package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
