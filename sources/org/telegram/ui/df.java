package org.telegram.ui;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ df(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.c;
        org.telegram.ui.Components.ts0 ts0Var = (org.telegram.ui.Components.ts0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
        org.telegram.ui.Components.gu0 gu0Var = xv0Var.Q;
        org.telegram.ui.Components.hv0 hv0Var = xv0Var.R;
        org.telegram.ui.Components.hu0 hu0Var = xv0Var.a0;
        org.telegram.ui.Components.iv0 iv0Var = xv0Var.S;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        int i12 = ts0Var.F;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.xa) {
                if (!hu0Var.e.isEmpty()) {
                    i11 = ((Integer) hu0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = hu0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= hu0Var.d.participants.participants.size()) {
                    return;
                }
                xv0Var.J0(chatParticipant, false, view);
                return;
            }
            s4.g0 adapter = ts0Var.h.getAdapter();
            org.telegram.ui.Components.ou0 ou0Var = xv0Var.j0;
            if (adapter == ou0Var) {
                TLObject E = ou0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == m2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                m2Var.presentFragment(new ProfileActivity(t8.b.e(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.i6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.i6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                if (!chat.forum) {
                    m2Var.presentFragment(new fo(bundle));
                    return;
                } else {
                    HashSet hashSet = kg1.n1;
                    m2Var.presentFragment(kg1.E0(m2Var.getMessagesController(), m2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.j7)) {
            xv0Var.H0(i11, view, ((org.telegram.ui.Cells.j7) view).getMessage(), ts0Var.F);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
            xv0Var.H0(i11, view, ((org.telegram.ui.Cells.n7) view).getMessage(), ts0Var.F);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.i7)) {
            xv0Var.H0(i11, view, ((org.telegram.ui.Cells.i7) view).getMessage(), ts0Var.F);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
            xv0Var.H0(i11, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), ts0Var.F);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.t7)) {
            final org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            MessageObject messageObject = t7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (m2Var == null) {
                    return;
                }
                final int currentAccount = m2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
                a2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.wr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.m2 m2Var2 = xv0.this.v1;
                        a2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z10 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context2, 1, m2Var2 == null ? null : m2Var2.getResourceProvider());
                            a2Var2.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                            a2Var2.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            a2Var2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(a2Var2, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                            a2Var2.setOnClickListener(new t0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, m2Var2 == null ? null : m2Var2.getResourceProvider());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.G = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.t7 t7Var2 = t7Var;
                            final float f11 = f7;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.es0
                                @Override // org.telegram.ui.ActionBar.z1
                                public final void g(org.telegram.ui.ActionBar.a2 a2Var3, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    gs0 gs0Var = new gs0(org.telegram.ui.Cells.t7.this, f11, f12);
                                    if (!zArr[0]) {
                                        gs0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        gs0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new org.telegram.ui.uc(28, messagesController2, gs0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (m2Var2 == null || m2Var2.getContext() == null) {
                            alertDialog$Builder.o();
                        } else {
                            m2Var2.showDialog(alertDialog$Builder.a);
                        }
                    }
                });
                return;
            }
            MessageObject messageObject2 = t7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && t7Var.i0 == 0.0f && !t7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                t7Var.n(f7, f10);
                return;
            } else {
                if (messageObject != null) {
                    xv0Var.H0(i11, view, messageObject, ts0Var.F);
                    return;
                }
                return;
            }
        }
        if (org.telegram.ui.Components.xv0.p0(i12) && (view instanceof org.telegram.ui.Cells.t7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.t7) view).getMessageObject();
            if (messageObject3 != null) {
                xv0Var.H0(i11, view, messageObject3, ts0Var.F);
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
                m2Var.presentFragment(new fo(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                MessageObject messageObject4 = u1Var.getMessageObject();
                ts0Var.h.B0();
                int currentAccount2 = m2Var.getCurrentAccount();
                MessagesController messagesController2 = m2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F(ts0Var, c6Var, u1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(xv0Var, j11, messageObject4, 21), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.xr0(xv0Var, c6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new org.telegram.ui.Components.xr0(xv0Var, c6Var, messageObject4, currentAccount2), false);
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
            bundle3.putLong("user_id", m2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            fo foVar = new fo(bundle3);
            foVar.d4 = savedDialog.dialogId;
            m2Var.presentFragment(foVar);
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
            bundle4.putLong("user_id", m2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            fo foVar2 = new fo(bundle4);
            foVar2.d4 = savedDialog2.dialogId;
            m2Var.presentFragment(foVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", m2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            org.telegram.ui.Components.bt0 bt0Var = new org.telegram.ui.Components.bt0(xv0Var, bundle5, size);
            bt0Var.L7 = messageObject5.getId();
            m2Var.presentFragment(bt0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                fo.K0((fo) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                org.telegram.ui.Components.y31 y31Var = (org.telegram.ui.Components.y31) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.ve veVar = (org.telegram.ui.Components.ve) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        y31Var.e0.addAll(hashSet);
                        y31Var.o();
                        org.telegram.ui.Components.zc.a0(y31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new bi.b8(y31Var, hashSet, arrayList, j10, 10), new org.telegram.ui.Components.g90(y31Var, arrayList, veVar, 25)).j();
                        a2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            y31Var.m(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ df(fo foVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 0;
        this.c = foVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ df(org.telegram.ui.Components.y31 y31Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.ve veVar) {
        this.a = 2;
        this.c = y31Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = veVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
