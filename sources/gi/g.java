package gi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import hi.m3;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.li;
import v4.c1;
import v4.t;
import v4.x0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g extends t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override // v4.c0
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                return ((jw0) this.R).R1 != null && gd.a0;
            default:
                return super.Y0();
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public void b0(x0 x0Var, c1 c1Var) {
        switch (this.Q) {
            case 1:
                super.b0(x0Var, c1Var);
                m3 m3Var = (m3) this.R;
                if (m3Var.V) {
                    m3Var.V = false;
                    m3Var.a();
                    break;
                }
                break;
            default:
                super.b0(x0Var, c1Var);
                break;
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).b) {
                    i7 = 0;
                }
                return super.o0(i7, x0Var, c1Var);
            default:
                return super.o0(i7, x0Var, c1Var);
        }
    }

    @Override // v4.c0, v4.p0
    public void v0(RecyclerView recyclerView, c1 c1Var, int i7) {
        switch (this.Q) {
            case 2:
                ej ejVar = new ej(this, recyclerView.getContext());
                ejVar.a = i7;
                w0(ejVar);
                break;
            case 3:
                bm bmVar = new bm(this, recyclerView.getContext());
                bmVar.a = i7;
                w0(bmVar);
                break;
            default:
                super.v0(recyclerView, c1Var, i7);
                break;
        }
    }

    @Override // v4.t, v4.c0, v4.p0
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
    public /* synthetic */ g(li liVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = liVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jw0 jw0Var) {
        super(5);
        this.Q = 4;
        this.R = jw0Var;
    }
}
