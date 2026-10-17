package ai;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class td extends he {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ ke o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(ke keVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.o0 = keVar;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // ai.he
    public final void e(int i10) {
        long j10 = i10;
        ke keVar = this.o0;
        keVar.t(j10);
        ei.d dVar = keVar.x;
        if (dVar != null) {
            dVar.g(ld.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), keVar.R), true, true);
        }
        if (this.m0) {
            ci.v0 v0Var = keVar.G;
            v0Var.g = j10;
            keVar.H.set(v0Var);
            int i11 = this.n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }

    @Override // ai.he
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }
}
