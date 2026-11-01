package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements vs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.a) {
            case 0:
                k2.t0 t0Var = (k2.t0) this.b;
                if (i10 == 25) {
                    t0Var.d(false);
                    break;
                }
                break;
            default:
                i00 i00Var = (i00) this.b;
                if (i10 == 253) {
                    i0.g3(new ns(i00Var, 16));
                    break;
                }
                break;
        }
    }
}
