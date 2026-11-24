// default package

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ar0 extends r35 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(u0b u0bVar) {
        super(5);
        this.Q = (byte) 4;
        this.R = u0bVar;
    }

    @Override // t26
    public final boolean X0() {
        switch (this.Q) {
            case 4:
                return ((u0b) this.R).Q1 != null && k96.a0;
            default:
                return super.X0();
        }
    }

    @Override // r35, t26, d49
    public final void a0(wg2 wg2Var, p49 p49Var) {
        switch (this.Q) {
            case 3:
                super.a0(wg2Var, p49Var);
                sr4 sr4Var = (sr4) this.R;
                if (sr4Var.V) {
                    sr4Var.V = false;
                    sr4Var.a();
                    break;
                }
                break;
            default:
                super.a0(wg2Var, p49Var);
                break;
        }
    }

    @Override // r35, t26, d49
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        switch (this.Q) {
            case 0:
                if (((gr0) this.R).b) {
                    i = 0;
                }
                return super.n0(i, wg2Var, p49Var);
            default:
                return super.n0(i, wg2Var, p49Var);
        }
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.Q) {
            case 1:
                t12 t12Var = new t12(this, recyclerView.getContext());
                t12Var.a = i;
                v0(t12Var);
                break;
            case 2:
                y42 y42Var = new y42(this, recyclerView.getContext());
                y42Var.a = i;
                v0(y42Var);
                break;
            default:
                super.u0(recyclerView, p49Var, i);
                break;
        }
    }

    @Override // r35, t26, d49
    public final boolean x0() {
        switch (this.Q) {
            case 0:
            case 1:
            case 2:
                return false;
            default:
                return super.x0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar0(FrameLayout frameLayout, byte b) {
        super(3);
        this.Q = b;
        this.R = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar0(p02 p02Var, int i, byte b) {
        super(i);
        this.Q = b;
        this.R = p02Var;
    }
}
