package ii;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.cl;
import org.telegram.messenger.hp;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.s70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rw;
import org.telegram.ui.sb1;
import org.telegram.ui.tf;
import org.telegram.ui.vf0;
import org.telegram.ui.xe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mi.a aVar;
        mi.l4 l4Var;
        int i3 = this.a;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((xe) obj).run();
                break;
            case 1:
                ChatActivityEnterView.e(((hd) ((m0) obj).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 2:
                ((ai.z3) obj).run();
                break;
            case 3:
                ji.n nVar = (ji.n) obj;
                TLRPC.Chat chat = nVar.J;
                if (chat != null && !chat.title.equals(((ci.s) nVar.r.b).getText().toString())) {
                    nVar.getMessagesController().C(nVar.J.id, ((ci.s) nVar.r.b).getText().toString(), new ji.g(nVar, i11));
                }
                TLRPC.Chat chat2 = nVar.J;
                if (chat2 != null && nVar.n != nVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.J.default_banned_rights.manage_linked_peers = !nVar.n;
                    nVar.getMessagesController().H4(nVar.c, nVar.J.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                break;
            case 4:
                ((ji.w) obj).n.l1.D(0);
                break;
            case 5:
                ji.b0 b0Var = ((ji.x) obj).r;
                if (!org.telegram.messenger.t3.w(27, b0Var.n1)) {
                    b0Var.dismiss();
                    break;
                } else {
                    gi.d dVar = b0Var.p1;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        hp s12 = hp.s1(b0Var.a);
                        ji.r rVar = new ji.r(b0Var, 2);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new c3.b(i11), new cl(s12, rVar, i10));
                        break;
                    }
                }
                break;
            case 6:
                kg.m mVar = (kg.m) obj;
                hp.s1(mVar.G).s.clear();
                hp.e1().edit().remove("installReferer").commit();
                mVar.f();
                break;
            case 7:
                ((kg.u) obj).run();
                break;
            case 8:
                ((kg.o0) obj).J();
                break;
            case 9:
                kg.y1 y1Var = (kg.y1) obj;
                LongSparseArray longSparseArray = y1Var.n;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && y1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!u3Var.r) {
                        y1Var.F(stickerSet, u3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        y1Var.e.a.h(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 10:
                lg.e eVar = (lg.e) obj;
                h6 h6Var = eVar.f;
                int i12 = eVar.a;
                boolean z10 = eVar.r;
                eVar.r = !z10;
                eVar.h.c(bd.M0(!z10 ? 2131753701 : 2131753698, null), true, true);
                h6Var.a();
                h6Var.c(bd.M0(eVar.r ? 2131753699 : 2131753700, null), true, true);
                if (eVar.r) {
                    eVar.x |= 1;
                } else {
                    eVar.x &= -2;
                }
                hp.s1(i12).d7.edit().putInt("dialog_botflags" + eVar.s, eVar.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = hp.s1(i12).j1(eVar.s);
                toggleconnectedbotpaused.paused = eVar.r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 11:
                TL_account.TL_businessChatLink tL_businessChatLink = ((lg.t) obj).f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    fc.a0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 12:
                ((li.b) obj).dismiss();
                break;
            case 13:
                mi.p pVar = (mi.p) obj;
                pVar.L(true, 0, 0, 0L, false);
                vf0 vf0Var = pVar.P;
                if (vf0Var != null) {
                    vf0Var.g(true);
                    pVar.P = null;
                    break;
                }
                break;
            case 14:
                mi.s0 s0Var = (mi.s0) obj;
                mi.c3 c3Var = s0Var.h;
                if (c3Var != null && (aVar = s0Var.f) != null) {
                    mi.t3 t3Var = c3Var.a;
                    t3Var.getClass();
                    if (mi.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        mi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.g3.O(true);
                        mi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 15:
                mi.n4 n4Var = (mi.n4) obj;
                mi.a aVar2 = n4Var.a;
                if (aVar2 != null && (l4Var = n4Var.H) != null) {
                    ((mi.p3) l4Var).a.p3.b1(aVar2);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.x xVar = (org.telegram.ui.ActionBar.x) obj;
                org.telegram.ui.ActionBar.k kVar = xVar.b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) view;
                if (!q0Var.s()) {
                    if (!q0Var.u()) {
                        xVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.y(q0Var.T(true));
                        break;
                    }
                } else if (kVar.v0.a()) {
                    q0Var.U(null, null);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.ActionBar.v1) obj).dismiss();
                break;
            case 18:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                t2Var.getClass();
                t2Var.L(((Integer) view.getTag()).intValue());
                break;
            case 19:
                b5 b5Var = (b5) obj;
                if (!b5Var.y.f) {
                    if (!b5Var.x.f) {
                        if (b5Var.c == a5.b) {
                            org.telegram.messenger.g0.G3(4.0f, b5Var, null);
                            break;
                        }
                    } else {
                        y4 y4Var = b5Var.a;
                        int i13 = b5Var.b;
                        org.telegram.ui.ActionBar.j jVar = y4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            break;
                        }
                    }
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                rVar2.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 21:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) obj;
                if (!f0Var.a) {
                    if (f0Var.y != 0 || !f0Var.E) {
                        f0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) f0Var.getContext()).startActivityForResult(((MediaProjectionManager) f0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 22:
                sb1 sb1Var = (sb1) obj;
                if (!sb1Var.a) {
                    if (sb1Var.x != 0) {
                        sb1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) sb1Var.getContext()).startActivityForResult(((MediaProjectionManager) sb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 23:
                Context context = (Context) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.s0.b();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                String M0 = bd.M0(2131742924, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131742925, null);
                alertDialog$Builder.k(bd.M0(2131747839, null), new org.telegram.ui.web.a(lVar));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 25:
                ((tg.q) obj).dismiss();
                break;
            case 26:
                ((tf) obj).run();
                break;
            case 27:
                ((rw) obj).run();
                break;
            case 28:
                ((ug.j2) obj).onBackPressed();
                break;
            default:
                ((s70) obj).performClick();
                break;
        }
    }
}
