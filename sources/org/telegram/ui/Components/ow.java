package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ow(Object obj, float f10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pw pwVar = (pw) this.d;
                float f10 = this.b;
                int i7 = this.c;
                gy gyVar = pwVar.F;
                try {
                    mi.m mVar = new mi.m(gyVar.P.getContext(), 0, f10);
                    mVar.a = i7;
                    gyVar.Q.w0(mVar);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    mi.m mVar2 = new mi.m(q11Var.h0.getContext(), 0, f11);
                    mVar2.a = i10;
                    q11Var.r0.w0(mVar2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
