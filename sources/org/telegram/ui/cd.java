package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd b;

    public /* synthetic */ cd(kd kdVar, int i10) {
        this.a = i10;
        this.b = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kd.b0(this.b, view);
                break;
            case 1:
                kd kdVar = this.b;
                kdVar.x.n(kdVar.D != null, new ad(kdVar, 2), new q5(kdVar, 2), 0);
                kdVar.K.M(0);
                kdVar.K.P(43);
                kdVar.n.d();
                break;
            case 2:
                kd kdVar2 = this.b;
                if (!kdVar2.k0) {
                    kdVar2.k0();
                    break;
                } else if (kdVar2.b0) {
                    kdVar2.b0 = false;
                    kdVar2.m0();
                    break;
                }
                break;
            default:
                kd kdVar3 = this.b;
                if (!kdVar3.b0) {
                    kdVar3.b0 = true;
                    kdVar3.m0();
                    break;
                }
                break;
        }
    }
}
