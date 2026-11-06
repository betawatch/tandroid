package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
