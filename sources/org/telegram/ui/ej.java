package org.telegram.ui;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ej extends v4.u {
    public boolean S;
    public final /* synthetic */ bn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(bn bnVar, boolean z10) {
        super(z10);
        this.T = bnVar;
    }

    @Override // v4.u
    public final boolean B1(int i7) {
        int i10;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.aj u92;
        byte b10;
        bn bnVar = this.T;
        kl klVar = bnVar.D0;
        int i11 = klVar.K;
        if (i7 >= i11 && i7 < klVar.L && (i10 = i7 - i11) >= 0 && i10 < klVar.L().size() && (u92 = bnVar.u9((fjVar = (org.telegram.messenger.fj) bnVar.D0.L().get(i10)))) != null) {
            ArrayList arrayList = u92.e;
            org.telegram.messenger.xi d = u92.d(fjVar);
            if (d.a != d.b && (b10 = d.c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) arrayList.get(i12);
                    if (xiVar != d) {
                        byte b11 = xiVar.c;
                        byte b12 = d.c;
                        if (b11 <= b12 && xiVar.d >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // v4.u
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            return !((org.telegram.ui.Cells.r1) view).getMessageObject().P3();
        }
        return false;
    }

    @Override // v4.p0
    public final int G() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return 0;
    }

    @Override // v4.p0
    public final int J() {
        return this.S ? (int) this.T.P9 : F();
    }

    @Override // v4.p0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.P9) - C()) : super.K();
    }

    @Override // v4.c0
    public final int X0() {
        return (int) this.T.P9;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.a;
        try {
            super.b0(x0Var, c1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new bh(this, 4));
        }
    }

    @Override // v4.c0
    public final void i1(int i7, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.P9);
        }
        super.i1(i7, i10, z10);
    }

    @Override // v4.c0, v4.p0
    public final int j(v4.c1 c1Var) {
        this.S = true;
        int B0 = B0(c1Var);
        this.S = false;
        return B0;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final int k(v4.c1 c1Var) {
        this.S = true;
        int C0 = C0(c1Var);
        this.S = false;
        return C0;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final int l(v4.c1 c1Var) {
        this.S = true;
        int D0 = D0(c1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // v4.t, v4.c0, v4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        boolean z10;
        int i11;
        float f10;
        float f11;
        float f12;
        ch.l0 l0Var;
        boolean z11 = false;
        bn bnVar = this.T;
        if (i7 < 0) {
            float f13 = bnVar.ka;
            if (f13 != 0.0f) {
                float f14 = f13 + i7;
                bnVar.ka = f14;
                if (f14 < 0.0f) {
                    i7 = (int) f14;
                    bnVar.ka = 0.0f;
                    bnVar.A0.invalidate();
                } else {
                    i7 = 0;
                }
            }
        }
        int childCount = bnVar.A0.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                i10 = 0;
                z10 = false;
                break;
            }
            View childAt = bnVar.A0.getChildAt(i12);
            float f15 = bnVar.P9;
            bnVar.A0.getClass();
            if (RecyclerView.R(childAt) == (bnVar.nb ? 0 : bnVar.D0.b() - 1)) {
                i10 = super.o0(((float) (childAt.getTop() - i7)) > f15 ? (int) (childAt.getTop() - f15) : i7, x0Var, c1Var);
                z10 = true;
            } else {
                i12++;
            }
        }
        if (!z10) {
            i10 = super.o0(i7, x0Var, c1Var);
        }
        if (!bnVar.ed.f) {
            SparseArray[] sparseArrayArr = bnVar.o6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i7 > 0 && i10 == 0 && (((org.telegram.messenger.v3.T(bnVar.e) && !bnVar.e.megagroup) || (bnVar.x4 && !org.telegram.messenger.o10.v(bnVar.f))) && (i11 = bnVar.g4) != 3 && i11 != 9 && i11 != 1 && bnVar.A0.getScrollState() == 1)) {
                bj bjVar = bnVar.A0;
                if (!bjVar.W1 && !bjVar.c2 && !bnVar.Y9()) {
                    if (bnVar.ka == 0.0f && bnVar.ma != null) {
                        ArrayList arrayList = bnVar.Fb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            bnVar.ma.g((TLRPC.Chat) bnVar.Fb.get(0));
                        } else if (bnVar.x4) {
                            bnVar.ma.h();
                        } else {
                            bnVar.ma.f();
                        }
                    }
                    Animator animator = bnVar.na;
                    if (animator != null) {
                        animator.removeAllListeners();
                        bnVar.na.cancel();
                    }
                    if (bnVar.ka < org.telegram.messenger.g0.L(110.0f)) {
                        float L = bnVar.ka / org.telegram.messenger.g0.L(110.0f);
                        f11 = (1.0f - L) * 0.65f;
                        f12 = L * 0.45f;
                    } else if (bnVar.ka < org.telegram.messenger.g0.L(160.0f)) {
                        float L2 = (bnVar.ka - org.telegram.messenger.g0.L(110.0f)) / org.telegram.messenger.g0.L(50.0f);
                        f11 = (1.0f - L2) * 0.45f;
                        f12 = L2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        float f16 = i7 * f10;
                        bnVar.ka += f16;
                        int i13 = (int) f16;
                        l0Var = ch.l0.B;
                        if (l0Var != null) {
                            l0Var.r -= i13;
                            if (i13 != 0) {
                                l0Var.u = true;
                            }
                        }
                        bnVar.A0.invalidate();
                    }
                    f10 = f12 + f11;
                    float f162 = i7 * f10;
                    bnVar.ka += f162;
                    int i132 = (int) f162;
                    l0Var = ch.l0.B;
                    if (l0Var != null) {
                    }
                    bnVar.A0.invalidate();
                }
            }
        }
        if (bnVar.ka == 0.0f) {
            bnVar.A0.setOverScrollMode(0);
        } else {
            bnVar.A0.setOverScrollMode(2);
        }
        if (bnVar.ma != null) {
            te.a aVar = bnVar.cd;
            if (bnVar.ka > 0.0f && bnVar.A0.getScrollState() == 1) {
                z11 = true;
            }
            aVar.a(z11, true);
        }
        return i10;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        this.T.Pa = false;
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }

    @Override // v4.t, v4.c0, v4.p0
    public final boolean y0() {
        return true;
    }
}
