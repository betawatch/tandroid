// default package

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
