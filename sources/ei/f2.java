package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements o4, GenericProvider, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ k3 a;

    public /* synthetic */ f2(k3 k3Var) {
        this.a = k3Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a.k(false);
    }

    @Override // ei.o4
    public void j(boolean z10) {
        k3 k3Var = this.a;
        if (k3Var.d0 && z10) {
            return;
        }
        k3Var.k(true);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
