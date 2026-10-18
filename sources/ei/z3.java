package ei;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
