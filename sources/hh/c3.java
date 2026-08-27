package hh;

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
import org.telegram.messenger.pg;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.rn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements org.telegram.ui.ActionBar.a2, qk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(final float f10, final float f11, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final hu0 hu0Var = (hu0) this.c;
        br0 br0Var = (br0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
        ps0 ps0Var = hu0Var.M;
        qt0 qt0Var = hu0Var.N;
        qs0 qs0Var = hu0Var.T;
        st0 st0Var = hu0Var.O;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        int i12 = br0Var.B;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.sa) {
                if (!qs0Var.e.isEmpty()) {
                    i11 = ((Integer) qs0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = qs0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= qs0Var.d.participants.participants.size()) {
                    return;
                }
                hu0Var.I0(chatParticipant, false, view);
                return;
            }
            f2.q0 adapter = br0Var.h.getAdapter();
            xs0 xs0Var = hu0Var.f0;
            if (adapter == xs0Var) {
                TLObject E = xs0Var.E(i11);
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
                n2Var.presentFragment(new ProfileActivity(com.google.android.recaptcha.internal.a.h(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.e6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.e6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                if (!chat.forum) {
                    n2Var.presentFragment(new rn(bundle));
                    return;
                } else {
                    HashSet hashSet = we1.j1;
                    n2Var.presentFragment(we1.E0(n2Var.getMessagesController(), n2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.f7)) {
            hu0Var.G0(i11, view, ((org.telegram.ui.Cells.f7) view).getMessage(), br0Var.B);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.i7)) {
            hu0Var.G0(i11, view, ((org.telegram.ui.Cells.i7) view).getMessage(), br0Var.B);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.e7)) {
            hu0Var.G0(i11, view, ((org.telegram.ui.Cells.e7) view).getMessage(), br0Var.B);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.d2)) {
            hu0Var.G0(i11, view, (MessageObject) ((org.telegram.ui.Cells.d2) view).getParentObject(), br0Var.B);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.o7)) {
            final org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            MessageObject messageObject = o7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (n2Var == null) {
                    return;
                }
                final int currentAccount = n2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                b2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.fq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.n2 n2Var2 = hu0.this.r1;
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
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, n2Var2 == null ? null : n2Var2.getResourceProvider());
                            y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                            y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(y1Var, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1Var.setOnClickListener(new s0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, n2Var2 == null ? null : n2Var2.getResourceProvider());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.C = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.o7 o7Var2 = o7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.nq0
                                @Override // org.telegram.ui.ActionBar.a2
                                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    pq0 pq0Var = new pq0(org.telegram.ui.Cells.o7.this, f12, f13);
                                    if (!zArr[0]) {
                                        pq0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        pq0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new org.telegram.ui.df(23, messagesController2, pq0Var), U == null ? null : U.getResourceProvider());
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
            MessageObject messageObject2 = o7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && o7Var.e0 == 0.0f && !o7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                o7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    hu0Var.G0(i11, view, messageObject, br0Var.B);
                    return;
                }
                return;
            }
        }
        if (hu0.p0(i12) && (view instanceof org.telegram.ui.Cells.o7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.o7) view).getMessageObject();
            if (messageObject3 != null) {
                hu0Var.G0(i11, view, messageObject3, br0Var.B);
                return;
            }
            return;
        }
        int i13 = br0Var.B;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.e6) || f11 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < ps0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ps0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                n2Var.presentFragment(new rn(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                MessageObject messageObject4 = s1Var.getMessageObject();
                br0Var.h.B0();
                int currentAccount2 = n2Var.getCurrentAccount();
                MessagesController messagesController2 = n2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                b70 F = b70.F(br0Var, c6Var, s1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new e5.u(hu0Var, j11, messageObject4, 25), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new gq0(hu0Var, c6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new gq0(hu0Var, c6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (br0Var.h.getAdapter() != st0Var) {
            if (hu0Var.y1) {
                if (qt0Var.v.y == 0) {
                    qt0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= qt0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) qt0Var.f.get(i11);
            bundle3.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            rn rnVar = new rn(bundle3);
            rnVar.Z3 = savedDialog.dialogId;
            n2Var.presentFragment(rnVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = st0Var.e;
        ArrayList arrayList2 = st0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            rn rnVar2 = new rn(bundle4);
            rnVar2.Z3 = savedDialog2.dialogId;
            n2Var.presentFragment(rnVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            jr0 jr0Var = new jr0(hu0Var, bundle5, size);
            jr0Var.H7 = messageObject5.getId();
            n2Var.presentFragment(jr0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                rn.X0((rn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                d21 d21Var = (d21) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                gc gcVar = (gc) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        d21Var.a0.addAll(hashSet);
                        d21Var.p();
                        mc.a0(d21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new pg(d21Var, hashSet, arrayList, j10), new lg0(d21Var, arrayList, gcVar, 19)).j();
                        b2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            d21Var.m(0L, false);
                        }
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    public /* synthetic */ c3(rn rnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = rnVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ c3(d21 d21Var, ArrayList arrayList, long j10, HashSet hashSet, gc gcVar) {
        this.a = 3;
        this.c = d21Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = gcVar;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
