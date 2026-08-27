package com.google.mlkit.nl.languageid.internal;

import a5.n;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import b6.a;
import bb.b;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import db.e;
import g7.b9;
import g7.c9;
import g7.d6;
import g7.d7;
import g7.f7;
import g7.h6;
import g7.h7;
import g7.j6;
import g7.k6;
import g7.l6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import v5.c;
import y5.i;
import y5.l;
import y5.o;
import za.g;
import za.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final b9 a;
    public final c9 b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final j6 f;

    public LanguageIdentifierImpl(e eVar, b9 b9Var, Executor executor) {
        this.a = b9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? j6.c : j6.b;
        this.b = new c9(g.c().b(), 0);
    }

    public static final h6 k() {
        ae.b bVar = new ae.b(16);
        bVar.b = Float.valueOf(-1.0f);
        return new h6(bVar);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == j6.c ? j.a : new c[]{j.b};
    }

    @Override // bb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        t tVar = new t(8, false);
        tVar.d = this.f;
        n nVar = new n(17, false);
        nVar.c = k();
        tVar.e = new h7(nVar);
        a aVar = new a(tVar, 1);
        b9 b9Var = this.a;
        Task task = b9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : i.c.a(b9Var.g);
        za.m.a.execute(new bf.e(b9Var, aVar, l6.d, a2, false, 4));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: db.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e9 = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    k5.i iVar = new k5.i(15);
                    com.google.android.gms.internal.clearcut.e eVar3 = new com.google.android.gms.internal.clearcut.e();
                    eVar3.a = e9;
                    iVar.b = new d7(eVar3);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new f7(iVar), k6.b);
                    return e9;
                } catch (RuntimeException e10) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, k6.c);
                    throw e10;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j10, boolean z10, f7 f7Var, k6 k6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        b9 b9Var = this.a;
        l6 l6Var = l6.b;
        b9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = b9Var.i;
        boolean z11 = false;
        if (hashMap.get(l6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(l6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(l6Var, Long.valueOf(elapsedRealtime2));
            n nVar = new n(17, z11);
            nVar.c = k();
            n nVar2 = new n(16, z11);
            nVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            nVar2.d = Boolean.valueOf(z10);
            nVar2.c = k6Var;
            nVar.b = new d6(nVar2);
            if (f7Var != null) {
                nVar.d = f7Var;
            }
            t tVar = new t(8, z11);
            tVar.d = this.f;
            tVar.e = new h7(nVar);
            a aVar = new a(tVar, 0);
            Task task = b9Var.e;
            za.m.a.execute(new bf.e(b9Var, aVar, l6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(b9Var.g), false, 4));
        }
        long currentTimeMillis = System.currentTimeMillis();
        c9 c9Var = this.b;
        int i10 = this.f == j6.c ? 24603 : 24602;
        int i11 = k6Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (c9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (c9Var.b.get() != -1 && elapsedRealtime3 - c9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            c9Var.a.f(new o(0, Arrays.asList(new y5.j(i10, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(c9Var, elapsedRealtime3, 1));
        }
    }
}
