package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ji.a b;
    public final /* synthetic */ q80 c;

    public /* synthetic */ m80(ji.a aVar, q80 q80Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = q80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c, false);
                break;
            default:
                this.b.m(this.c, false);
                break;
        }
    }
}
