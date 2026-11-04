package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j30 implements org.telegram.ui.Components.m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j30(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.m5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((k30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                q01 q01Var = (q01) this.b;
                q01Var.getClass();
                if (!dh.d0.b && q01Var.getParent() != null) {
                    ((View) q01Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
