package kh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.pd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fh1;
import org.telegram.ui.gf;
import org.telegram.ui.jg;
import org.telegram.ui.jh0;
import org.telegram.ui.li0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qh.a aVar;
        qh.d4 d4Var;
        switch (this.a) {
            case 0:
                c9 c9Var = (c9) ((z8) this.b).h;
                if (c9Var != null) {
                    c9Var.run();
                    break;
                }
                break;
            case 1:
                ((gf) this.b).run();
                break;
            case 2:
                ((gf) this.b).run();
                break;
            case 3:
                ChatActivityEnterView.h(((pd) ((mh.o0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 4:
                ((androidx.car.app.utils.c) this.b).run();
                break;
            case 5:
                nh.o oVar = (nh.o) this.b;
                TLRPC.Chat chat = oVar.D;
                if (chat != null && !chat.title.equals(((gh.o) oVar.n.b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.D.id, ((gh.o) oVar.n.b).getText().toString(), new nh.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.D;
                if (chat2 != null && oVar.h != oVar.f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.D.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.b, oVar.D.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                break;
            case 6:
                ((nh.d0) this.b).h.d.D(0);
                break;
            case 7:
                nh.j0.x(((nh.e0) this.b).r);
                break;
            case 8:
                of.m mVar = (of.m) this.b;
                MessagesController.getInstance(mVar.B).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar.l();
                break;
            case 9:
                ((of.t) this.b).run();
                break;
            case 10:
                ((of.p0) this.b).K();
                break;
            case 11:
                of.y1 y1Var = (of.y1) this.b;
                LongSparseArray longSparseArray = y1Var.n;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && y1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!s3Var.r) {
                        y1Var.F(stickerSet, s3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        y1Var.e.a.h(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.J.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 13:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (!u0Var.a) {
                    if (u0Var.x != 0 || !u0Var.y) {
                        u0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) u0Var.getContext()).startActivityForResult(((MediaProjectionManager) u0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 14:
                fh1 fh1Var = (fh1) this.b;
                if (!fh1Var.a) {
                    if (fh1Var.w != 0) {
                        fh1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) fh1Var.getContext()).startActivityForResult(((MediaProjectionManager) fh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 15:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.g1.j();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 17:
                pf.f fVar = (pf.f) this.b;
                org.telegram.ui.Components.j6 j6Var = fVar.f;
                int i9 = fVar.a;
                boolean z10 = fVar.r;
                fVar.r = !z10;
                fVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                j6Var.a();
                j6Var.c(LocaleController.getString(fVar.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (fVar.r) {
                    fVar.w |= 1;
                } else {
                    fVar.w &= -2;
                }
                MessagesController.getNotificationsSettings(i9).edit().putInt("dialog_botflags" + fVar.s, fVar.w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i9).getInputPeer(fVar.s);
                toggleconnectedbotpaused.paused = fVar.r;
                ConnectionsManager.getInstance(i9).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 18:
                TL_account.TL_businessChatLink tL_businessChatLink = ((pf.p) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    org.telegram.ui.Components.oc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 19:
                ((ph.b) this.b).dismiss();
                break;
            case 20:
                qh.p pVar = (qh.p) this.b;
                pVar.H(0, true, 0, false, 0L);
                li0 li0Var = pVar.K;
                if (li0Var != null) {
                    li0Var.h(true);
                    pVar.K = null;
                    break;
                }
                break;
            case 21:
                qh.q0 q0Var = (qh.q0) this.b;
                qh.w2 w2Var = q0Var.h;
                if (w2Var != null && (aVar = q0Var.f) != null) {
                    qh.o3 o3Var = w2Var.a;
                    o3Var.getClass();
                    if (qh.o3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        qh.b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        o3Var.U2.N(true);
                        qh.b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 22:
                qh.f4 f4Var = (qh.f4) this.b;
                qh.a aVar2 = f4Var.a;
                if (aVar2 != null && (d4Var = f4Var.C) != null) {
                    ((qh.k3) d4Var).a.d3.n0(aVar2);
                    break;
                }
                break;
            case 23:
                ((xf.x) this.b).dismiss();
                break;
            case 24:
                ((jh0) this.b).run();
                break;
            case 25:
                ((yf.t2) this.b).onBackPressed();
                break;
            case 26:
                ((jg) this.b).run();
                break;
            case 27:
                ((l80) this.b).performClick();
                break;
            default:
                zf.k1 k1Var = (zf.k1) this.b;
                PremiumPreviewFragment.o0();
                PremiumPreviewFragment.j0(k1Var.p0, null, "profile", null);
                break;
        }
    }
}
