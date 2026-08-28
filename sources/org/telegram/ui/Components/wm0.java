package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wm0 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.dy b;
    public final /* synthetic */ org.telegram.ui.mx c;

    public /* synthetic */ wm0(org.telegram.ui.mx mxVar, org.telegram.ui.dy dyVar, int i9) {
        this.a = i9;
        this.c = mxVar;
        this.b = dyVar;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        org.telegram.ui.ox oxVar;
        int i11;
        wk0 wk0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.mx mxVar = this.c;
                mxVar.k0.V();
                mxVar.S(i9, i10);
                break;
            case 1:
                org.telegram.ui.mx mxVar2 = this.c;
                mxVar2.r0.W();
                mxVar2.S(i9, i10);
                break;
            case 2:
                org.telegram.ui.mx mxVar3 = this.c;
                an0 an0Var = mxVar3.U;
                f2.m0 m0Var = mxVar3.V;
                int L0 = m0Var.L0();
                int N0 = m0Var.N0();
                int abs = Math.abs(m0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((an0Var.Q.a() != 0 && !an0Var.T) || !an0Var.S) && (N0 == h - 1 || ((oxVar = an0Var.Q) != null && oxVar.a() != 0 && (i11 = an0Var.U) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    an0Var.Q();
                }
                mxVar3.S(i9, i10);
                break;
            default:
                org.telegram.ui.mx mxVar4 = this.c;
                cn0 cn0Var = mxVar4.f0;
                if (cn0Var.U && !cn0Var.S && !TextUtils.isEmpty(cn0Var.X) && (wk0Var = cn0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < wk0Var.getChildCount()) {
                            if (!(wk0Var.getChildAt(i12) instanceof e00)) {
                                i12++;
                            } else if (cn0Var.U && !cn0Var.S && !TextUtils.isEmpty(cn0Var.X)) {
                                cn0Var.V(true);
                            }
                        }
                    }
                }
                mxVar4.S(i9, i10);
                break;
        }
    }
}
