package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c50 implements org.telegram.ui.Components.v5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.v5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((d50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                m51 m51Var = (m51) this.b;
                m51Var.getClass();
                if (!kg.g0.b && m51Var.getParent() != null) {
                    ((View) m51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
