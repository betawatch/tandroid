package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class vp extends c5.l {
    public up x0;

    public vp(Context context) {
        super(context);
        b(new tp((fg0) this));
    }

    @Override // c5.l
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (!(aVar instanceof up)) {
            throw new IllegalArgumentException();
        }
        setAdapter((up) aVar);
    }

    public void setAdapter(up upVar) {
        this.x0 = upVar;
        super.setAdapter((c5.a) upVar);
        if (upVar != null) {
            x(upVar.j(), false);
        }
    }
}
