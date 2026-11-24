// default package

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i8e {
    public static final ce6 i = new ce6("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final l8a a;
    public final zfd b;
    public final r8d c;
    public Long e;
    public h3c g;
    public byte h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public i8e(Context context, ua4 ua4Var, l8a l8aVar, zfd zfdVar, r8d r8dVar) {
        this.a = l8aVar;
        this.b = zfdVar;
        this.c = r8dVar;
    }

    public final void a(final a6f a6fVar, final int i2) {
        this.f.execute(new Runnable() { // from class: a1e
            /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                na0 na0Var;
                h3c h3cVar;
                y5f n = a6f.n(a6fVar);
                i8e i8eVar = i8e.this;
                String str = i8eVar.d;
                n.c();
                a6f.v((a6f) n.b, str);
                n.c();
                a6f.w((a6f) n.b, str);
                Long l = i8eVar.e;
                if (l != null) {
                    int longValue = (int) l.longValue();
                    n.c();
                    a6f.x((a6f) n.b, longValue);
                }
                a6f a6fVar2 = (a6f) n.a();
                byte b = i8eVar.h;
                int i3 = b - 1;
                na0 na0Var2 = null;
                if (b == 0) {
                    throw null;
                }
                short s = i2;
                if (i3 != 0) {
                    if (i3 == 1) {
                        na0Var = new na0(Integer.valueOf(s - 1), a6fVar2, fl8.a, null);
                    }
                    i8e.i.b("analytics event: %s", na0Var2);
                    ite.h(na0Var2);
                    h3cVar = i8eVar.g;
                    if (h3cVar == null) {
                        h3cVar.a(na0Var2, new rjb((byte) 9));
                        return;
                    }
                    return;
                }
                na0Var = new na0(Integer.valueOf(s - 1), a6fVar2, fl8.b, null);
                na0Var2 = na0Var;
                i8e.i.b("analytics event: %s", na0Var2);
                ite.h(na0Var2);
                h3cVar = i8eVar.g;
                if (h3cVar == null) {
                }
            }
        });
    }
}
