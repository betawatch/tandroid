package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class kp extends m2.g {
    public jp s0;

    public kp(Context context) {
        super(context);
        b(new ip((ch0) this));
    }

    @Override // m2.g
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof jp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((jp) aVar);
    }

    public void setAdapter(jp jpVar) {
        this.s0 = jpVar;
        super.setAdapter((m2.a) jpVar);
        if (jpVar != null) {
            x(jpVar.j(), false);
        }
    }
}
