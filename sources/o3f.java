// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o3f extends e23 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3f(byte b) {
        super((byte) 4);
        this.b = b;
    }

    @Override // e23
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                y0f y0fVar = (y0f) obj;
                kg7 c = kg7.c();
                return new j2f(c.b(), (lja) c.a(lja.class), new q1f(kg7.c().b(), y0fVar), y0fVar.a);
            case 1:
                kg7 c2 = kg7.c();
                return new w5f(c2.b(), (lja) c2.a(lja.class), new n5f(kg7.c().b(), (b5f) obj));
            case 2:
                kg7 c3 = kg7.c();
                return new q8f(c3.b(), (lja) c3.a(lja.class), new e8f(kg7.c().b(), (y7f) obj));
            case 3:
                kg7 c4 = kg7.c();
                Context b = kg7.c().b();
                ArrayList arrayList = new ArrayList();
                ((ahf) obj).getClass();
                kdd kddVar = new kdd();
                q51 q51Var = q51.e;
                h5c.b(b);
                h5c.a().c(q51Var);
                q51.d.contains(new n34("json"));
                arrayList.add(kddVar);
                return new xhf(c4.b(), (lja) c4.a(lja.class));
            default:
                kg7 c5 = kg7.c();
                return new ijf(c5.b(), (lja) c5.a(lja.class), new djf(kg7.c().b(), (wif) obj));
        }
    }
}
