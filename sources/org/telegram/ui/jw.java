package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ jw(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                fy fyVar = this.b;
                gy gyVar = fyVar.G;
                cy cyVar = fyVar.a;
                if (cyVar != null && cyVar.getScrollState() == 0 && fyVar.a.getChildCount() > 0 && fyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = fyVar.s == 0 && gyVar.Z3() && fyVar.v == 2;
                    float f10 = gyVar.J;
                    f2.k0 k0Var = (f2.k0) fyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < fyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(fyVar.a.getChildAt(i13));
                        View childAt = fyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - fyVar.a.getPaddingTop();
                        if (gyVar.G) {
                            f10 = 0.0f;
                        }
                        if (fyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((fyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i10 = i12;
                            }
                            k0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                fy fyVar2 = this.b;
                fyVar2.d.W(fyVar2.E);
                fyVar2.G.M = true;
                cy cyVar2 = fyVar2.a;
                cyVar2.Z2 = true;
                fyVar2.D = false;
                cyVar2.invalidate();
                break;
        }
    }
}
