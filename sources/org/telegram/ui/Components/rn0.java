package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rn0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.qy b;
    public final /* synthetic */ org.telegram.ui.zx c;

    public /* synthetic */ rn0(org.telegram.ui.zx zxVar, org.telegram.ui.qy qyVar, int i10) {
        this.a = i10;
        this.c = zxVar;
        this.b = qyVar;
    }

    @Override // f2.z0
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

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.cy cyVar;
        int i12;
        rl0 rl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.zx zxVar = this.c;
                zxVar.l0.V();
                zxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.zx zxVar2 = this.c;
                zxVar2.s0.W();
                zxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.zx zxVar3 = this.c;
                vn0 vn0Var = zxVar3.V;
                f2.i0 i0Var = zxVar3.W;
                int L0 = i0Var.L0();
                int N0 = i0Var.N0();
                int abs = Math.abs(i0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((vn0Var.R.a() != 0 && !vn0Var.U) || !vn0Var.T) && (N0 == h - 1 || ((cyVar = vn0Var.R) != null && cyVar.a() != 0 && (i12 = vn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    vn0Var.Q();
                }
                zxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.zx zxVar4 = this.c;
                xn0 xn0Var = zxVar4.g0;
                if (xn0Var.V && !xn0Var.T && !TextUtils.isEmpty(xn0Var.Y) && (rl0Var = xn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < rl0Var.getChildCount()) {
                            if (!(rl0Var.getChildAt(i13) instanceof u00)) {
                                i13++;
                            } else if (xn0Var.V && !xn0Var.T && !TextUtils.isEmpty(xn0Var.Y)) {
                                xn0Var.V(true);
                            }
                        }
                    }
                }
                zxVar4.S(i10, i11);
                break;
        }
    }
}
