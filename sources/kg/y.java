package kg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h3;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ y(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        q0 q0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g(q0Var.k1());
                q0Var.dismiss();
                break;
            case 1:
                e0 e0Var = q0Var.w2;
                if (!e0Var.r) {
                    e0Var.w.performClick();
                    break;
                } else {
                    e0Var.h.performClick();
                    break;
                }
            case 2:
                e0 e0Var2 = q0Var.w2;
                if (!e0Var2.r) {
                    e0Var2.w.performClick();
                    break;
                } else {
                    e0Var2.h.performClick();
                    break;
                }
            default:
                int i11 = q0Var.Z1;
                HashSet hashSet = q0Var.q2;
                int i12 = 1;
                if (!q0Var.b2) {
                    if (i11 == 19 || i11 == 32 || q0Var.s1()) {
                        h3 h3Var = q0Var.U1;
                        if (!h3Var.a) {
                            if (!h3Var.d || !mg.k0.i() || q0Var.U1.m) {
                                q0Var.dismiss();
                                break;
                            } else {
                                mg.p.i(q0Var.S1, q0Var);
                                break;
                            }
                        } else {
                            q0Var.w2.w.callOnClick();
                            h3 h3Var2 = q0Var.U1;
                            if (h3Var2.d && h3Var2.l) {
                                org.telegram.messenger.i0.h3(new a0(q0Var, i12), h3Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.ui.ActionBar.k2 k2Var = q0Var.C2;
                    if (k2Var != null) {
                        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                        i2Var.a = true;
                        k2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), i2Var);
                    }
                }
                if (i11 != 11 && i11 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i11 != 2) {
                            int i13 = 5;
                            if (i11 == 5) {
                                TLRPC.User Z1 = vp.r1(q0Var.a).Z1(Long.valueOf(d20.i(q0Var.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q0Var.getContext(), q0Var.I0);
                                String G = cd.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = G;
                                if (arrayList.size() == 1) {
                                    x1Var.T = org.telegram.messenger.i0.W2(cd.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    x1Var.T = org.telegram.messenger.i0.W2(cd.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                                }
                                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(cd.L0(2131743390, null), new androidx.car.app.utils.a(q0Var, arrayList, Z1, i13));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.q7, q0Var.I0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                q0Var.a2.add((TLRPC.Chat) it2.next());
                            }
                            q0Var.x1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    q0Var.y1(null);
                    break;
                } else {
                    q0Var.dismiss();
                    break;
                }
                break;
        }
    }
}
