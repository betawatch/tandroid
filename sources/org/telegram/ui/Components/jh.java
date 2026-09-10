package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    public /* synthetic */ jh(yi yiVar, int i10) {
        this.a = i10;
        this.b = yiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                yi yiVar = this.b;
                nu nuVar = yiVar.c0 ? yiVar.P0 : yiVar.E0;
                yiVar.M1(nuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(nuVar.getText().toString().trim()));
                break;
            case 1:
                yi yiVar2 = this.b;
                of ofVar = yiVar2.h0;
                long k10 = ofVar != null ? ofVar.k() : 0L;
                ii iiVar = yiVar2.I0;
                yiVar2.N0 = k10;
                iiVar.setEffect(k10);
                qi qiVar = yiVar2.y0;
                if (qiVar == yiVar2.j0 || qiVar == yiVar2.q0) {
                    G1 = yiVar2.G1(0, false, 0, yiVar2.s1(), k10);
                } else {
                    if (!qiVar.I(0, false, 0, yiVar2.s1(), k10)) {
                        yiVar2.dismiss();
                    }
                    G1 = false;
                }
                of ofVar2 = yiVar2.h0;
                if (ofVar2 != null) {
                    ofVar2.h(!G1);
                    yiVar2.h0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                yi.w(this.b);
                break;
        }
    }
}
