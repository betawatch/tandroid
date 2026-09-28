package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
