package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
