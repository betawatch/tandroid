package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class hq extends z4.h {
    public gq w0;

    public hq(Context context) {
        super(context);
        b(new fq((oi0) this));
    }

    @Override // z4.h
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof gq)) {
            throw new IllegalArgumentException();
        }
        setAdapter((gq) aVar);
    }

    public void setAdapter(gq gqVar) {
        this.w0 = gqVar;
        super.setAdapter((z4.a) gqVar);
        if (gqVar != null) {
            x(gqVar.j(), false);
        }
    }
}
