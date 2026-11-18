package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ d2 a;

    public b2(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        d2 d2Var = this.a;
        a2 a2Var = d2Var.H;
        x xVar = d2Var.P;
        if (i7 != 1 || xVar.getInputMethodMode() == 2 || xVar.getContentView() == null) {
            return;
        }
        d2Var.L.removeCallbacks(a2Var);
        a2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }
}
