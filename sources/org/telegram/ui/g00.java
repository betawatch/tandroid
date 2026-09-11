package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                f10.V(this.b);
                break;
            default:
                f10.W(this.b);
                break;
        }
    }
}
