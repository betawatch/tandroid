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
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a71;
import org.telegram.ui.bj1;
import org.telegram.ui.ce;
import org.telegram.ui.ch0;
import org.telegram.ui.e61;
import org.telegram.ui.j41;
import org.telegram.ui.me;
import org.telegram.ui.qd;
import org.telegram.ui.si1;
import org.telegram.ui.ta1;
import org.telegram.ui.ud;
import org.telegram.ui.uy;
import org.telegram.ui.vd;
import org.telegram.ui.x51;
import org.telegram.ui.yn;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ua(int i10, View view, AtomicReference atomicReference) {
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
                wa waVar = (wa) obj2;
                waVar.e.a(true, true);
                MessagesController.getInstance(i16).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.l4(waVar, i16, i11));
                break;
            case 1:
                ((eb) obj2).a(i16, ((db) obj).h);
                break;
            case 2:
                me meVar = (me) obj2;
                ta1 ta1Var = (ta1) obj;
                ce ceVar = meVar.G0;
                if (view.isEnabled() && !ceVar.N && !meVar.A0.N) {
                    int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    if (meVar.B0 <= currentTime) {
                        if (meVar.N0 >= MessagesController.getInstance(i16).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            ud udVar = new ud(meVar, twoStepVerificationActivity, i13);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = udVar;
                            ceVar.setLoading(true);
                            twoStepVerificationActivity.s0(new vd(meVar, ta1Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            yc.a0(ta1Var).L(meVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new qd(meVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        meVar.P0 = yc.a0(ta1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.h.r0(meVar.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                yn ynVar = (yn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (ynVar.V0 != null && ynVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 4:
                yn ynVar2 = (yn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (ynVar2.b5 != null && i16 < arrayList.size()) {
                    ynVar2.Aa(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 5:
                ((gd0) obj2).setValue(i16);
                ((org.telegram.ui.Components.x2) obj).run();
                break;
            case 6:
                is isVar = (is) obj2;
                w61 w61Var = (w61) obj;
                if (!isVar.Q()) {
                    boolean z11 = i16 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.w0;
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
                    isVar.T();
                    w61Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    break;
                }
            case 7:
                p40 p40Var = (p40) obj2;
                p40Var.n = i16;
                p40Var.b.d(view.getLeft(), false);
                p40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i16);
                p40Var.invalidate();
                break;
            case 8:
                bf0 bf0Var = (bf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = bf0Var.n;
                ArrayList arrayList2 = bf0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = bf0Var.r;
                int i17 = bf0Var.F;
                if (i16 < i17 || i16 >= bf0Var.G) {
                    int i18 = bf0Var.H;
                    if (i16 >= i18 && i16 < bf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) bf0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!bf0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= bf0Var.F && i16 < bf0Var.G) {
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
                            int themedColor = bf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((ze0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, bf0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    nf.f.s(n2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                nf.f.s(n2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
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
            case 9:
                zt0 zt0Var = (zt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qv0 qv0Var = zt0Var.f;
                org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var.v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                zt0Var.E(false);
                zt0Var.u(i16);
                if (zt0Var.d.isEmpty()) {
                    qv0Var.v1(true);
                    qv0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-qv0Var.j1));
                n2Var2.getMessagesController().addUserToChat(chat.id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new vo0(6, zt0Var, chat));
                break;
            case 10:
                ((j51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 11:
                uy.Z((uy) obj2, i16, (b80) obj);
                break;
            case 12:
                ch0.b0((ch0) obj2, i16, (b80) obj);
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                l6[] l6VarArr = (l6[]) obj;
                zArr[0] = i16 == 1;
                int i21 = 0;
                while (i21 < 2) {
                    l6VarArr[i21].c.a(zArr[0] == (i21 == 1), true);
                    i21++;
                }
                break;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((j41) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                ay ayVar = (ay) obj;
                a71 a71Var = ((z51) obj2).c;
                if (!ayVar.e && !UserConfig.getInstance(a71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.y0(a71Var.c1, a71Var.getContext(), a71Var.V, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        x51 x51Var = a71Var.h0;
                        if (i22 >= x51Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((x51Var.getChildAt(i22) instanceof e61) && (R = RecyclerView.R((view2 = x51Var.getChildAt(i22)))) >= 0 && a71Var.y0.get(R) == i16) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        a71Var.i(num.intValue(), view2);
                    }
                    wv.U(null, ayVar.b, false, null, null);
                    a71Var.B0.add(Long.valueOf(ayVar.b.id));
                    a71Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    cf.c cVar = bj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new jh(dVar, f3Var, i23, view, cVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 17:
                SharedConfig.setSearchEngineType(i16);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 18:
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i16);
                r1Var.b.w().i(i16 - 1, true);
                r1Var.b.b((pg.m) obj);
                break;
            case 19:
                gs0 gs0Var = (gs0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                qp qpVar = gs0Var.F;
                qpVar.a(!qpVar.a.q, true);
                boolean z13 = qpVar.a.q;
                yc.a0(n2Var3).P(z13 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z13 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                gs0Var.d.h = Boolean.valueOf(z13);
                if (gs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(gs0Var.H, true);
                    gs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(gs0Var.c);
                togglechatstargiftnotifications.enabled = z13;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new si1(i12, gs0Var, n2Var3));
                break;
            case 20:
                yh.l5 l5Var = (yh.l5) obj2;
                Runnable runnable = (Runnable) obj;
                l5Var.getClass();
                if ((i16 & 15) != 0) {
                    i14 = 15;
                } else if ((i16 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(l5Var.g & i14, i16, !TLObject.hasFlag(r0, i16));
                if (flag == 0) {
                    flag = (~i16) & i14;
                }
                int i24 = l5Var.g;
                int i25 = flag | ((~i14) & i24);
                if (i24 != i25) {
                    l5Var.g = i25;
                    l5Var.i(true);
                }
                runnable.run();
                break;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
        }
    }

    public /* synthetic */ ua(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ ua(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
