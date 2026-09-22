package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ k7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i8.n(this.b);
                break;
            default:
                i8.F(this.b);
                break;
        }
    }
}
