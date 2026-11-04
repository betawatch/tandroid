package cg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import ei.e3;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ y(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                ((a0) this.b).e.incrementAndGet();
                return;
            default:
                e3 e3Var = (e3) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((ue.b) e3Var.b).iterator();
                    while (it.hasNext()) {
                        ((pi.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    e3Var.forceLayout();
                }
        }
    }
}
