package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o50 implements org.telegram.ui.Components.r5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.r5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((p50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                y51 y51Var = (y51) this.b;
                y51Var.getClass();
                if (!mg.g0.b && y51Var.getParent() != null) {
                    ((View) y51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
