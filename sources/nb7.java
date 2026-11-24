// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nb7 implements jm7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ dc7 e;
    public final /* synthetic */ oc7 f;

    /* JADX WARN: Multi-variable type inference failed */
    public nb7(oc7 oc7Var, int i, int i2, int i3, long j, dc7 dc7Var) {
        this.f = oc7Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = dc7Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.H;
        dc7 dc7Var = this.e;
        int i4 = this.a;
        oc7 oc7Var = this.f;
        int i5 = nm7.G;
        if (i != i5 || ((Integer) objArr[0]).intValue() != i4) {
            if (i == i3 && ((Integer) objArr[0]).intValue() == i4) {
                oc7Var.getNotificationCenter().n(this, i5);
                oc7Var.getNotificationCenter().n(this, i3);
                if (dc7Var != null) {
                    dc7Var.a();
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
        byte b = this.b;
        if (intValue >= b / 2 || booleanValue2 || !booleanValue) {
            oc7Var.getNotificationCenter().n(this, i5);
            oc7Var.getNotificationCenter().n(this, i3);
            if (dc7Var != null) {
                dc7Var.l(booleanValue);
                return;
            }
            return;
        }
        int i6 = this.c;
        long j = this.d;
        if (i6 != 0) {
            oc7Var.d3(j, 0L, false, b, i6, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            oc7Var.d3(j, 0L, false, b, i6, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }
}
