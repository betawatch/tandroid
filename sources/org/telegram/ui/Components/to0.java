package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class to0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ey b;
    public final /* synthetic */ org.telegram.ui.mx c;

    public /* synthetic */ to0(org.telegram.ui.mx mxVar, org.telegram.ui.ey eyVar, int i10) {
        this.a = i10;
        this.c = mxVar;
        this.b = eyVar;
    }

    @Override // s4.u0
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

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ox oxVar;
        int i12;
        nm0 nm0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.mx mxVar = this.c;
                mxVar.q0.W();
                mxVar.T();
                break;
            case 1:
                org.telegram.ui.mx mxVar2 = this.c;
                mxVar2.x0.X();
                mxVar2.T();
                break;
            case 2:
                org.telegram.ui.mx mxVar3 = this.c;
                xo0 xo0Var = mxVar3.d0;
                s4.c0 c0Var = mxVar3.e0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((xo0Var.U.a() != 0 && !xo0Var.X) || !xo0Var.W) && (N0 == h - 1 || ((oxVar = xo0Var.U) != null && oxVar.a() != 0 && (i12 = xo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    xo0Var.P();
                }
                mxVar3.T();
                break;
            default:
                org.telegram.ui.mx mxVar4 = this.c;
                zo0 zo0Var = mxVar4.l0;
                if (zo0Var.a0 && !zo0Var.Y && !TextUtils.isEmpty(zo0Var.d0) && (nm0Var = zo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < nm0Var.getChildCount()) {
                            if (!(nm0Var.getChildAt(i13) instanceof c10)) {
                                i13++;
                            } else if (zo0Var.a0 && !zo0Var.Y && !TextUtils.isEmpty(zo0Var.d0)) {
                                zo0Var.W(true);
                            }
                        }
                    }
                }
                mxVar4.T();
                break;
        }
    }
}
