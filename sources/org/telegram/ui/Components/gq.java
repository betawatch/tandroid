package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public abstract class gq extends z4.g {
    public fq w0;

    public gq(Context context) {
        super(context);
        b(new eq((li0) this));
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
