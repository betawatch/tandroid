package cg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ b0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        v0 v0Var = this.b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    v0Var.G0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), m2Var);
                    break;
                }
                break;
            case 1:
                v0Var.t0.e(v0Var.X, false);
                v0Var.z1();
                break;
            case 2:
                HashSet hashSet = v0Var.u0;
                tc X = tc.X();
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
                nh.d dVar = v0Var.O0;
                TLRPC.ChatFull t12 = v0Var.t1();
                dVar.c(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                break;
            default:
                if (ChatObject.hasAdminRights(v0Var.s1())) {
                    if (v0Var.A0.getParent() != null) {
                        ((ViewGroup) v0Var.A0.getParent()).removeView(v0Var.A0);
                    }
                    h0 h0Var = v0Var.H0;
                    if (h0Var != null && h0Var.getParent() != null) {
                        ((ViewGroup) v0Var.H0.getParent()).removeView(v0Var.H0);
                    }
                    v0Var.d.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
