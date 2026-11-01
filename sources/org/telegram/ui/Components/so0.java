package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class so0 extends th.b {
    public final /* synthetic */ int g;

    public /* synthetic */ so0(int i10) {
        this.g = i10;
    }

    @Override // th.b
    public void k() {
        switch (this.g) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.t6.a7;
                int i11 = org.telegram.ui.ActionBar.t6.h5;
                int h = h(i11);
                SparseIntArray sparseIntArray = this.b;
                sparseIntArray.put(i10, h);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.d7, -15264235);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.Le, org.telegram.ui.ActionBar.t6.r1(0.45f, -1));
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.i5, 352321535);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.wf, h(i11));
                break;
            case 2:
                this.b.put(org.telegram.ui.ActionBar.t6.d7, 352321535);
                break;
            case 3:
                this.b.append(org.telegram.ui.ActionBar.t6.h5, -14671840);
                break;
        }
    }

    public so0() {
        this.g = 1;
        this.b.put(org.telegram.ui.ActionBar.t6.d6, -14537933);
        this.b.put(org.telegram.ui.ActionBar.t6.h5, -14537933);
        this.b.put(org.telegram.ui.ActionBar.t6.a7, -13616313);
        this.b.put(org.telegram.ui.ActionBar.t6.e7, -14142917);
        this.b.put(org.telegram.ui.ActionBar.t6.f7, -8090220);
        this.b.put(org.telegram.ui.ActionBar.t6.Qi, -14142917);
        this.b.put(org.telegram.ui.ActionBar.t6.G8, -13616313);
        this.b.put(org.telegram.ui.ActionBar.t6.H8, -14733761);
        this.b.put(org.telegram.ui.ActionBar.t6.F8, -1);
        this.b.put(org.telegram.ui.ActionBar.t6.E8, -1);
        this.b.put(org.telegram.ui.ActionBar.t6.tj, -231982259);
        this.b.put(org.telegram.ui.ActionBar.t6.v6, -11683585);
        this.b.put(org.telegram.ui.ActionBar.t6.u6, -10637330);
        this.b.put(org.telegram.ui.ActionBar.t6.W6, -12692893);
        this.b.put(org.telegram.ui.ActionBar.t6.i7, -15033089);
    }
}
