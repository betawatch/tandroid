package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ d00(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b10.V(this.b);
                break;
            default:
                b10.W(this.b);
                break;
        }
    }
}
