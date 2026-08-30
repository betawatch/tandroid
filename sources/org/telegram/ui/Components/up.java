package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class up extends m2.h {
    public tp t0;

    public up(Context context) {
        super(context);
        b(new sp((vh0) this));
    }

    @Override // m2.h
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof tp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((tp) aVar);
    }

    public void setAdapter(tp tpVar) {
        this.t0 = tpVar;
        super.setAdapter((m2.a) tpVar);
        if (tpVar != null) {
            x(tpVar.j(), false);
        }
    }
}
