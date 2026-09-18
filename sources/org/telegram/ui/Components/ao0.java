package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ao0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.uy b;
    public final /* synthetic */ org.telegram.ui.ey c;

    public /* synthetic */ ao0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
        this.a = i10;
        this.c = eyVar;
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
        org.telegram.ui.gy gyVar;
        int i12;
        wl0 wl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ey eyVar = this.c;
                eyVar.p0.V();
                eyVar.T(i10, i11);
                break;
            case 1:
                org.telegram.ui.ey eyVar2 = this.c;
                eyVar2.w0.W();
                eyVar2.T(i10, i11);
                break;
            case 2:
                org.telegram.ui.ey eyVar3 = this.c;
                eo0 eo0Var = eyVar3.c0;
                s4.c0 c0Var = eyVar3.d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((eo0Var.U.a() != 0 && !eo0Var.X) || !eo0Var.W) && (N0 == h - 1 || ((gyVar = eo0Var.U) != null && gyVar.a() != 0 && (i12 = eo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    eo0Var.Q();
                }
                eyVar3.T(i10, i11);
                break;
            default:
                org.telegram.ui.ey eyVar4 = this.c;
                go0 go0Var = eyVar4.k0;
                if (go0Var.Y && !go0Var.W && !TextUtils.isEmpty(go0Var.b0) && (wl0Var = go0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < wl0Var.getChildCount()) {
                            if (!(wl0Var.getChildAt(i13) instanceof t00)) {
                                i13++;
                            } else if (go0Var.Y && !go0Var.W && !TextUtils.isEmpty(go0Var.b0)) {
                                go0Var.V(true);
                            }
                        }
                    }
                }
                eyVar4.T(i10, i11);
                break;
        }
    }
}
