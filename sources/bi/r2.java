package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class r2 extends c9 {
    public final /* synthetic */ n3 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(n3 n3Var, Context context, int i7, TL_stars.StarGift starGift, long j3, h2 h2Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, h2Var, z10, z11);
        this.v2 = n3Var;
    }

    @Override // bi.c9
    public final lc f1() {
        n3 n3Var = this.v2;
        return new lc(n3Var.c, n3Var.J0);
    }
}
