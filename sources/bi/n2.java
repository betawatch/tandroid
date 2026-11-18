package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n2 extends a9 {
    public final /* synthetic */ j3 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(j3 j3Var, Context context, int i7, TL_stars.StarGift starGift, long j3, d2 d2Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, d2Var, z10, z11);
        this.v2 = j3Var;
    }

    @Override // bi.a9
    public final lc f1() {
        j3 j3Var = this.v2;
        return new lc(j3Var.c, j3Var.J0);
    }
}
