// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l32 extends wd4 {
    public final /* synthetic */ byte U;
    public final /* synthetic */ a22 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(n52 n52Var, fv fvVar) {
        super(0, 0, fvVar);
        this.U = (byte) 2;
        this.V = n52Var;
    }

    @Override // f69
    public final int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int B = this.n - B();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int height = rect.height() + top;
                int min = Math.min(0, top);
                int max = Math.max(0, height - B);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.U) {
            case 0:
                k32 k32Var = new k32(this, recyclerView.getContext());
                k32Var.a = i;
                v0(k32Var);
                break;
            case 1:
                e42 e42Var = new e42(this, recyclerView.getContext());
                e42Var.a = i;
                v0(e42Var);
                break;
            case 2:
                j52 j52Var = new j52(this, recyclerView.getContext());
                j52Var.a = i;
                v0(j52Var);
                break;
            case 3:
                m72 m72Var = new m72(this, recyclerView.getContext());
                m72Var.a = i;
                v0(m72Var);
                break;
            default:
                w72 w72Var = new w72(this, recyclerView.getContext());
                w72Var.a = i;
                v0(w72Var);
                break;
        }
    }

    @Override // u46
    public final void y0(r69 r69Var, int[] iArr) {
        switch (this.U) {
            case 2:
                super.y0(r69Var, iArr);
                iArr[1] = Math.max(iArr[1], ((n52) this.V).M.getHeight());
                break;
            default:
                super.y0(r69Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l32(a22 a22Var, int i, r59 r59Var, byte b) {
        super(i, 0, r59Var);
        this.U = b;
        this.V = a22Var;
    }
}
