// default package

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cx9 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;
    public final /* synthetic */ bj3 c;

    public /* synthetic */ cx9(bj3 bj3Var, uj3 uj3Var, byte b) {
        this.a = b;
        this.c = bj3Var;
        this.b = uj3Var;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    hl.t1(uj3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    hl.t1(uj3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    hl.t1(uj3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i == 1) {
                    hl.t1(uj3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        dj3 dj3Var;
        int i3;
        d79 d79Var;
        byte b = this.a;
        bj3 bj3Var = this.c;
        switch (b) {
            case 0:
                bj3Var.r0.W();
                bj3Var.U();
                break;
            case 1:
                bj3Var.y0.X();
                bj3Var.U();
                break;
            case 2:
                gx9 gx9Var = bj3Var.e0;
                x46 x46Var = bj3Var.f0;
                int K0 = x46Var.K0();
                int M0 = x46Var.M0();
                int abs = Math.abs(x46Var.M0() - K0) + 1;
                int b2 = recyclerView.getAdapter().b();
                if (abs > 0 && (((gx9Var.V.a() != 0 && !gx9Var.Y) || !gx9Var.X) && (M0 == b2 - 1 || ((dj3Var = gx9Var.V) != null && dj3Var.a() != 0 && (i3 = gx9Var.Z) >= 0 && K0 <= i3 && M0 >= i3)))) {
                    gx9Var.P();
                }
                bj3Var.U();
                break;
            default:
                ix9 ix9Var = bj3Var.m0;
                if (ix9Var.b0 && !ix9Var.Z && !TextUtils.isEmpty(ix9Var.e0) && (d79Var = ix9Var.d) != null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < d79Var.getChildCount()) {
                            if (!(d79Var.getChildAt(i4) instanceof tk4)) {
                                i4++;
                            } else if (ix9Var.b0 && !ix9Var.Z && !TextUtils.isEmpty(ix9Var.e0)) {
                                ix9Var.W(true);
                            }
                        }
                    }
                }
                bj3Var.U();
                break;
        }
    }
}
