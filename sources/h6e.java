// default package

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h6e {
    public static final dc6 i = new dc6("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final j6a a;
    public final ydd b;
    public final p6d c;
    public Long e;
    public h1c g;
    public byte h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public h6e(Context context, u84 u84Var, j6a j6aVar, ydd yddVar, p6d p6dVar) {
        this.a = j6aVar;
        this.b = yddVar;
        this.c = p6dVar;
    }

    public final void a(final y3f y3fVar, final int i2) {
        this.f.execute(new Runnable() { // from class: xyd
            /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                n90 n90Var;
                h1c h1cVar;
                w3f n = y3f.n(y3fVar);
                h6e h6eVar = h6e.this;
                String str = h6eVar.d;
                n.c();
                y3f.v((y3f) n.b, str);
                n.c();
                y3f.w((y3f) n.b, str);
                Long l = h6eVar.e;
                if (l != null) {
                    int longValue = (int) l.longValue();
                    n.c();
                    y3f.x((y3f) n.b, longValue);
                }
                y3f y3fVar2 = (y3f) n.a();
                byte b = h6eVar.h;
                int i3 = b - 1;
                n90 n90Var2 = null;
                if (b == 0) {
                    throw null;
                }
                short s = i2;
                if (i3 != 0) {
                    if (i3 == 1) {
                        n90Var = new n90(Integer.valueOf(s - 1), y3fVar2, cj8.a, null);
                    }
                    h6e.i.b("analytics event: %s", n90Var2);
                    fre.h(n90Var2);
                    h1cVar = h6eVar.g;
                    if (h1cVar == null) {
                        h1cVar.a(n90Var2, new fyb((byte) 3));
                        return;
                    }
                    return;
                }
                n90Var = new n90(Integer.valueOf(s - 1), y3fVar2, cj8.b, null);
                n90Var2 = n90Var;
                h6e.i.b("analytics event: %s", n90Var2);
                fre.h(n90Var2);
                h1cVar = h6eVar.g;
                if (h1cVar == null) {
                }
            }
        });
    }
}
