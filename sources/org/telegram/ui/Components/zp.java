package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
