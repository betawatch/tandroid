package ag;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import di.h3;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e0(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                ((g0) this.b).e.incrementAndGet();
                return;
            default:
                h3 h3Var = (h3) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((se.b) h3Var.b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    h3Var.forceLayout();
                }
        }
    }
}
