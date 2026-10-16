package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oo0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.yy b;
    public final /* synthetic */ org.telegram.ui.iy c;

    public /* synthetic */ oo0(org.telegram.ui.iy iyVar, org.telegram.ui.yy yyVar, int i10) {
        this.a = i10;
        this.c = iyVar;
        this.b = yyVar;
    }

    @Override // s4.r0
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

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ky kyVar;
        int i12;
        mm0 mm0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.iy iyVar = this.c;
                iyVar.o0.V();
                iyVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.iy iyVar2 = this.c;
                iyVar2.v0.W();
                iyVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.iy iyVar3 = this.c;
                so0 so0Var = iyVar3.b0;
                s4.b0 b0Var = iyVar3.c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((so0Var.U.a() != 0 && !so0Var.X) || !so0Var.W) && (N0 == h - 1 || ((kyVar = so0Var.U) != null && kyVar.a() != 0 && (i12 = so0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    so0Var.Q();
                }
                iyVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.iy iyVar4 = this.c;
                uo0 uo0Var = iyVar4.j0;
                if (uo0Var.Y && !uo0Var.W && !TextUtils.isEmpty(uo0Var.b0) && (mm0Var = uo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < mm0Var.getChildCount()) {
                            if (!(mm0Var.getChildAt(i13) instanceof f10)) {
                                i13++;
                            } else if (uo0Var.Y && !uo0Var.W && !TextUtils.isEmpty(uo0Var.b0)) {
                                uo0Var.V(true);
                            }
                        }
                    }
                }
                iyVar4.S(i10, i11);
                break;
        }
    }
}
