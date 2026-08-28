package com.google.mlkit.nl.languageid.internal;

import a6.a;
import ab.b;
import af.f;
import android.os.SystemClock;
import android.support.v4.media.c;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import cb.e;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import f2.d;
import f7.c9;
import f7.d6;
import f7.d7;
import f7.d9;
import f7.e7;
import f7.g7;
import f7.h6;
import f7.i7;
import f7.j6;
import f7.k6;
import f7.l6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import x5.i;
import x5.l;
import x5.o;
import ya.g;
import ya.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final c9 a;
    public final d9 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final j6 f;

    public LanguageIdentifierImpl(e eVar, c9 c9Var, Executor executor) {
        this.a = c9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? j6.c : j6.b;
        this.b = new d9(g.c().b(), 0);
    }

    public static final h6 k() {
        c cVar = new c(12);
        cVar.b = Float.valueOf(-1.0f);
        return new h6(cVar);
    }

    @Override // com.google.android.gms.common.api.n
    public final u5.c[] c() {
        return this.f == j6.c ? j.a : new u5.c[]{j.b};
    }

    @Override // ab.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        t tVar = new t(7, false);
        tVar.d = this.f;
        a5.m mVar = new a5.m(16, false);
        mVar.c = k();
        tVar.e = new i7(mVar);
        a aVar = new a(tVar, 1);
        c9 c9Var = this.a;
        Task task = c9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : i.c.a(c9Var.g);
        ya.m.a.execute(new f(c9Var, aVar, l6.d, a2, false, 4));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: cb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e10 = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    fa.c cVar = new fa.c(16);
                    d7 d7Var = new d7();
                    d7Var.a = e10;
                    cVar.b = new e7(d7Var);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new g7(cVar), k6.b);
                    return e10;
                } catch (RuntimeException e11) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, k6.c);
                    throw e11;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, g7 g7Var, k6 k6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        c9 c9Var = this.a;
        l6 l6Var = l6.b;
        c9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = c9Var.i;
        boolean z11 = false;
        if (hashMap.get(l6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(l6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(l6Var, Long.valueOf(elapsedRealtime2));
            a5.m mVar = new a5.m(16, z11);
            mVar.c = k();
            a5.m mVar2 = new a5.m(15, z11);
            mVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            mVar2.d = Boolean.valueOf(z10);
            mVar2.c = k6Var;
            mVar.b = new d6(mVar2);
            if (g7Var != null) {
                mVar.d = g7Var;
            }
            t tVar = new t(7, z11);
            tVar.d = this.f;
            tVar.e = new i7(mVar);
            a aVar = new a(tVar, 0);
            Task task = c9Var.e;
            ya.m.a.execute(new f(c9Var, aVar, l6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(c9Var.g), false, 4));
        }
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.b;
        int i9 = this.f == j6.c ? 24603 : 24602;
        int i10 = k6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.b.get() != -1 && elapsedRealtime3 - d9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.a.f(new o(0, Arrays.asList(new x5.j(i9, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new d(d9Var, elapsedRealtime3, 1));
        }
    }
}
