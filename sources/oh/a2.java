package oh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.xi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.ke;
import org.telegram.ui.lo;
import org.telegram.ui.qc;
import org.telegram.ui.rc;
import org.telegram.ui.v81;
import org.telegram.ui.xc;
import org.telegram.ui.xn;
import qh.ba;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                f4Var.H3 = canApplyBoost;
                fg.v0.C1(new fg.x1(f4Var, 4), tL_premium_boostsStatus, canApplyBoost, f4Var.y1, true);
                i9 i9Var = f4Var.G0;
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
                qh.d dVar = bdVar.M;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 2:
                rc rcVar = (rc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, rcVar.a));
                    rcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 3:
                ke keVar = (ke) this.b;
                fg.v0 v0Var = (fg.v0) this.c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                keVar.t0.showDialog(v0Var);
                break;
            case 4:
                xn xnVar = (xn) this.b;
                xc xcVar = (xc) this.c;
                xnVar.gb = true;
                xcVar.run();
                break;
            case 5:
                mi miVar = (mi) this.b;
                fi fiVar = (fi) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = miVar.G1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(fiVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, miVar, fiVar), 66);
                break;
            case 6:
                xi xiVar = (xi) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l10 = (Long) obj;
                xiVar.g0 = false;
                TLRPC.User user = l10 == null ? null : messagesController.getUser(l10);
                xiVar.f0 = user;
                xiVar.h0 = user == null;
                if (user != null) {
                    xiVar.O();
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((org.telegram.ui.ActionBar.d2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ba E = ba.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.K = a2;
                    qh.q9 q9Var = E.Z0;
                    if (q9Var != null) {
                        q9Var.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            default:
                v81.f0((v81) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
        }
    }
}
