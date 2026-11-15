package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t1 extends u6 {
    public final /* synthetic */ s2 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(s2 s2Var, Context context, int i7, TL_stars.StarGift starGift, long j3, k1 k1Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, k1Var, z10, z11);
        this.v2 = s2Var;
    }

    @Override // bi.u6
    public final cc e1() {
        s2 s2Var = this.v2;
        return new cc(s2Var.c, s2Var.J0);
    }
}
