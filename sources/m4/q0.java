package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ce;
import bi.qd;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd;
import org.telegram.ui.eo;
import org.telegram.ui.k91;
import org.telegram.ui.le;
import org.telegram.ui.sc;
import org.telegram.ui.tc;
import zh.a3;
import zh.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                b2.q1 q1Var = (b2.q1) this.c;
                l1 l1Var = (l1) obj;
                h1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var2 = (b2.l1) h1Var.d.n.get(m1Var.a.b);
                        if (l1Var2 == null || m1Var.a.a != l1Var2.a) {
                            c10.a(m1Var);
                        } else {
                            c10.a(new b2.m1(l1Var2, m1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                l1Var.q(q1Var);
                break;
            case 1:
                h1 h1Var2 = (h1) this.b;
                r rVar = (r) this.c;
                b0 b0Var = (b0) h1Var2.a.get();
                if (b0Var != null && !b0Var.j()) {
                    b0Var.g(rVar, false);
                    break;
                }
                break;
            case 2:
                cd cdVar = (cd) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                cdVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    cdVar.b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                cdVar.X0(true);
                bi.d dVar = cdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 3:
                tc tcVar = (tc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                tcVar.getClass();
                if (view instanceof sc) {
                    sc scVar = (sc) view;
                    scVar.setBackgroundColor(j6.v0(j6.d6, tcVar.a));
                    tcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        scVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 4:
                le leVar = (le) this.b;
                qg.k0 k0Var2 = (qg.k0) this.c;
                k0Var2.G1((ChannelBoostsController.CanApplyBoost) obj);
                leVar.w0.showDialog(k0Var2);
                break;
            case 5:
                eo eoVar = (eo) this.b;
                org.telegram.ui.n nVar = (org.telegram.ui.n) this.c;
                eoVar.jb = true;
                nVar.run();
                break;
            case 6:
                yi yiVar = (yi) this.b;
                ri riVar = (ri) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = yiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(riVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new th(0, yiVar, riVar), 66);
                break;
            case 7:
                jj jjVar = (jj) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l4 = (Long) obj;
                jjVar.j0 = false;
                TLRPC.User user = l4 == null ? null : messagesController.getUser(l4);
                jjVar.i0 = user;
                jjVar.k0 = user == null;
                if (user != null) {
                    jjVar.O();
                    break;
                }
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((d2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ce E = ce.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    qd qdVar = E.c1;
                    if (qdVar != null) {
                        qdVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            case 9:
                k91.V((k91) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
            case 10:
                a5.a aVar = (a5.a) this.b;
                ((u2.m0) obj).d(aVar.b, (u2.g0) aVar.c, (u2.c0) this.c);
                break;
            default:
                a3 a3Var = (a3) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                a3Var.K3 = canApplyBoost;
                qg.k0.C1(new bi.o1(a3Var, 11), tL_premium_boostsStatus2, canApplyBoost, a3Var.B1, true);
                u7 u7Var = a3Var.J0;
                if (u7Var != null) {
                    u7Var.k1 = false;
                    u7Var.P();
                    break;
                }
                break;
        }
    }
}
