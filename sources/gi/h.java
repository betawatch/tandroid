package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        kv0 kv0Var = mVar.E;
        if (kv0Var != null) {
            h6 h6Var = this.e;
            kv0Var.e(h6Var != null && h6Var.k(), true);
        }
    }
}
