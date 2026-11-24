// default package

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h20 implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((i30) obj).M1.setBufferedProgress(f / 1000.0f);
                break;
            case 1:
                u31 u31Var = (u31) obj;
                u31Var.p = (int) f;
                u31Var.l();
                break;
            case 2:
                if (Math.abs(f) > ((y21) obj).getWidth()) {
                    znaVar.d();
                    break;
                }
                break;
            case 3:
                i22 i22Var = (i22) ((q12) obj).d;
                a22 a22Var = i22Var.w2;
                if (a22Var == i22Var.g2 || a22Var == i22Var.h2 || (i22Var.z1 && i22Var.q3 != null)) {
                    i22Var.K1(1);
                }
                i22Var.w2.m(i22Var.i4);
                i22Var.X0.g();
                i22Var.b.invalidate();
                break;
            case 4:
                c52 c52Var = (c52) obj;
                c52Var.n0 = f;
                c52Var.m0();
                break;
            case 5:
                ll4 ll4Var = (ll4) obj;
                float f3 = f / 1000.0f;
                su suVar = ll4Var.a;
                suVar.setPivotX(gm.L(28.0f));
                suVar.setPivotY(gm.L(28.0f));
                suVar.setScaleX(f3);
                suVar.setScaleY(f3);
                suVar.setAlpha(pqe.a(f3, 0.0f, 1.0f));
                ll4Var.invalidate();
                break;
            case 6:
                ry5 ry5Var = (ry5) obj;
                float f4 = f / 1000.0f;
                ry5Var.t1 = f4;
                tu7 tu7Var = ry5Var.l1;
                tu7Var.setAlpha(f4);
                tu7Var.invalidate();
                ry5Var.T0.invalidate();
                ry5Var.k1.getTypefaceCell().setAlpha(1.0f - ry5Var.t1);
                break;
            case 7:
                bh6 bh6Var = ((mh6) obj).c0;
                if (bh6Var != null) {
                    int i = bh6.G;
                    View view = bh6Var.c;
                    ViewGroup viewGroup = bh6Var.b;
                    PointF pointF = bh6Var.E;
                    zgc.b(view, viewGroup, pointF);
                    wp4 wp4Var = bh6Var.h;
                    wp4Var.setTranslationX(pointF.x);
                    wp4Var.setTranslationY(pointF.y);
                    bh6Var.requestLayout();
                    break;
                }
                break;
            case 8:
                xv7 xv7Var = (xv7) obj;
                float f5 = f / 1000.0f;
                xv7Var.j1 = f5;
                tu7 tu7Var2 = xv7Var.c1;
                tu7Var2.setAlpha(f5);
                tu7Var2.invalidate();
                xv7Var.K0.invalidate();
                xv7Var.b1.getTypefaceCell().setAlpha(1.0f - xv7Var.j1);
                break;
            case 9:
                ((ah7) obj).x();
                break;
            case 10:
                t18 t18Var = (t18) obj;
                float f6 = f / 100.0f;
                t18Var.b = f6;
                TextView textView = t18Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f6 * 0.2f) + 0.8f);
                }
                t18Var.invalidate();
                break;
            case 11:
                eb8 eb8Var = (eb8) obj;
                eb8Var.c0 = f;
                eb8Var.e0 = f2;
                eb8Var.G();
                break;
            case 12:
                vb8 vb8Var = (vb8) obj;
                int L = vb8Var.e > vb8Var.f ? gm.L(48.0f) : 0;
                vdc vdcVar = vb8Var.s.q3;
                int measuredWidth = (int) (((vb8Var.getMeasuredWidth() - gm.L(16.0f)) - f) - L);
                int measuredHeight = vb8Var.getMeasuredHeight();
                vdcVar.h = measuredWidth;
                vdcVar.i = measuredHeight;
                View view2 = vdcVar.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 13:
                dj3 dj3Var = (dj3) obj;
                dj3Var.E = f / 1000.0f;
                dj3Var.invalidate();
                break;
            case 14:
                ((op9) obj).k(f);
                break;
            case 15:
                mw9 mw9Var = (mw9) obj;
                vdc vdcVar2 = mw9Var.r.P;
                int measuredWidth2 = (int) (((mw9Var.getMeasuredWidth() - gm.L(16.0f)) - f) - 0.0f);
                int measuredHeight2 = mw9Var.getMeasuredHeight();
                vdcVar2.h = measuredWidth2;
                vdcVar2.i = measuredHeight2;
                View view3 = vdcVar2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            case 16:
                wca wcaVar = (wca) obj;
                float f7 = f / 1000.0f;
                lka lkaVar = wcaVar.c;
                lkaVar.setAlpha(f7);
                qz8 qz8Var = wcaVar.b;
                float f8 = 1.0f - f7;
                qz8Var.setAlpha(f8);
                lkaVar.setTranslationX(f8 * (-gm.L(10.0f)));
                qz8Var.setTranslationX(f7 * gm.L(10.0f));
                break;
            case 17:
                l5b l5bVar = (l5b) obj;
                l5bVar.d0 = f;
                l5bVar.f0 = f2;
                break;
            case 18:
                m0c m0cVar = (m0c) obj;
                m0cVar.H = f;
                m0cVar.c();
                break;
            case 19:
                xqc xqcVar = (xqc) obj;
                xqcVar.e = f;
                xqcVar.setScaleX(f);
                xqcVar.setScaleY(f);
                break;
            case 20:
                rrc rrcVar = (rrc) obj;
                rrcVar.c0 = f;
                rrcVar.G0();
                break;
            default:
                ((qrc) obj).d.setConversionWobble(f);
                break;
        }
    }
}
