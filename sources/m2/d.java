package m2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import bg.f0;
import h2.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import oi.c6;
import oi.d4;
import oi.e1;
import oi.g0;
import oi.h0;
import oi.k0;
import oi.k5;
import oi.n5;
import oi.q3;
import oi.y2;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.dd;
import org.telegram.messenger.ez;
import org.telegram.messenger.fm;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.nc;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.qr;
import org.telegram.messenger.s2;
import org.telegram.messenger.t3;
import org.telegram.messenger.ur;
import org.telegram.messenger.yo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.k;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.u;
import org.telegram.ui.Components.d0;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a4;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.c5;
import org.telegram.ui.db;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
import org.telegram.ui.ho;
import org.telegram.ui.ib;
import org.telegram.ui.j1;
import org.telegram.ui.k3;
import org.telegram.ui.ka1;
import org.telegram.ui.lb;
import org.telegram.ui.lm;
import org.telegram.ui.mp;
import org.telegram.ui.n3;
import org.telegram.ui.oh;
import org.telegram.ui.p4;
import org.telegram.ui.po;
import org.telegram.ui.qn;
import org.telegram.ui.rn;
import org.telegram.ui.si;
import org.telegram.ui.sw;
import org.telegram.ui.to;
import org.telegram.ui.tr;
import org.telegram.ui.u3;
import org.telegram.ui.u4;
import org.telegram.ui.u5;
import org.telegram.ui.u91;
import org.telegram.ui.x5;
import org.telegram.ui.y5;
import org.telegram.ui.ym;
import org.telegram.ui.yw;
import ri.q;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o, k0, dt, d4, u, hj0, q1, sw, u4, r4, yo, nc, vi0, uh0, nr, ResultCallback, qr, ka1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.dt
    public void E() {
        switch (this.a) {
            case 2:
                h0 h0Var = (h0) this.b;
                g0 g0Var = (g0) this.c;
                h0Var.i();
                g0Var.u0();
                break;
            default:
                k5 k5Var = (k5) this.b;
                n5 n5Var = (n5) this.c;
                TL_iv.pageTableCell pagetablecell = n5Var.b;
                if (pagetablecell != null) {
                    c6.d(pagetablecell, n5Var.a.getText());
                }
                y2 y2Var = k5Var.F;
                if (y2Var != null && k5Var.a != null) {
                    q3.S1(y2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 12:
                an anVar = (an) this.b;
                Uri uri = (Uri) this.c;
                anVar.E8();
                ez.Y(anVar.getAccountInstance(), uri, anVar.k6, anVar.E5, anVar.m4, null, anVar.G5, z10, i7, anVar.Y8());
                break;
            case 13:
            default:
                lm lmVar = (lm) this.b;
                gj gjVar = (gj) this.c;
                if (z10) {
                    lmVar.a.getMessagesController().v(gjVar.k.id, i7, m5.o(gjVar.k.peer_id), null, false);
                    break;
                }
                break;
            case 14:
                an anVar2 = (an) this.b;
                anVar2.getSendMessagesHelper().r0(cz.b((String) this.c, anVar2.k6, anVar2.E5, anVar2.m4, null, false, null, null, null, z10, i7, 0, null, false));
                anVar2.a0.setFieldText("");
                anVar2.D9(false);
                break;
        }
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.uh0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        oh ohVar = (oh) this.b;
        gj gjVar = (gj) this.c;
        an anVar = ohVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", gjVar.e1());
        bundle.putLong("report_reaction_from_dialog_id", anVar.k6);
        anVar.presentFragment(new ProfileActivity(bundle, null));
        anVar.P7(true);
    }

    @Override // oi.k0
    public m60 b(e1 e1Var) {
        k8.a aVar = (k8.a) this.b;
        e6 e6Var = (e6) this.c;
        oi.o oVar = (oi.o) aVar.c;
        m60 m60Var = new m60(oVar, e6Var, e1Var, false, false, true);
        oVar.I = m60Var;
        return m60Var;
    }

    @Override // org.telegram.ui.u4
    public void c(c5 c5Var) {
        db dbVar = (db) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = c5Var.ordinal();
        if (ordinal == 0) {
            dbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        ib ibVar = dbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            e2 e2Var = ibVar.n;
            if (e2Var.getMessagesController().E(bundle, e2Var, null, null)) {
                e2Var.presentFragment(new an(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.yo
    public boolean d(TLRPC.TL_error tL_error) {
        an.Q0((an) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        g4 g4Var = (g4) this.b;
        k3 k3Var = (k3) this.c;
        if (g4Var.L == null || i7 - 1 >= 0) {
            h9 h9Var = g4Var.Q0;
            if (h9Var != null) {
                if (h9Var.x()) {
                    g4Var.Q0.f(false);
                    return;
                }
                g4Var.Q0.f(false);
            }
            e4 adapter = k3Var.getAdapter();
            if ((view instanceof n3) && adapter.F != null) {
                n3 n3Var = (n3) view;
                if (g4Var.I0 == 0) {
                    if ((!n3Var.c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject f22 = np.s1(g4Var.Y).f2("previews");
                        if (f22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.F.id, (TLRPC.User) f22);
                            return;
                        }
                        int i10 = m10.t0;
                        long j3 = adapter.F.id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new fm(g4Var, i10, j3));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 < 0 || i7 >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
            TL_iv.PageBlock x10 = g4.x(pageBlock);
            if (x10 instanceof u3) {
                x10 = ((u3) x10).b;
            }
            if (x10 instanceof TL_iv.pageBlockChannel) {
                np.s1(g4Var.Y).y3(t3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.N, 2, null);
                g4Var.m(false, true);
                return;
            }
            if (x10 instanceof a4) {
                a4 a4Var = (a4) x10;
                g4Var.O(a4Var.a.articles.get(a4Var.b).url, null, null);
                return;
            }
            if (x10 instanceof TL_iv.pageBlockDetails) {
                View w10 = g4.w(view);
                if (w10 instanceof j1) {
                    g4Var.d = null;
                    g4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int b10 = adapter.b();
                    adapter.M();
                    int abs = Math.abs(adapter.b() - b10);
                    j1 j1Var = (j1) w10;
                    j1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    j1Var.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.o(i7 + 1, abs);
                        } else {
                            adapter.p(i7 + 1, abs);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 7:
                p4 p4Var = (p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                t1Var.dismiss();
                p4Var.b0(view, true);
                break;
            case 9:
                vf.c.p(((lb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 11:
                ad.a0((ad) this.b, (TLRPC.Chat) this.c);
                break;
            case 22:
                ho hoVar = (ho) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = np.i1(chat);
                tL_channels_updateUsername.username = "";
                hoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new rn(hoVar, 0), 64);
                break;
            case 26:
                d0 d0Var = (d0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(d0Var.a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(d0Var, h, tL_aiComposeTone, 5));
                break;
            case 27:
                ((f0) this.b).j(((boolean[]) this.c)[0]);
                break;
            case 28:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                dd G0 = hd.E0().G0(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (G0 == null) {
                    G0 = new dd();
                    G0.a = tL_langPackLanguage.native_name;
                    G0.b = tL_langPackLanguage.name;
                    G0.c = tL_langPackLanguage.lang_code;
                    G0.e = tL_langPackLanguage.base_lang_code;
                    G0.f = tL_langPackLanguage.plural_code;
                    G0.g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        G0.d = "remote";
                    } else {
                        G0.d = "unofficial";
                    }
                }
                hd.E0().c(G0, true, false, false, true, m10.t0, null);
                launchActivity.y0(true);
                break;
            default:
                tr trVar = (tr) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                yw ywVar = (yw) trVar.b;
                ArrayList arrayList = (ArrayList) trVar.c;
                ywVar.getClass();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Long l10 = (Long) arrayList.get(i10);
                    long longValue = l10.longValue();
                    if (z10) {
                        ywVar.getMessagesController().o4(longValue, ywVar.getMessagesController().a2(l10), null, null, false);
                    }
                    if (z11) {
                        ywVar.getMessagesController().X(0, longValue, true);
                    }
                    ywVar.getMessagesController().w(longValue);
                }
                ywVar.n4(false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public void i() {
        an anVar = (an) this.b;
        q qVar = (q) this.c;
        anVar.getClass();
        qVar.g();
        anVar.O9();
    }

    @Override // h2.o
    public void invoke(Object obj) {
        ((b) obj).onRenderedFirstFrame((a) this.b);
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        si siVar = (si) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        an anVar = siVar.b;
        long j10 = anVar.s4;
        if (j3 != j10) {
            return;
        }
        anVar.Ta(j10, false);
    }

    @Override // org.telegram.ui.ka1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((mp) this.b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        ym ymVar = (ym) this.b;
        ra0 ra0Var = (ra0) this.c;
        Pair pair = (Pair) obj;
        ymVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        p3 p3Var = ymVar.f;
        if (p3Var == null || longValue != p3Var.h(ymVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ra0Var.x = bitmap;
        ra0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        k.a(this, th2);
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        a8.d("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override // oi.d4, org.telegram.messenger.qr
    public void run(long j3) {
        switch (this.a) {
            case 3:
                oi.n3 n3Var = (oi.n3) this.b;
                String str = (String) this.c;
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j3;
                n3Var.a(str, tL_inlineButtonTypeUserProfile);
                break;
            case 21:
                qn qnVar = (qn) this.b;
                t1 t1Var = (t1) this.c;
                qnVar.getClass();
                t1Var.dismiss();
                qnVar.O0 = false;
                if (j3 != 0) {
                    qnVar.w0 = j3;
                    TLRPC.Chat M0 = qnVar.getMessagesController().M0(Long.valueOf(j3));
                    qnVar.x0 = M0;
                    TLRPC.ChatFull chatFull = qnVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = M0.forum_tabs != qnVar.H0;
                    boolean z11 = M0.forum_sidebar != qnVar.I0;
                    qnVar.getMessagesController().b5(qnVar.w0, qnVar.F0, qnVar.H0, qnVar.I0);
                    TLRPC.Chat chat = qnVar.x0;
                    chat.forum = qnVar.F0;
                    chat.forum_tabs = qnVar.H0;
                    chat.forum_sidebar = qnVar.I0;
                    if (z10 || z11) {
                        qnVar.v0(z10);
                        break;
                    }
                }
                break;
            case 23:
                to toVar = (to) this.b;
                e2 e2Var = (e2) this.c;
                if (j3 == 0) {
                    toVar.getClass();
                    break;
                } else {
                    toVar.getMessagesController().c5(j3, false);
                    toVar.d0(toVar.getMessagesController().M0(Long.valueOf(j3)), e2Var);
                    break;
                }
            default:
                po poVar = (po) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    poVar.getClass();
                    break;
                } else {
                    to toVar2 = poVar.y.d;
                    if (toVar2.s) {
                        toVar2.w.set(0, toVar2.getMessagesController().M0(Long.valueOf(j3)));
                    } else {
                        toVar2.F = j3;
                        toVar2.f = toVar2.getMessagesController().M0(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
        }
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        y5 y5Var = (y5) this.b;
        yw ywVar2 = (yw) this.c;
        ArrayList arrayList2 = y5Var.c;
        ywVar2.finishFragment();
        s2 s2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= y5Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((s2) y5Var.d.get(i13)).a == ((ur) arrayList.get(i12)).a) {
                    s2Var = (s2) y5Var.d.get(i13);
                    break;
                }
                i13++;
            }
            if (!z12) {
                int i14 = y5Var.getMessagesController().s7.c(y5Var.e) == 2 ? 3 : 2;
                ArrayList arrayList3 = y5Var.d;
                s2 s2Var2 = new s2(((ur) arrayList.get(i12)).a, i14);
                arrayList3.add(s2Var2);
                s2Var = s2Var2;
            }
            i12++;
        }
        y5Var.getMessagesController().s7.h(y5Var.e, y5Var.d);
        y5Var.Z();
        if (s2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((x5) arrayList2.get(i15)).c != null && ((x5) arrayList2.get(i15)).c.a == s2Var.a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            y5Var.b.v0(i11);
            org.telegram.messenger.g0.i3(new u5(0, y5Var, s2Var), 150L);
        }
        return true;
    }

    public /* synthetic */ d(a aVar, Object obj, long j3) {
        this.a = 0;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        k.b(this, tL_error);
    }

    public /* synthetic */ d(db dbVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        this.a = 10;
        this.b = dbVar;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
