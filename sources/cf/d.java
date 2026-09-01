package cf;

import android.view.View;
import android.view.ViewTreeObserver;
import qh.i3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
