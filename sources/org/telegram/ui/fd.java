package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
