package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class wp extends z4.g {
    public vp w0;

    public wp(Context context) {
        super(context);
        b(new up((oh0) this));
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
