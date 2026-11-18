package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
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
                    v4.c0 c0Var = (v4.c0) v6Var.o1.getLayoutManager();
                    pi.l lVar = new pi.l(v6Var.getContext(), 2);
                    lVar.a = 1;
                    lVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(1.0f);
                    c0Var.w0(lVar);
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
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.b;
                i3Var.n = z10;
                if (i3Var.h) {
                    i3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.b;
                l3Var.s = z10;
                if (l3Var.n) {
                    l3Var.c();
                }
                l3Var.a(z10);
                break;
        }
    }
}
