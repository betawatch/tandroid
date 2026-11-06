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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ td0(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
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
                ud0 ud0Var = (ud0) callback;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (ud0Var.h == null) {
                    fi.j3 j3Var = new fi.j3(context, f6Var, org.telegram.messenger.hd.M0(2131743608, null), ud0Var.f);
                    ud0Var.h = j3Var;
                    j3Var.n(new ob0(ud0Var, 5));
                    ud0Var.h.m1 = ud0Var.n;
                }
                ud0Var.h.show();
                break;
            case 1:
                i21 i21Var = (i21) callback;
                org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) obj;
                k21 k21Var = i21Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = k21Var.r1;
                j21 j21Var = k21Var.E1;
                if (!TextUtils.equals(str, edVar.f)) {
                    View view2 = j21Var.d;
                    if (view2 == k21Var.v1 || view2 == k21Var.p1) {
                        k21Var.s1 = k21Var.r1;
                    }
                    g21 g21Var = i21Var.e;
                    String str2 = edVar.f;
                    k21Var.r1 = str2;
                    g21Var.setText(k21.K0(k21.O0(str2, null, null)));
                    j21Var.D(k21Var.n1 != null ? k21Var.o1 : k21Var.u1);
                    k21.S0(k21Var.r1);
                    k21Var.W0();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) callback;
                org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) obj2;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj;
                long j3 = bkVar.b;
                f10Var.J(j3, true, false);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(bkVar.a).M0(Long.valueOf(-j3));
                hc.a0(bkVar.c).K(R.raw.msg_translate, org.telegram.messenger.g0.X2((M0 == null || !org.telegram.messenger.t3.V(M0)) ? M0 != null ? org.telegram.messenger.hd.M0(2131743949, null) : org.telegram.messenger.hd.M0(2131743950, null) : org.telegram.messenger.hd.M0(2131743951, null)), org.telegram.messenger.hd.M0(2131743886, null), new v80(27, bkVar, f10Var)).j();
                g1Var.d(true);
                break;
            case 3:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) callback;
                Context context2 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!up0Var.u1) {
                    Runnable runnable2 = up0Var.D1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    sg.q qVar = new sg.q(context2, up0Var.z1);
                    qVar.I0(up0Var.t1.a, 2);
                    qVar.o1 = new androidx.activity.n(up0Var, bitmap, 6);
                    qVar.n1 = new tg.m(up0Var, 1);
                    qVar.show();
                    break;
                }
                break;
            case 4:
                new zh.m((Context) obj2, null, null, (org.telegram.messenger.s9) obj).show();
                ((zh.f) callback).dismiss();
                break;
            case 5:
                zh.m mVar = (zh.m) callback;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.w9.c(mVar.a).e(mVar.P1, new bi.v3(mVar, zArr, f6Var2, 12));
                    break;
                }
                break;
            case 6:
                zh.v vVar = (zh.v) callback;
                int i11 = vVar.a;
                org.telegram.messenger.s9 s9Var = vVar.e2;
                new bi.w1((Context) obj2, (org.telegram.ui.ActionBar.f6) obj, i11, s9Var.d.title, s9Var.h, false).show();
                vVar.dismiss();
                break;
            case 7:
                zh.v vVar2 = (zh.v) callback;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.w9.c(vVar2.a).e(vVar2.Q1, new bi.v3(vVar2, zArr2, f6Var3, 13));
                    break;
                }
                break;
            default:
                zh.a2 a2Var = (zh.a2) callback;
                ((k60) obj2).u();
                up0 up0Var2 = a2Var.a;
                zh.t1 t1Var = new zh.t1(a2Var, (TL_stars.SavedStarGift) obj, i10);
                HashMap hashMap = zh.f2.U;
                up0Var2.h(null, t1Var);
                break;
        }
    }
}
