package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                di.h4 h4Var = (di.h4) this.b;
                if (i7 == 25) {
                    h4Var.d(false);
                    break;
                }
                break;
            default:
                wz wzVar = (wz) this.b;
                if (i7 == 253) {
                    g0.h3(new ds(wzVar, 15));
                    break;
                }
                break;
        }
    }
}
