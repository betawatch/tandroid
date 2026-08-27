package gh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m1 extends m6 {
    public final /* synthetic */ k2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(k2 k2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, a1 a1Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, a1Var, z10, z11);
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
