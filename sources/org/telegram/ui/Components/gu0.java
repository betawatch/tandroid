package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gu0 extends ma {
    public vr Q1;

    public gu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.w1 = true;
        this.v1 = true;
        Y0();
        tj0 tj0Var = this.l1;
        int i3 = this.u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        this.l1.j(new ji(this, 19));
        this.l1.setOnItemClickListener(new k(this, 14));
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        vr vrVar = new vr(tj0Var, getContext(), this.a, 0, true, this.J0);
        this.Q1 = vrVar;
        vrVar.r = false;
        return vrVar;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131745831, null);
    }
}
