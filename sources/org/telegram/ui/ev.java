package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ax b;

    public /* synthetic */ ev(ax axVar, int i7) {
        this.a = i7;
        this.b = axVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                ax axVar = this.b;
                bx bxVar = axVar.L;
                xw xwVar = axVar.a;
                if (xwVar != null && xwVar.getScrollState() == 0 && axVar.a.getChildCount() > 0 && axVar.a.getLayoutManager() != null) {
                    int i7 = 1;
                    boolean z10 = axVar.s == 0 && bxVar.n4() && axVar.w == 2;
                    float f10 = bxVar.O;
                    v4.c0 c0Var = (v4.c0) axVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < axVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(axVar.a.getChildAt(i12));
                        View childAt = axVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - axVar.a.getPaddingTop();
                        if (bxVar.L) {
                            f10 = 0.0f;
                        }
                        if (axVar.a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((axVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                ax axVar2 = this.b;
                axVar2.d.X(axVar2.J);
                axVar2.L.R = true;
                xw xwVar2 = axVar2.a;
                xwVar2.k3 = true;
                axVar2.I = false;
                xwVar2.invalidate();
                break;
        }
    }
}
