// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class mze {
    public static bsd a(deb debVar) {
        xld xldVar = (xld) kg7.c().a(xld.class);
        mre mreVar = (mre) xldVar.a.c(debVar);
        Executor executor = (Executor) xldVar.b.a.get();
        ijf b = qjf.b();
        bsd bsdVar = new bsd(mreVar, executor);
        oxb oxbVar = new oxb();
        oxbVar.c = m9f.b;
        k7b k7bVar = new k7b((byte) 21, false);
        k7bVar.c = debVar.a();
        k7bVar.b = daf.b;
        oxbVar.d = new off(k7bVar);
        xnb.c(1, new dd1(b, new rx(oxbVar, 1), gaf.O4, b.c(), (byte) 4));
        return bsdVar;
    }
}
