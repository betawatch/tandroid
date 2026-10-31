package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class np extends z4.g {
    public mp w0;

    public np(Context context) {
        super(context);
        b(new lp((ug0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof mp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((mp) aVar);
    }

    public void setAdapter(mp mpVar) {
        this.w0 = mpVar;
        super.setAdapter((z4.a) mpVar);
        if (mpVar != null) {
            x(mpVar.j(), false);
        }
    }
}
