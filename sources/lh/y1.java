package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import nh.gb;
import nh.wa;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b81;
import org.telegram.ui.de;
import org.telegram.ui.lc;
import org.telegram.ui.mc;
import org.telegram.ui.tn;
import org.telegram.ui.vc;
import org.telegram.ui.vf;
import org.telegram.ui.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                d4Var.G3 = canApplyBoost;
                cg.v0.C1(new cg.z1(d4Var, 4), tL_premium_boostsStatus, canApplyBoost, d4Var.x1, true);
                i9 i9Var = d4Var.F0;
                if (i9Var != null) {
                    i9Var.g1 = false;
                    i9Var.P();
                    break;
                }
                break;
            case 1:
                vc vcVar = (vc) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                vcVar.c = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    int i10 = tL_premium_boostsStatus2.level;
                    vcVar.b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                vcVar.X0(true);
                nh.d dVar = vcVar.L;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 2:
                mc mcVar = (mc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                mcVar.getClass();
                if (view instanceof lc) {
                    lc lcVar = (lc) view;
                    lcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, mcVar.a));
                    mcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        lcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 3:
                de deVar = (de) this.b;
                cg.v0 v0Var = (cg.v0) this.c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                deVar.s0.showDialog(v0Var);
                break;
            case 4:
                tn tnVar = (tn) this.b;
                vf vfVar = (vf) this.c;
                tnVar.fb = true;
                vfVar.run();
                break;
            case 5:
                ni niVar = (ni) this.b;
                gi giVar = (gi) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = niVar.F1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(giVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new zg(8, niVar, giVar), 66);
                break;
            case 6:
                yi yiVar = (yi) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l10 = (Long) obj;
                yiVar.f0 = false;
                TLRPC.User user = l10 == null ? null : messagesController.getUser(l10);
                yiVar.e0 = user;
                yiVar.g0 = user == null;
                if (user != null) {
                    yiVar.O();
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((org.telegram.ui.ActionBar.c2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    gb E = gb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.J = a2;
                    wa waVar = E.Y0;
                    if (waVar != null) {
                        waVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            default:
                b81.f0((b81) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
        }
    }
}
