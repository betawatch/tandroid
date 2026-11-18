package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import fi.u2;
import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a0(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                ((c0) this.b).e.incrementAndGet();
                return;
            default:
                u2 u2Var = (u2) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((xe.b) u2Var.b).iterator();
                    while (it.hasNext()) {
                        ((ri.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    u2Var.forceLayout();
                }
        }
    }
}
