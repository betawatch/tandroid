package hh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class va extends gb {
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ int j0;
    public final /* synthetic */ jb k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(jb jbVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int i10) {
        super(context, c6Var);
        this.k0 = jbVar;
        this.i0 = z10;
        this.j0 = i10;
    }

    @Override // hh.gb
    public final void e(int i10) {
        long j10 = i10;
        jb jbVar = this.k0;
        jbVar.t(j10);
        lh.d dVar = jbVar.x;
        if (dVar != null) {
            dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), jbVar.M), true, true);
        }
        if (this.i0) {
            jh.s0 s0Var = jbVar.C;
            s0Var.g = j10;
            jbVar.D.set(s0Var);
            int i11 = this.j0;
            f(jh.s.b(i11, i10, 3), jh.s.b(i11, i10, 4), true);
        }
    }

    @Override // hh.gb
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.i0) {
            int i11 = this.j0;
            f(jh.s.b(i11, i10, 3), jh.s.b(i11, i10, 4), true);
        }
    }
}
