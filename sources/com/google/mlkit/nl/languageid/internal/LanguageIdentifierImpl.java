package com.google.mlkit.nl.languageid.internal;

import a8.qa;
import a8.t8;
import a8.va;
import a8.xa;
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
import n6.c;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.hn;
import org.telegram.ui.md0;
import pb.g;
import pb.j;
import pb.n;
import q6.k;
import q6.p;
import rb.b;
import s6.d;
import tb.e;
import tg.x;
import y7.d6;
import y7.d9;
import y7.f7;
import y7.g7;
import y7.h6;
import y7.i7;
import y7.j6;
import y7.k6;
import y7.k7;
import y7.l6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final d9 a;
    public final x b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final j6 f;

    public LanguageIdentifierImpl(e eVar, d9 d9Var, Executor executor) {
        this.a = d9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? j6.c : j6.b;
        this.b = new x(g.c().b());
    }

    public static final h6 k() {
        t8 t8Var = new t8();
        t8Var.a = Float.valueOf(-1.0f);
        return new h6(t8Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == j6.c ? j.a : new c[]{j.b};
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
        xi.e eVar2 = new xi.e();
        eVar2.c = this.f;
        f7 f7Var = new f7();
        f7Var.b = k();
        eVar2.d = new k7(f7Var);
        xa xaVar = new xa(eVar2, 1);
        d9 d9Var = this.a;
        Task task = d9Var.e;
        n.a.execute(new qa(d9Var, xaVar, l6.d, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(d9Var.g), 7));
    }

    public final Task h(final String str) {
        q6.m.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        q6.m.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: tb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e10 = eVar2.e(str2.substring(0, Math.min(str2.length(), ks.e3)));
                    hn hnVar = new hn(28);
                    aa.b0 b0Var = new aa.b0();
                    b0Var.a = e10;
                    hnVar.b = new g7(b0Var);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new i7(hnVar), k6.b);
                    return e10;
                } catch (RuntimeException e11) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, k6.c);
                    throw e11;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j3, boolean z10, i7 i7Var, k6 k6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        d9 d9Var = this.a;
        l6 l6Var = l6.b;
        d9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = d9Var.i;
        if (hashMap.get(l6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(l6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(l6Var, Long.valueOf(elapsedRealtime2));
            f7 f7Var = new f7();
            f7Var.b = k();
            md0 md0Var = new md0(29, false);
            md0Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            md0Var.d = Boolean.valueOf(z10);
            md0Var.c = k6Var;
            f7Var.a = new d6(md0Var);
            if (i7Var != null) {
                f7Var.c = i7Var;
            }
            xi.e eVar = new xi.e();
            eVar.c = this.f;
            eVar.d = new k7(f7Var);
            xa xaVar = new xa(eVar, 0);
            Task task = d9Var.e;
            n.a.execute(new qa(d9Var, xaVar, l6Var, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(d9Var.g), 7));
        }
        long currentTimeMillis = System.currentTimeMillis();
        x xVar = this.b;
        int i7 = this.f == j6.c ? 24603 : 24602;
        int i10 = k6Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (xVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) xVar.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) xVar.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((d) xVar.b).f(new p(0, Arrays.asList(new k(i7, i10, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new va(xVar, elapsedRealtime3, 9));
        }
    }
}
