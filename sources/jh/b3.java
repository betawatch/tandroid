package jh;

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
import org.telegram.messenger.sg;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.tn;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements org.telegram.ui.ActionBar.b2, al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(final float f9, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final qu0 qu0Var = (qu0) this.c;
        lr0 lr0Var = (lr0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
        ys0 ys0Var = qu0Var.M;
        zt0 zt0Var = qu0Var.N;
        zs0 zs0Var = qu0Var.T;
        bu0 bu0Var = qu0Var.O;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        int i12 = lr0Var.B;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.sa) {
                if (!zs0Var.e.isEmpty()) {
                    i11 = ((Integer) zs0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = zs0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= zs0Var.d.participants.participants.size()) {
                    return;
                }
                qu0Var.I0(chatParticipant, false, view);
                return;
            }
            f2.p0 adapter = lr0Var.h.getAdapter();
            gt0 gt0Var = qu0Var.f0;
            if (adapter == gt0Var) {
                TLObject E = gt0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == o2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                o2Var.presentFragment(new ProfileActivity(j7.l1.g(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.f6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.f6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (!chat.forum) {
                    o2Var.presentFragment(new tn(bundle));
                    return;
                } else {
                    HashSet hashSet = ze1.j1;
                    o2Var.presentFragment(ze1.E0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.g7)) {
            qu0Var.G0(i11, view, ((org.telegram.ui.Cells.g7) view).getMessage(), lr0Var.B);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.j7)) {
            qu0Var.G0(i11, view, ((org.telegram.ui.Cells.j7) view).getMessage(), lr0Var.B);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.f7)) {
            qu0Var.G0(i11, view, ((org.telegram.ui.Cells.f7) view).getMessage(), lr0Var.B);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.d2)) {
            qu0Var.G0(i11, view, (MessageObject) ((org.telegram.ui.Cells.d2) view).getParentObject(), lr0Var.B);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.p7)) {
            final org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            MessageObject messageObject = p7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (o2Var == null) {
                    return;
                }
                final int currentAccount = o2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                c2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.qq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.o2 o2Var2 = qu0.this.r1;
                        c2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z10 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, o2Var2 == null ? null : o2Var2.getResourceProvider());
                            y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                            y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1Var.setOnClickListener(new v0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, o2Var2 == null ? null : o2Var2.getResourceProvider());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.C = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.p7 p7Var2 = p7Var;
                            final float f11 = f9;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.Components.xq0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    zq0 zq0Var = new zq0(org.telegram.ui.Cells.p7.this, f11, f12);
                                    if (!zArr[0]) {
                                        zq0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        zq0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new org.telegram.ui.tm(16, messagesController2, zq0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (o2Var2 == null || o2Var2.getContext() == null) {
                            alertDialog$Builder.o();
                        } else {
                            o2Var2.showDialog(alertDialog$Builder.a);
                        }
                    }
                });
                return;
            }
            MessageObject messageObject2 = p7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && p7Var.e0 == 0.0f && !p7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                p7Var.n(f9, f10);
                return;
            } else {
                if (messageObject != null) {
                    qu0Var.G0(i11, view, messageObject, lr0Var.B);
                    return;
                }
                return;
            }
        }
        if (qu0.p0(i12) && (view instanceof org.telegram.ui.Cells.p7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.p7) view).getMessageObject();
            if (messageObject3 != null) {
                qu0Var.G0(i11, view, messageObject3, lr0Var.B);
                return;
            }
            return;
        }
        int i13 = lr0Var.B;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.f6) || f10 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < ys0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ys0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                o2Var.presentFragment(new tn(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                MessageObject messageObject4 = s1Var.getMessageObject();
                lr0Var.h.B0();
                int currentAccount2 = o2Var.getCurrentAccount();
                MessagesController messagesController2 = o2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                j70 F = j70.F(lr0Var, c6Var, s1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new g5.v(qu0Var, j11, messageObject4, 24), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new rq0(qu0Var, c6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new rq0(qu0Var, c6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (lr0Var.h.getAdapter() != bu0Var) {
            if (qu0Var.y1) {
                if (zt0Var.v.y == 0) {
                    zt0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= zt0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) zt0Var.f.get(i11);
            bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            tn tnVar = new tn(bundle3);
            tnVar.Z3 = savedDialog.dialogId;
            o2Var.presentFragment(tnVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = bu0Var.e;
        ArrayList arrayList2 = bu0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            tn tnVar2 = new tn(bundle4);
            tnVar2.Z3 = savedDialog2.dialogId;
            o2Var.presentFragment(tnVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            tr0 tr0Var = new tr0(qu0Var, bundle5, size);
            tr0Var.H7 = messageObject5.getId();
            o2Var.presentFragment(tr0Var);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                tn.X0((tn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                m21 m21Var = (m21) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        m21Var.a0.addAll(hashSet);
                        m21Var.o();
                        tc.a0(m21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new sg(m21Var, hashSet, arrayList, j10), new ii0(m21Var, arrayList, g5Var, 16)).j();
                        c2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            m21Var.m(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ b3(tn tnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = tnVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ b3(m21 m21Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.g5 g5Var) {
        this.a = 3;
        this.c = m21Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = g5Var;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
