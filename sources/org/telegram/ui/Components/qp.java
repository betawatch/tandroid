package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class qp extends m2.g {
    public pp s0;

    public qp(Context context) {
        super(context);
        b(new op((kh0) this));
    }

    @Override // m2.g
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof pp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((pp) aVar);
    }

    public void setAdapter(pp ppVar) {
        this.s0 = ppVar;
        super.setAdapter((m2.a) ppVar);
        if (ppVar != null) {
            x(ppVar.j(), false);
        }
    }
}
