package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
