package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ e2 a;

    public c2(e2 e2Var) {
        this.a = e2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i9) {
        e2 e2Var = this.a;
        b2 b2Var = e2Var.C;
        y yVar = e2Var.K;
        if (i9 != 1 || yVar.getInputMethodMode() == 2 || yVar.getContentView() == null) {
            return;
        }
        e2Var.G.removeCallbacks(b2Var);
        b2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i9, int i10, int i11) {
    }
}
