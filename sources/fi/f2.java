package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements p4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ k3 a;

    public /* synthetic */ f2(k3 k3Var) {
        this.a = k3Var;
    }

    @Override // fi.p4
    public void f(boolean z10) {
        k3 k3Var = this.a;
        if (k3Var.d0 && z10) {
            return;
        }
        k3Var.k(true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.k(false);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
