package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n01 b;
    public final /* synthetic */ m01 c;

    public /* synthetic */ l01(n01 n01Var, m01 m01Var, int i10) {
        this.a = i10;
        this.b = n01Var;
        this.c = m01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
