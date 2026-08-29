package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;

    public /* synthetic */ zg(ni niVar, int i10) {
        this.a = i10;
        this.b = niVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                ni niVar = this.b;
                au auVar = niVar.Y ? niVar.L0 : niVar.A0;
                niVar.M1(auVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(auVar.getText().toString().trim()));
                break;
            case 1:
                ni niVar2 = this.b;
                ff ffVar = niVar2.d0;
                long k9 = ffVar != null ? ffVar.k() : 0L;
                yh yhVar = niVar2.E0;
                niVar2.J0 = k9;
                yhVar.setEffect(k9);
                fi fiVar = niVar2.u0;
                if (fiVar == niVar2.f0 || fiVar == niVar2.m0) {
                    G1 = niVar2.G1(0, false, 0, niVar2.s1(), k9);
                } else {
                    if (!fiVar.H(0, false, 0, niVar2.s1(), k9)) {
                        niVar2.dismiss();
                    }
                    G1 = false;
                }
                ff ffVar2 = niVar2.d0;
                if (ffVar2 != null) {
                    ffVar2.h(!G1);
                    niVar2.d0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                ni.w(this.b);
                break;
        }
    }
}
