package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
