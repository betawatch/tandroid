package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class gq extends z4.g {
    public fq w0;

    public gq(Context context) {
        super(context);
        b(new eq((ki0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof fq)) {
            throw new IllegalArgumentException();
        }
        setAdapter((fq) aVar);
    }

    public void setAdapter(fq fqVar) {
        this.w0 = fqVar;
        super.setAdapter((z4.a) fqVar);
        if (fqVar != null) {
            x(fqVar.j(), false);
        }
    }
}
