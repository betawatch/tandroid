package lh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o7 implements View.OnFocusChangeListener {
    public final /* synthetic */ r7 a;

    public o7(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            r7 r7Var = this.a;
            r7Var.e0 = true;
            f2.k0 k0Var = (f2.k0) r7Var.d.getLayoutManager();
            sh.n nVar = new sh.n(r7Var.getContext(), 2);
            nVar.a = 1;
            nVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            k0Var.w0(nVar);
        }
    }
}
