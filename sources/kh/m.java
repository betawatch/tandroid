package kh;

import android.content.Context;
import jh.j6;
import org.telegram.ui.Components.iw0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m extends q {
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override // kh.q, f2.q0
    public final void l() {
        super.l();
        r rVar = this.v;
        if (rVar.r.getVisibility() == 0) {
            rVar.w.l();
        }
        iw0 iw0Var = rVar.y;
        if (iw0Var != null) {
            j6 j6Var = this.e;
            iw0Var.e(j6Var != null && j6Var.k(), true);
        }
    }
}
