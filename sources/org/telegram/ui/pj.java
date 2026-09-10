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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pj extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ eo b;

    public pj(eo eoVar, Context context) {
        this.b = eoVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i12;
        int i13;
        ?? r10;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.b;
        SparseArray[] sparseArrayArr = eoVar.Y5;
        SparseArray[] sparseArrayArr2 = eoVar.X5;
        SparseArray[] sparseArrayArr3 = eoVar.W5;
        long j3 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (eoVar.wc.f) {
                eoVar.ta();
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (lVar.s()) {
                eoVar.z7(false);
                return;
            }
            if (eoVar.R3 == 5 && (eoVar.u6.isEmpty() || eoVar.d4 == 0)) {
                eoVar.Qb();
            } else if (eoVar.R3 == 6 && eoVar.Y.w()) {
                eoVar.wb(new Runnable(this) { // from class: org.telegram.ui.mj
                    public final /* synthetic */ pj b;

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
                                pj pjVar = this.b;
                                pjVar.getClass();
                                eo eoVar2 = pjVar.b;
                                Intent intent = new Intent(eoVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", eoVar2.P3.link);
                                eoVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!eoVar.X6(true, true)) {
                eoVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (eoVar.getUserConfig().getClientUserId() == eoVar.T5) {
                    eoVar.getMessagesController().setSavedViewAs(true);
                    eoVar.a1.e(false, true);
                    return;
                } else {
                    eoVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-eoVar.T5, false);
                    ig1.I0(eoVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j10 = 0;
                for (int i20 = 1; i20 >= 0; i20--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = 0; i21 < sparseArrayArr2[i20].size(); i21++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                    }
                    if (eoVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) eo.D8(messageObject2, arrayList.size() != 1 && ((user3 = eoVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    eoVar.Q7();
                    eoVar.y3.j(58, 0L, null);
                }
                eoVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    eoVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    eo.B1(eoVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = eoVar.T5;
                        if (ChatObject.isMonoForum(eoVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, eoVar.e)) {
                                j11 = eoVar.d4;
                                j3 = eoVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        xh.v5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = eoVar.T5;
                        if (ChatObject.isMonoForum(eoVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, eoVar.e)) {
                                j12 = eoVar.d4;
                                j3 = eoVar.T5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        xh.v5.y(i14, false).C(j13, j14, new mg(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (eoVar.bb == null) {
                            eo.G1(eoVar);
                            return;
                        } else {
                            eoVar.k9();
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
                        boolean z10 = eoVar.f6 > 0;
                        eoVar.c9();
                        eoVar.yc(0, true);
                        eoVar.Wc(false);
                        MediaController.saveFilesFromMessages(eoVar.getParentActivity(), eoVar.getAccountInstance(), arrayList2, new nj(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (eoVar.getParentActivity() == null) {
                            return;
                        }
                        eoVar.showDialog(org.telegram.ui.Components.d5.V(eoVar.getParentActivity(), eoVar.h, eoVar.ea).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (eoVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(eoVar.e)) {
                            if (eoVar.d4 == 0 || (user2 = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.d5.r(eoVar, -1, user2, eoVar.e, true, new oe(5, this, user2), eoVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = eoVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || eoVar.h != null || (((user = eoVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(eoVar.f)) && ((chatFull = eoVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.d5.s(eoVar, i10 == 15, eoVar.e, eoVar.f, eoVar.h != null, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.d5.r(eoVar, -1, eoVar.f, eoVar.e, z12, new oj(this, z12), eoVar.getResourceProvider());
                            return;
                        }
                    }
                    int i26 = 17;
                    if (i10 == 17) {
                        if (eoVar.f == null || eoVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = eoVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            eoVar.rb(null, ((Integer) eoVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", eoVar.f.id);
                        bundle.putBoolean("addContact", true);
                        eoVar.presentFragment(new ts(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        eoVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            eoVar.getMediaDataController().installShortcut(eoVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(eoVar.e)) {
                            eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(eoVar.T5));
                            return;
                        }
                        w5 w5Var = new w5(eoVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = eoVar.D1;
                        w5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new m5(w5Var, 0));
                        }
                        eoVar.presentFragment(w5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i27 = h41.v;
                        int currentAccount = eoVar.getCurrentAccount();
                        Activity parentActivity = eoVar.getParentActivity();
                        long a2 = eoVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        h41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i28 = 0; i28 < 2; i28++) {
                            for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i28].valueAt(i29);
                                eoVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !eoVar.Z5);
                            }
                        }
                        eoVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i30 = 1; i30 >= 0; i30--) {
                            if (messageObject == null && sparseArrayArr3[i30].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                }
                                messageObject = (MessageObject) eoVar.o6[i30].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i30].clear();
                            sparseArrayArr2[i30].clear();
                            sparseArrayArr[i30].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r10 = 0;
                            eoVar.Xb(messageObject, false);
                        } else {
                            eoVar.d5 = messageObject;
                            eoVar.Ba(109);
                            r10 = 0;
                        }
                        eoVar.c9();
                        eoVar.yc(r10, true);
                        eoVar.Wc(r10);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        gg.j2 c10 = gg.k2.f(i12).c(eoVar.H8());
                        Activity parentActivity2 = eoVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        gg.h2.d0(parentActivity2, i13, eoVar.Q3, c10, eoVar.getResourceProvider(), new pf(4, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, eoVar.getResourceProvider(), true, true);
                        g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
                        org.telegram.ui.ActionBar.y yVar = eoVar.e0;
                        yVar.a();
                        w0Var.M(g1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        eoVar.la(eoVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        eoVar.getMessagesController().getTranslateController().setHideTranslateDialog(eoVar.a(), false, true);
                        if (eoVar.getMessagesController().getTranslateController().toggleTranslatingDialog(eoVar.a(), true)) {
                            return;
                        }
                        eoVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (eoVar.f == null || eoVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = eoVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = eoVar.a8;
                        org.telegram.ui.Components.voip.e2.m(user4, z13, userFull != null && userFull.video_calls_available, eoVar.getParentActivity(), eoVar.getMessagesController().getUserFull(eoVar.f.id), eoVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        ok okVar = eoVar.Y;
                        if (okVar == null || okVar.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        ok okVar2 = eoVar.Y;
                        if (okVar2 == null || okVar2.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        ok okVar3 = eoVar.Y;
                        if (okVar3 == null || okVar3.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        ok okVar4 = eoVar.Y;
                        if (okVar4 == null || okVar4.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        ok okVar5 = eoVar.Y;
                        if (okVar5 == null || okVar5.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        ok okVar6 = eoVar.Y;
                        if (okVar6 == null || okVar6.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        ok okVar7 = eoVar.Y;
                        if (okVar7 == null || okVar7.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        ok okVar8 = eoVar.Y;
                        if (okVar8 == null || okVar8.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        ok okVar9 = eoVar.Y;
                        if (okVar9 == null || okVar9.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        ok okVar10 = eoVar.Y;
                        if (okVar10 == null || okVar10.getEditField() == null) {
                            return;
                        }
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        eoVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (eoVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = eoVar.getMessagesController().getTopicsController();
                        long j15 = eoVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = eoVar.c4;
                        int i32 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i32, true);
                        eoVar.Rc();
                        eoVar.hc(false);
                        eoVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        ig1.I0(eoVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(eoVar.P3.link);
                        org.telegram.ui.Components.wc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.mj
                            public final /* synthetic */ pj b;

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
                                        pj pjVar = this.b;
                                        pjVar.getClass();
                                        eo eoVar2 = pjVar.b;
                                        Intent intent = new Intent(eoVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", eoVar2.P3.link);
                                        eoVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (eoVar.Y.w()) {
                            eoVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = eoVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = eoVar.P3;
                        f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                        gg.x.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.R = string;
                        d2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        eoVar.showDialog(d2Var);
                        TextView textView2 = (TextView) d2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        ef1 a02 = ef1.a0(-eoVar.T5, 0L);
                        a02.y = eoVar;
                        eoVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        eoVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = j4.b1;
                            org.telegram.ui.Components.wc.a0(eoVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = eoVar.e;
                if (chat != null) {
                    eoVar.presentFragment(eo.R9(-chat.linked_monoforum_id));
                }
            } else if (eoVar.getParentActivity() != null) {
                eoVar.F7(null, null, false);
            }
        }
    }
}
