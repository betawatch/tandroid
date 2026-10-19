package ai;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.qn;
import org.telegram.ui.re1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements org.telegram.ui.ActionBar.a2, xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r4(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final tv0 tv0Var = (tv0) this.c;
        ps0 ps0Var = (ps0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f;
        cu0 cu0Var = tv0Var.Q;
        dv0 dv0Var = tv0Var.R;
        du0 du0Var = tv0Var.a0;
        ev0 ev0Var = tv0Var.S;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        int i12 = ps0Var.F;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.va) {
                if (!du0Var.e.isEmpty()) {
                    i11 = ((Integer) du0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = du0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= du0Var.d.participants.participants.size()) {
                    return;
                }
                tv0Var.K0(chatParticipant, false, view);
                return;
            }
            s4.g0 adapter = ps0Var.h.getAdapter();
            ku0 ku0Var = tv0Var.j0;
            if (adapter == ku0Var) {
                TLObject E = ku0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == n2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                n2Var.presentFragment(new ProfileActivity(zf.d0.b(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                if (!chat.forum) {
                    n2Var.presentFragment(new qn(bundle));
                    return;
                } else {
                    HashSet hashSet = re1.n1;
                    n2Var.presentFragment(re1.E0(n2Var.getMessagesController(), n2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            tv0Var.I0(i11, view, ((org.telegram.ui.Cells.i7) view).getMessage(), ps0Var.F);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.m7)) {
            tv0Var.I0(i11, view, ((org.telegram.ui.Cells.m7) view).getMessage(), ps0Var.F);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
            tv0Var.I0(i11, view, ((org.telegram.ui.Cells.h7) view).getMessage(), ps0Var.F);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
            tv0Var.I0(i11, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), ps0Var.F);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.s7)) {
            final org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            MessageObject messageObject = s7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (n2Var == null) {
                    return;
                }
                final int currentAccount = n2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                b2Var.r(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.sr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.n2 n2Var2 = tv0.this.v1;
                        b2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z10 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context2, 1, n2Var2 == null ? null : n2Var2.getResourceProvider());
                            a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                            a2Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(a2Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            a2Var.setOnClickListener(new t0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, n2Var2 == null ? null : n2Var2.getResourceProvider());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.G = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.s7 s7Var2 = s7Var;
                            final float f11 = f7;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.as0
                                @Override // org.telegram.ui.ActionBar.a2
                                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    cs0 cs0Var = new cs0(org.telegram.ui.Cells.s7.this, f11, f12);
                                    if (!zArr[0]) {
                                        cs0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        cs0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new qy(4, messagesController2, cs0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (n2Var2 == null || n2Var2.getContext() == null) {
                            alertDialog$Builder.o();
                        } else {
                            n2Var2.showDialog(alertDialog$Builder.a);
                        }
                    }
                });
                return;
            }
            MessageObject messageObject2 = s7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && s7Var.i0 == 0.0f && !s7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                s7Var.n(f7, f10);
                return;
            } else {
                if (messageObject != null) {
                    tv0Var.I0(i11, view, messageObject, ps0Var.F);
                    return;
                }
                return;
            }
        }
        if (tv0.q0(i12) && (view instanceof org.telegram.ui.Cells.s7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.s7) view).getMessageObject();
            if (messageObject3 != null) {
                tv0Var.I0(i11, view, messageObject3, ps0Var.F);
                return;
            }
            return;
        }
        int i13 = ps0Var.F;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.h6) || f10 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < cu0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) cu0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                n2Var.presentFragment(new qn(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                MessageObject messageObject4 = u1Var.getMessageObject();
                ps0Var.h.B0();
                int currentAccount2 = n2Var.getCurrentAccount();
                MessagesController messagesController2 = n2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                i80 F = i80.F(ps0Var, d6Var, u1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(tv0Var, j11, messageObject4, 24), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new tr0(tv0Var, d6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new tr0(tv0Var, d6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (ps0Var.h.getAdapter() != ev0Var) {
            if (tv0Var.C1) {
                if (dv0Var.v.y == 0) {
                    dv0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= dv0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) dv0Var.f.get(i11);
            bundle3.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            qn qnVar = new qn(bundle3);
            qnVar.d4 = savedDialog.dialogId;
            n2Var.presentFragment(qnVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = ev0Var.e;
        ArrayList arrayList2 = ev0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            qn qnVar2 = new qn(bundle4);
            qnVar2.d4 = savedDialog2.dialogId;
            n2Var.presentFragment(qnVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            xs0 xs0Var = new xs0(tv0Var, bundle5, size);
            xs0Var.L7 = messageObject5.getId();
            n2Var.presentFragment(xs0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                qn.K0((qn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                r31 r31Var = (r31) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        r31Var.e0.addAll(hashSet);
                        r31Var.o();
                        org.telegram.ui.Components.xc.a0(r31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new c3(r31Var, hashSet, arrayList, j10, 18), new go0(r31Var, arrayList, rcVar, 13)).j();
                        b2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            r31Var.m(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ r4(qn qnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = qnVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ r4(r31 r31Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.rc rcVar) {
        this.a = 3;
        this.c = r31Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = rcVar;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
