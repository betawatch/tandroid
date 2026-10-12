package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements org.telegram.ui.ActionBar.z1, o4, GenericProvider {
    public final /* synthetic */ q4 a;

    public /* synthetic */ j4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // fi.o4
    public void j(boolean z10) {
        q4 q4Var = this.a;
        if (q4Var.N()) {
            return;
        }
        q4Var.J.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
