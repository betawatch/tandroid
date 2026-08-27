package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ym0 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.gy b;
    public final /* synthetic */ org.telegram.ui.px c;

    public /* synthetic */ ym0(org.telegram.ui.px pxVar, org.telegram.ui.gy gyVar, int i10) {
        this.a = i10;
        this.c = pxVar;
        this.b = gyVar;
    }

    @Override // f2.b1
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

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.rx rxVar;
        int i12;
        zk0 zk0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.px pxVar = this.c;
                pxVar.k0.V();
                pxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.px pxVar2 = this.c;
                pxVar2.r0.W();
                pxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.px pxVar3 = this.c;
                cn0 cn0Var = pxVar3.U;
                f2.k0 k0Var = pxVar3.V;
                int L0 = k0Var.L0();
                int N0 = k0Var.N0();
                int abs = Math.abs(k0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((cn0Var.Q.a() != 0 && !cn0Var.T) || !cn0Var.S) && (N0 == h - 1 || ((rxVar = cn0Var.Q) != null && rxVar.a() != 0 && (i12 = cn0Var.U) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    cn0Var.Q();
                }
                pxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.px pxVar4 = this.c;
                en0 en0Var = pxVar4.f0;
                if (en0Var.U && !en0Var.S && !TextUtils.isEmpty(en0Var.X) && (zk0Var = en0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < zk0Var.getChildCount()) {
                            if (!(zk0Var.getChildAt(i13) instanceof h00)) {
                                i13++;
                            } else if (en0Var.U && !en0Var.S && !TextUtils.isEmpty(en0Var.X)) {
                                en0Var.V(true);
                            }
                        }
                    }
                }
                pxVar4.S(i10, i11);
                break;
        }
    }
}
