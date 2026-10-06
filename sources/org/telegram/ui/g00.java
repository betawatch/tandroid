package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;

    public /* synthetic */ g00(f10 f10Var, int i10) {
        this.a = i10;
        this.b = f10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f10.T(this.b);
                break;
            default:
                f10.U(this.b);
                break;
        }
    }
}
