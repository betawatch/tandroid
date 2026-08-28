package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ s2(ViewGroup viewGroup, int i9) {
        this.a = i9;
        this.b = viewGroup;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                SearchView searchView = (SearchView) this.b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.W;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.b;
                g3Var.h = z10;
                if (g3Var.f) {
                    g3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.b;
                j3Var.n = z10;
                if (j3Var.f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                break;
        }
    }
}
