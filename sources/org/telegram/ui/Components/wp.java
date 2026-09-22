package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class wp extends z4.g {
    public vp w0;

    public wp(Context context) {
        super(context);
        b(new up((bi0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof vp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((vp) aVar);
    }

    public void setAdapter(vp vpVar) {
        this.w0 = vpVar;
        super.setAdapter((z4.a) vpVar);
        if (vpVar != null) {
            x(vpVar.j(), false);
        }
    }
}
