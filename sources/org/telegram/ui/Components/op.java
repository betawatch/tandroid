package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class op extends c5.l {
    public np x0;

    public op(Context context) {
        super(context);
        b(new mp((vf0) this));
    }

    @Override // c5.l
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (!(aVar instanceof np)) {
            throw new IllegalArgumentException();
        }
        setAdapter((np) aVar);
    }

    public void setAdapter(np npVar) {
        this.x0 = npVar;
        super.setAdapter((c5.a) npVar);
        if (npVar != null) {
            x(npVar.j(), false);
        }
    }
}
