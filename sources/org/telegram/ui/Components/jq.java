package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
