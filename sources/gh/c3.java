package gh;

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
import org.telegram.messenger.lg;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.qn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements org.telegram.ui.ActionBar.b2, nk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i9) {
        this.a = i9;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(final float f10, final float f11, int i9, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i10 = i9;
        final eu0 eu0Var = (eu0) this.c;
        ar0 ar0Var = (ar0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f;
        ns0 ns0Var = eu0Var.M;
        ot0 ot0Var = eu0Var.N;
        os0 os0Var = eu0Var.T;
        pt0 pt0Var = eu0Var.O;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        int i11 = ar0Var.B;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.va) {
                if (!os0Var.e.isEmpty()) {
                    i10 = ((Integer) os0Var.e.get(i10)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = os0Var.d.participants.participants.get(i10);
                if (i10 < 0 || i10 >= os0Var.d.participants.participants.size()) {
                    return;
                }
                eu0Var.I0(chatParticipant, false, view);
                return;
            }
            f2.r0 adapter = ar0Var.h.getAdapter();
            vs0 vs0Var = eu0Var.f0;
            if (adapter == vs0Var) {
                TLObject E = vs0Var.E(i10);
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
                o2Var.presentFragment(new ProfileActivity(e2.c.g(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (!chat.forum) {
                    o2Var.presentFragment(new qn(bundle));
                    return;
                } else {
                    HashSet hashSet = we1.j1;
                    o2Var.presentFragment(we1.D0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i11 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            eu0Var.G0(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), ar0Var.B);
            return;
        }
        if (i11 == 3 && (view instanceof org.telegram.ui.Cells.l7)) {
            eu0Var.G0(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), ar0Var.B);
            return;
        }
        if ((i11 == 2 || i11 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
            eu0Var.G0(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), ar0Var.B);
            return;
        }
        if (i11 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
            eu0Var.G0(i10, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ar0Var.B);
            return;
        }
        if (i11 == 0 && (view instanceof org.telegram.ui.Cells.r7)) {
            final org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            MessageObject messageObject = r7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (o2Var == null) {
                    return;
                }
                final int currentAccount = o2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                c2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.eq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.o2 o2Var2 = eu0.this.r1;
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
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, o2Var2 == null ? null : o2Var2.getResourceProvider());
                            z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                            z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1Var.setOnClickListener(new s0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, o2Var2 == null ? null : o2Var2.getResourceProvider());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.C = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.r7 r7Var2 = r7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i12 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.Components.mq0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                                    TL_account.contentSettings contentsettings2;
                                    oq0 oq0Var = new oq0(org.telegram.ui.Cells.r7.this, f12, f13);
                                    if (!zArr[0]) {
                                        oq0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        oq0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                        ThemeActivity.B0(i12, context2, new org.telegram.ui.df(23, messagesController2, oq0Var), U == null ? null : U.getResourceProvider());
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
            MessageObject messageObject2 = r7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && r7Var.e0 == 0.0f && !r7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                r7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    eu0Var.G0(i10, view, messageObject, ar0Var.B);
                    return;
                }
                return;
            }
        }
        if (eu0.p0(i11) && (view instanceof org.telegram.ui.Cells.r7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.r7) view).getMessageObject();
            if (messageObject3 != null) {
                eu0Var.G0(i10, view, messageObject3, ar0Var.B);
                return;
            }
            return;
        }
        int i12 = ar0Var.B;
        if (i12 == 10) {
            if (((view instanceof org.telegram.ui.Cells.h6) || f11 < AndroidUtilities.dp(60.0f)) && i10 >= 0 && i10 < ns0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ns0Var.d.get(i10);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                o2Var.presentFragment(new qn(bundle2));
                return;
            }
            return;
        }
        if (i12 != 11) {
            if (i12 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                MessageObject messageObject4 = t1Var.getMessageObject();
                ar0Var.h.B0();
                int currentAccount2 = o2Var.getCurrentAccount();
                MessagesController messagesController2 = o2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                x60 F = x60.F(ar0Var, b6Var, t1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new e5.w(eu0Var, j11, messageObject4, 25), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new fq0(eu0Var, b6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new fq0(eu0Var, b6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (ar0Var.h.getAdapter() != pt0Var) {
            if (eu0Var.y1) {
                if (ot0Var.v.y == 0) {
                    ot0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i10 < 0 || i10 >= ot0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) ot0Var.f.get(i10);
            bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            qn qnVar = new qn(bundle3);
            qnVar.Z3 = savedDialog.dialogId;
            o2Var.presentFragment(qnVar);
            return;
        }
        if (i10 < 0) {
            return;
        }
        ArrayList arrayList = pt0Var.e;
        ArrayList arrayList2 = pt0Var.f;
        if (i10 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            qn qnVar2 = new qn(bundle4);
            qnVar2.Z3 = savedDialog2.dialogId;
            o2Var.presentFragment(qnVar2);
            return;
        }
        int size = i10 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            ir0 ir0Var = new ir0(eu0Var, bundle5, size);
            ir0Var.H7 = messageObject5.getId();
            o2Var.presentFragment(ir0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                qn.X0((qn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                b21 b21Var = (b21) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                hc hcVar = (hc) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i10 >= size) {
                        b21Var.a0.addAll(hashSet);
                        b21Var.o();
                        oc.a0(b21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new lg(b21Var, hashSet, arrayList, j10), new jg0(b21Var, arrayList, hcVar, 19)).j();
                        c2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j10 == ((Integer) obj).intValue()) {
                            b21Var.m(0L, false);
                        }
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    public /* synthetic */ c3(qn qnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = qnVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ c3(b21 b21Var, ArrayList arrayList, long j10, HashSet hashSet, hc hcVar) {
        this.a = 3;
        this.c = b21Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = hcVar;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
