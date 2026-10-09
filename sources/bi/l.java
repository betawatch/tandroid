package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.xy0;
import s4.a1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class l extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(qi qiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = qiVar;
    }

    @Override // s4.d0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((xy0) this.R).W != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // s4.s, s4.d0, s4.p0
    public int o0(int i10, pf.e eVar, a1 a1Var) {
        switch (this.Q) {
            case 0:
                if (((u) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, a1Var);
            default:
                return super.o0(i10, eVar, a1Var);
        }
    }

    @Override // s4.d0, s4.p0
    public void v0(RecyclerView recyclerView, a1 a1Var, int i10) {
        switch (this.Q) {
            case 1:
                lj ljVar = new lj(this, recyclerView.getContext());
                ljVar.a = i10;
                w0(ljVar);
                break;
            case 2:
                qm qmVar = new qm(this, recyclerView.getContext());
                qmVar.a = i10;
                w0(qmVar);
                break;
            default:
                super.v0(recyclerView, a1Var, i10);
                break;
        }
    }

    @Override // s4.s, s4.d0, s4.p0
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
    public l(xy0 xy0Var) {
        super(5);
        this.Q = 3;
        this.R = xy0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
