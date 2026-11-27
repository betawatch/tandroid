// default package

import j$.util.function.Function$-CC;
import java.util.List;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class cf1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cf1(Object obj, byte b) {
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
                wf1 wf1Var = (wf1) obj2;
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    return lbc.l(wf1Var.getMessagesController().X1(l));
                }
                TLRPC.Chat M0 = wf1Var.getMessagesController().M0(Long.valueOf(-l.longValue()));
                if (M0 != null) {
                    return M0.title;
                }
                return null;
            default:
                t80 t80Var = (t80) obj2;
                hz2 hz2Var = (hz2) obj;
                s80 a = t80Var.a();
                v80 v80Var = t80Var.c;
                u80 a2 = v80Var.a();
                w80 w80Var = v80Var.a;
                List list = w80Var.a;
                y80 y80Var = w80Var.b;
                cz2 cz2Var = w80Var.c;
                z80 z80Var = w80Var.e;
                List list2 = w80Var.f;
                if (list2 != null) {
                    a2.a = new w80(list, y80Var, cz2Var, hz2Var, z80Var, list2);
                    a.c = a2.a();
                    return a.a();
                }
                StringBuilder sb = new StringBuilder();
                if (list2 == null) {
                    sb.append(" binaries");
                }
                grb.i(bs2.o("Missing required properties:", sb));
                return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        byte b = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
