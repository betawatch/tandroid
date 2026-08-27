package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends l.w {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        this.f = 8388613;
        k5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.h(iVar2);
        }
    }

    @Override // l.w
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
                l.l lVar = iVar2.c;
                if (lVar != null) {
                    lVar.c(true);
                }
                iVar2.E = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context, l.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        if ((e0Var.A.x & 32) != 32) {
            View view2 = iVar.r;
            this.e = view2 == null ? (View) iVar.n : view2;
        }
        k5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.h(iVar2);
        }
    }
}
