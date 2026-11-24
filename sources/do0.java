// default package

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class do0 extends my0 {
    public static do0 o1;
    public final ao0 l1;
    public final b1a m1;
    public boolean n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public do0(Activity activity, ap0 ap0Var, b1a b1aVar, ylb ylbVar, boolean z) {
        super(1, ylbVar, (Context) activity, true);
        byte b = 1;
        this.m1 = b1aVar;
        byte b2 = 0;
        Object[] objArr = 0;
        this.w0 = false;
        this.v0 = false;
        this.T0 = false;
        s0(0);
        J();
        gm.l3(this, on2.h(cmb.v0(cmb.g5, this.J0)) > 0.699999988079071d);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
        ao0 ao0Var = new ao0(this, getContext(), b1aVar, ylbVar, ap0Var);
        this.l1 = ao0Var;
        ao0Var.setOverScrollMode(2);
        ao0Var.setClipToPadding(false);
        ao0Var.setAdapter(new bo0(ap0Var, b1aVar));
        ao0Var.setPosition(0);
        this.O = ao0Var;
        ap0Var.o2 = new zn0(this, b2);
        ap0Var.m2 = new hi2(this, b1aVar, objArr == true ? 1 : 0, (byte) 11);
        b1aVar.p2 = new co0(this, ap0Var, ylbVar);
        b1aVar.n2 = new zn0(this, b);
        if (!z) {
            oc7.r1(this.a).N1().T();
        }
        u31.a(this.c, new oz(b));
    }

    public static void D0(d dVar, ylb ylbVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (o1 != null) {
            return;
        }
        boolean z = ylbVar instanceof r63;
        d qv0Var = z ? new qv0(dVar) : dVar;
        do0 do0Var = new do0(dVar.getParentActivity(), new ap0(qv0Var, j, prepaidGiveaway), new b1a(qv0Var, j), qv0Var.getResourceProvider(), z);
        do0Var.show();
        o1 = do0Var;
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    @Override // my0
    public final void H() {
        super.H();
        o1 = null;
    }

    @Override // my0
    public final void Z(Configuration configuration) {
        this.m1.Z(configuration);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        ao0 ao0Var = this.l1;
        if (ao0Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        b1a b1aVar = this.m1;
        HashSet hashSet = b1aVar.Z1;
        int size = hashSet.size();
        HashSet hashSet2 = b1aVar.a2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                gm.t1(b1aVar.b);
            }
            ao0Var.E(0);
            return;
        }
        byte b = b1aVar.m2;
        Context context = b1aVar.getContext();
        ylb ylbVar = b1aVar.J0;
        w0a w0aVar = new w0a(b1aVar, (byte) 0);
        w0a w0aVar2 = new w0a(b1aVar, (byte) 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131743522, "UnsavedChanges");
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = b != 1 ? b != 2 ? b != 3 ? "" : jb6.M0(2131753561, "BoostingApplyChangesCountries") : jb6.M0(2131753562, "BoostingApplyChangesChannels") : jb6.M0(2131753560, "BoostingApplyChangesUsers");
        alertDialog$Builder.j(jb6.M0(2131754181, "ApplyTheme"), new xg0(w0aVar, (byte) 8));
        alertDialog$Builder.g(jb6.M0(2131751343, "Discard"), new xg0(w0aVar2, (byte) 5));
        alertDialog$Builder.o();
    }
}
