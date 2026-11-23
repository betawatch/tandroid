package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class im0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.bx b;
    public final /* synthetic */ org.telegram.ui.jw c;

    public /* synthetic */ im0(org.telegram.ui.jw jwVar, org.telegram.ui.bx bxVar, int i7) {
        this.a = i7;
        this.c = jwVar;
        this.b = bxVar;
    }

    @Override // v4.u0
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

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.lw lwVar;
        int i11;
        ek0 ek0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.jw jwVar = this.c;
                jwVar.r0.W();
                jwVar.R();
                break;
            case 1:
                org.telegram.ui.jw jwVar2 = this.c;
                jwVar2.y0.X();
                jwVar2.R();
                break;
            case 2:
                org.telegram.ui.jw jwVar3 = this.c;
                mm0 mm0Var = jwVar3.e0;
                v4.c0 c0Var = jwVar3.f0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((mm0Var.V.a() != 0 && !mm0Var.Y) || !mm0Var.X) && (N0 == b10 - 1 || ((lwVar = mm0Var.V) != null && lwVar.a() != 0 && (i11 = mm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    mm0Var.P();
                }
                jwVar3.R();
                break;
            default:
                org.telegram.ui.jw jwVar4 = this.c;
                om0 om0Var = jwVar4.m0;
                if (om0Var.b0 && !om0Var.Z && !TextUtils.isEmpty(om0Var.e0) && (ek0Var = om0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < ek0Var.getChildCount()) {
                            if (!(ek0Var.getChildAt(i12) instanceof vz)) {
                                i12++;
                            } else if (om0Var.b0 && !om0Var.Z && !TextUtils.isEmpty(om0Var.e0)) {
                                om0Var.W(true);
                            }
                        }
                    }
                }
                jwVar4.R();
                break;
        }
    }
}
