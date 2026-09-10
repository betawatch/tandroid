package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;
    public final /* synthetic */ n90 c;

    public /* synthetic */ i90(j90 j90Var, n90 n90Var, int i10) {
        this.a = i10;
        this.b = j90Var;
        this.c = n90Var;
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
