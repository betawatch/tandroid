package ei;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lm;
import s4.b1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class k extends s4.t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(li liVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = liVar;
    }

    @Override // s4.c0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((dz0) this.R).W != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // s4.t, s4.c0, s4.p0
    public int o0(int i10, rf.e eVar, b1 b1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, b1Var);
            default:
                return super.o0(i10, eVar, b1Var);
        }
    }

    @Override // s4.c0, s4.p0
    public void v0(RecyclerView recyclerView, b1 b1Var, int i10) {
        switch (this.Q) {
            case 1:
                gj gjVar = new gj(this, recyclerView.getContext());
                gjVar.a = i10;
                w0(gjVar);
                break;
            case 2:
                lm lmVar = new lm(this, recyclerView.getContext());
                lmVar.a = i10;
                w0(lmVar);
                break;
            default:
                super.v0(recyclerView, b1Var, i10);
                break;
        }
    }

    @Override // s4.t, s4.c0, s4.p0
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
    public k(dz0 dz0Var) {
        super(5);
        this.Q = 3;
        this.R = dz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
