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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.be;
import org.telegram.ui.d61;
import org.telegram.ui.f61;
import org.telegram.ui.fh0;
import org.telegram.ui.g71;
import org.telegram.ui.jj1;
import org.telegram.ui.k61;
import org.telegram.ui.ke;
import org.telegram.ui.nd;
import org.telegram.ui.p41;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.uy;
import org.telegram.ui.za1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                wa waVar = (wa) obj2;
                waVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.b7(waVar, i15, i12));
                break;
            case 1:
                ((eb) obj2).a(i15, ((db) obj).h);
                break;
            case 2:
                ke keVar = (ke) obj2;
                za1 za1Var = (za1) obj;
                be beVar = keVar.Q0;
                if (view.isEnabled() && !beVar.N && !keVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.L0 <= currentTime) {
                        if (keVar.X0 >= MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            sd sdVar = new sd(keVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = sdVar;
                            beVar.setLoading(true);
                            twoStepVerificationActivity.s0(new td(keVar, za1Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            xc.a0(za1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new nd(keVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        keVar.Z0 = xc.a0(za1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(keVar.L0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 3:
                zn znVar = (zn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (znVar.X0 != null && znVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 4:
                zn znVar2 = (zn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (znVar2.d5 != null && i15 < arrayList.size()) {
                    znVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 5:
                ((dd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.w2) obj).run();
                break;
            case 6:
                fs fsVar = (fs) obj2;
                l61 l61Var = (l61) obj;
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
                    l61Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
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
                ye0 ye0Var = (ye0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ye0Var.n;
                ArrayList arrayList2 = ye0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = ye0Var.r;
                int i16 = ye0Var.F;
                if (i15 < i16 || i15 >= ye0Var.G) {
                    int i17 = ye0Var.H;
                    if (i15 >= i17 && i15 < ye0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) ye0Var.L.get(i15 - i17);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                }
                if (vcardItem != null) {
                    if (!ye0Var.J) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i15 >= ye0Var.F && i15 < ye0Var.G) {
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
                        int i19 = vcardItem.type;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, ye0Var, vcardItem));
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
                tt0 tt0Var = (tt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                kv0 kv0Var = tt0Var.f;
                org.telegram.ui.ActionBar.n2 n2Var2 = kv0Var.v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                tt0Var.E(false);
                tt0Var.u(i15);
                if (tt0Var.d.isEmpty()) {
                    kv0Var.v1(true);
                    kv0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-kv0Var.j1));
                n2Var2.getMessagesController().addUserToChat(chat.id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new po0(6, tt0Var, chat));
                break;
            case 10:
                ((z41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 11:
                uy.b0((uy) obj2, i15, (w70) obj);
                break;
            case 12:
                fh0.b0((fh0) obj2, i15, (w70) obj);
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                l6[] l6VarArr = (l6[]) obj;
                zArr[0] = i15 == 1;
                int i20 = 0;
                while (i20 < 2) {
                    l6VarArr[i20].c.a(zArr[0] == (i20 == 1), true);
                    i20++;
                }
                break;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((p41) saveToGallerySettingsActivity.s.get(i15)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                xx xxVar = (xx) obj;
                g71 g71Var = ((f61) obj2).c;
                if (!xxVar.e && !UserConfig.getInstance(g71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(g71Var.c1, g71Var.getContext(), g71Var.V, 11, false));
                        break;
                    }
                } else {
                    int i21 = 0;
                    while (true) {
                        d61 d61Var = g71Var.h0;
                        if (i21 >= d61Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((d61Var.getChildAt(i21) instanceof k61) && (S = RecyclerView.S((view2 = d61Var.getChildAt(i21)))) >= 0 && g71Var.y0.get(S) == i15) {
                            num = Integer.valueOf(S);
                        } else {
                            i21++;
                        }
                    }
                    if (num != null) {
                        g71Var.i(num.intValue(), view2);
                    }
                    sv.W(null, xxVar.b, false, null, null);
                    g71Var.B0.add(Long.valueOf(xxVar.b.id));
                    g71Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    cf.c cVar = jj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags = 4 | tL_messages_requestUrlAuth.flags;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new kh(dVar, f3Var, i22, view, cVar));
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
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i15);
                r1Var.b.v().i(i15 - 1, true);
                r1Var.b.b((pg.m) obj);
                break;
            case 19:
                zr0 zr0Var = (zr0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                np npVar = zr0Var.F;
                npVar.a(!npVar.a.q, true);
                boolean z13 = npVar.a.q;
                xc.a0(n2Var3).P(z13 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z13 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                zr0Var.d.h = Boolean.valueOf(z13);
                if (zr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(zr0Var.H, true);
                    zr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(zr0Var.c);
                togglechatstargiftnotifications.enabled = z13;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new aj1(i11, zr0Var, n2Var3));
                break;
            case 20:
                yh.l5 l5Var = (yh.l5) obj2;
                Runnable runnable = (Runnable) obj;
                l5Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(l5Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i23 = l5Var.g;
                int i24 = flag | ((~i13) & i23);
                if (i23 != i24) {
                    l5Var.g = i24;
                    l5Var.i(true);
                }
                runnable.run();
                break;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
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
