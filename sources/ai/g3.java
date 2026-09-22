package ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.vi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.f91;
import org.telegram.ui.je;
import org.telegram.ui.qo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                f6Var.K3 = canApplyBoost;
                rg.j0.C1(new y3(f6Var, 0), tL_premium_boostsStatus, canApplyBoost, f6Var.B1, true);
                jc jcVar = f6Var.J0;
                if (jcVar != null) {
                    jcVar.k1 = false;
                    jcVar.P();
                    break;
                }
                break;
            case 1:
                m4.g1 g1Var = (m4.g1) this.b;
                b2.q1 q1Var = (b2.q1) this.c;
                m4.k1 k1Var = (m4.k1) obj;
                g1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var = (b2.l1) g1Var.d.n.get(m1Var.a.b);
                        if (l1Var == null || m1Var.a.a != l1Var.a) {
                            c10.a(m1Var);
                        } else {
                            c10.a(new b2.m1(l1Var, m1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                k1Var.q(q1Var);
                break;
            case 2:
                m4.g1 g1Var2 = (m4.g1) this.b;
                m4.r rVar = (m4.r) this.c;
                m4.a0 a0Var = (m4.a0) g1Var2.a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    break;
                }
                break;
            case 3:
                ad adVar = (ad) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                adVar.c = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    int i10 = tL_premium_boostsStatus2.level;
                    adVar.b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                adVar.X0(true);
                ci.d dVar = adVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof org.telegram.ui.qc) {
                    org.telegram.ui.qc qcVar = (org.telegram.ui.qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, rcVar.a));
                    rcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 5:
                je jeVar = (je) this.b;
                rg.j0 j0Var = (rg.j0) this.c;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                jeVar.w0.showDialog(j0Var);
                break;
            case 6:
                bo boVar = (bo) this.b;
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.c;
                boVar.ib = true;
                l4Var.run();
                break;
            case 7:
                vi viVar = (vi) this.b;
                oi oiVar = (oi) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = viVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(oiVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new qo(5, viVar, oiVar), 66);
                break;
            case 8:
                gj gjVar = (gj) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l4 = (Long) obj;
                gjVar.j0 = false;
                TLRPC.User user = l4 == null ? null : messagesController.getUser(l4);
                gjVar.i0 = user;
                gjVar.k0 = user == null;
                if (user != null) {
                    gjVar.O();
                    break;
                }
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((org.telegram.ui.ActionBar.b2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.oc E = ci.oc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    ci.ec ecVar = E.c1;
                    if (ecVar != null) {
                        ecVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            case 10:
                f91.V((f91) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
            default:
                a5.a aVar = (a5.a) this.b;
                ((u2.k0) obj).d(aVar.b, (u2.f0) aVar.c, (u2.b0) this.c);
                break;
        }
    }
}
