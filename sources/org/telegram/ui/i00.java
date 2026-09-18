package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ i00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h10.V(this.b);
                break;
            default:
                h10.W(this.b);
                break;
        }
    }
}
