// default package

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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jp1 implements ee, g59, ew4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ jm7 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jp1(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = (jm7) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
    }

    @Override // ew4
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        wsa wsaVar = (wsa) this.c;
        fw4 fw4Var = (fw4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        ok okVar = (ok) this.f;
        wsaVar.getClass();
        if (fw4Var.F1) {
            return;
        }
        wsaVar.f2.setLoading(true);
        if (!fw4Var.F1) {
            fw4Var.F1 = true;
            fw4Var.B1.h(true);
        }
        jva u = jva.u(wsaVar.a, okVar);
        long j = this.b;
        u.E(tL_starGiftUnique, j, tL_textWithEntities, z, new tpa(wsaVar, fw4Var, okVar, tL_starGiftUnique, j, tL_textWithEntities, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0355  */
    @Override // g59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final float f, final float f2, int i, View view) {
        boolean z;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j;
        final nha nhaVar = (nha) this.c;
        pea peaVar = (pea) this.d;
        final Context context = (Context) this.e;
        ylb ylbVar = (ylb) this.f;
        zfa zfaVar = nhaVar.T;
        yga ygaVar = nhaVar.U;
        zga zgaVar = nhaVar.V;
        aga agaVar = nhaVar.d0;
        d dVar = nhaVar.y1;
        int i2 = peaVar.F;
        if (i2 == 7) {
            if (view instanceof w8c) {
                int intValue = !agaVar.e.isEmpty() ? ((Integer) agaVar.e.get(i)).intValue() : i;
                TLRPC.ChatParticipant chatParticipant = agaVar.d.participants.participants.get(intValue);
                if (intValue < 0 || intValue >= agaVar.d.participants.participants.size()) {
                    return;
                }
                nhaVar.O0(chatParticipant, false, view);
                return;
            }
            y59 adapter = peaVar.h.getAdapter();
            gga ggaVar = nhaVar.m0;
            if (adapter == ggaVar) {
                TLObject E = ggaVar.E(i);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j = k47.B1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j == 0 || j == dVar.getUserConfig().e()) {
                    return;
                }
                dVar.presentFragment(new ProfileActivity(kt6.k(j, "user_id"), null));
                return;
            }
            return;
        }
        if (i2 == 6) {
            if (view instanceof fj6) {
                Bundle bundle = new Bundle();
                bundle.putLongArray("result", new long[]{nhaVar.S.F()});
                uc5 uc5Var = new uc5(bundle);
                uc5Var.Z = new xea(nhaVar);
                dVar.presentFragment(uc5Var);
                return;
            }
            if (view instanceof ut8) {
                TLRPC.Chat chat = ((ut8) view).getChat();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", chat.id);
                if (dVar.getMessagesController().A(bundle2, dVar, null, null)) {
                    if (!chat.forum) {
                        dVar.presentFragment(new yv1(bundle2));
                        return;
                    } else {
                        HashSet hashSet = sxb.s1;
                        dVar.presentFragment(sxb.F0(dVar.getMessagesController(), dVar.getMessagesStorage(), bundle2));
                        return;
                    }
                }
                return;
            }
        }
        if (i2 == 1 && (view instanceof ida)) {
            nhaVar.M0(i, view, ((ida) view).getMessage(), peaVar.F);
            return;
        }
        if (i2 == 3 && (view instanceof lda)) {
            nhaVar.M0(i, view, ((lda) view).getMessage(), peaVar.F);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof eda)) {
            nhaVar.M0(i, view, ((eda) view).getMessage(), peaVar.F);
            return;
        }
        if (i2 == 5 && (view instanceof lx2)) {
            nhaVar.M0(i, view, (k47) ((lx2) view).getParentObject(), peaVar.F);
            return;
        }
        if (i2 == 0 && (view instanceof sha)) {
            final sha shaVar = (sha) view;
            k47 messageObject = shaVar.getMessageObject();
            if (messageObject != null && messageObject.o4()) {
                if (dVar != null) {
                    final int currentAccount = dVar.getCurrentAccount();
                    final oc7 r1 = oc7.r1(currentAccount);
                    final he heVar = new he(3, null, context);
                    heVar.q(200L);
                    r1.Q0(new qac() { // from class: vda
                        @Override // qac
                        public final void a(Object obj) {
                            nha nhaVar2 = nha.this;
                            he heVar2 = heVar;
                            final oc7 oc7Var = r1;
                            final Context context2 = context;
                            final sha shaVar2 = shaVar;
                            final float f3 = f;
                            final float f4 = f2;
                            final int i3 = currentAccount;
                            final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                            heVar2.b(200L);
                            final boolean z2 = oc7Var.l4.l.f && !TextUtils.isEmpty(oc7Var.l4.P2.f);
                            boolean z3 = (contentsettings == null || !contentsettings.sensitive_can_change) && z2;
                            final boolean[] zArr = new boolean[1];
                            FrameLayout frameLayout = new FrameLayout(context2);
                            if (z2) {
                                zArr[0] = true;
                            } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                                d dVar2 = nhaVar2.y1;
                                oh2 oh2Var = new oh2(1, dVar2 == null ? null : dVar2.getResourceProvider(), context2);
                                oh2Var.setBackground(cmb.L0(false));
                                oh2Var.e(jb6.M0(2131748239, null), "", zArr[0], false, false);
                                oh2Var.setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                                frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                oh2Var.setOnClickListener(new gf(zArr, (byte) 14));
                            }
                            d dVar3 = nhaVar2.y1;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dVar3 == null ? null : dVar3.getResourceProvider(), context2);
                            alertDialog$Builder.a.S = jb6.M0(2131748230, null);
                            alertDialog$Builder.a.U = jb6.M0(z3 ? 2131748232 : 2131748233, null);
                            alertDialog$Builder.n(frameLayout);
                            alertDialog$Builder.a.H = (byte) 9;
                            alertDialog$Builder.g(jb6.M0(z3 ? 2131748231 : 2131752542, null), null);
                            if (!z3) {
                                alertDialog$Builder.j(jb6.M0(2131748238, null), new ee() { // from class: fea
                                    @Override // ee
                                    public final void r(he heVar3, int i4) {
                                        TL_account.contentSettings contentsettings2;
                                        xt5 xt5Var = new xt5(sha.this, f3, f4, (byte) 1);
                                        if (!zArr[0]) {
                                            xt5Var.a(Boolean.FALSE);
                                            return;
                                        }
                                        if (!z2 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                            xt5Var.a(Boolean.TRUE);
                                            return;
                                        }
                                        d S = LaunchActivity.S();
                                        ThemeActivity.H0(i3, S == null ? null : S.getResourceProvider(), new ts9(oc7Var, xt5Var, (byte) 5), context2);
                                    }
                                });
                            }
                            d dVar4 = nhaVar2.y1;
                            if (dVar4 == null || dVar4.getContext() == null) {
                                alertDialog$Builder.o();
                            } else {
                                nhaVar2.y1.showDialog(alertDialog$Builder.a);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            k47 k47Var = shaVar.n;
            if (k47Var != null && k47Var.t2() && shaVar.j0 == 0.0f && !shaVar.n.P0) {
                shaVar.n(f, f2);
                return;
            } else {
                if (messageObject != null) {
                    nhaVar.M0(i, view, messageObject, peaVar.F);
                    return;
                }
                return;
            }
        }
        if (nha.j0(i2) && (view instanceof sha)) {
            k47 messageObject2 = ((sha) view).getMessageObject();
            if (messageObject2 != null) {
                nhaVar.M0(i, view, messageObject2, peaVar.F);
                return;
            }
            return;
        }
        int i3 = peaVar.F;
        if (i3 == 10) {
            if (((view instanceof ut8) || f2 < gm.L(60.0f)) && i >= 0 && i < zfaVar.d.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) zfaVar.d.get(i);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                dVar.presentFragment(new yv1(bundle3));
                return;
            }
            return;
        }
        if (i3 != 11) {
            if (i3 == 15 && (view instanceof rc2)) {
                rc2 rc2Var = (rc2) view;
                k47 messageObject3 = rc2Var.getMessageObject();
                peaVar.h.D0();
                int currentAccount2 = dVar.getCurrentAccount();
                oc7 messagesController = dVar.getMessagesController();
                long j2 = this.b;
                TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j2));
                bu5 G = bu5.G(peaVar, ylbVar, rc2Var);
                G.f0 = true;
                G.W(messageObject3.O3() ? 5 : 3);
                G.b(R.drawable.msg_message, jb6.M0(2131754877, null), new hq6((Object) nhaVar, j2, (Object) messageObject3, (byte) 24), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia n1 = k47.n1(messageObject3.k);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        z = ((TLRPC.TL_messageMediaPoll) n1).poll.closed;
                        if (!z) {
                            if (messageObject3.C()) {
                                G.b(R.drawable.msg_unvote, jb6.M0(2131743511, null), new wda(nhaVar, ylbVar, currentAccount2, messageObject3), false);
                            }
                            if (!k47.l3(messageObject3.k) && ((messageObject3.N3() && (!sd2.T(L0) || L0.megagroup)) || (sd2.T(L0) && !L0.megagroup && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                G.b(R.drawable.msg_pollstop, jb6.M0(messageObject3.b4() ? 2131744515 : 2131744520, null), new wda(nhaVar, ylbVar, messageObject3, currentAccount2), false);
                            }
                        }
                        G.a0();
                        return;
                    }
                }
                z = false;
                if (!z) {
                }
                G.a0();
                return;
            }
            return;
        }
        if (peaVar.h.getAdapter() != zgaVar) {
            if (nhaVar.F1) {
                if (ygaVar.w.E == 0) {
                    ygaVar.E(view);
                    return;
                }
                return;
            }
            Bundle bundle4 = new Bundle();
            if (i < 0 || i >= ygaVar.f.size()) {
                return;
            }
            vr9 vr9Var = (vr9) ygaVar.f.get(i);
            bundle4.putLong("user_id", dVar.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            yv1 yv1Var = new yv1(bundle4);
            yv1Var.s4 = vr9Var.a;
            dVar.presentFragment(yv1Var);
            return;
        }
        if (i >= 0) {
            ArrayList arrayList = zgaVar.e;
            ArrayList arrayList2 = zgaVar.f;
            int size = arrayList.size();
            ArrayList arrayList3 = zgaVar.e;
            if (i < size) {
                vr9 vr9Var2 = (vr9) arrayList3.get(i);
                Bundle bundle5 = new Bundle();
                bundle5.putLong("user_id", dVar.getUserConfig().e());
                bundle5.putInt("chatMode", 3);
                yv1 yv1Var2 = new yv1(bundle5);
                yv1Var2.s4 = vr9Var2.a;
                dVar.presentFragment(yv1Var2);
                return;
            }
            int size2 = i - arrayList3.size();
            if (size2 < arrayList2.size()) {
                k47 k47Var2 = (k47) arrayList2.get(size2);
                Bundle bundle6 = new Bundle();
                bundle6.putLong("user_id", dVar.getUserConfig().e());
                bundle6.putInt("message_id", k47Var2.e1());
                yea yeaVar = new yea(nhaVar, bundle6, size2);
                yeaVar.d8 = k47Var2.e1();
                dVar.presentFragment(yeaVar);
            }
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                ((yv1) jm7Var).F9((TLRPC.TL_game) obj3, (k47) obj2, (String) obj, this.b);
                break;
            case 1:
            default:
                mzb mzbVar = (mzb) jm7Var;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                jd jdVar = (jd) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.b;
                    if (i2 >= size) {
                        mzbVar.l0.addAll(hashSet);
                        mzbVar.n();
                        c41.b0(mzbVar.s).U(jb6.J0(hashSet.size(), "TopicsDeleted"), false, new nz8((Object) mzbVar, (Object) hashSet, (Object) arrayList, j, (byte) 17), new b7b(mzbVar, arrayList, jdVar)).j();
                        heVar.dismiss();
                        break;
                    } else {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj4).intValue()) {
                            mzbVar.k(0L, false);
                        }
                    }
                }
            case 2:
                ((wsa) jm7Var).j1(this.b, ((TL_stars.starGiftDepositPayload[]) obj3)[0], ((long[]) obj2)[0], heVar.g(i, true, true), (yw4) obj);
                break;
        }
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    public /* synthetic */ jp1(wsa wsaVar, long j, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, yw4 yw4Var) {
        this.a = (byte) 2;
        this.c = wsaVar;
        this.b = j;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = yw4Var;
    }

    public /* synthetic */ jp1(mzb mzbVar, ArrayList arrayList, long j, HashSet hashSet, jd jdVar) {
        this.a = (byte) 4;
        this.c = mzbVar;
        this.d = arrayList;
        this.b = j;
        this.e = hashSet;
        this.f = jdVar;
    }

    public /* synthetic */ jp1(yv1 yv1Var, TLRPC.TL_game tL_game, k47 k47Var, String str, long j) {
        this.a = (byte) 0;
        this.c = yv1Var;
        this.d = tL_game;
        this.e = k47Var;
        this.f = str;
        this.b = j;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
