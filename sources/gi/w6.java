package gi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w6 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ w6(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    x6 x6Var = (x6) this.b;
                    x6Var.b2 = true;
                    u4.b0 b0Var = (u4.b0) x6Var.l1.getLayoutManager();
                    ni.m mVar = new ni.m(x6Var.getContext(), 2);
                    mVar.a = 1;
                    mVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(1.0f);
                    b0Var.w0(mVar);
                    break;
                }
                break;
            case 1:
                SearchView searchView = (SearchView) this.b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.b;
                h3Var.n = z10;
                if (h3Var.h) {
                    h3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.b;
                k3Var.s = z10;
                if (k3Var.n) {
                    k3Var.c();
                }
                k3Var.a(z10);
                break;
        }
    }
}
