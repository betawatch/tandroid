package fi;

import android.os.Bundle;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class m1 extends yy {
    public final /* synthetic */ org.telegram.tgnet.e B4;
    public final /* synthetic */ o1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = o1Var;
        this.B4 = eVar;
    }

    @Override // org.telegram.ui.yy
    public final boolean G3() {
        return true;
    }

    @Override // org.telegram.ui.yy, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o1 o1Var = this.C4;
        if (o1Var.c0) {
            return;
        }
        o1Var.c0 = true;
        this.B4.run("USER_DECLINED", null);
    }
}
