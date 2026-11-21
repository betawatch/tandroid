package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.nv0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
