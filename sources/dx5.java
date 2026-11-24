// default package

import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dx5 implements bx5 {
    public final sxe a;
    public final zxe b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final vge f;

    public dx5(d6e d6eVar, sxe sxeVar, Executor executor) {
        this.a = sxeVar;
        this.c = executor;
        this.d = new AtomicReference(d6eVar);
        d6eVar.getClass();
        this.f = vge.b;
        this.b = new zxe(ae7.c().b(), (byte) 0);
    }

    public static final mge e() {
        sld sldVar = new sld();
        sldVar.a = Float.valueOf(-1.0f);
        return new mge(sldVar);
    }

    @Override // tq7
    public final f84[] a() {
        return this.f == vge.b ? uq7.a : new f84[]{uq7.b};
    }

    public final Task c(final String str) {
        fre.i(str, "Text can not be null");
        final d6e d6eVar = (d6e) this.d.get();
        fre.j("LanguageIdentification has been closed", d6eVar != null);
        final boolean z = !d6eVar.c.get();
        return d6eVar.a(this.c, new Callable() { // from class: jtd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dx5 dx5Var = dx5.this;
                d6e d6eVar2 = d6eVar;
                String str2 = str;
                boolean z2 = z;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = d6eVar2.e(str2.substring(0, Math.min(str2.length(), kk7.d3)));
                    xdd xddVar = new xdd();
                    zb3 zb3Var = new zb3();
                    zb3Var.a = e;
                    xddVar.a = new eme(zb3Var);
                    dx5Var.d(elapsedRealtime, z2, new hne(xddVar), bhe.b);
                    return e;
                } catch (RuntimeException e2) {
                    dx5Var.d(elapsedRealtime, z2, null, bhe.c);
                    throw e2;
                }
            }
        }, this.e.getToken());
    }

    @Override // bx5, java.io.Closeable, java.lang.AutoCloseable
    @ep7(u06.ON_DESTROY)
    public void close() {
        d6e d6eVar = (d6e) this.d.getAndSet(null);
        if (d6eVar == null) {
            return;
        }
        this.e.cancel();
        d6eVar.d(this.c);
        wtc wtcVar = new wtc();
        wtcVar.c = this.f;
        rod rodVar = new rod((byte) 6);
        rodVar.c = e();
        wtcVar.d = new goe(rodVar);
        qx qxVar = new qx(wtcVar, 1);
        sxe sxeVar = this.a;
        Task task = sxeVar.e;
        yjb.c(1, new vc1(sxeVar, qxVar, jhe.d, task.isSuccessful() ? (String) task.getResult() : r06.c.a(sxeVar.g), (byte) 2));
    }

    public final void d(long j, boolean z, hne hneVar, bhe bheVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        sxe sxeVar = this.a;
        jhe jheVar = jhe.b;
        sxeVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = sxeVar.i;
        if (hashMap.get(jheVar) == null || elapsedRealtime2 - ((Long) hashMap.get(jheVar)).longValue() > 30000) {
            hashMap.put(jheVar, Long.valueOf(elapsedRealtime2));
            rod rodVar = new rod((byte) 6);
            rodVar.c = e();
            rod rodVar2 = new rod((byte) 5);
            rodVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            rodVar2.d = Boolean.valueOf(z);
            rodVar2.c = bheVar;
            rodVar.b = new jfe(rodVar2);
            if (hneVar != null) {
                rodVar.d = hneVar;
            }
            wtc wtcVar = new wtc();
            wtcVar.c = this.f;
            wtcVar.d = new goe(rodVar);
            qx qxVar = new qx(wtcVar, 0);
            Task task = sxeVar.e;
            yjb.c(1, new vc1(sxeVar, qxVar, jheVar, task.isSuccessful() ? (String) task.getResult() : r06.c.a(sxeVar.g), (byte) 2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        zxe zxeVar = this.b;
        int i = this.f == vge.b ? 24603 : 24602;
        short s = bheVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (zxeVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (zxeVar.b.get() == -1 || elapsedRealtime3 - zxeVar.b.get() > 1800000) {
                zxeVar.a.i(new mgb(0, Arrays.asList(new sd7(i, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new hg2(zxeVar, elapsedRealtime3, (byte) 9));
            }
        }
    }
}
