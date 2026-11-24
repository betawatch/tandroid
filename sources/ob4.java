// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ob4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qb4 b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ ob4(qb4 qb4Var, int[] iArr, byte b) {
        this.a = b;
        this.b = qb4Var;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        qb4 qb4Var = this.b;
        switch (b) {
            case 0:
                qb4Var.q.add(Integer.valueOf(iArr[0]));
                break;
            default:
                qb4Var.q.remove(Integer.valueOf(iArr[0]));
                break;
        }
    }
}
