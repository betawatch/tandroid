package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh0 b;

    public /* synthetic */ dh0(gh0 gh0Var, int i10) {
        this.a = i10;
        this.b = gh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
