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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lt(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 k2Var;
        switch (this.a) {
            case 0:
                rt rtVar = (rt) this.b;
                st0 st0Var = (st0) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                mt mtVar = rtVar.a;
                kg.k kVar = rtVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.i1 i1Var = rtVar.L;
                    if (i1Var == null || !i1Var.f) {
                        if (!rtVar.n) {
                            if (!rtVar.e) {
                                rtVar.x(1);
                                boolean isFocused = mtVar.isFocused();
                                rtVar.d.C(mtVar.length() > 0, false);
                                mtVar.requestFocus();
                                if (!isFocused) {
                                    mtVar.setSelection(mtVar.length());
                                    break;
                                }
                            } else {
                                if (rtVar.y) {
                                    rtVar.k(true);
                                    rtVar.y = false;
                                    rtVar.p();
                                }
                                rtVar.v();
                                break;
                            }
                        } else {
                            mtVar.m();
                            m60 m60Var = new m60(st0Var, e6Var, kVar, false, false, true);
                            m60Var.X = org.telegram.messenger.g0.L(280.0f);
                            mtVar.o(null, new k90(m60Var, mtVar));
                            m60Var.U = true;
                            m60Var.Z();
                            break;
                        }
                    }
                }
                break;
            case 1:
                h10 h10Var = (h10) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                h10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131749561, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749562, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749563, null), new gx(h10Var, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                e2Var.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                t70 t70Var = (t70) this.b;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.d;
                try {
                    if (t70Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", t70Var.b));
                        if (u2Var == null || (k2Var = u2Var.c) == null) {
                            cc.j(e2Var2).j();
                        } else {
                            new cc(k2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 3:
                ea0 ea0Var = (ea0) this.b;
                ja0 ja0Var = (ja0) this.c;
                ja0 ja0Var2 = (ja0) this.d;
                ka0 ka0Var = ea0Var.d0;
                org.telegram.messenger.kj kjVar = ka0Var.d;
                boolean z10 = kjVar.l;
                boolean z11 = !z10;
                kjVar.l = z11;
                if (z10) {
                    if (ka0Var.y) {
                        kjVar.k = false;
                    }
                    ka0Var.y = false;
                } else if (!kjVar.k) {
                    kjVar.k = true;
                    ka0Var.y = true;
                }
                ja0Var.a(z11, true);
                ja0Var2.a(kjVar.k, true);
                ea0Var.i();
                ea0Var.l(true);
                break;
            case 4:
                nc0.J0((nc0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.w40) this.d);
                break;
            case 5:
                ud0 ud0Var = (ud0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                if (ud0Var.h == null) {
                    hi.h3 h3Var = new hi.h3(context2, e6Var2, org.telegram.messenger.hd.M0(2131743607, null), ud0Var.f);
                    ud0Var.h = h3Var;
                    h3Var.n(new wa0(ud0Var, 7));
                    ud0Var.h.q1 = ud0Var.n;
                }
                ud0Var.h.show();
                break;
            case 6:
                n21 n21Var = (n21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.d;
                p21 p21Var = n21Var.n;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = p21Var.v1;
                o21 o21Var = p21Var.I1;
                if (!TextUtils.equals(str, ddVar.f)) {
                    View view2 = o21Var.d;
                    if (view2 == p21Var.z1 || view2 == p21Var.t1) {
                        p21Var.w1 = p21Var.v1;
                    }
                    l21 l21Var = n21Var.e;
                    String str2 = ddVar.f;
                    p21Var.v1 = str2;
                    l21Var.setText(p21.K0(p21.O0(str2, null, null)));
                    o21Var.D(p21Var.r1 != null ? p21Var.s1 : p21Var.y1);
                    p21.T0(p21Var.v1);
                    p21Var.X0();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.b;
                org.telegram.messenger.c10 c10Var = (org.telegram.messenger.c10) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                long j3 = bkVar.b;
                c10Var.J(j3, true, false);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(bkVar.a).M0(Long.valueOf(-j3));
                cc.a0(bkVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.X2((M0 == null || !org.telegram.messenger.t3.V(M0)) ? M0 != null ? org.telegram.messenger.hd.M0(2131743948, null) : org.telegram.messenger.hd.M0(2131743949, null) : org.telegram.messenger.hd.M0(2131743950, null)), org.telegram.messenger.hd.M0(2131743885, null), new hh0(22, bkVar, c10Var)).j();
                g1Var.d(true);
                break;
            default:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.b;
                Context context3 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!tp0Var.v1) {
                    Runnable runnable2 = tp0Var.E1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    sg.q qVar = new sg.q(context3, tp0Var.A1);
                    qVar.I0(tp0Var.u1.a, 2);
                    qVar.s1 = new androidx.activity.n(tp0Var, bitmap, 7);
                    qVar.r1 = new tg.m(tp0Var, 1);
                    qVar.show();
                    break;
                }
                break;
        }
    }
}
