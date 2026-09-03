package dg;

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
import lh.l7;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.de;
import org.telegram.ui.e41;
import org.telegram.ui.me;
import org.telegram.ui.oa1;
import org.telegram.ui.qd;
import org.telegram.ui.qy;
import org.telegram.ui.t51;
import org.telegram.ui.v51;
import org.telegram.ui.vd;
import org.telegram.ui.wd;
import org.telegram.ui.x61;
import org.telegram.ui.xg0;
import org.telegram.ui.zi1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m2(int i10, View view, AtomicReference atomicReference) {
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
                o2 o2Var = (o2) obj2;
                o2Var.a(i15);
                o2Var.b.v().i(i15 - 1, true);
                o2Var.b.x((cg.m) obj);
                break;
            case 1:
                or0 or0Var = (or0) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                kp kpVar = or0Var.C;
                kpVar.a(!kpVar.a.q, true);
                boolean z10 = kpVar.a.q;
                qc.a0(p2Var).P(z10 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z10 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                or0Var.d.h = Boolean.valueOf(z10);
                if (or0Var.E >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(or0Var.E, true);
                    or0Var.E = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(or0Var.c);
                togglechatstargiftnotifications.enabled = z10;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new d3(i11, or0Var, p2Var));
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
                ze.d.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 4:
                ra raVar = (ra) obj2;
                raVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new pa(raVar, i15, i13));
                break;
            case 5:
                ((ya) obj2).a(i15, ((xa) obj).h);
                break;
            case 6:
                me meVar = (me) obj2;
                oa1 oa1Var = (oa1) obj;
                de deVar = meVar.N0;
                if (view.isEnabled() && !deVar.K && !meVar.H0.K) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (meVar.I0 <= currentTime) {
                        if (meVar.U0 >= MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            vd vdVar = new vd(meVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.W = 1;
                            twoStepVerificationActivity.Y = vdVar;
                            deVar.setLoading(true);
                            twoStepVerificationActivity.s0(new wd(meVar, oa1Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            qc.a0(oa1Var).L(meVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new qd(meVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        meVar.W0 = qc.a0(oa1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, lh.q.j0(meVar.I0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                zn znVar = (zn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (znVar.U0 != null && znVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 8:
                zn znVar2 = (zn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (znVar2.a5 != null && i15 < arrayList.size()) {
                    znVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 9:
                ((xc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.u2) obj).run();
                break;
            case 10:
                ds dsVar = (ds) obj2;
                w51 w51Var = (w51) obj;
                if (!dsVar.S()) {
                    boolean z11 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = dsVar.t0;
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
                    dsVar.V();
                    w51Var.N(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    d2Var.show();
                    break;
                }
            case 11:
                o40 o40Var = (o40) obj2;
                o40Var.n = i15;
                o40Var.b.d(view.getLeft(), false);
                o40Var.c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                o40Var.invalidate();
                break;
            case 12:
                te0 te0Var = (te0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = te0Var.n;
                ArrayList arrayList2 = te0Var.J;
                org.telegram.ui.ActionBar.p2 p2Var2 = te0Var.r;
                int i18 = te0Var.C;
                if (i15 < i18 || i15 >= te0Var.D) {
                    int i19 = te0Var.E;
                    if (i15 >= i19 && i15 < te0Var.F) {
                        vcardItem = (AndroidUtilities.VcardItem) te0Var.I.get(i15 - i19);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i18);
                }
                if (vcardItem != null) {
                    if (!te0Var.G) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i15 >= te0Var.C && i15 < te0Var.D) {
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
                            int themedColor = te0Var.getThemedColor(j6.Sh);
                            textView.setEnabled(z4);
                            if (!z4) {
                                themedColor &= ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((re0) viewGroup).setChecked(vcardItem.checked);
                        break;
                    } else {
                        int i21 = vcardItem.type;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new cg.u1(5, te0Var, vcardItem));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String value = vcardItem.getValue(false);
                                    if (!value.startsWith("http")) {
                                        value = "http://".concat(value);
                                    }
                                    ze.d.s(p2Var2.getParentActivity(), value);
                                    break;
                                }
                            } else {
                                ze.d.s(p2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                p2Var2.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
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
                p2Var3.getMessagesController().addUserToChat(chat.id, p2Var3.getUserConfig().getCurrentUser(), 0, null, p2Var3, new z80(19, gt0Var, chat));
                break;
            case 14:
                ((j41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 15:
                qy.a0((qy) obj2, i15, (p70) obj);
                break;
            case 16:
                xg0.Y((xg0) obj2, i15, (p70) obj);
                break;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj;
                zArr[0] = i15 == 1;
                int i22 = 0;
                while (i22 < 2) {
                    j6VarArr[i22].c.a(zArr[0] == (i22 == 1), true);
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
                vx vxVar = (vx) obj;
                x61 x61Var = ((v51) obj2).c;
                if (!vxVar.e && !UserConfig.getInstance(x61Var.S).isPremium()) {
                    org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new eg.o1(x61Var.Z0, x61Var.getContext(), x61Var.S, 11, false));
                        break;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        t51 t51Var = x61Var.e0;
                        if (i23 >= t51Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((t51Var.getChildAt(i23) instanceof a61) && (R = RecyclerView.R((view2 = t51Var.getChildAt(i23)))) >= 0 && x61Var.v0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    }
                    if (num != null) {
                        x61Var.i(num.intValue(), view2);
                    }
                    lv.W(null, vxVar.b, false, null, null);
                    x61Var.y0.add(Long.valueOf(vxVar.b.id));
                    x61Var.B(true, true, true);
                    break;
                }
                break;
            case 20:
                ph.d dVar = (ph.d) obj2;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj;
                if (!dVar.K) {
                    c5.j jVar = zi1.d;
                    if (jVar != null && ((byte[]) jVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new mh(dVar, g3Var, i24, view, jVar));
                        break;
                    } else {
                        FileLog.d("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            default:
                SharedConfig.setSearchEngineType(i15);
                ((n8) ((View) obj2)).u(org.telegram.ui.web.n1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
        }
    }

    public /* synthetic */ m2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ m2(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
