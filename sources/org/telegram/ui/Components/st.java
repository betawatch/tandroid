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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class st implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ st(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.a) {
            case 0:
                yt ytVar = (yt) this.b;
                du0 du0Var = (du0) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                tt ttVar = ytVar.a;
                kg.k kVar = ytVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.i1 i1Var = ytVar.L;
                    if (i1Var == null || !i1Var.f) {
                        if (!ytVar.n) {
                            if (!ytVar.e) {
                                ytVar.x(1);
                                boolean isFocused = ttVar.isFocused();
                                ytVar.d.C(ttVar.length() > 0, false);
                                ttVar.requestFocus();
                                if (!isFocused) {
                                    ttVar.setSelection(ttVar.length());
                                    break;
                                }
                            } else {
                                if (ytVar.y) {
                                    ytVar.k(true);
                                    ytVar.y = false;
                                    ytVar.p();
                                }
                                ytVar.v();
                                break;
                            }
                        } else {
                            ttVar.m();
                            a70 a70Var = new a70(du0Var, h6Var, kVar, false, false, true);
                            a70Var.a0 = org.telegram.messenger.g0.L(280.0f);
                            ttVar.o(null, new w90(a70Var, ttVar));
                            a70Var.X = true;
                            a70Var.a0();
                            break;
                        }
                    }
                }
                break;
            case 1:
                r10 r10Var = (r10) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                r10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131749385, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131749386, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131749387, null), new ky(r10Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                g2Var.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                g80 g80Var = (g80) this.b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                try {
                    if (g80Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g80Var.b));
                        if (w2Var == null || (m2Var = w2Var.c) == null) {
                            lc.j(g2Var2).j();
                        } else {
                            new lc(m2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 3:
                qa0 qa0Var = (qa0) this.b;
                va0 va0Var = (va0) this.c;
                va0 va0Var2 = (va0) this.d;
                wa0 wa0Var = qa0Var.d0;
                org.telegram.messenger.kj kjVar = wa0Var.d;
                boolean z10 = kjVar.l;
                boolean z11 = !z10;
                kjVar.l = z11;
                if (z10) {
                    if (wa0Var.y) {
                        kjVar.k = false;
                    }
                    wa0Var.y = false;
                } else if (!kjVar.k) {
                    kjVar.k = true;
                    wa0Var.y = true;
                }
                va0Var.a(z11, true);
                va0Var2.a(kjVar.k, true);
                qa0Var.i();
                qa0Var.l(true);
                break;
            case 4:
                yc0.K0((yc0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.z40) this.d);
                break;
            case 5:
                fe0 fe0Var = (fe0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) this.d;
                if (fe0Var.h == null) {
                    hi.h3 h3Var = new hi.h3(context2, h6Var2, org.telegram.messenger.hd.N0(2131743362, null), fe0Var.f);
                    fe0Var.h = h3Var;
                    h3Var.n(new hb0(fe0Var, 7));
                    fe0Var.h.q1 = fe0Var.n;
                }
                fe0Var.h.show();
                break;
            case 6:
                z21 z21Var = (z21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.d;
                b31 b31Var = z21Var.n;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = b31Var.v1;
                a31 a31Var = b31Var.I1;
                if (!TextUtils.equals(str, ddVar.f)) {
                    View view2 = a31Var.d;
                    if (view2 == b31Var.z1 || view2 == b31Var.t1) {
                        b31Var.w1 = b31Var.v1;
                    }
                    x21 x21Var = z21Var.e;
                    String str2 = ddVar.f;
                    b31Var.v1 = str2;
                    x21Var.setText(b31.L0(b31.P0(str2, null, null)));
                    a31Var.D(b31Var.r1 != null ? b31Var.s1 : b31Var.y1);
                    b31.U0(b31Var.v1);
                    b31Var.Y0();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                org.telegram.messenger.a10 a10Var = (org.telegram.messenger.a10) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                long j3 = ckVar.b;
                a10Var.J(j3, true, false);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(ckVar.a).O0(Long.valueOf(-j3));
                lc.b0(ckVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.W2((O0 == null || !org.telegram.messenger.v3.V(O0)) ? O0 != null ? org.telegram.messenger.hd.N0(2131743703, null) : org.telegram.messenger.hd.N0(2131743704, null) : org.telegram.messenger.hd.N0(2131743705, null)), org.telegram.messenger.hd.N0(2131743640, null), new fm0(19, ckVar, a10Var)).j();
                g1Var.d(true);
                break;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
                Context context3 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!vp0Var.v1) {
                    Runnable runnable2 = vp0Var.E1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    sg.q qVar = new sg.q(context3, vp0Var.A1);
                    qVar.J0(vp0Var.u1.a, 2);
                    qVar.s1 = new androidx.activity.n(vp0Var, bitmap, 7);
                    qVar.r1 = new tg.m(vp0Var, 1);
                    qVar.show();
                    break;
                }
                break;
        }
    }
}
