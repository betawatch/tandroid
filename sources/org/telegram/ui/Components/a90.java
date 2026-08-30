package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b90 b;
    public final /* synthetic */ f90 c;

    public /* synthetic */ a90(b90 b90Var, f90 f90Var, int i10) {
        this.a = i10;
        this.b = b90Var;
        this.c = f90Var;
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
