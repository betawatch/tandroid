package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends l.v {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        this.f = 8388613;
        m5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.g(iVar2);
        }
    }

    @Override // l.v
    public final void c() {
        switch (this.l) {
            case 0:
                i iVar = this.m;
                iVar.F = null;
                iVar.getClass();
                super.c();
                break;
            default:
                i iVar2 = this.m;
                l.k kVar = iVar2.c;
                if (kVar != null) {
                    kVar.c(true);
                }
                iVar2.E = null;
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
        m5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.g(iVar2);
        }
    }
}
