package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ vp0(uq0 uq0Var, int i10) {
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        tb tbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    uq0 uq0Var = this.b;
                    uq0.s0(uq0Var);
                    uq0Var.q0 = uq0Var.p0;
                    break;
                }
                break;
            case 1:
                uq0 uq0Var2 = this.b;
                if (i11 != 0) {
                    uq0.s0(uq0Var2);
                    uq0Var2.q0 = uq0Var2.p0;
                }
                pc pcVar = pc.w;
                if (pcVar != null && (tbVar = pcVar.e) != null && (tbVar.getParent() instanceof View) && ((View) pc.w.e.getParent()).getParent() == uq0Var2.w) {
                    pc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = uq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    uq0.A0(uq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    uq0 uq0Var3 = this.b;
                    uq0.s0(uq0Var3);
                    uq0Var3.q0 = uq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
