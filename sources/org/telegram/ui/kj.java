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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xn b;

    public kj(xn xnVar, Context context) {
        this.b = xnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v13 */
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
        xn xnVar = this.b;
        SparseArray[] sparseArrayArr = xnVar.Y5;
        SparseArray[] sparseArrayArr2 = xnVar.X5;
        SparseArray[] sparseArrayArr3 = xnVar.W5;
        long j3 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (xnVar.vc.f) {
                xnVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
            if (kVar.s()) {
                xnVar.z7(false);
                return;
            }
            if (xnVar.R3 == 5 && (xnVar.u6.isEmpty() || xnVar.d4 == 0)) {
                xnVar.Qb();
            } else if (xnVar.R3 == 6 && xnVar.Y.x()) {
                xnVar.wb(new Runnable(this) { // from class: org.telegram.ui.hj
                    public final /* synthetic */ kj b;

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
                                kj kjVar = this.b;
                                kjVar.getClass();
                                xn xnVar2 = kjVar.b;
                                Intent intent = new Intent(xnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", xnVar2.P3.link);
                                xnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!xnVar.X6(true, true)) {
                xnVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (xnVar.getUserConfig().getClientUserId() == xnVar.T5) {
                    xnVar.getMessagesController().setSavedViewAs(true);
                    xnVar.a1.e(false, true);
                    return;
                } else {
                    xnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-xnVar.T5, false);
                    wf1.I0(xnVar);
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
                    if (xnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) xn.D8(messageObject2, arrayList.size() != 1 && ((user3 = xnVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    xnVar.Q7();
                    xnVar.y3.j(58, 0L, null);
                }
                xnVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    xnVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    xn.B1(xnVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = xnVar.T5;
                        if (ChatObject.isMonoForum(xnVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, xnVar.e)) {
                                j11 = xnVar.d4;
                                j3 = xnVar.T5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                        yh.t5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = xnVar.T5;
                        if (ChatObject.isMonoForum(xnVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, xnVar.e)) {
                                j12 = xnVar.d4;
                                j3 = xnVar.T5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                        yh.t5.y(i14, false).C(j13, j14, new jg(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (xnVar.ab == null) {
                            xn.G1(xnVar);
                            return;
                        } else {
                            xnVar.k9();
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
                        boolean z10 = xnVar.f6 > 0;
                        xnVar.c9();
                        xnVar.yc(0, true);
                        xnVar.Wc(false);
                        MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList2, new ij(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (xnVar.getParentActivity() == null) {
                            return;
                        }
                        xnVar.showDialog(org.telegram.ui.Components.e5.V(xnVar.getParentActivity(), xnVar.h, xnVar.ea).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (xnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(xnVar.e)) {
                            if (xnVar.d4 == 0 || (user2 = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.d4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.e5.r(xnVar, -1, user2, xnVar.e, true, new u(11, this, user2), xnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = xnVar.Z7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || xnVar.h != null || (((user = xnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(xnVar.f)) && ((chatFull = xnVar.Z7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.e5.s(xnVar, i10 == 15, xnVar.e, xnVar.f, xnVar.h != null, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.e5.r(xnVar, -1, xnVar.f, xnVar.e, z12, new jj(this, z12), xnVar.getResourceProvider());
                            return;
                        }
                    }
                    int i26 = 17;
                    if (i10 == 17) {
                        if (xnVar.f == null || xnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = xnVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            xnVar.rb(null, ((Integer) xnVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", xnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        xnVar.presentFragment(new ns(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        xnVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            xnVar.getMediaDataController().installShortcut(xnVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(xnVar.e)) {
                            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.T5));
                            return;
                        }
                        w5 w5Var = new w5(xnVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xnVar.D1;
                        w5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                        }
                        xnVar.presentFragment(w5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i27 = u31.v;
                        int currentAccount = xnVar.getCurrentAccount();
                        Activity parentActivity = xnVar.getParentActivity();
                        long a2 = xnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        u31.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i28 = 0; i28 < 2; i28++) {
                            for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i28].valueAt(i29);
                                xnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !xnVar.Z5);
                            }
                        }
                        xnVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i30 = 1; i30 >= 0; i30--) {
                            if (messageObject == null && sparseArrayArr3[i30].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                }
                                messageObject = (MessageObject) xnVar.o6[i30].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i30].clear();
                            sparseArrayArr2[i30].clear();
                            sparseArrayArr[i30].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            xnVar.Xb(messageObject, false);
                        } else {
                            xnVar.d5 = messageObject;
                            xnVar.Ba(109);
                            r92 = 0;
                        }
                        xnVar.c9();
                        xnVar.yc(r92, true);
                        xnVar.Wc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                        hg.b2 c10 = hg.c2.f(i12).c(xnVar.H8());
                        Activity parentActivity2 = xnVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                        hg.z1.d0(parentActivity2, i13, xnVar.Q3, c10, xnVar.getResourceProvider(), new oc(9, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.a, xnVar.getResourceProvider(), true, true);
                        f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        f1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
                        org.telegram.ui.ActionBar.y yVar = xnVar.e0;
                        yVar.a();
                        v0Var.M(f1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        xnVar.la(xnVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        xnVar.getMessagesController().getTranslateController().setHideTranslateDialog(xnVar.a(), false, true);
                        if (xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a(), true)) {
                            return;
                        }
                        xnVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (xnVar.f == null || xnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = xnVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = xnVar.a8;
                        org.telegram.ui.Components.voip.f2.m(user4, z13, userFull != null && userFull.video_calls_available, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f.id), xnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        jk jkVar = xnVar.Y;
                        if (jkVar == null || jkVar.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        jk jkVar2 = xnVar.Y;
                        if (jkVar2 == null || jkVar2.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        jk jkVar3 = xnVar.Y;
                        if (jkVar3 == null || jkVar3.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        jk jkVar4 = xnVar.Y;
                        if (jkVar4 == null || jkVar4.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        jk jkVar5 = xnVar.Y;
                        if (jkVar5 == null || jkVar5.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        jk jkVar6 = xnVar.Y;
                        if (jkVar6 == null || jkVar6.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        jk jkVar7 = xnVar.Y;
                        if (jkVar7 == null || jkVar7.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        jk jkVar8 = xnVar.Y;
                        if (jkVar8 == null || jkVar8.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        jk jkVar9 = xnVar.Y;
                        if (jkVar9 == null || jkVar9.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        jk jkVar10 = xnVar.Y;
                        if (jkVar10 == null || jkVar10.getEditField() == null) {
                            return;
                        }
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        xnVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (xnVar.c4 == null) {
                            return;
                        }
                        TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                        long j15 = xnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = xnVar.c4;
                        int i32 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i32, true);
                        xnVar.Rc();
                        xnVar.hc(false);
                        xnVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        wf1.I0(xnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(xnVar.P3.link);
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
                                switch (i18) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        kj kjVar = this.b;
                                        kjVar.getClass();
                                        xn xnVar2 = kjVar.b;
                                        Intent intent = new Intent(xnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", xnVar2.P3.link);
                                        xnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (xnVar.Y.x()) {
                            xnVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = xnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = xnVar.P3;
                        d6Var = ((org.telegram.ui.ActionBar.n2) xnVar).resourceProvider;
                        hg.x.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xnVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        se1 a02 = se1.a0(-xnVar.T5, 0L);
                        a02.y = xnVar;
                        xnVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        xnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = i4.b1;
                            org.telegram.ui.Components.xc.a0(xnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = xnVar.e;
                if (chat != null) {
                    xnVar.presentFragment(xn.R9(-chat.linked_monoforum_id));
                }
            } else if (xnVar.getParentActivity() != null) {
                xnVar.F7(null, null, false);
            }
        }
    }
}
