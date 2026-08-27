package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi b;

    public /* synthetic */ sg(gi giVar, int i10) {
        this.a = i10;
        this.b = giVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                gi giVar = this.b;
                tt ttVar = giVar.Y ? giVar.L0 : giVar.A0;
                giVar.M1(ttVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ttVar.getText().toString().trim()));
                break;
            case 1:
                gi giVar2 = this.b;
                ye yeVar = giVar2.d0;
                long k10 = yeVar != null ? yeVar.k() : 0L;
                rh rhVar = giVar2.E0;
                giVar2.J0 = k10;
                rhVar.setEffect(k10);
                yh yhVar = giVar2.u0;
                if (yhVar == giVar2.f0 || yhVar == giVar2.m0) {
                    G1 = giVar2.G1(0, false, 0, giVar2.s1(), k10);
                } else {
                    if (!yhVar.I(0, false, 0, giVar2.s1(), k10)) {
                        giVar2.dismiss();
                    }
                    G1 = false;
                }
                ye yeVar2 = giVar2.d0;
                if (yeVar2 != null) {
                    yeVar2.h(!G1);
                    giVar2.d0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                gi.x(this.b);
                break;
        }
    }
}
