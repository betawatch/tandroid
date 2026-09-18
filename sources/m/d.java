package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class d extends l.v {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ h m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        this.f = 8388613;
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }

    @Override // l.v
    public final void c() {
        switch (this.l) {
            case 0:
                h hVar = this.m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                break;
            default:
                h hVar2 = this.m;
                l.k kVar = hVar2.c;
                if (kVar != null) {
                    kVar.c(true);
                }
                hVar2.I = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        if ((d0Var.A.x & 32) != 32) {
            View view2 = hVar.r;
            this.e = view2 == null ? (View) hVar.n : view2;
        }
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }
}
