package oh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.i1;
import f2.w;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xx0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k extends w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(di diVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = diVar;
    }

    @Override // f2.i0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((xx0) this.R).T != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // f2.w, f2.i0, f2.v0
    public int o0(int i10, bf.f fVar, i1 i1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, fVar, i1Var);
            default:
                return super.o0(i10, fVar, i1Var);
        }
    }

    @Override // f2.i0, f2.v0
    public void v0(RecyclerView recyclerView, i1 i1Var, int i10) {
        switch (this.Q) {
            case 1:
                xi xiVar = new xi(this, recyclerView.getContext());
                xiVar.a = i10;
                w0(xiVar);
                break;
            case 2:
                wl wlVar = new wl(this, recyclerView.getContext());
                wlVar.a = i10;
                w0(wlVar);
                break;
            default:
                super.v0(recyclerView, i1Var, i10);
                break;
        }
    }

    @Override // f2.w, f2.i0, f2.v0
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
    public k(xx0 xx0Var) {
        super(5);
        this.Q = 3;
        this.R = xx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
