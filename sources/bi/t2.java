package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.fc;
import di.pc;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.vi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.co;
import org.telegram.ui.i91;
import org.telegram.ui.ke;
import org.telegram.ui.rc;
import org.telegram.ui.ro;
import org.telegram.ui.sc;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                o5Var.K3 = canApplyBoost;
                sg.k0.C1(new l3(o5Var, 0), tL_premium_boostsStatus, canApplyBoost, o5Var.B1, true);
                pb pbVar = o5Var.J0;
                if (pbVar != null) {
                    pbVar.k1 = false;
                    pbVar.P();
                    break;
                }
                break;
            case 1:
                m4.f1 f1Var = (m4.f1) this.b;
                b2.q1 q1Var = (b2.q1) this.c;
                m4.j1 j1Var = (m4.j1) obj;
                f1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var = (b2.l1) f1Var.d.n.get(m1Var.a.b);
                        if (l1Var == null || m1Var.a.a != l1Var.a) {
                            c10.a(m1Var);
                        } else {
                            c10.a(new b2.m1(l1Var, m1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                j1Var.q(q1Var);
                break;
            case 2:
                m4.f1 f1Var2 = (m4.f1) this.b;
                m4.r rVar = (m4.r) this.c;
                m4.a0 a0Var = (m4.a0) f1Var2.a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    break;
                }
                break;
            case 3:
                bd bdVar = (bd) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.c = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    int i10 = tL_premium_boostsStatus2.level;
                    bdVar.b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                bdVar.X0(true);
                di.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 4:
                sc scVar = (sc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                scVar.getClass();
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, scVar.a));
                    scVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 5:
                ke keVar = (ke) this.b;
                sg.k0 k0Var2 = (sg.k0) this.c;
                k0Var2.G1((ChannelBoostsController.CanApplyBoost) obj);
                keVar.w0.showDialog(k0Var2);
                break;
            case 6:
                co coVar = (co) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                coVar.jb = true;
                c6Var.run();
                break;
            case 7:
                vi viVar = (vi) this.b;
                oi oiVar = (oi) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = viVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(oiVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new ro(5, viVar, oiVar), 66);
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
                    pc E = pc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    fc fcVar = E.c1;
                    if (fcVar != null) {
                        fcVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            case 10:
                i91.V((i91) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
            default:
                a5.a aVar = (a5.a) this.b;
                ((u2.k0) obj).d(aVar.b, (u2.f0) aVar.c, (u2.b0) this.c);
                break;
        }
    }
}
