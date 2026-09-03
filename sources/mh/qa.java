package mh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class qa extends bb {
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ int k0;
    public final /* synthetic */ eb l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(eb ebVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, int i10) {
        super(context, g6Var);
        this.l0 = ebVar;
        this.j0 = z4;
        this.k0 = i10;
    }

    @Override // mh.bb
    public final void e(int i10) {
        long j10 = i10;
        eb ebVar = this.l0;
        ebVar.s(j10);
        qh.d dVar = ebVar.x;
        if (dVar != null) {
            dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), ebVar.N), true, true);
        }
        if (this.j0) {
            oh.t0 t0Var = ebVar.D;
            t0Var.g = j10;
            ebVar.E.set(t0Var);
            int i11 = this.k0;
            f(oh.s.b(i11, i10, 3), oh.s.b(i11, i10, 4), true);
        }
    }

    @Override // mh.bb
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.j0) {
            int i11 = this.k0;
            f(oh.s.b(i11, i10, 3), oh.s.b(i11, i10, 4), true);
        }
    }
}
