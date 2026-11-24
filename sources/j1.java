// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s1) obj).h();
                break;
            case 1:
                ((va7) obj).run();
                break;
            case 2:
                ((o5) obj).dismiss();
                break;
            case 3:
                r6 r6Var = (r6) obj;
                a aVar = r6Var.b;
                r7 r7Var = (r7) view;
                if (!r7Var.t()) {
                    if (!r7Var.v()) {
                        r6Var.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        aVar.B(r7Var.T(true));
                        break;
                    }
                } else if (aVar.v0.a()) {
                    r7Var.U(null, null);
                    break;
                }
                break;
            case 4:
                l9 l9Var = (l9) obj;
                if (l9Var.e.size() != 1) {
                    new j9(l9Var.getContext()).show();
                    break;
                } else {
                    new ty(l9Var.getContext(), null, null, (gt4) l9Var.e.get(0)).show();
                    break;
                }
            case 5:
                eb ebVar = (eb) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ebVar.getContext());
                String M0 = k96.M0(2131742651, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131742652, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), new ta(ebVar));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.o();
                break;
            case 6:
                ib ibVar = (ib) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    ibVar.T1 = null;
                }
                vf6 vf6Var = ibVar.V1;
                if (vf6Var != null && ibVar.U1 != null && vf6Var.m() >= ibVar.U1.size()) {
                    ibVar.V1 = null;
                }
                ue1 ue1Var = ibVar.b2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                vf6 vf6Var2 = ibVar.V1;
                nf1 nf1Var = ue1Var.a;
                nf1Var.v0 = tL_channelAdminLogEventsFilter2;
                nf1Var.x0 = vf6Var2;
                if (tL_channelAdminLogEventsFilter2 == null && vf6Var2 == null) {
                    nf1Var.J.setSubtitle(k96.M0(2131751062, null));
                } else {
                    nf1Var.J.setSubtitle(k96.M0(2131750900, null));
                }
                nf1Var.W0(true);
                ibVar.dismiss();
                break;
            case 7:
                ((nd) obj).dismiss();
                break;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((ag2) view).c(atomicBoolean.get(), true);
                break;
            case 9:
                ((mk2) obj).run();
                break;
            case 10:
                ((es) obj).toggle();
                break;
            case 11:
                cv0 webView = ((m) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 12:
                ((lz) obj).dismiss();
                break;
            case 13:
                v60 v60Var = (v60) obj;
                if (view != v60Var.e) {
                    int i = ((u60) view).e;
                    if (v60Var.Y() == 0 && i > 0) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v60Var.getParentActivity());
                        String M02 = k96.M0(2131748395, null);
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.S = M02;
                        hdVar2.U = k96.a0("AutoDeleteConfirmMessage", null, 2131753862, k96.c0(i * 60));
                        alertDialog$Builder2.g(k96.M0(2131752577, null), new wz((byte) 7));
                        alertDialog$Builder2.j(k96.M0(2131751148, null), new o(v60Var, view, (byte) 16));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        v60Var.a0(view, true);
                        break;
                    }
                } else {
                    ij.k(v60Var.getParentActivity(), null, new lj9((Object) v60Var, (byte) 8));
                    break;
                }
            case 14:
                ((mb0) obj).j0();
                break;
            case 15:
                ((bc0) obj).b(false);
                break;
            case 16:
                ((wl1) obj).run();
                break;
            case 17:
                ((wl1) obj).run();
                break;
            case 18:
                lq0 lq0Var = ((oq0) obj).d;
                TL_keyboard.KeyboardButton keyboardButton = (TL_keyboard.KeyboardButton) view.getTag();
                ChatActivityEnterView chatActivityEnterView = ((qv1) lq0Var).a;
                int i2 = ChatActivityEnterView.r7;
                chatActivityEnterView.Y0(keyboardButton);
                break;
            case 19:
                ((oz) obj).run();
                break;
            case 20:
                ((x6c) obj).run();
                break;
            case 21:
                ((x11) ((u11) obj).o1).f();
                m21.e();
                break;
            case 22:
                ((k21) obj).f();
                break;
            case 23:
                o31 o31Var = (o31) obj;
                hn hnVar = o31Var.f;
                int i3 = o31Var.a;
                boolean z = o31Var.r;
                o31Var.r = !z;
                o31Var.h.c(k96.M0(!z ? 2131753698 : 2131753695, null), true, true);
                hnVar.a();
                hnVar.c(k96.M0(o31Var.r ? 2131753696 : 2131753697, null), true, true);
                boolean z2 = o31Var.r;
                int i4 = o31Var.x;
                if (z2) {
                    o31Var.x = i4 | 1;
                } else {
                    o31Var.x = i4 & (-2);
                }
                na7.q1(i3).W3.edit().putInt("dialog_botflags" + o31Var.s, o31Var.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = na7.q1(i3).h1(o31Var.s);
                toggleconnectedbotpaused.paused = o31Var.r;
                ConnectionsManager.getInstance(i3).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((d41) obj).f;
                if (tL_businessChatLink != null) {
                    gl.g(tL_businessChatLink.link);
                    u21.b0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 25:
                j61 j61Var = (j61) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(j61Var.getContext());
                String M03 = k96.M0(2131752086, null);
                gn gnVar = j61Var.c;
                if (TextUtils.isEmpty(gnVar.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) gnVar.i) + ")";
                }
                String concat = M03.concat(str);
                hd hdVar3 = alertDialog$Builder3.a;
                hdVar3.S = concat;
                hdVar3.U = k96.M0(2131744577, null);
                alertDialog$Builder3.j(j61Var.b.i, new sg0(j61Var, (byte) 21));
                alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                j61Var.d.showDialog(hdVar3);
                View c = hdVar3.c(-1);
                if (c instanceof TextView) {
                    int i5 = bkb.o7;
                    zkb.X((TextView) c, i5, null);
                    c.setBackground(bkb.H0(gl.L(6.0f), bkb.p1(0.12f, bkb.w0(null, i5, false))));
                    break;
                }
                break;
            case 26:
                r61 r61Var = (r61) ((p61) obj).f;
                r61Var.M = !r61Var.M;
                r61Var.z0(true);
                r61Var.x0();
                break;
            case 27:
                f71 f71Var = (f71) obj;
                switch (f71Var.f) {
                    case 0:
                        ((g71) f71Var.h).r.G.i(null, (u61) f71Var.getTag(), true);
                        break;
                    default:
                        ((l71) f71Var.h).n.G.i(null, (u61) f71Var.getTag(), true);
                        break;
                }
            default:
                ((va7) obj).run();
                break;
        }
    }
}
