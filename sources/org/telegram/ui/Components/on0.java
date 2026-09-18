package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class on0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.wy b;
    public final /* synthetic */ org.telegram.ui.gy c;

    public /* synthetic */ on0(org.telegram.ui.gy gyVar, org.telegram.ui.wy wyVar, int i10) {
        this.a = i10;
        this.c = gyVar;
        this.b = wyVar;
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
        org.telegram.ui.iy iyVar;
        int i12;
        ml0 ml0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.gy gyVar = this.c;
                gyVar.p0.V();
                gyVar.T(i10, i11);
                break;
            case 1:
                org.telegram.ui.gy gyVar2 = this.c;
                gyVar2.w0.W();
                gyVar2.T(i10, i11);
                break;
            case 2:
                org.telegram.ui.gy gyVar3 = this.c;
                sn0 sn0Var = gyVar3.c0;
                s4.c0 c0Var = gyVar3.d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((sn0Var.U.a() != 0 && !sn0Var.X) || !sn0Var.W) && (N0 == h - 1 || ((iyVar = sn0Var.U) != null && iyVar.a() != 0 && (i12 = sn0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    sn0Var.Q();
                }
                gyVar3.T(i10, i11);
                break;
            default:
                org.telegram.ui.gy gyVar4 = this.c;
                un0 un0Var = gyVar4.k0;
                if (un0Var.Y && !un0Var.W && !TextUtils.isEmpty(un0Var.b0) && (ml0Var = un0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ml0Var.getChildCount()) {
                            if (!(ml0Var.getChildAt(i13) instanceof t00)) {
                                i13++;
                            } else if (un0Var.Y && !un0Var.W && !TextUtils.isEmpty(un0Var.b0)) {
                                un0Var.V(true);
                            }
                        }
                    }
                }
                gyVar4.T(i10, i11);
                break;
        }
    }
}
