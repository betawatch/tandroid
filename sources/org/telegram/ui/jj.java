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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wn b;

    public jj(wn wnVar, Context context) {
        this.b = wnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i13;
        int i14;
        ?? r92;
        int i15;
        int i16;
        int i17;
        int i18;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.b;
        SparseArray[] sparseArrayArr = wnVar.o6;
        SparseArray[] sparseArrayArr2 = wnVar.n6;
        SparseArray[] sparseArrayArr3 = wnVar.m6;
        long j10 = 0;
        final int i19 = 0;
        if (i10 == -1) {
            if (wnVar.Xc.f) {
                wnVar.Fa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (kVar.q()) {
                wnVar.I7(false);
                return;
            }
            if (wnVar.d4 == 5 && (wnVar.K6.isEmpty() || wnVar.p4 == 0)) {
                wnVar.gc();
            } else if (wnVar.d4 == 6 && wnVar.Y.s()) {
                wnVar.Lb(new Runnable(this) { // from class: org.telegram.ui.gj
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
                                wn wnVar2 = jjVar.b;
                                Intent intent = new Intent(wnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", wnVar2.b4.link);
                                wnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!wnVar.g7(true, true)) {
                wnVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (wnVar.getUserConfig().getClientUserId() == wnVar.j6) {
                    wnVar.getMessagesController().setSavedViewAs(true);
                    wnVar.m1.e(false, true);
                    return;
                } else {
                    wnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-wnVar.j6, false);
                    cf1.I0(wnVar);
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
                    if (wnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = i19; i22 < arrayList.size(); i22++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) wn.P8(messageObject2, arrayList.size() != 1 && ((user3 = wnVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i20--;
                    i19 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    wnVar.Z7();
                    wnVar.K3.j(58, 0L, null);
                }
                wnVar.I7(false);
                return;
            }
            int i23 = 12;
            if (i10 != 12) {
                if (i10 == 11) {
                    wnVar.oa(true);
                    return;
                }
                if (i10 == 69) {
                    wn.F1(wnVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = wnVar.j6;
                        if (ChatObject.isMonoForum(wnVar.e)) {
                            i18 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i18, wnVar.e)) {
                                j12 = wnVar.p4;
                                j10 = wnVar.j6;
                            }
                        }
                        i17 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        bi.ca.y(i17, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = wnVar.j6;
                        if (ChatObject.isMonoForum(wnVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i16, wnVar.e)) {
                                j13 = wnVar.p4;
                                j10 = wnVar.j6;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i15 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        bi.ca.y(i15, false).C(j14, j15, new bi.l5(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (wnVar.Ab == null) {
                            wn.L1(wnVar);
                            return;
                        } else {
                            wnVar.x9();
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
                        boolean z10 = wnVar.v6 > 0;
                        wnVar.p9();
                        wnVar.Pc(0, true);
                        wnVar.nd(false);
                        MediaController.saveFilesFromMessages(wnVar.getParentActivity(), wnVar.getAccountInstance(), arrayList2, new hj(0, this, z10));
                        return;
                    }
                    if (i10 == 13) {
                        if (wnVar.getParentActivity() == null) {
                            return;
                        }
                        wnVar.showDialog(org.telegram.ui.Components.g5.U(wnVar.getParentActivity(), wnVar.h, wnVar.ua).a);
                        return;
                    }
                    int i26 = 19;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (wnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(wnVar.e)) {
                            if (wnVar.p4 == 0 || (user2 = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.p4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.g5.q(wnVar, -1, user2, wnVar.e, true, new m4.s0(i26, this, user2), wnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = wnVar.p8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (wnVar.h != null || (((user = wnVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(wnVar.f)) && ((chatFull = wnVar.p8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.g5.r(wnVar, i10 == i11, wnVar.e, wnVar.f, wnVar.h == null ? 0 : 1, true, false, z11, new i2.r(this, i10, z11));
                            return;
                        }
                        boolean z12 = z11;
                        org.telegram.ui.Components.g5.q(wnVar, -1, wnVar.f, wnVar.e, z12, new ij(this, z12), wnVar.getResourceProvider());
                        return;
                    }
                    int i27 = 17;
                    if (i10 == 17) {
                        if (wnVar.f == null || wnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = wnVar.X1;
                        if (textView != null && textView.getTag() != null) {
                            wnVar.Gb(null, ((Integer) wnVar.X1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", wnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        wnVar.presentFragment(new ls(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        wnVar.rc(false);
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
                            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.j6));
                            return;
                        }
                        x5 x5Var = new x5(wnVar.j6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wnVar.P1;
                        x5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                        }
                        wnVar.presentFragment(x5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i28 = x21.w;
                        int currentAccount = wnVar.getCurrentAccount();
                        Activity parentActivity = wnVar.getParentActivity();
                        long a2 = wnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        x21.N(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i29 = 0; i29 < 2; i29++) {
                            for (int i30 = 0; i30 < sparseArrayArr[i29].size(); i30++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i29].valueAt(i30);
                                wnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !wnVar.p6);
                            }
                        }
                        wnVar.I7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i31 = 1; i31 >= 0; i31--) {
                            if (messageObject == null && sparseArrayArr3[i31].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i32 = 0; i32 < sparseArrayArr3[i31].size(); i32++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i31].keyAt(i32)));
                                }
                                messageObject = (MessageObject) wnVar.E6[i31].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i31].clear();
                            sparseArrayArr2[i31].clear();
                            sparseArrayArr[i31].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            wnVar.nc(messageObject, false);
                        } else {
                            wnVar.t5 = messageObject;
                            wnVar.Na(109);
                            r92 = 0;
                        }
                        wnVar.p9();
                        wnVar.Pc(r92, true);
                        wnVar.nd(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        jg.b2 c10 = jg.c2.f(i13).c(wnVar.U8());
                        Activity parentActivity2 = wnVar.getParentActivity();
                        i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        jg.z1.e0(parentActivity2, i14, wnVar.c4, c10, wnVar.getResourceProvider(), new li.s2(i27, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, wnVar.getResourceProvider(), true, true);
                        g1Var.j(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i23));
                        org.telegram.ui.ActionBar.w0 w0Var = wnVar.h0;
                        org.telegram.ui.ActionBar.y yVar = wnVar.e0;
                        yVar.a();
                        w0Var.U(g1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", wnVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", wnVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        wnVar.ya(wnVar.Q9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        wnVar.getMessagesController().getTranslateController().setHideTranslateDialog(wnVar.a(), false, true);
                        if (wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a(), true)) {
                            return;
                        }
                        wnVar.hd(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (wnVar.f == null || wnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = wnVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = wnVar.q8;
                        org.telegram.ui.Components.voip.g2.m(user4, z13, userFull != null && userFull.video_calls_available, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f.id), wnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        jk jkVar = wnVar.Y;
                        if (jkVar == null || jkVar.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        jk jkVar2 = wnVar.Y;
                        if (jkVar2 == null || jkVar2.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        jk jkVar3 = wnVar.Y;
                        if (jkVar3 == null || jkVar3.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        jk jkVar4 = wnVar.Y;
                        if (jkVar4 == null || jkVar4.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        jk jkVar5 = wnVar.Y;
                        if (jkVar5 == null || jkVar5.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        jk jkVar6 = wnVar.Y;
                        if (jkVar6 == null || jkVar6.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        jk jkVar7 = wnVar.Y;
                        if (jkVar7 == null || jkVar7.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        jk jkVar8 = wnVar.Y;
                        if (jkVar8 == null || jkVar8.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        jk jkVar9 = wnVar.Y;
                        if (jkVar9 == null || jkVar9.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        jk jkVar10 = wnVar.Y;
                        if (jkVar10 == null || jkVar10.getEditField() == null) {
                            return;
                        }
                        wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                        wnVar.Y.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        wnVar.Nb();
                        return;
                    }
                    if (i10 == 60) {
                        if (wnVar.o4 == null) {
                            return;
                        }
                        TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                        long j16 = wnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = wnVar.o4;
                        int i33 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i33, true);
                        wnVar.id();
                        wnVar.yc(false);
                        wnVar.hd(true);
                        return;
                    }
                    if (i10 == 61) {
                        cf1.I0(wnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(wnVar.b4.link);
                        org.telegram.ui.Components.wc.b0(LaunchActivity.R()).k(false).j();
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
                                switch (r2) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        jj jjVar = this.b;
                                        jjVar.getClass();
                                        wn wnVar2 = jjVar.b;
                                        Intent intent = new Intent(wnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", wnVar2.b4.link);
                                        wnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (wnVar.Y.s()) {
                            wnVar.Lb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = wnVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = wnVar.b4;
                        u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                        jg.w.c0(parentActivity3, i12, tL_businessChatLink, u6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, i26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(e2Var);
                        TextView textView2 = (TextView) e2Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, wnVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        yd1 b02 = yd1.b0(-wnVar.j6, 0L);
                        b02.y = wnVar;
                        wnVar.presentFragment(b02);
                        return;
                    } else if (i10 == 888) {
                        wnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = j4.c1;
                            org.telegram.ui.Components.wc.b0(wnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = wnVar.e;
                if (chat != null) {
                    wnVar.presentFragment(wn.ea(-chat.linked_monoforum_id));
                }
            } else if (wnVar.getParentActivity() != null) {
                wnVar.O7(null, null, false);
            }
        }
    }
}
