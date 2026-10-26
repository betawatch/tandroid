package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ un b;

    public gj(un unVar, Context context) {
        this.b = unVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i13;
        int i14;
        ?? r92;
        int i15;
        int i16;
        int i17;
        int i18;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.b;
        SparseArray[] sparseArrayArr = unVar.k6;
        SparseArray[] sparseArrayArr2 = unVar.j6;
        SparseArray[] sparseArrayArr3 = unVar.i6;
        long j10 = 0;
        final int i19 = 0;
        if (i10 == -1) {
            if (unVar.Tc.f) {
                unVar.Ca();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (kVar.q()) {
                unVar.G7(false);
                return;
            }
            if (unVar.d4 == 5 && (unVar.G6.isEmpty() || unVar.p4 == 0)) {
                unVar.cc();
            } else if (unVar.d4 == 6 && unVar.Y.t()) {
                unVar.Hb(new Runnable(this) { // from class: org.telegram.ui.dj
                    public final /* synthetic */ gj b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                gj gjVar = this.b;
                                gjVar.getClass();
                                un unVar2 = gjVar.b;
                                Intent intent = new Intent(unVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", unVar2.b4.link);
                                unVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!unVar.e7(true, true)) {
                unVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (unVar.getUserConfig().getClientUserId() == unVar.f6) {
                    unVar.getMessagesController().setSavedViewAs(true);
                    unVar.m1.e(false, true);
                    return;
                } else {
                    unVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-unVar.f6, false);
                    af1.I0(unVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                int i20 = 1;
                while (i20 >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = i19; i21 < sparseArrayArr2[i20].size(); i21++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                    }
                    if (unVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = i19; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) un.M8(messageObject2, arrayList.size() != 1 && ((user3 = unVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i20--;
                    i19 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    unVar.X7();
                    unVar.K3.j(58, 0L, null);
                }
                unVar.G7(false);
                return;
            }
            int i23 = 12;
            if (i10 != 12) {
                if (i10 == 11) {
                    unVar.la(true);
                    return;
                }
                if (i10 == 69) {
                    un.E1(unVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = unVar.f6;
                        if (ChatObject.isMonoForum(unVar.e)) {
                            i18 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i18, unVar.e)) {
                                j12 = unVar.p4;
                                j10 = unVar.f6;
                            }
                        }
                        i17 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        bi.ca.y(i17, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = unVar.f6;
                        if (ChatObject.isMonoForum(unVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i16, unVar.e)) {
                                j13 = unVar.p4;
                                j10 = unVar.f6;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i15 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        bi.ca.y(i15, false).C(j14, j15, new bi.l5(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (unVar.wb == null) {
                            un.K1(unVar);
                            return;
                        } else {
                            unVar.u9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i24 = 1; i24 >= 0; i24--) {
                            for (int i25 = 0; i25 < sparseArrayArr3[i24].size(); i25++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i24].valueAt(i25));
                            }
                            sparseArrayArr3[i24].clear();
                            sparseArrayArr2[i24].clear();
                            sparseArrayArr[i24].clear();
                        }
                        boolean z10 = unVar.r6 > 0;
                        unVar.m9();
                        unVar.Lc(0, true);
                        unVar.jd(false);
                        MediaController.saveFilesFromMessages(unVar.getParentActivity(), unVar.getAccountInstance(), arrayList2, new ej(0, this, z10));
                        return;
                    }
                    if (i10 == 13) {
                        if (unVar.getParentActivity() == null) {
                            return;
                        }
                        unVar.showDialog(org.telegram.ui.Components.g5.U(unVar.getParentActivity(), unVar.h, unVar.qa).a);
                        return;
                    }
                    int i26 = 19;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (unVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(unVar.e)) {
                            if (unVar.p4 == 0 || (user2 = unVar.getMessagesController().getUser(Long.valueOf(unVar.p4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.g5.q(unVar, -1, user2, unVar.e, true, new m4.s0(i26, this, user2), unVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = unVar.l8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (unVar.h != null || (((user = unVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(unVar.f)) && ((chatFull = unVar.l8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.g5.r(unVar, i10 == i11, unVar.e, unVar.f, unVar.h == null ? 0 : 1, true, false, z11, new i2.r(this, i10, z11));
                            return;
                        }
                        boolean z12 = z11;
                        org.telegram.ui.Components.g5.q(unVar, -1, unVar.f, unVar.e, z12, new fj(this, z12), unVar.getResourceProvider());
                        return;
                    }
                    int i27 = 17;
                    if (i10 == 17) {
                        if (unVar.f == null || unVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = unVar.X1;
                        if (textView != null && textView.getTag() != null) {
                            unVar.Cb(null, ((Integer) unVar.X1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", unVar.f.id);
                        bundle.putBoolean("addContact", true);
                        unVar.presentFragment(new js(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        unVar.nc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            unVar.getMediaDataController().installShortcut(unVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(unVar.e)) {
                            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(unVar.f6));
                            return;
                        }
                        x5 x5Var = new x5(unVar.f6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = unVar.P1;
                        x5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                        }
                        unVar.presentFragment(x5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i28 = v21.w;
                        int currentAccount = unVar.getCurrentAccount();
                        Activity parentActivity = unVar.getParentActivity();
                        long a2 = unVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        v21.N(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i29 = 0; i29 < 2; i29++) {
                            for (int i30 = 0; i30 < sparseArrayArr[i29].size(); i30++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i29].valueAt(i30);
                                unVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !unVar.l6);
                            }
                        }
                        unVar.G7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i31 = 1; i31 >= 0; i31--) {
                            if (messageObject == null && sparseArrayArr3[i31].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i32 = 0; i32 < sparseArrayArr3[i31].size(); i32++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i31].keyAt(i32)));
                                }
                                messageObject = (MessageObject) unVar.A6[i31].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i31].clear();
                            sparseArrayArr2[i31].clear();
                            sparseArrayArr[i31].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            unVar.jc(messageObject, false);
                        } else {
                            unVar.p5 = messageObject;
                            unVar.Ka(109);
                            r92 = 0;
                        }
                        unVar.m9();
                        unVar.Lc(r92, true);
                        unVar.jd(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        jg.b2 c10 = jg.c2.f(i13).c(unVar.R8());
                        Activity parentActivity2 = unVar.getParentActivity();
                        i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        jg.z1.e0(parentActivity2, i14, unVar.c4, c10, unVar.getResourceProvider(), new li.s2(i27, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, unVar.getResourceProvider(), true, true);
                        g1Var.j(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i23));
                        org.telegram.ui.ActionBar.w0 w0Var = unVar.h0;
                        org.telegram.ui.ActionBar.y yVar = unVar.e0;
                        yVar.a();
                        w0Var.U(g1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", unVar.f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", unVar.f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        unVar.va(unVar.N9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        unVar.getMessagesController().getTranslateController().setHideTranslateDialog(unVar.a(), false, true);
                        if (unVar.getMessagesController().getTranslateController().toggleTranslatingDialog(unVar.a(), true)) {
                            return;
                        }
                        unVar.dd(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (unVar.f == null || unVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = unVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = unVar.m8;
                        org.telegram.ui.Components.voip.g2.m(user4, z13, userFull != null && userFull.video_calls_available, unVar.getParentActivity(), unVar.getMessagesController().getUserFull(unVar.f.id), unVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        hk hkVar = unVar.Y;
                        if (hkVar == null || hkVar.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        hk hkVar2 = unVar.Y;
                        if (hkVar2 == null || hkVar2.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        hk hkVar3 = unVar.Y;
                        if (hkVar3 == null || hkVar3.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        hk hkVar4 = unVar.Y;
                        if (hkVar4 == null || hkVar4.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        hk hkVar5 = unVar.Y;
                        if (hkVar5 == null || hkVar5.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        hk hkVar6 = unVar.Y;
                        if (hkVar6 == null || hkVar6.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        hk hkVar7 = unVar.Y;
                        if (hkVar7 == null || hkVar7.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        hk hkVar8 = unVar.Y;
                        if (hkVar8 == null || hkVar8.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        hk hkVar9 = unVar.Y;
                        if (hkVar9 == null || hkVar9.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        hk hkVar10 = unVar.Y;
                        if (hkVar10 == null || hkVar10.getEditField() == null) {
                            return;
                        }
                        unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                        unVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        unVar.Jb();
                        return;
                    }
                    if (i10 == 60) {
                        if (unVar.o4 == null) {
                            return;
                        }
                        TopicsController topicsController = unVar.getMessagesController().getTopicsController();
                        long j16 = unVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = unVar.o4;
                        int i33 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i33, true);
                        unVar.ed();
                        unVar.uc(false);
                        unVar.dd(true);
                        return;
                    }
                    if (i10 == 61) {
                        af1.I0(unVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(unVar.b4.link);
                        org.telegram.ui.Components.wc.b0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.dj
                            public final /* synthetic */ gj b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        gj gjVar = this.b;
                                        gjVar.getClass();
                                        un unVar2 = gjVar.b;
                                        Intent intent = new Intent(unVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", unVar2.b4.link);
                                        unVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (unVar.Y.t()) {
                            unVar.Hb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = unVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = unVar.b4;
                        u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                        jg.w.c0(parentActivity3, i12, tL_businessChatLink, u6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        unVar.showDialog(e2Var);
                        TextView textView2 = (TextView) e2Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, unVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        wd1 b02 = wd1.b0(-unVar.f6, 0L);
                        b02.y = unVar;
                        unVar.presentFragment(b02);
                        return;
                    } else if (i10 == 888) {
                        unVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = j4.c1;
                            org.telegram.ui.Components.wc.b0(unVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = unVar.e;
                if (chat != null) {
                    unVar.presentFragment(un.ba(-chat.linked_monoforum_id));
                }
            } else if (unVar.getParentActivity() != null) {
                unVar.M7(null, null, false);
            }
        }
    }
}
