package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements is {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                fi.a4 a4Var = (fi.a4) this.b;
                if (i7 == 25) {
                    a4Var.d(false);
                    break;
                }
                break;
            default:
                uz uzVar = (uz) this.b;
                if (i7 == 253) {
                    g0.h3(new as(uzVar, 15));
                    break;
                }
                break;
        }
    }
}
