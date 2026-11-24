// default package

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g0d b;

    public /* synthetic */ f0d(g0d g0dVar, byte b) {
        this.a = b;
        this.b = g0dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g0d g0dVar = this.b;
        switch (b) {
            case 0:
                if (g0dVar.w != 0) {
                    g0dVar.i(false);
                    break;
                }
                break;
            default:
                int i = g0dVar.H - 1;
                g0dVar.H = i;
                if (i == 0) {
                    View view = g0dVar.F;
                    RectF rectF = uyc.e;
                    WeakHashMap weakHashMap = kfc.a;
                    g0dVar.k(uyc.a(dfc.a(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
