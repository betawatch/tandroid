package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy b;

    public /* synthetic */ nv(vy vyVar, int i10) {
        this.a = i10;
        this.b = vyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vy vyVar = this.b;
        switch (i10) {
            case 0:
                vyVar.Y(false);
                vyVar.F();
                break;
            case 1:
                ex exVar = vyVar.R;
                if (exVar != null) {
                    exVar.F(true);
                    break;
                }
                break;
            case 2:
                vx vxVar = vyVar.t1;
                if (vxVar != null) {
                    vxVar.t(vyVar.R.h);
                    break;
                }
                break;
            case 3:
                vx vxVar2 = vyVar.t1;
                if (vxVar2 != null) {
                    vxVar2.q();
                    break;
                }
                break;
            case 4:
                vyVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", org.telegram.messenger.e20.i(vyVar.c1).e());
                vyVar.Y1.presentFragment(new tw(bundle));
                break;
            default:
                ArrayList<ix> emojipacks = vyVar.getEmojipacks();
                for (int i11 = 0; i11 < emojipacks.size(); i11++) {
                    if (emojipacks.get(i11).i) {
                        SparseIntArray sparseIntArray = vyVar.R.s;
                        char[] cArr = org.telegram.messenger.l6.a;
                        int i12 = sparseIntArray.get(i11 + 8);
                        vyVar.P.C0();
                        vyVar.V(i12);
                        vyVar.H(i12, org.telegram.messenger.i0.L(-9.0f));
                        vyVar.n(0, null);
                    }
                }
                break;
        }
    }
}
