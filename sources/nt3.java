// default package

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nt3 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ nt3(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                ot3 ot3Var = (ot3) callback;
                ot3Var.n = z;
                if (ot3Var.h) {
                    ot3Var.c();
                    break;
                }
                break;
            case 1:
                zt3 zt3Var = (zt3) callback;
                zt3Var.s = z;
                if (zt3Var.n) {
                    zt3Var.c();
                }
                zt3Var.a(z);
                break;
            case 2:
                SearchView searchView = (SearchView) callback;
                View.OnFocusChangeListener onFocusChangeListener = searchView.e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                    break;
                }
                break;
            default:
                if (z) {
                    r1a r1aVar = (r1a) callback;
                    r1aVar.d2 = true;
                    x46 x46Var = (x46) r1aVar.n1.getLayoutManager();
                    z46 z46Var = new z46(r1aVar.getContext(), 2);
                    z46Var.a = 1;
                    z46Var.p = (a.getCurrentActionBarHeight() + hl.m) - hl.L(1.0f);
                    x46Var.v0(z46Var);
                    break;
                }
                break;
        }
    }
}
