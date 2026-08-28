package gh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class va extends gb {
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ int j0;
    public final /* synthetic */ jb k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(jb jbVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, int i9) {
        super(context, b6Var);
        this.k0 = jbVar;
        this.i0 = z10;
        this.j0 = i9;
    }

    @Override // gh.gb
    public final void e(int i9) {
        long j10 = i9;
        jb jbVar = this.k0;
        jbVar.s(j10);
        kh.d dVar = jbVar.x;
        if (dVar != null) {
            dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), jbVar.M), true, true);
        }
        if (this.i0) {
            ih.u0 u0Var = jbVar.C;
            u0Var.g = j10;
            jbVar.D.set(u0Var);
            int i10 = this.j0;
            f(ih.u.b(i10, i9, 3), ih.u.b(i10, i9, 4), true);
        }
    }

    @Override // gh.gb
    public final void setValue(int i9) {
        super.setValue(i9);
        if (this.i0) {
            int i10 = this.j0;
            f(ih.u.b(i10, i9, 3), ih.u.b(i10, i9, 4), true);
        }
    }
}
