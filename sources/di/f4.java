package di;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ((h4) this.b).d();
                break;
            default:
                rf.d dVar = (rf.d) this.b;
                View view = dVar.j;
                if (view != null) {
                    dVar.e(view);
                    break;
                }
                break;
        }
    }
}
