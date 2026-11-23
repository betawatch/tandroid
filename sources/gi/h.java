package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.nv0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        nv0 nv0Var = mVar.E;
        if (nv0Var != null) {
            h6 h6Var = this.e;
            nv0Var.e(h6Var != null && h6Var.k(), true);
        }
    }
}
