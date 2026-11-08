package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ e2 a;

    public c2(e2 e2Var) {
        this.a = e2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        e2 e2Var = this.a;
        b2 b2Var = e2Var.G;
        y yVar = e2Var.O;
        if (i7 != 1 || yVar.getInputMethodMode() == 2 || yVar.getContentView() == null) {
            return;
        }
        e2Var.K.removeCallbacks(b2Var);
        b2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }
}
