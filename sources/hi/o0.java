package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.fl;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x10 x10Var;
        oi.a aVar;
        oi.j4 j4Var;
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                v0.a((v0) obj);
                break;
            case 1:
                ((ai.a1) obj).run();
                break;
            case 2:
                p5 p5Var = ((o5) obj).y;
                if (p5Var.r && (x10Var = p5Var.f) != null) {
                    x10Var.a(5);
                    break;
                }
                break;
            case 3:
                b8 b8Var = (b8) ((y7) obj).h;
                if (b8Var != null) {
                    b8Var.run();
                    break;
                }
                break;
            case 4:
                jg.m mVar = (jg.m) obj;
                mp.u1(mVar.G).s.clear();
                mp.g1().edit().remove("installReferer").commit();
                mVar.f();
                break;
            case 5:
                ((jg.v) obj).run();
                break;
            case 6:
                ((jg.r0) obj).J();
                break;
            case 7:
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
            case 8:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.n6 n6Var = eVar.f;
                int i12 = eVar.a;
                boolean z10 = eVar.r;
                eVar.r = !z10;
                eVar.h.c(gd.M0(!z10 ? 2131753699 : 2131753696, null), true, true);
                n6Var.a();
                n6Var.c(gd.M0(eVar.r ? 2131753697 : 2131753698, null), true, true);
                if (eVar.r) {
                    eVar.x |= 1;
                } else {
                    eVar.x &= -2;
                }
                mp.u1(i12).g7.edit().putInt("dialog_botflags" + eVar.s, eVar.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = mp.u1(i12).l1(eVar.s);
                toggleconnectedbotpaused.paused = eVar.r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 9:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    lc.b0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 10:
                ((af) obj).run();
                break;
            case 11:
                ((af) obj).run();
                break;
            case 12:
                ChatActivityEnterView.g(((qd) ((ki.m0) obj).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 13:
                ((ai.s) obj).run();
                break;
            case 14:
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
            case 15:
                ((li.y) obj).n.o1.A(0);
                break;
            case 16:
                li.d0 d0Var = ((li.z) obj).r;
                if (!org.telegram.messenger.v3.w(27, d0Var.q1)) {
                    d0Var.dismiss();
                    break;
                } else {
                    d dVar = d0Var.s1;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        mp u12 = mp.u1(d0Var.a);
                        li.t tVar = new li.t(d0Var, 2);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(i11), new fl(u12, tVar, i10));
                        break;
                    }
                }
                break;
            case 17:
                ((ni.c) obj).dismiss();
                break;
            case 18:
                oi.o oVar = (oi.o) obj;
                oVar.M(true, 0, 0, 0L, false);
                eg0 eg0Var = oVar.P;
                if (eg0Var != null) {
                    eg0Var.h(true);
                    oVar.P = null;
                    break;
                }
                break;
            case 19:
                oi.p0 p0Var = (oi.p0) obj;
                oi.b3 b3Var = p0Var.h;
                if (b3Var != null && (aVar = p0Var.f) != null) {
                    oi.s3 s3Var = b3Var.a;
                    s3Var.getClass();
                    if (oi.s3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        oi.e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        s3Var.g3.O(true);
                        oi.e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 20:
                oi.l4 l4Var = (oi.l4) obj;
                oi.a aVar2 = l4Var.a;
                if (aVar2 != null && (j4Var = l4Var.H) != null) {
                    ((oi.o3) j4Var).a.p3.H(aVar2);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) obj;
                org.telegram.ui.ActionBar.k kVar = zVar.b;
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) view;
                if (!r0Var.t()) {
                    if (!r0Var.v()) {
                        zVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.B(r0Var.U(true));
                        break;
                    }
                } else if (kVar.v0.a()) {
                    r0Var.V(null, null);
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.ActionBar.x1) obj).dismiss();
                break;
            case 23:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                x2Var.getClass();
                x2Var.M(((Integer) view.getTag()).intValue());
                break;
            case 24:
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) obj;
                if (!d5Var.y.f) {
                    if (!d5Var.x.f) {
                        if (d5Var.c == org.telegram.ui.ActionBar.c5.b) {
                            org.telegram.messenger.g0.E3(4.0f, d5Var, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.ActionBar.a5 a5Var = d5Var.a;
                        int i13 = d5Var.b;
                        org.telegram.ui.ActionBar.j jVar = a5Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                yVar.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 26:
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
            case 27:
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
            case 28:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String M0 = gd.M0(2131742656, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131742657, null);
                alertDialog$Builder.k(gd.M0(2131747638, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                alertDialog$Builder.p();
                break;
            default:
                ((sg.q) obj).dismiss();
                break;
        }
    }
}
