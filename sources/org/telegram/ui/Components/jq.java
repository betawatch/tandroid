package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class jq extends a5.m {
    public iq w0;

    public jq(Context context) {
        super(context);
        b(new hq((oi0) this));
    }

    @Override // a5.m
    @Deprecated
    public void setAdapter(a5.a aVar) {
        if (!(aVar instanceof iq)) {
            throw new IllegalArgumentException();
        }
        setAdapter((iq) aVar);
    }

    public void setAdapter(iq iqVar) {
        this.w0 = iqVar;
        super.setAdapter((a5.a) iqVar);
        if (iqVar != null) {
            x(iqVar.j(), false);
        }
    }
}
