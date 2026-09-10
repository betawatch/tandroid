package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements s4, GenericProvider, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ n3 a;

    public /* synthetic */ i2(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.k(false);
    }

    @Override // di.s4
    public void j(boolean z10) {
        n3 n3Var = this.a;
        if (n3Var.d0 && z10) {
            return;
        }
        n3Var.k(true);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
