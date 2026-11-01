package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class vt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k20 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ vt(k20 k20Var, Exception exc, int i10) {
        this.a = i10;
        this.b = k20Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, this.c.getMessage());
                break;
            default:
                this.b.a(null, this.c.getMessage());
                break;
        }
    }
}
