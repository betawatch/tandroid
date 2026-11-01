package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx b;

    public /* synthetic */ fw(yx yxVar, int i10) {
        this.a = i10;
        this.b = yxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                yx yxVar = this.b;
                zx zxVar = yxVar.K;
                vx vxVar = yxVar.a;
                if (vxVar != null && vxVar.getScrollState() == 0 && yxVar.a.getChildCount() > 0 && yxVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = yxVar.s == 0 && zxVar.l4() && yxVar.w == 2;
                    float f7 = zxVar.N;
                    s4.a0 a0Var = (s4.a0) yxVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < yxVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(yxVar.a.getChildAt(i13));
                        View childAt = yxVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - yxVar.a.getPaddingTop();
                        if (zxVar.K) {
                            f7 = 0.0f;
                        }
                        if (yxVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((yxVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                yx yxVar2 = this.b;
                yxVar2.d.X(yxVar2.I);
                yxVar2.K.Q = true;
                vx vxVar2 = yxVar2.a;
                vxVar2.j3 = true;
                yxVar2.H = false;
                vxVar2.invalidate();
                break;
        }
    }
}
