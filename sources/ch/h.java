package ch;

import android.graphics.RectF;
import android.view.View;
import r0.j0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
