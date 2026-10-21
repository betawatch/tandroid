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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
