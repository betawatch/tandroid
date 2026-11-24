// default package

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dn0 extends fx0 {
    public static dn0 o1;
    public final an0 l1;
    public final zy9 m1;
    public boolean n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(Activity activity, ao0 ao0Var, zy9 zy9Var, wjb wjbVar, boolean z) {
        super(1, wjbVar, (Context) activity, true);
        byte b = 1;
        this.m1 = zy9Var;
        byte b2 = 0;
        this.w0 = false;
        this.v0 = false;
        this.T0 = false;
        s0(0);
        K();
        gl.l3(this, bm2.h(bkb.v0(bkb.g5, this.J0)) > 0.699999988079071d);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
        an0 an0Var = new an0(this, getContext(), zy9Var, wjbVar, ao0Var);
        this.l1 = an0Var;
        an0Var.setOverScrollMode(2);
        an0Var.setClipToPadding(false);
        an0Var.setAdapter(new bn0(ao0Var, zy9Var));
        an0Var.setPosition(0);
        this.O = an0Var;
        ao0Var.o2 = new zm0(this, b2);
        ao0Var.m2 = new lv6((Object) this, (Object) zy9Var, (byte) 9);
        zy9Var.p2 = new cn0(this, ao0Var, wjbVar);
        zy9Var.n2 = new zm0(this, b);
        if (!z) {
            na7.q1(this.a).M1().T();
        }
        m21.a(this.c, new oy(b));
    }

    public static void D0(d dVar, wjb wjbVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (o1 != null) {
            return;
        }
        boolean z = wjbVar instanceof f53;
        d hu0Var = z ? new hu0(dVar) : dVar;
        dn0 dn0Var = new dn0(dVar.getParentActivity(), new ao0(hu0Var, j, prepaidGiveaway), new zy9(hu0Var, j), hu0Var.getResourceProvider(), z);
        dn0Var.show();
        o1 = dn0Var;
    }

    @Override // fx0
    public final boolean D() {
        return false;
    }

    @Override // fx0
    public final void I() {
        super.I();
        o1 = null;
    }

    @Override // fx0
    public final void Z(Configuration configuration) {
        this.m1.Z(configuration);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        an0 an0Var = this.l1;
        if (an0Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        zy9 zy9Var = this.m1;
        HashSet hashSet = zy9Var.Z1;
        int size = hashSet.size();
        HashSet hashSet2 = zy9Var.a2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                gl.t1(zy9Var.b);
            }
            an0Var.E(0);
            return;
        }
        byte b = zy9Var.m2;
        Context context = zy9Var.getContext();
        wjb wjbVar = zy9Var.J0;
        uy9 uy9Var = new uy9(zy9Var, (byte) 0);
        byte b2 = 6;
        uy9 uy9Var2 = new uy9(zy9Var, (byte) 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131743596, "UnsavedChanges");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        byte b3 = 3;
        hdVar.U = b != 1 ? b != 2 ? b != 3 ? "" : k96.M0(2131753593, "BoostingApplyChangesCountries") : k96.M0(2131753594, "BoostingApplyChangesChannels") : k96.M0(2131753592, "BoostingApplyChangesUsers");
        alertDialog$Builder.j(k96.M0(2131754213, "ApplyTheme"), new sg0(uy9Var, b2));
        alertDialog$Builder.g(k96.M0(2131751394, "Discard"), new sg0(uy9Var2, b3));
        alertDialog$Builder.o();
    }
}
