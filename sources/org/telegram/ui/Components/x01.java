package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z01 b;
    public final /* synthetic */ y01 c;

    public /* synthetic */ x01(z01 z01Var, y01 y01Var, int i10) {
        this.a = i10;
        this.b = z01Var;
        this.c = y01Var;
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
