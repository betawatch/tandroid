// default package

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kv9 extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;
    public final /* synthetic */ sj3 c;

    public /* synthetic */ kv9(sj3 sj3Var, nk3 nk3Var, byte b) {
        this.a = b;
        this.c = sj3Var;
        this.b = nk3Var;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gm.t1(nk3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    gm.t1(nk3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    gm.t1(nk3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i == 1) {
                    gm.t1(nk3Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        uj3 uj3Var;
        int i3;
        r59 r59Var;
        byte b = this.a;
        sj3 sj3Var = this.c;
        switch (b) {
            case 0:
                sj3Var.r0.W();
                sj3Var.T();
                break;
            case 1:
                sj3Var.y0.X();
                sj3Var.T();
                break;
            case 2:
                ov9 ov9Var = sj3Var.e0;
                u46 u46Var = sj3Var.f0;
                int K0 = u46Var.K0();
                int M0 = u46Var.M0();
                int abs = Math.abs(u46Var.M0() - K0) + 1;
                int b2 = recyclerView.getAdapter().b();
                if (abs > 0 && (((ov9Var.V.a() != 0 && !ov9Var.Y) || !ov9Var.X) && (M0 == b2 - 1 || ((uj3Var = ov9Var.V) != null && uj3Var.a() != 0 && (i3 = ov9Var.Z) >= 0 && K0 <= i3 && M0 >= i3)))) {
                    ov9Var.P();
                }
                sj3Var.T();
                break;
            default:
                qv9 qv9Var = sj3Var.m0;
                if (qv9Var.b0 && !qv9Var.Z && !TextUtils.isEmpty(qv9Var.e0) && (r59Var = qv9Var.d) != null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < r59Var.getChildCount()) {
                            if (!(r59Var.getChildAt(i4) instanceof tk4)) {
                                i4++;
                            } else if (qv9Var.b0 && !qv9Var.Z && !TextUtils.isEmpty(qv9Var.e0)) {
                                qv9Var.W(true);
                            }
                        }
                    }
                }
                sj3Var.T();
                break;
        }
    }
}
