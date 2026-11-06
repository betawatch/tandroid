package g1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends d {
    public final Context e;
    public g f;
    public Executor g;
    public CancellationSignal h;
    public final c1.d i;

    public a(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new c1.d(this, new Handler(Looper.getMainLooper()), 4);
    }
}
