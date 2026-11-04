package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;

    public /* synthetic */ eg0(kg0 kg0Var, int i3) {
        this.a = i3;
        this.b = kg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.g1(true, false);
                break;
            default:
                this.b.g1(true, false);
                break;
        }
    }
}
