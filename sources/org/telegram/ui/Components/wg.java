package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    public /* synthetic */ wg(ki kiVar, int i9) {
        this.a = i9;
        this.b = kiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                ki kiVar = this.b;
                ut utVar = kiVar.Y ? kiVar.L0 : kiVar.A0;
                kiVar.M1(utVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(utVar.getText().toString().trim()));
                break;
            case 1:
                ki kiVar2 = this.b;
                cf cfVar = kiVar2.d0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                vh vhVar = kiVar2.E0;
                kiVar2.J0 = k10;
                vhVar.setEffect(k10);
                ci ciVar = kiVar2.u0;
                if (ciVar == kiVar2.f0 || ciVar == kiVar2.m0) {
                    G1 = kiVar2.G1(0, false, 0, kiVar2.s1(), k10);
                } else {
                    if (!ciVar.H(0, false, 0, kiVar2.s1(), k10)) {
                        kiVar2.dismiss();
                    }
                    G1 = false;
                }
                cf cfVar2 = kiVar2.d0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    kiVar2.d0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                ki.w(this.b);
                break;
        }
    }
}
