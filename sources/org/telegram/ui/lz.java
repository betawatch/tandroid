package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ lz(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h00.a0(this.b);
                break;
            default:
                h00.b0(this.b);
                break;
        }
    }
}
