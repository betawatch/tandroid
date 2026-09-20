package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yk;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e0 extends pz {
    public final /* synthetic */ int U;
    public final /* synthetic */ ni V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(ni niVar, int i10, vl0 vl0Var, int i11) {
        super(i10, 0, vl0Var);
        this.U = i11;
        this.V = niVar;
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
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.a = i10;
                w0(d0Var);
                break;
            case 1:
                nj njVar = new nj(this, recyclerView.getContext());
                njVar.a = i10;
                w0(njVar);
                break;
            case 2:
                ek ekVar = new ek(this, recyclerView.getContext());
                ekVar.a = i10;
                w0(ekVar);
                break;
            case 3:
                yk ykVar = new yk(this, recyclerView.getContext());
                ykVar.a = i10;
                w0(ykVar);
                break;
            default:
                in inVar = new in(this, recyclerView.getContext());
                inVar.a = i10;
                w0(inVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gl glVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = glVar;
    }
}
