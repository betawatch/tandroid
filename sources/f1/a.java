package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import v0.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends d {
    public final Context e;
    public i f;
    public Executor g;
    public CancellationSignal h;
    public final c1.d i;

    public a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.i = new c1.d(this, new Handler(Looper.getMainLooper()), 3);
    }
}
