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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bo b;

    public oj(bo boVar, Context context) {
        this.b = boVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v18 */
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
        bo boVar = this.b;
        SparseArray[] sparseArrayArr = boVar.Y5;
        SparseArray[] sparseArrayArr2 = boVar.X5;
        SparseArray[] sparseArrayArr3 = boVar.W5;
        long j3 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (boVar.vc.f) {
                boVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
            if (kVar.s()) {
                boVar.z7(false);
                return;
            }
            if (boVar.R3 == 5 && (boVar.u6.isEmpty() || boVar.d4 == 0)) {
                boVar.Qb();
            } else if (boVar.R3 == 6 && boVar.Y.x()) {
                boVar.wb(new Runnable(this) { // from class: org.telegram.ui.lj
                    public final /* synthetic */ oj b;

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
                                oj ojVar = this.b;
                                ojVar.getClass();
                                bo boVar2 = ojVar.b;
                                Intent intent = new Intent(boVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", boVar2.P3.link);
                                boVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!boVar.X6(true, true)) {
                boVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (boVar.getUserConfig().getClientUserId() == boVar.T5) {
                    boVar.getMessagesController().setSavedViewAs(true);
                    boVar.a1.e(false, true);
                    return;
                } else {
                    boVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-boVar.T5, false);
                    fg1.I0(boVar);
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
                    if (boVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) bo.D8(messageObject2, arrayList.size() != 1 && ((user3 = boVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    boVar.Q7();
                    boVar.y3.j(58, 0L, null);
                }
                boVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    boVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    bo.B1(boVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = boVar.T5;
                        if (ChatObject.isMonoForum(boVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, boVar.e)) {
                                j11 = boVar.d4;
                                j3 = boVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                        yh.v5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = boVar.T5;
                        if (ChatObject.isMonoForum(boVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, boVar.e)) {
                                j12 = boVar.d4;
                                j3 = boVar.T5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                        yh.v5.y(i14, false).C(j13, j14, new ng(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (boVar.ab == null) {
                            bo.G1(boVar);
                            return;
                        } else {
                            boVar.k9();
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
                        boolean z10 = boVar.f6 > 0;
                        boVar.c9();
                        boVar.yc(0, true);
                        boVar.Wc(false);
                        MediaController.saveFilesFromMessages(boVar.getParentActivity(), boVar.getAccountInstance(), arrayList2, new mj(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (boVar.getParentActivity() == null) {
                            return;
                        }
                        boVar.showDialog(org.telegram.ui.Components.c5.V(boVar.getParentActivity(), boVar.h, boVar.ea).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (boVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(boVar.e)) {
                            if (boVar.d4 == 0 || (user2 = boVar.getMessagesController().getUser(Long.valueOf(boVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.c5.r(boVar, -1, user2, boVar.e, true, new x5(9, this, user2), boVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = boVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || boVar.h != null || (((user = boVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(boVar.f)) && ((chatFull = boVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.c5.s(boVar, i10 == 15, boVar.e, boVar.f, boVar.h != null, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.c5.r(boVar, -1, boVar.f, boVar.e, z12, new nj(this, z12), boVar.getResourceProvider());
                            return;
                        }
                    }
                    if (i10 == 17) {
                        if (boVar.f == null || boVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = boVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            boVar.rb(null, ((Integer) boVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", boVar.f.id);
                        bundle.putBoolean("addContact", true);
                        boVar.presentFragment(new us(bundle));
                        return;
                    }
                    int i26 = 18;
                    if (i10 == 18) {
                        boVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            boVar.getMediaDataController().installShortcut(boVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(boVar.e)) {
                            boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(boVar.T5));
                            return;
                        }
                        v5 v5Var = new v5(boVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = boVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        boVar.presentFragment(v5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i27 = d41.v;
                        int currentAccount = boVar.getCurrentAccount();
                        Activity parentActivity = boVar.getParentActivity();
                        long a2 = boVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        d41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i28 = 0; i28 < 2; i28++) {
                            for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i28].valueAt(i29);
                                boVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !boVar.Z5);
                            }
                        }
                        boVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i30 = 1; i30 >= 0; i30--) {
                            if (messageObject == null && sparseArrayArr3[i30].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                }
                                messageObject = (MessageObject) boVar.o6[i30].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i30].clear();
                            sparseArrayArr2[i30].clear();
                            sparseArrayArr[i30].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            boVar.Xb(messageObject, false);
                        } else {
                            boVar.d5 = messageObject;
                            boVar.Ba(109);
                            r92 = 0;
                        }
                        boVar.c9();
                        boVar.yc(r92, true);
                        boVar.Wc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                        hg.a2 c10 = hg.b2.f(i12).c(boVar.H8());
                        Activity parentActivity2 = boVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                        hg.y1.d0(parentActivity2, i13, boVar.Q3, c10, boVar.getResourceProvider(), new pf(4, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, boVar.getResourceProvider(), true, true);
                        g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.w0 w0Var = boVar.h0;
                        org.telegram.ui.ActionBar.z zVar = boVar.e0;
                        zVar.a();
                        w0Var.M(g1Var, zVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        boVar.la(boVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        boVar.getMessagesController().getTranslateController().setHideTranslateDialog(boVar.a(), false, true);
                        if (boVar.getMessagesController().getTranslateController().toggleTranslatingDialog(boVar.a(), true)) {
                            return;
                        }
                        boVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (boVar.f == null || boVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = boVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = boVar.a8;
                        org.telegram.ui.Components.voip.f2.m(user4, z13, userFull != null && userFull.video_calls_available, boVar.getParentActivity(), boVar.getMessagesController().getUserFull(boVar.f.id), boVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        nk nkVar = boVar.Y;
                        if (nkVar == null || nkVar.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        nk nkVar2 = boVar.Y;
                        if (nkVar2 == null || nkVar2.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        nk nkVar3 = boVar.Y;
                        if (nkVar3 == null || nkVar3.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        nk nkVar4 = boVar.Y;
                        if (nkVar4 == null || nkVar4.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        nk nkVar5 = boVar.Y;
                        if (nkVar5 == null || nkVar5.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        nk nkVar6 = boVar.Y;
                        if (nkVar6 == null || nkVar6.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        nk nkVar7 = boVar.Y;
                        if (nkVar7 == null || nkVar7.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        nk nkVar8 = boVar.Y;
                        if (nkVar8 == null || nkVar8.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        nk nkVar9 = boVar.Y;
                        if (nkVar9 == null || nkVar9.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        nk nkVar10 = boVar.Y;
                        if (nkVar10 == null || nkVar10.getEditField() == null) {
                            return;
                        }
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        boVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (boVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = boVar.getMessagesController().getTopicsController();
                        long j15 = boVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = boVar.c4;
                        int i32 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i32, true);
                        boVar.Rc();
                        boVar.hc(false);
                        boVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        fg1.I0(boVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(boVar.P3.link);
                        org.telegram.ui.Components.vc.a0(LaunchActivity.R()).k(false).j();
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
                                switch (i18) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        oj ojVar = this.b;
                                        ojVar.getClass();
                                        bo boVar2 = ojVar.b;
                                        Intent intent = new Intent(boVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", boVar2.P3.link);
                                        boVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (boVar.Y.x()) {
                            boVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = boVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = boVar.P3;
                        f6Var = ((org.telegram.ui.ActionBar.o2) boVar).resourceProvider;
                        hg.v.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        boVar.showDialog(c2Var);
                        TextView textView2 = (TextView) c2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        bf1 a02 = bf1.a0(-boVar.T5, 0L);
                        a02.y = boVar;
                        boVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        boVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = h4.b1;
                            org.telegram.ui.Components.vc.a0(boVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = boVar.e;
                if (chat != null) {
                    boVar.presentFragment(bo.R9(-chat.linked_monoforum_id));
                }
            } else if (boVar.getParentActivity() != null) {
                boVar.F7(null, null, false);
            }
        }
    }
}
