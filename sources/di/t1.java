package di;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ov;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bn;
import org.telegram.ui.e50;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements org.telegram.ui.ActionBar.q1, bi.j1, rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.f2 f2Var) {
        this.a = 0;
        this.b = f6Var;
        this.c = j3;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = f2Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // bi.j1
    public void a(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.b;
        bi.k1 k1Var = (bi.k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        cg.b bVar = (cg.b) this.f;
        if (k1Var.G1) {
            return;
        }
        f6Var.g2.setLoading(true);
        if (!k1Var.G1) {
            k1Var.G1 = true;
            k1Var.C1.h(true);
        }
        y8 x10 = y8.x(f6Var.a, bVar);
        long j3 = this.c;
        x10.H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new r1(f6Var, k1Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(final float f10, final float f11, int i7, View view) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        int i10 = i7;
        final it0 it0Var = (it0) this.b;
        jq0 jq0Var = (jq0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f;
        tr0 tr0Var = it0Var.T;
        ts0 ts0Var = it0Var.U;
        ur0 ur0Var = it0Var.d0;
        us0 us0Var = it0Var.V;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        int i11 = jq0Var.F;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.sa) {
                if (!ur0Var.e.isEmpty()) {
                    i10 = ((Integer) ur0Var.e.get(i10)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = ur0Var.d.participants.participants.get(i10);
                if (i10 < 0 || i10 >= ur0Var.d.participants.participants.size()) {
                    return;
                }
                it0Var.U0(chatParticipant, false, view);
                return;
            }
            v4.i0 adapter = jq0Var.h.getAdapter();
            bs0 bs0Var = it0Var.m0;
            if (adapter == bs0Var) {
                TLObject E = bs0Var.E(i10);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = fj.B1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j3 == 0 || j3 == g2Var.getUserConfig().e()) {
                    return;
                }
                g2Var.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            }
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.y4)) {
            Bundle bundle = new Bundle();
            bundle.putLongArray("result", new long[]{it0Var.S.F()});
            e50 e50Var = new e50(bundle);
            e50Var.Z = new rq0(it0Var);
            g2Var.presentFragment(e50Var);
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.g6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.g6) view).getChat();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", chat.id);
            if (g2Var.getMessagesController().E(bundle2, g2Var, null, null)) {
                if (!chat.forum) {
                    g2Var.presentFragment(new bn(bundle2));
                    return;
                } else {
                    HashSet hashSet = w91.s1;
                    g2Var.presentFragment(w91.I0(g2Var.getMessagesController(), g2Var.getMessagesStorage(), bundle2));
                    return;
                }
            }
            return;
        }
        if (i11 == 1 && (view instanceof org.telegram.ui.Cells.h7)) {
            it0Var.S0(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), jq0Var.F);
            return;
        }
        if (i11 == 3 && (view instanceof org.telegram.ui.Cells.k7)) {
            it0Var.S0(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), jq0Var.F);
            return;
        }
        if ((i11 == 2 || i11 == 4) && (view instanceof org.telegram.ui.Cells.g7)) {
            it0Var.S0(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), jq0Var.F);
            return;
        }
        if (i11 == 5 && (view instanceof org.telegram.ui.Cells.i2)) {
            it0Var.S0(i10, view, (fj) ((org.telegram.ui.Cells.i2) view).getParentObject(), jq0Var.F);
            return;
        }
        if (i11 == 0 && (view instanceof org.telegram.ui.Cells.o7)) {
            final org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            fj messageObject = o7Var.getMessageObject();
            if (messageObject != null && messageObject.p4()) {
                if (g2Var == null) {
                    return;
                }
                final int currentAccount = g2Var.getCurrentAccount();
                final mp u12 = mp.u1(currentAccount);
                final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
                t1Var.r(200L);
                u12.T0(new w10() { // from class: org.telegram.ui.Components.np0
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.g2 g2Var2 = it0.this.y1;
                        t1Var.c(200L);
                        final org.telegram.messenger.mp mpVar = u12;
                        final boolean z11 = ((org.telegram.messenger.h0) mpVar.A7.m.b).c && !TextUtils.isEmpty(mpVar.x6);
                        boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z11) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context2, g2Var2 == null ? null : g2Var2.getResourceProvider());
                            d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                            d2Var.e(org.telegram.messenger.gd.N0(2131748289, null), "", zArr[0], false, false);
                            d2Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                            frameLayout.addView(d2Var, c8.na.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            d2Var.setOnClickListener(new f1(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, g2Var2 == null ? null : g2Var2.getResourceProvider());
                        String N0 = org.telegram.messenger.gd.N0(2131748280, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                        t1Var2.S = N0;
                        t1Var2.U = org.telegram.messenger.gd.N0(z12 ? 2131748282 : 2131748283, null);
                        alertDialog$Builder.o(frameLayout);
                        t1Var2.H = 9;
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(z12 ? 2131748281 : 2131752577, null), null);
                        if (!z12) {
                            String N02 = org.telegram.messenger.gd.N0(2131748288, null);
                            final org.telegram.ui.Cells.o7 o7Var2 = o7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i12 = currentAccount;
                            alertDialog$Builder.k(N02, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.yp0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var3, int i13) {
                                    TL_account.contentSettings contentsettings2;
                                    s60 s60Var = new s60(f12, f13, 1, org.telegram.ui.Cells.o7.this);
                                    if (!zArr[0]) {
                                        s60Var.a(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z11 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        s60Var.a(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                        ThemeActivity.H0(i12, context2, new ph(10, mpVar, s60Var), T == null ? null : T.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (g2Var2 == null || g2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            g2Var2.showDialog(t1Var2);
                        }
                    }
                });
                return;
            }
            fj fjVar = o7Var.n;
            if (fjVar != null && fjVar.t2() && o7Var.j0 == 0.0f && !o7Var.n.P0) {
                o7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    it0Var.S0(i10, view, messageObject, jq0Var.F);
                    return;
                }
                return;
            }
        }
        if (it0.z0(i11) && (view instanceof org.telegram.ui.Cells.o7)) {
            fj messageObject2 = ((org.telegram.ui.Cells.o7) view).getMessageObject();
            if (messageObject2 != null) {
                it0Var.S0(i10, view, messageObject2, jq0Var.F);
                return;
            }
            return;
        }
        int i12 = jq0Var.F;
        if (i12 == 10) {
            if (((view instanceof org.telegram.ui.Cells.g6) || f11 < org.telegram.messenger.g0.L(60.0f)) && i10 >= 0 && i10 < tr0Var.d.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) tr0Var.d.get(i10);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                g2Var.presentFragment(new bn(bundle3));
                return;
            }
            return;
        }
        if (i12 != 11) {
            if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r1)) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                fj messageObject3 = r1Var.getMessageObject();
                jq0Var.h.C0();
                int currentAccount2 = g2Var.getCurrentAccount();
                mp messagesController = g2Var.getMessagesController();
                long j10 = this.c;
                TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j10));
                x60 G = x60.G(jq0Var, i6Var, r1Var);
                G.f0 = true;
                G.W(messageObject3.P3() ? 5 : 3);
                G.c(R.drawable.msg_message, gd.N0(2131754877, null), new bi.s2(it0Var, j10, messageObject3, 25), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia n1 = fj.n1(messageObject3.k);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        z10 = ((TLRPC.TL_messageMediaPoll) n1).poll.closed;
                        if (!z10) {
                            if (messageObject3.C()) {
                                G.c(R.drawable.msg_unvote, gd.N0(2131743577, null), new op0(it0Var, i6Var, currentAccount2, messageObject3), false);
                            }
                            if (!fj.l3(messageObject3.k) && ((messageObject3.N3() && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) || (org.telegram.messenger.v3.T(O0) && !O0.megagroup && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                G.c(R.drawable.msg_pollstop, gd.N0(messageObject3.c4() ? 2131744585 : 2131744590, null), new op0(it0Var, i6Var, messageObject3, currentAccount2), false);
                            }
                        }
                        G.a0();
                        return;
                    }
                }
                z10 = false;
                if (!z10) {
                }
                G.a0();
                return;
            }
            return;
        }
        if (jq0Var.h.getAdapter() != us0Var) {
            if (it0Var.F1) {
                if (ts0Var.w.E == 0) {
                    ts0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle4 = new Bundle();
            if (i10 < 0 || i10 >= ts0Var.f.size()) {
                return;
            }
            ov ovVar = (ov) ts0Var.f.get(i10);
            bundle4.putLong("user_id", g2Var.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            bn bnVar = new bn(bundle4);
            bnVar.s4 = ovVar.a;
            g2Var.presentFragment(bnVar);
            return;
        }
        if (i10 < 0) {
            return;
        }
        ArrayList arrayList = us0Var.e;
        ArrayList arrayList2 = us0Var.f;
        if (i10 < arrayList.size()) {
            ov ovVar2 = (ov) arrayList.get(i10);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", g2Var.getUserConfig().e());
            bundle5.putInt("chatMode", 3);
            bn bnVar2 = new bn(bundle5);
            bnVar2.s4 = ovVar2.a;
            g2Var.presentFragment(bnVar2);
            return;
        }
        int size = i10 - arrayList.size();
        if (size < arrayList2.size()) {
            fj fjVar2 = (fj) arrayList2.get(size);
            Bundle bundle6 = new Bundle();
            bundle6.putLong("user_id", g2Var.getUserConfig().e());
            bundle6.putInt("message_id", fjVar2.e1());
            sq0 sq0Var = new sq0(it0Var, bundle6, size);
            sq0Var.d8 = fjVar2.e1();
            g2Var.presentFragment(sq0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                long[] jArr = (long[]) this.e;
                bi.f2 f2Var = (bi.f2) this.f;
                f6Var.getClass();
                f6Var.v1(this.c, stargiftdepositpayloadArr[0], jArr[0], t1Var.h(i7, true, true), f2Var);
                break;
            case 1:
            default:
                z11 z11Var = (z11) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                ne neVar = (ne) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.c;
                    if (i10 >= size) {
                        z11Var.l0.addAll(hashSet);
                        z11Var.q();
                        org.telegram.ui.Components.kc.b0(z11Var.s).U(gd.K0(hashSet.size(), "TopicsDeleted"), false, new j2(z11Var, hashSet, arrayList, j3, 17), new sh0(z11Var, arrayList, neVar, 15)).j();
                        t1Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            z11Var.n(0L, false);
                        }
                    }
                }
            case 2:
                bn.f1((bn) this.b, (TLRPC.TL_game) this.d, (fj) this.e, (String) this.f, this.c);
                break;
        }
    }

    public /* synthetic */ t1(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.b = (fs) obj;
        this.d = callback;
        this.e = obj2;
        this.c = j3;
        this.f = obj3;
    }

    public /* synthetic */ t1(bn bnVar, TLRPC.TL_game tL_game, fj fjVar, String str, long j3) {
        this.a = 2;
        this.b = bnVar;
        this.d = tL_game;
        this.e = fjVar;
        this.f = str;
        this.c = j3;
    }

    public /* synthetic */ t1(z11 z11Var, ArrayList arrayList, long j3, HashSet hashSet, ne neVar) {
        this.a = 4;
        this.b = z11Var;
        this.d = arrayList;
        this.c = j3;
        this.e = hashSet;
        this.f = neVar;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
