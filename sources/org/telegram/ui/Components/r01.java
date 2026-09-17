package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u01 b;
    public final /* synthetic */ t01 c;

    public /* synthetic */ r01(u01 u01Var, t01 t01Var, int i10) {
        this.a = i10;
        this.b = u01Var;
        this.c = t01Var;
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
