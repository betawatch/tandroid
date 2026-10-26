package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class so0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.cy b;
    public final /* synthetic */ org.telegram.ui.jx c;

    public /* synthetic */ so0(org.telegram.ui.jx jxVar, org.telegram.ui.cy cyVar, int i10) {
        this.a = i10;
        this.c = jxVar;
        this.b = cyVar;
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
        org.telegram.ui.lx lxVar;
        int i12;
        mm0 mm0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.jx jxVar = this.c;
                jxVar.q0.W();
                jxVar.T();
                break;
            case 1:
                org.telegram.ui.jx jxVar2 = this.c;
                jxVar2.x0.X();
                jxVar2.T();
                break;
            case 2:
                org.telegram.ui.jx jxVar3 = this.c;
                wo0 wo0Var = jxVar3.d0;
                s4.c0 c0Var = jxVar3.e0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wo0Var.U.a() != 0 && !wo0Var.X) || !wo0Var.W) && (N0 == h - 1 || ((lxVar = wo0Var.U) != null && lxVar.a() != 0 && (i12 = wo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wo0Var.P();
                }
                jxVar3.T();
                break;
            default:
                org.telegram.ui.jx jxVar4 = this.c;
                yo0 yo0Var = jxVar4.l0;
                if (yo0Var.a0 && !yo0Var.Y && !TextUtils.isEmpty(yo0Var.d0) && (mm0Var = yo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < mm0Var.getChildCount()) {
                            if (!(mm0Var.getChildAt(i13) instanceof c10)) {
                                i13++;
                            } else if (yo0Var.a0 && !yo0Var.Y && !TextUtils.isEmpty(yo0Var.d0)) {
                                yo0Var.W(true);
                            }
                        }
                    }
                }
                jxVar4.T();
                break;
        }
    }
}
