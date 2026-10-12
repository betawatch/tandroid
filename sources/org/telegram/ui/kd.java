package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;

    public /* synthetic */ kd(sd sdVar, int i10) {
        this.a = i10;
        this.b = sdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sd.X(this.b, view);
                break;
            case 1:
                sd sdVar = this.b;
                sdVar.v.n(sdVar.x != null, new jd(sdVar, 1), new v5(sdVar, 2), 0);
                sdVar.J.M(0);
                sdVar.J.P(43);
                sdVar.h.d();
                break;
            case 2:
                sd sdVar2 = this.b;
                if (!sdVar2.j0) {
                    sdVar2.f0();
                    break;
                } else if (sdVar2.a0) {
                    sdVar2.a0 = false;
                    sdVar2.h0();
                    break;
                }
                break;
            default:
                sd sdVar3 = this.b;
                if (!sdVar3.a0) {
                    sdVar3.a0 = true;
                    sdVar3.h0();
                    break;
                }
                break;
        }
    }
}
