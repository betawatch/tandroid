package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import b6.h;
import cb.f;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h2.g;
import ib.a;
import ib.d;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, s {
    public static final h e = new h("MobileVisionBase", "");
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

    public final synchronized Task g(hb.a aVar) {
        if (this.a.get()) {
            return Tasks.forException(new ya.a("This detector is already closed!", 14));
        }
        if (aVar.b < 32 || aVar.c < 32) {
            return Tasks.forException(new ya.a("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new g(this, aVar), this.c.getToken());
    }
}
