package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public abstract class yp extends z4.g {
    public xp w0;

    public yp(Context context) {
        super(context);
        b(new wp((bi0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof xp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((xp) aVar);
    }

    public void setAdapter(xp xpVar) {
        this.w0 = xpVar;
        super.setAdapter((z4.a) xpVar);
        if (xpVar != null) {
            x(xpVar.j(), false);
        }
    }
}
