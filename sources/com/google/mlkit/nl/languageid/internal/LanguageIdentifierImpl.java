package com.google.mlkit.nl.languageid.internal;

import a5.a;
import android.os.SystemClock;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import e6.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k2.u;
import k6.c;
import n6.i;
import n6.l;
import n6.o;
import ni.f;
import org.telegram.ui.Cells.ia;
import qb.g;
import qb.j;
import sb.b;
import ub.e;
import v7.b6;
import v7.c7;
import v7.e7;
import v7.f6;
import v7.g7;
import v7.h6;
import v7.i6;
import v7.j6;
import v7.r1;
import v7.y8;
import v7.z8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        ia iaVar = new ia(17);
        iaVar.b = Float.valueOf(-1.0f);
        return new f6(iaVar);
    }

    @Override // com.google.android.gms.common.api.n
    public final c[] c() {
        return this.f == h6.c ? j.a : new c[]{j.b};
    }

    @Override // sb.b, java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public void close() {
        e eVar = (e) this.d.getAndSet(null);
        if (eVar == null) {
            return;
        }
        this.e.cancel();
        eVar.d(this.c);
        f fVar = new f();
        fVar.c = this.f;
        r1 r1Var = new r1(3, false);
        r1Var.d = k();
        fVar.d = new g7(r1Var);
        a aVar = new a(fVar, 1);
        y8 y8Var = this.a;
        Task task = y8Var.e;
        qb.m.a.execute(new p(y8Var, aVar, j6.d, task.isSuccessful() ? (String) task.getResult() : i.c.a(y8Var.g), 6));
    }

    public final Task g(final String str) {
        l.i(str, "Text can not be null");
        final e eVar = (e) this.d.get();
        l.j("LanguageIdentification has been closed", eVar != null);
        final boolean z10 = true ^ eVar.c.get();
        return eVar.a(this.c, new Callable() { // from class: ub.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LanguageIdentifierImpl languageIdentifierImpl = LanguageIdentifierImpl.this;
                e eVar2 = eVar;
                String str2 = str;
                boolean z11 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    u uVar = new u(27);
                    c5.i iVar = new c5.i();
                    iVar.a = e;
                    uVar.b = new c7(iVar);
                    languageIdentifierImpl.j(elapsedRealtime, z11, new e7(uVar), i6.b);
                    return e;
                } catch (RuntimeException e7) {
                    languageIdentifierImpl.j(elapsedRealtime, z11, null, i6.c);
                    throw e7;
                }
            }
        }, this.e.getToken());
    }

    public final void j(long j3, boolean z10, e7 e7Var, i6 i6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        y8 y8Var = this.a;
        j6 j6Var = j6.b;
        y8Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = y8Var.i;
        if (hashMap.get(j6Var) == null || elapsedRealtime2 - ((Long) hashMap.get(j6Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            hashMap.put(j6Var, Long.valueOf(elapsedRealtime2));
            r1 r1Var = new r1(3, false);
            r1Var.d = k();
            r1 r1Var2 = new r1(2, false);
            r1Var2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            r1Var2.c = Boolean.valueOf(z10);
            r1Var2.d = i6Var;
            r1Var.b = new b6(r1Var2);
            if (e7Var != null) {
                r1Var.c = e7Var;
            }
            f fVar = new f();
            fVar.c = this.f;
            fVar.d = new g7(r1Var);
            a aVar = new a(fVar, 0);
            Task task = y8Var.e;
            qb.m.a.execute(new p(y8Var, aVar, j6Var, task.isSuccessful() ? (String) task.getResult() : i.c.a(y8Var.g), 6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.b;
        int i10 = this.f == h6.c ? 24603 : 24602;
        int i11 = i6Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.b.get() != -1 && elapsedRealtime3 - z8Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.a.f(new o(0, Arrays.asList(new n6.j(i10, i11, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new n(z8Var, elapsedRealtime3, 7));
        }
    }
}
