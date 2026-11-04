package com.google.mlkit.nl.languageid.internal;

import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import b8.cg;
import b8.ig;
import b8.jg;
import b8.kg;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m6.c;
import mb.g;
import mb.j;
import ob.b;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.i9;
import p6.k;
import p7.d;
import qb.e;
import x7.b6;
import x7.b9;
import x7.e7;
import x7.f6;
import x7.g6;
import x7.g7;
import x7.i6;
import x7.i7;
import x7.j6;
import x7.k6;
import za.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final b9 a;
    public final jg b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final i6 f;

    public LanguageIdentifierImpl(e eVar, b9 b9Var, Executor executor) {
        this.a = b9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? i6.c : i6.b;
        this.b = new jg(g.c().b(), 1);
    }

    public static final g6 k() {
        f6 f6Var = new f6();
        f6Var.a = Float.valueOf(-1.0f);
        return new g6(f6Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == i6.c ? j.a : new c[]{j.b};
    }

    @Override // ob.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        p pVar = new p();
        pVar.c = this.f;
        d dVar = new d(24, false);
        dVar.d = k();
        pVar.d = new i7(dVar);
        kg kgVar = new kg(pVar, 1);
        b9 b9Var = this.a;
        Task task = b9Var.e;
        mb.m.a.execute(new cg(b9Var, kgVar, k6.d, task.isSuccessful() ? (String) task.getResult() : p6.j.c.a(b9Var.g), 6));
    }

    public final Task g(final String str) {
        p6.m.h(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        p6.m.i("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: qb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e10 = eVar2.e(str2.substring(0, Math.min(str2.length(), hs.e3)));
                    i9 i9Var = new i9(28, false);
                    com.google.android.gms.internal.clearcut.e eVar3 = new com.google.android.gms.internal.clearcut.e();
                    eVar3.a = e10;
                    i9Var.b = new e7(eVar3);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new g7(i9Var), j6.b);
                    return e10;
                } catch (RuntimeException e11) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, j6.c);
                    throw e11;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, g7 g7Var, j6 j6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        b9 b9Var = this.a;
        k6 k6Var = k6.b;
        b9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = b9Var.i;
        if (hashMap.get(k6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(k6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(k6Var, Long.valueOf(elapsedRealtime2));
            d dVar = new d(24, false);
            dVar.d = k();
            d dVar2 = new d(23, false);
            dVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            dVar2.c = Boolean.valueOf(z10);
            dVar2.d = j6Var;
            dVar.b = new b6(dVar2);
            if (g7Var != null) {
                dVar.c = g7Var;
            }
            p pVar = new p();
            pVar.c = this.f;
            pVar.d = new i7(dVar);
            kg kgVar = new kg(pVar, 0);
            Task task = b9Var.e;
            mb.m.a.execute(new cg(b9Var, kgVar, k6Var, task.isSuccessful() ? (String) task.getResult() : p6.j.c.a(b9Var.g), 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        jg jgVar = this.b;
        int i3 = this.f == i6.c ? 24603 : 24602;
        int i10 = j6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (jgVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (jgVar.b.get() != -1 && elapsedRealtime3 - jgVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            jgVar.a.f(new p6.p(0, Arrays.asList(new k(i3, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ig(jgVar, elapsedRealtime3, 10));
        }
    }
}
