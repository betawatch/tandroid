package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.gl;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af;
import org.telegram.ui.bc1;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y10 y10Var;
        oi.a aVar;
        oi.k4 k4Var;
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((ai.j1) obj).run();
                break;
            case 1:
                o5 o5Var = ((n5) obj).y;
                if (o5Var.r && (y10Var = o5Var.f) != null) {
                    y10Var.a(5);
                    break;
                }
                break;
            case 2:
                a8 a8Var = (a8) ((x7) obj).h;
                if (a8Var != null) {
                    a8Var.run();
                    break;
                }
                break;
            case 3:
                jg.m mVar = (jg.m) obj;
                np.u1(mVar.G).s.clear();
                np.g1().edit().remove("installReferer").commit();
                mVar.f();
                break;
            case 4:
                ((jg.v) obj).run();
                break;
            case 5:
                ((jg.r0) obj).J();
                break;
            case 6:
                jg.c2 c2Var = (jg.c2) obj;
                LongSparseArray longSparseArray = c2Var.n;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!v3Var.r) {
                        c2Var.F(stickerSet, v3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        c2Var.e.a.h(v3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 7:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.o6 o6Var = eVar.f;
                int i12 = eVar.a;
                boolean z10 = eVar.r;
                eVar.r = !z10;
                eVar.h.c(hd.N0(!z10 ? 2131753698 : 2131753695, null), true, true);
                o6Var.a();
                o6Var.c(hd.N0(eVar.r ? 2131753696 : 2131753697, null), true, true);
                if (eVar.r) {
                    eVar.x |= 1;
                } else {
                    eVar.x &= -2;
                }
                np.u1(i12).g7.edit().putInt("dialog_botflags" + eVar.s, eVar.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = np.u1(i12).l1(eVar.s);
                toggleconnectedbotpaused.paused = eVar.r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    lc.b0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 9:
                ((af) obj).run();
                break;
            case 10:
                ((af) obj).run();
                break;
            case 11:
                ChatActivityEnterView.g(((qd) ((ki.l0) obj).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 12:
                ((ai.r) obj).run();
                break;
            case 13:
                li.p pVar = (li.p) obj;
                TLRPC.Chat chat = pVar.J;
                if (chat != null && !chat.title.equals(((di.q) pVar.r.b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.J.id, ((di.q) pVar.r.b).getText().toString(), new li.i(pVar, i11));
                }
                TLRPC.Chat chat2 = pVar.J;
                if (chat2 != null && pVar.n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.J.default_banned_rights.manage_linked_peers = !pVar.n;
                    pVar.getMessagesController().S4(pVar.c, pVar.J.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                break;
            case 14:
                ((li.y) obj).n.o1.A(0);
                break;
            case 15:
                li.d0 d0Var = ((li.z) obj).r;
                if (!org.telegram.messenger.v3.w(27, d0Var.q1)) {
                    d0Var.dismiss();
                    break;
                } else {
                    e eVar2 = d0Var.s1;
                    if (!eVar2.R) {
                        eVar2.setLoading(true);
                        np u12 = np.u1(d0Var.a);
                        li.t tVar = new li.t(d0Var, 2);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(i11), new gl(u12, tVar, i10));
                        break;
                    }
                }
                break;
            case 16:
                ((ni.b) obj).dismiss();
                break;
            case 17:
                oi.o oVar = (oi.o) obj;
                oVar.M(true, 0, 0, 0L, false);
                eg0 eg0Var = oVar.P;
                if (eg0Var != null) {
                    eg0Var.h(true);
                    oVar.P = null;
                    break;
                }
                break;
            case 18:
                oi.q0 q0Var = (oi.q0) obj;
                oi.c3 c3Var = q0Var.h;
                if (c3Var != null && (aVar = q0Var.f) != null) {
                    oi.t3 t3Var = c3Var.a;
                    t3Var.getClass();
                    if (oi.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        oi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.g3.O(true);
                        oi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 19:
                oi.m4 m4Var = (oi.m4) obj;
                oi.a aVar2 = m4Var.a;
                if (aVar2 != null && (k4Var = m4Var.H) != null) {
                    ((oi.p3) k4Var).a.p3.H(aVar2);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.b;
                org.telegram.ui.ActionBar.q0 q0Var2 = (org.telegram.ui.ActionBar.q0) view;
                if (!q0Var2.t()) {
                    if (!q0Var2.v()) {
                        yVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.A(q0Var2.U(true));
                        break;
                    }
                } else if (kVar.v0.a()) {
                    q0Var2.V(null, null);
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.ActionBar.w1) obj).dismiss();
                break;
            case 22:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                w2Var.getClass();
                w2Var.M(((Integer) view.getTag()).intValue());
                break;
            case 23:
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) obj;
                if (!c5Var.y.f) {
                    if (!c5Var.x.f) {
                        if (c5Var.c == org.telegram.ui.ActionBar.b5.b) {
                            org.telegram.messenger.g0.E3(4.0f, c5Var, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.ActionBar.z4 z4Var = c5Var.a;
                        int i13 = c5Var.b;
                        org.telegram.ui.ActionBar.j jVar = z4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            break;
                        }
                    }
                }
                break;
            case 24:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                yVar2.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 25:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) obj;
                if (!w0Var.a) {
                    if (w0Var.y != 0 || !w0Var.E) {
                        w0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) w0Var.getContext()).startActivityForResult(((MediaProjectionManager) w0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 26:
                bc1 bc1Var = (bc1) obj;
                if (!bc1Var.a) {
                    if (bc1Var.x != 0) {
                        bc1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) bc1Var.getContext()).startActivityForResult(((MediaProjectionManager) bc1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 27:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String N0 = hd.N0(2131742648, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131742649, null);
                alertDialog$Builder.k(hd.N0(2131747637, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                break;
            case 28:
                ((sg.q) obj).dismiss();
                break;
            default:
                ((af) obj).run();
                break;
        }
    }
}
