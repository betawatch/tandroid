package kg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ a0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        q0 q0Var = this.b;
        switch (i10) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    q0Var.C2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), i2Var);
                    break;
                }
                break;
            case 1:
                q0Var.p2.g(q0Var.T1, false);
                q0Var.t1();
                break;
            case 2:
                HashSet hashSet = q0Var.q2;
                cc X = cc.X();
                if (X != null) {
                    z20.s(hashSet.size() == 1 ? cd.a0(null, null, 2131749153, i5.p((TLRPC.User) hashSet.iterator().next())) : cd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), X, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                vh.d dVar = q0Var.K2;
                TLRPC.ChatFull M0 = vp.r1(q0Var.a).M0(-q0Var.S1);
                dVar.c(Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0), false);
                break;
            default:
                if (w3.N(q0Var.n1())) {
                    if (q0Var.w2.getParent() != null) {
                        ((ViewGroup) q0Var.w2.getParent()).removeView(q0Var.w2);
                    }
                    bi.t0 t0Var = q0Var.D2;
                    if (t0Var != null && t0Var.getParent() != null) {
                        ((ViewGroup) q0Var.D2.getParent()).removeView(q0Var.D2);
                    }
                    q0Var.k1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
