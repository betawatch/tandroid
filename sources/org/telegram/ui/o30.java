package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o30 implements org.telegram.ui.Components.o5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.o5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((p30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                a11 a11Var = (a11) this.b;
                a11Var.getClass();
                if (!ch.e0.b && a11Var.getParent() != null) {
                    ((View) a11Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
