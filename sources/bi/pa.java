package bi;

import a8.me;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.kh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.e51;
import org.telegram.ui.ey;
import org.telegram.ui.f61;
import org.telegram.ui.j51;
import org.telegram.ui.ke;
import org.telegram.ui.ki1;
import org.telegram.ui.m31;
import org.telegram.ui.n71;
import org.telegram.ui.rg0;
import org.telegram.ui.wn;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pa(int i10, View view, AtomicReference atomicReference) {
        this.a = 21;
        this.b = i10;
        this.c = view;
        this.d = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        View view2;
        int R;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 3;
        int i13 = 2;
        AndroidUtilities.VcardItem vcardItem = null;
        int i14 = 0;
        boolean z10 = false;
        int i15 = 1;
        int i16 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                qf.d.r((Context) obj2, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 1:
                org.telegram.ui.ActionBar.y5 y5Var = (org.telegram.ui.ActionBar.y5) obj;
                org.telegram.ui.ActionBar.r5 r5Var = ((org.telegram.ui.ActionBar.x5) obj2).a;
                if (!y5Var.s()) {
                    if (!y5Var.y0) {
                        org.telegram.ui.ActionBar.j jVar = r5Var.T;
                        if (jVar != null) {
                            jVar.b(i16);
                            break;
                        }
                    } else {
                        r5Var.r(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = r5Var.T;
                    if (jVar2 == null || jVar2.a()) {
                        y5Var.U(null, null);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) obj2;
                xaVar.e.a(true, true);
                MessagesController.getInstance(i16).getUnconfirmedAuthController().deny((ArrayList) obj, new fi.c4(xaVar, i16, i12));
                break;
            case 3:
                ((org.telegram.ui.Cells.fb) obj2).a(i16, ((org.telegram.ui.Cells.eb) obj).h);
                break;
            case 4:
                ke keVar = (ke) obj2;
                y91 y91Var = (y91) obj;
                org.telegram.ui.ae aeVar = keVar.G0;
                if (view.isEnabled() && !aeVar.Q && !keVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    if (keVar.B0 <= currentTime) {
                        if (keVar.N0 >= MessagesController.getInstance(i16).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            org.telegram.ui.ud udVar = new org.telegram.ui.ud(keVar, twoStepVerificationActivity, i13);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = udVar;
                            aeVar.setLoading(true);
                            twoStepVerificationActivity.t0(new org.telegram.ui.vd(keVar, y91Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            org.telegram.ui.Components.wc.b0(y91Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.qd(keVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        keVar.P0 = org.telegram.ui.Components.wc.b0(y91Var).R(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, y.s0(keVar.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 5:
                wn wnVar = (wn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (wnVar.j1 != null && wnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 6:
                wn wnVar2 = (wn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (wnVar2.t5 != null && i16 < arrayList.size()) {
                    wnVar2.Na(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 7:
                ((nd0) obj2).setValue(i16);
                ((org.telegram.ui.Components.a3) obj).run();
                break;
            case 8:
                al alVar = (al) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                l80 F = l80.F(alVar, u6Var, alVar.x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.g4(alVar, i16, u6Var, i11), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, r6), false);
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                break;
            case 9:
                rs rsVar = (rs) obj2;
                k71 k71Var = (k71) obj;
                if (!rsVar.S()) {
                    r6 = i16 <= 0 ? 1 : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = rsVar.w0;
                    boolean z11 = r6 ^ 1;
                    tL_chatBannedRights.send_media = z11;
                    tL_chatBannedRights.send_photos = z11;
                    tL_chatBannedRights.send_videos = z11;
                    tL_chatBannedRights.send_stickers = z11;
                    tL_chatBannedRights.send_gifs = z11;
                    tL_chatBannedRights.send_inline = z11;
                    tL_chatBannedRights.send_games = z11;
                    tL_chatBannedRights.send_audios = z11;
                    tL_chatBannedRights.send_docs = z11;
                    tL_chatBannedRights.send_voices = z11;
                    tL_chatBannedRights.send_roundvideos = z11;
                    tL_chatBannedRights.embed_links = z11;
                    tL_chatBannedRights.send_polls = z11;
                    tL_chatBannedRights.send_reactions = z11;
                    rsVar.V();
                    k71Var.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    e2Var.show();
                    break;
                }
            case 10:
                w40 w40Var = (w40) obj2;
                w40Var.n = i16;
                w40Var.b.d(view.getLeft(), false);
                w40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i16);
                w40Var.invalidate();
                break;
            case 11:
                kf0 kf0Var = (kf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = kf0Var.M;
                org.telegram.ui.ActionBar.r2 r2Var = kf0Var.r;
                int i17 = kf0Var.F;
                if (i16 < i17 || i16 >= kf0Var.G) {
                    int i18 = kf0Var.H;
                    if (i16 >= i18 && i16 < kf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) kf0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!kf0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= kf0Var.F && i16 < kf0Var.G) {
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList2.size()) {
                                    if (((AndroidUtilities.VcardItem) arrayList2.get(i19)).checked) {
                                        z10 = true;
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                            kf0Var.n.setEnabled(z10);
                            kf0Var.M();
                        }
                        ((if0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ng.j(i11, kf0Var, vcardItem));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    qf.d.r(r2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                qf.d.r(r2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                r2Var.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    }
                }
                break;
            case 12:
                ku0 ku0Var = (ku0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                bw0 bw0Var = ku0Var.f;
                org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var.x1;
                r2Var2.finishPreviewFragment();
                chat.left = false;
                ku0Var.E(false);
                ku0Var.u(i16);
                if (ku0Var.d.isEmpty()) {
                    bw0Var.J1(true);
                    bw0Var.L();
                }
                r2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-bw0Var.l1));
                r2Var2.getMessagesController().addUserToChat(chat.id, r2Var2.getUserConfig().getCurrentUser(), 0, null, r2Var2, new u90(19, ku0Var, chat));
                break;
            case 13:
                ((w51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 14:
                ey.s0((ey) obj2, i16, (l80) obj);
                break;
            case 15:
                rg0.a0((rg0) obj2, i16, (l80) obj);
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.p6[] p6VarArr = (org.telegram.ui.Cells.p6[]) obj;
                zArr[0] = i16 == 1;
                int i21 = 0;
                while (i21 < 2) {
                    p6VarArr[i21].c.a(zArr[0] == (i21 == 1), true);
                    i21++;
                }
                break;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((m31) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 18:
                org.telegram.ui.Components.ey eyVar = (org.telegram.ui.Components.ey) obj;
                f61 f61Var = ((e51) obj2).c;
                if (!eyVar.e && !UserConfig.getInstance(f61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new tg.y0(f61Var.c1, f61Var.getContext(), f61Var.V, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        c51 c51Var = f61Var.h0;
                        if (i22 >= c51Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((c51Var.getChildAt(i22) instanceof j51) && (R = RecyclerView.R((view2 = c51Var.getChildAt(i22)))) >= 0 && f61Var.y0.get(R) == i16) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        f61Var.i(num.intValue(), view2);
                    }
                    aw.g0(null, eyVar.b, false, null, null);
                    f61Var.B0.add(Long.valueOf(eyVar.b.id));
                    f61Var.B(true, true, true);
                    break;
                }
                break;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).run(Integer.valueOf(i16));
                ((org.telegram.ui.Wallet.g5) obj2).setSelected(i16);
                break;
            case 20:
                fi.d dVar = (fi.d) obj2;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!dVar.Q) {
                    me meVar = ki1.d;
                    if (meVar != null && ((byte[]) meVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new kh(dVar, k3Var, i23, view, meVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 21:
                SharedConfig.setSearchEngineType(i16);
                ((org.telegram.ui.Cells.v8) ((View) obj2)).w(org.telegram.ui.web.n1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 22:
                sg.s1 s1Var = (sg.s1) obj2;
                s1Var.a(i16);
                s1Var.b.w().i(i16 - 1, true);
                s1Var.b.i((rg.m) obj);
                break;
            case 23:
                t9 t9Var = (t9) obj2;
                Runnable runnable = (Runnable) obj;
                t9Var.getClass();
                if ((i16 & 15) != 0) {
                    i14 = 15;
                } else if ((i16 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(t9Var.g & i14, i16, !TLObject.hasFlag(r0, i16));
                if (flag == 0) {
                    flag = (~i16) & i14;
                }
                int i24 = t9Var.g;
                int i25 = flag | ((~i14) & i24);
                if (i24 != i25) {
                    t9Var.g = i25;
                    t9Var.j(true);
                }
                runnable.run();
                break;
            default:
                ws0 ws0Var = (ws0) obj2;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj;
                aq aqVar = ws0Var.F;
                aqVar.a(!aqVar.a.q, true);
                boolean z12 = aqVar.a.q;
                org.telegram.ui.Components.wc.b0(r2Var3).Q(z12 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z12 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                ws0Var.d.h = Boolean.valueOf(z12);
                if (ws0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(ws0Var.H, true);
                    ws0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(ws0Var.c);
                togglechatstargiftnotifications.enabled = z12;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new n71(13, ws0Var, r2Var3));
                break;
        }
    }

    public /* synthetic */ pa(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ pa(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
