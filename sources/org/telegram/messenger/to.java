package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class to implements us {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ jp e;
    public final /* synthetic */ vp f;

    public to(vp vpVar, int i10, int i11, int i12, long j10, jp jpVar) {
        this.f = vpVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = j10;
        this.e = jpVar;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.I;
        jp jpVar = this.e;
        int i13 = this.a;
        vp vpVar = this.f;
        int i14 = zs.H;
        if (i10 != i14 || ((Integer) objArr[0]).intValue() != i13) {
            if (i10 == i12 && ((Integer) objArr[0]).intValue() == i13) {
                vpVar.getNotificationCenter().n(this, i14);
                vpVar.getNotificationCenter().n(this, i12);
                if (jpVar != null) {
                    jpVar.a();
                    return;
                }
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int intValue2 = ((Integer) objArr[4]).intValue();
        int i15 = this.b;
        if (intValue >= i15 / 2 || booleanValue2 || !booleanValue) {
            vpVar.getNotificationCenter().n(this, i14);
            vpVar.getNotificationCenter().n(this, i12);
            if (jpVar != null) {
                jpVar.g(booleanValue);
                return;
            }
            return;
        }
        int i16 = this.c;
        if (i16 != 0) {
            vpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            vpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
