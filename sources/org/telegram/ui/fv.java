package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ fv(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                bx bxVar = this.b;
                cx cxVar = bxVar.L;
                yw ywVar = bxVar.a;
                if (ywVar != null && ywVar.getScrollState() == 0 && bxVar.a.getChildCount() > 0 && bxVar.a.getLayoutManager() != null) {
                    int i7 = 1;
                    boolean z10 = bxVar.s == 0 && cxVar.n4() && bxVar.w == 2;
                    float f10 = cxVar.O;
                    v4.c0 c0Var = (v4.c0) bxVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < bxVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(bxVar.a.getChildAt(i12));
                        View childAt = bxVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - bxVar.a.getPaddingTop();
                        if (cxVar.L) {
                            f10 = 0.0f;
                        }
                        if (bxVar.a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((bxVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i7 = i11;
                            }
                            c0Var.h1(i7, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                bx bxVar2 = this.b;
                bxVar2.d.X(bxVar2.J);
                bxVar2.L.R = true;
                yw ywVar2 = bxVar2.a;
                ywVar2.k3 = true;
                bxVar2.I = false;
                ywVar2.invalidate();
                break;
        }
    }
}
