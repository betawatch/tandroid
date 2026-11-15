package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
