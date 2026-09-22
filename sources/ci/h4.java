package ci;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
