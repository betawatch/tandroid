// default package

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dn0 extends nx0 {
    public static dn0 o1;
    public final an0 l1;
    public final t2a m1;
    public boolean n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(Activity activity, ao0 ao0Var, t2a t2aVar, vnb vnbVar, boolean z) {
        super(1, vnbVar, (Context) activity, true);
        byte b = 1;
        this.m1 = t2aVar;
        byte b2 = 0;
        this.w0 = false;
        this.v0 = false;
        this.T0 = false;
        s0(0);
        J();
        hl.l3(this, vm2.h(aob.v0(aob.h5, this.J0)) > 0.699999988079071d);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
        an0 an0Var = new an0(this, getContext(), t2aVar, vnbVar, ao0Var);
        this.l1 = an0Var;
        an0Var.setOverScrollMode(2);
        an0Var.setClipToPadding(false);
        an0Var.setAdapter(new bn0(ao0Var, t2aVar));
        an0Var.setPosition(0);
        this.O = an0Var;
        ao0Var.o2 = new zm0(this, b2);
        ao0Var.m2 = new qx6((Object) this, (Object) t2aVar, (byte) 9);
        t2aVar.p2 = new cn0(this, ao0Var, vnbVar);
        t2aVar.n2 = new zm0(this, b);
        if (!z) {
            uc7.s1(this.a).O1().T();
        }
        v21.a(this.c, new py(b));
    }

    public static void E0(e eVar, vnb vnbVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (o1 != null) {
            return;
        }
        boolean z = vnbVar instanceof x53;
        e qu0Var = z ? new qu0(eVar) : eVar;
        dn0 dn0Var = new dn0(eVar.getParentActivity(), new ao0(qu0Var, j, prepaidGiveaway), new t2a(qu0Var, j), qu0Var.getResourceProvider(), z);
        dn0Var.show();
        o1 = dn0Var;
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    @Override // nx0
    public final void H() {
        super.H();
        o1 = null;
    }

    @Override // nx0
    public final void Z(Configuration configuration) {
        this.m1.Z(configuration);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        an0 an0Var = this.l1;
        if (an0Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        t2a t2aVar = this.m1;
        HashSet hashSet = t2aVar.Z1;
        int size = hashSet.size();
        HashSet hashSet2 = t2aVar.a2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                hl.t1(t2aVar.b);
            }
            an0Var.F(0);
            return;
        }
        byte b = t2aVar.m2;
        Context context = t2aVar.getContext();
        vnb vnbVar = t2aVar.J0;
        o2a o2aVar = new o2a(t2aVar, (byte) 0);
        o2a o2aVar2 = new o2a(t2aVar, (byte) 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131743490, "UnsavedChanges");
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        byte b2 = 3;
        idVar.U = b != 1 ? b != 2 ? b != 3 ? "" : ob6.M0(2131753589, "BoostingApplyChangesCountries") : ob6.M0(2131753590, "BoostingApplyChangesChannels") : ob6.M0(2131753588, "BoostingApplyChangesUsers");
        alertDialog$Builder.j(ob6.M0(2131754209, "ApplyTheme"), new tg0(o2aVar, b2));
        alertDialog$Builder.g(ob6.M0(2131751371, "Discard"), new tg0(o2aVar2, (byte) 4));
        alertDialog$Builder.o();
    }
}
