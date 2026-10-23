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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sn b;

    public fj(sn snVar, Context context) {
        this.b = snVar;
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
        org.telegram.ui.ActionBar.g6 g6Var;
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
        SparseArray[] sparseArrayArr = snVar.k6;
        SparseArray[] sparseArrayArr2 = snVar.j6;
        SparseArray[] sparseArrayArr3 = snVar.i6;
        long j10 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (snVar.Kc.f) {
                snVar.xa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            if (kVar.s()) {
                snVar.C7(false);
                return;
            }
            if (snVar.d4 == 5 && (snVar.G6.isEmpty() || snVar.p4 == 0)) {
                snVar.Wb();
            } else if (snVar.d4 == 6 && snVar.Y.u()) {
                snVar.Cb(new Runnable(this) { // from class: org.telegram.ui.cj
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
                                sn snVar2 = fjVar.b;
                                Intent intent = new Intent(snVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", snVar2.b4.link);
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
                if (snVar.getUserConfig().getClientUserId() == snVar.f6) {
                    snVar.getMessagesController().setSavedViewAs(true);
                    snVar.m1.e(false, true);
                    return;
                } else {
                    snVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-snVar.f6, false);
                    ye1.H0(snVar);
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
                    if (snVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = i19; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) sn.I8(messageObject2, arrayList.size() != 1 && ((user3 = snVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i20--;
                    i19 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    snVar.T7();
                    snVar.K3.j(58, 0L, null);
                }
                snVar.C7(false);
                return;
            }
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
                        long j12 = snVar.f6;
                        if (ChatObject.isMonoForum(snVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, snVar.e)) {
                                j12 = snVar.p4;
                                j10 = snVar.f6;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        ai.ha.y(i16, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = snVar.f6;
                        if (ChatObject.isMonoForum(snVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, snVar.e)) {
                                j13 = snVar.p4;
                                j10 = snVar.f6;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i14 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        ai.ha.y(i14, false).C(j14, j15, new ai.q5(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (snVar.nb == null) {
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
                        boolean z10 = snVar.r6 > 0;
                        snVar.h9();
                        snVar.Fc(0, true);
                        snVar.dd(false);
                        MediaController.saveFilesFromMessages(snVar.getParentActivity(), snVar.getAccountInstance(), arrayList2, new dj(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (snVar.getParentActivity() == null) {
                            return;
                        }
                        snVar.showDialog(org.telegram.ui.Components.f5.V(snVar.getParentActivity(), snVar.h, snVar.qa).a);
                        return;
                    }
                    int i26 = 16;
                    int i27 = 15;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (snVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(snVar.e)) {
                            if (snVar.p4 == 0 || (user2 = snVar.getMessagesController().getUser(Long.valueOf(snVar.p4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.f5.r(snVar, -1, user2, snVar.e, true, new m4.w0(i26, this, user2), snVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = snVar.l8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || snVar.h != null || (((user = snVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(snVar.f)) && ((chatFull = snVar.l8) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.f5.s(snVar, i10 == 15, snVar.e, snVar.f, snVar.h != null, true, false, z11, new i2.r(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.f5.r(snVar, -1, snVar.f, snVar.e, z12, new ej(this, z12), snVar.getResourceProvider());
                            return;
                        }
                    }
                    int i28 = 17;
                    if (i10 == 17) {
                        if (snVar.f == null || snVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = snVar.X1;
                        if (textView != null && textView.getTag() != null) {
                            snVar.xb(null, ((Integer) snVar.X1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", snVar.f.id);
                        bundle.putBoolean("addContact", true);
                        snVar.presentFragment(new hs(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        snVar.hc(false);
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
                            snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.f6));
                            return;
                        }
                        y5 y5Var = new y5(snVar.f6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = snVar.P1;
                        y5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.R, y5Var.T, new q5(y5Var, 0));
                        }
                        snVar.presentFragment(y5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i29 = s21.w;
                        int currentAccount = snVar.getCurrentAccount();
                        Activity parentActivity = snVar.getParentActivity();
                        long a2 = snVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        s21.N(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i30 = 0; i30 < 2; i30++) {
                            for (int i31 = 0; i31 < sparseArrayArr[i30].size(); i31++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i30].valueAt(i31);
                                snVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !snVar.l6);
                            }
                        }
                        snVar.C7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i32 = 1; i32 >= 0; i32--) {
                            if (messageObject == null && sparseArrayArr3[i32].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i33 = 0; i33 < sparseArrayArr3[i32].size(); i33++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i32].keyAt(i33)));
                                }
                                messageObject = (MessageObject) snVar.A6[i32].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i32].clear();
                            sparseArrayArr2[i32].clear();
                            sparseArrayArr[i32].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            snVar.dc(messageObject, false);
                        } else {
                            snVar.p5 = messageObject;
                            snVar.Fa(109);
                            r92 = 0;
                        }
                        snVar.h9();
                        snVar.Fc(r92, true);
                        snVar.dd(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        ig.y1 c10 = ig.z1.f(i12).c(snVar.M8());
                        Activity parentActivity2 = snVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        ig.w1.d0(parentActivity2, i13, snVar.c4, c10, snVar.getResourceProvider(), new org.telegram.ui.ActionBar.m3(i27, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.a, snVar.getResourceProvider(), true, true);
                        e1Var.j(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        e1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
                        org.telegram.ui.ActionBar.x xVar = snVar.e0;
                        xVar.a();
                        u0Var.M(e1Var, xVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", snVar.f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", snVar.f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                        snVar.Xc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (snVar.f == null || snVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = snVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = snVar.m8;
                        org.telegram.ui.Components.voip.d2.m(user4, z13, userFull != null && userFull.video_calls_available, snVar.getParentActivity(), snVar.getMessagesController().getUserFull(snVar.f.id), snVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        gk gkVar = snVar.Y;
                        if (gkVar == null || gkVar.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        gk gkVar2 = snVar.Y;
                        if (gkVar2 == null || gkVar2.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        gk gkVar3 = snVar.Y;
                        if (gkVar3 == null || gkVar3.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        gk gkVar4 = snVar.Y;
                        if (gkVar4 == null || gkVar4.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        gk gkVar5 = snVar.Y;
                        if (gkVar5 == null || gkVar5.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        gk gkVar6 = snVar.Y;
                        if (gkVar6 == null || gkVar6.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        gk gkVar7 = snVar.Y;
                        if (gkVar7 == null || gkVar7.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        gk gkVar8 = snVar.Y;
                        if (gkVar8 == null || gkVar8.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        gk gkVar9 = snVar.Y;
                        if (gkVar9 == null || gkVar9.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        gk gkVar10 = snVar.Y;
                        if (gkVar10 == null || gkVar10.getEditField() == null) {
                            return;
                        }
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        snVar.Db();
                        return;
                    }
                    if (i10 == 60) {
                        if (snVar.o4 == null) {
                            return;
                        }
                        TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                        long j16 = snVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = snVar.o4;
                        int i34 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i34, true);
                        snVar.Yc();
                        snVar.oc(false);
                        snVar.Xc(true);
                        return;
                    }
                    if (i10 == 61) {
                        ye1.H0(snVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(snVar.b4.link);
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
                                        sn snVar2 = fjVar.b;
                                        Intent intent = new Intent(snVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", snVar2.b4.link);
                                        snVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (snVar.Y.u()) {
                            snVar.Cb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = snVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = snVar.b4;
                        g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                        ig.v.b0(parentActivity3, i11, tL_businessChatLink, g6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, i28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(c2Var);
                        TextView textView2 = (TextView) c2Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, snVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        td1 a02 = td1.a0(-snVar.f6, 0L);
                        a02.y = snVar;
                        snVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        snVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = k4.c1;
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
