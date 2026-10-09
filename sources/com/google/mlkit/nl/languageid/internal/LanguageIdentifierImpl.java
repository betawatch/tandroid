package com.google.mlkit.nl.languageid.internal;

import a5.a;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import e6.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k2.g0;
import k6.c;
import n6.i;
import n6.l;
import n6.o;
import n6.t;
import oi.f;
import qb.g;
import qb.j;
import sb.b;
import ub.e;
import v7.c6;
import v7.d7;
import v7.f7;
import v7.g6;
import v7.h7;
import v7.i6;
import v7.j6;
import v7.k;
import v7.k6;
import v7.z8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final z8 a;
    public final t b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final i6 f;

    public LanguageIdentifierImpl(e eVar, z8 z8Var, Executor executor) {
        this.a = z8Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? i6.c : i6.b;
        this.b = new t(g.c().b(), 20);
    }

    public static final g6 k() {
        g0 g0Var = new g0(28);
        g0Var.b = Float.valueOf(-1.0f);
        return new g6(g0Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == i6.c ? j.a : new c[]{j.b};
    }

    @Override // sb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        f fVar = new f();
        fVar.c = this.f;
        k kVar = new k(4, false);
        kVar.c = k();
        fVar.d = new h7(kVar);
        a aVar = new a(fVar, 1);
        z8 z8Var = this.a;
        Task task = z8Var.e;
        qb.m.a.execute(new p(z8Var, aVar, k6.d, task.isSuccessful() ? (String) task.getResult() : i.c.a(z8Var.g), 6));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: ub.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e7 = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    m2.t tVar = new m2.t(19, false);
                    f2.a aVar = new f2.a();
                    aVar.a = e7;
                    tVar.b = new d7(aVar);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new f7(tVar), j6.b);
                    return e7;
                } catch (RuntimeException e10) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, j6.c);
                    throw e10;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j3, boolean z10, f7 f7Var, j6 j6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        z8 z8Var = this.a;
        k6 k6Var = k6.b;
        z8Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = z8Var.i;
        if (hashMap.get(k6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(k6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(k6Var, Long.valueOf(elapsedRealtime2));
            k kVar = new k(4, false);
            kVar.c = k();
            k kVar2 = new k(3, false);
            kVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            kVar2.d = Boolean.valueOf(z10);
            kVar2.c = j6Var;
            kVar.b = new c6(kVar2);
            if (f7Var != null) {
                kVar.d = f7Var;
            }
            f fVar = new f();
            fVar.c = this.f;
            fVar.d = new h7(kVar);
            a aVar = new a(fVar, 0);
            Task task = z8Var.e;
            qb.m.a.execute(new p(z8Var, aVar, k6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(z8Var.g), 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = this.b;
        int i10 = this.f == i6.c ? 24603 : 24602;
        int i11 = j6Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (tVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) tVar.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) tVar.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) tVar.b).f(new o(0, Arrays.asList(new n6.j(i10, i11, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new n(tVar, elapsedRealtime3, 7));
        }
    }
}
