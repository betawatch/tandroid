package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;

    public /* synthetic */ a00(b00 b00Var, int i10) {
        this.a = i10;
        this.b = b00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                b00 b00Var = this.b;
                b00Var.b(b00Var.D);
                break;
        }
    }
}
