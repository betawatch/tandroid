// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class mze {
    public static bsd a(deb debVar) {
        xld xldVar = (xld) jg7.c().a(xld.class);
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
