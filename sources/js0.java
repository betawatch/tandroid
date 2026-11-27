// default package

import android.os.Bundle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class js0 extends uj3 {
    public final /* synthetic */ p I4;
    public final /* synthetic */ ls0 J4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(ls0 ls0Var, Bundle bundle, p pVar) {
        super(bundle);
        this.J4 = ls0Var;
        this.I4 = pVar;
    }

    @Override // uj3
    public final boolean e3() {
        return true;
    }

    @Override // uj3, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ls0 ls0Var = this.J4;
        if (ls0Var.X1) {
            return;
        }
        ls0Var.X1 = true;
        this.I4.a("USER_DECLINED", null);
    }
}
