package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class c50 implements org.telegram.ui.Components.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.x5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((d50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                g51 g51Var = (g51) this.b;
                g51Var.getClass();
                if (!ah.x0.b && g51Var.getParent() != null) {
                    ((View) g51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
