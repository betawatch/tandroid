package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements org.telegram.ui.ActionBar.b2, e4, GenericProvider {
    public final /* synthetic */ g4 a;

    public /* synthetic */ y3(g4 g4Var) {
        this.a = g4Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.a.b.dismiss();
    }

    @Override // mh.e4
    public void j(boolean z10) {
        g4 g4Var = this.a;
        if (g4Var.J()) {
            return;
        }
        g4Var.F.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.n1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
