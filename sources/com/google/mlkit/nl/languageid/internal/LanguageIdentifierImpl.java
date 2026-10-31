package com.google.mlkit.nl.languageid.internal;

import a5.a;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import c3.g0;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jb.g;
import jb.j;
import k6.c;
import lb.b;
import n6.i;
import n6.l;
import nb.e;
import org.telegram.messenger.zs;
import q5.d;
import r2.y;
import v7.b7;
import v7.c6;
import v7.d7;
import v7.e6;
import v7.f6;
import v7.g6;
import v7.x8;
import v7.y5;
import v7.y8;
import v7.z6;
import xa.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final x8 a;
    public final y8 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final e6 f;

    public LanguageIdentifierImpl(e eVar, x8 x8Var, Executor executor) {
        this.a = x8Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? e6.c : e6.b;
        this.b = new y8(g.c().b(), 0);
    }

    public static final c6 k() {
        y yVar = new y(10);
        yVar.b = Float.valueOf(-1.0f);
        return new c6(yVar);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == e6.c ? j.a : new c[]{j.b};
    }

    @Override // lb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        n nVar = new n();
        nVar.c = this.f;
        d dVar = new d(13, false);
        dVar.c = k();
        nVar.d = new d7(dVar);
        a aVar = new a(nVar, 1);
        x8 x8Var = this.a;
        Task task = x8Var.e;
        jb.m.a.execute(new o(x8Var, aVar, g6.d, task.isSuccessful() ? (String) task.getResult() : i.c.a(x8Var.g), 6));
    }

    public final Task g(final String str) {
        l.h(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.i("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: nb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = eVar2.e(str2.substring(0, Math.min(str2.length(), zs.e3)));
                    s9.g gVar = new s9.g();
                    ea.a aVar = new ea.a();
                    aVar.b = e;
                    gVar.a = new z6(aVar);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new b7(gVar), f6.b);
                    return e;
                } catch (RuntimeException e7) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, f6.c);
                    throw e7;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, b7 b7Var, f6 f6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        x8 x8Var = this.a;
        g6 g6Var = g6.b;
        x8Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = x8Var.i;
        if (hashMap.get(g6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(g6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(g6Var, Long.valueOf(elapsedRealtime2));
            d dVar = new d(13, false);
            dVar.c = k();
            d dVar2 = new d(12, false);
            dVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            dVar2.d = Boolean.valueOf(z10);
            dVar2.c = f6Var;
            dVar.b = new y5(dVar2);
            if (b7Var != null) {
                dVar.d = b7Var;
            }
            n nVar = new n();
            nVar.c = this.f;
            nVar.d = new d7(dVar);
            a aVar = new a(nVar, 0);
            Task task = x8Var.e;
            jb.m.a.execute(new o(x8Var, aVar, g6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(x8Var.g), 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        y8 y8Var = this.b;
        int i10 = this.f == e6.c ? 24603 : 24602;
        int i11 = f6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (y8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (y8Var.b.get() != -1 && elapsedRealtime3 - y8Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            y8Var.a.f(new n6.o(0, Arrays.asList(new n6.j(i10, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new g0(y8Var, elapsedRealtime3, 9));
        }
    }
}
