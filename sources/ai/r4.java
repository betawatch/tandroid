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
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.sn;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements org.telegram.ui.ActionBar.z1, bm0 {
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

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final xv0 xv0Var = (xv0) this.c;
        ts0 ts0Var = (ts0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f;
        gu0 gu0Var = xv0Var.Q;
        hv0 hv0Var = xv0Var.R;
        hu0 hu0Var = xv0Var.a0;
        iv0 iv0Var = xv0Var.S;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        int i12 = ts0Var.F;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.wa) {
                if (!hu0Var.e.isEmpty()) {
                    i11 = ((Integer) hu0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = hu0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= hu0Var.d.participants.participants.size()) {
                    return;
                }
                xv0Var.L0(chatParticipant, false, view);
                return;
            }
            s4.g0 adapter = ts0Var.h.getAdapter();
            ou0 ou0Var = xv0Var.j0;
            if (adapter == ou0Var) {
                TLObject E = ou0Var.E(i11);
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
                o2Var.presentFragment(new ProfileActivity(si.o0.e(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.i6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.i6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (!chat.forum) {
                    o2Var.presentFragment(new sn(bundle));
                    return;
                } else {
                    HashSet hashSet = ye1.q1;
                    o2Var.presentFragment(ye1.D0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.k7)) {
            xv0Var.J0(i11, view, ((org.telegram.ui.Cells.k7) view).getMessage(), ts0Var.F);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
            xv0Var.J0(i11, view, ((org.telegram.ui.Cells.n7) view).getMessage(), ts0Var.F);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.j7)) {
            xv0Var.J0(i11, view, ((org.telegram.ui.Cells.j7) view).getMessage(), ts0Var.F);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
            xv0Var.J0(i11, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ts0Var.F);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.s7)) {
            final org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            MessageObject messageObject = s7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (o2Var == null) {
                    return;
                }
                final int currentAccount = o2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                c2Var.r(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.wr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.o2 o2Var2 = xv0.this.v1;
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
                            z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                            z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(z1Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1Var.setOnClickListener(new s0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, o2Var2 == null ? null : o2Var2.getResourceProvider());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.a.G = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.s7 s7Var2 = s7Var;
                            final float f11 = f7;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.es0
                                @Override // org.telegram.ui.ActionBar.z1
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    gs0 gs0Var = new gs0(org.telegram.ui.Cells.s7.this, f11, f12);
                                    if (!zArr[0]) {
                                        gs0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        gs0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new qy(4, messagesController2, gs0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (o2Var2 == null || o2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            o2Var2.showDialog(alertDialog$Builder.a);
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
                    xv0Var.J0(i11, view, messageObject, ts0Var.F);
                    return;
                }
                return;
            }
        }
        if (xv0.r0(i12) && (view instanceof org.telegram.ui.Cells.s7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.s7) view).getMessageObject();
            if (messageObject3 != null) {
                xv0Var.J0(i11, view, messageObject3, ts0Var.F);
                return;
            }
            return;
        }
        int i13 = ts0Var.F;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.i6) || f10 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < gu0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) gu0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                o2Var.presentFragment(new sn(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                MessageObject messageObject4 = t1Var.getMessageObject();
                ts0Var.h.B0();
                int currentAccount2 = o2Var.getCurrentAccount();
                MessagesController messagesController2 = o2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                j80 F = j80.F(ts0Var, g6Var, t1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(xv0Var, j11, messageObject4, 24), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new xr0(xv0Var, g6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new xr0(xv0Var, g6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (ts0Var.h.getAdapter() != iv0Var) {
            if (xv0Var.C1) {
                if (hv0Var.v.y == 0) {
                    hv0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= hv0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) hv0Var.f.get(i11);
            bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            sn snVar = new sn(bundle3);
            snVar.p4 = savedDialog.dialogId;
            o2Var.presentFragment(snVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = iv0Var.e;
        ArrayList arrayList2 = iv0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            sn snVar2 = new sn(bundle4);
            snVar2.p4 = savedDialog2.dialogId;
            o2Var.presentFragment(snVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            bt0 bt0Var = new bt0(xv0Var, bundle5, size);
            bt0Var.X7 = messageObject5.getId();
            o2Var.presentFragment(bt0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                sn.O0((sn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                w31 w31Var = (w31) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        w31Var.h0.addAll(hashSet);
                        w31Var.q();
                        org.telegram.ui.Components.xc.a0(w31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new c3(w31Var, hashSet, arrayList, j10, 18), new ko0(w31Var, arrayList, rcVar, 13)).j();
                        c2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            w31Var.n(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ r4(sn snVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = snVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ r4(w31 w31Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.rc rcVar) {
        this.a = 3;
        this.c = w31Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = rcVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
