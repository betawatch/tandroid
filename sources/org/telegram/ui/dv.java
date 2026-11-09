package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xw b;

    public /* synthetic */ dv(xw xwVar, int i7) {
        this.a = i7;
        this.b = xwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                xw xwVar = this.b;
                yw ywVar = xwVar.K;
                uw uwVar = xwVar.a;
                if (uwVar != null && uwVar.getScrollState() == 0 && xwVar.a.getChildCount() > 0 && xwVar.a.getLayoutManager() != null) {
                    int i7 = 1;
                    boolean z9 = xwVar.s == 0 && ywVar.l4() && xwVar.w == 2;
                    float f10 = ywVar.N;
                    v4.b0 b0Var = (v4.b0) xwVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < xwVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(xwVar.a.getChildAt(i12));
                        View childAt = xwVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - xwVar.a.getPaddingTop();
                        if (ywVar.K) {
                            f10 = 0.0f;
                        }
                        if (xwVar.a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((xwVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i7 = i11;
                            }
                            b0Var.h1(i7, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                xw xwVar2 = this.b;
                xwVar2.d.X(xwVar2.I);
                xwVar2.K.Q = true;
                uw uwVar2 = xwVar2.a;
                uwVar2.j3 = true;
                xwVar2.H = false;
                uwVar2.invalidate();
                break;
        }
    }
}
