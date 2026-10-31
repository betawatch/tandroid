package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ gw(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                zx zxVar = this.b;
                ay ayVar = zxVar.K;
                wx wxVar = zxVar.a;
                if (wxVar != null && wxVar.getScrollState() == 0 && zxVar.a.getChildCount() > 0 && zxVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = zxVar.s == 0 && ayVar.k4() && zxVar.w == 2;
                    float f7 = ayVar.N;
                    s4.a0 a0Var = (s4.a0) zxVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < zxVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(zxVar.a.getChildAt(i13));
                        View childAt = zxVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - zxVar.a.getPaddingTop();
                        if (ayVar.K) {
                            f7 = 0.0f;
                        }
                        if (zxVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((zxVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            a0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                zx zxVar2 = this.b;
                zxVar2.d.X(zxVar2.I);
                zxVar2.K.Q = true;
                wx wxVar2 = zxVar2.a;
                wxVar2.j3 = true;
                zxVar2.H = false;
                wxVar2.invalidate();
                break;
        }
    }
}
