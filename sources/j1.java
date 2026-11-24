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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s1) obj).h();
                break;
            case 1:
                ((wc7) obj).run();
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
                    new tz(l9Var.getContext(), null, null, (hv4) l9Var.e.get(0)).show();
                    break;
                }
            case 5:
                eb ebVar = (eb) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ebVar.getContext());
                String M0 = jb6.M0(2131742577, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131742578, null);
                alertDialog$Builder.j(jb6.M0(2131747564, null), new ta(ebVar));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.o();
                break;
            case 6:
                ib ibVar = (ib) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    ibVar.T1 = null;
                }
                vh6 vh6Var = ibVar.V1;
                if (vh6Var != null && ibVar.U1 != null && vh6Var.m() >= ibVar.U1.size()) {
                    ibVar.V1 = null;
                }
                cg1 cg1Var = ibVar.b2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                vh6 vh6Var2 = ibVar.V1;
                vg1 vg1Var = cg1Var.a;
                vg1Var.v0 = tL_channelAdminLogEventsFilter2;
                vg1Var.x0 = vh6Var2;
                if (tL_channelAdminLogEventsFilter2 == null && vh6Var2 == null) {
                    vg1Var.J.setSubtitle(jb6.M0(2131751011, null));
                } else {
                    vg1Var.J.setSubtitle(jb6.M0(2131750849, null));
                }
                vg1Var.X0(true);
                ibVar.dismiss();
                break;
            case 7:
                tc tcVar = (tc) obj;
                d dVar = tcVar.b;
                if (dVar instanceof yv1) {
                    ((yv1) dVar).Tb(tcVar.d);
                    break;
                }
                break;
            case 8:
                ((ne) obj).dismiss();
                break;
            case 9:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((oh2) view).c(atomicBoolean.get(), true);
                break;
            case 10:
                ((xf2) obj).run();
                break;
            case 11:
                ((et) obj).toggle();
                break;
            case 12:
                mw0 webView = ((m) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 13:
                ((m00) obj).dismiss();
                break;
            case 14:
                v70 v70Var = (v70) obj;
                if (view != v70Var.e) {
                    int i = ((u70) view).e;
                    if (v70Var.Z() == 0 && i > 0) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v70Var.getParentActivity());
                        String M02 = jb6.M0(2131748344, null);
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.S = M02;
                        heVar2.U = jb6.a0("AutoDeleteConfirmMessage", null, 2131753830, jb6.c0(i * 60));
                        alertDialog$Builder2.g(jb6.M0(2131752542, null), new w00((byte) 7));
                        alertDialog$Builder2.j(jb6.M0(2131751097, null), new o(v70Var, view, (byte) 16));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        v70Var.b0(view, true);
                        break;
                    }
                } else {
                    ik.k(v70Var.getParentActivity(), null, new nl9((Object) v70Var, (byte) 8));
                    break;
                }
            case 15:
                ((mc0) obj).k0();
                break;
            case 16:
                ((bd0) obj).b(false);
                break;
            case 17:
                ((en1) obj).run();
                break;
            case 18:
                ((en1) obj).run();
                break;
            case 19:
                lr0 lr0Var = ((or0) obj).d;
                TL_keyboard.KeyboardButton keyboardButton = (TL_keyboard.KeyboardButton) view.getTag();
                ChatActivityEnterView chatActivityEnterView = ((dx1) lr0Var).a;
                int i2 = ChatActivityEnterView.z7;
                chatActivityEnterView.a1(keyboardButton);
                break;
            case 20:
                ((f00) obj).run();
                break;
            case 21:
                ((y8c) obj).run();
                break;
            case 22:
                ((qs0) obj).w.g0(1);
                break;
            case 23:
                os0 os0Var = ((ss0) obj).d;
                rs0 rs0Var = os0Var.a;
                rs0 rs0Var2 = os0Var.a;
                TLRPC.Dialog R0 = rs0Var.getMessagesController().R0(rs0Var.a);
                if (R0 != null && R0.top_message != 0 && !rs0Var2.e0()) {
                    TLRPC.User W1 = rs0Var2.getMessagesController().W1(Long.valueOf(rs0Var2.a));
                    if (W1 != null && W1.bot_has_main_app) {
                        rs0Var2.getMessagesController().B3(rs0Var2, rs0Var2.getMessagesController().W1(Long.valueOf(rs0Var2.a)), null, rs0Var2.getClassGuid(), null, false, false);
                        break;
                    } else {
                        rs0Var2.h0(false);
                        break;
                    }
                } else {
                    ls0 ls0Var = new ls0(rs0Var2, b2);
                    if (!rs0Var2.e0()) {
                        ls0Var.run();
                        break;
                    } else {
                        rs0Var2.getMessagesController().n5(ls0Var, rs0Var2.a);
                        break;
                    }
                }
                break;
            case 24:
                ((f31) ((c31) obj).o1).f();
                u31.e();
                break;
            case 25:
                ((s31) obj).f();
                break;
            case 26:
                w41 w41Var = (w41) obj;
                io ioVar = w41Var.f;
                int i3 = w41Var.a;
                boolean z = w41Var.r;
                w41Var.r = !z;
                w41Var.h.c(jb6.M0(!z ? 2131753666 : 2131753663, null), true, true);
                ioVar.a();
                ioVar.c(jb6.M0(w41Var.r ? 2131753664 : 2131753665, null), true, true);
                boolean z2 = w41Var.r;
                int i4 = w41Var.x;
                if (z2) {
                    w41Var.x = i4 | 1;
                } else {
                    w41Var.x = i4 & (-2);
                }
                oc7.r1(i3).W3.edit().putInt("dialog_botflags" + w41Var.s, w41Var.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = oc7.r1(i3).i1(w41Var.s);
                toggleconnectedbotpaused.paused = w41Var.r;
                ConnectionsManager.getInstance(i3).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 27:
                TL_account.TL_businessChatLink tL_businessChatLink = ((k51) obj).f;
                if (tL_businessChatLink != null) {
                    gm.g(tL_businessChatLink.link);
                    c41.b0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 28:
                q71 q71Var = (q71) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(q71Var.getContext());
                String M03 = jb6.M0(2131752035, null);
                ho hoVar = q71Var.c;
                if (TextUtils.isEmpty(hoVar.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) hoVar.i) + ")";
                }
                String concat = M03.concat(str);
                he heVar3 = alertDialog$Builder3.a;
                heVar3.S = concat;
                heVar3.U = jb6.M0(2131744503, null);
                alertDialog$Builder3.j(q71Var.b.i, new xg0(q71Var, (byte) 24));
                alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
                q71Var.d.showDialog(heVar3);
                View c = heVar3.c(-1);
                if (c instanceof TextView) {
                    int i5 = cmb.o7;
                    anb.X((TextView) c, i5, null);
                    c.setBackground(cmb.H0(gm.L(6.0f), cmb.p1(0.12f, cmb.w0(null, i5, false))));
                    break;
                }
                break;
            default:
                y71 y71Var = (y71) ((w71) obj).f;
                y71Var.M = !y71Var.M;
                y71Var.A0(true);
                y71Var.y0();
                break;
        }
    }
}
