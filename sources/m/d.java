package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d extends l.w {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ h m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        this.f = 8388613;
        a6.i iVar = hVar.M;
        this.h = iVar;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.h(iVar);
        }
    }

    @Override // l.w
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
                l.l lVar = hVar2.c;
                if (lVar != null) {
                    lVar.c(true);
                }
                hVar2.I = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        if ((e0Var.A.x & 32) != 32) {
            View view2 = hVar.r;
            this.e = view2 == null ? (View) hVar.n : view2;
        }
        a6.i iVar = hVar.M;
        this.h = iVar;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.h(iVar);
        }
    }
}
