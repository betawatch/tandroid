package fi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v6 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ v6(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.a) {
            case 0:
                if (z9) {
                    w6 w6Var = (w6) this.b;
                    w6Var.a2 = true;
                    v4.b0 b0Var = (v4.b0) w6Var.k1.getLayoutManager();
                    mi.m mVar = new mi.m(w6Var.getContext(), 2);
                    mVar.a = 1;
                    mVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(1.0f);
                    b0Var.w0(mVar);
                    break;
                }
                break;
            case 1:
                SearchView searchView = (SearchView) this.b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z9);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.b;
                h3Var.n = z9;
                if (h3Var.h) {
                    h3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.b;
                k3Var.s = z9;
                if (k3Var.n) {
                    k3Var.c();
                }
                k3Var.a(z9);
                break;
        }
    }
}
