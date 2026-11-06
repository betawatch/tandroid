package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d extends b1.d {
    public final Context e;
    public g f;
    public Executor g;
    public CancellationSignal h;
    public final c1.d i;

    public d(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new c1.d(this, new Handler(Looper.getMainLooper()), 2);
    }
}
