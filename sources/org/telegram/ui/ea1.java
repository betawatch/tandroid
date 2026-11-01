package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja1 b;

    public /* synthetic */ ea1(ja1 ja1Var, int i10) {
        this.a = i10;
        this.b = ja1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ja1 ja1Var = this.b;
                ja1Var.getClass();
                new kg.i1((org.telegram.ui.ActionBar.k2) ja1Var, 11, false).show();
                break;
            default:
                ja1 ja1Var2 = this.b;
                ja1Var2.e.requestFocus();
                org.telegram.messenger.i0.J3(ja1Var2.e);
                break;
        }
    }
}
