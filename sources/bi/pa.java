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
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.c61;
import org.telegram.ui.cy;
import org.telegram.ui.g51;
import org.telegram.ui.ii1;
import org.telegram.ui.k31;
import org.telegram.ui.ke;
import org.telegram.ui.l71;
import org.telegram.ui.pg0;
import org.telegram.ui.un;
import org.telegram.ui.w91;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                w91 w91Var = (w91) obj;
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
                            twoStepVerificationActivity.t0(new org.telegram.ui.vd(keVar, w91Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            org.telegram.ui.Components.wc.b0(w91Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.qd(keVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        keVar.P0 = org.telegram.ui.Components.wc.b0(w91Var).R(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, y.s0(keVar.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 5:
                un unVar = (un) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (unVar.j1 != null && unVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 6:
                un unVar2 = (un) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (unVar2.p5 != null && i16 < arrayList.size()) {
                    unVar2.Ka(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 7:
                ((md0) obj2).setValue(i16);
                ((org.telegram.ui.Components.a3) obj).run();
                break;
            case 8:
                al alVar = (al) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                k80 F = k80.F(alVar, u6Var, alVar.x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.g4(alVar, i16, u6Var, i11), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, r6), false);
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                break;
            case 9:
                rs rsVar = (rs) obj2;
                j71 j71Var = (j71) obj;
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
                    j71Var.O(true);
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
                jf0 jf0Var = (jf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = jf0Var.M;
                org.telegram.ui.ActionBar.r2 r2Var = jf0Var.r;
                int i17 = jf0Var.F;
                if (i16 < i17 || i16 >= jf0Var.G) {
                    int i18 = jf0Var.H;
                    if (i16 >= i18 && i16 < jf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) jf0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!jf0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= jf0Var.F && i16 < jf0Var.G) {
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
                            jf0Var.n.setEnabled(z10);
                            jf0Var.M();
                        }
                        ((hf0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ng.j(i11, jf0Var, vcardItem));
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
                ju0 ju0Var = (ju0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                aw0 aw0Var = ju0Var.f;
                org.telegram.ui.ActionBar.r2 r2Var2 = aw0Var.x1;
                r2Var2.finishPreviewFragment();
                chat.left = false;
                ju0Var.E(false);
                ju0Var.u(i16);
                if (ju0Var.d.isEmpty()) {
                    aw0Var.J1(true);
                    aw0Var.L();
                }
                r2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-aw0Var.l1));
                r2Var2.getMessagesController().addUserToChat(chat.id, r2Var2.getUserConfig().getCurrentUser(), 0, null, r2Var2, new t90(19, ju0Var, chat));
                break;
            case 13:
                ((v51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 14:
                cy.s0((cy) obj2, i16, (k80) obj);
                break;
            case 15:
                pg0.a0((pg0) obj2, i16, (k80) obj);
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
                bundle.putLong("dialog_id", ((k31) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 18:
                ey eyVar = (ey) obj;
                c61 c61Var = ((b51) obj2).c;
                if (!eyVar.e && !UserConfig.getInstance(c61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new tg.y0(c61Var.c1, c61Var.getContext(), c61Var.V, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        z41 z41Var = c61Var.h0;
                        if (i22 >= z41Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((z41Var.getChildAt(i22) instanceof g51) && (R = RecyclerView.R((view2 = z41Var.getChildAt(i22)))) >= 0 && c61Var.y0.get(R) == i16) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        c61Var.i(num.intValue(), view2);
                    }
                    aw.g0(null, eyVar.b, false, null, null);
                    c61Var.B0.add(Long.valueOf(eyVar.b.id));
                    c61Var.B(true, true, true);
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
                    me meVar = ii1.d;
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
                sg.t1 t1Var = (sg.t1) obj2;
                t1Var.a(i16);
                t1Var.b.w().i(i16 - 1, true);
                t1Var.b.i((rg.m) obj);
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
                vs0 vs0Var = (vs0) obj2;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj;
                zp zpVar = vs0Var.F;
                zpVar.a(!zpVar.a.q, true);
                boolean z12 = zpVar.a.q;
                org.telegram.ui.Components.wc.b0(r2Var3).Q(z12 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z12 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                vs0Var.d.h = Boolean.valueOf(z12);
                if (vs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(vs0Var.H, true);
                    vs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(vs0Var.c);
                togglechatstargiftnotifications.enabled = z12;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new l71(13, vs0Var, r2Var3));
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
