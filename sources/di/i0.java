package di;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i0 extends b {
    public final /* synthetic */ int g;

    public /* synthetic */ i0(int i7) {
        this.g = i7;
    }

    @Override // di.b
    public void k() {
        switch (this.g) {
            case 0:
                this.b.put(org.telegram.ui.ActionBar.m6.d7, 352321535);
                break;
            case 1:
                this.b.append(org.telegram.ui.ActionBar.m6.h5, -14671840);
                break;
            case 2:
                int i7 = org.telegram.ui.ActionBar.m6.a7;
                int i10 = org.telegram.ui.ActionBar.m6.h5;
                int h = h(i10);
                SparseIntArray sparseIntArray = this.b;
                sparseIntArray.put(i7, h);
                sparseIntArray.put(org.telegram.ui.ActionBar.m6.d7, -15264235);
                sparseIntArray.put(org.telegram.ui.ActionBar.m6.Le, org.telegram.ui.ActionBar.m6.r1(0.45f, -1));
                sparseIntArray.put(org.telegram.ui.ActionBar.m6.i5, 352321535);
                sparseIntArray.put(org.telegram.ui.ActionBar.m6.wf, h(i10));
                break;
        }
    }

    public i0() {
        this.g = 3;
        this.b.put(org.telegram.ui.ActionBar.m6.d6, -14537933);
        this.b.put(org.telegram.ui.ActionBar.m6.h5, -14537933);
        this.b.put(org.telegram.ui.ActionBar.m6.a7, -13616313);
        this.b.put(org.telegram.ui.ActionBar.m6.e7, -14142917);
        this.b.put(org.telegram.ui.ActionBar.m6.f7, -8090220);
        this.b.put(org.telegram.ui.ActionBar.m6.Qi, -14142917);
        this.b.put(org.telegram.ui.ActionBar.m6.G8, -13616313);
        this.b.put(org.telegram.ui.ActionBar.m6.H8, -14733761);
        this.b.put(org.telegram.ui.ActionBar.m6.F8, -1);
        this.b.put(org.telegram.ui.ActionBar.m6.E8, -1);
        this.b.put(org.telegram.ui.ActionBar.m6.tj, -231982259);
        this.b.put(org.telegram.ui.ActionBar.m6.v6, -11683585);
        this.b.put(org.telegram.ui.ActionBar.m6.u6, -10637330);
        this.b.put(org.telegram.ui.ActionBar.m6.W6, -12692893);
        this.b.put(org.telegram.ui.ActionBar.m6.i7, -15033089);
    }
}
