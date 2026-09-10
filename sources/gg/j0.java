package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j0 extends wz {
    public final /* synthetic */ int U;
    public final /* synthetic */ qi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(qi qiVar, int i10, vl0 vl0Var, int i11) {
        super(i10, 0, vl0Var);
        this.U = i11;
        this.V = qiVar;
    }

    @Override // s4.o0
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.n - C();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int height = rect.height() + top;
                int min = Math.min(0, top);
                int max = Math.max(0, height - C);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.U) {
            case 0:
                i0 i0Var = new i0(this, recyclerView.getContext());
                i0Var.a = i10;
                w0(i0Var);
                break;
            case 1:
                qj qjVar = new qj(this, recyclerView.getContext());
                qjVar.a = i10;
                w0(qjVar);
                break;
            case 2:
                jk jkVar = new jk(this, recyclerView.getContext());
                jkVar.a = i10;
                w0(jkVar);
                break;
            case 3:
                dl dlVar = new dl(this, recyclerView.getContext());
                dlVar.a = i10;
                w0(dlVar);
                break;
            default:
                on onVar = new on(this, recyclerView.getContext());
                onVar.a = i10;
                w0(onVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ll llVar, bi.y1 y1Var) {
        super(0, 0, y1Var);
        this.U = 3;
        this.V = llVar;
    }
}
