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
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bn;
import org.telegram.ui.f50;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements org.telegram.ui.ActionBar.r1, bi.f1, pj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.a2 a2Var) {
        this.a = 0;
        this.b = f6Var;
        this.c = j3;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = a2Var;
    }

    @Override // bi.f1
    public void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.b;
        bi.g1 g1Var = (bi.g1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        cg.b bVar = (cg.b) this.f;
        if (g1Var.G1) {
            return;
        }
        f6Var.g2.setLoading(true);
        if (!g1Var.G1) {
            g1Var.G1 = true;
            g1Var.C1.g(true);
        }
        x8 x10 = x8.x(f6Var.a, bVar);
        long j3 = this.c;
        x10.H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new r1(f6Var, g1Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10));
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(final float f10, final float f11, int i7, View view) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        int i10 = i7;
        final gt0 gt0Var = (gt0) this.b;
        iq0 iq0Var = (iq0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f;
        sr0 sr0Var = gt0Var.T;
        rs0 rs0Var = gt0Var.U;
        tr0 tr0Var = gt0Var.d0;
        ss0 ss0Var = gt0Var.V;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        int i11 = iq0Var.F;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.qa) {
                if (!tr0Var.e.isEmpty()) {
                    i10 = ((Integer) tr0Var.e.get(i10)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = tr0Var.d.participants.participants.get(i10);
                if (i10 < 0 || i10 >= tr0Var.d.participants.participants.size()) {
                    return;
                }
                gt0Var.U0(chatParticipant, false, view);
                return;
            }
            v4.i0 adapter = iq0Var.h.getAdapter();
            zr0 zr0Var = gt0Var.m0;
            if (adapter == zr0Var) {
                TLObject E = zr0Var.E(i10);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = fj.B1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j3 == 0 || j3 == h2Var.getUserConfig().e()) {
                    return;
                }
                h2Var.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            }
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.x4)) {
            Bundle bundle = new Bundle();
            bundle.putLongArray("result", new long[]{gt0Var.S.F()});
            f50 f50Var = new f50(bundle);
            f50Var.Z = new qq0(gt0Var);
            h2Var.presentFragment(f50Var);
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.g6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.g6) view).getChat();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", chat.id);
            if (h2Var.getMessagesController().E(bundle2, h2Var, null, null)) {
                if (!chat.forum) {
                    h2Var.presentFragment(new bn(bundle2));
                    return;
                } else {
                    HashSet hashSet = y91.s1;
                    h2Var.presentFragment(y91.I0(h2Var.getMessagesController(), h2Var.getMessagesStorage(), bundle2));
                    return;
                }
            }
            return;
        }
        if (i11 == 1 && (view instanceof org.telegram.ui.Cells.h7)) {
            gt0Var.S0(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), iq0Var.F);
            return;
        }
        if (i11 == 3 && (view instanceof org.telegram.ui.Cells.k7)) {
            gt0Var.S0(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), iq0Var.F);
            return;
        }
        if ((i11 == 2 || i11 == 4) && (view instanceof org.telegram.ui.Cells.g7)) {
            gt0Var.S0(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), iq0Var.F);
            return;
        }
        if (i11 == 5 && (view instanceof org.telegram.ui.Cells.h2)) {
            gt0Var.S0(i10, view, (fj) ((org.telegram.ui.Cells.h2) view).getParentObject(), iq0Var.F);
            return;
        }
        if (i11 == 0 && (view instanceof org.telegram.ui.Cells.o7)) {
            final org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            fj messageObject = o7Var.getMessageObject();
            if (messageObject != null && messageObject.p4()) {
                if (h2Var == null) {
                    return;
                }
                final int currentAccount = h2Var.getCurrentAccount();
                final mp u12 = mp.u1(currentAccount);
                final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
                u1Var.r(200L);
                u12.T0(new x10() { // from class: org.telegram.ui.Components.mp0
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.h2 h2Var2 = gt0.this.y1;
                        u1Var.c(200L);
                        final org.telegram.messenger.mp mpVar = u12;
                        final boolean z11 = ((org.telegram.messenger.h0) mpVar.A7.m.b).c && !TextUtils.isEmpty(mpVar.x6);
                        boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z11) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context2, h2Var2 == null ? null : h2Var2.getResourceProvider());
                            c2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                            c2Var.e(org.telegram.messenger.gd.M0(2131748290, null), "", zArr[0], false, false);
                            c2Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                            frameLayout.addView(c2Var, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            c2Var.setOnClickListener(new f1(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, h2Var2 == null ? null : h2Var2.getResourceProvider());
                        String M0 = org.telegram.messenger.gd.M0(2131748281, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                        u1Var2.S = M0;
                        u1Var2.U = org.telegram.messenger.gd.M0(z12 ? 2131748283 : 2131748284, null);
                        alertDialog$Builder.o(frameLayout);
                        u1Var2.H = 9;
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(z12 ? 2131748282 : 2131752578, null), null);
                        if (!z12) {
                            String M02 = org.telegram.messenger.gd.M0(2131748289, null);
                            final org.telegram.ui.Cells.o7 o7Var2 = o7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i12 = currentAccount;
                            alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.xp0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var3, int i13) {
                                    TL_account.contentSettings contentsettings2;
                                    t60 t60Var = new t60(f12, f13, 1, org.telegram.ui.Cells.o7.this);
                                    if (!zArr[0]) {
                                        t60Var.a(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z11 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        t60Var.a(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                        ThemeActivity.H0(i12, context2, new ph(9, mpVar, t60Var), T == null ? null : T.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (h2Var2 == null || h2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            h2Var2.showDialog(u1Var2);
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
                    gt0Var.S0(i10, view, messageObject, iq0Var.F);
                    return;
                }
                return;
            }
        }
        if (gt0.z0(i11) && (view instanceof org.telegram.ui.Cells.o7)) {
            fj messageObject2 = ((org.telegram.ui.Cells.o7) view).getMessageObject();
            if (messageObject2 != null) {
                gt0Var.S0(i10, view, messageObject2, iq0Var.F);
                return;
            }
            return;
        }
        int i12 = iq0Var.F;
        if (i12 == 10) {
            if (((view instanceof org.telegram.ui.Cells.g6) || f11 < org.telegram.messenger.g0.L(60.0f)) && i10 >= 0 && i10 < sr0Var.d.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) sr0Var.d.get(i10);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                h2Var.presentFragment(new bn(bundle3));
                return;
            }
            return;
        }
        if (i12 != 11) {
            if (i12 == 15 && (view instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                fj messageObject3 = q1Var.getMessageObject();
                iq0Var.h.C0();
                int currentAccount2 = h2Var.getCurrentAccount();
                mp messagesController = h2Var.getMessagesController();
                long j10 = this.c;
                TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j10));
                y60 G = y60.G(iq0Var, i6Var, q1Var);
                G.f0 = true;
                G.W(messageObject3.P3() ? 5 : 3);
                G.c(R.drawable.msg_message, gd.M0(2131754877, null), new bi.m2(gt0Var, j10, messageObject3, 25), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia n1 = fj.n1(messageObject3.k);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        z10 = ((TLRPC.TL_messageMediaPoll) n1).poll.closed;
                        if (!z10) {
                            if (messageObject3.C()) {
                                G.c(R.drawable.msg_unvote, gd.M0(2131743587, null), new np0(gt0Var, i6Var, currentAccount2, messageObject3), false);
                            }
                            if (!fj.l3(messageObject3.k) && ((messageObject3.N3() && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) || (org.telegram.messenger.v3.T(O0) && !O0.megagroup && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                G.c(R.drawable.msg_pollstop, gd.M0(messageObject3.c4() ? 2131744591 : 2131744596, null), new np0(gt0Var, i6Var, messageObject3, currentAccount2), false);
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
        if (iq0Var.h.getAdapter() != ss0Var) {
            if (gt0Var.F1) {
                if (rs0Var.w.E == 0) {
                    rs0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle4 = new Bundle();
            if (i10 < 0 || i10 >= rs0Var.f.size()) {
                return;
            }
            ov ovVar = (ov) rs0Var.f.get(i10);
            bundle4.putLong("user_id", h2Var.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            bn bnVar = new bn(bundle4);
            bnVar.s4 = ovVar.a;
            h2Var.presentFragment(bnVar);
            return;
        }
        if (i10 < 0) {
            return;
        }
        ArrayList arrayList = ss0Var.e;
        ArrayList arrayList2 = ss0Var.f;
        if (i10 < arrayList.size()) {
            ov ovVar2 = (ov) arrayList.get(i10);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", h2Var.getUserConfig().e());
            bundle5.putInt("chatMode", 3);
            bn bnVar2 = new bn(bundle5);
            bnVar2.s4 = ovVar2.a;
            h2Var.presentFragment(bnVar2);
            return;
        }
        int size = i10 - arrayList.size();
        if (size < arrayList2.size()) {
            fj fjVar2 = (fj) arrayList2.get(size);
            Bundle bundle6 = new Bundle();
            bundle6.putLong("user_id", h2Var.getUserConfig().e());
            bundle6.putInt("message_id", fjVar2.e1());
            rq0 rq0Var = new rq0(gt0Var, bundle6, size);
            rq0Var.d8 = fjVar2.e1();
            h2Var.presentFragment(rq0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                long[] jArr = (long[]) this.e;
                bi.a2 a2Var = (bi.a2) this.f;
                f6Var.getClass();
                f6Var.v1(this.c, stargiftdepositpayloadArr[0], jArr[0], u1Var.h(i7, true, true), a2Var);
                break;
            case 1:
            default:
                z11 z11Var = (z11) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                me meVar = (me) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.c;
                    if (i10 >= size) {
                        z11Var.l0.addAll(hashSet);
                        z11Var.q();
                        org.telegram.ui.Components.lc.b0(z11Var.s).U(gd.K0(hashSet.size(), "TopicsDeleted"), false, new i2(z11Var, hashSet, arrayList, j3, 17), new hn0(z11Var, arrayList, meVar, 11)).j();
                        u1Var.dismiss();
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

    public /* synthetic */ t1(z11 z11Var, ArrayList arrayList, long j3, HashSet hashSet, me meVar) {
        this.a = 4;
        this.b = z11Var;
        this.d = arrayList;
        this.c = j3;
        this.e = hashSet;
        this.f = meVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
