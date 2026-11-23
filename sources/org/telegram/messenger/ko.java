package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class ko implements fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ap e;
    public final /* synthetic */ mp f;

    public ko(mp mpVar, int i7, int i10, int i11, long j3, ap apVar) {
        this.f = mpVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = j3;
        this.e = apVar;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.I;
        ap apVar = this.e;
        int i12 = this.a;
        mp mpVar = this.f;
        int i13 = ks.H;
        if (i7 != i13 || ((Integer) objArr[0]).intValue() != i12) {
            if (i7 == i11 && ((Integer) objArr[0]).intValue() == i12) {
                mpVar.getNotificationCenter().n(this, i13);
                mpVar.getNotificationCenter().n(this, i11);
                if (apVar != null) {
                    apVar.a();
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
        int i14 = this.b;
        if (intValue >= i14 / 2 || booleanValue2 || !booleanValue) {
            mpVar.getNotificationCenter().n(this, i13);
            mpVar.getNotificationCenter().n(this, i11);
            if (apVar != null) {
                apVar.e(booleanValue);
                return;
            }
            return;
        }
        int i15 = this.c;
        if (i15 != 0) {
            mpVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            mpVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
