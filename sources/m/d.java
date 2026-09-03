package m;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends l.w {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ h m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = hVar;
        this.f = 8388613;
        y5.h hVar2 = hVar.J;
        this.h = hVar2;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.h(hVar2);
        }
    }

    @Override // l.w
    public final void c() {
        switch (this.l) {
            case 0:
                h hVar = this.m;
                hVar.G = null;
                hVar.getClass();
                super.c();
                break;
            default:
                h hVar2 = this.m;
                l.l lVar = hVar2.c;
                if (lVar != null) {
                    lVar.c(true);
                }
                hVar2.F = null;
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
        y5.h hVar2 = hVar.J;
        this.h = hVar2;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.h(hVar2);
        }
    }
}
