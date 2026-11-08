package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy b;

    public /* synthetic */ cv(hy hyVar, int i7) {
        this.a = i7;
        this.b = hyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        hy hyVar = this.b;
        switch (i7) {
            case 0:
                hyVar.X(false);
                hyVar.D();
                break;
            case 1:
                qw qwVar = hyVar.R;
                if (qwVar != null) {
                    qwVar.F(true);
                    break;
                }
                break;
            case 2:
                ix ixVar = hyVar.t1;
                if (ixVar != null) {
                    ixVar.t(hyVar.R.h);
                    break;
                }
                break;
            case 3:
                ix ixVar2 = hyVar.t1;
                if (ixVar2 != null) {
                    ixVar2.q();
                    break;
                }
                break;
            case 4:
                hyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.p10.i(hyVar.c1).e());
                hyVar.Y1.presentFragment(new fw(bundle));
                break;
            default:
                ArrayList<uw> emojipacks = hyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = hyVar.R.s;
                        char[] cArr = org.telegram.messenger.j6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        hyVar.P.C0();
                        hyVar.U(i11);
                        hyVar.G(i11, org.telegram.messenger.g0.L(-9.0f));
                        hyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
