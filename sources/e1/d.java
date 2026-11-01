package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import v0.h;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
