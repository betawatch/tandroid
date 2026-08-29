package ah;

import android.graphics.RectF;
import android.view.View;
import r0.j0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ h(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i iVar = this.b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    break;
                }
                break;
            default:
                int i11 = iVar.C - 1;
                iVar.C = i11;
                if (i11 == 0) {
                    View view = iVar.A;
                    RectF rectF = e.e;
                    iVar.j(e.Q(j0.f(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
