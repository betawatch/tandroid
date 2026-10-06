package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
