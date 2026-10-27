package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                nd.Y(this.b, view);
                break;
            case 1:
                nd ndVar = this.b;
                ndVar.w.n(ndVar.y != null, new cd(ndVar, 2), new u5(ndVar, 2), 0);
                ndVar.K.M(0);
                ndVar.K.P(43);
                ndVar.n.d();
                break;
            case 2:
                nd ndVar2 = this.b;
                if (!ndVar2.k0) {
                    ndVar2.h0();
                    break;
                } else if (ndVar2.b0) {
                    ndVar2.b0 = false;
                    ndVar2.j0();
                    break;
                }
                break;
            default:
                nd ndVar3 = this.b;
                if (!ndVar3.b0) {
                    ndVar3.b0 = true;
                    ndVar3.j0();
                    break;
                }
                break;
        }
    }
}
