package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq0 b;

    public /* synthetic */ sp0(sq0 sq0Var, int i10) {
        this.a = i10;
        this.b = sq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        tb tbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    sq0 sq0Var = this.b;
                    sq0.s0(sq0Var);
                    sq0Var.q0 = sq0Var.p0;
                    break;
                }
                break;
            case 1:
                sq0 sq0Var2 = this.b;
                if (i11 != 0) {
                    sq0.s0(sq0Var2);
                    sq0Var2.q0 = sq0Var2.p0;
                }
                pc pcVar = pc.w;
                if (pcVar != null && (tbVar = pcVar.e) != null && (tbVar.getParent() instanceof View) && ((View) pc.w.e.getParent()).getParent() == sq0Var2.w) {
                    pc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = sq0Var2.O0) != null) {
                    eVar.f(i10, i11);
                    sq0.A0(sq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    sq0 sq0Var3 = this.b;
                    sq0.s0(sq0Var3);
                    sq0Var3.q0 = sq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
