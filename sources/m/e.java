package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class e extends l.v {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        this.f = 8388613;
        k0.b bVar = iVar.M;
        this.h = bVar;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(bVar);
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
        k0.b bVar = iVar.M;
        this.h = bVar;
        l.s sVar = this.i;
        if (sVar != null) {
            sVar.h(bVar);
        }
    }
}
