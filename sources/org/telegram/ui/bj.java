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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qn b;

    public bj(qn qnVar, Context context) {
        this.b = qnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v17 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i12;
        int i13;
        ?? r10;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.b;
        SparseArray[] sparseArrayArr = qnVar.U5;
        SparseArray[] sparseArrayArr2 = qnVar.T5;
        SparseArray[] sparseArrayArr3 = qnVar.S5;
        int i18 = 6;
        long j10 = 0;
        final int i19 = 0;
        if (i9 == -1) {
            if (qnVar.sc.f) {
                qnVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (kVar.s()) {
                qnVar.z7(false);
                return;
            }
            if (qnVar.N3 == 5 && (qnVar.q6.isEmpty() || qnVar.Z3 == 0)) {
                qnVar.Qb();
            } else if (qnVar.N3 == 6 && qnVar.U.w()) {
                qnVar.wb(new Runnable(this) { // from class: org.telegram.ui.yi
                    public final /* synthetic */ bj b;

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
                                bj bjVar = this.b;
                                bjVar.getClass();
                                qn qnVar2 = bjVar.b;
                                Intent intent = new Intent(qnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", qnVar2.L3.link);
                                qnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!qnVar.X6(true, true)) {
                qnVar.finishFragment();
            }
        } else {
            if (i9 == 59) {
                if (qnVar.getUserConfig().getClientUserId() == qnVar.P5) {
                    qnVar.getMessagesController().setSavedViewAs(true);
                    qnVar.W0.e(false, true);
                    return;
                } else {
                    qnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-qnVar.P5, false);
                    we1.H0(qnVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i9 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                for (int i20 = 1; i20 >= 0; i20--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = 0; i21 < sparseArrayArr2[i20].size(); i21++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                    }
                    if (qnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) qn.D8(messageObject2, arrayList.size() != 1 && ((user3 = qnVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    qnVar.Q7();
                    qnVar.u3.j(58, 0L, null);
                }
                qnVar.z7(false);
                return;
            }
            if (i9 != 12) {
                if (i9 == 11) {
                    qnVar.ba(true);
                    return;
                }
                if (i9 == 69) {
                    qn.B1(qnVar);
                    return;
                }
                if (i9 != 70) {
                    if (i9 == 72) {
                        long j12 = qnVar.P5;
                        if (ChatObject.isMonoForum(qnVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, qnVar.e)) {
                                j12 = qnVar.Z3;
                                j10 = qnVar.P5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        gh.v7.y(i16, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i9 == 71) {
                        long j13 = qnVar.P5;
                        if (ChatObject.isMonoForum(qnVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, qnVar.e)) {
                                j13 = qnVar.Z3;
                                j10 = qnVar.P5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i14 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        gh.v7.y(i14, false).C(j14, j15, new gh.w3(this, j14, j15, 2));
                        return;
                    }
                    if (i9 == 28) {
                        if (qnVar.Xa == null) {
                            qn.G1(qnVar);
                            return;
                        } else {
                            qnVar.k9();
                            return;
                        }
                    }
                    if (i9 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i23 = 1; i23 >= 0; i23--) {
                            for (int i24 = 0; i24 < sparseArrayArr3[i23].size(); i24++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i23].valueAt(i24));
                            }
                            sparseArrayArr3[i23].clear();
                            sparseArrayArr2[i23].clear();
                            sparseArrayArr[i23].clear();
                        }
                        boolean z10 = qnVar.b6 > 0;
                        qnVar.c9();
                        qnVar.yc(0, true);
                        qnVar.Wc(false);
                        MediaController.saveFilesFromMessages(qnVar.getParentActivity(), qnVar.getAccountInstance(), arrayList2, new zi(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i9 == 13) {
                        if (qnVar.getParentActivity() == null) {
                            return;
                        }
                        qnVar.showDialog(org.telegram.ui.Components.y4.V(qnVar.getParentActivity(), qnVar.h, qnVar.aa).a);
                        return;
                    }
                    if (i9 == 15 || i9 == 16 || i9 == 26) {
                        if (qnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i9 == 15 && ChatObject.isMonoForum(qnVar.e)) {
                            if (qnVar.Z3 == 0 || (user2 = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.Z3))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.y4.r(qnVar, -1, user2, qnVar.e, true, new ih.v3(19, this, user2), qnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = qnVar.V7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i9 != 26) {
                            if (i9 == 15) {
                                i10 = (qnVar.h != null || (((user = qnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(qnVar.f)) && ((chatFull = qnVar.V7) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.y4.s(qnVar, i9 == i10, qnVar.e, qnVar.f, qnVar.h == null ? 0 : 1, true, false, z11, new bg.x2(this, i9, z11));
                            return;
                        }
                        org.telegram.ui.Components.y4.r(qnVar, -1, qnVar.f, qnVar.e, z11, new aj(this, z11), qnVar.getResourceProvider());
                        return;
                    }
                    int i26 = 17;
                    if (i9 == 17) {
                        if (qnVar.f == null || qnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = qnVar.H1;
                        if (textView != null && textView.getTag() != null) {
                            qnVar.rb(null, ((Integer) qnVar.H1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", qnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        qnVar.presentFragment(new is(bundle));
                        return;
                    }
                    if (i9 == 18) {
                        qnVar.bc(false);
                        return;
                    }
                    if (i9 == 24) {
                        try {
                            qnVar.getMediaDataController().installShortcut(qnVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    if (i9 == 29) {
                        if (!ChatObject.hasAdminRights(qnVar.e)) {
                            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.P5));
                            return;
                        }
                        u5 u5Var = new u5(qnVar.P5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qnVar.z1;
                        u5Var.N = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            u5Var.getMessagesController().getBoostsController().userCanBoostChannel(u5Var.L, u5Var.N, new m5(u5Var, 0));
                        }
                        qnVar.presentFragment(u5Var);
                        return;
                    }
                    if (i9 == 21) {
                        int i27 = y21.v;
                        int currentAccount = qnVar.getCurrentAccount();
                        Activity parentActivity = qnVar.getParentActivity();
                        long a2 = qnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        y21.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i9 == 22) {
                        for (int i28 = 0; i28 < 2; i28++) {
                            for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i28].valueAt(i29);
                                qnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !qnVar.V5);
                            }
                        }
                        qnVar.z7(false);
                        return;
                    }
                    if (i9 == 23) {
                        for (int i30 = 1; i30 >= 0; i30--) {
                            if (messageObject == null && sparseArrayArr3[i30].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                }
                                messageObject = (MessageObject) qnVar.k6[i30].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i30].clear();
                            sparseArrayArr2[i30].clear();
                            sparseArrayArr[i30].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r10 = 0;
                            qnVar.Xb(messageObject, false);
                        } else {
                            qnVar.Z4 = messageObject;
                            qnVar.Ba(109);
                            r10 = 0;
                        }
                        qnVar.c9();
                        qnVar.yc(r10, true);
                        qnVar.Wc(r10);
                        return;
                    }
                    if (i9 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        pf.q1 c10 = pf.r1.f(i12).c(qnVar.H8());
                        Activity parentActivity2 = qnVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        pf.n1.c0(parentActivity2, i13, qnVar.M3, c10, qnVar.getResourceProvider(), new df(i18, this, c10));
                        return;
                    }
                    if (i9 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, qnVar.getResourceProvider(), true, true);
                        g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.w0 w0Var = qnVar.d0;
                        org.telegram.ui.ActionBar.y yVar = qnVar.a0;
                        yVar.a();
                        w0Var.M(g1Var, yVar.m);
                        return;
                    }
                    if (i9 == 30) {
                        qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i9 == 31) {
                        qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i9 == 40) {
                        qnVar.la(qnVar.E9() ? "" : null);
                        return;
                    }
                    if (i9 == 62) {
                        qnVar.getMessagesController().getTranslateController().setHideTranslateDialog(qnVar.a(), false, true);
                        if (qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a(), true)) {
                            return;
                        }
                        qnVar.Qc(true);
                        return;
                    }
                    if (i9 == 32 || i9 == 33) {
                        if (qnVar.f == null || qnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = qnVar.f;
                        boolean z12 = i9 == 33;
                        TLRPC.UserFull userFull = qnVar.W7;
                        org.telegram.ui.Components.voip.e2.n(user4, z12, userFull != null && userFull.video_calls_available, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f.id), qnVar.getAccountInstance());
                        return;
                    }
                    if (i9 == 50) {
                        ak akVar = qnVar.U;
                        if (akVar == null || akVar.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i9 == 51) {
                        ak akVar2 = qnVar.U;
                        if (akVar2 == null || akVar2.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i9 == 57) {
                        ak akVar3 = qnVar.U;
                        if (akVar3 == null || akVar3.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i9 == 58) {
                        ak akVar4 = qnVar.U;
                        if (akVar4 == null || akVar4.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i9 == 52) {
                        ak akVar5 = qnVar.U;
                        if (akVar5 == null || akVar5.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i9 == 55) {
                        ak akVar6 = qnVar.U;
                        if (akVar6 == null || akVar6.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i9 == 56) {
                        ak akVar7 = qnVar.U;
                        if (akVar7 == null || akVar7.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i9 == 74) {
                        ak akVar8 = qnVar.U;
                        if (akVar8 == null || akVar8.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i9 == 53) {
                        ak akVar9 = qnVar.U;
                        if (akVar9 == null || akVar9.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i9 == 54) {
                        ak akVar10 = qnVar.U;
                        if (akVar10 == null || akVar10.getEditField() == null) {
                            return;
                        }
                        qnVar.U.getEditField().setSelectionOverride(qnVar.w4, qnVar.x4);
                        qnVar.U.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i9 == 27) {
                        qnVar.xb();
                        return;
                    }
                    if (i9 == 60) {
                        if (qnVar.Y3 == null) {
                            return;
                        }
                        TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                        long j16 = qnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = qnVar.Y3;
                        int i32 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i32, true);
                        qnVar.Rc();
                        qnVar.hc(false);
                        qnVar.Qc(true);
                        return;
                    }
                    if (i9 == 61) {
                        we1.H0(qnVar);
                        return;
                    }
                    if (i9 == 65) {
                        AndroidUtilities.addToClipboard(qnVar.L3.link);
                        org.telegram.ui.Components.oc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i9 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.yi
                            public final /* synthetic */ bj b;

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
                                        bj bjVar = this.b;
                                        bjVar.getClass();
                                        qn qnVar2 = bjVar.b;
                                        Intent intent = new Intent(qnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", qnVar2.L3.link);
                                        qnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (qnVar.U.w()) {
                            qnVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i9 == 67) {
                        Activity parentActivity3 = qnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = qnVar.L3;
                        b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                        pf.r.a0(parentActivity3, i11, tL_businessChatLink, b6Var);
                        return;
                    }
                    if (i9 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(c2Var);
                        TextView textView2 = (TextView) c2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.q7));
                            return;
                        }
                        return;
                    }
                    if (i9 == 73) {
                        rd1 Z = rd1.Z(-qnVar.P5, 0L);
                        Z.y = qnVar;
                        qnVar.presentFragment(Z);
                        return;
                    } else if (i9 == 888) {
                        qnVar.dumpCanvas();
                        return;
                    } else {
                        if (i9 == 889) {
                            HashSet hashSet = l4.X0;
                            org.telegram.ui.Components.oc.a0(qnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = qnVar.e;
                if (chat != null) {
                    qnVar.presentFragment(qn.R9(-chat.linked_monoforum_id));
                }
            } else if (qnVar.getParentActivity() != null) {
                qnVar.F7(null, null, false);
            }
        }
    }
}
