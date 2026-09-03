package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class tp extends m2.h {
    public sp t0;

    public tp(Context context) {
        super(context);
        b(new rp((wh0) this));
    }

    @Override // m2.h
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof sp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((sp) aVar);
    }

    public void setAdapter(sp spVar) {
        this.t0 = spVar;
        super.setAdapter((m2.a) spVar);
        if (spVar != null) {
            x(spVar.j(), false);
        }
    }
}
