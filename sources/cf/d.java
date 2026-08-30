package cf;

import android.view.View;
import android.view.ViewTreeObserver;
import ph.i3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((i3) this.b).d();
                break;
        }
    }
}
