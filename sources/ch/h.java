package ch;

import android.graphics.RectF;
import android.view.View;
import r0.j0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                int i11 = iVar.D - 1;
                iVar.D = i11;
                if (i11 == 0) {
                    View view = iVar.B;
                    RectF rectF = e.e;
                    iVar.j(e.L(j0.f(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
