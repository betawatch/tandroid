package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class wp extends z4.g {
    public vp w0;

    public wp(Context context) {
        super(context);
        b(new up((ph0) this));
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
