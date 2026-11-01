package ag;

import android.text.TextUtils;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.p20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.xb0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements p20, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ y1(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.b0();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                f2 f2Var = this.b;
                f2Var.b.b(true);
                TLRPC.UserFull a2 = f2Var.getMessagesController().a2(f2Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (a2 != null) {
                    a2.business_location = null;
                    a2.flags2 &= -3;
                }
                f2Var.getConnectionsManager().sendRequest(updatebusinesslocation, new z1(f2Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        f2 f2Var = this.b;
        b51 b51Var = (b51) obj;
        int i10 = b51Var.d;
        int i11 = 3;
        int i12 = 2;
        if (i10 != 1 && b51Var.c != f2Var.f) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                alertDialog$Builder.a.R = dd.L0(2131752694, null);
                alertDialog$Builder.a.T = dd.L0(2131752695, null);
                alertDialog$Builder.k(dd.L0(2131746336, null), new y1(f2Var, i11));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                f2Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (f2Var.x != null && b51Var.c != f2Var.f) {
            f2Var.x = null;
            f2Var.a.f3.O(true);
            return;
        }
        xb0 xb0Var = new xb0(8);
        if (f2Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = f2Var.y;
            tL_channelLocation.geo_point = f2Var.x;
            xb0Var.I0 = tL_channelLocation;
        }
        xb0Var.N0 = new m(i12, f2Var, xb0Var);
        if (f2Var.x != null || TextUtils.isEmpty(f2Var.y)) {
            f2Var.presentFragment(xb0Var);
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, f2Var.getParentActivity(), null);
        x1Var.i0 = false;
        x1Var.r(200L);
        Utilities.g.c(new w1(f2Var, xb0Var, x1Var));
    }
}
