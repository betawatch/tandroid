package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ pv(ty tyVar, int i7) {
        this.a = i7;
        this.b = tyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ty tyVar = this.b;
        switch (i7) {
            case 0:
                tyVar.Y(false);
                tyVar.E();
                break;
            case 1:
                dx dxVar = tyVar.S;
                if (dxVar != null) {
                    dxVar.F(true);
                    break;
                }
                break;
            case 2:
                tx txVar = tyVar.u1;
                if (txVar != null) {
                    txVar.t(tyVar.S.h);
                    break;
                }
                break;
            case 3:
                tx txVar2 = tyVar.u1;
                if (txVar2 != null) {
                    txVar2.q();
                    break;
                }
                break;
            case 4:
                tyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.k10.i(tyVar.d1).e());
                tyVar.Z1.presentFragment(new sw(bundle));
                break;
            default:
                ArrayList<hx> emojipacks = tyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = tyVar.S.s;
                        char[] cArr = org.telegram.messenger.k6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        tyVar.Q.C0();
                        tyVar.V(i11);
                        tyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        tyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
