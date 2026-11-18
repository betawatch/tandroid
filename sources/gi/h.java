package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
