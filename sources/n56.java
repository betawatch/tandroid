// default package

import android.widget.AbsListView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n56 implements AbsListView.OnScrollListener {
    public final /* synthetic */ o56 a;

    public n56(o56 o56Var) {
        this.a = o56Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        o56 o56Var = this.a;
        m56 m56Var = o56Var.H;
        np npVar = o56Var.P;
        if (i != 1 || npVar.getInputMethodMode() == 2 || npVar.getContentView() == null) {
            return;
        }
        o56Var.L.removeCallbacks(m56Var);
        m56Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
