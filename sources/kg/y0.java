package kg;

import android.text.TextUtils;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l41;
import org.telegram.ui.qa0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements v10, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.b0();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                d1 d1Var = this.b;
                d1Var.b.b(true);
                TLRPC.UserFull d2 = d1Var.getMessagesController().d2(d1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (d2 != null) {
                    d2.business_location = null;
                    d2.flags2 &= -3;
                }
                d1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new z0(d1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        d1 d1Var = this.b;
        l41 l41Var = (l41) obj;
        int i7 = l41Var.d;
        int i10 = 3;
        if (i7 != 1 && l41Var.c != d1Var.f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.a.S = gd.M0(2131752683, null);
                alertDialog$Builder.a.U = gd.M0(2131752684, null);
                alertDialog$Builder.k(gd.M0(2131746126, null), new y0(d1Var, i10));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                d1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (d1Var.x != null && l41Var.c != d1Var.f) {
            d1Var.x = null;
            d1Var.a.g3.O(true);
            return;
        }
        qa0 qa0Var = new qa0(8);
        if (d1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = d1Var.y;
            tL_channelLocation.geo_point = d1Var.x;
            qa0Var.I0 = tL_channelLocation;
        }
        qa0Var.M0 = new ab.g(23, d1Var, qa0Var);
        if (d1Var.x != null || TextUtils.isEmpty(d1Var.y)) {
            d1Var.presentFragment(qa0Var);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, d1Var.getParentActivity(), null);
        u1Var.j0 = false;
        u1Var.r(200L);
        Utilities.g.c(new w0(d1Var, qa0Var, u1Var));
    }
}
