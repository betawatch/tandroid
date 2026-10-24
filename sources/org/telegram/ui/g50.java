package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g50 implements org.telegram.ui.Components.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.x5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((h50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                k51 k51Var = (k51) this.b;
                k51Var.getClass();
                if (!ah.x0.b && k51Var.getParent() != null) {
                    ((View) k51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
