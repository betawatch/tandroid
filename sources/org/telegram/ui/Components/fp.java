package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class fp extends c5.k {
    public ep w0;

    public fp(Context context) {
        super(context);
        b(new dp((sf0) this));
    }

    @Override // c5.k
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (!(aVar instanceof ep)) {
            throw new IllegalArgumentException();
        }
        setAdapter((ep) aVar);
    }

    public void setAdapter(ep epVar) {
        this.w0 = epVar;
        super.setAdapter((c5.a) epVar);
        if (epVar != null) {
            x(epVar.j(), false);
        }
    }
}
