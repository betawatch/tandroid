package f1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        this.i = new e(this, new Handler(Looper.getMainLooper()), 3);
    }
}
