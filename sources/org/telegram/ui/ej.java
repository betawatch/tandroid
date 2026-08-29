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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ej extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ tn b;

    public ej(tn tnVar, Context context) {
        this.b = tnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        int i13;
        ?? r9;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.b;
        SparseArray[] sparseArrayArr = tnVar.U5;
        SparseArray[] sparseArrayArr2 = tnVar.T5;
        SparseArray[] sparseArrayArr3 = tnVar.S5;
        long j10 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (tnVar.sc.f) {
                tnVar.ta();
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (lVar.s()) {
                tnVar.z7(false);
                return;
            }
            if (tnVar.N3 == 5 && (tnVar.q6.isEmpty() || tnVar.Z3 == 0)) {
                tnVar.Qb();
            } else if (tnVar.N3 == 6 && tnVar.U.w()) {
                tnVar.wb(new Runnable(this) { // from class: org.telegram.ui.bj
                    public final /* synthetic */ ej b;

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
                                ej ejVar = this.b;
                                ejVar.getClass();
                                tn tnVar2 = ejVar.b;
                                Intent intent = new Intent(tnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tnVar2.L3.link);
                                tnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!tnVar.X6(true, true)) {
                tnVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (tnVar.getUserConfig().getClientUserId() == tnVar.P5) {
                    tnVar.getMessagesController().setSavedViewAs(true);
                    tnVar.W0.e(false, true);
                    return;
                } else {
                    tnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-tnVar.P5, false);
                    ze1.I0(tnVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                for (int i20 = 1; i20 >= 0; i20--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = 0; i21 < sparseArrayArr2[i20].size(); i21++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                    }
                    if (tnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) tn.D8(messageObject2, arrayList.size() != 1 && ((user3 = tnVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    tnVar.Q7();
                    tnVar.u3.j(58, 0L, null);
                }
                tnVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    tnVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    tn.B1(tnVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = tnVar.P5;
                        if (ChatObject.isMonoForum(tnVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, tnVar.e)) {
                                j12 = tnVar.Z3;
                                j10 = tnVar.P5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        jh.s7.y(i16, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = tnVar.P5;
                        if (ChatObject.isMonoForum(tnVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, tnVar.e)) {
                                j13 = tnVar.Z3;
                                j10 = tnVar.P5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        jh.s7.y(i14, false).C(j14, j15, new jh.u3(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (tnVar.Xa == null) {
                            tn.G1(tnVar);
                            return;
                        } else {
                            tnVar.k9();
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
                        boolean z10 = tnVar.b6 > 0;
                        tnVar.c9();
                        tnVar.yc(0, true);
                        tnVar.Wc(false);
                        MediaController.saveFilesFromMessages(tnVar.getParentActivity(), tnVar.getAccountInstance(), arrayList2, new cj(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (tnVar.getParentActivity() == null) {
                            return;
                        }
                        tnVar.showDialog(org.telegram.ui.Components.c5.V(tnVar.getParentActivity(), tnVar.h, tnVar.aa).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (tnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(tnVar.e)) {
                            if (tnVar.Z3 == 0 || (user2 = tnVar.getMessagesController().getUser(Long.valueOf(tnVar.Z3))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.c5.r(tnVar, -1, user2, tnVar.e, true, new kg.w(19, this, user2), tnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = tnVar.V7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || tnVar.h != null || (((user = tnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(tnVar.f)) && ((chatFull = tnVar.V7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.c5.s(tnVar, i10 == 15, tnVar.e, tnVar.f, tnVar.h != null, true, false, z11, new eg.n2(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.c5.r(tnVar, -1, tnVar.f, tnVar.e, z12, new dj(this, z12), tnVar.getResourceProvider());
                            return;
                        }
                    }
                    int i26 = 17;
                    if (i10 == 17) {
                        if (tnVar.f == null || tnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = tnVar.H1;
                        if (textView != null && textView.getTag() != null) {
                            tnVar.rb(null, ((Integer) tnVar.H1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        tnVar.presentFragment(new hs(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        tnVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            tnVar.getMediaDataController().installShortcut(tnVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    int i27 = 29;
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(tnVar.e)) {
                            tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(tnVar.P5));
                            return;
                        }
                        v5 v5Var = new v5(tnVar.P5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = tnVar.z1;
                        v5Var.N = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, 0));
                        }
                        tnVar.presentFragment(v5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i28 = y21.v;
                        int currentAccount = tnVar.getCurrentAccount();
                        Activity parentActivity = tnVar.getParentActivity();
                        long a2 = tnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        y21.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i29 = 0; i29 < 2; i29++) {
                            for (int i30 = 0; i30 < sparseArrayArr[i29].size(); i30++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i29].valueAt(i30);
                                tnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !tnVar.V5);
                            }
                        }
                        tnVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i31 = 1; i31 >= 0; i31--) {
                            if (messageObject == null && sparseArrayArr3[i31].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i32 = 0; i32 < sparseArrayArr3[i31].size(); i32++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i31].keyAt(i32)));
                                }
                                messageObject = (MessageObject) tnVar.k6[i31].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i31].clear();
                            sparseArrayArr2[i31].clear();
                            sparseArrayArr[i31].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r9 = 0;
                            tnVar.Xb(messageObject, false);
                        } else {
                            tnVar.Z4 = messageObject;
                            tnVar.Ba(109);
                            r9 = 0;
                        }
                        tnVar.c9();
                        tnVar.yc(r9, true);
                        tnVar.Wc(r9);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        sf.r1 c3 = sf.s1.f(i12).c(tnVar.H8());
                        Activity parentActivity2 = tnVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        sf.n1.d0(parentActivity2, i13, tnVar.M3, c3, tnVar.getResourceProvider(), new ih.b1(i27, this, c3));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, tnVar.getResourceProvider(), true, true);
                        g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
                        org.telegram.ui.ActionBar.z zVar = tnVar.a0;
                        zVar.a();
                        w0Var.M(g1Var, zVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        tnVar.la(tnVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        tnVar.getMessagesController().getTranslateController().setHideTranslateDialog(tnVar.a(), false, true);
                        if (tnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(tnVar.a(), true)) {
                            return;
                        }
                        tnVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (tnVar.f == null || tnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = tnVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = tnVar.W7;
                        org.telegram.ui.Components.voip.h2.n(user4, z13, userFull != null && userFull.video_calls_available, tnVar.getParentActivity(), tnVar.getMessagesController().getUserFull(tnVar.f.id), tnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        dk dkVar = tnVar.U;
                        if (dkVar == null || dkVar.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        dk dkVar2 = tnVar.U;
                        if (dkVar2 == null || dkVar2.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        dk dkVar3 = tnVar.U;
                        if (dkVar3 == null || dkVar3.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        dk dkVar4 = tnVar.U;
                        if (dkVar4 == null || dkVar4.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        dk dkVar5 = tnVar.U;
                        if (dkVar5 == null || dkVar5.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        dk dkVar6 = tnVar.U;
                        if (dkVar6 == null || dkVar6.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        dk dkVar7 = tnVar.U;
                        if (dkVar7 == null || dkVar7.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        dk dkVar8 = tnVar.U;
                        if (dkVar8 == null || dkVar8.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        dk dkVar9 = tnVar.U;
                        if (dkVar9 == null || dkVar9.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        dk dkVar10 = tnVar.U;
                        if (dkVar10 == null || dkVar10.getEditField() == null) {
                            return;
                        }
                        tnVar.U.getEditField().setSelectionOverride(tnVar.w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        tnVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (tnVar.Y3 == null) {
                            return;
                        }
                        TopicsController topicsController = tnVar.getMessagesController().getTopicsController();
                        long j16 = tnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = tnVar.Y3;
                        int i33 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i33, true);
                        tnVar.Rc();
                        tnVar.hc(false);
                        tnVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        ze1.I0(tnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(tnVar.L3.link);
                        org.telegram.ui.Components.tc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.bj
                            public final /* synthetic */ ej b;

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
                                        ej ejVar = this.b;
                                        ejVar.getClass();
                                        tn tnVar2 = ejVar.b;
                                        Intent intent = new Intent(tnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", tnVar2.L3.link);
                                        tnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (tnVar.U.w()) {
                            tnVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = tnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = tnVar.L3;
                        c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                        sf.r.b0(parentActivity3, i11, tL_businessChatLink, c6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        tnVar.showDialog(c2Var);
                        TextView textView2 = (TextView) c2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        td1 a02 = td1.a0(-tnVar.P5, 0L);
                        a02.y = tnVar;
                        tnVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        tnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = m4.X0;
                            org.telegram.ui.Components.tc.a0(tnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = tnVar.e;
                if (chat != null) {
                    tnVar.presentFragment(tn.R9(-chat.linked_monoforum_id));
                }
            } else if (tnVar.getParentActivity() != null) {
                tnVar.F7(null, null, false);
            }
        }
    }
}
