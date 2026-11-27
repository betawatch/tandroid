// default package

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        uu0 uu0Var;
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((t1) ((p1) obj).b).e();
                break;
            case 1:
                ((id) obj).L = null;
                break;
            case 2:
                hl.t1((ni) obj);
                break;
            case 3:
                ((hm1) obj).run();
                break;
            case 4:
                hl.t1((ij) obj);
                break;
            case 5:
                ((io0) obj).a.y0(false);
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    break;
                }
                break;
            case 7:
                rv0 rv0Var = ((av0) obj).e.R;
                if (rv0Var != null && (uu0Var = rv0Var.c) != null) {
                    uu0Var.z();
                    break;
                }
                break;
            case 8:
                uu0 uu0Var2 = ((jv0) obj).b.e.R.c;
                if (uu0Var2 != null) {
                    uu0Var2.z();
                    break;
                }
                break;
            case 9:
                hl.t1((k41) obj);
                break;
            case 10:
                ((ha1) obj).l1.onFragmentDestroy();
                break;
            case 11:
                gi1 gi1Var = (gi1) obj;
                boolean g = gi1Var.x.g();
                b29 b29Var = gi1Var.L;
                if (!g) {
                    b29Var.K(86);
                    gi1Var.n.d();
                    break;
                } else {
                    b29Var.I(0, false, false);
                    break;
                }
            case 12:
                wb2 wb2Var = (wb2) obj;
                if (wb2Var != null) {
                    wb2Var.i3(-1);
                    break;
                }
                break;
            case 13:
                v21 v21Var = ((v21[]) obj)[0];
                if (v21Var != null) {
                    v21Var.b();
                    break;
                }
                break;
            case 14:
                ((n12) obj).z4 = false;
                break;
            case 15:
                h42 h42Var = (h42) obj;
                h42Var.U0 = null;
                h42Var.T.post(new a42(h42Var, b2));
                break;
            case 16:
                ((v72) obj).P = null;
                break;
            case 17:
                g92 g92Var = (g92) obj;
                boolean g2 = g92Var.s.g();
                b29 b29Var2 = g92Var.S0;
                if (!g2) {
                    b29Var2.K(86);
                    g92Var.c0.e.d();
                    break;
                } else {
                    b29Var2.I(0, false, false);
                    break;
                }
            case 18:
                xt3 xt3Var = (xt3) obj;
                xt3Var.c2 = null;
                xt3Var.requestFocus();
                break;
            case 19:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 20:
                hl.t1((m84) obj);
                break;
            case 21:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                break;
            case 22:
                n55 n55Var = (n55) obj;
                if (!n55Var.e) {
                    n55Var.e = true;
                    hl3 hl3Var = n55Var.h;
                    if (hl3Var != null) {
                        hl3Var.run();
                    }
                    if (!n55Var.f) {
                        n55Var.f = true;
                        n55Var.b.c();
                        break;
                    }
                }
                break;
            case 23:
                xc5 xc5Var = (xc5) obj;
                boolean g3 = xc5Var.O.g();
                b29 b29Var3 = xc5Var.S;
                if (!g3) {
                    b29Var3.K(86);
                    xc5Var.f.d();
                    break;
                } else {
                    b29Var3.I(0, false, false);
                    break;
                }
            case 24:
                l46 l46Var = (l46) obj;
                l46Var.a2 = false;
                l46Var.s2.e0 = true;
                l46Var.z2.invalidate();
                l46Var.s2.invalidate();
                break;
            case 25:
                cg6 cg6Var = (cg6) obj;
                b29 b29Var4 = cg6Var.K;
                boolean g4 = cg6Var.N.g();
                di1 di1Var = cg6Var.n;
                if (!g4) {
                    di1Var.setAnimation(b29Var4);
                    b29Var4.K(86);
                    di1Var.setOnAnimationEndListener(new re6(cg6Var, b2));
                    di1Var.d();
                    break;
                } else {
                    di1Var.setAnimation(b29Var4);
                    b29Var4.I(0, false, false);
                    cg6Var.M = true;
                    break;
                }
            case 26:
                ((e17) obj).s = null;
                break;
            case 27:
                ((nx0) obj).dismiss();
                break;
            case 28:
                ((uoa) obj).run();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                ((PhotoViewer) obj).Q1 = null;
                break;
        }
    }
}
