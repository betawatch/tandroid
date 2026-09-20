package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class r2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ r2(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
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
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.b;
                h3Var.h = z10;
                if (h3Var.f) {
                    h3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.b;
                k3Var.n = z10;
                if (k3Var.f) {
                    k3Var.c();
                }
                k3Var.a(z10);
                break;
        }
    }
}
