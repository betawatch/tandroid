package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class lo0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.cy b;
    public final /* synthetic */ org.telegram.ui.lx c;

    public /* synthetic */ lo0(org.telegram.ui.lx lxVar, org.telegram.ui.cy cyVar, int i10) {
        this.a = i10;
        this.c = lxVar;
        this.b = cyVar;
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
        org.telegram.ui.nx nxVar;
        int i12;
        jm0 jm0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.lx lxVar = this.c;
                lxVar.o0.V();
                lxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.lx lxVar2 = this.c;
                lxVar2.v0.W();
                lxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.lx lxVar3 = this.c;
                po0 po0Var = lxVar3.b0;
                s4.b0 b0Var = lxVar3.c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((po0Var.U.a() != 0 && !po0Var.X) || !po0Var.W) && (N0 == h - 1 || ((nxVar = po0Var.U) != null && nxVar.a() != 0 && (i12 = po0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    po0Var.Q();
                }
                lxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.lx lxVar4 = this.c;
                ro0 ro0Var = lxVar4.j0;
                if (ro0Var.Y && !ro0Var.W && !TextUtils.isEmpty(ro0Var.b0) && (jm0Var = ro0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < jm0Var.getChildCount()) {
                            if (!(jm0Var.getChildAt(i13) instanceof b10)) {
                                i13++;
                            } else if (ro0Var.Y && !ro0Var.W && !TextUtils.isEmpty(ro0Var.b0)) {
                                ro0Var.V(true);
                            }
                        }
                    }
                }
                lxVar4.S(i10, i11);
                break;
        }
    }
}
