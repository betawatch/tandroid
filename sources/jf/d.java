package jf;

import android.view.View;
import android.view.ViewTreeObserver;
import vh.r2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                View view = fVar.j;
                if (view != null) {
                    fVar.e(view);
                    break;
                }
                break;
            default:
                ((r2) this.b).d();
                break;
        }
    }
}
