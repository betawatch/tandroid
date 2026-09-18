package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ j7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8.n(this.b);
                break;
            default:
                h8.G(this.b);
                break;
        }
    }
}
