package g1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a extends d {
    public final Context e;
    public g f;
    public Executor g;
    public CancellationSignal h;
    public final e i;

    public a(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new e(this, new Handler(Looper.getMainLooper()), 4);
    }
}
