// default package

import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dz5 implements bz5 {
    public final uze a;
    public final b0f b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final wie f;

    public dz5(g8e g8eVar, uze uzeVar, Executor executor) {
        this.a = uzeVar;
        this.c = executor;
        this.d = new AtomicReference(g8eVar);
        g8eVar.getClass();
        this.f = wie.b;
        this.b = new b0f(cg7.c().b(), (byte) 0);
    }

    public static final nie e() {
        und undVar = new und();
        undVar.a = Float.valueOf(-1.0f);
        return new nie(undVar);
    }

    @Override // vs7
    public final o94[] a() {
        return this.f == wie.b ? ws7.a : new o94[]{ws7.b};
    }

    public final Task c(final String str) {
        ite.i(str, "Text can not be null");
        final g8e g8eVar = (g8e) this.d.get();
        ite.j("LanguageIdentification has been closed", g8eVar != null);
        final boolean z = !g8eVar.c.get();
        return g8eVar.a(this.c, new Callable() { // from class: mvd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dz5 dz5Var = dz5.this;
                g8e g8eVar2 = g8eVar;
                String str2 = str;
                boolean z2 = z;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = g8eVar2.e(str2.substring(0, Math.min(str2.length(), nm7.d3)));
                    hoe hoeVar = new hoe();
                    und undVar = new und();
                    undVar.a = e;
                    hoeVar.a = new goe(undVar);
                    dz5Var.d(elapsedRealtime, z2, new kpe(hoeVar), cje.b);
                    return e;
                } catch (RuntimeException e2) {
                    dz5Var.d(elapsedRealtime, z2, null, cje.c);
                    throw e2;
                }
            }
        }, this.e.getToken());
    }

    @Override // bz5, java.io.Closeable, java.lang.AutoCloseable
    @hr7(u26.ON_DESTROY)
    public void close() {
        g8e g8eVar = (g8e) this.d.getAndSet(null);
        if (g8eVar == null) {
            return;
        }
        this.e.cancel();
        g8eVar.d(this.c);
        e7a e7aVar = new e7a();
        e7aVar.c = this.f;
        uqd uqdVar = new uqd((byte) 6);
        uqdVar.c = e();
        e7aVar.d = new jqe(uqdVar);
        ry ryVar = new ry(e7aVar, 1);
        uze uzeVar = this.a;
        Task task = uzeVar.e;
        mlb.c(1, new de1(uzeVar, ryVar, kje.d, task.isSuccessful() ? (String) task.getResult() : r26.c.a(uzeVar.g), (byte) 2));
    }

    public final void d(long j, boolean z, kpe kpeVar, cje cjeVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        uze uzeVar = this.a;
        kje kjeVar = kje.b;
        uzeVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = uzeVar.i;
        if (hashMap.get(kjeVar) == null || elapsedRealtime2 - ((Long) hashMap.get(kjeVar)).longValue() > 30000) {
            hashMap.put(kjeVar, Long.valueOf(elapsedRealtime2));
            uqd uqdVar = new uqd((byte) 6);
            uqdVar.c = e();
            uqd uqdVar2 = new uqd((byte) 5);
            uqdVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            uqdVar2.d = Boolean.valueOf(z);
            uqdVar2.c = cjeVar;
            uqdVar.b = new khe(uqdVar2);
            if (kpeVar != null) {
                uqdVar.d = kpeVar;
            }
            e7a e7aVar = new e7a();
            e7aVar.c = this.f;
            e7aVar.d = new jqe(uqdVar);
            ry ryVar = new ry(e7aVar, 0);
            Task task = uzeVar.e;
            mlb.c(1, new de1(uzeVar, ryVar, kjeVar, task.isSuccessful() ? (String) task.getResult() : r26.c.a(uzeVar.g), (byte) 2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        b0f b0fVar = this.b;
        int i = this.f == wie.b ? 24603 : 24602;
        short s = cjeVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (b0fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (b0fVar.b.get() == -1 || elapsedRealtime3 - b0fVar.b.get() > 1800000) {
                b0fVar.a.i(new nib(0, Arrays.asList(new uf7(i, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new vh2(b0fVar, elapsedRealtime3, (byte) 10));
            }
        }
    }
}
