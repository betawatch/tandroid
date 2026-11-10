package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class oo implements ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ep e;
    public final /* synthetic */ qp f;

    public oo(qp qpVar, int i7, int i10, int i11, long j3, ep epVar) {
        this.f = qpVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = j3;
        this.e = epVar;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.I;
        ep epVar = this.e;
        int i12 = this.a;
        qp qpVar = this.f;
        int i13 = qs.H;
        if (i7 != i13 || ((Integer) objArr[0]).intValue() != i12) {
            if (i7 == i11 && ((Integer) objArr[0]).intValue() == i12) {
                qpVar.getNotificationCenter().n(this, i13);
                qpVar.getNotificationCenter().n(this, i11);
                if (epVar != null) {
                    epVar.a();
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
            qpVar.getNotificationCenter().n(this, i13);
            qpVar.getNotificationCenter().n(this, i11);
            if (epVar != null) {
                epVar.f(booleanValue);
                return;
            }
            return;
        }
        int i15 = this.c;
        if (i15 != 0) {
            qpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            qpVar.Z2(this.d, 0L, false, i14, i15, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
