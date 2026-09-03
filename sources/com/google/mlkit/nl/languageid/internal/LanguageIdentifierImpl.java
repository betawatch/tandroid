package com.google.mlkit.nl.languageid.internal;

import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import b4.e0;
import b6.j;
import c2.p;
import cb.h;
import cb.k;
import cb.o;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import eb.b;
import gb.e;
import j7.c9;
import j7.d9;
import j7.e6;
import j7.f7;
import j7.h6;
import j7.h7;
import j7.i6;
import j7.j7;
import j7.k6;
import j7.l6;
import j7.m6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import y5.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final c9 a;
    public final d9 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final k6 f;

    public LanguageIdentifierImpl(e eVar, c9 c9Var, Executor executor) {
        this.a = c9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? k6.c : k6.b;
        this.b = new d9(h.c().b(), 0);
    }

    public static final i6 k() {
        h6 h6Var = new h6();
        h6Var.a = Float.valueOf(-1.0f);
        return new i6(h6Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == k6.c ? k.a : new c[]{k.b};
    }

    @Override // eb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        s sVar = new s();
        sVar.c = this.f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(24, false);
        eVar2.c = k();
        sVar.d = new j7(eVar2);
        e0 e0Var = new e0(sVar, 1);
        c9 c9Var = this.a;
        Task task = c9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : j.c.a(c9Var.g);
        o.a.execute(new p(c9Var, e0Var, m6.d, a2, false, 4));
    }

    public final Task g(final String str) {
        b6.m.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        b6.m.j("LanguageIdentification has been closed", eVar != null);
        final boolean z4 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: gb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z10 = z4;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e6 = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    ja.c cVar = new ja.c();
                    i5.c cVar2 = new i5.c();
                    cVar2.a = e6;
                    cVar.a = new f7(cVar2);
                    languageIdentifierImpl.j(elapsedRealtime, z10, new h7(cVar), l6.b);
                    return e6;
                } catch (RuntimeException e10) {
                    languageIdentifierImpl.j(elapsedRealtime, z10, null, l6.c);
                    throw e10;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z4, h7 h7Var, l6 l6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        c9 c9Var = this.a;
        m6 m6Var = m6.b;
        c9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = c9Var.i;
        boolean z10 = false;
        if (hashMap.get(m6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(m6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(m6Var, Long.valueOf(elapsedRealtime2));
            androidx.biometric.e eVar = new androidx.biometric.e(24, z10);
            eVar.c = k();
            androidx.biometric.e eVar2 = new androidx.biometric.e(23, z10);
            eVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            eVar2.d = Boolean.valueOf(z4);
            eVar2.c = l6Var;
            eVar.b = new e6(eVar2);
            if (h7Var != null) {
                eVar.d = h7Var;
            }
            s sVar = new s();
            sVar.c = this.f;
            sVar.d = new j7(eVar);
            e0 e0Var = new e0(sVar, 0);
            Task task = c9Var.e;
            o.a.execute(new p(c9Var, e0Var, m6Var, task.isSuccessful() ? (String) task.getResult() : j.c.a(c9Var.g), false, 4));
        }
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.b;
        int i10 = this.f == k6.c ? 24603 : 24602;
        int i11 = l6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.b.get() != -1 && elapsedRealtime3 - d9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.a.f(new b6.p(0, Arrays.asList(new b6.k(i10, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime3, 1));
        }
    }
}
