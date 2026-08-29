package mh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.d1;
import f2.k1;
import f2.w;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.zi;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k extends w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(fi fiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = fiVar;
    }

    @Override // f2.j0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((nx0) this.R).S != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // f2.w, f2.j0, f2.w0
    public int o0(int i10, d1 d1Var, k1 k1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, d1Var, k1Var);
            default:
                return super.o0(i10, d1Var, k1Var);
        }
    }

    @Override // f2.j0, f2.w0
    public void v0(RecyclerView recyclerView, k1 k1Var, int i10) {
        switch (this.Q) {
            case 1:
                zi ziVar = new zi(this, recyclerView.getContext());
                ziVar.a = i10;
                w0(ziVar);
                break;
            case 2:
                ul ulVar = new ul(this, recyclerView.getContext());
                ulVar.a = i10;
                w0(ulVar);
                break;
            default:
                super.v0(recyclerView, k1Var, i10);
                break;
        }
    }

    @Override // f2.w, f2.j0, f2.w0
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
    public k(nx0 nx0Var) {
        super(5);
        this.Q = 3;
        this.R = nx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
