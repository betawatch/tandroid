package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ s2(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.a) {
            case 0:
                SearchView searchView = (SearchView) this.b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.a0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z4);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) this.b;
                e3Var.h = z4;
                if (e3Var.f) {
                    e3Var.c();
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.b;
                h3Var.n = z4;
                if (h3Var.f) {
                    h3Var.c();
                }
                h3Var.a(z4);
                break;
        }
    }
}
