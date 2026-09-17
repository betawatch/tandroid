package di;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                qf.e eVar = (qf.e) this.b;
                View view = eVar.j;
                if (view != null) {
                    eVar.e(view);
                    break;
                }
                break;
        }
    }
}
