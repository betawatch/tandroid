package lh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class qa extends bb {
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ int k0;
    public final /* synthetic */ eb l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(eb ebVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, int i10) {
        super(context, f6Var);
        this.l0 = ebVar;
        this.j0 = z4;
        this.k0 = i10;
    }

    @Override // lh.bb
    public final void e(int i10) {
        long j10 = i10;
        eb ebVar = this.l0;
        ebVar.s(j10);
        ph.d dVar = ebVar.x;
        if (dVar != null) {
            dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), ebVar.N), true, true);
        }
        if (this.j0) {
            nh.t0 t0Var = ebVar.D;
            t0Var.g = j10;
            ebVar.E.set(t0Var);
            int i11 = this.k0;
            f(nh.t.b(i11, i10, 3), nh.t.b(i11, i10, 4), true);
        }
    }

    @Override // lh.bb
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.j0) {
            int i11 = this.k0;
            f(nh.t.b(i11, i10, 3), nh.t.b(i11, i10, 4), true);
        }
    }
}
