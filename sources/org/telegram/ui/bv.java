package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw b;

    public /* synthetic */ bv(vw vwVar, int i7) {
        this.a = i7;
        this.b = vwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                vw vwVar = this.b;
                ww wwVar = vwVar.K;
                sw swVar = vwVar.a;
                if (swVar != null && swVar.getScrollState() == 0 && vwVar.a.getChildCount() > 0 && vwVar.a.getLayoutManager() != null) {
                    int i7 = 1;
                    boolean z9 = vwVar.s == 0 && wwVar.l4() && vwVar.w == 2;
                    float f10 = wwVar.N;
                    v4.b0 b0Var = (v4.b0) vwVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < vwVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(vwVar.a.getChildAt(i12));
                        View childAt = vwVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - vwVar.a.getPaddingTop();
                        if (wwVar.K) {
                            f10 = 0.0f;
                        }
                        if (vwVar.a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((vwVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                vw vwVar2 = this.b;
                vwVar2.d.X(vwVar2.I);
                vwVar2.K.Q = true;
                sw swVar2 = vwVar2.a;
                swVar2.j3 = true;
                vwVar2.H = false;
                swVar2.invalidate();
                break;
        }
    }
}
