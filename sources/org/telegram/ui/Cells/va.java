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
import org.telegram.messenger.kh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.bj1;
import org.telegram.ui.bo;
import org.telegram.ui.ce;
import org.telegram.ui.f61;
import org.telegram.ui.gh0;
import org.telegram.ui.h61;
import org.telegram.ui.i71;
import org.telegram.ui.kj1;
import org.telegram.ui.le;
import org.telegram.ui.m61;
import org.telegram.ui.od;
import org.telegram.ui.r41;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ va(int i10, View view, AtomicReference atomicReference) {
        this.a = 17;
        this.b = i10;
        this.c = view;
        this.d = atomicReference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        View view2;
        int S;
        int i10 = this.a;
        int i11 = 4;
        AndroidUtilities.VcardItem vcardItem = null;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                xa xaVar = (xa) obj2;
                xaVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.b7(xaVar, i15, i12));
                break;
            case 1:
                ((fb) obj2).a(i15, ((eb) obj).h);
                break;
            case 2:
                le leVar = (le) obj2;
                ab1 ab1Var = (ab1) obj;
                ce ceVar = leVar.Q0;
                if (view.isEnabled() && !ceVar.N && !leVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (leVar.L0 <= currentTime) {
                        if (leVar.X0 >= MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            td tdVar = new td(leVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = tdVar;
                            ceVar.setLoading(true);
                            twoStepVerificationActivity.s0(new ud(leVar, ab1Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            vc.a0(ab1Var).L(leVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new od(leVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        leVar.Z0 = vc.a0(ab1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(leVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                bo boVar = (bo) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (boVar.X0 != null && boVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 4:
                bo boVar2 = (bo) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (boVar2.d5 != null && i15 < arrayList.size()) {
                    boVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 5:
                ((uc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.w2) obj).run();
                break;
            case 6:
                fs fsVar = (fs) obj2;
                x51 x51Var = (x51) obj;
                if (!fsVar.S()) {
                    boolean z11 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = fsVar.w0;
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
                    fsVar.V();
                    x51Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    break;
                }
            case 7:
                l40 l40Var = (l40) obj2;
                l40Var.n = i15;
                l40Var.b.d(view.getLeft(), false);
                l40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                l40Var.invalidate();
                break;
            case 8:
                pe0 pe0Var = (pe0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = pe0Var.n;
                ArrayList arrayList2 = pe0Var.M;
                org.telegram.ui.ActionBar.o2 o2Var = pe0Var.r;
                int i16 = pe0Var.F;
                if (i15 < i16 || i15 >= pe0Var.G) {
                    int i17 = pe0Var.H;
                    if (i15 >= i17 && i15 < pe0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) pe0Var.L.get(i15 - i17);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                }
                if (vcardItem != null) {
                    if (!pe0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i15 >= pe0Var.F && i15 < pe0Var.G) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList2.size()) {
                                    if (((AndroidUtilities.VcardItem) arrayList2.get(i18)).checked) {
                                        z10 = true;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            int themedColor = pe0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((ne0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i19 = vcardItem.type;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, pe0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    nf.f.s(o2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                nf.f.s(o2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                o2Var.getParentActivity().startActivityForResult(intent, 500);
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
                it0 it0Var = (it0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                zu0 zu0Var = it0Var.f;
                org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var.v1;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                it0Var.E(false);
                it0Var.u(i15);
                if (it0Var.d.isEmpty()) {
                    zu0Var.v1(true);
                    zu0Var.F();
                }
                o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-zu0Var.j1));
                o2Var2.getMessagesController().addUserToChat(chat.id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new br0(i12, it0Var, chat));
                break;
            case 10:
                ((l41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 11:
                wy.b0((wy) obj2, i15, (n70) obj);
                break;
            case 12:
                gh0.b0((gh0) obj2, i15, (n70) obj);
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                k6[] k6VarArr = (k6[]) obj;
                zArr[0] = i15 == 1;
                int i20 = 0;
                while (i20 < 2) {
                    k6VarArr[i20].c.a(zArr[0] == (i20 == 1), true);
                    i20++;
                }
                break;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((r41) saveToGallerySettingsActivity.s.get(i15)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                wx wxVar = (wx) obj;
                i71 i71Var = ((h61) obj2).c;
                if (!wxVar.e && !UserConfig.getInstance(i71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(i71Var.c1, i71Var.getContext(), i71Var.V, 11, false));
                        break;
                    }
                } else {
                    int i21 = 0;
                    while (true) {
                        f61 f61Var = i71Var.h0;
                        if (i21 >= f61Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((f61Var.getChildAt(i21) instanceof m61) && (S = RecyclerView.S((view2 = f61Var.getChildAt(i21)))) >= 0 && i71Var.y0.get(S) == i15) {
                            num = Integer.valueOf(S);
                        } else {
                            i21++;
                        }
                    }
                    if (num != null) {
                        i71Var.i(num.intValue(), view2);
                    }
                    sv.W(null, wxVar.b, false, null, null);
                    i71Var.B0.add(Long.valueOf(wxVar.b.id));
                    i71Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj;
                if (!dVar.N) {
                    cf.c cVar = kj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags = 4 | tL_messages_requestUrlAuth.flags;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new kh(dVar, g3Var, i22, view, cVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 18:
                qg.u1 u1Var = (qg.u1) obj2;
                u1Var.a(i15);
                u1Var.b.v().i(i15 - 1, true);
                u1Var.b.b((pg.m) obj);
                break;
            case 19:
                or0 or0Var = (or0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj;
                np npVar = or0Var.F;
                npVar.a(!npVar.a.q, true);
                boolean z13 = npVar.a.q;
                vc.a0(o2Var3).P(z13 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z13 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                or0Var.d.h = Boolean.valueOf(z13);
                if (or0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(or0Var.H, true);
                    or0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(or0Var.c);
                togglechatstargiftnotifications.enabled = z13;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new bj1(i11, or0Var, o2Var3));
                break;
            case 20:
                yh.n5 n5Var = (yh.n5) obj2;
                Runnable runnable = (Runnable) obj;
                n5Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(n5Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i23 = n5Var.g;
                int i24 = flag | ((~i13) & i23);
                if (i23 != i24) {
                    n5Var.g = i24;
                    n5Var.i(true);
                }
                runnable.run();
                break;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
        }
    }

    public /* synthetic */ va(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ va(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
