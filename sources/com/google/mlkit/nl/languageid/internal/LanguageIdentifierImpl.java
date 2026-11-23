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
import pb.g;
import pb.j;
import pb.n;
import q6.k;
import q6.p;
import rb.b;
import s6.d;
import t1.a;
import tb.e;
import y7.e6;
import y7.e9;
import y7.g7;
import y7.h7;
import y7.i6;
import y7.j7;
import y7.k6;
import y7.l6;
import y7.l7;
import y7.m6;
import y7.s2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class LanguageIdentifierImpl implements b {
    public final e9 a;
    public final a b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final k6 f;

    public LanguageIdentifierImpl(e eVar, e9 e9Var, Executor executor) {
        this.a = e9Var;
        this.c = executor;
        this.d = new AtomicReference(eVar);
        this.f = eVar.g ? k6.c : k6.b;
        this.b = new a(g.c().b());
    }

    public static final i6 k() {
        t8 t8Var = new t8();
        t8Var.a = Float.valueOf(-1.0f);
        return new i6(t8Var);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == k6.c ? j.a : new c[]{j.b};
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
        s2 s2Var = new s2(2, false);
        s2Var.c = k();
        eVar2.d = new l7(s2Var);
        xa xaVar = new xa(eVar2, 1);
        e9 e9Var = this.a;
        Task task = e9Var.e;
        n.a.execute(new qa(e9Var, xaVar, m6.d, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(e9Var.g), 7));
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
                    h7 h7Var = new h7();
                    aa.b0 b0Var = new aa.b0();
                    b0Var.a = e10;
                    h7Var.a = new g7(b0Var);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new j7(h7Var), l6.b);
                    return e10;
                } catch (RuntimeException e11) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, l6.c);
                    throw e11;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j3, boolean z10, j7 j7Var, l6 l6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        e9 e9Var = this.a;
        m6 m6Var = m6.b;
        e9Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = e9Var.i;
        if (hashMap.get(m6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(m6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(m6Var, Long.valueOf(elapsedRealtime2));
            s2 s2Var = new s2(2, false);
            s2Var.c = k();
            s2 s2Var2 = new s2(1, false);
            s2Var2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            s2Var2.d = Boolean.valueOf(z10);
            s2Var2.c = l6Var;
            s2Var.b = new e6(s2Var2);
            if (j7Var != null) {
                s2Var.d = j7Var;
            }
            xi.e eVar = new xi.e();
            eVar.c = this.f;
            eVar.d = new l7(s2Var);
            xa xaVar = new xa(eVar, 0);
            Task task = e9Var.e;
            n.a.execute(new qa(e9Var, xaVar, m6Var, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(e9Var.g), 7));
        }
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = this.b;
        int i7 = this.f == k6.c ? 24603 : 24602;
        int i10 = l6Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (aVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) aVar.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) aVar.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((d) aVar.b).f(new p(0, Arrays.asList(new k(i7, i10, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new va(aVar, elapsedRealtime3, 9));
        }
    }
}
