package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class cq extends z4.g {
    public bq w0;

    public cq(Context context) {
        super(context);
        b(new aq((yh0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof bq)) {
            throw new IllegalArgumentException();
        }
        setAdapter((bq) aVar);
    }

    public void setAdapter(bq bqVar) {
        this.w0 = bqVar;
        super.setAdapter((z4.a) bqVar);
        if (bqVar != null) {
            x(bqVar.j(), false);
        }
    }
}
