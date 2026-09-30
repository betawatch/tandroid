package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p50 implements org.telegram.ui.Components.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.w5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((q50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                j61 j61Var = (j61) this.b;
                j61Var.getClass();
                if (!zg.e0.b && j61Var.getParent() != null) {
                    ((View) j61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
