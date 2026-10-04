package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ fd(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                nd.W(this.b, view);
                break;
            case 1:
                nd ndVar = this.b;
                ndVar.v.o(ndVar.x != null, new ed(ndVar, 1), new s5(ndVar, 2), 0);
                ndVar.J.M(0);
                ndVar.J.P(43);
                ndVar.h.d();
                break;
            case 2:
                nd ndVar2 = this.b;
                if (!ndVar2.j0) {
                    ndVar2.f0();
                    break;
                } else if (ndVar2.a0) {
                    ndVar2.a0 = false;
                    ndVar2.h0();
                    break;
                }
                break;
            default:
                nd ndVar3 = this.b;
                if (!ndVar3.a0) {
                    ndVar3.a0 = true;
                    ndVar3.h0();
                    break;
                }
                break;
        }
    }
}
