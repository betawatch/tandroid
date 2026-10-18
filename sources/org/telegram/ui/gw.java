package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ gw(dy dyVar, int i10) {
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
                    boolean z10 = dyVar.s == 0 && eyVar.X3() && dyVar.v == 2;
                    float f7 = eyVar.N;
                    s4.b0 b0Var = (s4.b0) dyVar.a.getLayoutManager();
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
                            b0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                dy dyVar2 = this.b;
                dyVar2.d.W(dyVar2.I);
                dyVar2.K.Q = true;
                zx zxVar2 = dyVar2.a;
                zxVar2.b3 = true;
                dyVar2.H = false;
                zxVar2.invalidate();
                break;
        }
    }
}
