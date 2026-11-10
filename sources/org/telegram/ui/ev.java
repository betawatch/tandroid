package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ ev(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                yw ywVar = this.b;
                zw zwVar = ywVar.K;
                vw vwVar = ywVar.a;
                if (vwVar != null && vwVar.getScrollState() == 0 && ywVar.a.getChildCount() > 0 && ywVar.a.getLayoutManager() != null) {
                    int i7 = 1;
                    boolean z9 = ywVar.s == 0 && zwVar.l4() && ywVar.w == 2;
                    float f10 = zwVar.N;
                    v4.b0 b0Var = (v4.b0) ywVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < ywVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(ywVar.a.getChildAt(i12));
                        View childAt = ywVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ywVar.a.getPaddingTop();
                        if (zwVar.K) {
                            f10 = 0.0f;
                        }
                        if (ywVar.a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((ywVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i7 = i11;
                            }
                            b0Var.h1(i7, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                yw ywVar2 = this.b;
                ywVar2.d.X(ywVar2.I);
                ywVar2.K.Q = true;
                vw vwVar2 = ywVar2.a;
                vwVar2.j3 = true;
                ywVar2.H = false;
                vwVar2.invalidate();
                break;
        }
    }
}
