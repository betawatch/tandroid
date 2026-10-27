package bi;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ld extends yd {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ be o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(be beVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, int i10) {
        super(context, u6Var);
        this.o0 = beVar;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // bi.yd
    public final void e(int i10) {
        long j10 = i10;
        be beVar = this.o0;
        beVar.s(j10);
        fi.d dVar = beVar.x;
        if (dVar != null) {
            dVar.i(dd.U0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), beVar.S), true, true);
        }
        if (this.m0) {
            di.v0 v0Var = beVar.G;
            v0Var.g = j10;
            beVar.H.set(v0Var);
            int i11 = this.n0;
            f(di.u.b(i11, i10, 3), di.u.b(i11, i10, 4), true);
        }
    }

    @Override // bi.yd
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(di.u.b(i11, i10, 3), di.u.b(i11, i10, 4), true);
        }
    }
}
