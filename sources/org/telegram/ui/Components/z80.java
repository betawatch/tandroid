package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a90 b;
    public final /* synthetic */ e90 c;

    public /* synthetic */ z80(a90 a90Var, e90 e90Var, int i10) {
        this.a = i10;
        this.b = a90Var;
        this.c = e90Var;
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
