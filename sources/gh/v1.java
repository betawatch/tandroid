package gh;

import android.content.Context;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v1 extends hh.i5 {
    public final /* synthetic */ k2 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(k2 k2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, j10, c6Var, null);
        this.n1 = k2Var;
    }

    @Override // hh.i5, org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.j2
    public final mc getBulletinFactory() {
        org.telegram.ui.ActionBar.c6 c6Var;
        k2 k2Var = this.n1;
        org.telegram.ui.ActionBar.c3 c3Var = k2Var.container;
        c6Var = k2Var.resourcesProvider;
        return new mc(c3Var, c6Var);
    }
}
