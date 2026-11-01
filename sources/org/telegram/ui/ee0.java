package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ee0(le0 le0Var, int i10, int i11) {
        this.a = i11;
        this.b = le0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new ee0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].C(1.0f);
                break;
        }
    }
}
