package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class jq extends a5.m {
    public iq w0;

    public jq(Context context) {
        super(context);
        b(new hq((ni0) this));
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
