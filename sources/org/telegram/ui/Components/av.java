package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class av implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ av(ey eyVar, int i3) {
        this.a = i3;
        this.b = eyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ey eyVar = this.b;
        switch (i3) {
            case 0:
                eyVar.X(false);
                eyVar.D();
                break;
            case 1:
                ow owVar = eyVar.S;
                if (owVar != null) {
                    owVar.F(true);
                    break;
                }
                break;
            case 2:
                fx fxVar = eyVar.u1;
                if (fxVar != null) {
                    fxVar.t(eyVar.S.h);
                    break;
                }
                break;
            case 3:
                fx fxVar2 = eyVar.u1;
                if (fxVar2 != null) {
                    fxVar2.q();
                    break;
                }
                break;
            case 4:
                eyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.h10.i(eyVar.d1).e());
                eyVar.Z1.presentFragment(new dw(bundle));
                break;
            default:
                ArrayList<sw> emojipacks = eyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = eyVar.S.s;
                        char[] cArr = org.telegram.messenger.j6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        eyVar.Q.C0();
                        eyVar.U(i11);
                        eyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        eyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
