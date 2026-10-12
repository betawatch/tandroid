package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class jq extends z4.g {
    public iq w0;

    public jq(Context context) {
        super(context);
        b(new hq((pi0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof iq)) {
            throw new IllegalArgumentException();
        }
        setAdapter((iq) aVar);
    }

    public void setAdapter(iq iqVar) {
        this.w0 = iqVar;
        super.setAdapter((z4.a) iqVar);
        if (iqVar != null) {
            x(iqVar.j(), false);
        }
    }
}
