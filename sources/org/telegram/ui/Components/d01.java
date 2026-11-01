package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g01 b;
    public final /* synthetic */ f01 c;

    public /* synthetic */ d01(g01 g01Var, f01 f01Var, int i10) {
        this.a = i10;
        this.b = g01Var;
        this.c = f01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
