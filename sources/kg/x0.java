package kg;

import android.text.TextUtils;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.n41;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements u10, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.b0();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                c1 c1Var = this.b;
                c1Var.b.b(true);
                TLRPC.UserFull d2 = c1Var.getMessagesController().d2(c1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (d2 != null) {
                    d2.business_location = null;
                    d2.flags2 &= -3;
                }
                c1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new y0(c1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c1 c1Var = this.b;
        n41 n41Var = (n41) obj;
        int i7 = n41Var.d;
        int i10 = 3;
        if (i7 != 1 && n41Var.c != c1Var.f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getParentActivity());
                alertDialog$Builder.a.S = gd.N0(2131752682, null);
                alertDialog$Builder.a.U = gd.N0(2131752683, null);
                alertDialog$Builder.k(gd.N0(2131746125, null), new x0(c1Var, i10));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                c1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (c1Var.x != null && n41Var.c != c1Var.f) {
            c1Var.x = null;
            c1Var.a.g3.O(true);
            return;
        }
        pa0 pa0Var = new pa0(8);
        if (c1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = c1Var.y;
            tL_channelLocation.geo_point = c1Var.x;
            pa0Var.I0 = tL_channelLocation;
        }
        pa0Var.M0 = new ab.g(23, c1Var, pa0Var);
        if (c1Var.x != null || TextUtils.isEmpty(c1Var.y)) {
            c1Var.presentFragment(pa0Var);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, c1Var.getParentActivity(), null);
        t1Var.j0 = false;
        t1Var.r(200L);
        Utilities.g.c(new v0(c1Var, pa0Var, t1Var));
    }
}
