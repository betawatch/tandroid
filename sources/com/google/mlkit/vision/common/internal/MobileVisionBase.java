package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.u;
import qb.e;
import u4.g;
import wb.a;
import wb.d;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, s {
    public static final u e = new u("MobileVisionBase", "");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final e b;
    public final CancellationTokenSource c;
    public final Executor d;

    public MobileVisionBase(e eVar, Executor executor) {
        this.b = eVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.d = executor;
        eVar.b.incrementAndGet();
        eVar.a(executor, d.a, cancellationTokenSource.getToken()).addOnFailureListener(a.b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    public synchronized void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        this.c.cancel();
        this.b.d(this.d);
    }

    public final synchronized Task g(vb.a aVar) {
        if (this.a.get()) {
            return Tasks.forException(new mb.a("This detector is already closed!", 14));
        }
        if (aVar.b < 32 || aVar.c < 32) {
            return Tasks.forException(new mb.a("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new g(this, aVar), this.c.getToken());
    }
}
