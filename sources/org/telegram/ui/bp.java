package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;
    public final /* synthetic */ long c;

    public /* synthetic */ bp(kp kpVar, long j3, int i7) {
        this.a = i7;
        this.b = kpVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                kp kpVar = this.b;
                kpVar.n = j3;
                kpVar.r = true;
                kpVar.s0();
                break;
            default:
                kp.e0(this.b, this.c);
                break;
        }
    }
}
