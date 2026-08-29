package com.google.mlkit.vision.common.internal;

import ab.f;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d9.c;
import g9.n;
import gb.a;
import gb.d;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, s {
    public static final c e = new c("MobileVisionBase", "");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final f b;
    public final CancellationTokenSource c;
    public final Executor d;

    public MobileVisionBase(f fVar, Executor executor) {
        this.b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.d = executor;
        fVar.b.incrementAndGet();
        fVar.a(executor, d.a, cancellationTokenSource.getToken()).addOnFailureListener(a.b);
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

    public final synchronized Task g(fb.a aVar) {
        if (this.a.get()) {
            return Tasks.forException(new wa.a("This detector is already closed!", 14));
        }
        if (aVar.b < 32 || aVar.c < 32) {
            return Tasks.forException(new wa.a("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new n(this, aVar), this.c.getToken());
    }
}
