package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class wp extends m2.h {
    public vp t0;

    public wp(Context context) {
        super(context);
        b(new up((xh0) this));
    }

    @Override // m2.h
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof vp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((vp) aVar);
    }

    public void setAdapter(vp vpVar) {
        this.t0 = vpVar;
        super.setAdapter((m2.a) vpVar);
        if (vpVar != null) {
            x(vpVar.j(), false);
        }
    }
}
