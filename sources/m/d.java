package m;

import android.content.Context;
import android.view.View;
import hi.u5;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class d extends l.v {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ h m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        this.f = 8388613;
        u5 u5Var = hVar.N;
        this.h = u5Var;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(u5Var);
        }
    }

    @Override // l.v
    public final void c() {
        switch (this.l) {
            case 0:
                h hVar = this.m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                break;
            default:
                h hVar2 = this.m;
                l.k kVar = hVar2.c;
                if (kVar != null) {
                    kVar.c(true);
                }
                hVar2.J = null;
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
        u5 u5Var = hVar.N;
        this.h = u5Var;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(u5Var);
        }
    }
}
