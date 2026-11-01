package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.messenger.vs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lh(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = (org.telegram.messenger.vs) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    @Override // org.telegram.ui.Components.ik0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(final float f7, final float f10, int i10, View view) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i11 = i10;
        final org.telegram.ui.Components.au0 au0Var = (org.telegram.ui.Components.au0) this.c;
        org.telegram.ui.Components.br0 br0Var = (org.telegram.ui.Components.br0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f;
        org.telegram.ui.Components.ks0 ks0Var = au0Var.S;
        org.telegram.ui.Components.jt0 jt0Var = au0Var.T;
        org.telegram.ui.Components.ls0 ls0Var = au0Var.c0;
        org.telegram.ui.Components.mt0 mt0Var = au0Var.U;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        int i12 = br0Var.E;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.pa) {
                if (!ls0Var.e.isEmpty()) {
                    i11 = ((Integer) ls0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = ls0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= ls0Var.d.participants.participants.size()) {
                    return;
                }
                au0Var.R0(chatParticipant, false, view);
                return;
            }
            s4.g0 adapter = br0Var.h.getAdapter();
            org.telegram.ui.Components.rs0 rs0Var = au0Var.l0;
            if (adapter == rs0Var) {
                TLObject E = rs0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == k2Var.getUserConfig().e()) {
                    return;
                }
                k2Var.presentFragment(new ProfileActivity(org.telegram.ui.Cells.f1.k(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.k6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.k6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                if (!chat.forum) {
                    k2Var.presentFragment(new un(bundle));
                    return;
                } else {
                    HashSet hashSet = nb1.q1;
                    k2Var.presentFragment(nb1.I0(k2Var.getMessagesController(), k2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.l7)) {
            au0Var.P0(i11, view, ((org.telegram.ui.Cells.l7) view).getMessage(), br0Var.E);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.o7)) {
            au0Var.P0(i11, view, ((org.telegram.ui.Cells.o7) view).getMessage(), br0Var.E);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.k7)) {
            au0Var.P0(i11, view, ((org.telegram.ui.Cells.k7) view).getMessage(), br0Var.E);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.h2)) {
            au0Var.P0(i11, view, (org.telegram.messenger.kj) ((org.telegram.ui.Cells.h2) view).getParentObject(), br0Var.E);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.s7)) {
            final org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            org.telegram.messenger.kj messageObject = s7Var.getMessageObject();
            if (messageObject != null && messageObject.p4()) {
                if (k2Var == null) {
                    return;
                }
                final int currentAccount = k2Var.getCurrentAccount();
                final org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(currentAccount);
                final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
                x1Var.r(200L);
                r12.Q0(new org.telegram.messenger.r20() { // from class: org.telegram.ui.Components.cq0
                    @Override // org.telegram.messenger.r20
                    public final void a(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.k2 k2Var2 = au0.this.x1;
                        x1Var.c(200L);
                        final org.telegram.messenger.wp wpVar = r12;
                        final boolean z11 = ((org.telegram.messenger.j0) wpVar.y7.m.b).c && !TextUtils.isEmpty(wpVar.v6);
                        boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z11) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context2, k2Var2 == null ? null : k2Var2.getResourceProvider());
                            c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                            c2Var.e(org.telegram.messenger.dd.L0(2131748497, null), "", zArr[0], false, false);
                            c2Var.setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                            frameLayout.addView(c2Var, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            c2Var.setOnClickListener(new x0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, k2Var2 == null ? null : k2Var2.getResourceProvider());
                        String L0 = org.telegram.messenger.dd.L0(2131748488, null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                        x1Var2.R = L0;
                        x1Var2.T = org.telegram.messenger.dd.L0(z12 ? 2131748490 : 2131748491, null);
                        alertDialog$Builder.o(frameLayout);
                        x1Var2.G = 9;
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(z12 ? 2131748489 : 2131752589, null), null);
                        if (!z12) {
                            String L02 = org.telegram.messenger.dd.L0(2131748496, null);
                            final org.telegram.ui.Cells.s7 s7Var2 = s7Var;
                            final float f11 = f7;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(L02, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Components.nq0
                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var3, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    qq0 qq0Var = new qq0(org.telegram.ui.Cells.s7.this, f11, f12);
                                    if (!zArr[0]) {
                                        qq0Var.a(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z11 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        qq0Var.a(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                        ThemeActivity.H0(i13, context2, new vg(12, wpVar, qq0Var), T == null ? null : T.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (k2Var2 == null || k2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            k2Var2.showDialog(x1Var2);
                        }
                    }
                });
                return;
            }
            org.telegram.messenger.kj kjVar = s7Var.n;
            if (kjVar != null && kjVar.t2() && s7Var.i0 == 0.0f && !s7Var.n.N0) {
                s7Var.n(f7, f10);
                return;
            } else {
                if (messageObject != null) {
                    au0Var.P0(i11, view, messageObject, br0Var.E);
                    return;
                }
                return;
            }
        }
        if (org.telegram.ui.Components.au0.y0(i12) && (view instanceof org.telegram.ui.Cells.s7)) {
            org.telegram.messenger.kj messageObject2 = ((org.telegram.ui.Cells.s7) view).getMessageObject();
            if (messageObject2 != null) {
                au0Var.P0(i11, view, messageObject2, br0Var.E);
                return;
            }
            return;
        }
        int i13 = br0Var.E;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.k6) || f10 < org.telegram.messenger.i0.L(60.0f)) && i11 >= 0 && i11 < ks0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ks0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                k2Var.presentFragment(new un(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                org.telegram.messenger.kj messageObject3 = q1Var.getMessageObject();
                br0Var.h.C0();
                int currentAccount2 = k2Var.getCurrentAccount();
                org.telegram.messenger.wp messagesController = k2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j11));
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(br0Var, p6Var, q1Var);
                F.c0 = true;
                F.V(messageObject3.P3() ? 5 : 3);
                F.c(R.drawable.msg_message, org.telegram.messenger.dd.L0(2131754877, null), new a3.i0(au0Var, j11, messageObject3, 15), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia o12 = org.telegram.messenger.kj.o1(messageObject3.k);
                    if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                        z10 = ((TLRPC.TL_messageMediaPoll) o12).poll.closed;
                        if (!z10) {
                            if (messageObject3.C()) {
                                F.c(R.drawable.msg_unvote, org.telegram.messenger.dd.L0(2131743850, null), new org.telegram.ui.Components.dq0(au0Var, p6Var, currentAccount2, messageObject3), false);
                            }
                            if (!org.telegram.messenger.kj.l3(messageObject3.k) && ((messageObject3.N3() && (!org.telegram.messenger.w3.T(L0) || L0.megagroup)) || (org.telegram.messenger.w3.T(L0) && !L0.megagroup && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                F.c(R.drawable.msg_pollstop, org.telegram.messenger.dd.L0(messageObject3.c4() ? 2131744844 : 2131744849, null), new org.telegram.ui.Components.dq0(au0Var, p6Var, messageObject3, currentAccount2), false);
                            }
                        }
                        F.Z();
                        return;
                    }
                }
                z10 = false;
                if (!z10) {
                }
                F.Z();
                return;
            }
            return;
        }
        if (br0Var.h.getAdapter() != mt0Var) {
            if (au0Var.E1) {
                if (jt0Var.w.D == 0) {
                    jt0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= jt0Var.f.size()) {
                return;
            }
            org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) jt0Var.f.get(i11);
            bundle3.putLong("user_id", k2Var.getUserConfig().e());
            bundle3.putInt("chatMode", 3);
            un unVar = new un(bundle3);
            unVar.r4 = gwVar.a;
            k2Var.presentFragment(unVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = mt0Var.e;
        ArrayList arrayList2 = mt0Var.f;
        if (i11 < arrayList.size()) {
            org.telegram.messenger.gw gwVar2 = (org.telegram.messenger.gw) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", k2Var.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            un unVar2 = new un(bundle4);
            unVar2.r4 = gwVar2.a;
            k2Var.presentFragment(unVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", k2Var.getUserConfig().e());
            bundle5.putInt("message_id", kjVar2.f1());
            org.telegram.ui.Components.jr0 jr0Var = new org.telegram.ui.Components.jr0(au0Var, bundle5, size);
            jr0Var.b8 = kjVar2.f1();
            k2Var.presentFragment(jr0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                un.v0((un) this.c, (TLRPC.TL_game) this.d, (org.telegram.messenger.kj) this.e, (String) this.f, this.b);
                break;
            default:
                org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.messenger.sz szVar = (org.telegram.messenger.sz) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i11 >= size) {
                        p21Var.k0.addAll(hashSet);
                        p21Var.q();
                        org.telegram.ui.Components.cc.a0(p21Var.s).U(org.telegram.messenger.dd.J0(hashSet.size(), "TopicsDeleted"), false, new ag.a3(p21Var, hashSet, arrayList, j10, 6), new org.telegram.ui.Components.hi0(p21Var, arrayList, szVar, 16)).j();
                        x1Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            p21Var.n(0L, false);
                        }
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    public /* synthetic */ lh(un unVar, TLRPC.TL_game tL_game, org.telegram.messenger.kj kjVar, String str, long j10) {
        this.a = 0;
        this.c = unVar;
        this.d = tL_game;
        this.e = kjVar;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ lh(org.telegram.ui.Components.p21 p21Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.messenger.sz szVar) {
        this.a = 2;
        this.c = p21Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = szVar;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
