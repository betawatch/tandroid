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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qn b;

    public fj(qn qnVar, Context context) {
        this.b = qnVar;
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
        qn qnVar = this.b;
        SparseArray[] sparseArrayArr = qnVar.Y5;
        SparseArray[] sparseArrayArr2 = qnVar.X5;
        SparseArray[] sparseArrayArr3 = qnVar.W5;
        long j10 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (qnVar.xc.f) {
                qnVar.xa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            if (kVar.t()) {
                qnVar.C7(false);
                return;
            }
            if (qnVar.R3 == 5 && (qnVar.u6.isEmpty() || qnVar.d4 == 0)) {
                qnVar.Ub();
            } else if (qnVar.R3 == 6 && qnVar.Y.v()) {
                qnVar.Ab(new Runnable(this) { // from class: org.telegram.ui.cj
                    public final /* synthetic */ fj b;

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
                                fj fjVar = this.b;
                                fjVar.getClass();
                                qn qnVar2 = fjVar.b;
                                Intent intent = new Intent(qnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", qnVar2.P3.link);
                                qnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!qnVar.a7(true, true)) {
                qnVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (qnVar.getUserConfig().getClientUserId() == qnVar.T5) {
                    qnVar.getMessagesController().setSavedViewAs(true);
                    qnVar.a1.e(false, true);
                    return;
                } else {
                    qnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-qnVar.T5, false);
                    re1.I0(qnVar);
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
                    if (qnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = i19; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) qn.I8(messageObject2, arrayList.size() != 1 && ((user3 = qnVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i20--;
                    i19 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    qnVar.T7();
                    qnVar.y3.j(58, 0L, null);
                }
                qnVar.C7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    qnVar.ga(true);
                    return;
                }
                if (i10 == 69) {
                    qn.C1(qnVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = qnVar.T5;
                        if (ChatObject.isMonoForum(qnVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, qnVar.e)) {
                                j12 = qnVar.d4;
                                j10 = qnVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        ai.ga.y(i16, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = qnVar.T5;
                        if (ChatObject.isMonoForum(qnVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, qnVar.e)) {
                                j13 = qnVar.d4;
                                j10 = qnVar.T5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i14 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        ai.ga.y(i14, false).C(j14, j15, new ai.q5(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (qnVar.bb == null) {
                            qn.I1(qnVar);
                            return;
                        } else {
                            qnVar.p9();
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
                        boolean z10 = qnVar.f6 > 0;
                        qnVar.h9();
                        qnVar.Cc(0, true);
                        qnVar.ad(false);
                        MediaController.saveFilesFromMessages(qnVar.getParentActivity(), qnVar.getAccountInstance(), arrayList2, new dj(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (qnVar.getParentActivity() == null) {
                            return;
                        }
                        qnVar.showDialog(org.telegram.ui.Components.f5.U(qnVar.getParentActivity(), qnVar.h, qnVar.ea).a);
                        return;
                    }
                    int i26 = 16;
                    int i27 = 15;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (qnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(qnVar.e)) {
                            if (qnVar.d4 == 0 || (user2 = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.f5.q(qnVar, -1, user2, qnVar.e, true, new m4.w0(i26, this, user2), qnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = qnVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || qnVar.h != null || (((user = qnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(qnVar.f)) && ((chatFull = qnVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.f5.r(qnVar, i10 == 15, qnVar.e, qnVar.f, qnVar.h != null, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.f5.q(qnVar, -1, qnVar.f, qnVar.e, z12, new ej(this, z12), qnVar.getResourceProvider());
                            return;
                        }
                    }
                    int i28 = 17;
                    if (i10 == 17) {
                        if (qnVar.f == null || qnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = qnVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            qnVar.vb(null, ((Integer) qnVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", qnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        qnVar.presentFragment(new fs(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        qnVar.fc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            qnVar.getMediaDataController().installShortcut(qnVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(qnVar.e)) {
                            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.T5));
                            return;
                        }
                        z5 z5Var = new z5(qnVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qnVar.D1;
                        z5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                        }
                        qnVar.presentFragment(z5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i29 = o21.v;
                        int currentAccount = qnVar.getCurrentAccount();
                        Activity parentActivity = qnVar.getParentActivity();
                        long a2 = qnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        o21.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i30 = 0; i30 < 2; i30++) {
                            for (int i31 = 0; i31 < sparseArrayArr[i30].size(); i31++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i30].valueAt(i31);
                                qnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !qnVar.Z5);
                            }
                        }
                        qnVar.C7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i32 = 1; i32 >= 0; i32--) {
                            if (messageObject == null && sparseArrayArr3[i32].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i33 = 0; i33 < sparseArrayArr3[i32].size(); i33++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i32].keyAt(i33)));
                                }
                                messageObject = (MessageObject) qnVar.o6[i32].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i32].clear();
                            sparseArrayArr2[i32].clear();
                            sparseArrayArr[i32].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            qnVar.bc(messageObject, false);
                        } else {
                            qnVar.d5 = messageObject;
                            qnVar.Fa(109);
                            r92 = 0;
                        }
                        qnVar.h9();
                        qnVar.Cc(r92, true);
                        qnVar.ad(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        ig.z1 c10 = ig.a2.f(i12).c(qnVar.M8());
                        Activity parentActivity2 = qnVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        ig.x1.d0(parentActivity2, i13, qnVar.Q3, c10, qnVar.getResourceProvider(), new org.telegram.ui.ActionBar.j3(i27, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.a, qnVar.getResourceProvider(), true, true);
                        e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        e1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
                        org.telegram.ui.ActionBar.x xVar = qnVar.e0;
                        xVar.a();
                        u0Var.M(e1Var, xVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        qnVar.qa(qnVar.J9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        qnVar.getMessagesController().getTranslateController().setHideTranslateDialog(qnVar.a(), false, true);
                        if (qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a(), true)) {
                            return;
                        }
                        qnVar.Uc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (qnVar.f == null || qnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = qnVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = qnVar.a8;
                        org.telegram.ui.Components.voip.d2.m(user4, z13, userFull != null && userFull.video_calls_available, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f.id), qnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        fk fkVar = qnVar.Y;
                        if (fkVar == null || fkVar.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        fk fkVar2 = qnVar.Y;
                        if (fkVar2 == null || fkVar2.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        fk fkVar3 = qnVar.Y;
                        if (fkVar3 == null || fkVar3.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        fk fkVar4 = qnVar.Y;
                        if (fkVar4 == null || fkVar4.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        fk fkVar5 = qnVar.Y;
                        if (fkVar5 == null || fkVar5.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        fk fkVar6 = qnVar.Y;
                        if (fkVar6 == null || fkVar6.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        fk fkVar7 = qnVar.Y;
                        if (fkVar7 == null || fkVar7.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        fk fkVar8 = qnVar.Y;
                        if (fkVar8 == null || fkVar8.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        fk fkVar9 = qnVar.Y;
                        if (fkVar9 == null || fkVar9.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        fk fkVar10 = qnVar.Y;
                        if (fkVar10 == null || fkVar10.getEditField() == null) {
                            return;
                        }
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        qnVar.Bb();
                        return;
                    }
                    if (i10 == 60) {
                        if (qnVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                        long j16 = qnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = qnVar.c4;
                        int i34 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i34, true);
                        qnVar.Vc();
                        qnVar.lc(false);
                        qnVar.Uc(true);
                        return;
                    }
                    if (i10 == 61) {
                        re1.I0(qnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(qnVar.P3.link);
                        org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.cj
                            public final /* synthetic */ fj b;

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
                                        fj fjVar = this.b;
                                        fjVar.getClass();
                                        qn qnVar2 = fjVar.b;
                                        Intent intent = new Intent(qnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", qnVar2.P3.link);
                                        qnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (qnVar.Y.v()) {
                            qnVar.Ab(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = qnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = qnVar.P3;
                        d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                        ig.v.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, i28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        nd1 a02 = nd1.a0(-qnVar.T5, 0L);
                        a02.y = qnVar;
                        qnVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        qnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = l4.b1;
                            org.telegram.ui.Components.xc.a0(qnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = qnVar.e;
                if (chat != null) {
                    qnVar.presentFragment(qn.W9(-chat.linked_monoforum_id));
                }
            } else if (qnVar.getParentActivity() != null) {
                qnVar.I7(null, null, false);
            }
        }
    }
}
