package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements org.telegram.ui.Components.q5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a50(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.q5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((b50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                k51 k51Var = (k51) this.b;
                k51Var.getClass();
                if (!hg.h0.b && k51Var.getParent() != null) {
                    ((View) k51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
