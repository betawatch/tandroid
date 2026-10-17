package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;

    public /* synthetic */ gd(od odVar, int i10) {
        this.a = i10;
        this.b = odVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                od.X(this.b, view);
                break;
            case 1:
                od odVar = this.b;
                odVar.v.n(odVar.x != null, new fd(odVar, 1), new w5(odVar, 2), 0);
                odVar.J.M(0);
                odVar.J.P(43);
                odVar.h.d();
                break;
            case 2:
                od odVar2 = this.b;
                if (!odVar2.j0) {
                    odVar2.f0();
                    break;
                } else if (odVar2.a0) {
                    odVar2.a0 = false;
                    odVar2.h0();
                    break;
                }
                break;
            default:
                od odVar3 = this.b;
                if (!odVar3.a0) {
                    odVar3.a0 = true;
                    odVar3.h0();
                    break;
                }
                break;
        }
    }
}
