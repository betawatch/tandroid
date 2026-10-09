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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zn b;

    public oj(zn znVar, Context context) {
        this.b = znVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i12;
        int i13;
        ?? r92;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.b;
        SparseArray[] sparseArrayArr = znVar.Y5;
        SparseArray[] sparseArrayArr2 = znVar.X5;
        SparseArray[] sparseArrayArr3 = znVar.W5;
        long j3 = 0;
        final int i18 = 0;
        if (i10 == -1) {
            if (znVar.wc.f) {
                znVar.xa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (kVar.t()) {
                znVar.C7(false);
                return;
            }
            if (znVar.R3 == 5 && (znVar.u6.isEmpty() || znVar.d4 == 0)) {
                znVar.Ub();
            } else if (znVar.R3 == 6 && znVar.Y.v()) {
                znVar.Ab(new Runnable(this) { // from class: org.telegram.ui.lj
                    public final /* synthetic */ oj b;

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
                                oj ojVar = this.b;
                                ojVar.getClass();
                                zn znVar2 = ojVar.b;
                                Intent intent = new Intent(znVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", znVar2.P3.link);
                                znVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!znVar.a7(true, true)) {
                znVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (znVar.getUserConfig().getClientUserId() == znVar.T5) {
                    znVar.getMessagesController().setSavedViewAs(true);
                    znVar.a1.e(false, true);
                    return;
                } else {
                    znVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-znVar.T5, false);
                    fg1.I0(znVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j10 = 0;
                int i19 = 1;
                while (i19 >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = i18; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (znVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) zn.I8(messageObject2, arrayList.size() != 1 && ((user3 = znVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    znVar.T7();
                    znVar.y3.j(58, 0L, null);
                }
                znVar.C7(false);
                return;
            }
            int i22 = 12;
            if (i10 != 12) {
                if (i10 == 11) {
                    znVar.ga(true);
                    return;
                }
                if (i10 == 69) {
                    zn.C1(znVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = znVar.T5;
                        if (ChatObject.isMonoForum(znVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, znVar.e)) {
                                j11 = znVar.d4;
                                j3 = znVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        yh.m5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = znVar.T5;
                        if (ChatObject.isMonoForum(znVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, znVar.e)) {
                                j12 = znVar.d4;
                                j3 = znVar.T5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        yh.m5.y(i14, false).C(j13, j14, new eh(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (znVar.bb == null) {
                            zn.I1(znVar);
                            return;
                        } else {
                            znVar.p9();
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
                        boolean z10 = znVar.f6 > 0;
                        znVar.h9();
                        znVar.Cc(0, true);
                        znVar.ad(false);
                        MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList2, new mj(0, this, z10));
                        return;
                    }
                    if (i10 == 13) {
                        if (znVar.getParentActivity() == null) {
                            return;
                        }
                        znVar.showDialog(org.telegram.ui.Components.g5.U(znVar.getParentActivity(), znVar.h, znVar.ea).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (znVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(znVar.e)) {
                            if (znVar.d4 == 0 || (user2 = znVar.getMessagesController().getUser(Long.valueOf(znVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.g5.q(znVar, -1, user2, znVar.e, true, new o(i22, this, user2), znVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = znVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || znVar.h != null || (((user = znVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(znVar.f)) && ((chatFull = znVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.g5.r(znVar, i10 == 15, znVar.e, znVar.f, znVar.h == null ? 0 : 1, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.g5.q(znVar, -1, znVar.f, znVar.e, z12, new nj(this, z12), znVar.getResourceProvider());
                            return;
                        }
                    }
                    int i25 = 17;
                    if (i10 == 17) {
                        if (znVar.f == null || znVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = znVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            znVar.vb(null, ((Integer) znVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", znVar.f.id);
                        bundle.putBoolean("addContact", true);
                        znVar.presentFragment(new qs(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        znVar.fc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            znVar.getMediaDataController().installShortcut(znVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(znVar.e)) {
                            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.T5));
                            return;
                        }
                        v5 v5Var = new v5(znVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = znVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        znVar.presentFragment(v5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i26 = c41.v;
                        int currentAccount = znVar.getCurrentAccount();
                        Activity parentActivity = znVar.getParentActivity();
                        long a2 = znVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        c41.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i27 = 0; i27 < 2; i27++) {
                            for (int i28 = 0; i28 < sparseArrayArr[i27].size(); i28++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i27].valueAt(i28);
                                znVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !znVar.Z5);
                            }
                        }
                        znVar.C7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i29 = 1; i29 >= 0; i29--) {
                            if (messageObject == null && sparseArrayArr3[i29].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < sparseArrayArr3[i29].size(); i30++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i29].keyAt(i30)));
                                }
                                messageObject = (MessageObject) znVar.o6[i29].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i29].clear();
                            sparseArrayArr2[i29].clear();
                            sparseArrayArr[i29].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            znVar.bc(messageObject, false);
                        } else {
                            znVar.d5 = messageObject;
                            znVar.Fa(109);
                            r92 = 0;
                        }
                        znVar.h9();
                        znVar.Cc(r92, true);
                        znVar.ad(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        hg.b2 c10 = hg.c2.f(i12).c(znVar.M8());
                        Activity parentActivity2 = znVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        hg.z1.d0(parentActivity2, i13, znVar.Q3, c10, znVar.getResourceProvider(), new pc(9, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.a, znVar.getResourceProvider(), true, true);
                        f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        f1Var.setOnClickListener(new a(this, i22));
                        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
                        org.telegram.ui.ActionBar.y yVar = znVar.e0;
                        yVar.a();
                        v0Var.M(f1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        znVar.qa(znVar.J9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        znVar.getMessagesController().getTranslateController().setHideTranslateDialog(znVar.a(), false, true);
                        if (znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a(), true)) {
                            return;
                        }
                        znVar.Uc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (znVar.f == null || znVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = znVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = znVar.a8;
                        org.telegram.ui.Components.voip.f2.m(user4, z13, userFull != null && userFull.video_calls_available, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f.id), znVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        ok okVar = znVar.Y;
                        if (okVar == null || okVar.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        ok okVar2 = znVar.Y;
                        if (okVar2 == null || okVar2.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        ok okVar3 = znVar.Y;
                        if (okVar3 == null || okVar3.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        ok okVar4 = znVar.Y;
                        if (okVar4 == null || okVar4.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        ok okVar5 = znVar.Y;
                        if (okVar5 == null || okVar5.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        ok okVar6 = znVar.Y;
                        if (okVar6 == null || okVar6.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        ok okVar7 = znVar.Y;
                        if (okVar7 == null || okVar7.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        ok okVar8 = znVar.Y;
                        if (okVar8 == null || okVar8.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        ok okVar9 = znVar.Y;
                        if (okVar9 == null || okVar9.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        ok okVar10 = znVar.Y;
                        if (okVar10 == null || okVar10.getEditField() == null) {
                            return;
                        }
                        znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                        znVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        znVar.Bb();
                        return;
                    }
                    if (i10 == 60) {
                        if (znVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                        long j15 = znVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = znVar.c4;
                        int i31 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i31, true);
                        znVar.Vc();
                        znVar.lc(false);
                        znVar.Uc(true);
                        return;
                    }
                    if (i10 == 61) {
                        fg1.I0(znVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(znVar.P3.link);
                        org.telegram.ui.Components.ad.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.lj
                            public final /* synthetic */ oj b;

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
                                        oj ojVar = this.b;
                                        ojVar.getClass();
                                        zn znVar2 = ojVar.b;
                                        Intent intent = new Intent(znVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", znVar2.P3.link);
                                        znVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (znVar.Y.v()) {
                            znVar.Ab(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = znVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = znVar.P3;
                        e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                        hg.w.b0(parentActivity3, i11, tL_businessChatLink, e6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, i25));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        bf1 a02 = bf1.a0(-znVar.T5, 0L);
                        a02.y = znVar;
                        znVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        znVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = i4.b1;
                            org.telegram.ui.Components.ad.a0(znVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = znVar.e;
                if (chat != null) {
                    znVar.presentFragment(zn.W9(-chat.linked_monoforum_id));
                }
            } else if (znVar.getParentActivity() != null) {
                znVar.I7(null, null, false);
            }
        }
    }
}
