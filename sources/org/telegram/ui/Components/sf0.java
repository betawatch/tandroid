package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;

    public /* synthetic */ sf0(xf0 xf0Var, int i10) {
        this.a = i10;
        this.b = xf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
