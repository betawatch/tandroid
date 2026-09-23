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
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.d61;
import org.telegram.ui.dj1;
import org.telegram.ui.i41;
import org.telegram.ui.je;
import org.telegram.ui.md;
import org.telegram.ui.ra1;
import org.telegram.ui.rd;
import org.telegram.ui.ry;
import org.telegram.ui.sd;
import org.telegram.ui.ui1;
import org.telegram.ui.w51;
import org.telegram.ui.xn;
import org.telegram.ui.y51;
import org.telegram.ui.z61;
import org.telegram.ui.zg0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        int i11 = 3;
        int i12 = 4;
        AndroidUtilities.VcardItem vcardItem = null;
        int i13 = 2;
        int i14 = 0;
        boolean z10 = false;
        int i15 = 1;
        int i16 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ya yaVar = (ya) obj2;
                yaVar.e.a(true, true);
                MessagesController.getInstance(i16).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.l4(yaVar, i16, i11));
                break;
            case 1:
                ((gb) obj2).a(i16, ((fb) obj).h);
                break;
            case 2:
                je jeVar = (je) obj2;
                ra1 ra1Var = (ra1) obj;
                ae aeVar = jeVar.Q0;
                if (view.isEnabled() && !aeVar.N && !jeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    if (jeVar.L0 <= currentTime) {
                        if (jeVar.X0 >= MessagesController.getInstance(i16).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            rd rdVar = new rd(jeVar, twoStepVerificationActivity, i13);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = rdVar;
                            aeVar.setLoading(true);
                            twoStepVerificationActivity.s0(new sd(jeVar, ra1Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            xc.a0(ra1Var).L(jeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new md(jeVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        jeVar.Z0 = xc.a0(ra1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(jeVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                xn xnVar = (xn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (xnVar.X0 != null && xnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 4:
                xn xnVar2 = (xn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (xnVar2.d5 != null && i16 < arrayList.size()) {
                    xnVar2.Ba(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 5:
                ((tc0) obj2).setValue(i16);
                ((org.telegram.ui.Components.w2) obj).run();
                break;
            case 6:
                gs gsVar = (gs) obj2;
                v51 v51Var = (v51) obj;
                if (!gsVar.S()) {
                    boolean z11 = i16 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.w0;
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
                    gsVar.V();
                    v51Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    break;
                }
            case 7:
                m40 m40Var = (m40) obj2;
                m40Var.n = i16;
                m40Var.b.d(view.getLeft(), false);
                m40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i16);
                m40Var.invalidate();
                break;
            case 8:
                pe0 pe0Var = (pe0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = pe0Var.n;
                ArrayList arrayList2 = pe0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = pe0Var.r;
                int i17 = pe0Var.F;
                if (i16 < i17 || i16 >= pe0Var.G) {
                    int i18 = pe0Var.H;
                    if (i16 >= i18 && i16 < pe0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) pe0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!pe0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= pe0Var.F && i16 < pe0Var.G) {
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
                            int themedColor = pe0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((ne0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, pe0Var, vcardItem));
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
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    }
                }
                break;
            case 9:
                ht0 ht0Var = (ht0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yu0 yu0Var = ht0Var.f;
                org.telegram.ui.ActionBar.n2 n2Var2 = yu0Var.v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                ht0Var.E(false);
                ht0Var.u(i16);
                if (ht0Var.d.isEmpty()) {
                    yu0Var.v1(true);
                    yu0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-yu0Var.j1));
                n2Var2.getMessagesController().addUserToChat(chat.id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new ar0(i13, ht0Var, chat));
                break;
            case 10:
                ((j41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 11:
                ry.a0((ry) obj2, i16, (o70) obj);
                break;
            case 12:
                zg0.Y((zg0) obj2, i16, (o70) obj);
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
                bundle.putLong("dialog_id", ((i41) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                xx xxVar = (xx) obj;
                z61 z61Var = ((y51) obj2).c;
                if (!xxVar.e && !UserConfig.getInstance(z61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.x0(z61Var.c1, z61Var.getContext(), z61Var.V, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        w51 w51Var = z61Var.h0;
                        if (i22 >= w51Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((w51Var.getChildAt(i22) instanceof d61) && (R = RecyclerView.R((view2 = w51Var.getChildAt(i22)))) >= 0 && z61Var.y0.get(R) == i16) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        z61Var.i(num.intValue(), view2);
                    }
                    tv.W(null, xxVar.b, false, null, null);
                    z61Var.B0.add(Long.valueOf(xxVar.b.id));
                    z61Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    cf.c cVar = dj1.d;
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
                ((s8) ((View) obj2)).u(org.telegram.ui.web.n1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 18:
                qg.u1 u1Var = (qg.u1) obj2;
                u1Var.a(i16);
                u1Var.b.v().i(i16 - 1, true);
                u1Var.b.b((pg.m) obj);
                break;
            case 19:
                nr0 nr0Var = (nr0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                op opVar = nr0Var.F;
                opVar.a(!opVar.a.q, true);
                boolean z13 = opVar.a.q;
                xc.a0(n2Var3).P(z13 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z13 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                nr0Var.d.h = Boolean.valueOf(z13);
                if (nr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(nr0Var.H, true);
                    nr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(nr0Var.c);
                togglechatstargiftnotifications.enabled = z13;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new ui1(i12, nr0Var, n2Var3));
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
