package ci;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.uy0;
import s4.y0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                return ((uy0) this.R).W != null && LocaleController.isRTL;
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
                mm mmVar = new mm(this, recyclerView.getContext());
                mmVar.a = i10;
                w0(mmVar);
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
    public k(uy0 uy0Var) {
        super(5);
        this.Q = 3;
        this.R = uy0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar) {
        super(3);
        this.Q = 0;
        this.R = tVar;
    }
}
