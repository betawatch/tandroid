package com.google.mlkit.nl.languageid.internal;

import a5.a;
import ad.d;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k6.c;
import l2.f;
import n6.i;
import n6.l;
import n6.o;
import rb.g;
import rb.j;
import t0.h;
import tb.b;
import v7.b6;
import v7.c7;
import v7.e7;
import v7.f6;
import v7.g7;
import v7.h6;
import v7.i6;
import v7.j6;
import v7.y8;
import v7.z8;
import vb.e;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final y8 a;
    public final z8 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final h6 f;

    public LanguageIdentifierImpl(e eVar, y8 y8Var, Executor executor) {
        this.a = y8Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? h6.c : h6.b;
        this.b = new z8(g.c().b(), 0);
    }

    public static final f6 k() {
        f fVar = new f(23);
        fVar.b = Float.valueOf(-1.0f);
        return new f6(fVar);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == h6.c ? j.a : new c[]{j.b};
    }

    @Override // tb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        qi.e eVar2 = new qi.e();
        eVar2.c = this.f;
        h hVar = new h(6, false);
        hVar.c = k();
        eVar2.d = new g7(hVar);
        a aVar = new a(eVar2, 1);
        y8 y8Var = this.a;
        Task task = y8Var.e;
        rb.m.a.execute(new p(y8Var, aVar, j6.d, task.isSuccessful() ? (String) task.getResult() : i.c.a(y8Var.g), 6));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: vb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    le.b bVar = new le.b(24, false);
                    com.google.android.gms.internal.clearcut.e eVar3 = new com.google.android.gms.internal.clearcut.e();
                    eVar3.b = e;
                    bVar.b = new c7(eVar3);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new e7(bVar), i6.b);
                    return e;
                } catch (RuntimeException e7) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, i6.c);
                    throw e7;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, e7 e7Var, i6 i6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        y8 y8Var = this.a;
        j6 j6Var = j6.b;
        y8Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = y8Var.i;
        boolean z11 = false;
        if (hashMap.get(j6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(j6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(j6Var, Long.valueOf(elapsedRealtime2));
            h hVar = new h(6, z11);
            hVar.c = k();
            h hVar2 = new h(5, z11);
            hVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            hVar2.d = Boolean.valueOf(z10);
            hVar2.c = i6Var;
            hVar.b = new b6(hVar2);
            if (e7Var != null) {
                hVar.d = e7Var;
            }
            qi.e eVar = new qi.e();
            eVar.c = this.f;
            eVar.d = new g7(hVar);
            a aVar = new a(eVar, 0);
            Task task = y8Var.e;
            rb.m.a.execute(new p(y8Var, aVar, j6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(y8Var.g), 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.b;
        int i10 = this.f == h6.c ? 24603 : 24602;
        int i11 = i6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.b.get() != -1 && elapsedRealtime3 - z8Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.a.f(new o(0, Arrays.asList(new n6.j(i10, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new d(z8Var, elapsedRealtime3, 8));
        }
    }
}
