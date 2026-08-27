package jh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import lh.ib;
import lh.sb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.zh;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fe;
import org.telegram.ui.gg;
import org.telegram.ui.nc;
import org.telegram.ui.oc;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.x71;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                e4Var.G3 = canApplyBoost;
                ag.i1.C1(new ag.r2(e4Var, 4), tL_premium_boostsStatus, canApplyBoost, e4Var.x1, true);
                i9 i9Var = e4Var.F0;
                if (i9Var != null) {
                    i9Var.g1 = false;
                    i9Var.P();
                    break;
                }
                break;
            case 1:
                xc xcVar = (xc) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                xcVar.c = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    int i10 = tL_premium_boostsStatus2.level;
                    xcVar.b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                xcVar.X0(true);
                lh.d dVar = xcVar.L;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 2:
                oc ocVar = (oc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                ocVar.getClass();
                if (view instanceof nc) {
                    nc ncVar = (nc) view;
                    ncVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, ocVar.a));
                    ocVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        ncVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 3:
                fe feVar = (fe) this.b;
                ag.i1 i1Var = (ag.i1) this.c;
                i1Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                feVar.s0.showDialog(i1Var);
                break;
            case 4:
                rn rnVar = (rn) this.b;
                rd rdVar = (rd) this.c;
                rnVar.fb = true;
                rdVar.run();
                break;
            case 5:
                gi giVar = (gi) this.b;
                zh zhVar = (zh) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = giVar.F1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(zhVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new gg(9, giVar, zhVar), 66);
                break;
            case 6:
                ri riVar = (ri) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l10 = (Long) obj;
                riVar.f0 = false;
                TLRPC.User user = l10 == null ? null : messagesController.getUser(l10);
                riVar.e0 = user;
                riVar.g0 = user == null;
                if (user != null) {
                    riVar.O();
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((org.telegram.ui.ActionBar.b2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sb E = sb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.J = a2;
                    ib ibVar = E.Y0;
                    if (ibVar != null) {
                        ibVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            default:
                x71.f0((x71) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
        }
    }
}
