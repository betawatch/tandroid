package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
