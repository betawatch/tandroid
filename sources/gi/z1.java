package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements d4, GenericProvider, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ d3 a;

    public /* synthetic */ z1(d3 d3Var) {
        this.a = d3Var;
    }

    @Override // gi.d4
    public void f(boolean z10) {
        d3 d3Var = this.a;
        if (d3Var.e0 && z10) {
            return;
        }
        d3Var.k(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a.k(false);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
