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
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a71;
import org.telegram.ui.ae;
import org.telegram.ui.dj1;
import org.telegram.ui.e61;
import org.telegram.ui.j41;
import org.telegram.ui.je;
import org.telegram.ui.md;
import org.telegram.ui.qy;
import org.telegram.ui.rd;
import org.telegram.ui.sa1;
import org.telegram.ui.sd;
import org.telegram.ui.ui1;
import org.telegram.ui.wn;
import org.telegram.ui.x51;
import org.telegram.ui.yg0;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                je jeVar = (je) obj2;
                sa1 sa1Var = (sa1) obj;
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
                            twoStepVerificationActivity.s0(new sd(jeVar, sa1Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            xc.a0(sa1Var).L(jeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new md(jeVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        jeVar.Z0 = xc.a0(sa1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(jeVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                wn wnVar = (wn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (wnVar.X0 != null && wnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 4:
                wn wnVar2 = (wn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (wnVar2.d5 != null && i16 < arrayList.size()) {
                    wnVar2.Ba(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 5:
                ((ed0) obj2).setValue(i16);
                ((org.telegram.ui.Components.x2) obj).run();
                break;
            case 6:
                gs gsVar = (gs) obj2;
                j61 j61Var = (j61) obj;
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
                    j61Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    a2Var.show();
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
                ze0 ze0Var = (ze0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ze0Var.n;
                ArrayList arrayList2 = ze0Var.M;
                org.telegram.ui.ActionBar.m2 m2Var = ze0Var.r;
                int i17 = ze0Var.F;
                if (i16 < i17 || i16 >= ze0Var.G) {
                    int i18 = ze0Var.H;
                    if (i16 >= i18 && i16 < ze0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) ze0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!ze0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= ze0Var.F && i16 < ze0Var.G) {
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
                            int themedColor = ze0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((xe0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, ze0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    nf.f.s(m2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                nf.f.s(m2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                m2Var.getParentActivity().startActivityForResult(intent, 500);
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
                st0 st0Var = (st0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jv0 jv0Var = st0Var.f;
                org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var.v1;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                st0Var.E(false);
                st0Var.u(i16);
                if (st0Var.d.isEmpty()) {
                    jv0Var.v1(true);
                    jv0Var.F();
                }
                m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-jv0Var.j1));
                m2Var2.getMessagesController().addUserToChat(chat.id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new wn0(7, st0Var, chat));
                break;
            case 10:
                ((x41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 11:
                qy.a0((qy) obj2, i16, (y70) obj);
                break;
            case 12:
                yg0.Y((yg0) obj2, i16, (y70) obj);
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
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((j41) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                yx yxVar = (yx) obj;
                a71 a71Var = ((z51) obj2).c;
                if (!yxVar.e && !UserConfig.getInstance(a71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.x0(a71Var.c1, a71Var.getContext(), a71Var.V, 11, false));
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
                    tv.W(null, yxVar.b, false, null, null);
                    a71Var.B0.add(Long.valueOf(yxVar.b.id));
                    a71Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!dVar.N) {
                    cf.c cVar = dj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new jh(dVar, e3Var, i23, view, cVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 17:
                SharedConfig.setSearchEngineType(i16);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.n1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 18:
                qg.s1 s1Var = (qg.s1) obj2;
                s1Var.a(i16);
                s1Var.b.v().i(i16 - 1, true);
                s1Var.b.b((pg.m) obj);
                break;
            case 19:
                zr0 zr0Var = (zr0) obj2;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj;
                op opVar = zr0Var.F;
                opVar.a(!opVar.a.q, true);
                boolean z13 = opVar.a.q;
                xc.a0(m2Var3).P(z13 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z13 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                zr0Var.d.h = Boolean.valueOf(z13);
                if (zr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(zr0Var.H, true);
                    zr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(zr0Var.c);
                togglechatstargiftnotifications.enabled = z13;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new ui1(i12, zr0Var, m2Var3));
                break;
            case 20:
                yh.k5 k5Var = (yh.k5) obj2;
                Runnable runnable = (Runnable) obj;
                k5Var.getClass();
                if ((i16 & 15) != 0) {
                    i14 = 15;
                } else if ((i16 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(k5Var.g & i14, i16, !TLObject.hasFlag(r0, i16));
                if (flag == 0) {
                    flag = (~i16) & i14;
                }
                int i24 = k5Var.g;
                int i25 = flag | ((~i14) & i24);
                if (i24 != i25) {
                    k5Var.g = i25;
                    k5Var.i(true);
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
