// default package

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr4 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ kr4(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ((mr4) view).e.incrementAndGet();
                return;
            default:
                vl4 vl4Var = (vl4) view;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((r89) vl4Var.b).iterator();
                    while (it.hasNext()) {
                        ((my4) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    vl4Var.forceLayout();
                }
        }
    }
}
