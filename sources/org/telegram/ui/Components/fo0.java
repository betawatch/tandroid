package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fo0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.uy b;
    public final /* synthetic */ org.telegram.ui.dy c;

    public /* synthetic */ fo0(org.telegram.ui.dy dyVar, org.telegram.ui.uy uyVar, int i10) {
        this.a = i10;
        this.c = dyVar;
        this.b = uyVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.fy fyVar;
        int i12;
        zl0 zl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.dy dyVar = this.c;
                dyVar.p0.V();
                dyVar.U();
                break;
            case 1:
                org.telegram.ui.dy dyVar2 = this.c;
                dyVar2.w0.W();
                dyVar2.U();
                break;
            case 2:
                org.telegram.ui.dy dyVar3 = this.c;
                jo0 jo0Var = dyVar3.c0;
                s4.c0 c0Var = dyVar3.d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((jo0Var.U.a() != 0 && !jo0Var.X) || !jo0Var.W) && (N0 == h - 1 || ((fyVar = jo0Var.U) != null && fyVar.a() != 0 && (i12 = jo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    jo0Var.Q();
                }
                dyVar3.U();
                break;
            default:
                org.telegram.ui.dy dyVar4 = this.c;
                lo0 lo0Var = dyVar4.k0;
                if (lo0Var.Y && !lo0Var.W && !TextUtils.isEmpty(lo0Var.b0) && (zl0Var = lo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < zl0Var.getChildCount()) {
                            if (!(zl0Var.getChildAt(i13) instanceof w00)) {
                                i13++;
                            } else if (lo0Var.Y && !lo0Var.W && !TextUtils.isEmpty(lo0Var.b0)) {
                                lo0Var.V(true);
                            }
                        }
                    }
                }
                dyVar4.U();
                break;
        }
    }
}
