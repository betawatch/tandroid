package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import fi.w2;
import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                w2 w2Var = (w2) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((xe.b) w2Var.b).iterator();
                    while (it.hasNext()) {
                        ((ri.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    w2Var.forceLayout();
                }
        }
    }
}
