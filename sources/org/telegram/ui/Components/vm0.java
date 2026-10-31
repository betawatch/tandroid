package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vm0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ay b;
    public final /* synthetic */ org.telegram.ui.kx c;

    public /* synthetic */ vm0(org.telegram.ui.kx kxVar, org.telegram.ui.ay ayVar, int i10) {
        this.a = i10;
        this.c = kxVar;
        this.b = ayVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.mx mxVar;
        int i12;
        tk0 tk0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.kx kxVar = this.c;
                kxVar.q0.W();
                kxVar.T();
                break;
            case 1:
                org.telegram.ui.kx kxVar2 = this.c;
                kxVar2.x0.X();
                kxVar2.T();
                break;
            case 2:
                org.telegram.ui.kx kxVar3 = this.c;
                zm0 zm0Var = kxVar3.d0;
                s4.a0 a0Var = kxVar3.e0;
                int L0 = a0Var.L0();
                int N0 = a0Var.N0();
                int abs = Math.abs(a0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((zm0Var.U.a() != 0 && !zm0Var.X) || !zm0Var.W) && (N0 == b10 - 1 || ((mxVar = zm0Var.U) != null && mxVar.a() != 0 && (i12 = zm0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    zm0Var.P();
                }
                kxVar3.T();
                break;
            default:
                org.telegram.ui.kx kxVar4 = this.c;
                bn0 bn0Var = kxVar4.l0;
                if (bn0Var.a0 && !bn0Var.Y && !TextUtils.isEmpty(bn0Var.d0) && (tk0Var = bn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < tk0Var.getChildCount()) {
                            if (!(tk0Var.getChildAt(i13) instanceof zz)) {
                                i13++;
                            } else if (bn0Var.a0 && !bn0Var.Y && !TextUtils.isEmpty(bn0Var.d0)) {
                                bn0Var.W(true);
                            }
                        }
                    }
                }
                kxVar4.T();
                break;
        }
    }
}
