package cc;

import ai.c1;
import android.content.Context;
import com.google.android.gms.common.api.i;
import java.util.concurrent.atomic.AtomicLong;
import n6.p;
import rb.g;
import z7.ag;
import z7.ra;
import z7.yf;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class c extends c1 {
    public final g b;

    public c(g gVar) {
        super(6);
        this.b = gVar;
    }

    @Override // ai.c1
    public final Object Q0(Object obj) {
        yf b10 = ag.b();
        g gVar = this.b;
        Context b11 = gVar.b();
        ra raVar = new ra();
        raVar.b = new AtomicLong(-1L);
        raVar.a = new p6.b(b11, p6.b.k, new p("mlkit:vision"), i.c);
        return new f(gVar, (bc.e) obj, b10, raVar);
    }
}
