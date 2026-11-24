// default package

import android.widget.AbsListView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n76 implements AbsListView.OnScrollListener {
    public final /* synthetic */ o76 a;

    public n76(o76 o76Var) {
        this.a = o76Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        o76 o76Var = this.a;
        m76 m76Var = o76Var.H;
        nq nqVar = o76Var.P;
        if (i != 1 || nqVar.getInputMethodMode() == 2 || nqVar.getContentView() == null) {
            return;
        }
        o76Var.L.removeCallbacks(m76Var);
        m76Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
