package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import di.b3;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ z(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                ((b0) this.b).e.incrementAndGet();
                return;
            default:
                b3 b3Var = (b3) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((xe.b) b3Var.b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    b3Var.forceLayout();
                }
        }
    }
}
