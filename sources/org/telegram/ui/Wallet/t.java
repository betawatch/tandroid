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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                ((k0) this.b).close();
                ((g8) this.c).a((String) obj);
                break;
            case 1:
                n0 n0Var = (n0) this.b;
                n0Var.q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.c);
                break;
            case 2:
                i0 i0Var = (i0) this.b;
                h8 h8Var = (h8) this.c;
                String str = (String) obj;
                if (str != null) {
                    i0Var.close();
                    n0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    h8Var.a(null, str);
                    break;
                } else {
                    n0.H("prepare disable backup: done!");
                    h8Var.a(i0Var, null);
                    break;
                }
            case 3:
                ((k0) this.b).close();
                ((t) this.c).a((String) obj);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new g((a2) this.b, (k) this.c, (String) obj, 2));
                break;
            case 5:
                ((f2) this.b).h = false;
                ((l60) this.c).a(null, (String) obj);
                break;
            case 6:
                ((k0) this.b).close();
                ((m) this.c).a((String) obj);
                break;
            case 7:
                ((k0) this.b).close();
                ((m) this.c).a((String) obj);
                break;
            case 8:
                y5 y5Var = (y5) this.b;
                n0 n0Var2 = (n0) this.c;
                String str2 = (String) obj;
                y5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    f8 f8Var = new f8();
                    f8Var.s = n0Var2.y();
                    y5Var.presentFragment(f8Var);
                    break;
                } else if (str2 != null) {
                    hc.a0(y5Var).e0(str2, false);
                    break;
                } else {
                    y5Var.presentFragment(new x9());
                    break;
                }
            case 9:
                f8 f8Var2 = (f8) this.b;
                n0 n0Var3 = (n0) this.c;
                String str3 = (String) obj;
                f8Var2.d.setLoading(false);
                if (str3 != null) {
                    hc.a0(f8Var2).e0(str3, false);
                    break;
                } else {
                    f8Var2.finishFragment();
                    n0Var3.L();
                    break;
                }
            case 10:
                o8 o8Var = (o8) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                String str4 = (String) obj;
                if (str4 != null) {
                    hc.a0(o8Var).e0(str4, false);
                    break;
                } else {
                    o8Var.finishFragment();
                    if (f2Var instanceof y5) {
                        org.telegram.messenger.g0.i3(new k3(2, f2Var), 300L);
                        break;
                    }
                }
                break;
            case 11:
                x9 x9Var = (x9) this.b;
                String str5 = (String) obj;
                ((c20) this.c).a(str5);
                if (str5 == null && !x9Var.r) {
                    if (x9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var2 : x9Var.getParentLayout().getFragmentStack()) {
                            if (f2Var2 instanceof y5) {
                                ((y5) f2Var2).O0();
                            }
                        }
                    }
                    x9Var.finishFragment();
                    break;
                }
                break;
            case 12:
                ia.d0((ia) this.b, (TL_wallet.tonConnectSession) this.c, (c20) obj);
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
                zh.h1 h1Var = (zh.h1) this.b;
                c20 c20Var2 = (c20) this.c;
                Boolean bool = (Boolean) obj;
                h1Var.getClass();
                if (c20Var2 != null) {
                    c20Var2.a(bool);
                }
                if (bool.booleanValue()) {
                    h1Var.N0 = true;
                }
                h1Var.dismiss();
                break;
            case 16:
                bi.v9 v9Var = (bi.v9) this.b;
                bi.i0 i0Var2 = (bi.i0) this.c;
                if (((Object[]) obj)[1] == v9Var) {
                    i0Var2.run();
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

    public /* synthetic */ t(n0 n0Var, i0 i0Var, h8 h8Var) {
        this.a = 2;
        this.b = i0Var;
        this.c = h8Var;
    }
}
