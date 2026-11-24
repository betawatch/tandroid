// default package

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class as0 extends q55 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(x2b x2bVar) {
        super(5);
        this.Q = (byte) 4;
        this.R = x2bVar;
    }

    @Override // u46
    public final boolean X0() {
        switch (this.Q) {
            case 4:
                return ((x2b) this.R).Q1 != null && jb6.a0;
            default:
                return super.X0();
        }
    }

    @Override // q55, u46, f69
    public final void a0(ki2 ki2Var, r69 r69Var) {
        switch (this.Q) {
            case 3:
                super.a0(ki2Var, r69Var);
                tt4 tt4Var = (tt4) this.R;
                if (tt4Var.V) {
                    tt4Var.V = false;
                    tt4Var.a();
                    break;
                }
                break;
            default:
                super.a0(ki2Var, r69Var);
                break;
        }
    }

    @Override // q55, u46, f69
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        switch (this.Q) {
            case 0:
                if (((gs0) this.R).b) {
                    i = 0;
                }
                return super.n0(i, ki2Var, r69Var);
            default:
                return super.n0(i, ki2Var, r69Var);
        }
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.Q) {
            case 1:
                f32 f32Var = new f32(this, recyclerView.getContext());
                f32Var.a = i;
                v0(f32Var);
                break;
            case 2:
                j62 j62Var = new j62(this, recyclerView.getContext());
                j62Var.a = i;
                v0(j62Var);
                break;
            default:
                super.u0(recyclerView, r69Var, i);
                break;
        }
    }

    @Override // q55, u46, f69
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
    public /* synthetic */ as0(FrameLayout frameLayout, byte b) {
        super(3);
        this.Q = b;
        this.R = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as0(a22 a22Var, int i, byte b) {
        super(i);
        this.Q = b;
        this.R = a22Var;
    }
}
