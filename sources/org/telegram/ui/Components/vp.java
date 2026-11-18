package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class vp extends c5.l {
    public up x0;

    public vp(Context context) {
        super(context);
        b(new tp((fg0) this));
    }

    @Override // c5.l
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (!(aVar instanceof up)) {
            throw new IllegalArgumentException();
        }
        setAdapter((up) aVar);
    }

    public void setAdapter(up upVar) {
        this.x0 = upVar;
        super.setAdapter((c5.a) upVar);
        if (upVar != null) {
            x(upVar.j(), false);
        }
    }
}
