// default package

import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class iz5 implements gz5 {
    public final j2f a;
    public final q2f b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final mle f;

    public iz5(tae taeVar, j2f j2fVar, Executor executor) {
        this.a = j2fVar;
        this.c = executor;
        this.d = new AtomicReference(taeVar);
        taeVar.getClass();
        this.f = mle.b;
        this.b = new q2f(jg7.c().b(), (byte) 0);
    }

    public static final dle e() {
        xae xaeVar = new xae();
        xaeVar.a = Float.valueOf(-1.0f);
        return new dle(xaeVar);
    }

    @Override // yt7
    public final a94[] a() {
        return this.f == mle.b ? zt7.a : new a94[]{zt7.b};
    }

    public final Task c(final String str) {
        xve.i(str, "Text can not be null");
        final tae taeVar = (tae) this.d.get();
        xve.j("LanguageIdentification has been closed", taeVar != null);
        final boolean z = !taeVar.c.get();
        return taeVar.a(this.c, new Callable() { // from class: zxd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                iz5 iz5Var = iz5.this;
                tae taeVar2 = taeVar;
                String str2 = str;
                boolean z2 = z;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = taeVar2.e(str2.substring(0, Math.min(str2.length(), jn7.d3)));
                    oqd oqdVar = new oqd();
                    sc3 sc3Var = new sc3();
                    sc3Var.a = e;
                    oqdVar.a = new vqe(sc3Var);
                    iz5Var.d(elapsedRealtime, z2, new yre(oqdVar), sle.b);
                    return e;
                } catch (RuntimeException e2) {
                    iz5Var.d(elapsedRealtime, z2, null, sle.c);
                    throw e2;
                }
            }
        }, this.e.getToken());
    }

    @Override // gz5, java.io.Closeable, java.lang.AutoCloseable
    @es7(y26.ON_DESTROY)
    public void close() {
        tae taeVar = (tae) this.d.getAndSet(null);
        if (taeVar == null) {
            return;
        }
        this.e.cancel();
        taeVar.d(this.c);
        u8a u8aVar = new u8a();
        u8aVar.c = this.f;
        htd htdVar = new htd((byte) 6);
        htdVar.c = e();
        u8aVar.d = new yse(htdVar);
        rx rxVar = new rx(u8aVar, 1);
        j2f j2fVar = this.a;
        Task task = j2fVar.e;
        xnb.c(1, new dd1(j2fVar, rxVar, ame.d, task.isSuccessful() ? (String) task.getResult() : v26.c.a(j2fVar.g), (byte) 2));
    }

    public final void d(long j, boolean z, yre yreVar, sle sleVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        j2f j2fVar = this.a;
        ame ameVar = ame.b;
        j2fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = j2fVar.i;
        if (hashMap.get(ameVar) == null || elapsedRealtime2 - ((Long) hashMap.get(ameVar)).longValue() > 30000) {
            hashMap.put(ameVar, Long.valueOf(elapsedRealtime2));
            htd htdVar = new htd((byte) 6);
            htdVar.c = e();
            htd htdVar2 = new htd((byte) 5);
            htdVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            htdVar2.d = Boolean.valueOf(z);
            htdVar2.c = sleVar;
            htdVar.b = new ake(htdVar2);
            if (yreVar != null) {
                htdVar.d = yreVar;
            }
            u8a u8aVar = new u8a();
            u8aVar.c = this.f;
            u8aVar.d = new yse(htdVar);
            rx rxVar = new rx(u8aVar, 0);
            Task task = j2fVar.e;
            xnb.c(1, new dd1(j2fVar, rxVar, ameVar, task.isSuccessful() ? (String) task.getResult() : v26.c.a(j2fVar.g), (byte) 2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        q2f q2fVar = this.b;
        int i = this.f == mle.b ? 24603 : 24602;
        short s = sleVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (q2fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (q2fVar.b.get() == -1 || elapsedRealtime3 - q2fVar.b.get() > 1800000) {
                q2fVar.a.i(new ikb(0, Arrays.asList(new bg7(i, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new zg2(q2fVar, elapsedRealtime3, (byte) 10));
            }
        }
    }
}
