package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ bw(ay ayVar, int i10) {
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
                wx wxVar = ayVar.a;
                if (wxVar != null && wxVar.getScrollState() == 0 && ayVar.a.getChildCount() > 0 && ayVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = ayVar.s == 0 && cyVar.h4() && ayVar.v == 2;
                    float f7 = cyVar.N;
                    s4.c0 c0Var = (s4.c0) ayVar.a.getLayoutManager();
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
                            c0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                ay ayVar2 = this.b;
                ayVar2.d.X(ayVar2.I);
                ayVar2.K.Q = true;
                wx wxVar2 = ayVar2.a;
                wxVar2.k3 = true;
                ayVar2.H = false;
                wxVar2.invalidate();
                break;
        }
    }
}
