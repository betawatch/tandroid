package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class mq extends z4.g {
    public lq w0;

    public mq(Context context) {
        super(context);
        b(new kq((ti0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof lq)) {
            throw new IllegalArgumentException();
        }
        setAdapter((lq) aVar);
    }

    public void setAdapter(lq lqVar) {
        this.w0 = lqVar;
        super.setAdapter((z4.a) lqVar);
        if (lqVar != null) {
            x(lqVar.j(), false);
        }
    }
}
