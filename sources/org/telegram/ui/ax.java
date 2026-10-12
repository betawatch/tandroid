package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy b;

    public /* synthetic */ ax(xy xyVar, int i10) {
        this.a = i10;
        this.b = xyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                xy xyVar = this.b;
                yy yyVar = xyVar.K;
                uy uyVar = xyVar.a;
                if (uyVar != null && uyVar.getScrollState() == 0 && xyVar.a.getChildCount() > 0 && xyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = xyVar.s == 0 && yyVar.W3() && xyVar.v == 2;
                    float f7 = yyVar.N;
                    s4.b0 b0Var = (s4.b0) xyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < xyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(xyVar.a.getChildAt(i13));
                        View childAt = xyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - xyVar.a.getPaddingTop();
                        if (yyVar.K) {
                            f7 = 0.0f;
                        }
                        if (xyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((xyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            b0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                xy xyVar2 = this.b;
                xyVar2.d.W(xyVar2.I);
                xyVar2.K.Q = true;
                uy uyVar2 = xyVar2.a;
                uyVar2.b3 = true;
                xyVar2.H = false;
                uyVar2.invalidate();
                break;
        }
    }
}
