package nf;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import ei.i;
import java.util.Iterator;
import rf.v;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                ih.c cVar = (ih.c) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((je.b) cVar.b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    cVar.forceLayout();
                }
            default:
                ((v) this.b).e.incrementAndGet();
                return;
        }
    }
}
