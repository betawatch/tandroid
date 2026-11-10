package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iu0 extends ma {
    public ur S1;

    public iu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.y1 = true;
        this.x1 = true;
        Y0();
        pj0 pj0Var = this.n1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.n1.j(new ti(this, 17));
        this.n1.setOnItemClickListener(new j(this, 14));
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        ur urVar = new ur(pj0Var, getContext(), this.a, 0, true, this.I0);
        this.S1 = urVar;
        urVar.r = false;
        return urVar;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745821, null);
    }
}
