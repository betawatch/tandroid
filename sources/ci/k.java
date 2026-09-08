package ci;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.zl;
import s4.z0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class k extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ni niVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = niVar;
    }

    @Override // s4.c0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((ux0) this.R).W != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // s4.s, s4.c0, s4.o0
    public int o0(int i10, pf.e eVar, z0 z0Var) {
        switch (this.Q) {
            case 0:
                if (((t) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, z0Var);
            default:
                return super.o0(i10, eVar, z0Var);
        }
    }

    @Override // s4.c0, s4.o0
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        switch (this.Q) {
            case 1:
                hj hjVar = new hj(this, recyclerView.getContext());
                hjVar.a = i10;
                w0(hjVar);
                break;
            case 2:
                zl zlVar = new zl(this, recyclerView.getContext());
                zlVar.a = i10;
                w0(zlVar);
                break;
            default:
                super.v0(recyclerView, z0Var, i10);
                break;
        }
    }

    @Override // s4.s, s4.c0, s4.o0
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return super.y0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ux0 ux0Var) {
        super(5);
        this.Q = 3;
        this.R = ux0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar) {
        super(3);
        this.Q = 0;
        this.R = tVar;
    }
}
