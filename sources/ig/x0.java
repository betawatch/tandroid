package ig;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m61;
import org.telegram.ui.sc0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                c1 c1Var = this.b;
                c1Var.b.a(1.0f);
                TLRPC.UserFull userFull = c1Var.getMessagesController().getUserFull(c1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                c1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new y0(c1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c1 c1Var = this.b;
        m61 m61Var = (m61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = m61Var.d;
        if (i10 != 1 && m61Var.c != c1Var.n) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new x0(c1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (c1Var.y != null && m61Var.c != c1Var.n) {
            c1Var.y = null;
            c1Var.a.Z2.N(true);
            return;
        }
        sc0 sc0Var = new sc0(8);
        if (c1Var.y != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = c1Var.E;
            tL_channelLocation.geo_point = c1Var.y;
            sc0Var.A0 = tL_channelLocation;
        }
        sc0Var.F0 = new ah.h0(18, c1Var, sc0Var);
        if (c1Var.y != null || TextUtils.isEmpty(c1Var.E)) {
            c1Var.presentFragment(sc0Var);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c1Var.getParentActivity(), 3, null);
        c2Var.i0 = false;
        c2Var.r(200L);
        Utilities.searchQueue.postRunnable(new v0(c1Var, sc0Var, c2Var));
    }
}
