// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f39 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o39 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ f39(o39 o39Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = o39Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        o39 o39Var = this.b;
        switch (b) {
            case 0:
                jn7.f(o39Var.b).d(new f39(o39Var, tLObject, (byte) 1));
                break;
            default:
                o39Var.b(tLObject);
                break;
        }
    }
}
