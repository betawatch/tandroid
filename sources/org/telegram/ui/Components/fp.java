package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class fp extends b5.l {
    public ep x0;

    public fp(Context context) {
        super(context);
        b(new dp((vf0) this));
    }

    @Override // b5.l
    @Deprecated
    public void setAdapter(b5.a aVar) {
        if (!(aVar instanceof ep)) {
            throw new IllegalArgumentException();
        }
        setAdapter((ep) aVar);
    }

    public void setAdapter(ep epVar) {
        this.x0 = epVar;
        super.setAdapter((b5.a) epVar);
        if (epVar != null) {
            x(epVar.j(), false);
        }
    }
}
