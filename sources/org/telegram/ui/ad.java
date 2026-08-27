package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;

    public /* synthetic */ ad(id idVar, int i10) {
        this.a = i10;
        this.b = idVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                id.X(this.b, view);
                break;
            case 1:
                id idVar = this.b;
                idVar.v.o(idVar.x != null, new zc(idVar, 1), new s5(idVar, 2), 0);
                idVar.F.K(0);
                idVar.F.N(43);
                idVar.h.d();
                break;
            case 2:
                id idVar2 = this.b;
                if (!idVar2.f0) {
                    idVar2.f0();
                    break;
                } else if (idVar2.W) {
                    idVar2.W = false;
                    idVar2.h0();
                    break;
                }
                break;
            default:
                id idVar3 = this.b;
                if (!idVar3.W) {
                    idVar3.W = true;
                    idVar3.h0();
                    break;
                }
                break;
        }
    }
}
