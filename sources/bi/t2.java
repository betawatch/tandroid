package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t2 extends f9 {
    public final /* synthetic */ p3 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(p3 p3Var, Context context, int i7, TL_stars.StarGift starGift, long j3, j2 j2Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, j2Var, z10, z11);
        this.v2 = p3Var;
    }

    @Override // bi.f9
    public final kc f1() {
        p3 p3Var = this.v2;
        return new kc(p3Var.c, p3Var.J0);
    }
}
