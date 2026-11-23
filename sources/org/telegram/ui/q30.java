package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q30 implements org.telegram.ui.Components.u5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.u5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((r30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                a11 a11Var = (a11) this.b;
                a11Var.getClass();
                if (!ch.f0.b && a11Var.getParent() != null) {
                    ((View) a11Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
