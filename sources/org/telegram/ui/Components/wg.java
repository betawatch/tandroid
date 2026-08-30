package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    public /* synthetic */ wg(li liVar, int i10) {
        this.a = i10;
        this.b = liVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                li liVar = this.b;
                du duVar = liVar.Z ? liVar.M0 : liVar.B0;
                liVar.M1(duVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(duVar.getText().toString().trim()));
                break;
            case 1:
                li liVar2 = this.b;
                cf cfVar = liVar2.e0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                vh vhVar = liVar2.F0;
                liVar2.K0 = k10;
                vhVar.setEffect(k10);
                di diVar = liVar2.v0;
                if (diVar == liVar2.g0 || diVar == liVar2.n0) {
                    G1 = liVar2.G1(0, false, 0, liVar2.s1(), k10);
                } else {
                    if (!diVar.H(0, false, 0, liVar2.s1(), k10)) {
                        liVar2.dismiss();
                    }
                    G1 = false;
                }
                cf cfVar2 = liVar2.e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    liVar2.e0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                li.w(this.b);
                break;
        }
    }
}
