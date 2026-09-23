package hg;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h51;
import org.telegram.ui.dd0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ a1(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                f1 f1Var = this.b;
                f1Var.b.a(1.0f);
                TLRPC.UserFull userFull = f1Var.getMessagesController().getUserFull(f1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                f1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new b1(f1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f1 f1Var = this.b;
        h51 h51Var = (h51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = h51Var.d;
        if (i10 != 1 && h51Var.c != f1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f1Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(f1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                f1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (f1Var.x != null && h51Var.c != f1Var.h) {
            f1Var.x = null;
            f1Var.a.Y2.N(true);
            return;
        }
        dd0 dd0Var = new dd0(8);
        if (f1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = f1Var.y;
            tL_channelLocation.geo_point = f1Var.x;
            dd0Var.A0 = tL_channelLocation;
        }
        dd0Var.F0 = new ah.b(15, f1Var, dd0Var);
        if (f1Var.x != null || TextUtils.isEmpty(f1Var.y)) {
            f1Var.presentFragment(dd0Var);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(f1Var.getParentActivity(), 3, null);
        b2Var.g0 = false;
        b2Var.q(200L);
        Utilities.searchQueue.postRunnable(new y0(f1Var, dd0Var, b2Var));
    }
}
