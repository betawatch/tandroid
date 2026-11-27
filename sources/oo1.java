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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class oo1 implements fd, s69, gw4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ fn7 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oo1(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = (fn7) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // gw4
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        wua wuaVar = (wua) this.c;
        hw4 hw4Var = (hw4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        pj pjVar = (pj) this.f;
        wuaVar.getClass();
        if (hw4Var.F1) {
            return;
        }
        wuaVar.f2.setLoading(true);
        hw4Var.G0(true);
        jxa u = jxa.u(wuaVar.a, pjVar);
        long j = this.b;
        u.E(tL_starGiftUnique, j, tL_textWithEntities, z, new pra(wuaVar, hw4Var, pjVar, tL_starGiftUnique, j, tL_textWithEntities, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0355  */
    @Override // s69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final float f, final float f2, int i, View view) {
        boolean z;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j;
        final eja ejaVar = (eja) this.c;
        gga ggaVar = (gga) this.d;
        final Context context = (Context) this.e;
        vnb vnbVar = (vnb) this.f;
        qha qhaVar = ejaVar.T;
        pia piaVar = ejaVar.U;
        qia qiaVar = ejaVar.V;
        rha rhaVar = ejaVar.d0;
        e eVar = ejaVar.y1;
        int i2 = ggaVar.F;
        if (i2 == 7) {
            if (view instanceof vac) {
                int intValue = !rhaVar.e.isEmpty() ? ((Integer) rhaVar.e.get(i)).intValue() : i;
                TLRPC.ChatParticipant chatParticipant = rhaVar.d.participants.participants.get(intValue);
                if (intValue < 0 || intValue >= rhaVar.d.participants.participants.size()) {
                    return;
                }
                ejaVar.O0(chatParticipant, false, view);
                return;
            }
            j79 adapter = ggaVar.h.getAdapter();
            xha xhaVar = ejaVar.m0;
            if (adapter == xhaVar) {
                TLObject E = xhaVar.E(i);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j = r47.B1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j == 0 || j == eVar.getUserConfig().e()) {
                    return;
                }
                eVar.presentFragment(new ProfileActivity(qu6.k(j, "user_id"), null));
                return;
            }
            return;
        }
        if (i2 == 6) {
            if (view instanceof ij6) {
                Bundle bundle = new Bundle();
                bundle.putLongArray("result", new long[]{ejaVar.S.F()});
                xc5 xc5Var = new xc5(bundle);
                xc5Var.Z = new oga(ejaVar);
                eVar.presentFragment(xc5Var);
                return;
            }
            if (view instanceof bv8) {
                TLRPC.Chat chat = ((bv8) view).getChat();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", chat.id);
                if (eVar.getMessagesController().C(bundle2, eVar, null, null)) {
                    if (!chat.forum) {
                        eVar.presentFragment(new zu1(bundle2));
                        return;
                    } else {
                        HashSet hashSet = tzb.s1;
                        eVar.presentFragment(tzb.F0(eVar.getMessagesController(), eVar.getMessagesStorage(), bundle2));
                        return;
                    }
                }
                return;
            }
        }
        if (i2 == 1 && (view instanceof zea)) {
            ejaVar.M0(i, view, ((zea) view).getMessage(), ggaVar.F);
            return;
        }
        if (i2 == 3 && (view instanceof cfa)) {
            ejaVar.M0(i, view, ((cfa) view).getMessage(), ggaVar.F);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof vea)) {
            ejaVar.M0(i, view, ((vea) view).getMessage(), ggaVar.F);
            return;
        }
        if (i2 == 5 && (view instanceof vw2)) {
            ejaVar.M0(i, view, (r47) ((vw2) view).getParentObject(), ggaVar.F);
            return;
        }
        if (i2 == 0 && (view instanceof jja)) {
            final jja jjaVar = (jja) view;
            r47 messageObject = jjaVar.getMessageObject();
            if (messageObject != null && messageObject.o4()) {
                if (eVar != null) {
                    final int currentAccount = eVar.getCurrentAccount();
                    final uc7 s1 = uc7.s1(currentAccount);
                    final id idVar = new id(3, null, context);
                    idVar.q(200L);
                    s1.R0(new pcc() { // from class: tfa
                        @Override // pcc
                        public final void a(Object obj) {
                            eja ejaVar2 = eja.this;
                            id idVar2 = idVar;
                            final uc7 uc7Var = s1;
                            final Context context2 = context;
                            final jja jjaVar2 = jjaVar;
                            final float f3 = f;
                            final float f4 = f2;
                            final int i3 = currentAccount;
                            final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                            idVar2.b(200L);
                            final boolean z2 = uc7Var.k4.l.f && !TextUtils.isEmpty(uc7Var.k4.X2.f);
                            boolean z3 = (contentsettings == null || !contentsettings.sensitive_can_change) && z2;
                            final boolean[] zArr = new boolean[1];
                            FrameLayout frameLayout = new FrameLayout(context2);
                            if (z2) {
                                zArr[0] = true;
                            } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                                e eVar2 = ejaVar2.y1;
                                sg2 sg2Var = new sg2(1, eVar2 == null ? null : eVar2.getResourceProvider(), context2);
                                sg2Var.setBackground(aob.L0(false));
                                sg2Var.e(ob6.M0(2131748236, null), "", zArr[0], false, false);
                                sg2Var.setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                sg2Var.setOnClickListener(new de(zArr, (byte) 14));
                            }
                            e eVar3 = ejaVar2.y1;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, eVar3 == null ? null : eVar3.getResourceProvider(), context2);
                            alertDialog$Builder.a.S = ob6.M0(2131748227, null);
                            alertDialog$Builder.a.U = ob6.M0(z3 ? 2131748229 : 2131748230, null);
                            alertDialog$Builder.n(frameLayout);
                            alertDialog$Builder.a.H = (byte) 9;
                            alertDialog$Builder.g(ob6.M0(z3 ? 2131748228 : 2131752570, null), null);
                            if (!z3) {
                                alertDialog$Builder.j(ob6.M0(2131748235, null), new fd() { // from class: wfa
                                    @Override // fd
                                    public final void w(id idVar3, int i4) {
                                        TL_account.contentSettings contentsettings2;
                                        au5 au5Var = new au5(jja.this, f3, f4, (byte) 1);
                                        if (!zArr[0]) {
                                            au5Var.a(Boolean.FALSE);
                                            return;
                                        }
                                        if (!z2 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                            au5Var.a(Boolean.TRUE);
                                            return;
                                        }
                                        e S = LaunchActivity.S();
                                        ThemeActivity.H0(i3, S == null ? null : S.getResourceProvider(), new ku9(uc7Var, au5Var, (byte) 5), context2);
                                    }
                                });
                            }
                            e eVar4 = ejaVar2.y1;
                            if (eVar4 == null || eVar4.getContext() == null) {
                                alertDialog$Builder.o();
                            } else {
                                ejaVar2.y1.showDialog(alertDialog$Builder.a);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            r47 r47Var = jjaVar.n;
            if (r47Var != null && r47Var.t2() && jjaVar.j0 == 0.0f && !jjaVar.n.P0) {
                jjaVar.n(f, f2);
                return;
            } else {
                if (messageObject != null) {
                    ejaVar.M0(i, view, messageObject, ggaVar.F);
                    return;
                }
                return;
            }
        }
        if (eja.j0(i2) && (view instanceof jja)) {
            r47 messageObject2 = ((jja) view).getMessageObject();
            if (messageObject2 != null) {
                ejaVar.M0(i, view, messageObject2, ggaVar.F);
                return;
            }
            return;
        }
        int i3 = ggaVar.F;
        if (i3 == 10) {
            if (((view instanceof bv8) || f2 < hl.L(60.0f)) && i >= 0 && i < qhaVar.d.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) qhaVar.d.get(i);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                eVar.presentFragment(new zu1(bundle3));
                return;
            }
            return;
        }
        if (i3 != 11) {
            if (i3 == 15 && (view instanceof wb2)) {
                wb2 wb2Var = (wb2) view;
                r47 messageObject3 = wb2Var.getMessageObject();
                ggaVar.h.E0();
                int currentAccount2 = eVar.getCurrentAccount();
                uc7 messagesController = eVar.getMessagesController();
                long j2 = this.b;
                TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j2));
                fu5 G = fu5.G(ggaVar, vnbVar, wb2Var);
                G.i0 = true;
                G.W(messageObject3.O3() ? 5 : 3);
                G.b(R.drawable.msg_message, ob6.M0(2131754873, null), new cq6((Object) ejaVar, j2, (Object) messageObject3, (byte) 24), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia n1 = r47.n1(messageObject3.k);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        z = ((TLRPC.TL_messageMediaPoll) n1).poll.closed;
                        if (!z) {
                            if (messageObject3.C()) {
                                G.b(R.drawable.msg_unvote, ob6.M0(2131743479, null), new ufa(ejaVar, vnbVar, currentAccount2, messageObject3), false);
                            }
                            if (!r47.l3(messageObject3.k) && ((messageObject3.N3() && (!xc2.T(M0) || M0.megagroup)) || (xc2.T(M0) && !M0.megagroup && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                G.b(R.drawable.msg_pollstop, ob6.M0(messageObject3.b4() ? 2131744483 : 2131744488, null), new ufa(ejaVar, vnbVar, messageObject3, currentAccount2), false);
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
        if (ggaVar.h.getAdapter() != qiaVar) {
            if (ejaVar.F1) {
                if (piaVar.w.E == 0) {
                    piaVar.E(view);
                    return;
                }
                return;
            }
            Bundle bundle4 = new Bundle();
            if (i < 0 || i >= piaVar.f.size()) {
                return;
            }
            mt9 mt9Var = (mt9) piaVar.f.get(i);
            bundle4.putLong("user_id", eVar.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            zu1 zu1Var = new zu1(bundle4);
            zu1Var.s4 = mt9Var.a;
            eVar.presentFragment(zu1Var);
            return;
        }
        if (i >= 0) {
            ArrayList arrayList = qiaVar.e;
            ArrayList arrayList2 = qiaVar.f;
            int size = arrayList.size();
            ArrayList arrayList3 = qiaVar.e;
            if (i < size) {
                mt9 mt9Var2 = (mt9) arrayList3.get(i);
                Bundle bundle5 = new Bundle();
                bundle5.putLong("user_id", eVar.getUserConfig().e());
                bundle5.putInt("chatMode", 3);
                zu1 zu1Var2 = new zu1(bundle5);
                zu1Var2.s4 = mt9Var2.a;
                eVar.presentFragment(zu1Var2);
                return;
            }
            int size2 = i - arrayList3.size();
            if (size2 < arrayList2.size()) {
                r47 r47Var2 = (r47) arrayList2.get(size2);
                Bundle bundle6 = new Bundle();
                bundle6.putLong("user_id", eVar.getUserConfig().e());
                bundle6.putInt("message_id", r47Var2.e1());
                pga pgaVar = new pga(ejaVar, bundle6, size2);
                pgaVar.d8 = r47Var2.e1();
                eVar.presentFragment(pgaVar);
            }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                ((zu1) fn7Var).G9((TLRPC.TL_game) obj3, (r47) obj2, (String) obj, this.b);
                break;
            case 1:
            default:
                l1c l1cVar = (l1c) fn7Var;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                kc kcVar = (kc) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.b;
                    if (i2 >= size) {
                        l1cVar.l0.addAll(hashSet);
                        l1cVar.n();
                        d31.b0(l1cVar.s).U(ob6.J0(hashSet.size(), "TopicsDeleted"), false, new y09((Object) l1cVar, (Object) hashSet, (Object) arrayList, j, (byte) 17), new bcb(l1cVar, arrayList, kcVar)).j();
                        idVar.dismiss();
                        break;
                    } else {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj4).intValue()) {
                            l1cVar.k(0L, false);
                        }
                    }
                }
            case 2:
                ((wua) fn7Var).k1(this.b, ((TL_stars.starGiftDepositPayload[]) obj3)[0], ((long[]) obj2)[0], idVar.g(i, true, true), (bx4) obj);
                break;
        }
    }

    public /* synthetic */ oo1(wua wuaVar, long j, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bx4 bx4Var) {
        this.a = (byte) 2;
        this.c = wuaVar;
        this.b = j;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = bx4Var;
    }

    public /* synthetic */ oo1(l1c l1cVar, ArrayList arrayList, long j, HashSet hashSet, kc kcVar) {
        this.a = (byte) 4;
        this.c = l1cVar;
        this.d = arrayList;
        this.b = j;
        this.e = hashSet;
        this.f = kcVar;
    }

    public /* synthetic */ oo1(zu1 zu1Var, TLRPC.TL_game tL_game, r47 r47Var, String str, long j) {
        this.a = (byte) 0;
        this.c = zu1Var;
        this.d = tL_game;
        this.e = r47Var;
        this.f = str;
        this.b = j;
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
