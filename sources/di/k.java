package di;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ty0;
import s4.y0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(li liVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = liVar;
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
                if (((r) this.R).b) {
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
                gj gjVar = new gj(this, recyclerView.getContext());
                gjVar.a = i10;
                w0(gjVar);
                break;
            case 2:
                km kmVar = new km(this, recyclerView.getContext());
                kmVar.a = i10;
                w0(kmVar);
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
    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
