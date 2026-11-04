package mi;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import b8.yd;
import ci.w9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.ic;
import org.telegram.messenger.ir;
import org.telegram.messenger.lr;
import org.telegram.messenger.pr;
import org.telegram.messenger.so;
import org.telegram.messenger.wy;
import org.telegram.messenger.yl;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.cb;
import org.telegram.ui.hb;
import org.telegram.ui.hm;
import org.telegram.ui.kb;
import org.telegram.ui.kh;
import org.telegram.ui.ln;
import org.telegram.ui.m91;
import org.telegram.ui.mn;
import org.telegram.ui.nw;
import org.telegram.ui.oi;
import org.telegram.ui.qo;
import org.telegram.ui.um;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements h4, vs, o4.n0, g2.k, o4.f1, oi.n, org.telegram.ui.Cells.u, gj0, org.telegram.ui.ActionBar.p1, nw, org.telegram.ui.w4, org.telegram.ui.Components.r4, so, ic, ui0, th0, ir, ResultCallback, lr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d4(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 18:
                wm wmVar = (wm) this.b;
                Uri uri = (Uri) this.c;
                wmVar.C8();
                yy.Y(wmVar.getAccountInstance(), uri, wmVar.k6, wmVar.E5, wmVar.m4, null, wmVar.G5, z10, i3, wmVar.W8());
                break;
            case 19:
            default:
                hm hmVar = (hm) this.b;
                zi ziVar = (zi) this.c;
                if (z10) {
                    hmVar.a.getMessagesController().v(ziVar.k.id, i3, org.telegram.messenger.m5.o(ziVar.k.peer_id), null, false);
                    break;
                }
                break;
            case 20:
                wm wmVar2 = (wm) this.b;
                wmVar2.getSendMessagesHelper().r0(wy.b((String) this.c, wmVar2.k6, wmVar2.E5, wmVar2.m4, null, false, null, null, null, z10, i3, 0, null, false));
                wmVar2.a0.setFieldText("");
                wmVar2.B9(false);
                break;
        }
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        wm.O0((wm) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // g2.k
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                o4.h1 h1Var = (o4.h1) this.b;
                d2.s1 s1Var = (d2.s1) this.c;
                o4.l1 l1Var = (o4.l1) obj;
                h1Var.getClass();
                g9.l0 l0Var = s1Var.H;
                if (!l0Var.isEmpty()) {
                    d2.r1 c2 = s1Var.a().c();
                    g9.g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        d2.p1 p1Var = (d2.p1) it.next();
                        d2.o1 o1Var = (d2.o1) h1Var.d.n.get(p1Var.a.b);
                        if (o1Var == null || p1Var.a.a != o1Var.a) {
                            c2.a(p1Var);
                        } else {
                            c2.a(new d2.p1(o1Var, p1Var.b));
                        }
                    }
                    s1Var = c2.b();
                }
                l1Var.g0(s1Var);
                break;
            case 5:
                o4.h1 h1Var2 = (o4.h1) this.b;
                o4.v vVar = (o4.v) this.c;
                o4.e0 e0Var = (o4.e0) h1Var2.a.get();
                if (e0Var != null && !e0Var.j()) {
                    e0Var.g(vVar, false);
                    break;
                }
                break;
            default:
                o4.h1 h1Var3 = (o4.h1) this.b;
                Surface surface = (Surface) this.c;
                o4.l1 l1Var2 = (o4.l1) obj;
                ((o4.e0) h1Var3.a.get()).getClass();
                if (surface != null) {
                    o4.g1 g1Var = new o4.g1(surface);
                    h1Var3.i = g1Var;
                    l1Var2.Q(g1Var);
                    break;
                } else {
                    l1Var2.Q(null);
                    h1Var3.i = null;
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.b;
        org.telegram.ui.l3 l3Var = (org.telegram.ui.l3) this.c;
        if (i4Var.L == null || i3 - 1 >= 0) {
            h9 h9Var = i4Var.Q0;
            if (h9Var != null) {
                if (h9Var.x()) {
                    i4Var.Q0.f(false);
                    return;
                }
                i4Var.Q0.f(false);
            }
            org.telegram.ui.g4 adapter = l3Var.getAdapter();
            if ((view instanceof org.telegram.ui.o3) && adapter.F != null) {
                org.telegram.ui.o3 o3Var = (org.telegram.ui.o3) view;
                if (i4Var.I0 == 0) {
                    if ((!o3Var.c || f10 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                        TLObject f22 = hp.s1(i4Var.Y).f2("previews");
                        if (f22 instanceof TLRPC.TL_user) {
                            i4Var.N(adapter.F.id, (TLRPC.User) f22);
                            return;
                        }
                        int i10 = h10.t0;
                        long j10 = adapter.F.id;
                        i4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new yl(i4Var, i10, j10));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i3 < 0 || i3 >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i3);
            TL_iv.PageBlock x10 = org.telegram.ui.i4.x(pageBlock);
            if (x10 instanceof org.telegram.ui.v3) {
                x10 = ((org.telegram.ui.v3) x10).b;
            }
            if (x10 instanceof TL_iv.pageBlockChannel) {
                hp.s1(i4Var.Y).y3(org.telegram.messenger.t3.K(((TL_iv.pageBlockChannel) x10).channel, false), i4Var.N, 2, null);
                i4Var.m(false, true);
                return;
            }
            if (x10 instanceof org.telegram.ui.b4) {
                org.telegram.ui.b4 b4Var = (org.telegram.ui.b4) x10;
                i4Var.O(b4Var.a.articles.get(b4Var.b).url, null, null);
                return;
            }
            if (x10 instanceof TL_iv.pageBlockDetails) {
                View w10 = org.telegram.ui.i4.w(view);
                if (w10 instanceof org.telegram.ui.k1) {
                    i4Var.d = null;
                    i4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int b10 = adapter.b();
                    adapter.M();
                    int abs = Math.abs(adapter.b() - b10);
                    org.telegram.ui.k1 k1Var = (org.telegram.ui.k1) w10;
                    k1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    k1Var.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.o(i3 + 1, abs);
                        } else {
                            adapter.p(i3 + 1, abs);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // o4.n0
    public void c(o4.v vVar) {
        switch (this.a) {
            case 2:
                ((o4.d) this.c).f(((o4.o0) this.b).h.t);
                break;
            default:
                o4.o0 o0Var = (o4.o0) this.b;
                p4.h hVar = (p4.h) this.c;
                o0Var.getClass();
                String str = hVar.a;
                if (TextUtils.isEmpty(str)) {
                    g2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    o4.l1 l1Var = o0Var.h.t;
                    if (l1Var.m0(17)) {
                        d2.n1 y02 = l1Var.y0();
                        d2.m1 m1Var = new d2.m1();
                        for (int i3 = 0; i3 < y02.o(); i3++) {
                            if (TextUtils.equals(y02.m(i3, m1Var, 0L).c.a, str)) {
                                l1Var.O(i3);
                                break;
                            }
                        }
                        break;
                    } else {
                        g2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.w4
    public void d(org.telegram.ui.e5 e5Var) {
        cb cbVar = (cb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = e5Var.ordinal();
        if (ordinal == 0) {
            cbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        hb hbVar = cbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.d2 d2Var = hbVar.n;
            if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                d2Var.presentFragment(new wm(bundle));
            }
        }
    }

    @Override // oi.n
    public void e(h0 h0Var) {
        switch (this.a) {
            case 9:
                org.telegram.messenger.g0.h3(new lg.y((SpannableString) this.b, h0Var, (org.telegram.messenger.voip.l0) this.c, 15));
                break;
            default:
                org.telegram.messenger.g0.h3(new lg.y((SpannableString) this.b, h0Var, (w9) this.c, 16));
                break;
        }
    }

    @Override // org.telegram.ui.Components.th0
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        kh khVar = (kh) this.b;
        zi ziVar = (zi) this.c;
        wm wmVar = khVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", ziVar.f1());
        bundle.putLong("report_reaction_from_dialog_id", wmVar.k6);
        wmVar.presentFragment(new ProfileActivity(bundle, null));
        wmVar.O7(true);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 13:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.b;
                View view = (View) this.c;
                r4Var.getClass();
                s1Var.dismiss();
                r4Var.b0(view, true);
                break;
            case 14:
            case 16:
            default:
                bo boVar = (bo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = hp.i1(chat);
                tL_channels_updateUsername.username = "";
                boVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new mn(boVar, 0), 64);
                break;
            case 15:
                kb kbVar = (kb) this.b;
                sf.c.p(kbVar.getParentActivity(), (String) this.c, true);
                break;
            case 17:
                ad.a0((ad) this.b, (TLRPC.Chat) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public void h() {
        wm wmVar = (wm) this.b;
        pi.q qVar = (pi.q) this.c;
        wmVar.getClass();
        qVar.g();
        wmVar.M9();
    }

    @Override // o4.f1
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        switch (this.a) {
            case 7:
                return e0Var.j() ? yd.b(new o4.r1(-100)) : g2.n0.g0((l9.y) ((o4.f1) this.b).i(e0Var, vVar, i3), new aa.a(e0Var, vVar, (o4.v0) this.c, 15));
            default:
                return e0Var.j() ? yd.b(new o4.r1(-100)) : g2.n0.g0((l9.y) ((o4.f1) this.b).i(e0Var, vVar, i3), new aa.a(e0Var, vVar, (o4.e1) this.c, 16));
        }
    }

    @Override // org.telegram.ui.Components.vs
    public void m() {
        n5 n5Var = (n5) this.b;
        q5 q5Var = (q5) this.c;
        TL_iv.pageTableCell pagetablecell = q5Var.b;
        if (pagetablecell != null) {
            f6.d(pagetablecell, q5Var.a.getText());
        }
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null) {
            return;
        }
        t3.S1(b3Var.a);
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        oi oiVar = (oi) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        wm wmVar = oiVar.b;
        long j11 = wmVar.s4;
        if (j10 != j11) {
            return;
        }
        wmVar.Qa(j11, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        um umVar = (um) this.b;
        la0 la0Var = (la0) this.c;
        Pair pair = (Pair) obj;
        umVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.p3 p3Var = umVar.f;
        if (p3Var == null || longValue != p3Var.h(umVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        la0Var.x = bitmap;
        la0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // mi.h4, org.telegram.messenger.lr
    public void run(long j10) {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.b;
                String str = (String) this.c;
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j10;
                q3Var.a(str, tL_inlineButtonTypeUserProfile);
                break;
            case 27:
                ln lnVar = (ln) this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                lnVar.getClass();
                s1Var.dismiss();
                lnVar.O0 = false;
                if (j10 != 0) {
                    lnVar.w0 = j10;
                    TLRPC.Chat M0 = lnVar.getMessagesController().M0(Long.valueOf(j10));
                    lnVar.x0 = M0;
                    TLRPC.ChatFull chatFull = lnVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = M0.forum_tabs != lnVar.H0;
                    boolean z11 = M0.forum_sidebar != lnVar.I0;
                    lnVar.getMessagesController().a5(lnVar.w0, lnVar.F0, lnVar.H0, lnVar.I0);
                    TLRPC.Chat chat = lnVar.x0;
                    chat.forum = lnVar.F0;
                    chat.forum_tabs = lnVar.H0;
                    chat.forum_sidebar = lnVar.I0;
                    if (z10 || z11) {
                        lnVar.v0(z10);
                        break;
                    }
                }
                break;
            default:
                qo qoVar = (qo) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                if (j10 == 0) {
                    qoVar.getClass();
                    break;
                } else {
                    qoVar.getMessagesController().b5(j10, false);
                    qoVar.d0(qoVar.getMessagesController().M0(Long.valueOf(j10)), d2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        a8.d("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        org.telegram.ui.z5 z5Var = (org.telegram.ui.z5) this.b;
        uw uwVar2 = (uw) this.c;
        ArrayList arrayList2 = z5Var.c;
        uwVar2.finishFragment();
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= z5Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((org.telegram.messenger.s2) z5Var.d.get(i13)).a == ((pr) arrayList.get(i12)).a) {
                    s2Var = (org.telegram.messenger.s2) z5Var.d.get(i13);
                    break;
                }
                i13++;
            }
            if (!z12) {
                int i14 = z5Var.getMessagesController().r7.c(z5Var.e) == 2 ? 3 : 2;
                ArrayList arrayList3 = z5Var.d;
                org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((pr) arrayList.get(i12)).a, i14);
                arrayList3.add(s2Var2);
                s2Var = s2Var2;
            }
            i12++;
        }
        z5Var.getMessagesController().r7.h(z5Var.e, z5Var.d);
        z5Var.Z();
        if (s2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.y5) arrayList2.get(i15)).c != null && ((org.telegram.ui.y5) arrayList2.get(i15)).c.a == s2Var.a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            z5Var.b.v0(i11);
            org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(16, z5Var, s2Var), 150L);
        }
        return true;
    }

    public /* synthetic */ d4(cb cbVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        this.a = 16;
        this.b = cbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
