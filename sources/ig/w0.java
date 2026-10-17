package ig;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f61;
import org.telegram.ui.pc0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ w0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
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
                b1 b1Var = this.b;
                b1Var.b.a(1.0f);
                TLRPC.UserFull userFull = b1Var.getMessagesController().getUserFull(b1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                b1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new x0(b1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b1 b1Var = this.b;
        f61 f61Var = (f61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = f61Var.d;
        if (i10 != 1 && f61Var.c != b1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new w0(b1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (b1Var.x != null && f61Var.c != b1Var.h) {
            b1Var.x = null;
            b1Var.a.W2.N(true);
            return;
        }
        pc0 pc0Var = new pc0(8);
        if (b1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = b1Var.y;
            tL_channelLocation.geo_point = b1Var.x;
            pc0Var.A0 = tL_channelLocation;
        }
        pc0Var.F0 = new ah.h0(17, b1Var, pc0Var);
        if (b1Var.x != null || TextUtils.isEmpty(b1Var.y)) {
            b1Var.presentFragment(pc0Var);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(b1Var.getParentActivity(), 3, null);
        b2Var.g0 = false;
        b2Var.q(200L);
        Utilities.searchQueue.postRunnable(new u0(b1Var, pc0Var, b2Var));
    }
}
