package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
