package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ul0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.zw b;
    public final /* synthetic */ org.telegram.ui.iw c;

    public /* synthetic */ ul0(org.telegram.ui.iw iwVar, org.telegram.ui.zw zwVar, int i7) {
        this.a = i7;
        this.c = iwVar;
        this.b = zwVar;
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
        org.telegram.ui.kw kwVar;
        int i11;
        pj0 pj0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.iw iwVar = this.c;
                iwVar.q0.W();
                iwVar.T();
                break;
            case 1:
                org.telegram.ui.iw iwVar2 = this.c;
                iwVar2.x0.X();
                iwVar2.T();
                break;
            case 2:
                org.telegram.ui.iw iwVar3 = this.c;
                yl0 yl0Var = iwVar3.d0;
                v4.b0 b0Var = iwVar3.e0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((yl0Var.U.a() != 0 && !yl0Var.X) || !yl0Var.W) && (N0 == b10 - 1 || ((kwVar = yl0Var.U) != null && kwVar.a() != 0 && (i11 = yl0Var.Y) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    yl0Var.P();
                }
                iwVar3.T();
                break;
            default:
                org.telegram.ui.iw iwVar4 = this.c;
                am0 am0Var = iwVar4.l0;
                if (am0Var.a0 && !am0Var.Y && !TextUtils.isEmpty(am0Var.d0) && (pj0Var = am0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < pj0Var.getChildCount()) {
                            if (!(pj0Var.getChildAt(i12) instanceof lz)) {
                                i12++;
                            } else if (am0Var.a0 && !am0Var.Y && !TextUtils.isEmpty(am0Var.d0)) {
                                am0Var.W(true);
                            }
                        }
                    }
                }
                iwVar4.T();
                break;
        }
    }
}
