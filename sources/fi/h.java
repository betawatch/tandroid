package fi;

import android.content.Context;
import ei.r6;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends l {
    public final /* synthetic */ m w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(mVar, context);
        this.w = mVar;
    }

    @Override // fi.l, u4.h0
    public final void f() {
        super.f();
        m mVar = this.w;
        if (mVar.r.getVisibility() == 0) {
            mVar.x.f();
        }
        zu0 zu0Var = mVar.E;
        if (zu0Var != null) {
            r6 r6Var = this.e;
            zu0Var.e(r6Var != null && r6Var.k(), true);
        }
    }
}
