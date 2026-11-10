package ei;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import fi.f3;
import org.telegram.messenger.id;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.yv0;
import v4.a1;
import v4.s;
import v4.v0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override // v4.b0
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                return ((yv0) this.R).Q1 != null && id.a0;
            default:
                return super.Y0();
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public void b0(v0 v0Var, a1 a1Var) {
        switch (this.Q) {
            case 1:
                super.b0(v0Var, a1Var);
                f3 f3Var = (f3) this.R;
                if (f3Var.U) {
                    f3Var.U = false;
                    f3Var.a();
                    break;
                }
                break;
            default:
                super.b0(v0Var, a1Var);
                break;
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public int o0(int i7, v0 v0Var, a1 a1Var) {
        switch (this.Q) {
            case 0:
                if (((n) this.R).b) {
                    i7 = 0;
                }
                return super.o0(i7, v0Var, a1Var);
            default:
                return super.o0(i7, v0Var, a1Var);
        }
    }

    @Override // v4.b0, v4.n0
    public void v0(RecyclerView recyclerView, a1 a1Var, int i7) {
        switch (this.Q) {
            case 2:
                ni niVar = new ni(this, recyclerView.getContext());
                niVar.a = i7;
                w0(niVar);
                break;
            case 3:
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.a = i7;
                w0(mlVar);
                break;
            default:
                super.v0(recyclerView, a1Var, i7);
                break;
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
            default:
                return super.y0();
            case 2:
                return false;
            case 3:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(uh uhVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = uhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yv0 yv0Var) {
        super(5);
        this.Q = 4;
        this.R = yv0Var;
    }
}
