package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import v0.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends b1.d {
    public final Context e;
    public h f;
    public Executor g;
    public CancellationSignal h;
    public final c1.c i;

    public d(Context context) {
        i.e(context, "context");
        this.e = context;
        this.i = new c1.c(this, new Handler(Looper.getMainLooper()), 2);
    }
}
