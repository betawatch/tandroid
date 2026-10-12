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
import org.telegram.messenger.mh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.hb1;
import org.telegram.ui.he;
import org.telegram.ui.kh0;
import org.telegram.ui.lj1;
import org.telegram.ui.o61;
import org.telegram.ui.q61;
import org.telegram.ui.qe;
import org.telegram.ui.r71;
import org.telegram.ui.td;
import org.telegram.ui.uj1;
import org.telegram.ui.v61;
import org.telegram.ui.yd;
import org.telegram.ui.yy;
import org.telegram.ui.z41;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                MessagesController.getInstance(i16).getUnconfirmedAuthController().deny((ArrayList) obj, new di.k4(uaVar, i16, i11));
                break;
            case 1:
                ((cb) obj2).a(i16, ((bb) obj).h);
                break;
            case 2:
                qe qeVar = (qe) obj2;
                hb1 hb1Var = (hb1) obj;
                he heVar = qeVar.Q0;
                if (view.isEnabled() && !heVar.N && !qeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    if (qeVar.L0 <= currentTime) {
                        if (qeVar.X0 >= MessagesController.getInstance(i16).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            yd ydVar = new yd(qeVar, twoStepVerificationActivity, i13);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = ydVar;
                            heVar.setLoading(true);
                            twoStepVerificationActivity.s0(new zd(qeVar, hb1Var, twoStepVerificationActivity, i13));
                            break;
                        } else {
                            zc.a0(hb1Var).L(qeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i16).starsRevenueWithdrawalMin, new Object[0]), new td(qeVar, i16, i15))).j();
                            break;
                        }
                    } else {
                        qeVar.Z0 = zc.a0(hb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, zh.g.j0(qeVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                fo foVar = (fo) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (foVar.X0 != null && foVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i16);
                    break;
                }
                break;
            case 4:
                fo foVar2 = (fo) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (foVar2.d5 != null && i16 < arrayList.size()) {
                    foVar2.Fa(((Integer) arrayList.get(i16)).intValue());
                    break;
                }
                break;
            case 5:
                ((ud0) obj2).setValue(i16);
                ((org.telegram.ui.Components.z2) obj).run();
                break;
            case 6:
                dl dlVar = (dl) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                m80 F = m80.F(dlVar, c6Var, dlVar.x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new gm(dlVar, i16, c6Var, i15), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new xk(dlVar, r6), false);
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                break;
            case 7:
                ss ssVar = (ss) obj2;
                z61 z61Var = (z61) obj;
                if (!ssVar.T()) {
                    r6 = i16 <= 0 ? 1 : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = ssVar.w0;
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
                    ssVar.W();
                    z61Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ssVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    a2Var.show();
                    break;
                }
            case 8:
                y40 y40Var = (y40) obj2;
                y40Var.n = i16;
                y40Var.b.d(view.getLeft(), false);
                y40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i16);
                y40Var.invalidate();
                break;
            case 9:
                of0 of0Var = (of0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = of0Var.n;
                ArrayList arrayList2 = of0Var.M;
                org.telegram.ui.ActionBar.m2 m2Var = of0Var.r;
                int i17 = of0Var.F;
                if (i16 < i17 || i16 >= of0Var.G) {
                    int i18 = of0Var.H;
                    if (i16 >= i18 && i16 < of0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) of0Var.L.get(i16 - i18);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i16 - i17);
                }
                if (vcardItem != null) {
                    if (!of0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i16 >= of0Var.F && i16 < of0Var.G) {
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
                            int themedColor = of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((mf0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i20 = vcardItem.type;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(5, of0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    pf.d.s(m2Var.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                pf.d.s(m2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
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
            case 10:
                gu0 gu0Var = (gu0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                xv0 xv0Var = gu0Var.f;
                org.telegram.ui.ActionBar.m2 m2Var2 = xv0Var.v1;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                gu0Var.E(false);
                gu0Var.u(i16);
                if (gu0Var.d.isEmpty()) {
                    xv0Var.v1(true);
                    xv0Var.F();
                }
                m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-xv0Var.j1));
                m2Var2.getMessagesController().addUserToChat(chat.id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new f60(25, gu0Var, chat));
                break;
            case 11:
                ((m51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                break;
            case 12:
                yy.p0((yy) obj2, i16, (m80) obj);
                break;
            case 13:
                kh0.Y((kh0) obj2, i16, (m80) obj);
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
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((z41) saveToGallerySettingsActivity.s.get(i16)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 16:
                jy jyVar = (jy) obj;
                r71 r71Var = ((q61) obj2).c;
                if (!jyVar.e && !UserConfig.getInstance(r71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new sg.y0(r71Var.c1, r71Var.getContext(), r71Var.V, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        o61 o61Var = r71Var.h0;
                        if (i22 >= o61Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((o61Var.getChildAt(i22) instanceof v61) && (R = RecyclerView.R((view2 = o61Var.getChildAt(i22)))) >= 0 && r71Var.y0.get(R) == i16) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        r71Var.i(num.intValue(), view2);
                    }
                    ew.X(null, jyVar.b, false, null, null);
                    r71Var.B0.add(Long.valueOf(jyVar.b.id));
                    r71Var.B(true, true, true);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Wallet.j) obj).run(Integer.valueOf(i16));
                ((org.telegram.ui.Wallet.u4) obj2).setSelected(i16);
                break;
            case 18:
                di.d dVar = (di.d) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!dVar.N) {
                    com.google.android.gms.internal.cast.z5 z5Var = uj1.d;
                    if (z5Var != null && ((byte[]) z5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new mh(dVar, e3Var, i23, view, z5Var));
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
                rg.t1 t1Var = (rg.t1) obj2;
                t1Var.a(i16);
                t1Var.b.x().i(i16 - 1, true);
                t1Var.b.o((qg.m) obj);
                break;
            case 21:
                ns0 ns0Var = (ns0) obj2;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj;
                aq aqVar = ns0Var.F;
                aqVar.a(!aqVar.a.q, true);
                boolean z12 = aqVar.a.q;
                zc.a0(m2Var3).P(z12 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z12 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                ns0Var.d.h = Boolean.valueOf(z12);
                if (ns0Var.H >= 0) {
                    ConnectionsManager.getInstance(i16).cancelRequest(ns0Var.H, true);
                    ns0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i16).getInputPeer(ns0Var.c);
                togglechatstargiftnotifications.enabled = z12;
                ConnectionsManager.getInstance(i16).sendRequest(togglechatstargiftnotifications, new lj1(i12, ns0Var, m2Var3));
                break;
            case 22:
                zh.f5 f5Var = (zh.f5) obj2;
                Runnable runnable = (Runnable) obj;
                f5Var.getClass();
                if ((i16 & 15) != 0) {
                    i14 = 15;
                } else if ((i16 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(f5Var.g & i14, i16, !TLObject.hasFlag(r0, i16));
                if (flag == 0) {
                    flag = (~i16) & i14;
                }
                int i24 = f5Var.g;
                int i25 = flag | ((~i14) & i24);
                if (i24 != i25) {
                    f5Var.g = i25;
                    f5Var.i(true);
                }
                runnable.run();
                break;
            default:
                pf.d.s((Context) obj2, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
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
