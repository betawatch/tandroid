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
import org.telegram.messenger.sh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce;
import org.telegram.ui.eo;
import org.telegram.ui.fb1;
import org.telegram.ui.fh0;
import org.telegram.ui.i61;
import org.telegram.ui.k61;
import org.telegram.ui.l71;
import org.telegram.ui.le;
import org.telegram.ui.od;
import org.telegram.ui.p61;
import org.telegram.ui.pj1;
import org.telegram.ui.rg0;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.v41;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wa(int i10, View view, AtomicReference atomicReference) {
        this.a = 17;
        this.b = i10;
        this.c = view;
        this.d = atomicReference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        View view2;
        int R;
        int i10 = this.a;
        AndroidUtilities.VcardItem vcardItem = null;
        int i11 = 2;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 1;
        int i14 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ya yaVar = (ya) obj2;
                yaVar.e.a(true, true);
                MessagesController.getInstance(i14).getUnconfirmedAuthController().deny((ArrayList) obj, new bi.c8(yaVar, i14, i11));
                break;
            case 1:
                ((gb) obj2).a(i14, ((fb) obj).h);
                break;
            case 2:
                le leVar = (le) obj2;
                fb1 fb1Var = (fb1) obj;
                ce ceVar = leVar.Q0;
                if (view.isEnabled() && !ceVar.N && !leVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (leVar.L0 <= currentTime) {
                        if (leVar.X0 >= MessagesController.getInstance(i14).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            td tdVar = new td(leVar, twoStepVerificationActivity, i11);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = tdVar;
                            ceVar.setLoading(true);
                            twoStepVerificationActivity.s0(new ud(leVar, fb1Var, twoStepVerificationActivity, i11));
                            break;
                        } else {
                            wc.a0(fb1Var).L(leVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i14).starsRevenueWithdrawalMin, new Object[0]), new od(leVar, i14, i13))).j();
                            break;
                        }
                    } else {
                        leVar.Z0 = wc.a0(fb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, xh.h.j0(leVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                eo eoVar = (eo) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (eoVar.X0 != null && eoVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    break;
                }
                break;
            case 4:
                eo eoVar2 = (eo) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (eoVar2.d5 != null && i14 < arrayList.size()) {
                    eoVar2.Ba(((Integer) arrayList.get(i14)).intValue());
                    break;
                }
                break;
            case 5:
                ((dd0) obj2).setValue(i14);
                ((org.telegram.ui.Components.x2) obj).run();
                break;
            case 6:
                ls lsVar = (ls) obj2;
                j61 j61Var = (j61) obj;
                if (!lsVar.S()) {
                    boolean z11 = i14 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = lsVar.w0;
                    boolean z12 = !z11;
                    tL_chatBannedRights.send_media = z12;
                    tL_chatBannedRights.send_photos = z12;
                    tL_chatBannedRights.send_videos = z12;
                    tL_chatBannedRights.send_stickers = z12;
                    tL_chatBannedRights.send_gifs = z12;
                    tL_chatBannedRights.send_inline = z12;
                    tL_chatBannedRights.send_games = z12;
                    tL_chatBannedRights.send_audios = z12;
                    tL_chatBannedRights.send_docs = z12;
                    tL_chatBannedRights.send_voices = z12;
                    tL_chatBannedRights.send_roundvideos = z12;
                    tL_chatBannedRights.embed_links = z12;
                    tL_chatBannedRights.send_polls = z12;
                    tL_chatBannedRights.send_reactions = z12;
                    lsVar.V();
                    j61Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.R = string;
                    d2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    d2Var.show();
                    break;
                }
            case 7:
                v40 v40Var = (v40) obj2;
                v40Var.n = i14;
                v40Var.b.d(view.getLeft(), false);
                v40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i14);
                v40Var.invalidate();
                break;
            case 8:
                ye0 ye0Var = (ye0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ye0Var.n;
                ArrayList arrayList2 = ye0Var.M;
                org.telegram.ui.ActionBar.p2 p2Var = ye0Var.r;
                int i15 = ye0Var.F;
                if (i14 < i15 || i14 >= ye0Var.G) {
                    int i16 = ye0Var.H;
                    if (i14 >= i16 && i14 < ye0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) ye0Var.L.get(i14 - i16);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i14 - i15);
                }
                if (vcardItem != null) {
                    if (!ye0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i14 >= ye0Var.F && i14 < ye0Var.G) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList2.size()) {
                                    if (((AndroidUtilities.VcardItem) arrayList2.get(i17)).checked) {
                                        z10 = true;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            int themedColor = ye0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((we0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i18 = vcardItem.type;
                        if (i18 != 0) {
                            if (i18 != 1) {
                                if (i18 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new kg.j(6, ye0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    nf.f.s(p2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                nf.f.s(p2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                p2Var.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    }
                }
                break;
            case 9:
                qt0 qt0Var = (qt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                iv0 iv0Var = qt0Var.f;
                org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var.v1;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                qt0Var.E(false);
                qt0Var.u(i14);
                if (qt0Var.d.isEmpty()) {
                    iv0Var.v1(true);
                    iv0Var.F();
                }
                p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-iv0Var.j1));
                p2Var2.getMessagesController().addUserToChat(chat.id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new yo0(5, qt0Var, chat));
                break;
            case 10:
                ((x41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 11:
                wy.b0((wy) obj2, i14, (w70) obj);
                break;
            case 12:
                fh0.Y((fh0) obj2, i14, (w70) obj);
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                m6[] m6VarArr = (m6[]) obj;
                zArr[0] = i14 == 1;
                int i19 = 0;
                while (i19 < 2) {
                    m6VarArr[i19].c.a(zArr[0] == (i19 == 1), true);
                    i19++;
                }
                break;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((v41) saveToGallerySettingsActivity.s.get(i14)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                dy dyVar = (dy) obj;
                l71 l71Var = ((k61) obj2).c;
                if (!dyVar.e && !UserConfig.getInstance(l71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new qg.a1(l71Var.c1, l71Var.getContext(), l71Var.V, 11, false));
                        break;
                    }
                } else {
                    int i20 = 0;
                    while (true) {
                        i61 i61Var = l71Var.h0;
                        if (i20 >= i61Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((i61Var.getChildAt(i20) instanceof p61) && (R = RecyclerView.R((view2 = i61Var.getChildAt(i20)))) >= 0 && l71Var.y0.get(R) == i14) {
                            num = Integer.valueOf(R);
                        } else {
                            i20++;
                        }
                    }
                    if (num != null) {
                        l71Var.i(num.intValue(), view2);
                    }
                    wv.W(null, dyVar.b, false, null, null);
                    l71Var.B0.add(Long.valueOf(dyVar.b.id));
                    l71Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                bi.d dVar = (bi.d) obj2;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                if (!dVar.N) {
                    bi.u6 u6Var = pj1.d;
                    if (u6Var != null && ((byte[]) u6Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i21 = this.b;
                        ConnectionsManager.getInstance(i21).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new sh(dVar, h3Var, i21, view, u6Var));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 17:
                SharedConfig.setSearchEngineType(i14);
                ((s8) ((View) obj2)).u(org.telegram.ui.web.o1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 18:
                pg.r1 r1Var = (pg.r1) obj2;
                r1Var.a(i14);
                r1Var.b.u().i(i14 - 1, true);
                r1Var.b.B((og.m) obj);
                break;
            case 19:
                wr0 wr0Var = (wr0) obj2;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) obj;
                tp tpVar = wr0Var.F;
                tpVar.a(!tpVar.a.q, true);
                boolean z13 = tpVar.a.q;
                wc.a0(p2Var3).P(z13 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z13 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                wr0Var.d.h = Boolean.valueOf(z13);
                if (wr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(wr0Var.H, true);
                    wr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i14).getInputPeer(wr0Var.c);
                togglechatstargiftnotifications.enabled = z13;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new rg0(29, wr0Var, p2Var3));
                break;
            case 20:
                xh.n5 n5Var = (xh.n5) obj2;
                Runnable runnable = (Runnable) obj;
                n5Var.getClass();
                if ((i14 & 15) != 0) {
                    i12 = 15;
                } else if ((i14 & 768) != 0) {
                    i12 = 768;
                }
                int flag = TLObject.setFlag(n5Var.g & i12, i14, !TLObject.hasFlag(r0, i14));
                if (flag == 0) {
                    flag = (~i14) & i12;
                }
                int i22 = n5Var.g;
                int i23 = flag | ((~i12) & i22);
                if (i22 != i23) {
                    n5Var.g = i23;
                    n5Var.i(true);
                }
                runnable.run();
                break;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i14).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
        }
    }

    public /* synthetic */ wa(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ wa(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
