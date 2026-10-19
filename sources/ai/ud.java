package ai;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class ud extends ie {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ le o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(le leVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.o0 = leVar;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // ai.ie
    public final void e(int i10) {
        long j10 = i10;
        le leVar = this.o0;
        leVar.u(j10);
        ei.d dVar = leVar.x;
        if (dVar != null) {
            dVar.g(md.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), leVar.R), true, true);
        }
        if (this.m0) {
            ci.v0 v0Var = leVar.G;
            v0Var.g = j10;
            leVar.H.set(v0Var);
            int i11 = this.n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }

    @Override // ai.ie
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }
}
