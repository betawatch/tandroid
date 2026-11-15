package org.telegram.ui;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dj extends v4.t {
    public boolean S;
    public final /* synthetic */ an T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(an anVar, boolean z10) {
        super(z10);
        this.T = anVar;
    }

    @Override // v4.t
    public final boolean B1(int i7) {
        int i10;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.bj u92;
        byte b10;
        an anVar = this.T;
        jl jlVar = anVar.D0;
        int i11 = jlVar.K;
        if (i7 >= i11 && i7 < jlVar.L && (i10 = i7 - i11) >= 0 && i10 < jlVar.L().size() && (u92 = anVar.u9((gjVar = (org.telegram.messenger.gj) anVar.D0.L().get(i10)))) != null) {
            ArrayList arrayList = u92.e;
            org.telegram.messenger.yi d = u92.d(gjVar);
            if (d.a != d.b && (b10 = d.c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) arrayList.get(i12);
                    if (yiVar != d) {
                        byte b11 = yiVar.c;
                        byte b12 = d.c;
                        if (b11 <= b12 && yiVar.d >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // v4.t
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
        }
        return false;
    }

    @Override // v4.o0
    public final int G() {
        if (this.S) {
            return (int) this.T.O9;
        }
        return 0;
    }

    @Override // v4.o0
    public final int J() {
        return this.S ? (int) this.T.O9 : F();
    }

    @Override // v4.o0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.O9) - C()) : super.K();
    }

    @Override // v4.b0
    public final int X0() {
        return (int) this.T.O9;
    }

    @Override // v4.s, v4.b0, v4.o0
    public final void b0(v4.w0 w0Var, v4.b1 b1Var) {
        boolean z10 = org.telegram.messenger.r2.a;
        try {
            super.b0(w0Var, b1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new bh(this, 4));
        }
    }

    @Override // v4.b0
    public final void i1(int i7, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.O9);
        }
        super.i1(i7, i10, z10);
    }

    @Override // v4.b0, v4.o0
    public final int j(v4.b1 b1Var) {
        this.S = true;
        int B0 = B0(b1Var);
        this.S = false;
        return B0;
    }

    @Override // v4.s, v4.b0, v4.o0
    public final int k(v4.b1 b1Var) {
        this.S = true;
        int C0 = C0(b1Var);
        this.S = false;
        return C0;
    }

    @Override // v4.s, v4.b0, v4.o0
    public final int l(v4.b1 b1Var) {
        this.S = true;
        int D0 = D0(b1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // v4.s, v4.b0, v4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int i10;
        boolean z10;
        int i11;
        float f10;
        float f11;
        float f12;
        ch.l0 l0Var;
        boolean z11 = false;
        an anVar = this.T;
        if (i7 < 0) {
            float f13 = anVar.ja;
            if (f13 != 0.0f) {
                float f14 = f13 + i7;
                anVar.ja = f14;
                if (f14 < 0.0f) {
                    i7 = (int) f14;
                    anVar.ja = 0.0f;
                    anVar.A0.invalidate();
                } else {
                    i7 = 0;
                }
            }
        }
        int childCount = anVar.A0.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                i10 = 0;
                z10 = false;
                break;
            }
            View childAt = anVar.A0.getChildAt(i12);
            float f15 = anVar.O9;
            anVar.A0.getClass();
            if (RecyclerView.R(childAt) == (anVar.mb ? 0 : anVar.D0.b() - 1)) {
                i10 = super.o0(((float) (childAt.getTop() - i7)) > f15 ? (int) (childAt.getTop() - f15) : i7, w0Var, b1Var);
                z10 = true;
            } else {
                i12++;
            }
        }
        if (!z10) {
            i10 = super.o0(i7, w0Var, b1Var);
        }
        if (!anVar.dd.f) {
            SparseArray[] sparseArrayArr = anVar.n6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i7 > 0 && i10 == 0 && (((org.telegram.messenger.t3.T(anVar.e) && !anVar.e.megagroup) || (anVar.w4 && !org.telegram.messenger.q10.u(anVar.f))) && (i11 = anVar.g4) != 3 && i11 != 9 && i11 != 1 && anVar.A0.getScrollState() == 1)) {
                aj ajVar = anVar.A0;
                if (!ajVar.W1 && !ajVar.c2 && !anVar.Y9()) {
                    if (anVar.ja == 0.0f && anVar.la != null) {
                        ArrayList arrayList = anVar.Eb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            anVar.la.g((TLRPC.Chat) anVar.Eb.get(0));
                        } else if (anVar.w4) {
                            anVar.la.h();
                        } else {
                            anVar.la.f();
                        }
                    }
                    Animator animator = anVar.ma;
                    if (animator != null) {
                        animator.removeAllListeners();
                        anVar.ma.cancel();
                    }
                    if (anVar.ja < org.telegram.messenger.g0.L(110.0f)) {
                        float L = anVar.ja / org.telegram.messenger.g0.L(110.0f);
                        f11 = (1.0f - L) * 0.65f;
                        f12 = L * 0.45f;
                    } else if (anVar.ja < org.telegram.messenger.g0.L(160.0f)) {
                        float L2 = (anVar.ja - org.telegram.messenger.g0.L(110.0f)) / org.telegram.messenger.g0.L(50.0f);
                        f11 = (1.0f - L2) * 0.45f;
                        f12 = L2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        float f16 = i7 * f10;
                        anVar.ja += f16;
                        int i13 = (int) f16;
                        l0Var = ch.l0.B;
                        if (l0Var != null) {
                            l0Var.r -= i13;
                            if (i13 != 0) {
                                l0Var.u = true;
                            }
                        }
                        anVar.A0.invalidate();
                    }
                    f10 = f12 + f11;
                    float f162 = i7 * f10;
                    anVar.ja += f162;
                    int i132 = (int) f162;
                    l0Var = ch.l0.B;
                    if (l0Var != null) {
                    }
                    anVar.A0.invalidate();
                }
            }
        }
        if (anVar.ja == 0.0f) {
            anVar.A0.setOverScrollMode(0);
        } else {
            anVar.A0.setOverScrollMode(2);
        }
        if (anVar.la != null) {
            te.a aVar = anVar.bd;
            if (anVar.ja > 0.0f && anVar.A0.getScrollState() == 1) {
                z11 = true;
            }
            aVar.a(z11, true);
        }
        return i10;
    }

    @Override // v4.b0, v4.o0
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        this.T.Oa = false;
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }

    @Override // v4.s, v4.b0, v4.o0
    public final boolean y0() {
        return true;
    }
}
