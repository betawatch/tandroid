package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class up extends c5.l {
    public tp x0;

    public up(Context context) {
        super(context);
        b(new sp((gg0) this));
    }

    @Override // c5.l
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (!(aVar instanceof tp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((tp) aVar);
    }

    public void setAdapter(tp tpVar) {
        this.x0 = tpVar;
        super.setAdapter((c5.a) tpVar);
        if (tpVar != null) {
            x(tpVar.j(), false);
        }
    }
}
