package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.mv;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.m91;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements org.telegram.ui.ActionBar.p1, gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i3) {
        this.a = i3;
        this.c = (cs) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j10;
        this.f = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(final float f10, final float f11, int i3, View view) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j10;
        int i10 = i3;
        final ws0 ws0Var = (ws0) this.c;
        zp0 zp0Var = (zp0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
        ir0 ir0Var = ws0Var.T;
        hs0 hs0Var = ws0Var.U;
        jr0 jr0Var = ws0Var.d0;
        is0 is0Var = ws0Var.V;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        int i11 = zp0Var.F;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.pa) {
                if (!jr0Var.e.isEmpty()) {
                    i10 = ((Integer) jr0Var.e.get(i10)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = jr0Var.d.participants.participants.get(i10);
                if (i10 < 0 || i10 >= jr0Var.d.participants.participants.size()) {
                    return;
                }
                ws0Var.T0(chatParticipant, false, view);
                return;
            }
            u4.h0 adapter = zp0Var.h.getAdapter();
            pr0 pr0Var = ws0Var.m0;
            if (adapter == pr0Var) {
                TLObject E = pr0Var.E(i10);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = zi.C1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j10 == 0 || j10 == d2Var.getUserConfig().e()) {
                    return;
                }
                d2Var.presentFragment(new ProfileActivity(a1.g.j(j10, "user_id"), null));
                return;
            }
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.f6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.f6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                if (!chat.forum) {
                    d2Var.presentFragment(new wm(bundle));
                    return;
                } else {
                    HashSet hashSet = m91.r1;
                    d2Var.presentFragment(m91.I0(d2Var.getMessagesController(), d2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i11 == 1 && (view instanceof org.telegram.ui.Cells.g7)) {
            ws0Var.R0(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), zp0Var.F);
            return;
        }
        if (i11 == 3 && (view instanceof org.telegram.ui.Cells.j7)) {
            ws0Var.R0(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), zp0Var.F);
            return;
        }
        if ((i11 == 2 || i11 == 4) && (view instanceof org.telegram.ui.Cells.f7)) {
            ws0Var.R0(i10, view, ((org.telegram.ui.Cells.f7) view).getMessage(), zp0Var.F);
            return;
        }
        if (i11 == 5 && (view instanceof org.telegram.ui.Cells.h2)) {
            ws0Var.R0(i10, view, (zi) ((org.telegram.ui.Cells.h2) view).getParentObject(), zp0Var.F);
            return;
        }
        if (i11 == 0 && (view instanceof org.telegram.ui.Cells.n7)) {
            final org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            zi messageObject = n7Var.getMessageObject();
            if (messageObject != null && messageObject.q4()) {
                if (d2Var == null) {
                    return;
                }
                final int currentAccount = d2Var.getCurrentAccount();
                final hp s12 = hp.s1(currentAccount);
                final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
                s1Var.r(200L);
                s12.R0(new u10() { // from class: org.telegram.ui.Components.bp0
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.d2 d2Var2 = ws0.this.y1;
                        s1Var.c(200L);
                        final org.telegram.messenger.hp hpVar = s12;
                        final boolean z11 = ((org.telegram.messenger.h0) hpVar.x7.m.b).c && !TextUtils.isEmpty(hpVar.u6);
                        boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z11) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context2, d2Var2 == null ? null : d2Var2.getResourceProvider());
                            c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                            c2Var.e(org.telegram.messenger.bd.M0(2131748490, null), "", zArr[0], false, false);
                            c2Var.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                            frameLayout.addView(c2Var, b8.mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            c2Var.setOnClickListener(new w0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, d2Var2 == null ? null : d2Var2.getResourceProvider());
                        String M0 = org.telegram.messenger.bd.M0(2131748481, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                        s1Var2.S = M0;
                        s1Var2.U = org.telegram.messenger.bd.M0(z12 ? 2131748483 : 2131748484, null);
                        alertDialog$Builder.o(frameLayout);
                        s1Var2.H = 9;
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(z12 ? 2131748482 : 2131752589, null), null);
                        if (!z12) {
                            String M02 = org.telegram.messenger.bd.M0(2131748489, null);
                            final org.telegram.ui.Cells.n7 n7Var2 = n7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i12 = currentAccount;
                            alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.lp0
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i13) {
                                    TL_account.contentSettings contentsettings2;
                                    op0 op0Var = new op0(org.telegram.ui.Cells.n7.this, f12, f13);
                                    if (!zArr[0]) {
                                        op0Var.a(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z11 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        op0Var.a(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                        ThemeActivity.H0(i12, context2, new ei(hpVar, op0Var), T == null ? null : T.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (d2Var2 == null || d2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            d2Var2.showDialog(s1Var2);
                        }
                    }
                });
                return;
            }
            zi ziVar = n7Var.n;
            if (ziVar != null && ziVar.u2() && n7Var.j0 == 0.0f && !n7Var.n.N0) {
                n7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    ws0Var.R0(i10, view, messageObject, zp0Var.F);
                    return;
                }
                return;
            }
        }
        if (ws0.z0(i11) && (view instanceof org.telegram.ui.Cells.n7)) {
            zi messageObject2 = ((org.telegram.ui.Cells.n7) view).getMessageObject();
            if (messageObject2 != null) {
                ws0Var.R0(i10, view, messageObject2, zp0Var.F);
                return;
            }
            return;
        }
        int i12 = zp0Var.F;
        if (i12 == 10) {
            if (((view instanceof org.telegram.ui.Cells.f6) || f11 < org.telegram.messenger.g0.L(60.0f)) && i10 >= 0 && i10 < ir0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ir0Var.d.get(i10);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                d2Var.presentFragment(new wm(bundle2));
                return;
            }
            return;
        }
        if (i12 != 11) {
            if (i12 == 15 && (view instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                zi messageObject3 = q1Var.getMessageObject();
                zp0Var.h.C0();
                int currentAccount2 = d2Var.getCurrentAccount();
                hp messagesController = d2Var.getMessagesController();
                long j11 = this.b;
                TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j11));
                f60 F = f60.F(zp0Var, e6Var, q1Var);
                F.c0 = true;
                F.V(messageObject3.Q3() ? 5 : 3);
                F.c(R.drawable.msg_message, bd.M0(2131754877, null), new ai.r1(ws0Var, j11, messageObject3, 25), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia o12 = zi.o1(messageObject3.k);
                    if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                        z10 = ((TLRPC.TL_messageMediaPoll) o12).poll.closed;
                        if (!z10) {
                            if (messageObject3.C()) {
                                F.c(R.drawable.msg_unvote, bd.M0(2131743834, null), new cp0(ws0Var, e6Var, currentAccount2, messageObject3), false);
                            }
                            if (!zi.m3(messageObject3.k) && ((messageObject3.O3() && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) || (org.telegram.messenger.t3.T(M0) && !M0.megagroup && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                F.c(R.drawable.msg_pollstop, bd.M0(messageObject3.d4() ? 2131744836 : 2131744841, null), new cp0(ws0Var, e6Var, messageObject3, currentAccount2), false);
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
        if (zp0Var.h.getAdapter() != is0Var) {
            if (ws0Var.F1) {
                if (hs0Var.w.E == 0) {
                    hs0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i10 < 0 || i10 >= hs0Var.f.size()) {
                return;
            }
            mv mvVar = (mv) hs0Var.f.get(i10);
            bundle3.putLong("user_id", d2Var.getUserConfig().e());
            bundle3.putInt("chatMode", 3);
            wm wmVar = new wm(bundle3);
            wmVar.s4 = mvVar.a;
            d2Var.presentFragment(wmVar);
            return;
        }
        if (i10 < 0) {
            return;
        }
        ArrayList arrayList = is0Var.e;
        ArrayList arrayList2 = is0Var.f;
        if (i10 < arrayList.size()) {
            mv mvVar2 = (mv) arrayList.get(i10);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", d2Var.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            wm wmVar2 = new wm(bundle4);
            wmVar2.s4 = mvVar2.a;
            d2Var.presentFragment(wmVar2);
            return;
        }
        int size = i10 - arrayList.size();
        if (size < arrayList2.size()) {
            zi ziVar2 = (zi) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", d2Var.getUserConfig().e());
            bundle5.putInt("message_id", ziVar2.f1());
            hq0 hq0Var = new hq0(ws0Var, bundle5, size);
            hq0Var.c8 = ziVar2.f1();
            d2Var.presentFragment(hq0Var);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                wm.i1((wm) this.c, (TLRPC.TL_game) this.d, (zi) this.e, (String) this.f, this.b);
                break;
            default:
                g11 g11Var = (g11) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                go goVar = (go) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j10 = this.b;
                    if (i10 >= size) {
                        g11Var.l0.addAll(hashSet);
                        g11Var.q();
                        org.telegram.ui.Components.fc.a0(g11Var.s).U(bd.K0(hashSet.size(), "TopicsDeleted"), false, new l2(g11Var, hashSet, arrayList, j10, 18), new j50(g11Var, arrayList, goVar, 27)).j();
                        s1Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j10 == ((Integer) obj).intValue()) {
                            g11Var.n(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ x3(wm wmVar, TLRPC.TL_game tL_game, zi ziVar, String str, long j10) {
        this.a = 1;
        this.c = wmVar;
        this.d = tL_game;
        this.e = ziVar;
        this.f = str;
        this.b = j10;
    }

    public /* synthetic */ x3(g11 g11Var, ArrayList arrayList, long j10, HashSet hashSet, go goVar) {
        this.a = 3;
        this.c = g11Var;
        this.d = arrayList;
        this.b = j10;
        this.e = hashSet;
        this.f = goVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
