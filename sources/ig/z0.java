package ig;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h51;
import org.telegram.ui.id0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ z0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                e1 e1Var = this.b;
                e1Var.b.a(1.0f);
                TLRPC.UserFull userFull = e1Var.getMessagesController().getUserFull(e1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                e1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new a1(e1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        e1 e1Var = this.b;
        h51 h51Var = (h51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = h51Var.d;
        if (i10 != 1 && h51Var.c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (e1Var.x != null && h51Var.c != e1Var.h) {
            e1Var.x = null;
            e1Var.a.Y2.N(true);
            return;
        }
        id0 id0Var = new id0(8);
        if (e1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = e1Var.y;
            tL_channelLocation.geo_point = e1Var.x;
            id0Var.A0 = tL_channelLocation;
        }
        id0Var.F0 = new ah.i0(16, e1Var, id0Var);
        if (e1Var.x != null || TextUtils.isEmpty(e1Var.y)) {
            e1Var.presentFragment(id0Var);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e1Var.getParentActivity(), 3, null);
        b2Var.g0 = false;
        b2Var.q(200L);
        Utilities.searchQueue.postRunnable(new x0(e1Var, id0Var, b2Var));
    }
}
