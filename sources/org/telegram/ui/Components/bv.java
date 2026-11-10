package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ bv(gy gyVar, int i7) {
        this.a = i7;
        this.b = gyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        gy gyVar = this.b;
        switch (i7) {
            case 0:
                gyVar.X(false);
                gyVar.D();
                break;
            case 1:
                pw pwVar = gyVar.R;
                if (pwVar != null) {
                    pwVar.F(true);
                    break;
                }
                break;
            case 2:
                hx hxVar = gyVar.t1;
                if (hxVar != null) {
                    hxVar.t(gyVar.R.h);
                    break;
                }
                break;
            case 3:
                hx hxVar2 = gyVar.t1;
                if (hxVar2 != null) {
                    hxVar2.q();
                    break;
                }
                break;
            case 4:
                gyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.p10.i(gyVar.c1).e());
                gyVar.Y1.presentFragment(new ew(bundle));
                break;
            default:
                ArrayList<tw> emojipacks = gyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = gyVar.R.s;
                        char[] cArr = org.telegram.messenger.j6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        gyVar.P.C0();
                        gyVar.U(i11);
                        gyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        gyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
