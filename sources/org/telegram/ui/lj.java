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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zn b;

    public lj(zn znVar, Context context) {
        this.b = znVar;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i13;
        int i14;
        ?? r92;
        int i15;
        int i16;
        int i17;
        int i18;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.b;
        SparseArray[] sparseArrayArr = znVar.V5;
        SparseArray[] sparseArrayArr2 = znVar.U5;
        SparseArray[] sparseArrayArr3 = znVar.T5;
        long j10 = 0;
        final int i19 = 1;
        final int i20 = 0;
        if (i10 == -1) {
            if (znVar.tc.f) {
                znVar.ta();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (kVar.s()) {
                znVar.z7(false);
                return;
            }
            if (znVar.O3 == 5 && (znVar.r6.isEmpty() || znVar.a4 == 0)) {
                znVar.Qb();
            } else if (znVar.O3 == 6 && znVar.V.w()) {
                znVar.wb(new Runnable(this) { // from class: org.telegram.ui.ij
                    public final /* synthetic */ lj b;

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
                                lj ljVar = this.b;
                                ljVar.getClass();
                                zn znVar2 = ljVar.b;
                                Intent intent = new Intent(znVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", znVar2.M3.link);
                                znVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!znVar.X6(true, true)) {
                znVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (znVar.getUserConfig().getClientUserId() == znVar.Q5) {
                    znVar.getMessagesController().setSavedViewAs(true);
                    znVar.X0.e(false, true);
                    return;
                } else {
                    znVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-znVar.Q5, false);
                    sf1.I0(znVar);
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
                    if (znVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i21].get(((Integer) arrayList.get(i23)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) zn.D8(messageObject2, arrayList.size() != 1 && ((user3 = znVar.f) == null || !user3.self), j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    znVar.Q7();
                    znVar.v3.j(58, 0L, null);
                }
                znVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    znVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    zn.B1(znVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j12 = znVar.Q5;
                        if (ChatObject.isMonoForum(znVar.e)) {
                            i18 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i18, znVar.e)) {
                                j12 = znVar.a4;
                                j10 = znVar.Q5;
                            }
                        }
                        i17 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        lh.t7.y(i17, false).i0(j12, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j13 = znVar.Q5;
                        if (ChatObject.isMonoForum(znVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                            if (ChatObject.canManageMonoForum(i16, znVar.e)) {
                                j13 = znVar.a4;
                                j10 = znVar.Q5;
                            }
                        }
                        long j14 = j13;
                        long j15 = j10;
                        i15 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        lh.t7.y(i15, false).C(j14, j15, new lh.t3(this, j14, j15, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (znVar.Ya == null) {
                            zn.G1(znVar);
                            return;
                        } else {
                            znVar.k9();
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
                        boolean z4 = znVar.c6 > 0;
                        znVar.c9();
                        znVar.yc(0, true);
                        znVar.Wc(false);
                        MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList2, new jj(0, this, z4));
                        return;
                    }
                    int i26 = 13;
                    if (i10 == 13) {
                        if (znVar.getParentActivity() == null) {
                            return;
                        }
                        znVar.showDialog(org.telegram.ui.Components.z4.V(znVar.getParentActivity(), znVar.h, znVar.ba).a);
                        return;
                    }
                    int i27 = 18;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (znVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(znVar.e)) {
                            if (znVar.a4 == 0 || (user2 = znVar.getMessagesController().getUser(Long.valueOf(znVar.a4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.z4.r(znVar, -1, user2, znVar.e, true, new mg.w(i27, this, user2), znVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = znVar.W7;
                        boolean z10 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (znVar.h != null || (((user = znVar.f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(znVar.f)) && ((chatFull = znVar.W7) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.z4.s(znVar, i10 == i11, znVar.e, znVar.f, znVar.h != null, true, false, z10, new gg.m2(this, i10, z10));
                            return;
                        }
                        boolean z11 = z10;
                        org.telegram.ui.Components.z4.r(znVar, -1, znVar.f, znVar.e, z11, new kj(this, z11), znVar.getResourceProvider());
                        return;
                    }
                    int i28 = 17;
                    if (i10 == 17) {
                        if (znVar.f == null || znVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = znVar.I1;
                        if (textView != null && textView.getTag() != null) {
                            znVar.rb(null, ((Integer) znVar.I1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", znVar.f.id);
                        bundle.putBoolean("addContact", true);
                        znVar.presentFragment(new ps(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        znVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            znVar.getMediaDataController().installShortcut(znVar.f.id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(znVar.e)) {
                            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.Q5));
                            return;
                        }
                        a6 a6Var = new a6(znVar.Q5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = znVar.A1;
                        a6Var.O = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            a6Var.getMessagesController().getBoostsController().userCanBoostChannel(a6Var.M, a6Var.O, new r5(a6Var, 0));
                        }
                        znVar.presentFragment(a6Var);
                        return;
                    }
                    int i29 = 21;
                    if (i10 == 21) {
                        int i30 = q31.v;
                        int currentAccount = znVar.getCurrentAccount();
                        Activity parentActivity = znVar.getParentActivity();
                        long a2 = znVar.a();
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
                                znVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !znVar.W5);
                            }
                        }
                        znVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i33 = 1; i33 >= 0; i33--) {
                            if (messageObject == null && sparseArrayArr3[i33].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i34 = 0; i34 < sparseArrayArr3[i33].size(); i34++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i33].keyAt(i34)));
                                }
                                messageObject = (MessageObject) znVar.l6[i33].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i33].clear();
                            sparseArrayArr2[i33].clear();
                            sparseArrayArr[i33].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r92 = 0;
                            znVar.Xb(messageObject, false);
                        } else {
                            znVar.a5 = messageObject;
                            znVar.Ba(109);
                            r92 = 0;
                        }
                        znVar.c9();
                        znVar.yc(r92, true);
                        znVar.Wc(r92);
                        return;
                    }
                    if (i10 == 64) {
                        i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        uf.o1 c3 = uf.p1.f(i13).c(znVar.H8());
                        Activity parentActivity2 = znVar.getParentActivity();
                        i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        uf.m1.d0(parentActivity2, i14, znVar.N3, c3, znVar.getResourceProvider(), new kh.a1(i29, this, c3));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.a, znVar.getResourceProvider(), true, true);
                        g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        g1Var.setOnClickListener(new a(this, i26));
                        org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
                        org.telegram.ui.ActionBar.y yVar = znVar.b0;
                        yVar.a();
                        w0Var.M(g1Var, yVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", znVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", znVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        znVar.la(znVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        znVar.getMessagesController().getTranslateController().setHideTranslateDialog(znVar.a(), false, true);
                        if (znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a(), true)) {
                            return;
                        }
                        znVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (znVar.f == null || znVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = znVar.f;
                        boolean z12 = i10 == 33;
                        TLRPC.UserFull userFull = znVar.X7;
                        org.telegram.ui.Components.voip.f2.m(user4, z12, userFull != null && userFull.video_calls_available, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f.id), znVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        lk lkVar = znVar.V;
                        if (lkVar == null || lkVar.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        lk lkVar2 = znVar.V;
                        if (lkVar2 == null || lkVar2.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        lk lkVar3 = znVar.V;
                        if (lkVar3 == null || lkVar3.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        lk lkVar4 = znVar.V;
                        if (lkVar4 == null || lkVar4.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        lk lkVar5 = znVar.V;
                        if (lkVar5 == null || lkVar5.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        lk lkVar6 = znVar.V;
                        if (lkVar6 == null || lkVar6.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        lk lkVar7 = znVar.V;
                        if (lkVar7 == null || lkVar7.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        lk lkVar8 = znVar.V;
                        if (lkVar8 == null || lkVar8.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        lk lkVar9 = znVar.V;
                        if (lkVar9 == null || lkVar9.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        lk lkVar10 = znVar.V;
                        if (lkVar10 == null || lkVar10.getEditField() == null) {
                            return;
                        }
                        znVar.V.getEditField().setSelectionOverride(znVar.x4, znVar.y4);
                        znVar.V.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        znVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (znVar.Z3 == null) {
                            return;
                        }
                        TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                        long j16 = znVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = znVar.Z3;
                        int i35 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i35, true);
                        znVar.Rc();
                        znVar.hc(false);
                        znVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        sf1.I0(znVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(znVar.M3.link);
                        org.telegram.ui.Components.qc.a0(LaunchActivity.R()).k(false).j();
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
                                switch (i19) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        lj ljVar = this.b;
                                        ljVar.getClass();
                                        zn znVar2 = ljVar.b;
                                        Intent intent = new Intent(znVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", znVar2.M3.link);
                                        znVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (znVar.V.w()) {
                            znVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = znVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = znVar.M3;
                        f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                        uf.q.b0(parentActivity3, i12, tL_businessChatLink, f6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, i28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(d2Var);
                        TextView textView2 = (TextView) d2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        ne1 a02 = ne1.a0(-znVar.Q5, 0L);
                        a02.y = znVar;
                        znVar.presentFragment(a02);
                        return;
                    } else if (i10 == 888) {
                        znVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = n4.Y0;
                            org.telegram.ui.Components.qc.a0(znVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = znVar.e;
                if (chat != null) {
                    znVar.presentFragment(zn.R9(-chat.linked_monoforum_id));
                }
            } else if (znVar.getParentActivity() != null) {
                znVar.F7(null, null, false);
            }
        }
    }
}
