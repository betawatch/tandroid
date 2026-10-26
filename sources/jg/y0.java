package jg;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t61;
import org.telegram.ui.pc0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.X();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                d1 d1Var = this.b;
                d1Var.b.b(true);
                TLRPC.UserFull userFull = d1Var.getMessagesController().getUserFull(d1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                d1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new z0(d1Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d1 d1Var = this.b;
        t61 t61Var = (t61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = t61Var.d;
        if (i10 != 1 && t61Var.c != d1Var.f) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(d1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (d1Var.w != null && t61Var.c != d1Var.f) {
            d1Var.w = null;
            d1Var.a.g3.O(true);
            return;
        }
        pc0 pc0Var = new pc0(8);
        if (d1Var.w != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = d1Var.x;
            tL_channelLocation.geo_point = d1Var.w;
            pc0Var.z0 = tL_channelLocation;
        }
        pc0Var.E0 = new ai.f0(23, d1Var, pc0Var);
        if (d1Var.w != null || TextUtils.isEmpty(d1Var.x)) {
            d1Var.presentFragment(pc0Var);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(d1Var.getParentActivity(), 3, null);
        e2Var.i0 = false;
        e2Var.r(200L);
        Utilities.searchQueue.postRunnable(new w0(d1Var, pc0Var, e2Var));
    }
}
