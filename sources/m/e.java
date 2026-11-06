package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e extends l.v {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        this.f = 8388613;
        gf.g gVar = iVar.M;
        this.h = gVar;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(gVar);
        }
    }

    @Override // l.v
    public final void c() {
        switch (this.l) {
            case 0:
                i iVar = this.m;
                iVar.J = null;
                iVar.getClass();
                super.c();
                break;
            default:
                i iVar2 = this.m;
                l.k kVar = iVar2.c;
                if (kVar != null) {
                    kVar.c(true);
                }
                iVar2.I = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        if ((d0Var.A.x & 32) != 32) {
            View view2 = iVar.r;
            this.e = view2 == null ? (View) iVar.n : view2;
        }
        gf.g gVar = iVar.M;
        this.h = gVar;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(gVar);
        }
    }
}
