package com.google.mlkit.nl.languageid.internal;

import a8.fg;
import a8.lg;
import a8.ng;
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
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l6.c;
import m4.w1;
import o6.i;
import o6.l;
import o6.o;
import s4.d;
import s4.o0;
import sb.g;
import sb.j;
import ub.b;
import w7.d6;
import w7.d9;
import w7.g7;
import w7.h6;
import w7.i6;
import w7.i7;
import w7.k6;
import w7.k7;
import w7.l6;
import w7.m6;
import wb.e;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final d9 a;
    public final w1 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final k6 f;

    public LanguageIdentifierImpl(e eVar, d9 d9Var, Executor executor) {
        this.a = d9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? k6.c : k6.b;
        this.b = new w1(g.c().b());
    }

    public static final i6 k() {
        h6 h6Var = new h6();
        h6Var.a = Float.valueOf(-1.0f);
        return new i6(h6Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == k6.c ? j.a : new c[]{j.b};
    }

    @Override // ub.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        ti.e eVar2 = new ti.e(13, false);
        eVar2.d = this.f;
        d dVar = new d(11, false);
        dVar.c = k();
        eVar2.e = new k7(dVar);
        ng ngVar = new ng(eVar2, 1);
        d9 d9Var = this.a;
        Task task = d9Var.e;
        sb.m.a.execute(new fg(d9Var, ngVar, m6.d, task.isSuccessful() ? (String) task.getResult() : i.c.a(d9Var.g), 7));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: wb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    o0 o0Var = new o0();
                    d5.j jVar = new d5.j();
                    jVar.a = e;
                    o0Var.a = new g7(jVar);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new i7(o0Var), l6.b);
                    return e;
                } catch (RuntimeException e10) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, l6.c);
                    throw e10;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, i7 i7Var, l6 l6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        d9 d9Var = this.a;
        m6 m6Var = m6.b;
        d9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = d9Var.i;
        int i10 = 10;
        boolean z11 = false;
        if (hashMap.get(m6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(m6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(m6Var, Long.valueOf(elapsedRealtime2));
            d dVar = new d(11, z11);
            dVar.c = k();
            d dVar2 = new d(i10, z11);
            dVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            dVar2.d = Boolean.valueOf(z10);
            dVar2.c = l6Var;
            dVar.b = new d6(dVar2);
            if (i7Var != null) {
                dVar.d = i7Var;
            }
            ti.e eVar = new ti.e(13, z11);
            eVar.d = this.f;
            eVar.e = new k7(dVar);
            ng ngVar = new ng(eVar, 0);
            Task task = d9Var.e;
            sb.m.a.execute(new fg(d9Var, ngVar, m6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(d9Var.g), 7));
        }
        long currentTimeMillis = System.currentTimeMillis();
        w1 w1Var = this.b;
        int i11 = this.f == k6.c ? 24603 : 24602;
        int i12 = l6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (w1Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) w1Var.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) w1Var.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((q6.b) w1Var.b).f(new o(0, Arrays.asList(new o6.j(i11, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new lg(w1Var, elapsedRealtime3, i10));
        }
    }
}
