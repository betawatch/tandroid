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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yn b;

    public lj(yn ynVar, Context context) {
        this.b = ynVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v23 */
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
        yn ynVar = this.b;
        SparseArray[] sparseArrayArr = ynVar.W5;
        SparseArray[] sparseArrayArr2 = ynVar.V5;
        SparseArray[] sparseArrayArr3 = ynVar.U5;
        long j3 = 0;
        final int i18 = 1;
        final int i19 = 0;
        if (i10 == -1) {
            if (ynVar.tc.f) {
                ynVar.sa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            if (kVar.s()) {
                ynVar.z7(false);
                return;
            }
            if (ynVar.P3 == 5 && (ynVar.s6.isEmpty() || ynVar.b4 == 0)) {
                ynVar.Pb();
            } else if (ynVar.P3 == 6 && ynVar.W.w()) {
                ynVar.vb(new Runnable(this) { // from class: org.telegram.ui.ij
                    public final /* synthetic */ lj b;

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
                                lj ljVar = this.b;
                                ljVar.getClass();
                                yn ynVar2 = ljVar.b;
                                Intent intent = new Intent(ynVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", ynVar2.N3.link);
                                ynVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!ynVar.X6(true, true)) {
                ynVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (ynVar.getUserConfig().getClientUserId() == ynVar.R5) {
                    ynVar.getMessagesController().setSavedViewAs(true);
                    ynVar.Y0.e(false, true);
                    return;
                } else {
                    ynVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-ynVar.R5, false);
                    wf1.I0(ynVar);
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
                    if (ynVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) yn.E8(messageObject2, arrayList.size() != 1 && ((user3 = ynVar.f) == null || !user3.self), j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    ynVar.Q7();
                    ynVar.w3.j(58, 0L, null);
                }
                ynVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    ynVar.aa(true);
                    return;
                }
                if (i10 == 69) {
                    yn.B1(ynVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = ynVar.R5;
                        if (ChatObject.isMonoForum(ynVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i17, ynVar.e)) {
                                j11 = ynVar.b4;
                                j3 = ynVar.R5;
                            }
                        }
                        i16 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                        yh.u5.y(i16, false).i0(j11, j3, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = ynVar.R5;
                        if (ChatObject.isMonoForum(ynVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i15, ynVar.e)) {
                                j12 = ynVar.b4;
                                j3 = ynVar.R5;
                            }
                        }
                        long j13 = j12;
                        long j14 = j3;
                        i14 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                        yh.u5.y(i14, false).C(j13, j14, new kg(this, j13, j14, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (ynVar.Ya == null) {
                            yn.G1(ynVar);
                            return;
                        } else {
                            ynVar.l9();
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
                        boolean z10 = ynVar.d6 > 0;
                        ynVar.d9();
                        ynVar.xc(0, true);
                        ynVar.Vc(false);
                        MediaController.saveFilesFromMessages(ynVar.getParentActivity(), ynVar.getAccountInstance(), arrayList2, new jj(0, this, z10));
                        return;
                    }
                    int i25 = 13;
                    if (i10 == 13) {
                        if (ynVar.getParentActivity() == null) {
                            return;
                        }
                        ynVar.showDialog(org.telegram.ui.Components.e5.V(ynVar.getParentActivity(), ynVar.h, ynVar.ca).a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (ynVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(ynVar.e)) {
                            if (ynVar.b4 == 0 || (user2 = ynVar.getMessagesController().getUser(Long.valueOf(ynVar.b4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.e5.r(ynVar, -1, user2, ynVar.e, true, new o(i25, this, user2), ynVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = ynVar.X7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26 && (i10 != 15 || ynVar.h != null || (((user = ynVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(ynVar.f)) && ((chatFull = ynVar.X7) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.e5.s(ynVar, i10 == 15, ynVar.e, ynVar.f, ynVar.h != null, true, false, z11, new i2.s(this, i10, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.e5.r(ynVar, -1, ynVar.f, ynVar.e, z12, new kj(this, z12), ynVar.getResourceProvider());
                            return;
                        }
                    }
                    if (i10 == 17) {
                        if (ynVar.f == null || ynVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = ynVar.J1;
                        if (textView != null && textView.getTag() != null) {
                            ynVar.qb(null, ((Integer) ynVar.J1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", ynVar.f.id);
                        bundle.putBoolean("addContact", true);
                        ynVar.presentFragment(new qs(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        ynVar.ac(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            ynVar.getMediaDataController().installShortcut(ynVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(ynVar.e)) {
                            ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(ynVar.R5));
                            return;
                        }
                        w5 w5Var = new w5(ynVar.R5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ynVar.B1;
                        w5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                        }
                        ynVar.presentFragment(w5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i26 = t31.v;
                        int currentAccount = ynVar.getCurrentAccount();
                        Activity parentActivity = ynVar.getParentActivity();
                        long a2 = ynVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        t31.I(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i27 = 0; i27 < 2; i27++) {
                            for (int i28 = 0; i28 < sparseArrayArr[i27].size(); i28++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i27].valueAt(i28);
                                ynVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !ynVar.X5);
                            }
                        }
                        ynVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i29 = 1; i29 >= 0; i29--) {
                            if (messageObject == null && sparseArrayArr3[i29].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < sparseArrayArr3[i29].size(); i30++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i29].keyAt(i30)));
                                }
                                messageObject = (MessageObject) ynVar.m6[i29].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i29].clear();
                            sparseArrayArr2[i29].clear();
                            sparseArrayArr[i29].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            ynVar.Wb(messageObject, false);
                        } else {
                            ynVar.b5 = messageObject;
                            ynVar.Aa(109);
                            r92 = 0;
                        }
                        ynVar.d9();
                        ynVar.xc(r92, true);
                        ynVar.Vc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                        hg.a2 c10 = hg.b2.f(i12).c(ynVar.I8());
                        Activity parentActivity2 = ynVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                        hg.y1.d0(parentActivity2, i13, ynVar.O3, c10, ynVar.getResourceProvider(), new qc(9, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.a, ynVar.getResourceProvider(), true, true);
                        f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        f1Var.setOnClickListener(new a(this, i25));
                        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
                        org.telegram.ui.ActionBar.y yVar = ynVar.c0;
                        yVar.a();
                        v0Var.M(f1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        ynVar.ka(ynVar.D9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        ynVar.getMessagesController().getTranslateController().setHideTranslateDialog(ynVar.a(), false, true);
                        if (ynVar.getMessagesController().getTranslateController().toggleTranslatingDialog(ynVar.a(), true)) {
                            return;
                        }
                        ynVar.Pc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (ynVar.f == null || ynVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = ynVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = ynVar.Y7;
                        org.telegram.ui.Components.voip.g2.m(user4, z13, userFull != null && userFull.video_calls_available, ynVar.getParentActivity(), ynVar.getMessagesController().getUserFull(ynVar.f.id), ynVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        jk jkVar = ynVar.W;
                        if (jkVar == null || jkVar.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        jk jkVar2 = ynVar.W;
                        if (jkVar2 == null || jkVar2.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        jk jkVar3 = ynVar.W;
                        if (jkVar3 == null || jkVar3.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        jk jkVar4 = ynVar.W;
                        if (jkVar4 == null || jkVar4.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        jk jkVar5 = ynVar.W;
                        if (jkVar5 == null || jkVar5.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        jk jkVar6 = ynVar.W;
                        if (jkVar6 == null || jkVar6.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        jk jkVar7 = ynVar.W;
                        if (jkVar7 == null || jkVar7.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        jk jkVar8 = ynVar.W;
                        if (jkVar8 == null || jkVar8.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        jk jkVar9 = ynVar.W;
                        if (jkVar9 == null || jkVar9.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        jk jkVar10 = ynVar.W;
                        if (jkVar10 == null || jkVar10.getEditField() == null) {
                            return;
                        }
                        ynVar.W.getEditField().setSelectionOverride(ynVar.y4, ynVar.z4);
                        ynVar.W.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        ynVar.wb();
                        return;
                    }
                    if (i10 == 60) {
                        if (ynVar.a4 == null) {
                            return;
                        }
                        TopicsController topicsController = ynVar.getMessagesController().getTopicsController();
                        long j15 = ynVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = ynVar.a4;
                        int i31 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i31, true);
                        ynVar.Qc();
                        ynVar.gc(false);
                        ynVar.Pc(true);
                        return;
                    }
                    if (i10 == 61) {
                        wf1.I0(ynVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(ynVar.N3.link);
                        org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.ij
                            public final /* synthetic */ lj b;

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
                                        lj ljVar = this.b;
                                        ljVar.getClass();
                                        yn ynVar2 = ljVar.b;
                                        Intent intent = new Intent(ynVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", ynVar2.N3.link);
                                        ynVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (ynVar.W.w()) {
                            ynVar.vb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = ynVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = ynVar.N3;
                        d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                        hg.w.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 19));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ynVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        se1 Z = se1.Z(-ynVar.R5, 0L);
                        Z.y = ynVar;
                        ynVar.presentFragment(Z);
                        return;
                    } else if (i10 == 888) {
                        ynVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = i4.b1;
                            org.telegram.ui.Components.yc.a0(ynVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = ynVar.e;
                if (chat != null) {
                    ynVar.presentFragment(yn.Q9(-chat.linked_monoforum_id));
                }
            } else if (ynVar.getParentActivity() != null) {
                ynVar.F7(null, null, false);
            }
        }
    }
}
