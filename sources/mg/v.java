package mg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v extends z2 {
    public static v l1;
    public final r i1;
    public final v1 j1;
    public boolean k1;

    public v(Activity activity, w0 w0Var, v1 v1Var, p6 p6Var, boolean z10) {
        super(1, (Context) activity, p6Var, true);
        this.j1 = v1Var;
        this.v0 = false;
        this.u0 = false;
        this.T0 = false;
        v0(0);
        O();
        org.telegram.messenger.i0.p3(this, i0.b.h(t6.w0(t6.h5, this.I0)) > 0.699999988079071d);
        this.k1 = getContext().getResources().getConfiguration().orientation == 2;
        r rVar = new r(this, getContext(), v1Var, p6Var, w0Var);
        this.i1 = rVar;
        rVar.setOverScrollMode(2);
        rVar.setClipToPadding(false);
        rVar.setAdapter(new s(w0Var, v1Var));
        rVar.setPosition(0);
        this.N = rVar;
        w0Var.l2 = new q(this, 0);
        w0Var.j2 = new m4.c(2, this, v1Var);
        v1Var.m2 = new t(this, w0Var, p6Var);
        v1Var.k2 = new q(this, 1);
        if (!z10) {
            vp.r1(this.a).O1().U();
        }
        wb.a(this.c, new u(0));
    }

    public static void I0(k2 k2Var, p6 p6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (l1 != null) {
            return;
        }
        boolean z10 = p6Var instanceof th.b;
        k2 q1Var = z10 ? new kg.q1(k2Var) : k2Var;
        v vVar = new v(k2Var.getParentActivity(), new w0(q1Var, j10, prepaidGiveaway), new v1(q1Var, j10), q1Var.getResourceProvider(), z10);
        vVar.show();
        l1 = vVar;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        l1 = null;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void c0(Configuration configuration) {
        this.j1.c0(configuration);
        this.k1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        r rVar = this.i1;
        if (rVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        v1 v1Var = this.j1;
        HashSet hashSet = v1Var.W1;
        int size = hashSet.size();
        HashSet hashSet2 = v1Var.X1;
        int i10 = 0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.i0.v1(v1Var.b);
            }
            rVar.E(0);
            return;
        }
        int i11 = v1Var.j2;
        Context context = v1Var.getContext();
        p6 p6Var = v1Var.I0;
        p1 p1Var = new p1(v1Var, 0);
        p1 p1Var2 = new p1(v1Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = cd.L0(2131743860, "UnsavedChanges");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = i11 != 1 ? i11 != 2 ? i11 != 3 ? "" : cd.L0(2131753596, "BoostingApplyChangesCountries") : cd.L0(2131753597, "BoostingApplyChangesChannels") : cd.L0(2131753595, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(cd.L0(2131754216, "ApplyTheme"), new l(p1Var, i10));
        alertDialog$Builder.h(cd.L0(2131751407, "Discard"), new ig.c0(p1Var2, 27));
        alertDialog$Builder.p();
    }
}
