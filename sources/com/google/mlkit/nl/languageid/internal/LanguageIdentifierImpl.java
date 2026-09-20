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
import ee.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k2.u;
import k6.c;
import n6.i;
import n6.l;
import n6.o;
import oi.f;
import qb.g;
import qb.j;
import sb.b;
import ub.e;
import v7.a9;
import v7.c6;
import v7.d7;
import v7.f7;
import v7.g6;
import v7.h7;
import v7.i6;
import v7.j6;
import v7.k6;
import v7.s1;
import v7.z8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final z8 a;
    public final a9 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final i6 f;

    public LanguageIdentifierImpl(e eVar, z8 z8Var, Executor executor) {
        this.a = z8Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? i6.c : i6.b;
        this.b = new a9(g.c().b(), 0);
    }

    public static final g6 k() {
        u uVar = new u(28, false);
        uVar.b = Float.valueOf(-1.0f);
        return new g6(uVar);
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
        s1 s1Var = new s1(3, false);
        s1Var.d = k();
        fVar.d = new h7(s1Var);
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
                    String e = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    n2.e eVar3 = new n2.e(23, false);
                    v vVar = new v(2);
                    vVar.b = e;
                    eVar3.b = new d7(vVar);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new f7(eVar3), j6.b);
                    return e;
                } catch (RuntimeException e7) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, j6.c);
                    throw e7;
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
            s1 s1Var = new s1(3, false);
            s1Var.d = k();
            s1 s1Var2 = new s1(2, false);
            s1Var2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            s1Var2.c = Boolean.valueOf(z10);
            s1Var2.d = j6Var;
            s1Var.b = new c6(s1Var2);
            if (f7Var != null) {
                s1Var.c = f7Var;
            }
            f fVar = new f();
            fVar.c = this.f;
            fVar.d = new h7(s1Var);
            a aVar = new a(fVar, 0);
            Task task = z8Var.e;
            qb.m.a.execute(new p(z8Var, aVar, k6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(z8Var.g), 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        a9 a9Var = this.b;
        int i10 = this.f == i6.c ? 24603 : 24602;
        int i11 = j6Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (a9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (a9Var.b.get() != -1 && elapsedRealtime3 - a9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            a9Var.a.f(new o(0, Arrays.asList(new n6.j(i10, i11, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new n(a9Var, elapsedRealtime3, 7));
        }
    }
}
