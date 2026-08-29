package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ iw(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                ey eyVar = this.b;
                fy fyVar = eyVar.G;
                ay ayVar = eyVar.a;
                if (ayVar != null && ayVar.getScrollState() == 0 && eyVar.a.getChildCount() > 0 && eyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = eyVar.s == 0 && fyVar.Z3() && eyVar.v == 2;
                    float f9 = fyVar.J;
                    f2.j0 j0Var = (f2.j0) eyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < eyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(eyVar.a.getChildAt(i13));
                        View childAt = eyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - eyVar.a.getPaddingTop();
                        if (fyVar.G) {
                            f9 = 0.0f;
                        }
                        if (eyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((eyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f9 < 0.0f) {
                                top = f9;
                            } else {
                                i10 = i12;
                            }
                            j0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.d.W(eyVar2.E);
                eyVar2.G.M = true;
                ay ayVar2 = eyVar2.a;
                ayVar2.Z2 = true;
                eyVar2.D = false;
                ayVar2.invalidate();
                break;
        }
    }
}
