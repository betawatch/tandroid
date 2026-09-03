package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                nd.X(this.b, view);
                break;
            case 1:
                nd ndVar = this.b;
                ndVar.v.o(ndVar.x != null, new ed(ndVar, 1), new v5(ndVar, 2), 0);
                ndVar.G.K(0);
                ndVar.G.N(43);
                ndVar.h.d();
                break;
            case 2:
                nd ndVar2 = this.b;
                if (!ndVar2.g0) {
                    ndVar2.f0();
                    break;
                } else if (ndVar2.X) {
                    ndVar2.X = false;
                    ndVar2.h0();
                    break;
                }
                break;
            default:
                nd ndVar3 = this.b;
                if (!ndVar3.X) {
                    ndVar3.X = true;
                    ndVar3.h0();
                    break;
                }
                break;
        }
    }
}
