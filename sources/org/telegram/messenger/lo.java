package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class lo implements gs {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ bp e;
    public final /* synthetic */ np f;

    public lo(np npVar, int i7, int i10, int i11, long j3, bp bpVar) {
        this.f = npVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = j3;
        this.e = bpVar;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.I;
        bp bpVar = this.e;
        int i12 = this.a;
        np npVar = this.f;
        int i13 = ls.H;
        if (i7 != i13 || ((Integer) objArr[0]).intValue() != i12) {
            if (i7 == i11 && ((Integer) objArr[0]).intValue() == i12) {
                npVar.getNotificationCenter().n(this, i13);
                npVar.getNotificationCenter().n(this, i11);
                if (bpVar != null) {
                    bpVar.a();
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
            npVar.getNotificationCenter().n(this, i13);
            npVar.getNotificationCenter().n(this, i11);
            if (bpVar != null) {
                bpVar.f(booleanValue);
                return;
            }
            return;
        }
        int i15 = this.c;
        if (i15 != 0) {
            npVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            npVar.f3(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
