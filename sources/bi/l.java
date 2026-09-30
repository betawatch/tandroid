package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.oi;
import s4.z0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class l extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(oi oiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = oiVar;
    }

    @Override // s4.c0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((hy0) this.R).W != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // s4.s, s4.c0, s4.o0
    public int o0(int i10, of.e eVar, z0 z0Var) {
        switch (this.Q) {
            case 0:
                if (((u) this.R).b) {
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
                jj jjVar = new jj(this, recyclerView.getContext());
                jjVar.a = i10;
                w0(jjVar);
                break;
            case 2:
                bm bmVar = new bm(this, recyclerView.getContext());
                bmVar.a = i10;
                w0(bmVar);
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
    public l(hy0 hy0Var) {
        super(5);
        this.Q = 3;
        this.R = hy0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
