package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                kd.c0(this.b, view);
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
                    kdVar2.l0();
                    break;
                } else if (kdVar2.b0) {
                    kdVar2.b0 = false;
                    kdVar2.n0();
                    break;
                }
                break;
            default:
                kd kdVar3 = this.b;
                if (!kdVar3.b0) {
                    kdVar3.b0 = true;
                    kdVar3.n0();
                    break;
                }
                break;
        }
    }
}
