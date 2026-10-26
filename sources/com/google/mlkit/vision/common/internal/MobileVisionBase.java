package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d5.a;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import sb.e;
import u4.f;
import yb.d;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, s {
    public static final a e = new a("MobileVisionBase", "");
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
        eVar.a(executor, d.a, cancellationTokenSource.getToken()).addOnFailureListener(yb.a.b);
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

    public final synchronized Task g(xb.a aVar) {
        if (this.a.get()) {
            return Tasks.forException(new ob.a("This detector is already closed!", 14));
        }
        if (aVar.b < 32 || aVar.c < 32) {
            return Tasks.forException(new ob.a("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new f(this, aVar), this.c.getToken());
    }
}
