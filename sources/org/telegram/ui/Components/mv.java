package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ mv(qy qyVar, int i7) {
        this.a = i7;
        this.b = qyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qy qyVar = this.b;
        switch (i7) {
            case 0:
                qyVar.Y(false);
                qyVar.D();
                break;
            case 1:
                ax axVar = qyVar.S;
                if (axVar != null) {
                    axVar.F(true);
                    break;
                }
                break;
            case 2:
                qx qxVar = qyVar.u1;
                if (qxVar != null) {
                    qxVar.t(qyVar.S.h);
                    break;
                }
                break;
            case 3:
                qx qxVar2 = qyVar.u1;
                if (qxVar2 != null) {
                    qxVar2.q();
                    break;
                }
                break;
            case 4:
                qyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.i10.i(qyVar.d1).e());
                qyVar.Z1.presentFragment(new pw(bundle));
                break;
            default:
                ArrayList<ex> emojipacks = qyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = qyVar.S.s;
                        char[] cArr = org.telegram.messenger.k6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        qyVar.Q.C0();
                        qyVar.V(i11);
                        qyVar.F(i11, org.telegram.messenger.g0.L(-9.0f));
                        qyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
