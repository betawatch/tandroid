package ag;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ g0(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i1 i1Var = this.b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    i1Var.G0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                    break;
                }
                break;
            case 1:
                i1Var.t0.e(i1Var.X, false);
                i1Var.z1();
                break;
            case 2:
                HashSet hashSet = i1Var.u0;
                mc X = mc.X();
                if (X != null) {
                    if (hashSet.size() != 1) {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).j();
                        break;
                    } else {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).j();
                        break;
                    }
                }
                break;
            case 3:
                lh.d dVar = i1Var.O0;
                TLRPC.ChatFull t12 = i1Var.t1();
                dVar.c(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                break;
            default:
                if (ChatObject.hasAdminRights(i1Var.s1())) {
                    if (i1Var.A0.getParent() != null) {
                        ((ViewGroup) i1Var.A0.getParent()).removeView(i1Var.A0);
                    }
                    s0 s0Var = i1Var.H0;
                    if (s0Var != null && s0Var.getParent() != null) {
                        ((ViewGroup) i1Var.H0.getParent()).removeView(i1Var.H0);
                    }
                    i1Var.d.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
