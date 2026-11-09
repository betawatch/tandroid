package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((i0) this.b).close();
                ((e8) this.c).a((String) obj);
                break;
            case 1:
                l0 l0Var = (l0) this.b;
                l0Var.q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.c);
                break;
            case 2:
                g0 g0Var = (g0) this.b;
                f8 f8Var = (f8) this.c;
                String str = (String) obj;
                if (str != null) {
                    g0Var.close();
                    l0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    f8Var.a(null, str);
                    break;
                } else {
                    l0.H("prepare disable backup: done!");
                    f8Var.a(g0Var, null);
                    break;
                }
            case 3:
                ((i0) this.b).close();
                ((s) this.c).a((String) obj);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new g((y1) this.b, (k) this.c, (String) obj, 2));
                break;
            case 5:
                ((d2) this.b).h = false;
                ((n60) this.c).a(null, (String) obj);
                break;
            case 6:
                ((i0) this.b).close();
                ((m) this.c).a((String) obj);
                break;
            case 7:
                ((i0) this.b).close();
                ((m) this.c).a((String) obj);
                break;
            case 8:
                w5 w5Var = (w5) this.b;
                l0 l0Var2 = (l0) this.c;
                String str2 = (String) obj;
                w5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    d8 d8Var = new d8();
                    d8Var.s = l0Var2.y();
                    w5Var.presentFragment(d8Var);
                    break;
                } else if (str2 != null) {
                    hc.a0(w5Var).e0(str2, false);
                    break;
                } else {
                    w5Var.presentFragment(new v9());
                    break;
                }
            case 9:
                d8 d8Var2 = (d8) this.b;
                l0 l0Var3 = (l0) this.c;
                String str3 = (String) obj;
                d8Var2.d.setLoading(false);
                if (str3 != null) {
                    hc.a0(d8Var2).e0(str3, false);
                    break;
                } else {
                    d8Var2.finishFragment();
                    l0Var3.L();
                    break;
                }
            case 10:
                m8 m8Var = (m8) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                String str4 = (String) obj;
                if (str4 != null) {
                    hc.a0(m8Var).e0(str4, false);
                    break;
                } else {
                    m8Var.finishFragment();
                    if (f2Var instanceof w5) {
                        org.telegram.messenger.g0.i3(new i3(2, f2Var), 300L);
                        break;
                    }
                }
                break;
            case 11:
                v9 v9Var = (v9) this.b;
                String str5 = (String) obj;
                ((c20) this.c).a(str5);
                if (str5 == null && !v9Var.r) {
                    if (v9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var2 : v9Var.getParentLayout().getFragmentStack()) {
                            if (f2Var2 instanceof w5) {
                                ((w5) f2Var2).O0();
                            }
                        }
                    }
                    v9Var.finishFragment();
                    break;
                }
                break;
            case 12:
                ga.d0((ga) this.b, (TL_wallet.tonConnectSession) this.c, (c20) obj);
                break;
            case 13:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.b;
                org.telegram.ui.web.z0[] z0VarArr = (org.telegram.ui.web.z0[]) this.c;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                o1Var.getClass();
                z0VarArr[0].finishFragment();
                c20 c20Var = o1Var.f;
                if (c20Var != null) {
                    o1Var.finishFragment();
                    c20Var.a(y0Var);
                    break;
                } else {
                    vf.c.t(o1Var.getParentActivity(), y0Var.c);
                    break;
                }
            case 14:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.b;
                w1Var.getClass();
                org.telegram.messenger.g0.h3(new s31(w1Var, (org.telegram.ui.web.v1) this.c, (Bitmap) obj, 9));
                break;
            case 15:
                zh.g1 g1Var = (zh.g1) this.b;
                c20 c20Var2 = (c20) this.c;
                Boolean bool = (Boolean) obj;
                g1Var.getClass();
                if (c20Var2 != null) {
                    c20Var2.a(bool);
                }
                if (bool.booleanValue()) {
                    g1Var.N0 = true;
                }
                g1Var.dismiss();
                break;
            case 16:
                bi.v9 v9Var2 = (bi.v9) this.b;
                bi.i0 i0Var = (bi.i0) this.c;
                if (((Object[]) obj)[1] == v9Var2) {
                    i0Var.run();
                    break;
                }
                break;
            case 17:
                vp0 vp0Var = (vp0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                String str6 = (String) obj;
                bi.t9 t9Var = vp0Var.e;
                int i7 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i10 = t9Var.a;
                updatestargiftcollection.peer = qp.s1(i10).j1(t9Var.b);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                vp0Var.f(true);
                break;
            default:
                zh.b4 b4Var = (zh.b4) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                long j3 = b4Var.R1;
                Runnable runnable = b4Var.Y1;
                if (runnable != null) {
                    runnable.run();
                }
                b4Var.dismiss();
                qs.f(p10.s0).k(qs.S2, new Object[0]);
                org.telegram.messenger.g0.i3(new zh.s3(0, user), 250L);
                qp.s1(b4Var.Q1).e7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                break;
        }
    }

    public /* synthetic */ s(l0 l0Var, g0 g0Var, f8 f8Var) {
        this.a = 2;
        this.b = g0Var;
        this.c = f8Var;
    }
}
