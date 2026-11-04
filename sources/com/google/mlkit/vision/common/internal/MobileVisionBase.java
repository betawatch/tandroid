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
import mb.e;
import org.telegram.messenger.m6;
import sb.a;
import sb.d;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, s {
    public static final m6 e = new m6("MobileVisionBase", "");
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
        eVar.a(executor, sb.e.a, cancellationTokenSource.getToken()).addOnFailureListener(a.b);
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

    public final synchronized Task g(rb.a aVar) {
        if (this.a.get()) {
            return Tasks.forException(new ib.a("This detector is already closed!", 14));
        }
        if (aVar.b < 32 || aVar.c < 32) {
            return Tasks.forException(new ib.a("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new d(this, aVar), this.c.getToken());
    }
}
