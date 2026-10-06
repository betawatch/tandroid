package m;

import android.content.Context;
import android.view.View;
import ii.n4;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class d extends l.v {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ h m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        this.f = 8388613;
        n4 n4Var = hVar.M;
        this.h = n4Var;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(n4Var);
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
        n4 n4Var = hVar.M;
        this.h = n4Var;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(n4Var);
        }
    }
}
