package gg;

import android.text.TextUtils;
import bi.cb;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.v51;
import org.telegram.ui.id0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Utilities.Callback5, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ d1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                k1 k1Var = this.b;
                k1Var.b.a(1.0f);
                TLRPC.UserFull userFull = k1Var.getMessagesController().getUserFull(k1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                k1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new e1(k1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        k1 k1Var = this.b;
        v51 v51Var = (v51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = v51Var.d;
        if (i10 != 1 && v51Var.c != k1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k1Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new d1(k1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                k1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (k1Var.x != null && v51Var.c != k1Var.h) {
            k1Var.x = null;
            k1Var.a.Y2.N(true);
            return;
        }
        id0 id0Var = new id0(8);
        if (k1Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = k1Var.y;
            tL_channelLocation.geo_point = k1Var.x;
            id0Var.A0 = tL_channelLocation;
        }
        id0Var.F0 = new cb(11, k1Var, id0Var);
        if (k1Var.x != null || TextUtils.isEmpty(k1Var.y)) {
            k1Var.presentFragment(id0Var);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(k1Var.getParentActivity(), 3, null);
        d2Var.g0 = false;
        d2Var.q(200L);
        Utilities.searchQueue.postRunnable(new b1(k1Var, id0Var, d2Var));
    }
}
