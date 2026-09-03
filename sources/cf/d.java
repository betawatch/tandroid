package cf;

import android.view.View;
import android.view.ViewTreeObserver;
import qh.h3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((h3) this.b).d();
                break;
        }
    }
}
