package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements org.telegram.ui.ActionBar.c2, s4, GenericProvider {
    public final /* synthetic */ u4 a;

    public /* synthetic */ m4(u4 u4Var) {
        this.a = u4Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // di.s4
    public void j(boolean z10) {
        u4 u4Var = this.a;
        if (u4Var.K()) {
            return;
        }
        u4Var.J.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
