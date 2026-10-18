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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sn b;

    public hj(sn snVar, Context context) {
        this.b = snVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i12;
        int i13;
        ?? r92;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.b;
        SparseArray[] sparseArrayArr = snVar.Y5;
        SparseArray[] sparseArrayArr2 = snVar.X5;
        SparseArray[] sparseArrayArr3 = snVar.W5;
        long j10 = 0;
        final int i18 = 0;
        if (i10 == -1) {
            if (snVar.xc.f) {
                snVar.xa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (kVar.s()) {
                snVar.C7(false);
                return;
            }
            if (snVar.R3 == 5 && (snVar.u6.isEmpty() || snVar.d4 == 0)) {
                snVar.Ub();
            } else if (snVar.R3 == 6 && snVar.Y.v()) {
                snVar.Ab(new Runnable(this) { // from class: org.telegram.ui.ej
                    public final /* synthetic */ hj b;

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
                                hj hjVar = this.b;
                                hjVar.getClass();
                                sn snVar2 = hjVar.b;
                                Intent intent = new Intent(snVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", snVar2.P3.link);
                                snVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!snVar.a7(true, true)) {
                snVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (snVar.getUserConfig().getClientUserId() == snVar.T5) {
                    snVar.getMessagesController().setSavedViewAs(true);
                    snVar.a1.e(false, true);
                    return;
                } else {
                    snVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-snVar.T5, false);
                    te1.I0(snVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                int i19 = 1;
                while (i19 >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = i18; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (snVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) sn.I8(messageObject2, arrayList.size() != 1 && ((user3 = snVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    snVar.T7();
                    snVar.y3.j(58, 0L, null);
                }
                snVar.C7(false);
                return;
            }
            int i22 = 12;
            if (i10 != 12) {
                if (i10 == 11) {
                    snVar.ga(true);
                    return;
                }
                if (i10 == 69) {
                    sn.C1(snVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = snVar.T5;
                        if (ChatObject.isMonoForum(snVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, snVar.e)) {
                                j12 = snVar.d4;
                                j10 = snVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        ai.ga.y(i16, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = snVar.T5;
                        if (ChatObject.isMonoForum(snVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, snVar.e)) {
                                j13 = snVar.d4;
                                j10 = snVar.T5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i14 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        ai.ga.y(i14, false).C(j14, j15, new ai.p5(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (snVar.bb == null) {
                            sn.I1(snVar);
                            return;
                        } else {
                            snVar.p9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i23 = 1; i23 >= 0; i23--) {
                            for (int i24 = 0; i24 < sparseArrayArr3[i23].size(); i24++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i23].valueAt(i24));
                            }
                            sparseArrayArr3[i23].clear();
                            sparseArrayArr2[i23].clear();
                            sparseArrayArr[i23].clear();
                        }
                        boolean z10 = snVar.f6 > 0;
                        snVar.h9();
                        snVar.Cc(0, true);
                        snVar.ad(false);
                        MediaController.saveFilesFromMessages(snVar.getParentActivity(), snVar.getAccountInstance(), arrayList2, new fj(0, this, z10));
                        return;
                    }
                    if (i10 == 13) {
                        if (snVar.getParentActivity() == null) {
                            return;
                        }
                        snVar.showDialog(org.telegram.ui.Components.f5.U(snVar.getParentActivity(), snVar.h, snVar.ea).a);
                        return;
                    }
                    int i25 = 16;
                    int i26 = 15;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (snVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(snVar.e)) {
                            if (snVar.d4 == 0 || (user2 = snVar.getMessagesController().getUser(Long.valueOf(snVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.f5.q(snVar, -1, user2, snVar.e, true, new m4.w0(i25, this, user2), snVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = snVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || snVar.h != null || (((user = snVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(snVar.f)) && ((chatFull = snVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.f5.r(snVar, i10 == 15, snVar.e, snVar.f, snVar.h == null ? 0 : 1, true, false, z11, new i2.r(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.f5.q(snVar, -1, snVar.f, snVar.e, z12, new gj(this, z12), snVar.getResourceProvider());
                            return;
                        }
                    }
                    int i27 = 17;
                    if (i10 == 17) {
                        if (snVar.f == null || snVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = snVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            snVar.vb(null, ((Integer) snVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", snVar.f.id);
                        bundle.putBoolean("addContact", true);
                        snVar.presentFragment(new hs(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        snVar.fc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            snVar.getMediaDataController().installShortcut(snVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(snVar.e)) {
                            snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.T5));
                            return;
                        }
                        z5 z5Var = new z5(snVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = snVar.D1;
                        z5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                        }
                        snVar.presentFragment(z5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i28 = q21.v;
                        int currentAccount = snVar.getCurrentAccount();
                        Activity parentActivity = snVar.getParentActivity();
                        long a2 = snVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        q21.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i29 = 0; i29 < 2; i29++) {
                            for (int i30 = 0; i30 < sparseArrayArr[i29].size(); i30++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i29].valueAt(i30);
                                snVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !snVar.Z5);
                            }
                        }
                        snVar.C7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i31 = 1; i31 >= 0; i31--) {
                            if (messageObject == null && sparseArrayArr3[i31].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i32 = 0; i32 < sparseArrayArr3[i31].size(); i32++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i31].keyAt(i32)));
                                }
                                messageObject = (MessageObject) snVar.o6[i31].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i31].clear();
                            sparseArrayArr2[i31].clear();
                            sparseArrayArr[i31].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            snVar.bc(messageObject, false);
                        } else {
                            snVar.d5 = messageObject;
                            snVar.Fa(109);
                            r92 = 0;
                        }
                        snVar.h9();
                        snVar.Cc(r92, true);
                        snVar.ad(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        ig.z1 c10 = ig.a2.f(i12).c(snVar.M8());
                        Activity parentActivity2 = snVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        ig.x1.d0(parentActivity2, i13, snVar.Q3, c10, snVar.getResourceProvider(), new org.telegram.ui.ActionBar.j3(i26, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.a, snVar.getResourceProvider(), true, true);
                        e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        e1Var.setOnClickListener(new a(this, i22));
                        org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
                        org.telegram.ui.ActionBar.x xVar = snVar.e0;
                        xVar.a();
                        u0Var.M(e1Var, xVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        snVar.qa(snVar.J9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        snVar.getMessagesController().getTranslateController().setHideTranslateDialog(snVar.a(), false, true);
                        if (snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a(), true)) {
                            return;
                        }
                        snVar.Uc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (snVar.f == null || snVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = snVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = snVar.a8;
                        org.telegram.ui.Components.voip.d2.m(user4, z13, userFull != null && userFull.video_calls_available, snVar.getParentActivity(), snVar.getMessagesController().getUserFull(snVar.f.id), snVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        hk hkVar = snVar.Y;
                        if (hkVar == null || hkVar.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        hk hkVar2 = snVar.Y;
                        if (hkVar2 == null || hkVar2.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        hk hkVar3 = snVar.Y;
                        if (hkVar3 == null || hkVar3.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        hk hkVar4 = snVar.Y;
                        if (hkVar4 == null || hkVar4.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        hk hkVar5 = snVar.Y;
                        if (hkVar5 == null || hkVar5.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        hk hkVar6 = snVar.Y;
                        if (hkVar6 == null || hkVar6.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        hk hkVar7 = snVar.Y;
                        if (hkVar7 == null || hkVar7.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        hk hkVar8 = snVar.Y;
                        if (hkVar8 == null || hkVar8.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        hk hkVar9 = snVar.Y;
                        if (hkVar9 == null || hkVar9.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        hk hkVar10 = snVar.Y;
                        if (hkVar10 == null || hkVar10.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                        snVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        snVar.Bb();
                        return;
                    }
                    if (i10 == 60) {
                        if (snVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                        long j16 = snVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = snVar.c4;
                        int i33 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i33, true);
                        snVar.Vc();
                        snVar.lc(false);
                        snVar.Uc(true);
                        return;
                    }
                    if (i10 == 61) {
                        te1.I0(snVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(snVar.P3.link);
                        org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.ej
                            public final /* synthetic */ hj b;

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
                                        hj hjVar = this.b;
                                        hjVar.getClass();
                                        sn snVar2 = hjVar.b;
                                        Intent intent = new Intent(snVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", snVar2.P3.link);
                                        snVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (snVar.Y.v()) {
                            snVar.Ab(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = snVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = snVar.P3;
                        d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                        ig.v.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, i27));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        pd1 a02 = pd1.a0(-snVar.T5, 0L);
                        a02.y = snVar;
                        snVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        snVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = l4.b1;
                            org.telegram.ui.Components.xc.a0(snVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = snVar.e;
                if (chat != null) {
                    snVar.presentFragment(sn.W9(-chat.linked_monoforum_id));
                }
            } else if (snVar.getParentActivity() != null) {
                snVar.I7(null, null, false);
            }
        }
    }
}
