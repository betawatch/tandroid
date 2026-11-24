// default package

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
