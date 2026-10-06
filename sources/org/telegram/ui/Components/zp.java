package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
