package af;

import android.view.View;
import android.view.ViewTreeObserver;
import nh.w3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                View view = gVar.j;
                if (view != null) {
                    gVar.e(view);
                    break;
                }
                break;
            default:
                ((w3) this.b).d();
                break;
        }
    }
}
