package ci;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ((j4) this.b).d();
                break;
            default:
                pf.e eVar = (pf.e) this.b;
                View view = eVar.j;
                if (view != null) {
                    eVar.e(view);
                    break;
                }
                break;
        }
    }
}
