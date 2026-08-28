package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements e4, GenericProvider, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ c3 a;

    public /* synthetic */ z1(c3 c3Var) {
        this.a = c3Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.a.k(false);
    }

    @Override // mh.e4
    public void j(boolean z10) {
        c3 c3Var = this.a;
        if (c3Var.Z && z10) {
            return;
        }
        c3Var.k(true);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
