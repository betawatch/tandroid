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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ co b;

    public nj(co coVar, Context context) {
        this.b = coVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i12;
        int i13;
        ?? r92;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.b;
        SparseArray[] sparseArrayArr = coVar.Y5;
        SparseArray[] sparseArrayArr2 = coVar.X5;
        SparseArray[] sparseArrayArr3 = coVar.W5;
        long j3 = 0;
        final int i18 = 0;
        if (i10 == -1) {
            if (coVar.wc.f) {
                coVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (kVar.s()) {
                coVar.z7(false);
                return;
            }
            if (coVar.R3 == 5 && (coVar.u6.isEmpty() || coVar.d4 == 0)) {
                coVar.Qb();
            } else if (coVar.R3 == 6 && coVar.Y.w()) {
                coVar.wb(new Runnable(this) { // from class: org.telegram.ui.kj
                    public final /* synthetic */ nj b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                nj njVar = this.b;
                                njVar.getClass();
                                co coVar2 = njVar.b;
                                Intent intent = new Intent(coVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", coVar2.P3.link);
                                coVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!coVar.X6(true, true)) {
                coVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (coVar.getUserConfig().getClientUserId() == coVar.T5) {
                    coVar.getMessagesController().setSavedViewAs(true);
                    coVar.a1.e(false, true);
                    return;
                } else {
                    coVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-coVar.T5, false);
                    eg1.I0(coVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j10 = 0;
                for (int i19 = 1; i19 >= 0; i19--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = 0; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (coVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) co.D8(messageObject2, arrayList.size() != 1 && ((user3 = coVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    coVar.Q7();
                    coVar.y3.j(58, 0L, null);
                }
                coVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    coVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    co.B1(coVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = coVar.T5;
                        if (ChatObject.isMonoForum(coVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, coVar.e)) {
                                j11 = coVar.d4;
                                j3 = coVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        zh.s5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = coVar.T5;
                        if (ChatObject.isMonoForum(coVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, coVar.e)) {
                                j12 = coVar.d4;
                                j3 = coVar.T5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        zh.s5.y(i14, false).C(j13, j14, new lg(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (coVar.bb == null) {
                            co.G1(coVar);
                            return;
                        } else {
                            coVar.k9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i22 = 1; i22 >= 0; i22--) {
                            for (int i23 = 0; i23 < sparseArrayArr3[i22].size(); i23++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i22].valueAt(i23));
                            }
                            sparseArrayArr3[i22].clear();
                            sparseArrayArr2[i22].clear();
                            sparseArrayArr[i22].clear();
                        }
                        boolean z10 = coVar.f6 > 0;
                        coVar.c9();
                        coVar.yc(0, true);
                        coVar.Wc(false);
                        MediaController.saveFilesFromMessages(coVar.getParentActivity(), coVar.getAccountInstance(), arrayList2, new lj(0, this, z10));
                        return;
                    }
                    int i24 = 13;
                    if (i10 == 13) {
                        if (coVar.getParentActivity() == null) {
                            return;
                        }
                        coVar.showDialog(org.telegram.ui.Components.e5.V(coVar.getParentActivity(), coVar.h, coVar.ea).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (coVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(coVar.e)) {
                            if (coVar.d4 == 0 || (user2 = coVar.getMessagesController().getUser(Long.valueOf(coVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.e5.r(coVar, -1, user2, coVar.e, true, new m4(10, this, user2), coVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = coVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || coVar.h != null || (((user = coVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(coVar.f)) && ((chatFull = coVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.e5.s(coVar, i10 == 15, coVar.e, coVar.f, coVar.h == null ? 0 : 1, true, false, z11, new i2.t(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.e5.r(coVar, -1, coVar.f, coVar.e, z12, new mj(this, z12), coVar.getResourceProvider());
                            return;
                        }
                    }
                    int i25 = 17;
                    if (i10 == 17) {
                        if (coVar.f == null || coVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = coVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            coVar.rb(null, ((Integer) coVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", coVar.f.id);
                        bundle.putBoolean("addContact", true);
                        coVar.presentFragment(new ss(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        coVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            coVar.getMediaDataController().installShortcut(coVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(coVar.e)) {
                            coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(coVar.T5));
                            return;
                        }
                        v5 v5Var = new v5(coVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = coVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        coVar.presentFragment(v5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i26 = e41.v;
                        int currentAccount = coVar.getCurrentAccount();
                        Activity parentActivity = coVar.getParentActivity();
                        long a2 = coVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        e41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i27 = 0; i27 < 2; i27++) {
                            for (int i28 = 0; i28 < sparseArrayArr[i27].size(); i28++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i27].valueAt(i28);
                                coVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !coVar.Z5);
                            }
                        }
                        coVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i29 = 1; i29 >= 0; i29--) {
                            if (messageObject == null && sparseArrayArr3[i29].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < sparseArrayArr3[i29].size(); i30++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i29].keyAt(i30)));
                                }
                                messageObject = (MessageObject) coVar.o6[i29].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i29].clear();
                            sparseArrayArr2[i29].clear();
                            sparseArrayArr[i29].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            coVar.Xb(messageObject, false);
                        } else {
                            coVar.d5 = messageObject;
                            coVar.Ba(109);
                            r92 = 0;
                        }
                        coVar.c9();
                        coVar.yc(r92, true);
                        coVar.Wc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        ig.a2 c10 = ig.b2.f(i12).c(coVar.H8());
                        Activity parentActivity2 = coVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        ig.y1.d0(parentActivity2, i13, coVar.Q3, c10, coVar.getResourceProvider(), new nf(4, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.a, coVar.getResourceProvider(), true, true);
                        f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        f1Var.setOnClickListener(new a(this, i24));
                        org.telegram.ui.ActionBar.v0 v0Var = coVar.h0;
                        org.telegram.ui.ActionBar.y yVar = coVar.e0;
                        yVar.a();
                        v0Var.M(f1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        coVar.la(coVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        coVar.getMessagesController().getTranslateController().setHideTranslateDialog(coVar.a(), false, true);
                        if (coVar.getMessagesController().getTranslateController().toggleTranslatingDialog(coVar.a(), true)) {
                            return;
                        }
                        coVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (coVar.f == null || coVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = coVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = coVar.a8;
                        org.telegram.ui.Components.voip.d2.m(user4, z13, userFull != null && userFull.video_calls_available, coVar.getParentActivity(), coVar.getMessagesController().getUserFull(coVar.f.id), coVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        mk mkVar = coVar.Y;
                        if (mkVar == null || mkVar.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        mk mkVar2 = coVar.Y;
                        if (mkVar2 == null || mkVar2.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        mk mkVar3 = coVar.Y;
                        if (mkVar3 == null || mkVar3.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        mk mkVar4 = coVar.Y;
                        if (mkVar4 == null || mkVar4.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        mk mkVar5 = coVar.Y;
                        if (mkVar5 == null || mkVar5.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        mk mkVar6 = coVar.Y;
                        if (mkVar6 == null || mkVar6.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        mk mkVar7 = coVar.Y;
                        if (mkVar7 == null || mkVar7.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        mk mkVar8 = coVar.Y;
                        if (mkVar8 == null || mkVar8.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        mk mkVar9 = coVar.Y;
                        if (mkVar9 == null || mkVar9.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        mk mkVar10 = coVar.Y;
                        if (mkVar10 == null || mkVar10.getEditField() == null) {
                            return;
                        }
                        coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                        coVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        coVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (coVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = coVar.getMessagesController().getTopicsController();
                        long j15 = coVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = coVar.c4;
                        int i31 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i31, true);
                        coVar.Rc();
                        coVar.hc(false);
                        coVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        eg1.I0(coVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(coVar.P3.link);
                        org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.kj
                            public final /* synthetic */ nj b;

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
                                        nj njVar = this.b;
                                        njVar.getClass();
                                        co coVar2 = njVar.b;
                                        Intent intent = new Intent(coVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", coVar2.P3.link);
                                        coVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (coVar.Y.w()) {
                            coVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = coVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = coVar.P3;
                        f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                        ig.v.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, i25));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        coVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        af1 a02 = af1.a0(-coVar.T5, 0L);
                        a02.y = coVar;
                        coVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        coVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = i4.b1;
                            org.telegram.ui.Components.yc.a0(coVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = coVar.e;
                if (chat != null) {
                    coVar.presentFragment(co.R9(-chat.linked_monoforum_id));
                }
            } else if (coVar.getParentActivity() != null) {
                coVar.F7(null, null, false);
            }
        }
    }
}
