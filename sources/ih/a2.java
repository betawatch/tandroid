package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kh.mb;
import kh.wb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fe;
import org.telegram.ui.mc;
import org.telegram.ui.nc;
import org.telegram.ui.qn;
import org.telegram.ui.rc;
import org.telegram.ui.rd;
import org.telegram.ui.xc;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                i4Var.G3 = canApplyBoost;
                zf.j0.C1(new bg.i1(i4Var, 3), tL_premium_boostsStatus, canApplyBoost, i4Var.x1, true);
                m9 m9Var = i4Var.F0;
                if (m9Var != null) {
                    m9Var.g1 = false;
                    m9Var.P();
                    break;
                }
                break;
            case 1:
                xc xcVar = (xc) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                xcVar.c = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    int i9 = tL_premium_boostsStatus2.level;
                    xcVar.b = i9;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i9;
                    }
                }
                xcVar.X0(true);
                kh.d dVar = xcVar.L;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 2:
                nc ncVar = (nc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                ncVar.getClass();
                if (view instanceof mc) {
                    mc mcVar = (mc) view;
                    mcVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, ncVar.a));
                    ncVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        mcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 3:
                fe feVar = (fe) this.b;
                zf.j0 j0Var = (zf.j0) this.c;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                feVar.s0.showDialog(j0Var);
                break;
            case 4:
                qn qnVar = (qn) this.b;
                rd rdVar = (rd) this.c;
                qnVar.fb = true;
                rdVar.run();
                break;
            case 5:
                ki kiVar = (ki) this.b;
                di diVar = (di) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i10 = kiVar.F1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i10).getInputUser(diVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_toggleBotInAttachMenu, new rc(12, kiVar, diVar), 66);
                break;
            case 6:
                vi viVar = (vi) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l10 = (Long) obj;
                viVar.f0 = false;
                TLRPC.User user = l10 == null ? null : messagesController.getUser(l10);
                viVar.e0 = user;
                viVar.g0 = user == null;
                if (user != null) {
                    viVar.N();
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((org.telegram.ui.ActionBar.c2) this.c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    wb E = wb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.J = a2;
                    mb mbVar = E.Y0;
                    if (mbVar != null) {
                        mbVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            default:
                z71.e0((z71) this.b, (TLRPC.TL_attachMenuBot) this.c);
                break;
        }
    }
}
