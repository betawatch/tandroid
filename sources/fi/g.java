package fi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import gi.d3;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.xv0;
import u4.a1;
import u4.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, FrameLayout frameLayout) {
        super(3);
        this.Q = i3;
        this.R = frameLayout;
    }

    @Override // u4.b0
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                return ((xv0) this.R).O1 != null && bd.a0;
            default:
                return super.Y0();
        }
    }

    @Override // u4.s, u4.b0, u4.o0
    public void b0(tf.e eVar, a1 a1Var) {
        switch (this.Q) {
            case 1:
                super.b0(eVar, a1Var);
                d3 d3Var = (d3) this.R;
                if (d3Var.V) {
                    d3Var.V = false;
                    d3Var.a();
                    break;
                }
                break;
            default:
                super.b0(eVar, a1Var);
                break;
        }
    }

    @Override // u4.s, u4.b0, u4.o0
    public int o0(int i3, tf.e eVar, a1 a1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).b) {
                    i3 = 0;
                }
                return super.o0(i3, eVar, a1Var);
            default:
                return super.o0(i3, eVar, a1Var);
        }
    }

    @Override // u4.b0, u4.o0
    public void v0(RecyclerView recyclerView, a1 a1Var, int i3) {
        switch (this.Q) {
            case 2:
                oi oiVar = new oi(this, recyclerView.getContext());
                oiVar.a = i3;
                w0(oiVar);
                break;
            case 3:
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.a = i3;
                w0(mlVar);
                break;
            default:
                super.v0(recyclerView, a1Var, i3);
                break;
        }
    }

    @Override // u4.s, u4.b0, u4.o0
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
    public /* synthetic */ g(th thVar, int i3, int i10) {
        super(i3);
        this.Q = i10;
        this.R = thVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xv0 xv0Var) {
        super(5);
        this.Q = 4;
        this.R = xv0Var;
    }
}
