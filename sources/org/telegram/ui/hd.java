package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd b;

    public /* synthetic */ hd(pd pdVar, int i10) {
        this.a = i10;
        this.b = pdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pd.X(this.b, view);
                break;
            case 1:
                pd pdVar = this.b;
                pdVar.v.o(pdVar.x != null, new gd(pdVar, 1), new x5(pdVar, 2), 0);
                pdVar.G.K(0);
                pdVar.G.N(43);
                pdVar.h.d();
                break;
            case 2:
                pd pdVar2 = this.b;
                if (!pdVar2.g0) {
                    pdVar2.f0();
                    break;
                } else if (pdVar2.X) {
                    pdVar2.X = false;
                    pdVar2.h0();
                    break;
                }
                break;
            default:
                pd pdVar3 = this.b;
                if (!pdVar3.X) {
                    pdVar3.X = true;
                    pdVar3.h0();
                    break;
                }
                break;
        }
    }
}
