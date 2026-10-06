package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.ry0;
import s4.z0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class l extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(pi piVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = piVar;
    }

    @Override // s4.c0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((ry0) this.R).W != null && LocaleController.isRTL;
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
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.a = i10;
                w0(kjVar);
                break;
            case 2:
                cm cmVar = new cm(this, recyclerView.getContext());
                cmVar.a = i10;
                w0(cmVar);
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
    public l(ry0 ry0Var) {
        super(5);
        this.Q = 3;
        this.R = ry0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
