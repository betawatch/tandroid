package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import b9.c;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.a;
import eb.d;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ya.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, s {
    public static final c e = new c("MobileVisionBase", "");
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

    public final synchronized Task g(db.a aVar) {
        if (this.a.get()) {
            return Tasks.forException(new ua.a("This detector is already closed!", 14));
        }
        if (aVar.b < 32 || aVar.c < 32) {
            return Tasks.forException(new ua.a("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new e9.m(this, aVar), this.c.getToken());
    }
}
