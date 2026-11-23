package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class jm0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.cx b;
    public final /* synthetic */ org.telegram.ui.kw c;

    public /* synthetic */ jm0(org.telegram.ui.kw kwVar, org.telegram.ui.cx cxVar, int i7) {
        this.a = i7;
        this.c = kwVar;
        this.b = cxVar;
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
        org.telegram.ui.mw mwVar;
        int i11;
        ek0 ek0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.kw kwVar = this.c;
                kwVar.r0.W();
                kwVar.P();
                break;
            case 1:
                org.telegram.ui.kw kwVar2 = this.c;
                kwVar2.y0.X();
                kwVar2.P();
                break;
            case 2:
                org.telegram.ui.kw kwVar3 = this.c;
                nm0 nm0Var = kwVar3.e0;
                v4.c0 c0Var = kwVar3.f0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((nm0Var.V.a() != 0 && !nm0Var.Y) || !nm0Var.X) && (N0 == b10 - 1 || ((mwVar = nm0Var.V) != null && mwVar.a() != 0 && (i11 = nm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    nm0Var.P();
                }
                kwVar3.P();
                break;
            default:
                org.telegram.ui.kw kwVar4 = this.c;
                pm0 pm0Var = kwVar4.m0;
                if (pm0Var.b0 && !pm0Var.Z && !TextUtils.isEmpty(pm0Var.e0) && (ek0Var = pm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < ek0Var.getChildCount()) {
                            if (!(ek0Var.getChildAt(i12) instanceof yz)) {
                                i12++;
                            } else if (pm0Var.b0 && !pm0Var.Z && !TextUtils.isEmpty(pm0Var.e0)) {
                                pm0Var.W(true);
                            }
                        }
                    }
                }
                kwVar4.P();
                break;
        }
    }
}
