// default package

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fu3 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ fu3(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                gu3 gu3Var = (gu3) callback;
                gu3Var.n = z;
                if (gu3Var.h) {
                    gu3Var.c();
                    break;
                }
                break;
            case 1:
                su3 su3Var = (su3) callback;
                su3Var.s = z;
                if (su3Var.n) {
                    su3Var.c();
                }
                su3Var.a(z);
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
                    zz9 zz9Var = (zz9) callback;
                    zz9Var.d2 = true;
                    u46 u46Var = (u46) zz9Var.n1.getLayoutManager();
                    w46 w46Var = new w46(zz9Var.getContext(), 2);
                    w46Var.a = 1;
                    w46Var.p = (a.getCurrentActionBarHeight() + gm.m) - gm.L(1.0f);
                    u46Var.v0(w46Var);
                    break;
                }
                break;
        }
    }
}
