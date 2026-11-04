package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class eo implements cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ vo e;
    public final /* synthetic */ hp f;

    public eo(hp hpVar, int i3, int i10, int i11, long j10, vo voVar) {
        this.f = hpVar;
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = j10;
        this.e = voVar;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.I;
        vo voVar = this.e;
        int i12 = this.a;
        hp hpVar = this.f;
        int i13 = hs.H;
        if (i3 != i13 || ((Integer) objArr[0]).intValue() != i12) {
            if (i3 == i11 && ((Integer) objArr[0]).intValue() == i12) {
                hpVar.getNotificationCenter().n(this, i13);
                hpVar.getNotificationCenter().n(this, i11);
                if (voVar != null) {
                    voVar.a();
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
            hpVar.getNotificationCenter().n(this, i13);
            hpVar.getNotificationCenter().n(this, i11);
            if (voVar != null) {
                voVar.j(booleanValue);
                return;
            }
            return;
        }
        int i15 = this.c;
        if (i15 != 0) {
            hpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            hpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
