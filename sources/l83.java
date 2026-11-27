// default package

import java.io.File;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l83 extends az5 implements ur4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l83(Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = obj;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                o83 o83Var = (o83) this.c;
                if (th != null) {
                    o83Var.h.H(new sh4(th));
                }
                if (o83Var.j.b != qf5.d) {
                    ((ed4) o83Var.j.getValue()).close();
                }
                return g9c.a;
            default:
                File file = (File) obj;
                file.getClass();
                return new bj7(((xw2) this.c).a, file);
        }
    }
}
