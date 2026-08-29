package jh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class pa extends ab {
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ int j0;
    public final /* synthetic */ db k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(db dbVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int i10) {
        super(context, c6Var);
        this.k0 = dbVar;
        this.i0 = z10;
        this.j0 = i10;
    }

    @Override // jh.ab
    public final void e(int i10) {
        long j10 = i10;
        db dbVar = this.k0;
        dbVar.s(j10);
        nh.d dVar = dbVar.x;
        if (dVar != null) {
            dVar.g(ia.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), dbVar.M), true, true);
        }
        if (this.i0) {
            lh.s0 s0Var = dbVar.C;
            s0Var.g = j10;
            dbVar.D.set(s0Var);
            int i11 = this.j0;
            f(lh.s.b(i11, i10, 3), lh.s.b(i11, i10, 4), true);
        }
    }

    @Override // jh.ab
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.i0) {
            int i11 = this.j0;
            f(lh.s.b(i11, i10, 3), lh.s.b(i11, i10, 4), true);
        }
    }
}
