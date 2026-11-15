package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import fi.w2;
import java.util.Iterator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
