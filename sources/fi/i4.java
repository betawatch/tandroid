package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements org.telegram.ui.ActionBar.a2, p4, GenericProvider {
    public final /* synthetic */ r4 a;

    public /* synthetic */ i4(r4 r4Var) {
        this.a = r4Var;
    }

    @Override // fi.p4
    public void f(boolean z10) {
        r4 r4Var = this.a;
        if (r4Var.K()) {
            return;
        }
        r4Var.J.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
