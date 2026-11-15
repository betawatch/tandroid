package gi;

import android.content.Context;
import fi.k6;
import org.telegram.ui.Components.cv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h extends l {
    public final /* synthetic */ m w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(mVar, context);
        this.w = mVar;
    }

    @Override // gi.l, v4.h0
    public final void f() {
        super.f();
        m mVar = this.w;
        if (mVar.r.getVisibility() == 0) {
            mVar.x.f();
        }
        cv0 cv0Var = mVar.E;
        if (cv0Var != null) {
            k6 k6Var = this.e;
            cv0Var.e(k6Var != null && k6Var.k(), true);
        }
    }
}
