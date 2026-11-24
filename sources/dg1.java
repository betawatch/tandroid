// default package

import j$.util.function.Function$-CC;
import java.util.List;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dg1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dg1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final /* synthetic */ Function andThen(Function function) {
        byte b = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vg1 vg1Var = (vg1) obj2;
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    return m9c.l(vg1Var.getMessagesController().W1(l));
                }
                TLRPC.Chat L0 = vg1Var.getMessagesController().L0(Long.valueOf(-l.longValue()));
                if (L0 != null) {
                    return L0.title;
                }
                return null;
            default:
                r90 r90Var = (r90) obj2;
                xz2 xz2Var = (xz2) obj;
                q90 a = r90Var.a();
                t90 t90Var = r90Var.c;
                s90 a2 = t90Var.a();
                u90 u90Var = t90Var.a;
                List list = u90Var.a;
                w90 w90Var = u90Var.b;
                sz2 sz2Var = u90Var.c;
                x90 x90Var = u90Var.e;
                List list2 = u90Var.f;
                if (list2 != null) {
                    a2.a = new u90(list, w90Var, sz2Var, xz2Var, x90Var, list2);
                    a.c = a2.a();
                    return a.a();
                }
                StringBuilder sb = new StringBuilder();
                if (list2 == null) {
                    sb.append(" binaries");
                }
                dq9.m(ts2.n("Missing required properties:", sb));
                return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        byte b = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
