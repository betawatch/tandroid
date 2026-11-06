package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;

    public /* synthetic */ qg(di diVar, int i7) {
        this.a = i7;
        this.b = diVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean u12;
        vh vhVar;
        bm bmVar;
        switch (this.a) {
            case 0:
                di diVar = this.b;
                kt ktVar = diVar.T1 ? diVar.J2 : diVar.y2;
                diVar.B1(ktVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ktVar.getText().toString().trim()));
                break;
            case 1:
                di diVar2 = this.b;
                diVar2.z0 = null;
                diVar2.A0 = 0;
                diVar2.K();
                break;
            case 2:
                di diVar3 = this.b;
                ue ueVar = diVar3.Y1;
                long j3 = ueVar != null ? ueVar.j() : 0L;
                lh lhVar = diVar3.C2;
                diVar3.H2 = j3;
                lhVar.setEffect(j3);
                vh vhVar2 = diVar3.s2;
                if (vhVar2 == diVar3.a2 || vhVar2 == diVar3.h2) {
                    u12 = diVar3.u1(false, 0, 0, j3, diVar3.f1());
                } else {
                    if (!vhVar2.L(false, 0, 0, j3, diVar3.f1())) {
                        diVar3.dismiss();
                    }
                    u12 = false;
                }
                ue ueVar2 = diVar3.Y1;
                if (ueVar2 != null) {
                    ueVar2.g(!u12);
                    diVar3.Y1 = null;
                    break;
                }
                break;
            case 3:
                di diVar4 = this.b;
                diVar4.a(true);
                org.telegram.ui.ActionBar.f2 f2Var = diVar4.W1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.t1();
                break;
            default:
                di diVar5 = this.b;
                diVar5.n3 = null;
                vh vhVar3 = diVar5.s2;
                if (vhVar3 != diVar5.a2 && (vhVar = diVar5.t2) != (bmVar = diVar5.h2) && vhVar3 != vhVar && vhVar3 != bmVar) {
                    diVar5.b.removeView(vhVar3);
                }
                diVar5.s2.setVisibility(8);
                diVar5.s2.t();
                diVar5.t2.I();
                diVar5.s2 = diVar5.t2;
                diVar5.t2 = null;
                int[] iArr = diVar5.V3;
                iArr[0] = iArr[1];
                diVar5.v1(diVar5.T1, false);
                diVar5.L1();
                break;
        }
    }
}
