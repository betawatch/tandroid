package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class uo implements vs {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ kp e;
    public final /* synthetic */ wp f;

    public uo(wp wpVar, int i10, int i11, int i12, long j10, kp kpVar) {
        this.f = wpVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = j10;
        this.e = kpVar;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.I;
        kp kpVar = this.e;
        int i13 = this.a;
        wp wpVar = this.f;
        int i14 = at.H;
        if (i10 != i14 || ((Integer) objArr[0]).intValue() != i13) {
            if (i10 == i12 && ((Integer) objArr[0]).intValue() == i13) {
                wpVar.getNotificationCenter().n(this, i14);
                wpVar.getNotificationCenter().n(this, i12);
                if (kpVar != null) {
                    kpVar.a();
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
            wpVar.getNotificationCenter().n(this, i14);
            wpVar.getNotificationCenter().n(this, i12);
            if (kpVar != null) {
                kpVar.g(booleanValue);
                return;
            }
            return;
        }
        int i16 = this.c;
        if (i16 != 0) {
            wpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            wpVar.X2(this.d, 0L, false, i15, i16, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
