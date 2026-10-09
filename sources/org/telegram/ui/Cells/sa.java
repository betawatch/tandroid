package org.telegram.ui.Cells;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import org.telegram.messenger.jh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.be;
import org.telegram.ui.ej1;
import org.telegram.ui.fh0;
import org.telegram.ui.h61;
import org.telegram.ui.j61;
import org.telegram.ui.k71;
import org.telegram.ui.ke;
import org.telegram.ui.nd;
import org.telegram.ui.nj1;
import org.telegram.ui.o61;
import org.telegram.ui.s41;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.ty;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa(int i10, View view, AtomicReference atomicReference) {
        this.a = 19;
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
        int i11 = 3;
        int i12 = 4;
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
                ua uaVar = (ua) obj2;
                uaVar.e.a(true, true);
                MessagesController.getInstance(i16).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.k4(uaVar, i16, i11));
                break;
            case 1:
                ((cb) obj2).a(i16, ((bb) obj).h);
                break;
            case 2:
                ke keVar = (ke) obj2;
                bb1 bb1Var = (bb1) obj;
                be beVar = keVar.Q0;
                if (view.isEnabled() && !beVar.N && !keVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    if (keVar.L0 <= currentTime) {
                        if (keVar.X0 >= MessagesController.getInstance(i16).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            sd sdVar = new sd(keVar, twoStepVerificationActivity, i13);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = sdVar;
                            beVar.setLoading(true);
                            twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            ad.a0(bb1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new nd(keVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        keVar.Z0 = ad.a0(bb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(keVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                zn znVar = (zn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (znVar.X0 != null && znVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 4:
                zn znVar2 = (zn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (znVar2.d5 != null && i16 < arrayList.size()) {
                    znVar2.Fa(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 5:
                ((ud0) obj2).setValue(i16);
                ((org.telegram.ui.Components.z2) obj).run();
                break;
            case 6:
                gl glVar = (gl) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                p80 F = p80.F(glVar, e6Var, glVar.x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new zk(glVar, i16, e6Var, r6), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new al(glVar, r6), false);
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                break;
            case 7:
                vs vsVar = (vs) obj2;
                c71 c71Var = (c71) obj;
                if (!vsVar.T()) {
                    r6 = i16 <= 0 ? 1 : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = vsVar.w0;
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
                    vsVar.W();
                    c71Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    break;
                }
            case 8:
                c50 c50Var = (c50) obj2;
                c50Var.n = i16;
                c50Var.b.d(view.getLeft(), false);
                c50Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i16);
                c50Var.invalidate();
                break;
            case 9:
                qf0 qf0Var = (qf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = qf0Var.n;
                ArrayList arrayList2 = qf0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = qf0Var.r;
                int i17 = qf0Var.F;
                if (i16 < i17 || i16 >= qf0Var.G) {
                    int i18 = qf0Var.H;
                    if (i16 >= i18 && i16 < qf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) qf0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!qf0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= qf0Var.F && i16 < qf0Var.G) {
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
                            int themedColor = qf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((of0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, qf0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    of.f.s(n2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                of.f.s(n2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                n2Var.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        }
                    }
                }
                break;
            case 10:
                ku0 ku0Var = (ku0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                bw0 bw0Var = ku0Var.f;
                org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var.v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                ku0Var.E(false);
                ku0Var.u(i16);
                if (ku0Var.d.isEmpty()) {
                    bw0Var.v1(true);
                    bw0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-bw0Var.j1));
                n2Var2.getMessagesController().addUserToChat(chat.id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new ci0(14, ku0Var, chat));
                break;
            case 11:
                ((q51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 12:
                ty.p0((ty) obj2, i16, (p80) obj);
                break;
            case 13:
                fh0.Y((fh0) obj2, i16, (p80) obj);
                break;
            case 14:
                boolean[] zArr = (boolean[]) obj2;
                l6[] l6VarArr = (l6[]) obj;
                zArr[0] = i16 == 1;
                int i21 = 0;
                while (i21 < 2) {
                    l6VarArr[i21].c.a(zArr[0] == (i21 == 1), true);
                    i21++;
                }
                break;
            case 15:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((s41) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 16:
                ny nyVar = (ny) obj;
                k71 k71Var = ((j61) obj2).c;
                if (!nyVar.e && !UserConfig.getInstance(k71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.y0(k71Var.c1, k71Var.getContext(), k71Var.V, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        h61 h61Var = k71Var.h0;
                        if (i22 >= h61Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((h61Var.getChildAt(i22) instanceof o61) && (R = RecyclerView.R((view2 = h61Var.getChildAt(i22)))) >= 0 && k71Var.y0.get(R) == i16) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        k71Var.i(num.intValue(), view2);
                    }
                    iw.X(null, nyVar.b, false, null, null);
                    k71Var.B0.add(Long.valueOf(nyVar.b.id));
                    k71Var.B(true, true, true);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Wallet.j) obj).run(Integer.valueOf(i16));
                ((org.telegram.ui.Wallet.u4) obj2).setSelected(i16);
                break;
            case 18:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    ci.u5 u5Var = nj1.d;
                    if (u5Var != null && ((byte[]) u5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new jh(dVar, f3Var, i23, view, u5Var));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 19:
                SharedConfig.setSearchEngineType(i16);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.n1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 20:
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i16);
                r1Var.b.v().i(i16 - 1, true);
                r1Var.b.b((pg.m) obj);
                break;
            case 21:
                rs0 rs0Var = (rs0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                dq dqVar = rs0Var.F;
                dqVar.a(!dqVar.a.q, true);
                boolean z12 = dqVar.a.q;
                ad.a0(n2Var3).P(z12 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z12 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                rs0Var.d.h = Boolean.valueOf(z12);
                if (rs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(rs0Var.H, true);
                    rs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(rs0Var.c);
                togglechatstargiftnotifications.enabled = z12;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new ej1(i12, rs0Var, n2Var3));
                break;
            case 22:
                yh.e5 e5Var = (yh.e5) obj2;
                Runnable runnable = (Runnable) obj;
                e5Var.getClass();
                if ((i16 & 15) != 0) {
                    i14 = 15;
                } else if ((i16 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(e5Var.g & i14, i16, !TLObject.hasFlag(r0, i16));
                if (flag == 0) {
                    flag = (~i16) & i14;
                }
                int i24 = e5Var.g;
                int i25 = flag | ((~i14) & i24);
                if (i24 != i25) {
                    e5Var.g = i25;
                    e5Var.i(true);
                }
                runnable.run();
                break;
            default:
                of.f.s((Context) obj2, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
        }
    }

    public /* synthetic */ sa(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ sa(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
