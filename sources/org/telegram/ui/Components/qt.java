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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qt(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
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
                wt wtVar = (wt) this.b;
                cu0 cu0Var = (cu0) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                rt rtVar = wtVar.a;
                kg.k kVar = wtVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.i1 i1Var = wtVar.L;
                    if (i1Var == null || !i1Var.f) {
                        if (!wtVar.n) {
                            if (!wtVar.e) {
                                wtVar.x(1);
                                boolean isFocused = rtVar.isFocused();
                                wtVar.d.C(rtVar.length() > 0, false);
                                rtVar.requestFocus();
                                if (!isFocused) {
                                    rtVar.setSelection(rtVar.length());
                                    break;
                                }
                            } else {
                                if (wtVar.y) {
                                    wtVar.k(true);
                                    wtVar.y = false;
                                    wtVar.p();
                                }
                                wtVar.v();
                                break;
                            }
                        } else {
                            rtVar.m();
                            x60 x60Var = new x60(cu0Var, i6Var, kVar, false, false, true);
                            x60Var.a0 = org.telegram.messenger.g0.L(280.0f);
                            rtVar.o(null, new t90(x60Var, rtVar));
                            x60Var.X = true;
                            x60Var.a0();
                            break;
                        }
                    }
                }
                break;
            case 1:
                p10 p10Var = (p10) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                p10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131749385, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749386, null));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749387, null), new hy(p10Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                g2Var.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                d80 d80Var = (d80) this.b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                try {
                    if (d80Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d80Var.b));
                        if (w2Var == null || (m2Var = w2Var.c) == null) {
                            kc.j(g2Var2).j();
                        } else {
                            new kc(m2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 3:
                na0 na0Var = (na0) this.b;
                sa0 sa0Var = (sa0) this.c;
                sa0 sa0Var2 = (sa0) this.d;
                ta0 ta0Var = na0Var.d0;
                org.telegram.messenger.jj jjVar = ta0Var.d;
                boolean z10 = jjVar.l;
                boolean z11 = !z10;
                jjVar.l = z11;
                if (z10) {
                    if (ta0Var.y) {
                        jjVar.k = false;
                    }
                    ta0Var.y = false;
                } else if (!jjVar.k) {
                    jjVar.k = true;
                    ta0Var.y = true;
                }
                sa0Var.a(z11, true);
                sa0Var2.a(jjVar.k, true);
                na0Var.i();
                na0Var.l(true);
                break;
            case 4:
                wc0.K0((wc0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.y40) this.d);
                break;
            case 5:
                ee0 ee0Var = (ee0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                if (ee0Var.h == null) {
                    hi.q3 q3Var = new hi.q3(context2, i6Var2, org.telegram.messenger.gd.N0(2131743360, null), ee0Var.f);
                    ee0Var.h = q3Var;
                    q3Var.n(new eb0(ee0Var, 7));
                    ee0Var.h.q1 = ee0Var.n;
                }
                ee0Var.h.show();
                break;
            case 6:
                y21 y21Var = (y21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) this.d;
                a31 a31Var = y21Var.n;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = a31Var.v1;
                z21 z21Var = a31Var.I1;
                if (!TextUtils.equals(str, cdVar.f)) {
                    View view2 = z21Var.d;
                    if (view2 == a31Var.z1 || view2 == a31Var.t1) {
                        a31Var.w1 = a31Var.v1;
                    }
                    w21 w21Var = y21Var.e;
                    String str2 = cdVar.f;
                    a31Var.v1 = str2;
                    w21Var.setText(a31.L0(a31.P0(str2, null, null)));
                    z21Var.D(a31Var.r1 != null ? a31Var.s1 : a31Var.y1);
                    a31.U0(a31Var.v1);
                    a31Var.Y0();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                long j3 = ckVar.b;
                y00Var.J(j3, true, false);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(ckVar.a).O0(Long.valueOf(-j3));
                kc.b0(ckVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.W2((O0 == null || !org.telegram.messenger.v3.V(O0)) ? O0 != null ? org.telegram.messenger.gd.N0(2131743701, null) : org.telegram.messenger.gd.N0(2131743702, null) : org.telegram.messenger.gd.N0(2131743703, null)), org.telegram.messenger.gd.N0(2131743638, null), new sh0(21, ckVar, y00Var)).j();
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
                    qVar.r1 = new tg.r(vp0Var, 1);
                    qVar.show();
                    break;
                }
                break;
        }
    }
}
