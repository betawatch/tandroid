package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.al;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bf;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj0;
import org.telegram.ui.bd1;
import org.telegram.ui.cd1;
import org.telegram.ui.pc1;
import org.telegram.ui.uc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c5(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        ai.j jVar;
        p4.o1 o1Var;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 1:
                e3[] e3VarArr = (e3[]) obj2;
                e3VarArr[0].setOnDismissListener(new q2((TLRPC.User) obj, i13));
                e3VarArr[0].dismiss();
                break;
            case 2:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 3:
                super/*org.telegram.ui.Components.n6*/.onDraw((Canvas) obj);
                break;
            case 4:
                super/*org.telegram.ui.Components.n6*/.onDraw((Canvas) obj);
                break;
            case 5:
                ((ViewGroup) obj).removeView(((e7) obj2).h);
                break;
            case 6:
                ((x10) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 7:
                r8 r8Var = (r8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!r8Var.b1 && userFull != null) {
                    r8Var.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    r8Var.d(cardVar);
                    break;
                }
                break;
            case 8:
                u8 u8Var = (u8) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                if ((h2Var instanceof n6) && lc.a(h2Var)) {
                    lc.b0(h2Var).I(R.raw.contact_check, gd.M0(2131742850, null), gd.M0(2131742849, null)).j();
                }
                u8Var.finishFragment();
                break;
            case 9:
                ((z0) obj).C();
                ((d9) obj2).a.g3.O(true);
                break;
            case 10:
                d9 d9Var = (d9) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d9Var.getParentActivity(), d9Var.getResourceProvider());
                String M0 = gd.M0(2131742893, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131742895, null);
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                alertDialog$Builder.k(gd.M0(2131742898, null), new aj0(29, d9Var, (u0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 11:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 12:
                ((ViewGroup) obj).removeView(((ra) obj2).h);
                break;
            case 13:
                pc1 pc1Var = (pc1) obj2;
                int[] iArr = (int[]) obj;
                pc1Var.getClass();
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    pc1Var.a.G0(true);
                    break;
                }
                break;
            case 14:
                uc1 uc1Var = (uc1) obj2;
                String str = (String) obj;
                uc1Var.d.clear();
                uc1Var.e.clear();
                uc1Var.f = true;
                uc1Var.F(str, "", true);
                uc1Var.h = str;
                uc1Var.f();
                uc1Var.E = null;
                break;
            case 15:
                uc1 uc1Var2 = (uc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = uc1Var2.F;
                i7 = ((org.telegram.ui.ActionBar.h2) wallpapersListActivity).currentAccount;
                mp.u1(i7).f4(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.h2) wallpapersListActivity).currentAccount;
                mp.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = uc1Var2.y;
                uc1Var2.y = null;
                uc1Var2.F(str2, "", false);
                break;
            case 16:
                String str3 = (String) obj;
                cd1 cd1Var = ((bd1) obj2).a;
                Activity parentActivity = cd1Var.getParentActivity();
                fj fjVar = cd1Var.n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        fjVar.k.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        fjVar.k.with_my_score = true;
                    }
                    cd1Var.showDialog(yo0.O0(cd1Var.getParentActivity(), fjVar, null, false, cd1Var.h));
                    break;
                }
                break;
            case 17:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj2;
                ki.q qVar = v0Var2.k0;
                qVar.f = true;
                qVar.k();
                v0Var2.v((fi.f7) obj);
                break;
            case 18:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.a) != null && (c0Var = v0Var.c) != null) {
                    c0Var.f(arrayList);
                    break;
                }
                break;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                c8.cb.c.addAll(0, arrayList2);
                for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
                    c8.cb.d.put(longSparseArray.keyAt(i15), (org.telegram.ui.web.w0) longSparseArray.valueAt(i15));
                }
                c8.cb.b = true;
                c8.cb.a = false;
                ArrayList arrayList3 = c8.cb.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        ((x10) obj3).a(arrayList2);
                    }
                    c8.cb.e = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.t2) obj2).c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.n = false;
                bi.d6 d6Var = x0Var.a;
                if (d6Var != null) {
                    d6Var.g3.O(true);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                z0Var.setEnabled(((org.telegram.ui.web.t1) obj).b() != null);
                z0Var.animate().alpha(z0Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 22:
                ((org.telegram.ui.l0) obj2).g0.a((Integer) obj);
                break;
            case 23:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj2;
                mp messagesController = n1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new al(messagesController, 3));
                n1Var.a.g3.O(true);
                break;
            case 24:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = t1Var.a;
                t1Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    mp.u1(i16).f4(tL_messages_webPage.users, false);
                    mp.u1(i16).Z3(tL_messages_webPage.chats, false);
                    t1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            t1Var.h = tL_webPage;
                        }
                    }
                    t1Var.h = null;
                }
                TLRPC.WebPage webPage = t1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    t1Var.h = null;
                }
                if (!bz.w0 && t1Var.h != null && (jVar = t1Var.l) != null) {
                    jVar.run();
                }
                t1Var.c();
                break;
            case 25:
                ((org.telegram.ui.web.t1) obj2).m.remove((c5) obj);
                break;
            case 26:
                ((p4.d0) obj2).getClass();
                ((Runnable) obj).run();
                break;
            case 27:
                p4.d0 d0Var = (p4.d0) obj2;
                p4.i1 i1Var = (p4.i1) obj;
                p4.m0 m0Var = d0Var.h;
                d0Var.t = i1Var;
                bf bfVar = new bf(d0Var, i1Var);
                i1Var.I0(bfVar);
                d0Var.u = bfVar;
                try {
                    m0Var.j.p(0, i1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) m0Var.n.b).a.setActive(true);
                d0Var.s = new p4.g1(i1Var.W(), 0, i1Var.R0(), i1Var.Q0(), i1Var.Q0(), 0, i1Var.j(), i1Var.m(), i1Var.D0(), i1Var.C(), i1Var.T0(), 0, i1Var.p0(18) ? i1Var.k0() : e2.o0.L, i1Var.p0(22) ? i1Var.F() : 1.0f, 1.0f, i1Var.p0(21) ? i1Var.H() : e2.e.i, 0, i1Var.p0(28) ? i1Var.l0() : g2.c.d, i1Var.K(), i1Var.p0(23) ? i1Var.n() : 0, i1Var.p0(23) && i1Var.z0(), i1Var.u(), 1, i1Var.w0(), i1Var.i(), i1Var.h(), i1Var.g(), i1Var.U0(), i1Var.O0(), i1Var.Z(), i1Var.z(), i1Var.p0(30) ? i1Var.j0() : e2.s1.b, i1Var.E0());
                d0Var.f(i1Var.t());
                break;
            case 28:
                ((c0.i) obj).a(Boolean.valueOf(((p4.d0) obj2).o()));
                break;
            default:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    o1Var = (p4.o1) ((m9.w) obj2).a;
                    a8.la.k(o1Var, "SessionResult must not be null");
                } catch (InterruptedException e11) {
                    e = e11;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    o1Var = new p4.o1(-1);
                } catch (CancellationException e12) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e12);
                    o1Var = new p4.o1(1);
                } catch (ExecutionException e13) {
                    e = e13;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    o1Var = new p4.o1(-1);
                }
                resultReceiver.send(o1Var.a, o1Var.b);
                break;
        }
    }

    public /* synthetic */ c5(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.a = 26;
        this.b = d0Var;
        this.c = runnable;
    }
}
