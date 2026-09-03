package mh;

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
import org.telegram.messenger.di;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.sf1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements org.telegram.ui.ActionBar.c2, jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(final float f10, final float f11, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final yu0 yu0Var = (yu0) this.c;
        tr0 tr0Var = (tr0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f;
        gt0 gt0Var = yu0Var.N;
        hu0 hu0Var = yu0Var.O;
        ht0 ht0Var = yu0Var.U;
        ju0 ju0Var = yu0Var.P;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        int i12 = tr0Var.C;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.va) {
                if (!ht0Var.e.isEmpty()) {
                    i11 = ((Integer) ht0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = ht0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= ht0Var.d.participants.participants.size()) {
                    return;
                }
                yu0Var.I0(chatParticipant, false, view);
                return;
            }
            f2.p0 adapter = tr0Var.h.getAdapter();
            ot0 ot0Var = yu0Var.g0;
            if (adapter == ot0Var) {
                TLObject E = ot0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == p2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                p2Var.presentFragment(new ProfileActivity(l.d.g(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                if (!chat.forum) {
                    p2Var.presentFragment(new xn(bundle));
                    return;
                } else {
                    HashSet hashSet = sf1.k1;
                    p2Var.presentFragment(sf1.E0(p2Var.getMessagesController(), p2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            yu0Var.G0(i11, view, ((org.telegram.ui.Cells.i7) view).getMessage(), tr0Var.C);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.l7)) {
            yu0Var.G0(i11, view, ((org.telegram.ui.Cells.l7) view).getMessage(), tr0Var.C);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
            yu0Var.G0(i11, view, ((org.telegram.ui.Cells.h7) view).getMessage(), tr0Var.C);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
            yu0Var.G0(i11, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), tr0Var.C);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.r7)) {
            final org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            MessageObject messageObject = r7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (p2Var == null) {
                    return;
                }
                final int currentAccount = p2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                d2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.yq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.p2 p2Var2 = yu0.this.s1;
                        d2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z4 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z10 = (contentsettings == null || !contentsettings.sensitive_can_change) && z4;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z4) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, p2Var2 == null ? null : p2Var2.getResourceProvider());
                            z1Var.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                            z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(z1Var, k7.c6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1Var.setOnClickListener(new t0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, p2Var2 == null ? null : p2Var2.getResourceProvider());
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.Q = LocaleController.getString(z10 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.D = 9;
                        alertDialog$Builder.h(LocaleController.getString(z10 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z10) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.r7 r7Var2 = r7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.fr0
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    hr0 hr0Var = new hr0(org.telegram.ui.Cells.r7.this, f12, f13);
                                    if (!zArr[0]) {
                                        hr0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z4 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        hr0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new xk(8, messagesController2, hr0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (p2Var2 == null || p2Var2.getContext() == null) {
                            alertDialog$Builder.o();
                        } else {
                            p2Var2.showDialog(alertDialog$Builder.a);
                        }
                    }
                });
                return;
            }
            MessageObject messageObject2 = r7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && r7Var.f0 == 0.0f && !r7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                r7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    yu0Var.G0(i11, view, messageObject, tr0Var.C);
                    return;
                }
                return;
            }
        }
        if (yu0.p0(i12) && (view instanceof org.telegram.ui.Cells.r7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.r7) view).getMessageObject();
            if (messageObject3 != null) {
                yu0Var.G0(i11, view, messageObject3, tr0Var.C);
                return;
            }
            return;
        }
        int i13 = tr0Var.C;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.h6) || f11 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < gt0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) gt0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                p2Var.presentFragment(new xn(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                MessageObject messageObject4 = t1Var.getMessageObject();
                tr0Var.h.B0();
                int currentAccount2 = p2Var.getCurrentAccount();
                MessagesController messagesController2 = p2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                q70 F = q70.F(tr0Var, g6Var, t1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new i5.v(yu0Var, j11, messageObject4, 23), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new zq0(yu0Var, g6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new zq0(yu0Var, g6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (tr0Var.h.getAdapter() != ju0Var) {
            if (yu0Var.z1) {
                if (hu0Var.v.y == 0) {
                    hu0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= hu0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) hu0Var.f.get(i11);
            bundle3.putLong("user_id", p2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            xn xnVar = new xn(bundle3);
            xnVar.a4 = savedDialog.dialogId;
            p2Var.presentFragment(xnVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = ju0Var.e;
        ArrayList arrayList2 = ju0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", p2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            xn xnVar2 = new xn(bundle4);
            xnVar2.a4 = savedDialog2.dialogId;
            p2Var.presentFragment(xnVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", p2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            bs0 bs0Var = new bs0(yu0Var, bundle5, size);
            bs0Var.I7 = messageObject5.getId();
            p2Var.presentFragment(bs0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                xn.X0((xn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                w21 w21Var = (w21) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                jc jcVar = (jc) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        w21Var.b0.addAll(hashSet);
                        w21Var.o();
                        qc.a0(w21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new di(w21Var, hashSet, arrayList, j10, 5), new b90(w21Var, arrayList, jcVar, 23)).j();
                        d2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            w21Var.m(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ a3(xn xnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = xnVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ a3(w21 w21Var, ArrayList arrayList, long j10, HashSet hashSet, jc jcVar) {
        this.a = 3;
        this.c = w21Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = jcVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
