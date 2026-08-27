package gh;

import android.content.Context;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u1 extends m6 {
    public final /* synthetic */ k2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(k2 k2Var, Context context, int i10, ag.p pVar, long j10, a1 a1Var) {
        super(context, i10, null, pVar, j10, a1Var, false, false);
        this.t0 = k2Var;
    }

    @Override // gh.m6
    public final mc X() {
        org.telegram.ui.ActionBar.c6 c6Var;
        k2 k2Var = this.t0;
        org.telegram.ui.ActionBar.c3 c3Var = k2Var.container;
        c6Var = k2Var.resourcesProvider;
        return new mc(c3Var, c6Var);
    }
}
