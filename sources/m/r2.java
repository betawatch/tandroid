package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.b;
                d3Var.n = z10;
                if (d3Var.h) {
                    d3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.b;
                g3Var.s = z10;
                if (g3Var.n) {
                    g3Var.c();
                }
                g3Var.a(z10);
                break;
        }
    }
}
