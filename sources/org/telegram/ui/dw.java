package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ dw(dy dyVar, int i10) {
        this.a = i10;
        this.b = dyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                dy dyVar = this.b;
                ey eyVar = dyVar.K;
                zx zxVar = dyVar.a;
                if (zxVar != null && zxVar.getScrollState() == 0 && dyVar.a.getChildCount() > 0 && dyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = dyVar.s == 0 && eyVar.h4() && dyVar.v == 2;
                    float f7 = eyVar.N;
                    s4.c0 c0Var = (s4.c0) dyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < dyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(dyVar.a.getChildAt(i13));
                        View childAt = dyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - dyVar.a.getPaddingTop();
                        if (eyVar.K) {
                            f7 = 0.0f;
                        }
                        if (dyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((dyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                dy dyVar2 = this.b;
                dyVar2.d.X(dyVar2.I);
                dyVar2.K.Q = true;
                zx zxVar2 = dyVar2.a;
                zxVar2.k3 = true;
                dyVar2.H = false;
                zxVar2.invalidate();
                break;
        }
    }
}
