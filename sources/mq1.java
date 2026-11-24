// default package

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mq1 extends s35 {
    public boolean S;
    public final /* synthetic */ mu1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq1(mu1 mu1Var, boolean z) {
        super(z);
        this.T = mu1Var;
    }

    @Override // s35
    public final boolean A1(View view) {
        if (view instanceof gb2) {
            return !((gb2) view).getMessageObject().O3();
        }
        return false;
    }

    @Override // d49
    public final int F() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return 0;
    }

    @Override // d49
    public final int I() {
        return this.S ? (int) this.T.P9 : E();
    }

    @Override // d49
    public final int J() {
        return this.S ? (int) ((this.n - this.T.P9) - B()) : super.J();
    }

    @Override // t26
    public final int W0() {
        return (int) this.T.P9;
    }

    @Override // r35, t26, d49
    public final void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = w01.a;
        try {
            super.a0(wg2Var, p49Var);
        } catch (Exception e) {
            fa4.g(e, true);
            gl.c3(new hq1(this, (byte) 1));
        }
    }

    @Override // t26
    public final void h1(int i, int i2, boolean z) {
        if (!z) {
            i2 = (int) ((i2 - E()) + this.T.P9);
        }
        super.h1(i, i2, z);
    }

    @Override // t26, d49
    public final int j(p49 p49Var) {
        this.S = true;
        int A0 = A0(p49Var);
        this.S = false;
        return A0;
    }

    @Override // r35, t26, d49
    public final int k(p49 p49Var) {
        this.S = true;
        int B0 = B0(p49Var);
        this.S = false;
        return B0;
    }

    @Override // r35, t26, d49
    public final int l(p49 p49Var) {
        this.S = true;
        int C0 = C0(p49Var);
        this.S = false;
        return C0;
    }

    @Override // r35, t26, d49
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        int i2;
        boolean z;
        int i3;
        float f;
        boolean z2 = false;
        mu1 mu1Var = this.T;
        if (i < 0) {
            float f2 = mu1Var.ka;
            if (f2 != 0.0f) {
                float f3 = f2 + i;
                mu1Var.ka = f3;
                if (f3 < 0.0f) {
                    i = (int) f3;
                    mu1Var.ka = 0.0f;
                    mu1Var.A0.invalidate();
                } else {
                    i = 0;
                }
            }
        }
        int childCount = mu1Var.A0.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                i2 = 0;
                z = false;
                break;
            }
            View childAt = mu1Var.A0.getChildAt(i4);
            float f4 = mu1Var.P9;
            mu1Var.A0.getClass();
            if (RecyclerView.R(childAt) == (mu1Var.nb ? 0 : mu1Var.D0.b() - 1)) {
                i2 = super.n0(((float) (childAt.getTop() - i)) > f4 ? (int) (childAt.getTop() - f4) : i, wg2Var, p49Var);
                z = true;
            } else {
                i4++;
            }
        }
        if (!z) {
            i2 = super.n0(i, wg2Var, p49Var);
        }
        if (!mu1Var.fd.f) {
            SparseArray[] sparseArrayArr = mu1Var.o6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i > 0 && i2 == 0 && (((hc2.T(mu1Var.e) && !mu1Var.e.megagroup) || (mu1Var.x4 && !l7c.w(mu1Var.f))) && (i3 = mu1Var.g4) != 3 && i3 != 9 && i3 != 1 && mu1Var.A0.getScrollState() == 1)) {
                jq1 jq1Var = mu1Var.A0;
                if (!jq1Var.W1 && !jq1Var.c2 && !mu1Var.T7()) {
                    if (mu1Var.ka == 0.0f && mu1Var.ma != null) {
                        ArrayList arrayList = mu1Var.Fb;
                        if (arrayList == null || arrayList.isEmpty()) {
                            boolean z3 = mu1Var.x4;
                            kc2 kc2Var = mu1Var.ma;
                            if (z3) {
                                kc2Var.h();
                            } else {
                                kc2Var.f();
                            }
                        } else {
                            mu1Var.ma.g((TLRPC.Chat) mu1Var.Fb.get(0));
                        }
                    }
                    Animator animator = mu1Var.na;
                    if (animator != null) {
                        animator.removeAllListeners();
                        mu1Var.na.cancel();
                    }
                    float f5 = mu1Var.ka;
                    float L = gl.L(110.0f);
                    float f6 = mu1Var.ka;
                    if (f5 < L) {
                        float L2 = f6 / gl.L(110.0f);
                        f = (L2 * 0.45f) + ((1.0f - L2) * 0.65f);
                    } else {
                        f = 0.05f;
                        if (f6 < gl.L(160.0f)) {
                            float L3 = (mu1Var.ka - gl.L(110.0f)) / gl.L(50.0f);
                            f = (L3 * 0.05f) + ((1.0f - L3) * 0.45f);
                        }
                    }
                    float f7 = i * f;
                    mu1Var.ka += f7;
                    int i5 = (int) f7;
                    d19 d19Var = d19.B;
                    if (d19Var != null) {
                        d19Var.r -= i5;
                        if (i5 != 0) {
                            d19Var.u = true;
                        }
                    }
                    mu1Var.A0.invalidate();
                }
            }
        }
        float f8 = mu1Var.ka;
        jq1 jq1Var2 = mu1Var.A0;
        if (f8 == 0.0f) {
            jq1Var2.setOverScrollMode(0);
        } else {
            jq1Var2.setOverScrollMode(2);
        }
        if (mu1Var.ma != null) {
            fm0 fm0Var = mu1Var.dd;
            if (mu1Var.ka > 0.0f && mu1Var.A0.getScrollState() == 1) {
                z2 = true;
            }
            fm0Var.a(z2, true);
        }
        return i2;
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        this.T.Pa = false;
        v26 v26Var = new v26(recyclerView.getContext(), 0);
        v26Var.a = i;
        v0(v26Var);
    }

    @Override // r35, t26, d49
    public final boolean x0() {
        return true;
    }

    @Override // s35
    public final boolean z1(int i) {
        int i2;
        k27 k27Var;
        f27 n7;
        byte b;
        mu1 mu1Var = this.T;
        vs1 vs1Var = mu1Var.D0;
        int i3 = vs1Var.K;
        if (i >= i3 && i < vs1Var.L && (i2 = i - i3) >= 0 && i2 < vs1Var.G().size() && (n7 = mu1Var.n7((k27Var = (k27) mu1Var.D0.G().get(i2)))) != null) {
            ArrayList arrayList = n7.e;
            c27 d = n7.d(k27Var);
            if (d.a != d.b && (b = d.c) == d.d && b != 0) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    c27 c27Var = (c27) arrayList.get(i4);
                    if (c27Var != d) {
                        byte b2 = c27Var.c;
                        byte b3 = d.c;
                        if (b2 <= b3 && c27Var.d >= b3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
