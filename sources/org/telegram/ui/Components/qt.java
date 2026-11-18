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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.a) {
            case 0:
                wt wtVar = (wt) this.b;
                au0 au0Var = (au0) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                rt rtVar = wtVar.a;
                kg.k kVar = wtVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.j1 j1Var = wtVar.L;
                    if (j1Var == null || !j1Var.f) {
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
                            y60 y60Var = new y60(au0Var, i6Var, kVar, false, false, true);
                            y60Var.a0 = org.telegram.messenger.g0.L(280.0f);
                            rtVar.o(null, new u90(y60Var, rtVar));
                            y60Var.X = true;
                            y60Var.a0();
                            break;
                        }
                    }
                }
                break;
            case 1:
                o10 o10Var = (o10) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                o10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131749386, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749387, null));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749388, null), new iy(o10Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                h2Var.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                e80 e80Var = (e80) this.b;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.c;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.d;
                try {
                    if (e80Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e80Var.b));
                        if (x2Var == null || (n2Var = x2Var.c) == null) {
                            lc.j(h2Var2).j();
                        } else {
                            new lc(n2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 3:
                oa0 oa0Var = (oa0) this.b;
                ta0 ta0Var = (ta0) this.c;
                ta0 ta0Var2 = (ta0) this.d;
                ua0 ua0Var = oa0Var.d0;
                org.telegram.messenger.jj jjVar = ua0Var.d;
                boolean z10 = jjVar.l;
                boolean z11 = !z10;
                jjVar.l = z11;
                if (z10) {
                    if (ua0Var.y) {
                        jjVar.k = false;
                    }
                    ua0Var.y = false;
                } else if (!jjVar.k) {
                    jjVar.k = true;
                    ua0Var.y = true;
                }
                ta0Var.a(z11, true);
                ta0Var2.a(jjVar.k, true);
                oa0Var.i();
                oa0Var.l(true);
                break;
            case 4:
                xc0.K0((xc0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.z40) this.d);
                break;
            case 5:
                ee0 ee0Var = (ee0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                if (ee0Var.h == null) {
                    hi.i3 i3Var = new hi.i3(context2, i6Var2, org.telegram.messenger.gd.M0(2131743370, null), ee0Var.f);
                    ee0Var.h = i3Var;
                    i3Var.n(new gb0(ee0Var, 7));
                    ee0Var.h.q1 = ee0Var.n;
                }
                ee0Var.h.show();
                break;
            case 6:
                w21 w21Var = (w21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) this.d;
                y21 y21Var = w21Var.n;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = y21Var.v1;
                x21 x21Var = y21Var.I1;
                if (!TextUtils.equals(str, cdVar.f)) {
                    View view2 = x21Var.d;
                    if (view2 == y21Var.z1 || view2 == y21Var.t1) {
                        y21Var.w1 = y21Var.v1;
                    }
                    u21 u21Var = w21Var.e;
                    String str2 = cdVar.f;
                    y21Var.v1 = str2;
                    u21Var.setText(y21.L0(y21.P0(str2, null, null)));
                    x21Var.D(y21Var.r1 != null ? y21Var.s1 : y21Var.y1);
                    y21.U0(y21Var.v1);
                    y21Var.Y0();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                org.telegram.messenger.z00 z00Var = (org.telegram.messenger.z00) this.c;
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.d;
                long j3 = ckVar.b;
                z00Var.J(j3, true, false);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(ckVar.a).O0(Long.valueOf(-j3));
                lc.b0(ckVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.W2((O0 == null || !org.telegram.messenger.v3.V(O0)) ? O0 != null ? org.telegram.messenger.gd.M0(2131743711, null) : org.telegram.messenger.gd.M0(2131743712, null) : org.telegram.messenger.gd.M0(2131743713, null)), org.telegram.messenger.gd.M0(2131743648, null), new hn0(17, ckVar, z00Var)).j();
                h1Var.d(true);
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
