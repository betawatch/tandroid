package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ gw(cy cyVar, int i9) {
        this.a = i9;
        this.b = cyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                cy cyVar = this.b;
                dy dyVar = cyVar.G;
                yx yxVar = cyVar.a;
                if (yxVar != null && yxVar.getScrollState() == 0 && cyVar.a.getChildCount() > 0 && cyVar.a.getLayoutManager() != null) {
                    int i9 = 1;
                    boolean z10 = cyVar.s == 0 && dyVar.Z3() && cyVar.v == 2;
                    float f10 = dyVar.J;
                    f2.m0 m0Var = (f2.m0) cyVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < cyVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(cyVar.a.getChildAt(i12));
                        View childAt = cyVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - cyVar.a.getPaddingTop();
                        if (dyVar.G) {
                            f10 = 0.0f;
                        }
                        if (cyVar.a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((cyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i9 = i11;
                            }
                            m0Var.h1(i9, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                cy cyVar2 = this.b;
                cyVar2.d.W(cyVar2.E);
                cyVar2.G.M = true;
                yx yxVar2 = cyVar2.a;
                yxVar2.Z2 = true;
                cyVar2.D = false;
                yxVar2.invalidate();
                break;
        }
    }
}
