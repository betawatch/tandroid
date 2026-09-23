package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ux0;
import s4.z0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                return ((ux0) this.R).W != null && LocaleController.isRTL;
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
                ij ijVar = new ij(this, recyclerView.getContext());
                ijVar.a = i10;
                w0(ijVar);
                break;
            case 2:
                am amVar = new am(this, recyclerView.getContext());
                amVar.a = i10;
                w0(amVar);
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
    public l(ux0 ux0Var) {
        super(5);
        this.Q = 3;
        this.R = ux0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
