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
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.up0;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((j0) this.b).close();
                ((f8) this.c).a((String) obj);
                break;
            case 1:
                m0 m0Var = (m0) this.b;
                m0Var.q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.c);
                break;
            case 2:
                h0 h0Var = (h0) this.b;
                g8 g8Var = (g8) this.c;
                String str = (String) obj;
                if (str != null) {
                    h0Var.close();
                    m0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    g8Var.a(null, str);
                    break;
                } else {
                    m0.H("prepare disable backup: done!");
                    g8Var.a(h0Var, null);
                    break;
                }
            case 3:
                ((j0) this.b).close();
                ((t) this.c).a((String) obj);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new g((z1) this.b, (k) this.c, (String) obj, 2));
                break;
            case 5:
                ((e2) this.b).h = false;
                ((l60) this.c).a(null, (String) obj);
                break;
            case 6:
                ((j0) this.b).close();
                ((m) this.c).a((String) obj);
                break;
            case 7:
                ((j0) this.b).close();
                ((m) this.c).a((String) obj);
                break;
            case 8:
                x5 x5Var = (x5) this.b;
                m0 m0Var2 = (m0) this.c;
                String str2 = (String) obj;
                x5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    e8 e8Var = new e8();
                    e8Var.s = m0Var2.y();
                    x5Var.presentFragment(e8Var);
                    break;
                } else if (str2 != null) {
                    hc.a0(x5Var).e0(str2, false);
                    break;
                } else {
                    x5Var.presentFragment(new w9());
                    break;
                }
            case 9:
                e8 e8Var2 = (e8) this.b;
                m0 m0Var3 = (m0) this.c;
                String str3 = (String) obj;
                e8Var2.d.setLoading(false);
                if (str3 != null) {
                    hc.a0(e8Var2).e0(str3, false);
                    break;
                } else {
                    e8Var2.finishFragment();
                    m0Var3.L();
                    break;
                }
            case 10:
                n8 n8Var = (n8) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                String str4 = (String) obj;
                if (str4 != null) {
                    hc.a0(n8Var).e0(str4, false);
                    break;
                } else {
                    n8Var.finishFragment();
                    if (f2Var instanceof x5) {
                        org.telegram.messenger.g0.i3(new j3(2, f2Var), 300L);
                        break;
                    }
                }
                break;
            case 11:
                w9 w9Var = (w9) this.b;
                String str5 = (String) obj;
                ((c20) this.c).a(str5);
                if (str5 == null && !w9Var.r) {
                    if (w9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var2 : w9Var.getParentLayout().getFragmentStack()) {
                            if (f2Var2 instanceof x5) {
                                ((x5) f2Var2).O0();
                            }
                        }
                    }
                    w9Var.finishFragment();
                    break;
                }
                break;
            case 12:
                ha.d0((ha) this.b, (TL_wallet.tonConnectSession) this.c, (c20) obj);
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
                org.telegram.messenger.g0.h3(new r31(w1Var, (org.telegram.ui.web.v1) this.c, (Bitmap) obj, 9));
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
                bi.v9 v9Var = (bi.v9) this.b;
                bi.i0 i0Var = (bi.i0) this.c;
                if (((Object[]) obj)[1] == v9Var) {
                    i0Var.run();
                    break;
                }
                break;
            case 17:
                up0 up0Var = (up0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                String str6 = (String) obj;
                bi.t9 t9Var = up0Var.e;
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
                up0Var.f(true);
                break;
            default:
                zh.a4 a4Var = (zh.a4) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                long j3 = a4Var.R1;
                Runnable runnable = a4Var.Y1;
                if (runnable != null) {
                    runnable.run();
                }
                a4Var.dismiss();
                qs.f(p10.s0).k(qs.S2, new Object[0]);
                org.telegram.messenger.g0.i3(new zh.r3(0, user), 250L);
                qp.s1(a4Var.Q1).e7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                break;
        }
    }

    public /* synthetic */ t(m0 m0Var, h0 h0Var, g8 g8Var) {
        this.a = 2;
        this.b = h0Var;
        this.c = g8Var;
    }
}
