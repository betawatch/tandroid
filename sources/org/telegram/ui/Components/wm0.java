package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wm0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.zx b;
    public final /* synthetic */ org.telegram.ui.jx c;

    public /* synthetic */ wm0(org.telegram.ui.jx jxVar, org.telegram.ui.zx zxVar, int i10) {
        this.a = i10;
        this.c = jxVar;
        this.b = zxVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.lx lxVar;
        int i12;
        uk0 uk0Var;
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
                an0 an0Var = jxVar3.d0;
                s4.a0 a0Var = jxVar3.e0;
                int L0 = a0Var.L0();
                int N0 = a0Var.N0();
                int abs = Math.abs(a0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((an0Var.U.a() != 0 && !an0Var.X) || !an0Var.W) && (N0 == b10 - 1 || ((lxVar = an0Var.U) != null && lxVar.a() != 0 && (i12 = an0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    an0Var.P();
                }
                jxVar3.T();
                break;
            default:
                org.telegram.ui.jx jxVar4 = this.c;
                cn0 cn0Var = jxVar4.l0;
                if (cn0Var.a0 && !cn0Var.Y && !TextUtils.isEmpty(cn0Var.d0) && (uk0Var = cn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < uk0Var.getChildCount()) {
                            if (!(uk0Var.getChildAt(i13) instanceof zz)) {
                                i13++;
                            } else if (cn0Var.a0 && !cn0Var.Y && !TextUtils.isEmpty(cn0Var.d0)) {
                                cn0Var.W(true);
                            }
                        }
                    }
                }
                jxVar4.T();
                break;
        }
    }
}
