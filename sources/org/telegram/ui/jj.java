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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xn b;

    public jj(xn xnVar, Context context) {
        this.b = xnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i13;
        int i14;
        ?? r92;
        int i15;
        int i16;
        int i17;
        int i18;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.b;
        SparseArray[] sparseArrayArr = xnVar.V5;
        SparseArray[] sparseArrayArr2 = xnVar.U5;
        SparseArray[] sparseArrayArr3 = xnVar.T5;
        long j10 = 0;
        final int i19 = 1;
        final int i20 = 0;
        if (i10 == -1) {
            if (xnVar.tc.f) {
                xnVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (kVar.s()) {
                xnVar.z7(false);
                return;
            }
            if (xnVar.O3 == 5 && (xnVar.r6.isEmpty() || xnVar.a4 == 0)) {
                xnVar.Qb();
            } else if (xnVar.O3 == 6 && xnVar.V.w()) {
                xnVar.wb(new Runnable(this) { // from class: org.telegram.ui.gj
                    public final /* synthetic */ jj b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i20) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                jj jjVar = this.b;
                                jjVar.getClass();
                                xn xnVar2 = jjVar.b;
                                Intent intent = new Intent(xnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", xnVar2.M3.link);
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
                if (xnVar.getUserConfig().getClientUserId() == xnVar.Q5) {
                    xnVar.getMessagesController().setSavedViewAs(true);
                    xnVar.X0.e(false, true);
                    return;
                } else {
                    xnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-xnVar.Q5, false);
                    sf1.I0(xnVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                for (int i21 = 1; i21 >= 0; i21--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i22 = 0; i22 < sparseArrayArr2[i21].size(); i22++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i21].keyAt(i22)));
                    }
                    if (xnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i21].get(((Integer) arrayList.get(i23)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) xn.D8(messageObject2, arrayList.size() != 1 && ((user3 = xnVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    xnVar.Q7();
                    xnVar.v3.j(58, 0L, null);
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
                        long j12 = xnVar.Q5;
                        if (ChatObject.isMonoForum(xnVar.e)) {
                            i18 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i18, xnVar.e)) {
                                j12 = xnVar.a4;
                                j10 = xnVar.Q5;
                            }
                        }
                        i17 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        mh.t7.y(i17, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = xnVar.Q5;
                        if (ChatObject.isMonoForum(xnVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i16, xnVar.e)) {
                                j13 = xnVar.a4;
                                j10 = xnVar.Q5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i15 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        mh.t7.y(i15, false).C(j14, j15, new mh.t3(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (xnVar.Ya == null) {
                            xn.G1(xnVar);
                            return;
                        } else {
                            xnVar.k9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i24 = 1; i24 >= 0; i24--) {
                            for (int i25 = 0; i25 < sparseArrayArr3[i24].size(); i25++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i24].valueAt(i25));
                            }
                            sparseArrayArr3[i24].clear();
                            sparseArrayArr2[i24].clear();
                            sparseArrayArr[i24].clear();
                        }
                        boolean z4 = xnVar.c6 > 0;
                        xnVar.c9();
                        xnVar.yc(0, true);
                        xnVar.Wc(false);
                        MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList2, new hj(0, this, z4));
                        return;
                    }
                    int i26 = 13;
                    if (i10 == 13) {
                        if (xnVar.getParentActivity() == null) {
                            return;
                        }
                        xnVar.showDialog(org.telegram.ui.Components.z4.V(xnVar.getParentActivity(), xnVar.h, xnVar.ba).a);
                        return;
                    }
                    int i27 = 18;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (xnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(xnVar.e)) {
                            if (xnVar.a4 == 0 || (user2 = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.a4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.z4.r(xnVar, -1, user2, xnVar.e, true, new ng.w(i27, this, user2), xnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = xnVar.W7;
                        boolean z10 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (xnVar.h != null || (((user = xnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(xnVar.f)) && ((chatFull = xnVar.W7) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.z4.s(xnVar, i10 == i11, xnVar.e, xnVar.f, xnVar.h != null, true, false, z10, new hg.m2(this, i10, z10));
                            return;
                        }
                        boolean z11 = z10;
                        org.telegram.ui.Components.z4.r(xnVar, -1, xnVar.f, xnVar.e, z11, new ij(this, z11), xnVar.getResourceProvider());
                        return;
                    }
                    int i28 = 17;
                    if (i10 == 17) {
                        if (xnVar.f == null || xnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = xnVar.I1;
                        if (textView != null && textView.getTag() != null) {
                            xnVar.rb(null, ((Integer) xnVar.I1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", xnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        xnVar.presentFragment(new os(bundle));
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
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(xnVar.e)) {
                            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.Q5));
                            return;
                        }
                        y5 y5Var = new y5(xnVar.Q5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xnVar.A1;
                        y5Var.O = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                        }
                        xnVar.presentFragment(y5Var);
                        return;
                    }
                    int i29 = 21;
                    if (i10 == 21) {
                        int i30 = q31.v;
                        int currentAccount = xnVar.getCurrentAccount();
                        Activity parentActivity = xnVar.getParentActivity();
                        long a2 = xnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        q31.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i31 = 0; i31 < 2; i31++) {
                            for (int i32 = 0; i32 < sparseArrayArr[i31].size(); i32++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i31].valueAt(i32);
                                xnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !xnVar.W5);
                            }
                        }
                        xnVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i33 = 1; i33 >= 0; i33--) {
                            if (messageObject == null && sparseArrayArr3[i33].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i34 = 0; i34 < sparseArrayArr3[i33].size(); i34++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i33].keyAt(i34)));
                                }
                                messageObject = (MessageObject) xnVar.l6[i33].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i33].clear();
                            sparseArrayArr2[i33].clear();
                            sparseArrayArr[i33].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            xnVar.Xb(messageObject, false);
                        } else {
                            xnVar.a5 = messageObject;
                            xnVar.Ba(109);
                            r92 = 0;
                        }
                        xnVar.c9();
                        xnVar.yc(r92, true);
                        xnVar.Wc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        vf.o1 c3 = vf.p1.f(i13).c(xnVar.H8());
                        Activity parentActivity2 = xnVar.getParentActivity();
                        i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        vf.m1.d0(parentActivity2, i14, xnVar.N3, c3, xnVar.getResourceProvider(), new lh.a1(i29, this, c3));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, xnVar.getResourceProvider(), true, true);
                        g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i26));
                        org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
                        org.telegram.ui.ActionBar.y yVar = xnVar.b0;
                        yVar.a();
                        w0Var.M(g1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                        boolean z12 = i10 == 33;
                        TLRPC.UserFull userFull = xnVar.X7;
                        org.telegram.ui.Components.voip.g2.m(user4, z12, userFull != null && userFull.video_calls_available, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f.id), xnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        jk jkVar = xnVar.V;
                        if (jkVar == null || jkVar.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        jk jkVar2 = xnVar.V;
                        if (jkVar2 == null || jkVar2.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        jk jkVar3 = xnVar.V;
                        if (jkVar3 == null || jkVar3.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        jk jkVar4 = xnVar.V;
                        if (jkVar4 == null || jkVar4.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        jk jkVar5 = xnVar.V;
                        if (jkVar5 == null || jkVar5.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        jk jkVar6 = xnVar.V;
                        if (jkVar6 == null || jkVar6.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        jk jkVar7 = xnVar.V;
                        if (jkVar7 == null || jkVar7.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        jk jkVar8 = xnVar.V;
                        if (jkVar8 == null || jkVar8.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        jk jkVar9 = xnVar.V;
                        if (jkVar9 == null || jkVar9.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        jk jkVar10 = xnVar.V;
                        if (jkVar10 == null || jkVar10.getEditField() == null) {
                            return;
                        }
                        xnVar.V.getEditField().setSelectionOverride(xnVar.x4, xnVar.y4);
                        xnVar.V.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        xnVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (xnVar.Z3 == null) {
                            return;
                        }
                        TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                        long j16 = xnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = xnVar.Z3;
                        int i35 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i35, true);
                        xnVar.Rc();
                        xnVar.hc(false);
                        xnVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        sf1.I0(xnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(xnVar.M3.link);
                        org.telegram.ui.Components.qc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.gj
                            public final /* synthetic */ jj b;

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
                                        jj jjVar = this.b;
                                        jjVar.getClass();
                                        xn xnVar2 = jjVar.b;
                                        Intent intent = new Intent(xnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", xnVar2.M3.link);
                                        xnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (xnVar.V.w()) {
                            xnVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = xnVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = xnVar.M3;
                        g6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                        vf.q.b0(parentActivity3, i12, tL_businessChatLink, g6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, i28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xnVar.showDialog(d2Var);
                        TextView textView2 = (TextView) d2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        oe1 a02 = oe1.a0(-xnVar.Q5, 0L);
                        a02.y = xnVar;
                        xnVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        xnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = l4.Y0;
                            org.telegram.ui.Components.qc.a0(xnVar).t("No rich message copied", null).j();
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
