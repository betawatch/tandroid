package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ul0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ww b;
    public final /* synthetic */ org.telegram.ui.fw c;

    public /* synthetic */ ul0(org.telegram.ui.fw fwVar, org.telegram.ui.ww wwVar, int i7) {
        this.a = i7;
        this.c = fwVar;
        this.b = wwVar;
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
        org.telegram.ui.hw hwVar;
        int i11;
        pj0 pj0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.fw fwVar = this.c;
                fwVar.q0.W();
                fwVar.T();
                break;
            case 1:
                org.telegram.ui.fw fwVar2 = this.c;
                fwVar2.x0.X();
                fwVar2.T();
                break;
            case 2:
                org.telegram.ui.fw fwVar3 = this.c;
                yl0 yl0Var = fwVar3.d0;
                v4.b0 b0Var = fwVar3.e0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((yl0Var.U.a() != 0 && !yl0Var.X) || !yl0Var.W) && (N0 == b10 - 1 || ((hwVar = yl0Var.U) != null && hwVar.a() != 0 && (i11 = yl0Var.Y) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    yl0Var.P();
                }
                fwVar3.T();
                break;
            default:
                org.telegram.ui.fw fwVar4 = this.c;
                am0 am0Var = fwVar4.l0;
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
                fwVar4.T();
                break;
        }
    }
}
