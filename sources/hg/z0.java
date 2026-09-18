package hg;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j51;
import org.telegram.ui.kd0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ z0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
        j51 j51Var = (j51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = j51Var.d;
        if (i10 != 1 && j51Var.c != e1Var.h) {
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
        if (e1Var.x != null && j51Var.c != e1Var.h) {
            e1Var.x = null;
            e1Var.a.Y2.N(true);
            return;
        }
        kd0 kd0Var = new kd0(8);
        if (e1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = e1Var.y;
            tL_channelLocation.geo_point = e1Var.x;
            kd0Var.A0 = tL_channelLocation;
        }
        kd0Var.F0 = new ah.b(15, e1Var, kd0Var);
        if (e1Var.x != null || TextUtils.isEmpty(e1Var.y)) {
            e1Var.presentFragment(kd0Var);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(e1Var.getParentActivity(), 3, null);
        c2Var.g0 = false;
        c2Var.q(200L);
        Utilities.searchQueue.postRunnable(new x0(e1Var, kd0Var, c2Var));
    }
}
