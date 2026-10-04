package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public abstract class zp extends z4.g {
    public yp w0;

    public zp(Context context) {
        super(context);
        b(new xp((bi0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof yp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((yp) aVar);
    }

    public void setAdapter(yp ypVar) {
        this.w0 = ypVar;
        super.setAdapter((z4.a) ypVar);
        if (ypVar != null) {
            x(ypVar.j(), false);
        }
    }
}
