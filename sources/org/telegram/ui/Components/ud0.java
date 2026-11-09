package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ud0(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        KeyEvent.Callback callback = this.b;
        switch (i7) {
            case 0:
                vd0 vd0Var = (vd0) callback;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (vd0Var.h == null) {
                    fi.j3 j3Var = new fi.j3(context, g6Var, org.telegram.messenger.id.M0(2131743607, null), vd0Var.f);
                    vd0Var.h = j3Var;
                    j3Var.n(new pb0(vd0Var, 5));
                    vd0Var.h.m1 = vd0Var.n;
                }
                vd0Var.h.show();
                break;
            case 1:
                j21 j21Var = (j21) callback;
                org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) obj;
                l21 l21Var = j21Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = l21Var.r1;
                k21 k21Var = l21Var.E1;
                if (!TextUtils.equals(str, fdVar.f)) {
                    View view2 = k21Var.d;
                    if (view2 == l21Var.v1 || view2 == l21Var.p1) {
                        l21Var.s1 = l21Var.r1;
                    }
                    h21 h21Var = j21Var.e;
                    String str2 = fdVar.f;
                    l21Var.r1 = str2;
                    h21Var.setText(l21.K0(l21.O0(str2, null, null)));
                    k21Var.D(l21Var.n1 != null ? l21Var.o1 : l21Var.u1);
                    l21.S0(l21Var.r1);
                    l21Var.W0();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) callback;
                org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) obj2;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj;
                long j3 = dkVar.b;
                f10Var.J(j3, true, false);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(dkVar.a).M0(Long.valueOf(-j3));
                hc.a0(dkVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.X2((M0 == null || !org.telegram.messenger.t3.V(M0)) ? M0 != null ? org.telegram.messenger.id.M0(2131743948, null) : org.telegram.messenger.id.M0(2131743949, null) : org.telegram.messenger.id.M0(2131743950, null)), org.telegram.messenger.id.M0(2131743885, null), new w80(27, dkVar, f10Var)).j();
                g1Var.d(true);
                break;
            case 3:
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) callback;
                Context context2 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!wp0Var.u1) {
                    Runnable runnable2 = wp0Var.D1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    sg.q qVar = new sg.q(context2, wp0Var.z1);
                    qVar.I0(wp0Var.t1.a, 2);
                    qVar.o1 = new androidx.activity.n(wp0Var, bitmap, 6);
                    qVar.n1 = new tg.m(wp0Var, 1);
                    qVar.show();
                    break;
                }
                break;
            case 4:
                new zh.l((Context) obj2, null, null, (org.telegram.messenger.s9) obj).show();
                ((zh.f) callback).dismiss();
                break;
            case 5:
                zh.l lVar = (zh.l) callback;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.w9.c(lVar.a).e(lVar.P1, new bi.v3(lVar, zArr, g6Var2, 12));
                    break;
                }
                break;
            case 6:
                zh.u uVar = (zh.u) callback;
                int i11 = uVar.a;
                org.telegram.messenger.s9 s9Var = uVar.e2;
                new bi.w1((Context) obj2, (org.telegram.ui.ActionBar.g6) obj, i11, s9Var.d.title, s9Var.h, false).show();
                uVar.dismiss();
                break;
            case 7:
                zh.u uVar2 = (zh.u) callback;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.w9.c(uVar2.a).e(uVar2.Q1, new bi.v3(uVar2, zArr2, g6Var3, 13));
                    break;
                }
                break;
            default:
                zh.z1 z1Var = (zh.z1) callback;
                ((l60) obj2).u();
                vp0 vp0Var = z1Var.a;
                zh.s1 s1Var = new zh.s1(z1Var, (TL_stars.SavedStarGift) obj, i10);
                HashMap hashMap = zh.d2.U;
                vp0Var.h(null, s1Var);
                break;
        }
    }
}
