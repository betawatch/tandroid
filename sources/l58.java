// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l58 implements jm7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ jm7[] c;

    public l58(int i, qac qacVar, jm7[] jm7VarArr) {
        this.a = i;
        this.b = qacVar;
        this.c = jm7VarArr;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.t5;
        if (i == i3) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                qac qacVar = this.b;
                if (qacVar != null) {
                    qacVar.a(iArr);
                }
                nm7.e().n(this.c[0], i3);
            }
        }
    }
}
