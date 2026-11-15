package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yl0 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.yw b;
    public final /* synthetic */ org.telegram.ui.hw c;

    public /* synthetic */ yl0(org.telegram.ui.hw hwVar, org.telegram.ui.yw ywVar, int i7) {
        this.a = i7;
        this.c = hwVar;
        this.b = ywVar;
    }

    @Override // v4.t0
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

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.jw jwVar;
        int i11;
        uj0 uj0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.hw hwVar = this.c;
                hwVar.r0.W();
                hwVar.S();
                break;
            case 1:
                org.telegram.ui.hw hwVar2 = this.c;
                hwVar2.y0.X();
                hwVar2.S();
                break;
            case 2:
                org.telegram.ui.hw hwVar3 = this.c;
                cm0 cm0Var = hwVar3.e0;
                v4.b0 b0Var = hwVar3.f0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((cm0Var.V.a() != 0 && !cm0Var.Y) || !cm0Var.X) && (N0 == b10 - 1 || ((jwVar = cm0Var.V) != null && jwVar.a() != 0 && (i11 = cm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    cm0Var.P();
                }
                hwVar3.S();
                break;
            default:
                org.telegram.ui.hw hwVar4 = this.c;
                em0 em0Var = hwVar4.m0;
                if (em0Var.b0 && !em0Var.Z && !TextUtils.isEmpty(em0Var.e0) && (uj0Var = em0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < uj0Var.getChildCount()) {
                            if (!(uj0Var.getChildAt(i12) instanceof pz)) {
                                i12++;
                            } else if (em0Var.b0 && !em0Var.Z && !TextUtils.isEmpty(em0Var.e0)) {
                                em0Var.W(true);
                            }
                        }
                    }
                }
                hwVar4.S();
                break;
        }
    }
}
