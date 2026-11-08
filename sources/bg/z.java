package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import di.b3;
import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
