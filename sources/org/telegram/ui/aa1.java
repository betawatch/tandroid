package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class aa1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ aa1(bb1 bb1Var, int i10) {
        this.a = i10;
        this.b = bb1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        bb1 bb1Var;
        ah.i iVar2;
        bb1 bb1Var2;
        ah.i iVar3;
        switch (this.a) {
            case 0:
                bb1 bb1Var3 = this.b;
                if (bb1Var3.r0.size() != bb1Var3.s0.size() && !bb1Var3.w0 && bb1Var3.U.N0() > bb1Var3.X.c0 - 20) {
                    bb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = bb1Var3.C0) != null) {
                    iVar.f(i10, i11);
                    bb1.W(bb1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = (bb1Var = this.b).C0) != null) {
                    iVar2.f(i10, i11);
                    bb1.W(bb1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = (bb1Var2 = this.b).C0) != null) {
                    iVar3.f(i10, i11);
                    bb1.W(bb1Var2);
                    break;
                }
                break;
        }
    }
}
