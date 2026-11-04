package lg;

import android.text.TextUtils;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.r31;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements s10, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ w0(b1 b1Var, int i3) {
        this.a = i3;
        this.b = b1Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                this.b.b0();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                b1 b1Var = this.b;
                b1Var.b.b(true);
                TLRPC.UserFull b22 = b1Var.getMessagesController().b2(b1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (b22 != null) {
                    b22.business_location = null;
                    b22.flags2 &= -3;
                }
                b1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new x0(b1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b1 b1Var = this.b;
        r31 r31Var = (r31) obj;
        int i3 = r31Var.d;
        int i10 = 3;
        if (i3 != 1 && r31Var.c != b1Var.f) {
            if (i3 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getParentActivity());
                alertDialog$Builder.a.S = bd.M0(2131752694, null);
                alertDialog$Builder.a.U = bd.M0(2131752695, null);
                alertDialog$Builder.k(bd.M0(2131746329, null), new w0(b1Var, i10));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                b1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (b1Var.x != null && r31Var.c != b1Var.f) {
            b1Var.x = null;
            b1Var.a.g3.O(true);
            return;
        }
        la0 la0Var = new la0(8);
        if (b1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = b1Var.y;
            tL_channelLocation.geo_point = b1Var.x;
            la0Var.D0 = tL_channelLocation;
        }
        la0Var.H0 = new ai.n(27, b1Var, la0Var);
        if (b1Var.x != null || TextUtils.isEmpty(b1Var.y)) {
            b1Var.presentFragment(la0Var);
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, b1Var.getParentActivity(), null);
        s1Var.j0 = false;
        s1Var.r(200L);
        Utilities.g.c(new u0(b1Var, la0Var, s1Var));
    }
}
