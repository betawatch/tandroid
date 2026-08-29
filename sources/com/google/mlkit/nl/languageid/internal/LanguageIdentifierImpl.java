package com.google.mlkit.nl.languageid.internal;

import ab.h;
import ab.k;
import ab.q;
import ag.j2;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import c2.p;
import cb.b;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import eb.e;
import h7.a9;
import h7.b9;
import h7.d6;
import h7.d7;
import h7.f7;
import h7.g6;
import h7.h7;
import h7.i6;
import h7.j6;
import h7.k6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m5.i;
import w5.c;
import z5.j;
import z5.l;
import z5.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final a9 a;
    public final b9 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final i6 f;

    public LanguageIdentifierImpl(e eVar, a9 a9Var, Executor executor) {
        this.a = a9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? i6.c : i6.b;
        this.b = new b9(h.c().b(), 0);
    }

    public static final g6 k() {
        i iVar = new i(16);
        iVar.b = Float.valueOf(-1.0f);
        return new g6(iVar);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == i6.c ? k.a : new c[]{k.b};
    }

    @Override // cb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        s sVar = new s(9, false);
        sVar.d = this.f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(17, false);
        eVar2.c = k();
        sVar.e = new h7(eVar2);
        j2 j2Var = new j2(sVar, 1);
        a9 a9Var = this.a;
        Task task = a9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : z5.i.c.a(a9Var.g);
        q.a.execute(new p(a9Var, j2Var, k6.d, a2, false, 4));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: eb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e10 = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    za.c cVar = new za.c(18);
                    fc.a aVar = new fc.a();
                    aVar.b = e10;
                    cVar.b = new d7(aVar);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new f7(cVar), j6.b);
                    return e10;
                } catch (RuntimeException e11) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, j6.c);
                    throw e11;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, f7 f7Var, j6 j6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        a9 a9Var = this.a;
        k6 k6Var = k6.b;
        a9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = a9Var.i;
        boolean z11 = false;
        if (hashMap.get(k6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(k6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(k6Var, Long.valueOf(elapsedRealtime2));
            androidx.biometric.e eVar = new androidx.biometric.e(17, z11);
            eVar.c = k();
            androidx.biometric.e eVar2 = new androidx.biometric.e(16, z11);
            eVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            eVar2.d = Boolean.valueOf(z10);
            eVar2.c = j6Var;
            eVar.b = new d6(eVar2);
            if (f7Var != null) {
                eVar.d = f7Var;
            }
            s sVar = new s(9, z11);
            sVar.d = this.f;
            sVar.e = new h7(eVar);
            j2 j2Var = new j2(sVar, 0);
            Task task = a9Var.e;
            q.a.execute(new p(a9Var, j2Var, k6Var, task.isSuccessful() ? (String) task.getResult() : z5.i.c.a(a9Var.g), false, 4));
        }
        long currentTimeMillis = System.currentTimeMillis();
        b9 b9Var = this.b;
        int i10 = this.f == i6.c ? 24603 : 24602;
        int i11 = j6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (b9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (b9Var.b.get() != -1 && elapsedRealtime3 - b9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            b9Var.a.f(new o(0, Arrays.asList(new j(i10, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(b9Var, elapsedRealtime3, 1));
        }
    }
}
