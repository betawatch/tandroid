package eg;

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
import mh.l7;
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
import org.telegram.messenger.mh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.aj1;
import org.telegram.ui.be;
import org.telegram.ui.e41;
import org.telegram.ui.ke;
import org.telegram.ui.na1;
import org.telegram.ui.od;
import org.telegram.ui.py;
import org.telegram.ui.t51;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.v51;
import org.telegram.ui.w61;
import org.telegram.ui.wg0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k2(int i10, View view, AtomicReference atomicReference) {
        this.a = 21;
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
        int i12 = 2;
        AndroidUtilities.VcardItem vcardItem = null;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj2;
                m2Var.a(i15);
                m2Var.b.w().i(i15 - 1, true);
                m2Var.b.g((dg.m) obj);
                break;
            case 1:
                or0 or0Var = (or0) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                np npVar = or0Var.C;
                npVar.a(!npVar.a.q, true);
                boolean z10 = npVar.a.q;
                qc.a0(p2Var).P(z10 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z10 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                or0Var.d.h = Boolean.valueOf(z10);
                if (or0Var.E >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(or0Var.E, true);
                    or0Var.E = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(or0Var.c);
                togglechatstargiftnotifications.enabled = z10;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new b3(i11, or0Var, p2Var));
                break;
            case 2:
                l7 l7Var = (l7) obj2;
                Runnable runnable = (Runnable) obj;
                l7Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(l7Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i16 = l7Var.g;
                int i17 = flag | ((~i13) & i16);
                if (i16 != i17) {
                    l7Var.g = i17;
                    l7Var.i(true);
                }
                runnable.run();
                break;
            case 3:
                af.g.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 4:
                sa saVar = (sa) obj2;
                saVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new qa(saVar, i15, i13));
                break;
            case 5:
                ((za) obj2).a(i15, ((ya) obj).h);
                break;
            case 6:
                ke keVar = (ke) obj2;
                na1 na1Var = (na1) obj;
                be beVar = keVar.N0;
                if (view.isEnabled() && !beVar.K && !keVar.H0.K) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.I0 <= currentTime) {
                        if (keVar.U0 >= MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            td tdVar = new td(keVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.W = 1;
                            twoStepVerificationActivity.Y = tdVar;
                            beVar.setLoading(true);
                            twoStepVerificationActivity.s0(new ud(keVar, na1Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            qc.a0(na1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new od(keVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        keVar.W0 = qc.a0(na1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, mh.p.j0(keVar.I0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                xn xnVar = (xn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (xnVar.U0 != null && xnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 8:
                xn xnVar2 = (xn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (xnVar2.a5 != null && i15 < arrayList.size()) {
                    xnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 9:
                ((yc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.u2) obj).run();
                break;
            case 10:
                gs gsVar = (gs) obj2;
                w51 w51Var = (w51) obj;
                if (!gsVar.S()) {
                    boolean z11 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.t0;
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
                    w51Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    d2Var.show();
                    break;
                }
            case 11:
                p40 p40Var = (p40) obj2;
                p40Var.n = i15;
                p40Var.b.d(view.getLeft(), false);
                p40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                p40Var.invalidate();
                break;
            case 12:
                ue0 ue0Var = (ue0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ue0Var.n;
                ArrayList arrayList2 = ue0Var.J;
                org.telegram.ui.ActionBar.p2 p2Var2 = ue0Var.r;
                int i18 = ue0Var.C;
                if (i15 < i18 || i15 >= ue0Var.D) {
                    int i19 = ue0Var.E;
                    if (i15 >= i19 && i15 < ue0Var.F) {
                        vcardItem = (AndroidUtilities.VcardItem) ue0Var.I.get(i15 - i19);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i18);
                }
                if (vcardItem != null) {
                    if (!ue0Var.G) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i15 >= ue0Var.C && i15 < ue0Var.D) {
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList2.size()) {
                                    if (((AndroidUtilities.VcardItem) arrayList2.get(i20)).checked) {
                                        z4 = true;
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                            int themedColor = ue0Var.getThemedColor(k6.Sh);
                            textView.setEnabled(z4);
                            if (!z4) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((se0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i21 = vcardItem.type;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new dg.t1(5, ue0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    af.g.s(p2Var2.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                af.g.s(p2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                p2Var2.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                return;
                            }
                        }
                    }
                }
                break;
            case 13:
                gt0 gt0Var = (gt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yu0 yu0Var = gt0Var.f;
                org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var.s1;
                p2Var3.finishPreviewFragment();
                chat.left = false;
                gt0Var.E(false);
                gt0Var.u(i15);
                if (gt0Var.d.isEmpty()) {
                    yu0Var.v1(true);
                    yu0Var.F();
                }
                p2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-yu0Var.g1));
                p2Var3.getMessagesController().addUserToChat(chat.id, p2Var3.getUserConfig().getCurrentUser(), 0, null, p2Var3, new b90(18, gt0Var, chat));
                break;
            case 14:
                ((j41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 15:
                py.a0((py) obj2, i15, (q70) obj);
                break;
            case 16:
                wg0.Y((wg0) obj2, i15, (q70) obj);
                break;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                zArr[0] = i15 == 1;
                int i22 = 0;
                while (i22 < 2) {
                    k6VarArr[i22].c.a(zArr[0] == (i22 == 1), true);
                    i22++;
                }
                break;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((e41) saveToGallerySettingsActivity.s.get(i15)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 19:
                xx xxVar = (xx) obj;
                w61 w61Var = ((v51) obj2).c;
                if (!xxVar.e && !UserConfig.getInstance(w61Var.S).isPremium()) {
                    org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new fg.n1(w61Var.Z0, w61Var.getContext(), w61Var.S, 11, false));
                        break;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        t51 t51Var = w61Var.e0;
                        if (i23 >= t51Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((t51Var.getChildAt(i23) instanceof a61) && (R = RecyclerView.R((view2 = t51Var.getChildAt(i23)))) >= 0 && w61Var.v0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    }
                    if (num != null) {
                        w61Var.i(num.intValue(), view2);
                    }
                    ov.W(null, xxVar.b, false, null, null);
                    w61Var.y0.add(Long.valueOf(xxVar.b.id));
                    w61Var.B(true, true, true);
                    break;
                }
                break;
            case 20:
                qh.d dVar = (qh.d) obj2;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                if (!dVar.K) {
                    c5.j jVar = aj1.d;
                    if (jVar != null && ((byte[]) jVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new mh(dVar, h3Var, i24, view, jVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            default:
                SharedConfig.setSearchEngineType(i15);
                ((o8) ((View) obj2)).u(org.telegram.ui.web.m1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
        }
    }

    public /* synthetic */ k2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ k2(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
