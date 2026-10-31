package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements us {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.us
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
                h00 h00Var = (h00) this.b;
                if (i10 == 253) {
                    i0.g3(new ms(h00Var, 16));
                    break;
                }
                break;
        }
    }
}
