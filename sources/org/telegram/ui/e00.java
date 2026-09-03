package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;

    public /* synthetic */ e00(c10 c10Var, int i10) {
        this.a = i10;
        this.b = c10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c10.V(this.b);
                break;
            default:
                c10.W(this.b);
                break;
        }
    }
}
