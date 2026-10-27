package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i50 implements org.telegram.ui.Components.z5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.z5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((j50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                o51 o51Var = (o51) this.b;
                o51Var.getClass();
                if (!bh.m0.b && o51Var.getParent() != null) {
                    ((View) o51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
