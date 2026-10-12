package ci;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.ty0;
import s4.y0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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

    @Override // s4.b0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((ty0) this.R).W != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // s4.s, s4.b0, s4.n0
    public int o0(int i10, qf.e eVar, y0 y0Var) {
        switch (this.Q) {
            case 0:
                if (((t) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, y0Var);
            default:
                return super.o0(i10, eVar, y0Var);
        }
    }

    @Override // s4.b0, s4.n0
    public void v0(RecyclerView recyclerView, y0 y0Var, int i10) {
        switch (this.Q) {
            case 1:
                ij ijVar = new ij(this, recyclerView.getContext());
                ijVar.a = i10;
                w0(ijVar);
                break;
            case 2:
                nm nmVar = new nm(this, recyclerView.getContext());
                nmVar.a = i10;
                w0(nmVar);
                break;
            default:
                super.v0(recyclerView, y0Var, i10);
                break;
        }
    }

    @Override // s4.s, s4.b0, s4.n0
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
    public k(ty0 ty0Var) {
        super(5);
        this.Q = 3;
        this.R = ty0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar) {
        super(3);
        this.Q = 0;
        this.R = tVar;
    }
}
