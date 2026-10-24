package ei;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ((b4) this.b).d();
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
