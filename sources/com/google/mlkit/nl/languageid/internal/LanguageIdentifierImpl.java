package com.google.mlkit.nl.languageid.internal;

import a8.pa;
import a8.ua;
import a8.va;
import a8.wa;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import n6.c;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.rt;
import pb.g;
import pb.j;
import q6.k;
import q6.p;
import rb.b;
import tb.e;
import y7.d6;
import y7.e6;
import y7.e9;
import y7.h7;
import y7.i6;
import y7.j6;
import y7.j7;
import y7.l6;
import y7.l7;
import y7.m6;
import y7.n6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final e9 a;
    public final va b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final l6 f;

    public LanguageIdentifierImpl(e eVar, e9 e9Var, Executor executor) {
        this.a = e9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? l6.c : l6.b;
        this.b = new va(g.c().b(), 2);
    }

    public static final j6 k() {
        i6 i6Var = new i6(0);
        i6Var.b = Float.valueOf(-1.0f);
        return new j6(i6Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == l6.c ? j.a : new c[]{j.b};
    }

    @Override // rb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        ab.b0 b0Var = new ab.b0(15, false);
        b0Var.d = this.f;
        d6 d6Var = new d6();
        d6Var.b = k();
        b0Var.e = new l7(d6Var);
        wa waVar = new wa(b0Var, 1);
        e9 e9Var = this.a;
        Task task = e9Var.e;
        pb.m.a.execute(new pa(e9Var, waVar, n6.d, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(e9Var.g), 7));
    }

    public final Task g(final String str) {
        q6.m.h(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        q6.m.i("LanguageIdentification has been closed", eVar != null);
        final boolean z9 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: tb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z10 = z9;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e10 = eVar2.e(str2.substring(0, Math.min(str2.length(), qs.e3)));
                    rt rtVar = new rt(27);
                    com.google.android.gms.internal.clearcut.e eVar3 = new com.google.android.gms.internal.clearcut.e();
                    eVar3.b = e10;
                    rtVar.b = new h7(eVar3);
                    languageIdentifierImpl.j(elapsedRealtime, z10, new j7(rtVar), m6.b);
                    return e10;
                } catch (RuntimeException e11) {
                    languageIdentifierImpl.j(elapsedRealtime, z10, null, m6.c);
                    throw e11;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j3, boolean z9, j7 j7Var, m6 m6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        e9 e9Var = this.a;
        n6 n6Var = n6.b;
        e9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = e9Var.i;
        if (hashMap.get(n6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(n6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(n6Var, Long.valueOf(elapsedRealtime2));
            d6 d6Var = new d6();
            d6Var.b = k();
            d6 d6Var2 = new d6();
            d6Var2.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            d6Var2.c = Boolean.valueOf(z9);
            d6Var2.b = m6Var;
            d6Var.a = new e6(d6Var2);
            if (j7Var != null) {
                d6Var.c = j7Var;
            }
            ab.b0 b0Var = new ab.b0(15, false);
            b0Var.d = this.f;
            b0Var.e = new l7(d6Var);
            wa waVar = new wa(b0Var, 0);
            Task task = e9Var.e;
            pb.m.a.execute(new pa(e9Var, waVar, n6Var, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(e9Var.g), 7));
        }
        long currentTimeMillis = System.currentTimeMillis();
        va vaVar = this.b;
        int i7 = this.f == l6.c ? 24603 : 24602;
        int i10 = m6Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (vaVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (vaVar.b.get() != -1 && elapsedRealtime3 - vaVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            vaVar.a.f(new p(0, Arrays.asList(new k(i7, i10, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ua(vaVar, elapsedRealtime3, 10));
        }
    }
}
