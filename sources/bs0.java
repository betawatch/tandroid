// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bs0 extends cj3 {
    public final /* synthetic */ p G4;
    public final /* synthetic */ ds0 H4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(ds0 ds0Var, Bundle bundle, p pVar) {
        super(bundle);
        this.H4 = ds0Var;
        this.G4 = pVar;
    }

    @Override // cj3
    public final boolean c3() {
        return true;
    }

    @Override // cj3, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ds0 ds0Var = this.H4;
        if (ds0Var.X1) {
            return;
        }
        ds0Var.X1 = true;
        this.G4.a("USER_DECLINED", null);
    }
}
