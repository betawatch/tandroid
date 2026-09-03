package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends d {
    public final Context e;
    public i f;
    public Executor g;
    public CancellationSignal h;
    public final e i;

    public b(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
