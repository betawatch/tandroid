package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zi extends dz {
    public final /* synthetic */ int U;
    public final /* synthetic */ yh V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi(yh yhVar, int i10, zk0 zk0Var, int i11) {
        super(i10, 0, zk0Var);
        this.U = i11;
        this.V = yhVar;
    }

    @Override // f2.x0
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
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

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        switch (this.U) {
            case 0:
                yi yiVar = new yi(this, recyclerView.getContext());
                yiVar.a = i10;
                w0(yiVar);
                break;
            case 1:
                rj rjVar = new rj(this, recyclerView.getContext());
                rjVar.a = i10;
                w0(rjVar);
                break;
            case 2:
                lk lkVar = new lk(this, recyclerView.getContext());
                lkVar.a = i10;
                w0(lkVar);
                break;
            case 3:
                wm wmVar = new wm(this, recyclerView.getContext());
                wmVar.a = i10;
                w0(wmVar);
                break;
            default:
                qf.a0 a0Var = new qf.a0(this, recyclerView.getContext());
                a0Var.a = i10;
                w0(a0Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(tk tkVar, hh.f1 f1Var) {
        super(0, 0, f1Var);
        this.U = 2;
        this.V = tkVar;
    }
}
