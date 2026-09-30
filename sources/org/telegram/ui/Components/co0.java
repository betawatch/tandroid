package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class co0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.qy b;
    public final /* synthetic */ org.telegram.ui.zx c;

    public /* synthetic */ co0(org.telegram.ui.zx zxVar, org.telegram.ui.qy qyVar, int i10) {
        this.a = i10;
        this.c = zxVar;
        this.b = qyVar;
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
        org.telegram.ui.cy cyVar;
        int i12;
        yl0 yl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.zx zxVar = this.c;
                zxVar.o0.V();
                zxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.zx zxVar2 = this.c;
                zxVar2.v0.W();
                zxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.zx zxVar3 = this.c;
                go0 go0Var = zxVar3.b0;
                s4.c0 c0Var = zxVar3.c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((go0Var.U.a() != 0 && !go0Var.X) || !go0Var.W) && (N0 == h - 1 || ((cyVar = go0Var.U) != null && cyVar.a() != 0 && (i12 = go0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    go0Var.Q();
                }
                zxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.zx zxVar4 = this.c;
                io0 io0Var = zxVar4.j0;
                if (io0Var.Y && !io0Var.W && !TextUtils.isEmpty(io0Var.b0) && (yl0Var = io0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < yl0Var.getChildCount()) {
                            if (!(yl0Var.getChildAt(i13) instanceof v00)) {
                                i13++;
                            } else if (io0Var.Y && !io0Var.W && !TextUtils.isEmpty(io0Var.b0)) {
                                io0Var.V(true);
                            }
                        }
                    }
                }
                zxVar4.S(i10, i11);
                break;
        }
    }
}
