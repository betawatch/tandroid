package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
