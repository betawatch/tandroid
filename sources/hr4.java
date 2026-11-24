// default package

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hr4 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ hr4(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ((jr4) view).e.incrementAndGet();
                return;
            default:
                yc ycVar = (yc) view;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((g79) ycVar.b).iterator();
                    while (it.hasNext()) {
                        ((jy4) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    ycVar.forceLayout();
                }
        }
    }
}
