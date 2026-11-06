package kg;

import android.text.TextUtils;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x31;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements a20, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ v0(a1 a1Var, int i7) {
        this.a = i7;
        this.b = a1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.b0();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                a1 a1Var = this.b;
                a1Var.b.b(true);
                TLRPC.UserFull b22 = a1Var.getMessagesController().b2(a1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (b22 != null) {
                    b22.business_location = null;
                    b22.flags2 &= -3;
                }
                a1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new w0(a1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a1 a1Var = this.b;
        x31 x31Var = (x31) obj;
        int i7 = x31Var.d;
        int i10 = 3;
        if (i7 != 1 && x31Var.c != a1Var.f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a1Var.getParentActivity());
                alertDialog$Builder.a.R = hd.M0(2131752694, null);
                alertDialog$Builder.a.T = hd.M0(2131752695, null);
                alertDialog$Builder.k(hd.M0(2131746320, null), new v0(a1Var, i10));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                a1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (a1Var.x != null && x31Var.c != a1Var.f) {
            a1Var.x = null;
            a1Var.a.f3.O(true);
            return;
        }
        pa0 pa0Var = new pa0(8);
        if (a1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = a1Var.y;
            tL_channelLocation.geo_point = a1Var.x;
            pa0Var.C0 = tL_channelLocation;
        }
        pa0Var.G0 = new ab.g(21, a1Var, pa0Var);
        if (a1Var.x != null || TextUtils.isEmpty(a1Var.y)) {
            a1Var.presentFragment(pa0Var);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a1Var.getParentActivity(), null);
        u1Var.i0 = false;
        u1Var.r(200L);
        Utilities.g.c(new t0(a1Var, pa0Var, u1Var));
    }
}
