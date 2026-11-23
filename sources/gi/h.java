package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.mv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h extends l {
    public final /* synthetic */ m w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(mVar, context);
        this.w = mVar;
    }

    @Override // gi.l, v4.i0
    public final void f() {
        super.f();
        m mVar = this.w;
        if (mVar.r.getVisibility() == 0) {
            mVar.x.f();
        }
        mv0 mv0Var = mVar.E;
        if (mv0Var != null) {
            h6 h6Var = this.e;
            mv0Var.e(h6Var != null && h6Var.k(), true);
        }
    }
}
