package ii;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import jg.d2;
import jg.r0;
import li.b3;
import li.f2;
import li.k4;
import li.m4;
import li.p3;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ml;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bg0;
import org.telegram.ui.d10;
import org.telegram.ui.xf;
import org.telegram.ui.zb1;
import tg.i2;
import ug.f1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        li.a aVar;
        k4 k4Var;
        int i7 = this.a;
        int i10 = 2;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                p pVar = (p) obj;
                TLRPC.Chat chat = pVar.I;
                if (chat != null && !chat.title.equals(((bi.v) pVar.r.b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.I.id, ((bi.v) pVar.r.b).getText().toString(), new i(pVar, i12));
                }
                TLRPC.Chat chat2 = pVar.I;
                if (chat2 != null && pVar.n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.I.default_banned_rights.manage_linked_peers = !pVar.n;
                    pVar.getMessagesController().H4(pVar.c, pVar.I.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                break;
            case 1:
                ((y) obj).n.k1.E(0);
                break;
            case 2:
                d0 d0Var = ((z) obj).r;
                if (!t3.w(27, d0Var.m1)) {
                    d0Var.dismiss();
                    break;
                } else {
                    fi.d dVar = d0Var.o1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        qp s12 = qp.s1(d0Var.a);
                        t tVar = new t(d0Var, i10);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(i12), new ml(s12, tVar, i11));
                        break;
                    }
                }
                break;
            case 3:
                jg.n nVar = (jg.n) obj;
                qp.s1(nVar.F).s.clear();
                qp.e1().edit().remove("installReferer").commit();
                nVar.f();
                break;
            case 4:
                ((jg.w) obj).run();
                break;
            case 5:
                ((r0) obj).J();
                break;
            case 6:
                d2 d2Var = (d2) obj;
                LongSparseArray longSparseArray = d2Var.n;
                u3 u3Var = (u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && d2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!u3Var.r) {
                        d2Var.F(stickerSet, u3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        d2Var.e.a.h(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 7:
                kg.e eVar = (kg.e) obj;
                j6 j6Var = eVar.f;
                int i13 = eVar.a;
                boolean z9 = eVar.r;
                eVar.r = !z9;
                eVar.h.c(id.M0(!z9 ? 2131753701 : 2131753698, null), true, true);
                j6Var.a();
                j6Var.c(id.M0(eVar.r ? 2131753699 : 2131753700, null), true, true);
                if (eVar.r) {
                    eVar.x |= 1;
                } else {
                    eVar.x &= -2;
                }
                qp.s1(i13).d7.edit().putInt("dialog_botflags" + eVar.s, eVar.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = qp.s1(i13).j1(eVar.s);
                toggleconnectedbotpaused.paused = eVar.r;
                ConnectionsManager.getInstance(i13).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    hc.a0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 9:
                ((ki.b) obj).dismiss();
                break;
            case 10:
                li.p pVar2 = (li.p) obj;
                pVar2.L(true, 0, 0, 0L, false);
                bg0 bg0Var = pVar2.O;
                if (bg0Var != null) {
                    bg0Var.g(true);
                    pVar2.O = null;
                    break;
                }
                break;
            case 11:
                li.r0 r0Var = (li.r0) obj;
                b3 b3Var = r0Var.h;
                if (b3Var != null && (aVar = r0Var.f) != null) {
                    li.t3 t3Var = b3Var.a;
                    t3Var.getClass();
                    if (li.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.f3.O(true);
                        f2 f2Var2 = t3Var.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 12:
                m4 m4Var = (m4) obj;
                li.a aVar2 = m4Var.a;
                if (aVar2 != null && (k4Var = m4Var.G) != null) {
                    ((p3) k4Var).a.o3.n(aVar2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.b;
                org.telegram.ui.ActionBar.r0 r0Var2 = (org.telegram.ui.ActionBar.r0) view;
                if (!r0Var2.s()) {
                    if (!r0Var2.u()) {
                        yVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.y(r0Var2.T(true));
                        break;
                    }
                } else if (kVar.u0.a()) {
                    r0Var2.U(null, null);
                    break;
                }
                break;
            case 14:
                ((x1) obj).dismiss();
                break;
            case 15:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                v2Var.L(((Integer) view.getTag()).intValue());
                break;
            case 16:
                b5 b5Var = (b5) obj;
                if (!b5Var.y.f) {
                    if (!b5Var.x.f) {
                        if (b5Var.c == a5.b) {
                            org.telegram.messenger.g0.G3(4.0f, b5Var, null);
                            break;
                        }
                    } else {
                        y4 y4Var = b5Var.a;
                        int i14 = b5Var.b;
                        org.telegram.ui.ActionBar.j jVar = y4Var.V;
                        if (jVar != null) {
                            jVar.b(i14);
                            break;
                        }
                    }
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                yVar2.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 18:
                t0 t0Var = (t0) obj;
                if (!t0Var.a) {
                    if (t0Var.y != 0 || !t0Var.D) {
                        t0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) t0Var.getContext()).startActivityForResult(((MediaProjectionManager) t0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 19:
                zb1 zb1Var = (zb1) obj;
                if (!zb1Var.a) {
                    if (zb1Var.x != 0) {
                        zb1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) zb1Var.getContext()).startActivityForResult(((MediaProjectionManager) zb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar2.getContext());
                String M0 = id.M0(2131742917, null);
                u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131742918, null);
                alertDialog$Builder.k(id.M0(2131747832, null), new org.telegram.ui.web.a(jVar2));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 21:
                ((sg.q) obj).dismiss();
                break;
            case 22:
                ((xf) obj).run();
                break;
            case 23:
                ((d10) obj).run();
                break;
            case 24:
                ((i2) obj).onBackPressed();
                break;
            case 25:
                ((w70) obj).performClick();
                break;
            case 26:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((f1) obj).l2, null, "profile", null);
                break;
            case 27:
                final wg.g0 g0Var = (wg.g0) obj;
                yg.a aVar3 = g0Var.I2;
                if (!aVar3.a.Q) {
                    aVar3.b(true);
                    String str = g0Var.J2;
                    c20 c20Var = new c20() { // from class: wg.f0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj2) {
                            switch (i11) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.I2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.I2.b(false);
                                    h.c((TLRPC.TL_error) obj2, (FrameLayout) g0Var3.b, g0Var3.I0, new e0(g0Var3, 0));
                                    break;
                            }
                        }
                    };
                    c20 c20Var2 = new c20() { // from class: wg.f0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj2) {
                            switch (i12) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.I2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.I2.b(false);
                                    h.c((TLRPC.TL_error) obj2, (FrameLayout) g0Var3.b, g0Var3.I0, new e0(g0Var3, 0));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.s0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(c20Var2, c20Var, i11), 2);
                    break;
                }
                break;
            case 28:
                ((wg.j0) obj).dismiss();
                break;
            default:
                ((wg.b0) ((xg.f) obj)).r.dismiss();
                break;
        }
    }
}
