package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u6 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ u6(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    v6 v6Var = (v6) this.b;
                    v6Var.e2 = true;
                    v4.b0 b0Var = (v4.b0) v6Var.o1.getLayoutManager();
                    pi.l lVar = new pi.l(v6Var.getContext(), 2);
                    lVar.a = 1;
                    lVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(1.0f);
                    b0Var.w0(lVar);
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
