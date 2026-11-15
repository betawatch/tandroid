package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly b;

    public /* synthetic */ hv(ly lyVar, int i7) {
        this.a = i7;
        this.b = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ly lyVar = this.b;
        switch (i7) {
            case 0:
                lyVar.Y(false);
                lyVar.D();
                break;
            case 1:
                vw vwVar = lyVar.S;
                if (vwVar != null) {
                    vwVar.F(true);
                    break;
                }
                break;
            case 2:
                mx mxVar = lyVar.u1;
                if (mxVar != null) {
                    mxVar.t(lyVar.S.h);
                    break;
                }
                break;
            case 3:
                mx mxVar2 = lyVar.u1;
                if (mxVar2 != null) {
                    mxVar2.q();
                    break;
                }
                break;
            case 4:
                lyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.m10.i(lyVar.d1).e());
                lyVar.Z1.presentFragment(new kw(bundle));
                break;
            default:
                ArrayList<zw> emojipacks = lyVar.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        SparseIntArray sparseIntArray = lyVar.S.s;
                        char[] cArr = org.telegram.messenger.k6.a;
                        int i11 = sparseIntArray.get(i10 + 8);
                        lyVar.Q.C0();
                        lyVar.V(i11);
                        lyVar.H(i11, org.telegram.messenger.g0.L(-9.0f));
                        lyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
