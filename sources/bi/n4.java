package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.uv;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements org.telegram.ui.ActionBar.r1, cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ls c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n4(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.c = (ls) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j3;
        this.f = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(final float f10, final float f11, int i7, View view) {
        boolean z9;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        int i10 = i7;
        final xs0 xs0Var = (xs0) this.c;
        zp0 zp0Var = (zp0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
        jr0 jr0Var = xs0Var.S;
        is0 is0Var = xs0Var.T;
        kr0 kr0Var = xs0Var.c0;
        js0 js0Var = xs0Var.U;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        int i11 = zp0Var.E;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.pa) {
                if (!kr0Var.e.isEmpty()) {
                    i10 = ((Integer) kr0Var.e.get(i10)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = kr0Var.d.participants.participants.get(i10);
                if (i10 < 0 || i10 >= kr0Var.d.participants.participants.size()) {
                    return;
                }
                xs0Var.T0(chatParticipant, false, view);
                return;
            }
            v4.g0 adapter = zp0Var.h.getAdapter();
            qr0 qr0Var = xs0Var.l0;
            if (adapter == qr0Var) {
                TLObject E = qr0Var.E(i10);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = ij.C1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j3 == 0 || j3 == f2Var.getUserConfig().e()) {
                    return;
                }
                f2Var.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            }
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.g6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.g6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                if (!chat.forum) {
                    f2Var.presentFragment(new an(bundle));
                    return;
                } else {
                    HashSet hashSet = w91.q1;
                    f2Var.presentFragment(w91.I0(f2Var.getMessagesController(), f2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i11 == 1 && (view instanceof org.telegram.ui.Cells.h7)) {
            xs0Var.R0(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), zp0Var.E);
            return;
        }
        if (i11 == 3 && (view instanceof org.telegram.ui.Cells.k7)) {
            xs0Var.R0(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), zp0Var.E);
            return;
        }
        if ((i11 == 2 || i11 == 4) && (view instanceof org.telegram.ui.Cells.g7)) {
            xs0Var.R0(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), zp0Var.E);
            return;
        }
        if (i11 == 5 && (view instanceof org.telegram.ui.Cells.h2)) {
            xs0Var.R0(i10, view, (ij) ((org.telegram.ui.Cells.h2) view).getParentObject(), zp0Var.E);
            return;
        }
        if (i11 == 0 && (view instanceof org.telegram.ui.Cells.o7)) {
            final org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            ij messageObject = o7Var.getMessageObject();
            if (messageObject != null && messageObject.q4()) {
                if (f2Var == null) {
                    return;
                }
                final int currentAccount = f2Var.getCurrentAccount();
                final qp s12 = qp.s1(currentAccount);
                final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
                u1Var.r(200L);
                s12.R0(new c20() { // from class: org.telegram.ui.Components.zo0
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.f2 f2Var2 = xs0.this.x1;
                        u1Var.c(200L);
                        final org.telegram.messenger.qp qpVar = s12;
                        final boolean z10 = ((org.telegram.messenger.h0) qpVar.x7.m.b).c && !TextUtils.isEmpty(qpVar.u6);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context2, f2Var2 == null ? null : f2Var2.getResourceProvider());
                            c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                            c2Var.e(org.telegram.messenger.id.M0(2131748483, null), "", zArr[0], false, false);
                            c2Var.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                            frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            c2Var.setOnClickListener(new x0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, f2Var2 == null ? null : f2Var2.getResourceProvider());
                        String M0 = org.telegram.messenger.id.M0(2131748474, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                        u1Var2.R = M0;
                        u1Var2.T = org.telegram.messenger.id.M0(z11 ? 2131748476 : 2131748477, null);
                        alertDialog$Builder.o(frameLayout);
                        u1Var2.G = 9;
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(z11 ? 2131748475 : 2131752589, null), null);
                        if (!z11) {
                            String M02 = org.telegram.messenger.id.M0(2131748482, null);
                            final org.telegram.ui.Cells.o7 o7Var2 = o7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i12 = currentAccount;
                            alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.kp0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var3, int i13) {
                                    TL_account.contentSettings contentsettings2;
                                    np0 np0Var = new np0(org.telegram.ui.Cells.o7.this, f12, f13);
                                    if (!zArr[0]) {
                                        np0Var.a(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        np0Var.a(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                        ThemeActivity.H0(i12, context2, new fx(4, qpVar, np0Var), T == null ? null : T.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (f2Var2 == null || f2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            f2Var2.showDialog(u1Var2);
                        }
                    }
                });
                return;
            }
            ij ijVar = o7Var.n;
            if (ijVar != null && ijVar.u2() && o7Var.i0 == 0.0f && !o7Var.n.N0) {
                o7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    xs0Var.R0(i10, view, messageObject, zp0Var.E);
                    return;
                }
                return;
            }
        }
        if (xs0.z0(i11) && (view instanceof org.telegram.ui.Cells.o7)) {
            ij messageObject2 = ((org.telegram.ui.Cells.o7) view).getMessageObject();
            if (messageObject2 != null) {
                xs0Var.R0(i10, view, messageObject2, zp0Var.E);
                return;
            }
            return;
        }
        int i12 = zp0Var.E;
        if (i12 == 10) {
            if (((view instanceof org.telegram.ui.Cells.g6) || f11 < org.telegram.messenger.g0.L(60.0f)) && i10 >= 0 && i10 < jr0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) jr0Var.d.get(i10);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                f2Var.presentFragment(new an(bundle2));
                return;
            }
            return;
        }
        if (i12 != 11) {
            if (i12 == 15 && (view instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                ij messageObject3 = q1Var.getMessageObject();
                zp0Var.h.C0();
                int currentAccount2 = f2Var.getCurrentAccount();
                qp messagesController = f2Var.getMessagesController();
                long j10 = this.b;
                TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
                k60 F = k60.F(zp0Var, f6Var, q1Var);
                F.c0 = true;
                F.V(messageObject3.Q3() ? 5 : 3);
                F.c(R.drawable.msg_message, org.telegram.messenger.id.M0(2131754877, null), new d3(xs0Var, j10, messageObject3, 24), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia o12 = ij.o1(messageObject3.k);
                    if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                        z9 = ((TLRPC.TL_messageMediaPoll) o12).poll.closed;
                        if (!z9) {
                            if (messageObject3.C()) {
                                F.c(R.drawable.msg_unvote, org.telegram.messenger.id.M0(2131743827, null), new ap0(xs0Var, f6Var, currentAccount2, messageObject3), false);
                            }
                            if (!ij.m3(messageObject3.k) && ((messageObject3.O3() && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) || (org.telegram.messenger.t3.T(M0) && !M0.megagroup && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                F.c(R.drawable.msg_pollstop, org.telegram.messenger.id.M0(messageObject3.d4() ? 2131744829 : 2131744834, null), new ap0(xs0Var, f6Var, messageObject3, currentAccount2), false);
                            }
                        }
                        F.Z();
                        return;
                    }
                }
                z9 = false;
                if (!z9) {
                }
                F.Z();
                return;
            }
            return;
        }
        if (zp0Var.h.getAdapter() != js0Var) {
            if (xs0Var.E1) {
                if (is0Var.w.D == 0) {
                    is0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i10 < 0 || i10 >= is0Var.f.size()) {
                return;
            }
            uv uvVar = (uv) is0Var.f.get(i10);
            bundle3.putLong("user_id", f2Var.getUserConfig().e());
            bundle3.putInt("chatMode", 3);
            an anVar = new an(bundle3);
            anVar.r4 = uvVar.a;
            f2Var.presentFragment(anVar);
            return;
        }
        if (i10 < 0) {
            return;
        }
        ArrayList arrayList = js0Var.e;
        ArrayList arrayList2 = js0Var.f;
        if (i10 < arrayList.size()) {
            uv uvVar2 = (uv) arrayList.get(i10);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", f2Var.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            an anVar2 = new an(bundle4);
            anVar2.r4 = uvVar2.a;
            f2Var.presentFragment(anVar2);
            return;
        }
        int size = i10 - arrayList.size();
        if (size < arrayList2.size()) {
            ij ijVar2 = (ij) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", f2Var.getUserConfig().e());
            bundle5.putInt("message_id", ijVar2.f1());
            hq0 hq0Var = new hq0(xs0Var, bundle5, size);
            hq0Var.b8 = ijVar2.f1();
            f2Var.presentFragment(hq0Var);
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                an.i1((an) this.c, (TLRPC.TL_game) this.d, (ij) this.e, (String) this.f, this.b);
                break;
            default:
                m11 m11Var = (m11) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                vs vsVar = (vs) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.b;
                    if (i10 >= size) {
                        m11Var.k0.addAll(hashSet);
                        m11Var.q();
                        org.telegram.ui.Components.hc.a0(m11Var.s).U(org.telegram.messenger.id.K0(hashSet.size(), "TopicsDeleted"), false, new w2(m11Var, hashSet, arrayList, j3, 18), new v80(m11Var, arrayList, vsVar, 22)).j();
                        u1Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            m11Var.n(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ n4(an anVar, TLRPC.TL_game tL_game, ij ijVar, String str, long j3) {
        this.a = 1;
        this.c = anVar;
        this.d = tL_game;
        this.e = ijVar;
        this.f = str;
        this.b = j3;
    }

    public /* synthetic */ n4(m11 m11Var, ArrayList arrayList, long j3, HashSet hashSet, vs vsVar) {
        this.a = 3;
        this.c = m11Var;
        this.d = arrayList;
        this.b = j3;
        this.e = hashSet;
        this.f = vsVar;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
