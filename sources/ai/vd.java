package ai;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class vd extends je {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ me o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(me meVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, int i10) {
        super(context, g6Var);
        this.o0 = meVar;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // ai.je
    public final void e(int i10) {
        long j10 = i10;
        me meVar = this.o0;
        meVar.t(j10);
        ei.d dVar = meVar.x;
        if (dVar != null) {
            dVar.i(nd.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), meVar.S), true, true);
        }
        if (this.m0) {
            ci.v0 v0Var = meVar.G;
            v0Var.g = j10;
            meVar.H.set(v0Var);
            int i11 = this.n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }

    @Override // ai.je
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }
}
