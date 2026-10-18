package cc;

import ai.c1;
import android.content.Context;
import com.google.android.gms.common.api.i;
import java.util.concurrent.atomic.AtomicLong;
import n6.p;
import rb.g;
import z7.qa;
import z7.xf;
import z7.zf;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c extends c1 {
    public final g b;

    public c(g gVar) {
        super(6);
        this.b = gVar;
    }

    @Override // ai.c1
    public final Object Q0(Object obj) {
        xf b10 = zf.b();
        g gVar = this.b;
        Context b11 = gVar.b();
        qa qaVar = new qa();
        qaVar.b = new AtomicLong(-1L);
        qaVar.a = new p6.b(b11, p6.b.k, new p("mlkit:vision"), i.c);
        return new f(gVar, (bc.e) obj, b10, qaVar);
    }
}
