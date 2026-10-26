package bi;

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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.at0;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.af1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements org.telegram.ui.ActionBar.b2, am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m4(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final aw0 aw0Var = (aw0) this.c;
        at0 at0Var = (at0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f;
        ju0 ju0Var = aw0Var.S;
        lv0 lv0Var = aw0Var.T;
        ku0 ku0Var = aw0Var.c0;
        mv0 mv0Var = aw0Var.U;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        int i12 = at0Var.E;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.ab) {
                if (!ku0Var.e.isEmpty()) {
                    i11 = ((Integer) ku0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = ku0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= ku0Var.d.participants.participants.size()) {
                    return;
                }
                aw0Var.P0(chatParticipant, false, view);
                return;
            }
            s4.h0 adapter = at0Var.h.getAdapter();
            ru0 ru0Var = aw0Var.l0;
            if (adapter == ru0Var) {
                TLObject E = ru0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == r2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                r2Var.presentFragment(new ProfileActivity(a1.g.h(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.m6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.m6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                if (!chat.forum) {
                    r2Var.presentFragment(new un(bundle));
                    return;
                } else {
                    HashSet hashSet = af1.q1;
                    r2Var.presentFragment(af1.E0(r2Var.getMessagesController(), r2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.o7)) {
            aw0Var.N0(i11, view, ((org.telegram.ui.Cells.o7) view).getMessage(), at0Var.E);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.r7)) {
            aw0Var.N0(i11, view, ((org.telegram.ui.Cells.r7) view).getMessage(), at0Var.E);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.n7)) {
            aw0Var.N0(i11, view, ((org.telegram.ui.Cells.n7) view).getMessage(), at0Var.E);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.d2)) {
            aw0Var.N0(i11, view, (MessageObject) ((org.telegram.ui.Cells.d2) view).getParentObject(), at0Var.E);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.w7)) {
            final org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            MessageObject messageObject = w7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (r2Var == null) {
                    return;
                }
                final int currentAccount = r2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
                e2Var.r(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.cs0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.r2 r2Var2 = aw0.this.x1;
                        e2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z10 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, r2Var2 == null ? null : r2Var2.getResourceProvider());
                            y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                            y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(y1Var, gb1.h(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1Var.setOnClickListener(new r0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, r2Var2 == null ? null : r2Var2.getResourceProvider());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.a.G = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.w7 w7Var2 = w7Var;
                            final float f11 = f7;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.Components.ms0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    ps0 ps0Var = new ps0(org.telegram.ui.Cells.w7.this, f11, f12);
                                    if (!zArr[0]) {
                                        ps0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        ps0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                        ThemeActivity.D0(i13, context2, new oy(7, messagesController2, ps0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (r2Var2 == null || r2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            r2Var2.showDialog(alertDialog$Builder.a);
                        }
                    }
                });
                return;
            }
            MessageObject messageObject2 = w7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && w7Var.i0 == 0.0f && !w7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                w7Var.n(f7, f10);
                return;
            } else {
                if (messageObject != null) {
                    aw0Var.N0(i11, view, messageObject, at0Var.E);
                    return;
                }
                return;
            }
        }
        if (aw0.w0(i12) && (view instanceof org.telegram.ui.Cells.w7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.w7) view).getMessageObject();
            if (messageObject3 != null) {
                aw0Var.N0(i11, view, messageObject3, at0Var.E);
                return;
            }
            return;
        }
        int i13 = at0Var.E;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.m6) || f10 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < ju0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ju0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                r2Var.presentFragment(new un(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                MessageObject messageObject4 = s1Var.getMessageObject();
                at0Var.h.C0();
                int currentAccount2 = r2Var.getCurrentAccount();
                MessagesController messagesController2 = r2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                k80 F = k80.F(at0Var, u6Var, s1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(aw0Var, j11, messageObject4, 24), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new ds0(aw0Var, u6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new ds0(aw0Var, u6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (at0Var.h.getAdapter() != mv0Var) {
            if (aw0Var.E1) {
                if (lv0Var.v.y == 0) {
                    lv0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= lv0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) lv0Var.f.get(i11);
            bundle3.putLong("user_id", r2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            un unVar = new un(bundle3);
            unVar.p4 = savedDialog.dialogId;
            r2Var.presentFragment(unVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = mv0Var.e;
        ArrayList arrayList2 = mv0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", r2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            un unVar2 = new un(bundle4);
            unVar2.p4 = savedDialog2.dialogId;
            r2Var.presentFragment(unVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", r2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            it0 it0Var = new it0(aw0Var, bundle5, size);
            it0Var.X7 = messageObject5.getId();
            r2Var.presentFragment(it0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                un.i1((un) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                e41 e41Var = (e41) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        e41Var.h0.addAll(hashSet);
                        e41Var.p();
                        org.telegram.ui.Components.wc.b0(e41Var.h).V(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new y2(e41Var, hashSet, arrayList, j10, 18), new t90(e41Var, arrayList, k5Var, 24)).j();
                        e2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            e41Var.n(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ m4(un unVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.a = 1;
        this.c = unVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ m4(e41 e41Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.k5 k5Var) {
        this.a = 3;
        this.c = e41Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = k5Var;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
