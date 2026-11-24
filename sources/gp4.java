// default package

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class gp4 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ gp4(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ((ip4) view).e.incrementAndGet();
                return;
            default:
                rj4 rj4Var = (rj4) view;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((e59) rj4Var.b).iterator();
                    while (it.hasNext()) {
                        ((hw4) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    rj4Var.forceLayout();
                }
        }
    }
}
