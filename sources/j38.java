// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j38 implements gk7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ gk7[] c;

    public j38(int i, p8c p8cVar, gk7[] gk7VarArr) {
        this.a = i;
        this.b = p8cVar;
        this.c = gk7VarArr;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.r5;
        if (i == i3) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                p8c p8cVar = this.b;
                if (p8cVar != null) {
                    p8cVar.a(iArr);
                }
                kk7.e().n(this.c[0], i3);
            }
        }
    }
}
