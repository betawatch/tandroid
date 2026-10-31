package m;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import vh.f5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ r2(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                SearchView searchView = (SearchView) this.b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.b;
                j3Var.n = z10;
                if (j3Var.h) {
                    j3Var.c();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) this.b;
                m3Var.s = z10;
                if (m3Var.n) {
                    m3Var.c();
                }
                m3Var.a(z10);
                break;
            default:
                if (z10) {
                    f5 f5Var = (f5) this.b;
                    f5Var.a2 = true;
                    s4.a0 a0Var = (s4.a0) f5Var.k1.getLayoutManager();
                    ci.p pVar = new ci.p(f5Var.getContext(), 2);
                    pVar.a = 1;
                    pVar.p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(1.0f);
                    a0Var.w0(pVar);
                    break;
                }
                break;
        }
    }
}
