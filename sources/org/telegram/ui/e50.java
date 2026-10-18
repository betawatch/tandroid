package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e50 implements org.telegram.ui.Components.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.x5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((f50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                i51 i51Var = (i51) this.b;
                i51Var.getClass();
                if (!ah.x0.b && i51Var.getParent() != null) {
                    ((View) i51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
