// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class cd6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id6 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ cd6(id6 id6Var, Integer num, byte b) {
        this.a = b;
        this.b = id6Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Integer num = this.c;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                if (!id6Var.b.isEmpty()) {
                    hl.c3(new cd6(id6Var, num, b2));
                    break;
                }
                break;
            default:
                id6Var.getNotificationCenter().k(77, num);
                break;
        }
    }
}
