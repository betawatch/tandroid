package org.telegram.ui;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dj extends v4.t {
    public boolean S;
    public final /* synthetic */ an T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(an anVar, boolean z9) {
        super(z9);
        this.T = anVar;
    }

    @Override // v4.t
    public final boolean B1(int i7) {
        int i10;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.dj s9;
        byte b10;
        an anVar = this.T;
        jl jlVar = anVar.C0;
        int i11 = jlVar.J;
        if (i7 >= i11 && i7 < jlVar.K && (i10 = i7 - i11) >= 0 && i10 < jlVar.L().size() && (s9 = anVar.s9((ijVar = (org.telegram.messenger.ij) anVar.C0.L().get(i10)))) != null) {
            ArrayList arrayList = s9.e;
            org.telegram.messenger.aj d = s9.d(ijVar);
            if (d.a != d.b && (b10 = d.c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) arrayList.get(i12);
                    if (ajVar != d) {
                        byte b11 = ajVar.c;
                        byte b12 = d.c;
                        if (b11 <= b12 && ajVar.d >= b12) {
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
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
        }
        return false;
    }

    @Override // v4.n0
    public final int G() {
        if (this.S) {
            return (int) this.T.L9;
        }
        return 0;
    }

    @Override // v4.n0
    public final int J() {
        return this.S ? (int) this.T.L9 : F();
    }

    @Override // v4.n0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.L9) - C()) : super.K();
    }

    @Override // v4.b0
    public final int X0() {
        return (int) this.T.L9;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.a;
        try {
            super.b0(v0Var, a1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new bh(this, 4));
        }
    }

    @Override // v4.b0
    public final void i1(int i7, int i10, boolean z9) {
        if (!z9) {
            i10 = (int) ((i10 - F()) + this.T.L9);
        }
        super.i1(i7, i10, z9);
    }

    @Override // v4.b0, v4.n0
    public final int j(v4.a1 a1Var) {
        this.S = true;
        int B0 = B0(a1Var);
        this.S = false;
        return B0;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int k(v4.a1 a1Var) {
        this.S = true;
        int C0 = C0(a1Var);
        this.S = false;
        return C0;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int l(v4.a1 a1Var) {
        this.S = true;
        int D0 = D0(a1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // v4.s, v4.b0, v4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        boolean z9;
        int i11;
        float f10;
        float f11;
        float f12;
        ch.k0 k0Var;
        boolean z10 = false;
        an anVar = this.T;
        if (i7 < 0) {
            float f13 = anVar.ga;
            if (f13 != 0.0f) {
                float f14 = f13 + i7;
                anVar.ga = f14;
                if (f14 < 0.0f) {
                    i7 = (int) f14;
                    anVar.ga = 0.0f;
                    anVar.z0.invalidate();
                } else {
                    i7 = 0;
                }
            }
        }
        int childCount = anVar.z0.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                i10 = 0;
                z9 = false;
                break;
            }
            View childAt = anVar.z0.getChildAt(i12);
            float f15 = anVar.L9;
            anVar.z0.getClass();
            if (RecyclerView.R(childAt) == (anVar.jb ? 0 : anVar.C0.b() - 1)) {
                i10 = super.o0(((float) (childAt.getTop() - i7)) > f15 ? (int) (childAt.getTop() - f15) : i7, v0Var, a1Var);
                z9 = true;
            } else {
                i12++;
            }
        }
        if (!z9) {
            i10 = super.o0(i7, v0Var, a1Var);
        }
        if (!anVar.ad.f) {
            SparseArray[] sparseArrayArr = anVar.m6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i7 > 0 && i10 == 0 && (((org.telegram.messenger.t3.T(anVar.e) && !anVar.e.megagroup) || (anVar.v4 && !org.telegram.messenger.t10.u(anVar.f))) && (i11 = anVar.f4) != 3 && i11 != 9 && i11 != 1 && anVar.z0.getScrollState() == 1)) {
                aj ajVar = anVar.z0;
                if (!ajVar.V1 && !ajVar.b2 && !anVar.W9()) {
                    if (anVar.ga == 0.0f && anVar.ia != null) {
                        ArrayList arrayList = anVar.Bb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            anVar.ia.g((TLRPC.Chat) anVar.Bb.get(0));
                        } else if (anVar.v4) {
                            anVar.ia.h();
                        } else {
                            anVar.ia.f();
                        }
                    }
                    Animator animator = anVar.ja;
                    if (animator != null) {
                        animator.removeAllListeners();
                        anVar.ja.cancel();
                    }
                    if (anVar.ga < org.telegram.messenger.g0.L(110.0f)) {
                        float L = anVar.ga / org.telegram.messenger.g0.L(110.0f);
                        f11 = (1.0f - L) * 0.65f;
                        f12 = L * 0.45f;
                    } else if (anVar.ga < org.telegram.messenger.g0.L(160.0f)) {
                        float L2 = (anVar.ga - org.telegram.messenger.g0.L(110.0f)) / org.telegram.messenger.g0.L(50.0f);
                        f11 = (1.0f - L2) * 0.45f;
                        f12 = L2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        float f16 = i7 * f10;
                        anVar.ga += f16;
                        int i13 = (int) f16;
                        k0Var = ch.k0.B;
                        if (k0Var != null) {
                            k0Var.r -= i13;
                            if (i13 != 0) {
                                k0Var.u = true;
                            }
                        }
                        anVar.z0.invalidate();
                    }
                    f10 = f12 + f11;
                    float f162 = i7 * f10;
                    anVar.ga += f162;
                    int i132 = (int) f162;
                    k0Var = ch.k0.B;
                    if (k0Var != null) {
                    }
                    anVar.z0.invalidate();
                }
            }
        }
        if (anVar.ga == 0.0f) {
            anVar.z0.setOverScrollMode(0);
        } else {
            anVar.z0.setOverScrollMode(2);
        }
        if (anVar.ia != null) {
            te.a aVar = anVar.Yc;
            if (anVar.ga > 0.0f && anVar.z0.getScrollState() == 1) {
                z10 = true;
            }
            aVar.a(z10, true);
        }
        return i10;
    }

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        this.T.La = false;
        mi.m mVar = new mi.m(recyclerView.getContext(), 0);
        mVar.a = i7;
        w0(mVar);
    }

    @Override // v4.s, v4.b0, v4.n0
    public final boolean y0() {
        return true;
    }
}
