package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class vp extends z4.g {
    public up w0;

    public vp(Context context) {
        super(context);
        b(new tp((oh0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof up)) {
            throw new IllegalArgumentException();
        }
        setAdapter((up) aVar);
    }

    public void setAdapter(up upVar) {
        this.w0 = upVar;
        super.setAdapter((z4.a) upVar);
        if (upVar != null) {
            x(upVar.j(), false);
        }
    }
}
