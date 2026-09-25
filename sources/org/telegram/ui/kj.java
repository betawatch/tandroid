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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class kj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wn b;

    public kj(wn wnVar, Context context) {
        this.b = wnVar;
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
        wn wnVar = this.b;
        SparseArray[] sparseArrayArr = wnVar.Y5;
        SparseArray[] sparseArrayArr2 = wnVar.X5;
        SparseArray[] sparseArrayArr3 = wnVar.W5;
        long j3 = 0;
        final int i18 = 0;
        if (i10 == -1) {
            if (wnVar.vc.f) {
                wnVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (kVar.s()) {
                wnVar.z7(false);
                return;
            }
            if (wnVar.R3 == 5 && (wnVar.u6.isEmpty() || wnVar.d4 == 0)) {
                wnVar.Qb();
            } else if (wnVar.R3 == 6 && wnVar.Y.w()) {
                wnVar.wb(new Runnable(this) { // from class: org.telegram.ui.hj
                    public final /* synthetic */ kj b;

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
                                kj kjVar = this.b;
                                kjVar.getClass();
                                wn wnVar2 = kjVar.b;
                                Intent intent = new Intent(wnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", wnVar2.P3.link);
                                wnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!wnVar.X6(true, true)) {
                wnVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (wnVar.getUserConfig().getClientUserId() == wnVar.T5) {
                    wnVar.getMessagesController().setSavedViewAs(true);
                    wnVar.a1.e(false, true);
                    return;
                } else {
                    wnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-wnVar.T5, false);
                    wf1.I0(wnVar);
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
                    if (wnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) wn.D8(messageObject2, arrayList.size() != 1 && ((user3 = wnVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    wnVar.Q7();
                    wnVar.y3.j(58, 0L, null);
                }
                wnVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    wnVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    wn.B1(wnVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = wnVar.T5;
                        if (ChatObject.isMonoForum(wnVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, wnVar.e)) {
                                j11 = wnVar.d4;
                                j3 = wnVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        yh.s5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = wnVar.T5;
                        if (ChatObject.isMonoForum(wnVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, wnVar.e)) {
                                j12 = wnVar.d4;
                                j3 = wnVar.T5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        yh.s5.y(i14, false).C(j13, j14, new bh(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (wnVar.ab == null) {
                            wn.G1(wnVar);
                            return;
                        } else {
                            wnVar.k9();
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
                        boolean z10 = wnVar.f6 > 0;
                        wnVar.c9();
                        wnVar.yc(0, true);
                        wnVar.Wc(false);
                        MediaController.saveFilesFromMessages(wnVar.getParentActivity(), wnVar.getAccountInstance(), arrayList2, new ij(0, this, z10));
                        return;
                    }
                    int i24 = 13;
                    if (i10 == 13) {
                        if (wnVar.getParentActivity() == null) {
                            return;
                        }
                        wnVar.showDialog(org.telegram.ui.Components.e5.V(wnVar.getParentActivity(), wnVar.h, wnVar.ea).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (wnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(wnVar.e)) {
                            if (wnVar.d4 == 0 || (user2 = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.e5.r(wnVar, -1, user2, wnVar.e, true, new o(12, this, user2), wnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = wnVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || wnVar.h != null || (((user = wnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(wnVar.f)) && ((chatFull = wnVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.e5.s(wnVar, i10 == 15, wnVar.e, wnVar.f, wnVar.h == null ? 0 : 1, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.e5.r(wnVar, -1, wnVar.f, wnVar.e, z12, new jj(this, z12), wnVar.getResourceProvider());
                            return;
                        }
                    }
                    int i25 = 17;
                    if (i10 == 17) {
                        if (wnVar.f == null || wnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = wnVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            wnVar.rb(null, ((Integer) wnVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", wnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        wnVar.presentFragment(new ms(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        wnVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            wnVar.getMediaDataController().installShortcut(wnVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(wnVar.e)) {
                            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.T5));
                            return;
                        }
                        v5 v5Var = new v5(wnVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wnVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        wnVar.presentFragment(v5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i26 = t31.v;
                        int currentAccount = wnVar.getCurrentAccount();
                        Activity parentActivity = wnVar.getParentActivity();
                        long a2 = wnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        t31.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i27 = 0; i27 < 2; i27++) {
                            for (int i28 = 0; i28 < sparseArrayArr[i27].size(); i28++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i27].valueAt(i28);
                                wnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !wnVar.Z5);
                            }
                        }
                        wnVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i29 = 1; i29 >= 0; i29--) {
                            if (messageObject == null && sparseArrayArr3[i29].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < sparseArrayArr3[i29].size(); i30++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i29].keyAt(i30)));
                                }
                                messageObject = (MessageObject) wnVar.o6[i29].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i29].clear();
                            sparseArrayArr2[i29].clear();
                            sparseArrayArr[i29].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            wnVar.Xb(messageObject, false);
                        } else {
                            wnVar.d5 = messageObject;
                            wnVar.Ba(109);
                            r92 = 0;
                        }
                        wnVar.c9();
                        wnVar.yc(r92, true);
                        wnVar.Wc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        hg.b2 c10 = hg.c2.f(i12).c(wnVar.H8());
                        Activity parentActivity2 = wnVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        hg.z1.d0(parentActivity2, i13, wnVar.Q3, c10, wnVar.getResourceProvider(), new oc(9, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.a, wnVar.getResourceProvider(), true, true);
                        e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        e1Var.setOnClickListener(new a(this, i24));
                        org.telegram.ui.ActionBar.u0 u0Var = wnVar.h0;
                        org.telegram.ui.ActionBar.x xVar = wnVar.e0;
                        xVar.a();
                        u0Var.M(e1Var, xVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", wnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", wnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        wnVar.la(wnVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        wnVar.getMessagesController().getTranslateController().setHideTranslateDialog(wnVar.a(), false, true);
                        if (wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a(), true)) {
                            return;
                        }
                        wnVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (wnVar.f == null || wnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = wnVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = wnVar.a8;
                        org.telegram.ui.Components.voip.g2.m(user4, z13, userFull != null && userFull.video_calls_available, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f.id), wnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        jk jkVar = wnVar.Y;
                        if (jkVar == null || jkVar.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        jk jkVar2 = wnVar.Y;
                        if (jkVar2 == null || jkVar2.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        jk jkVar3 = wnVar.Y;
                        if (jkVar3 == null || jkVar3.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        jk jkVar4 = wnVar.Y;
                        if (jkVar4 == null || jkVar4.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        jk jkVar5 = wnVar.Y;
                        if (jkVar5 == null || jkVar5.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        jk jkVar6 = wnVar.Y;
                        if (jkVar6 == null || jkVar6.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        jk jkVar7 = wnVar.Y;
                        if (jkVar7 == null || jkVar7.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        jk jkVar8 = wnVar.Y;
                        if (jkVar8 == null || jkVar8.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        jk jkVar9 = wnVar.Y;
                        if (jkVar9 == null || jkVar9.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        jk jkVar10 = wnVar.Y;
                        if (jkVar10 == null || jkVar10.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                        wnVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        wnVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (wnVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                        long j15 = wnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = wnVar.c4;
                        int i31 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i31, true);
                        wnVar.Rc();
                        wnVar.hc(false);
                        wnVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        wf1.I0(wnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(wnVar.P3.link);
                        org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.hj
                            public final /* synthetic */ kj b;

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
                                        kj kjVar = this.b;
                                        kjVar.getClass();
                                        wn wnVar2 = kjVar.b;
                                        Intent intent = new Intent(wnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", wnVar2.P3.link);
                                        wnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (wnVar.Y.w()) {
                            wnVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = wnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = wnVar.P3;
                        d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                        hg.x.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, i25));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(a2Var);
                        TextView textView2 = (TextView) a2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        se1 a02 = se1.a0(-wnVar.T5, 0L);
                        a02.y = wnVar;
                        wnVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        wnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = i4.b1;
                            org.telegram.ui.Components.xc.a0(wnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = wnVar.e;
                if (chat != null) {
                    wnVar.presentFragment(wn.R9(-chat.linked_monoforum_id));
                }
            } else if (wnVar.getParentActivity() != null) {
                wnVar.F7(null, null, false);
            }
        }
    }
}
