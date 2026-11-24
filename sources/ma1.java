// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ma1 implements gq4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma1(nh7 nh7Var, mh7 mh7Var) {
        this.a = (byte) 1;
        this.b = nh7Var;
    }

    @Override // gq4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((z1) obj4).invoke((Throwable) obj);
                break;
            case 1:
                nh7 nh7Var = (nh7) obj4;
                nh7.h.set(nh7Var, null);
                nh7Var.f(null);
                break;
            default:
                ((r0a) obj4).b();
                break;
        }
        return g5cVar;
    }

    public /* synthetic */ ma1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
