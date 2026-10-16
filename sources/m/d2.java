package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ f2 a;

    public d2(f2 f2Var) {
        this.a = f2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        f2 f2Var = this.a;
        c2 c2Var = f2Var.G;
        z zVar = f2Var.O;
        if (i10 != 1 || zVar.getInputMethodMode() == 2 || zVar.getContentView() == null) {
            return;
        }
        f2Var.K.removeCallbacks(c2Var);
        c2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
