package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ ew(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                ay ayVar = this.b;
                cy cyVar = ayVar.K;
                xx xxVar = ayVar.a;
                if (xxVar != null && xxVar.getScrollState() == 0 && ayVar.a.getChildCount() > 0 && ayVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = ayVar.s == 0 && cyVar.X3() && ayVar.v == 2;
                    float f7 = cyVar.N;
                    s4.b0 b0Var = (s4.b0) ayVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ayVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ayVar.a.getChildAt(i13));
                        View childAt = ayVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ayVar.a.getPaddingTop();
                        if (cyVar.K) {
                            f7 = 0.0f;
                        }
                        if (ayVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ayVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ay ayVar2 = this.b;
                ayVar2.d.W(ayVar2.I);
                ayVar2.K.Q = true;
                xx xxVar2 = ayVar2.a;
                xxVar2.b3 = true;
                ayVar2.H = false;
                xxVar2.invalidate();
                break;
        }
    }
}
