package nh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.ke;
import org.telegram.ui.lo;
import org.telegram.ui.o81;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.xn;
import org.telegram.ui.yb;
import ph.da;
import ph.t9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                d4Var.H3 = canApplyBoost;
                eg.v0.C1(new eg.y1(d4Var, 4), tL_premium_boostsStatus, canApplyBoost, d4Var.y1, true);
                i9 i9Var = d4Var.G0;
                if (i9Var != null) {
                    i9Var.h1 = false;
                    i9Var.P();
                    break;
                }
                break;
            case 1:
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
                ph.d dVar = bdVar.M;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 2:
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
            case 3:
                ke keVar = (ke) this.b;
                eg.v0 v0Var = (eg.v0) this.c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                keVar.t0.showDialog(v0Var);
                break;
            case 4:
                xn xnVar = (xn) this.b;
                yb ybVar = (yb) this.c;
                xnVar.gb = true;
                ybVar.run();
                break;
            case 5:
                li liVar = (li) this.b;
                ei eiVar = (ei) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = liVar.G1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(eiVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, liVar, eiVar), 66);
                break;
            case 6:
                wi wiVar = (wi) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l10 = (Long) obj;
                wiVar.g0 = false;
                TLRPC.User user = l10 == null ? null : messagesController.getUser(l10);
                wiVar.f0 = user;
                wiVar.h0 = user == null;
                if (user != null) {
                    wiVar.O();
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((org.telegram.ui.ActionBar.d2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    da E = da.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.K = a2;
                    t9 t9Var = E.Z0;
                    if (t9Var != null) {
                        t9Var.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            default:
                o81.f0((o81) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
        }
    }
}
