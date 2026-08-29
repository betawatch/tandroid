package bg;

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
import jh.k7;
import nh.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a51;
import org.telegram.ui.c51;
import org.telegram.ui.d61;
import org.telegram.ui.de;
import org.telegram.ui.ei1;
import org.telegram.ui.fy;
import org.telegram.ui.h51;
import org.telegram.ui.id;
import org.telegram.ui.l31;
import org.telegram.ui.nd;
import org.telegram.ui.ng0;
import org.telegram.ui.od;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.ud;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p2(int i10, View view, AtomicReference atomicReference) {
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
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                r2 r2Var = (r2) obj2;
                r2Var.a(i15);
                r2Var.b.w().i(i15 - 1, true);
                r2Var.b.q((ag.m) obj);
                break;
            case 1:
                gr0 gr0Var = (gr0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                hp hpVar = gr0Var.B;
                hpVar.a(!hpVar.a.q, true);
                boolean z11 = hpVar.a.q;
                tc.a0(o2Var).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z11 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                gr0Var.d.h = Boolean.valueOf(z11);
                if (gr0Var.D >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(gr0Var.D, true);
                    gr0Var.D = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(gr0Var.c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new h3(i11, gr0Var, o2Var));
                break;
            case 2:
                k7 k7Var = (k7) obj2;
                Runnable runnable = (Runnable) obj;
                k7Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(k7Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i16 = k7Var.g;
                int i17 = flag | ((~i13) & i16);
                if (i16 != i17) {
                    k7Var.g = i17;
                    k7Var.i(true);
                }
                runnable.run();
                break;
            case 3:
                ye.d.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 4:
                pa paVar = (pa) obj2;
                paVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new c6(paVar, i15, i14));
                break;
            case 5:
                ((wa) obj2).a(i15, ((va) obj).h);
                break;
            case 6:
                de deVar = (de) obj2;
                t91 t91Var = (t91) obj;
                ud udVar = deVar.M0;
                if (view.isEnabled() && !udVar.J && !deVar.G0.J) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (deVar.H0 <= currentTime) {
                        if (deVar.T0 >= MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            nd ndVar = new nd(deVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.V = 1;
                            twoStepVerificationActivity.X = ndVar;
                            udVar.setLoading(true);
                            twoStepVerificationActivity.s0(new od(deVar, t91Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            tc.a0(t91Var).L(deVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new id(deVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        deVar.V0 = tc.a0(t91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, jh.q.j0(deVar.H0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                tn tnVar = (tn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (tnVar.T0 != null && tnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 8:
                tn tnVar2 = (tn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (tnVar2.Z4 != null && i15 < arrayList.size()) {
                    tnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 9:
                ((qc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                break;
            case 10:
                as asVar = (as) obj2;
                k51 k51Var = (k51) obj;
                if (!asVar.S()) {
                    boolean z12 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.s0;
                    boolean z13 = !z12;
                    tL_chatBannedRights.send_media = z13;
                    tL_chatBannedRights.send_photos = z13;
                    tL_chatBannedRights.send_videos = z13;
                    tL_chatBannedRights.send_stickers = z13;
                    tL_chatBannedRights.send_gifs = z13;
                    tL_chatBannedRights.send_inline = z13;
                    tL_chatBannedRights.send_games = z13;
                    tL_chatBannedRights.send_audios = z13;
                    tL_chatBannedRights.send_docs = z13;
                    tL_chatBannedRights.send_voices = z13;
                    tL_chatBannedRights.send_roundvideos = z13;
                    tL_chatBannedRights.embed_links = z13;
                    tL_chatBannedRights.send_polls = z13;
                    tL_chatBannedRights.send_reactions = z13;
                    asVar.V();
                    k51Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    break;
                }
            case 11:
                j40 j40Var = (j40) obj2;
                j40Var.n = i15;
                j40Var.b.d(view.getLeft(), false);
                j40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                j40Var.invalidate();
                break;
            case 12:
                ke0 ke0Var = (ke0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ke0Var.n;
                ArrayList arrayList2 = ke0Var.I;
                org.telegram.ui.ActionBar.o2 o2Var2 = ke0Var.r;
                int i18 = ke0Var.B;
                if (i15 < i18 || i15 >= ke0Var.C) {
                    int i19 = ke0Var.D;
                    if (i15 >= i19 && i15 < ke0Var.E) {
                        vcardItem = (AndroidUtilities.VcardItem) ke0Var.H.get(i15 - i19);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i18);
                }
                if (vcardItem != null) {
                    if (!ke0Var.F) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i15 >= ke0Var.B && i15 < ke0Var.C) {
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList2.size()) {
                                    if (((AndroidUtilities.VcardItem) arrayList2.get(i20)).checked) {
                                        z10 = true;
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                            int themedColor = ke0Var.getThemedColor(g6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((ie0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i21 = vcardItem.type;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ag.y1(5, ke0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    ye.d.s(o2Var2.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                ye.d.s(o2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                o2Var2.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                    }
                }
                break;
            case 13:
                ys0 ys0Var = (ys0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qu0 qu0Var = ys0Var.f;
                org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var.r1;
                o2Var3.finishPreviewFragment();
                chat.left = false;
                ys0Var.E(false);
                ys0Var.u(i15);
                if (ys0Var.d.isEmpty()) {
                    qu0Var.v1(true);
                    qu0Var.F();
                }
                o2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-qu0Var.f1));
                o2Var3.getMessagesController().addUserToChat(chat.id, o2Var3.getUserConfig().getCurrentUser(), 0, null, o2Var3, new ii0(11, ys0Var, chat));
                break;
            case 14:
                ((y31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 15:
                fy.a0((fy) obj2, i15, (j70) obj);
                break;
            case 16:
                ng0.Y((ng0) obj2, i15, (j70) obj);
                break;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                i6[] i6VarArr = (i6[]) obj;
                zArr[0] = i15 == 1;
                int i22 = 0;
                while (i22 < 2) {
                    i6VarArr[i22].c.a(zArr[0] == (i22 == 1), true);
                    i22++;
                }
                break;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((l31) saveToGallerySettingsActivity.s.get(i15)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 19:
                rx rxVar = (rx) obj;
                d61 d61Var = ((c51) obj2).c;
                if (!rxVar.e && !UserConfig.getInstance(d61Var.R).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new cg.p1(d61Var.Y0, d61Var.getContext(), d61Var.R, 11, false));
                        break;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        a51 a51Var = d61Var.d0;
                        if (i23 >= a51Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((a51Var.getChildAt(i23) instanceof h51) && (R = RecyclerView.R((view2 = a51Var.getChildAt(i23)))) >= 0 && d61Var.u0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    }
                    if (num != null) {
                        d61Var.i(num.intValue(), view2);
                    }
                    jv.W(null, rxVar.b, false, null, null);
                    d61Var.x0.add(Long.valueOf(rxVar.b.id));
                    d61Var.B(true, true, true);
                    break;
                }
                break;
            case 20:
                nh.d dVar = (nh.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.J) {
                    a5.j jVar = ei1.d;
                    if (jVar != null && ((byte[]) jVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new jh(dVar, f3Var, i24, view, jVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            default:
                SharedConfig.setSearchEngineType(i15);
                ((m8) ((View) obj2)).u(org.telegram.ui.web.k1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
        }
    }

    public /* synthetic */ p2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ p2(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
