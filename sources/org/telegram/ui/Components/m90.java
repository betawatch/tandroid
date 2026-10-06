package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n90 b;
    public final /* synthetic */ r90 c;

    public /* synthetic */ m90(n90 n90Var, r90 r90Var, int i10) {
        this.a = i10;
        this.b = n90Var;
        this.c = r90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
