package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ mv(ry ryVar, int i7) {
        this.a = i7;
        this.b = ryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ry ryVar = this.b;
        switch (i7) {
            case 0:
                ryVar.Y(false);
                ryVar.E();
                break;
            case 1:
                bx bxVar = ryVar.S;
                if (bxVar != null) {
                    bxVar.F(true);
                    break;
                }
                break;
            case 2:
                rx rxVar = ryVar.u1;
                if (rxVar != null) {
                    rxVar.t(ryVar.S.h);
                    break;
                }
                break;
            case 3:
                rx rxVar2 = ryVar.u1;
                if (rxVar2 != null) {
                    rxVar2.q();
                    break;
                }
                break;
            case 4:
                ryVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.j10.i(ryVar.d1).e());
                ryVar.Z1.presentFragment(new qw(bundle));
                break;
            default:
                ArrayList<fx> emojipacks = ryVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = ryVar.S.s;
                        char[] cArr = org.telegram.messenger.k6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        ryVar.Q.C0();
                        ryVar.V(i11);
                        ryVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        ryVar.n(0, null);
                    }
                }
                break;
        }
    }
}
