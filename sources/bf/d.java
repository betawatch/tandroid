package bf;

import android.view.View;
import android.view.ViewTreeObserver;
import ph.i3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
