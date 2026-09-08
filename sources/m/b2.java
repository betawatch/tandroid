package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
