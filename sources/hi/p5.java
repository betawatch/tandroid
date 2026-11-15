package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.jl;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.yb1;
import org.telegram.ui.ye;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z10 z10Var;
        oi.a aVar;
        oi.h4 h4Var;
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                r5 r5Var = ((q5) obj).y;
                if (r5Var.r && (z10Var = r5Var.f) != null) {
                    z10Var.a(5);
                    break;
                }
                break;
            case 1:
                b8 b8Var = (b8) ((y7) obj).h;
                if (b8Var != null) {
                    b8Var.run();
                    break;
                }
                break;
            case 2:
                jg.m mVar = (jg.m) obj;
                np.s1(mVar.G).s.clear();
                np.e1().edit().remove("installReferer").commit();
                mVar.f();
                break;
            case 3:
                ((jg.v) obj).run();
                break;
            case 4:
                ((jg.r0) obj).J();
                break;
            case 5:
                jg.c2 c2Var = (jg.c2) obj;
                LongSparseArray longSparseArray = c2Var.n;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!u3Var.r) {
                        c2Var.F(stickerSet, u3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        c2Var.e.a.h(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 6:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.h6 h6Var = eVar.f;
                int i12 = eVar.a;
                boolean z10 = eVar.r;
                eVar.r = !z10;
                eVar.h.c(hd.M0(!z10 ? 2131753701 : 2131753698, null), true, true);
                h6Var.a();
                h6Var.c(hd.M0(eVar.r ? 2131753699 : 2131753700, null), true, true);
                if (eVar.r) {
                    eVar.x |= 1;
                } else {
                    eVar.x &= -2;
                }
                np.s1(i12).e7.edit().putInt("dialog_botflags" + eVar.s, eVar.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = np.s1(i12).j1(eVar.s);
                toggleconnectedbotpaused.paused = eVar.r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 7:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    cc.a0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 8:
                ((ye) obj).run();
                break;
            case 9:
                ((ye) obj).run();
                break;
            case 10:
                ChatActivityEnterView.g(((org.telegram.ui.Components.hd) ((ki.m0) obj).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 11:
                ((androidx.car.app.utils.a) obj).run();
                break;
            case 12:
                li.n nVar = (li.n) obj;
                TLRPC.Chat chat = nVar.J;
                if (chat != null && !chat.title.equals(((di.q) nVar.r.b).getText().toString())) {
                    nVar.getMessagesController().C(nVar.J.id, ((di.q) nVar.r.b).getText().toString(), new li.g(nVar, i11));
                }
                TLRPC.Chat chat2 = nVar.J;
                if (chat2 != null && nVar.n != nVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.J.default_banned_rights.manage_linked_peers = !nVar.n;
                    nVar.getMessagesController().I4(nVar.c, nVar.J.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                break;
            case 13:
                ((li.y) obj).n.o1.C(0);
                break;
            case 14:
                li.d0 d0Var = ((li.z) obj).r;
                if (!org.telegram.messenger.t3.w(27, d0Var.q1)) {
                    d0Var.dismiss();
                    break;
                } else {
                    d dVar = d0Var.s1;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        np s12 = np.s1(d0Var.a);
                        li.s sVar = new li.s(d0Var, 2);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(i11), new jl(s12, sVar, i10));
                        break;
                    }
                }
                break;
            case 15:
                ((ni.b) obj).dismiss();
                break;
            case 16:
                oi.o oVar = (oi.o) obj;
                oVar.M(true, 0, 0, 0L, false);
                bg0 bg0Var = oVar.P;
                if (bg0Var != null) {
                    bg0Var.h(true);
                    oVar.P = null;
                    break;
                }
                break;
            case 17:
                oi.p0 p0Var = (oi.p0) obj;
                oi.z2 z2Var = p0Var.h;
                if (z2Var != null && (aVar = p0Var.f) != null) {
                    oi.q3 q3Var = z2Var.a;
                    q3Var.getClass();
                    if (oi.q3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        oi.d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        q3Var.g3.O(true);
                        oi.d2 d2Var2 = q3Var.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 18:
                oi.j4 j4Var = (oi.j4) obj;
                oi.a aVar2 = j4Var.a;
                if (aVar2 != null && (h4Var = j4Var.H) != null) {
                    ((oi.m3) h4Var).a.p3.A(aVar2);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) view;
                if (!q0Var.t()) {
                    if (!q0Var.v()) {
                        yVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.A(q0Var.U(true));
                        break;
                    }
                } else if (kVar.v0.a()) {
                    q0Var.V(null, null);
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.ActionBar.w1) obj).dismiss();
                break;
            case 21:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                u2Var.getClass();
                u2Var.M(((Integer) view.getTag()).intValue());
                break;
            case 22:
                org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) obj;
                if (!z4Var.y.f) {
                    if (!z4Var.x.f) {
                        if (z4Var.c == org.telegram.ui.ActionBar.y4.b) {
                            org.telegram.messenger.g0.F3(4.0f, z4Var, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.ActionBar.w4 w4Var = z4Var.a;
                        int i13 = z4Var.b;
                        org.telegram.ui.ActionBar.j jVar = w4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            break;
                        }
                    }
                }
                break;
            case 23:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                zVar.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 24:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) obj;
                if (!x0Var.a) {
                    if (x0Var.y != 0 || !x0Var.E) {
                        x0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 25:
                yb1 yb1Var = (yb1) obj;
                if (!yb1Var.a) {
                    if (yb1Var.x != 0) {
                        yb1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) yb1Var.getContext()).startActivityForResult(((MediaProjectionManager) yb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 26:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String M0 = hd.M0(2131742914, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131742915, null);
                alertDialog$Builder.k(hd.M0(2131747831, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 27:
                ((sg.q) obj).dismiss();
                break;
            case 28:
                ((ye) obj).run();
                break;
            default:
                ((u11) obj).run();
                break;
        }
    }
}
