// default package

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eyc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fyc b;

    public /* synthetic */ eyc(fyc fycVar, byte b) {
        this.a = b;
        this.b = fycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fyc fycVar = this.b;
        switch (b) {
            case 0:
                if (fycVar.w != 0) {
                    fycVar.i(false);
                    break;
                }
                break;
            default:
                int i = fycVar.H - 1;
                fycVar.H = i;
                if (i == 0) {
                    View view = fycVar.F;
                    RectF rectF = twc.e;
                    WeakHashMap weakHashMap = jdc.a;
                    fycVar.k(twc.a(cdc.a(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
