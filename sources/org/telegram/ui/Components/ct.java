package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ct(KeyEvent.Callback callback, Object obj, Object obj2, int i3) {
        this.a = i3;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.j2 j2Var;
        int i3 = 2;
        switch (this.a) {
            case 0:
                jt jtVar = (jt) this.b;
                qt0 qt0Var = (qt0) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                dt dtVar = jtVar.a;
                lg.k kVar = jtVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.h1 h1Var = jtVar.L;
                    if (h1Var == null || !h1Var.f) {
                        if (!jtVar.n) {
                            if (!jtVar.e) {
                                jtVar.x(1);
                                boolean isFocused = dtVar.isFocused();
                                jtVar.d.C(dtVar.length() > 0, false);
                                dtVar.requestFocus();
                                if (!isFocused) {
                                    dtVar.setSelection(dtVar.length());
                                    break;
                                }
                            } else {
                                if (jtVar.y) {
                                    jtVar.k(true);
                                    jtVar.y = false;
                                    jtVar.p();
                                }
                                jtVar.v();
                                break;
                            }
                        } else {
                            dtVar.m();
                            f60 f60Var = new f60(qt0Var, e6Var, kVar, false, false, true);
                            f60Var.X = org.telegram.messenger.g0.L(280.0f);
                            dtVar.o(null, new d90(f60Var, dtVar));
                            f60Var.U = true;
                            f60Var.Z();
                            break;
                        }
                    }
                }
                break;
            case 1:
                a10 a10Var = (a10) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                a10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131749569, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749570, null));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749571, null), new zw(a10Var, 4));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                d2Var.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                m70 m70Var = (m70) this.b;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.d;
                try {
                    if (m70Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.b));
                        if (t2Var == null || (j2Var = t2Var.c) == null) {
                            fc.j(d2Var2).j();
                        } else {
                            new fc(j2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 3:
                x90 x90Var = (x90) this.b;
                ca0 ca0Var = (ca0) this.c;
                ca0 ca0Var2 = (ca0) this.d;
                da0 da0Var = x90Var.d0;
                org.telegram.messenger.dj djVar = da0Var.d;
                boolean z10 = djVar.l;
                boolean z11 = !z10;
                djVar.l = z11;
                if (z10) {
                    if (da0Var.y) {
                        djVar.k = false;
                    }
                    da0Var.y = false;
                } else if (!djVar.k) {
                    djVar.k = true;
                    da0Var.y = true;
                }
                ca0Var.a(z11, true);
                ca0Var2.a(djVar.k, true);
                x90Var.i();
                x90Var.l(true);
                break;
            case 4:
                hc0.J0((hc0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.r40) this.d);
                break;
            case 5:
                od0 od0Var = (od0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                if (od0Var.h == null) {
                    gi.h3 h3Var = new gi.h3(context2, e6Var2, org.telegram.messenger.bd.M0(2131743617, null), od0Var.f);
                    od0Var.h = h3Var;
                    h3Var.n(new jb0(od0Var, 5));
                    od0Var.h.n1 = od0Var.n;
                }
                od0Var.h.show();
                break;
            case 6:
                d21 d21Var = (d21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) this.d;
                f21 f21Var = d21Var.n;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = f21Var.s1;
                e21 e21Var = f21Var.F1;
                if (!TextUtils.equals(str, ycVar.f)) {
                    View view2 = e21Var.d;
                    if (view2 == f21Var.w1 || view2 == f21Var.q1) {
                        f21Var.t1 = f21Var.s1;
                    }
                    b21 b21Var = d21Var.e;
                    String str2 = ycVar.f;
                    f21Var.s1 = str2;
                    b21Var.setText(f21.K0(f21.O0(str2, null, null)));
                    e21Var.D(f21Var.o1 != null ? f21Var.p1 : f21Var.v1);
                    f21.S0(f21Var.s1);
                    f21Var.W0();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.xj xjVar = (org.telegram.ui.xj) this.b;
                org.telegram.messenger.x00 x00Var = (org.telegram.messenger.x00) this.c;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.d;
                long j10 = xjVar.b;
                x00Var.J(j10, true, false);
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(xjVar.a).M0(Long.valueOf(-j10));
                fc.a0(xjVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.X2((M0 == null || !org.telegram.messenger.t3.V(M0)) ? M0 != null ? org.telegram.messenger.bd.M0(2131743958, null) : org.telegram.messenger.bd.M0(2131743959, null) : org.telegram.messenger.bd.M0(2131743960, null)), org.telegram.messenger.bd.M0(2131743895, null), new p11(i3, xjVar, x00Var)).j();
                f1Var.d(true);
                break;
            default:
                org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.b;
                Context context3 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!lp0Var.v1) {
                    Runnable runnable2 = lp0Var.E1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    tg.q qVar = new tg.q(context3, lp0Var.A1);
                    qVar.I0(lp0Var.u1.a, 2);
                    qVar.p1 = new androidx.activity.n(lp0Var, bitmap, 9);
                    qVar.o1 = new ug.m(lp0Var, 1);
                    qVar.show();
                    break;
                }
                break;
        }
    }
}
