package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xl0 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.uw b;
    public final /* synthetic */ org.telegram.ui.cw c;

    public /* synthetic */ xl0(org.telegram.ui.cw cwVar, org.telegram.ui.uw uwVar, int i3) {
        this.a = i3;
        this.c = cwVar;
        this.b = uwVar;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        switch (this.a) {
            case 0:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.ui.ew ewVar;
        int i11;
        tj0 tj0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.cw cwVar = this.c;
                cwVar.r0.W();
                cwVar.T();
                break;
            case 1:
                org.telegram.ui.cw cwVar2 = this.c;
                cwVar2.y0.X();
                cwVar2.T();
                break;
            case 2:
                org.telegram.ui.cw cwVar3 = this.c;
                bm0 bm0Var = cwVar3.e0;
                u4.b0 b0Var = cwVar3.f0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((bm0Var.V.a() != 0 && !bm0Var.Y) || !bm0Var.X) && (N0 == b10 - 1 || ((ewVar = bm0Var.V) != null && ewVar.a() != 0 && (i11 = bm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    bm0Var.P();
                }
                cwVar3.T();
                break;
            default:
                org.telegram.ui.cw cwVar4 = this.c;
                dm0 dm0Var = cwVar4.m0;
                if (dm0Var.b0 && !dm0Var.Z && !TextUtils.isEmpty(dm0Var.e0) && (tj0Var = dm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < tj0Var.getChildCount()) {
                            if (!(tj0Var.getChildAt(i12) instanceof iz)) {
                                i12++;
                            } else if (dm0Var.b0 && !dm0Var.Z && !TextUtils.isEmpty(dm0Var.e0)) {
                                dm0Var.W(true);
                            }
                        }
                    }
                }
                cwVar4.T();
                break;
        }
    }
}
