package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n2(s2 s2Var, int i10, int i11) {
        this.a = i11;
        this.b = s2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new n2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new n2(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
