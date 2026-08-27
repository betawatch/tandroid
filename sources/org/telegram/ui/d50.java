package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d50 implements org.telegram.ui.Components.q5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.q5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((e50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                j51 j51Var = (j51) this.b;
                j51Var.getClass();
                if (!ig.g0.b && j51Var.getParent() != null) {
                    ((View) j51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
