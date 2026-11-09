package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vl0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.yw b;
    public final /* synthetic */ org.telegram.ui.hw c;

    public /* synthetic */ vl0(org.telegram.ui.hw hwVar, org.telegram.ui.yw ywVar, int i7) {
        this.a = i7;
        this.c = hwVar;
        this.b = ywVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.jw jwVar;
        int i11;
        qj0 qj0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.hw hwVar = this.c;
                hwVar.q0.W();
                hwVar.T();
                break;
            case 1:
                org.telegram.ui.hw hwVar2 = this.c;
                hwVar2.x0.X();
                hwVar2.T();
                break;
            case 2:
                org.telegram.ui.hw hwVar3 = this.c;
                zl0 zl0Var = hwVar3.d0;
                v4.b0 b0Var = hwVar3.e0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((zl0Var.U.a() != 0 && !zl0Var.X) || !zl0Var.W) && (N0 == b10 - 1 || ((jwVar = zl0Var.U) != null && jwVar.a() != 0 && (i11 = zl0Var.Y) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    zl0Var.P();
                }
                hwVar3.T();
                break;
            default:
                org.telegram.ui.hw hwVar4 = this.c;
                bm0 bm0Var = hwVar4.l0;
                if (bm0Var.a0 && !bm0Var.Y && !TextUtils.isEmpty(bm0Var.d0) && (qj0Var = bm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < qj0Var.getChildCount()) {
                            if (!(qj0Var.getChildAt(i12) instanceof mz)) {
                                i12++;
                            } else if (bm0Var.a0 && !bm0Var.Y && !TextUtils.isEmpty(bm0Var.d0)) {
                                bm0Var.W(true);
                            }
                        }
                    }
                }
                hwVar4.T();
                break;
        }
    }
}
