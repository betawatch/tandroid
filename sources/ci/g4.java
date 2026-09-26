package ci;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ((i4) this.b).d();
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
